/*
 * AnyChart runtime page: the host protocol.
 *
 * The host (an Android view, a test harness, later a Swift view) talks to this
 * page with JSON messages. Nothing here evaluates strings from the host.
 *
 *   host -> page   load { id, config, rect?, events? }
 *                  update { id, data, series? }
 *                  resize { id, rect }
 *                  dispose { id }
 *                  query { id, requestId, what: "selectedPoints" | "json" }
 *
 *   page -> host   ready { jsVersion, runtimeVersion }
 *                  rendered { id, ms }
 *                  event { id, event, data }
 *                  error { id, message }
 *                  answer { id, requestId, result }
 *
 * Transport: the host exposes window.AnyChartHost with a postMessage(string)
 * function (on Android: WebViewCompat.addWebMessageListener). Messages from the
 * host arrive through window.AnyChartRuntime.receive(message), or, where the
 * host object supports it, through AnyChartHost.onmessage.
 *
 * ponytail: ES2015 only, no build step. This file ships inside the AAR as is.
 */
(function () {
  'use strict';

  var RUNTIME_VERSION = '0.1.1';
  var charts = {}; // id -> { chart, el }
  var DATA_BY_API = { 'data-sheet': true };

  function send(message) {
    var host = window.AnyChartHost;
    if (host && typeof host.postMessage === 'function') {
      host.postMessage(JSON.stringify(message));
    }
  }

  function fail(id, err) {
    var message = (err && err.message) ? err.message : String(err);
    send({ type: 'error', id: id === undefined ? null : id, message: message });
  }

  function applyRect(el, rect) {
    if (!rect) return;
    el.style.left = rect.x + 'px';
    el.style.top = rect.y + 'px';
    el.style.width = rect.width + 'px';
    el.style.height = rect.height + 'px';
  }

  function containerFor(id, rect) {
    var el = document.createElement('div');
    el.id = 'ac-' + id;
    el.className = 'ac-chart';
    applyRect(el, rect);
    document.body.appendChild(el);
    return el;
  }

  // Pull the stable, serialisable part out of an AnyChart event object.
  function describe(e) {
    var out = {};
    try {
      if (e.point) {
        out.pointIndex = e.point.getIndex();
        out.x = e.point.get('x');
        out.value = e.point.get('value');
        if (e.point.getSeries) {
          var s = e.point.getSeries();
          if (s && s.name) out.series = s.name();
        }
      } else if (e.pointIndex !== undefined) {
        out.pointIndex = e.pointIndex;
      }
      if (e.item && e.item.text !== undefined) out.item = e.item.text;
      if (e.itemIndex !== undefined) out.itemIndex = e.itemIndex;
    } catch (err) {
      out.describeError = String(err && err.message || err);
    }
    return out;
  }

  function load(m) {
    if (!m.id) return fail(null, 'load: id is required');
    if (!m.config) return fail(m.id, 'load: config is required');
    if (charts[m.id]) dispose({ id: m.id });
    var el = containerFor(m.id, m.rect);
    var t0 = performance.now();
    try {
      var chart = anychart.fromJson(m.config);
      if (!chart) return fail(m.id, 'fromJson produced no chart');
      // The data sheet ignores `data` in its JSON config and its toJson() omits the rows
      // (engine gap, AnyChart 9.0.0), so the rows are handed over through the API instead.
      var root = m.config.chart || m.config.gauge || m.config.map || m.config.gantt || {};
      if (DATA_BY_API[root.type] && root.data !== undefined && typeof chart.data === 'function') {
        chart.data(root.data);
      }
      (m.events || []).forEach(function (type) {
        chart.listen(type, function (e) {
          send({ type: 'event', id: m.id, event: type, data: describe(e) });
        });
      });
      var renderedSent = false;
      function rendered() {
        if (renderedSent) return;
        renderedSent = true;
        send({ type: 'rendered', id: m.id, ms: Math.round(performance.now() - t0) });
      }
      chart.listenOnce('chartDraw', rendered);
      chart.container(el.id);
      chart.draw();
      // Charts that do not descend from anychart.core.Chart (the data sheet) never fire
      // chartDraw. Two frames after draw() the DOM is painted; report then if nothing did.
      requestAnimationFrame(function () { requestAnimationFrame(rendered); });
      charts[m.id] = { chart: chart, el: el };
    } catch (err) {
      if (el.parentNode) el.parentNode.removeChild(el);
      fail(m.id, err);
    }
  }

  function entry(m) {
    var c = charts[m.id];
    if (!c) { fail(m.id, 'no chart with id ' + m.id); return null; }
    return c;
  }

  function update(m) {
    var c = entry(m); if (!c) return;
    try {
      if (m.series !== undefined && c.chart.getSeries) {
        var s = c.chart.getSeries(m.series);
        if (!s) return fail(m.id, 'no series ' + m.series);
        s.data(m.data);
      } else {
        c.chart.data(m.data);
      }
    } catch (err) { fail(m.id, err); }
  }

  function resize(m) {
    var c = entry(m); if (!c) return;
    try {
      applyRect(c.el, m.rect);
      c.chart.container().getStage().resize(c.el.clientWidth, c.el.clientHeight);
    } catch (err) { fail(m.id, err); }
  }

  function dispose(m) {
    var c = charts[m.id];
    if (!c) return;
    try { c.chart.dispose(); } catch (err) { /* already gone */ }
    if (c.el.parentNode) c.el.parentNode.removeChild(c.el);
    delete charts[m.id];
  }

  function query(m) {
    var c = entry(m); if (!c) return;
    var result;
    try {
      if (m.what === 'selectedPoints') {
        var pts = c.chart.getSelectedPoints ? c.chart.getSelectedPoints() : [];
        result = pts.map(function (p) {
          var r = { pointIndex: p.getIndex(), x: p.get('x'), value: p.get('value') };
          if (p.getSeries) { var s = p.getSeries(); if (s && s.name) r.series = s.name(); }
          return r;
        });
      } else if (m.what === 'json') {
        result = c.chart.toJson();
      } else {
        return fail(m.id, 'unknown query ' + m.what);
      }
      send({ type: 'answer', id: m.id, requestId: m.requestId, result: result });
    } catch (err) { fail(m.id, err); }
  }

  var handlers = { load: load, update: update, resize: resize, dispose: dispose, query: query };

  function receive(raw) {
    var m;
    try {
      m = (typeof raw === 'string') ? JSON.parse(raw) : raw;
    } catch (err) {
      return fail(null, 'malformed message: ' + err.message);
    }
    if (!m || typeof m !== 'object') return fail(null, 'message is not an object');
    var h = handlers[m.type];
    if (!h) return fail(m.id === undefined ? null : m.id, 'unknown message type ' + m.type);
    h(m);
  }

  window.AnyChartRuntime = { receive: receive, version: RUNTIME_VERSION };

  window.addEventListener('error', function (e) {
    fail(null, e.message || 'script error');
  });

  function attachHost() {
    var host = window.AnyChartHost;
    if (host && typeof host.addEventListener === 'function') {
      host.addEventListener('message', function (ev) { receive(ev.data); });
    } else if (host && host.onmessage === undefined) {
      host.onmessage = function (ev) { receive(ev.data); };
    }
  }

  anychart.onDocumentReady(function () {
    attachHost();
    if (window.ANYCHART_LICENSE_KEY) {
      try { anychart.licenseKey(window.ANYCHART_LICENSE_KEY); } catch (err) { fail(null, err); }
    }
    // Where the boot time went, for the host's benchmarks: ms since navigation start, plus
    // the fetch duration of each resource the page loaded.
    var timing = {};
    try {
      var nav = performance.getEntriesByType('navigation')[0];
      if (nav) {
        timing.responseEnd = Math.round(nav.responseEnd);
        timing.domContentLoaded = Math.round(nav.domContentLoadedEventEnd);
        timing.readySent = Math.round(performance.now());
      }
      performance.getEntriesByType('resource').forEach(function (r) {
        timing[r.name.split('/').pop()] = Math.round(r.duration);
      });
    } catch (err) { /* timing is optional */ }
    send({
      type: 'ready',
      jsVersion: (typeof anychart.VERSION === 'string') ? anychart.VERSION : 'unknown',
      runtimeVersion: RUNTIME_VERSION,
      timing: timing
    });
  });
})();

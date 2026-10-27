/*
 * AnyChart runtime page: the host protocol.
 *
 * The host (an Android view, a test harness, later a Swift view) talks to this
 * page with JSON messages. Nothing here evaluates strings from the host.
 *
 *   host -> page   load { id, config, rect?, events? }
 *                    config may carry function placeholders, see "Callbacks" below
 *                  update { id, data, series? }
 *                  resize { id, rect }
 *                  dispose { id }
 *                  query { id, requestId, what: "selectedPoints" | "json" | "callbackStats" | "tooltipText" }
 *
 *   page -> host   ready { jsVersion, runtimeVersion }
 *                  rendered { id, ms, callbacks: { calls, ms } }
 *                  event { id, event, data }
 *                  error { id, message }
 *                  answer { id, requestId, result }
 *
 * Transport: the host exposes window.AnyChartHost with a postMessage(string)
 * function (on Android: WebViewCompat.addWebMessageListener). Messages from the
 * host arrive through window.AnyChartRuntime.receive(message), or, where the
 * host object supports it, through AnyChartHost.onmessage.
 *
 * Callbacks: a config value of the form {"$fn": "<name>"} becomes a function
 * that calls the host synchronously through window.AnyChartCallbacks.invoke(json)
 * (on Android: a @JavascriptInterface object) with { id, fn, context }, where
 * context is the function's `this` with the engine's internals dropped. The host
 * replies with the JSON text {"v": <return value>} or {"error": "<message>"}. A
 * value of the form {"$js": "<function body>"} becomes a JavaScript function with
 * that body: the one place this page evaluates text from the host, and only
 * because the host asked for it by that key.
 *
 * ponytail: ES2015 only, no build step. This file ships inside the AAR as is.
 */
(function () {
  'use strict';

  var RUNTIME_VERSION = '0.2.0';
  var charts = {}; // id -> { chart, el }
  var callbackStats = {}; // id -> { calls, ms }
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

  // ---- Callbacks -----------------------------------------------------------------------------

  // The engine's format contexts carry their public fields as own properties next to minified
  // internals (two-letter keys such as "bb", "A1"). ponytail: a key shape heuristic, not a schema;
  // id/x/y/to are real two-letter fields. Functions and unserialisable values are dropped.
  var MINIFIED_KEY = /^[A-Za-z]{1,2}\d*$/;
  var KEEP_SHORT = { id: true, x: true, y: true, to: true };
  function dropFunctions(k, v) { return typeof v === 'function' ? undefined : v; }
  function context(self) {
    var out = {};
    if (!self || typeof self !== 'object') return out;
    Object.keys(self).forEach(function (k) {
      var v = self[k];
      if (typeof v === 'function' || (MINIFIED_KEY.test(k) && !KEEP_SHORT[k])) return;
      try { out[k] = v === undefined ? null : JSON.parse(JSON.stringify(v, dropFunctions)); } catch (err) { /* cyclic or host object: skipped */ }
    });
    return out;
  }

  function statsFor(id) {
    return callbackStats[id] || (callbackStats[id] = { calls: 0, ms: 0 });
  }

  function hostCallback(chartId, name) {
    var warned = false;
    return function () {
      var channel = window.AnyChartCallbacks;
      if (!channel || typeof channel.invoke !== 'function') {
        if (!warned) { warned = true; fail(chartId, 'callback ' + name + ': the host has no AnyChartCallbacks channel'); }
        return undefined;
      }
      var st = statsFor(chartId);
      var t0 = performance.now();
      var raw = channel.invoke(JSON.stringify({ id: chartId, fn: name, context: context(this) }));
      st.calls++;
      st.ms += performance.now() - t0;
      if (raw === undefined || raw === null || raw === '') return undefined;
      var reply;
      try { reply = JSON.parse(raw); } catch (err) { fail(chartId, 'callback ' + name + ': unreadable reply ' + raw); return undefined; }
      if (reply && reply.error !== undefined) { fail(chartId, 'callback ' + name + ': ' + reply.error); return undefined; }
      return reply ? reply.v : undefined;
    };
  }

  // Replaces {"$fn": name} and {"$js": body} placeholders with functions, in place.
  function resolveCallbacks(node, chartId) {
    if (Array.isArray(node)) {
      for (var i = 0; i < node.length; i++) node[i] = resolveCallbacks(node[i], chartId);
      return node;
    }
    if (node && typeof node === 'object') {
      var keys = Object.keys(node);
      if (keys.length === 1 && keys[0] === '$fn' && typeof node.$fn === 'string') return hostCallback(chartId, node.$fn);
      if (keys.length === 1 && keys[0] === '$js' && typeof node.$js === 'string') return new Function(node.$js); // eslint-disable-line no-new-func
      keys.forEach(function (k) { node[k] = resolveCallbacks(node[k], chartId); });
    }
    return node;
  }

  function roundStats(st) {
    return { calls: st.calls, ms: Math.round(st.ms * 100) / 100 };
  }

  // ---- Messages ------------------------------------------------------------------------------

  function load(m) {
    if (!m.id) return fail(null, 'load: id is required');
    if (!m.config) return fail(m.id, 'load: config is required');
    if (charts[m.id]) dispose({ id: m.id });
    var el = containerFor(m.id, m.rect);
    var t0 = performance.now();
    try {
      resolveCallbacks(m.config, m.id);
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
        send({ type: 'rendered', id: m.id, ms: Math.round(performance.now() - t0), callbacks: roundStats(statsFor(m.id)) });
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
    delete callbackStats[m.id];
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
      } else if (m.what === 'callbackStats') {
        result = roundStats(statsFor(m.id));
      } else if (m.what === 'tooltipText') {
        // The text of the tooltip currently shown, or null. Tooltips are page-level DOM, not per chart.
        var tips = Array.prototype.filter.call(document.querySelectorAll('.anychart-tooltip'), function (t) { return t.offsetParent !== null && t.textContent; });
        result = tips.length ? tips[tips.length - 1].textContent : null;
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

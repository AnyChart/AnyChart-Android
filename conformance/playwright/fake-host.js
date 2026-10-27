// Stand-in for the Android host, injected before the runtime page loads.
// Collects every message the page posts, so a test can wait for and inspect them.
window.__acMessages = [];
window.AnyChartHost = {
  postMessage: function (s) { window.__acMessages.push(JSON.parse(s)); }
};
// The synchronous callback channel (on Android a @JavascriptInterface object). A test registers
// implementations by name in __acCallbackImpl; every invocation is recorded in __acCallbacks.
window.__acCallbacks = [];
window.__acCallbackImpl = {};
window.AnyChartCallbacks = {
  invoke: function (s) {
    var m = JSON.parse(s);
    window.__acCallbacks.push(m);
    var impl = window.__acCallbackImpl[m.fn];
    if (!impl) return JSON.stringify({ error: 'no callback ' + m.fn });
    try { return JSON.stringify({ v: impl(m.context) }); } catch (e) { return JSON.stringify({ error: String(e && e.message || e) }); }
  }
};

// Stand-in for the Android host, injected before the runtime page loads.
// Collects every message the page posts, so a test can wait for and inspect them.
window.__acMessages = [];
window.AnyChartHost = {
  postMessage: function (s) { window.__acMessages.push(JSON.parse(s)); }
};

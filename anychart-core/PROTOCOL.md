# Host protocol, runtime 0.3.0

The runtime page (`src/main/assets/runtime/`) is plain HTML and JavaScript: the AnyChart JS
bundle, its CSS and `host.js`. A host embeds it in a WebView and exchanges JSON messages with it.
The host never evaluates JavaScript strings; the page never parses HTML from the host.

## Transport

- The host exposes `window.AnyChartHost` with `postMessage(string)`. On Android this is the
  object injected by `WebViewCompat.addWebMessageListener`; in the Playwright gate it is
  `conformance/playwright/fake-host.js`.
- The page exposes `window.AnyChartRuntime.receive(string | object)`. A host that can only
  deliver messages to a JS object (the Android message listener gives the page
  `AnyChartHost.onmessage`) is attached automatically on document ready.
- For callbacks the host exposes `window.AnyChartCallbacks.invoke(string): string`, a
  synchronous call (on Android a `@JavascriptInterface` object; in the gate the fake host). It is
  optional: a config without `$fn` placeholders never touches it.

## Messages

| Direction | type | Fields | Effect |
|---|---|---|---|
| page → host | `ready` | `jsVersion`, `runtimeVersion` | Bundle loaded. Host may send `load`. |
| host → page | `load` | `id`, `config`, `rect?`, `events?` | `anychart.fromJson(config)` drawn into a container for `id`. `rect` `{x,y,width,height}` in CSS px, default full page. `events` is a list of AnyChart event names to forward. `config` may carry callback placeholders, see below. |
| host → page | `update` | `id`, `data`, `series?` | Replaces data in place. With `series` (index or name) only that series. |
| host → page | `resize` | `id`, `rect` | Moves and resizes the container, re-lays out the chart. |
| host → page | `dispose` | `id` | Disposes the chart, removes its container. |
| host → page | `query` | `id`, `requestId`, `what` | `what` is `selectedPoints`, `json`, `callbackStats` (`{calls, ms}` so far for this chart) or `tooltipText` (text of the tooltip currently shown, or null). Answered with `answer`. |
| page → host | `rendered` | `id`, `ms`, `callbacks` | First draw of chart `id`, milliseconds since `load` was received; `callbacks` `{calls, ms}` is the number of host callbacks the first draw took and the time spent waiting for them. |
| page → host | `event` | `id`, `event`, `data` | A forwarded chart event. `data` carries `pointIndex`, `x`, `value`, `series`, `item`, `itemIndex` where the event has them. |
| page → host | `answer` | `id`, `requestId`, `result` | Reply to a `query`. |
| page → host | `error` | `id` (nullable), `code`, `message` | A rejected config, a bad message, a script error. Nothing fails silently. `code` is one of `bad-config` (load rejected), `bad-data` (update rejected), `unknown-chart` (no chart with that `id`), `callback` (a `$fn` callback failed or has no channel), `bad-message` (malformed or unknown message, unknown query, resize failure), `script` (an uncaught page error, or the licence key rejected). |

## Config

`config` is the document `anychart.fromJson` accepts: a root key `chart`, `gauge`, `gantt` or
`map`, with the engine's registered `type` string inside. Note that the engine uses kebab-case
names for some types (`heat-map`, `tree-map`, `circular-gauge`) where the published JSON schema
for 9.0.0 lists camel-case ones; the engine wins.

Two engine gaps in 9.0.0 the page works around, both reported on A9-970:

- The data sheet (`type: "data-sheet"`) ignores `data` in its JSON config and its `toJson()` omits
  the rows, so `fromJson(toJson())` loses the data. The page hands `config.chart.data` to the chart
  through `chart.data()` for this type.
- The data sheet does not descend from `anychart.core.Chart` and never fires `chartDraw`. The page
  reports `rendered` two animation frames after `draw()` when no `chartDraw` came.

The data sheet renders as HTML, not SVG, and needs `data-sheet.min.css`, which the page links.

## Callbacks

Function-valued settings (`format`, `fill`, `stroke` functions and the like) have no JSON form.
A config can carry them three ways:

| Carrier | In the config | Resolved by |
|---|---|---|
| engine token | `"format": "{%name}: {%value}"` | the engine itself; no host involvement |
| host callback | `"format": {"$fn": "label"}` | the page builds a function that calls `AnyChartCallbacks.invoke(json)` |
| verbatim JavaScript | `"fill": {"$js": "return this.sourceColor + ' 0.3'"}` | `new Function(body)` in the page, `this` as the engine gives it |

A placeholder is an object with exactly that one key; the page replaces them in place before
`fromJson`, at any depth. `$js` is the one place the page evaluates text from the host, and only
under that key.

For `$fn` the page sends `{"id": <chart id>, "fn": <name>, "context": {...}}` and expects back
the JSON text `{"v": <return value>}` or `{"error": "<message>"}` (reported as an `error` message,
the function then returns undefined, once per chart for a missing channel). `context` is the
function's `this`: the engine's public context fields (`name`, `value`, `x`, `index`,
`sourceColor`, a sankey node's `income`, `outcome`, `dropoff`, `isConflict`, `type`) with functions
and the engine's minified internals dropped. The function's arguments are not sent: for format
functions they are the same object as `this`.

The call is synchronous: the page's JavaScript thread waits for the host's answer. On Android the
`@JavascriptInterface` method runs on the WebView's bridge thread, so a host lambda must be quick
and pure, must not touch views, and must not wait on the main thread. Measured in the gate
(Chromium, fake host, 2026-10-27): 32 label calls at first draw in 2.6 ms, about 80 µs per call.

## Licence

If `window.ANYCHART_LICENSE_KEY` is set before `host.js` runs (the Android host injects it as a
document-start script), the page calls `anychart.licenseKey()` with it. Without it the bundle
shows its own trial credits.

## Conformance

`conformance/configs/*.json` are the configs every host must render. `conformance/playwright`
runs them against this page in Chromium with the fake host and compares screenshots; the
`callbacks` scenarios there cover the three carriers over `sankey.json`. `conformance/twins/*.json`
are the same charts written in the Kotlin DSL (anychart-dsl's TwinsTest writes them with
`WRITE_TWINS=1` and fails when they are stale); the gate renders each twin against its config's
reference picture, which is the oracle where the config is an engine state dump:

    cd conformance/playwright && npm install && npm test

# Host protocol 1.0

The contract between a host (Android today, others later) and the AnyChart runtime page in
`src/main/assets/runtime/`: plain HTML and JavaScript, the AnyChart JS bundle, its CSS and
`host.js`. The host embeds the page in a web view and exchanges JSON messages with it. The host
never evaluates JavaScript strings; the page evaluates text from the host only under the `$js`
callback carrier below. This file is the contract; `host.js` and the host's `Messages.kt` implement
it field for field.

## Versions

- The page announces `runtimeVersion` in `ready`, semantic: its major is the protocol major. This
  document is protocol **1.0**; `host.js` reports **1.0.0**. A host implementing major 1 accepts
  any 1.x page (minors add fields, never remove or rename them) and reports another major as an
  error (`UnsupportedRuntime` on Android).
- `jsVersion` in `ready` is the bundled AnyChart JS version. It is independent of the protocol; a
  host that generated its configs for one engine version compares the two (`EngineMismatch` on
  Android, major.minor.patch).

## Transport

- The host exposes `window.AnyChartHost` with `postMessage(string)`. On Android this is the object
  injected by `WebViewCompat.addWebMessageListener`; in the gate it is `conformance/playwright/fake-host.js`.
- The page exposes `window.AnyChartRuntime.receive(string | object)` and `window.AnyChartRuntime.version`.
  A host that can only deliver messages to a JS object (the Android message listener gives the page
  `AnyChartHost.onmessage`) is attached automatically on document ready.
- For callbacks the host exposes `window.AnyChartCallbacks.invoke(string): string`, synchronous
  (on Android a `@JavascriptInterface` object). Optional: a config without `$fn` placeholders never
  touches it.
- Every message is one JSON object with a `type`. Unknown fields are ignored; unknown types are
  reported with an `error`.

## Host to page

| type | fields | effect |
|---|---|---|
| `load` | `id` string, `config` object, `rect?` object, `events?` string[] | `anychart.fromJson(config)` drawn into a container for `id`; a chart already under that `id` is disposed first. `rect` is `{x, y, width, height}` in CSS px, default the whole page. `events` lists AnyChart event names to forward as `event` messages (Android default: `["pointClick"]`). `config` may carry callback placeholders (below). Answered by `rendered` or `error`. |
| `update` | `id`, `data` array, `series?` integer | Replaces the data in place: `chart.data(data)`, or with `series` that series by index (`chart.getSeries(series).data(data)`). No reload, no `rendered`. |
| `resize` | `id`, `rect` | Moves and resizes the container, re-lays out the chart's stage. |
| `dispose` | `id` | Disposes the chart, removes its container, forgets its callback statistics. Unknown ids are ignored. |
| `query` | `id`, `requestId` string, `what` string | Reads state; answered by `answer` with the same `requestId`. `what` is one of the kinds below. |

Query kinds and their `result`:

| `what` | `result` |
|---|---|
| `selectedPoints` | array of `{pointIndex, x, value, series?}` (series name) for the chart's selected points |
| `json` | the chart's `toJson()` document |
| `callbackStats` | `{calls, ms}`: host callbacks made by this chart so far and the time spent waiting for them |
| `tooltipText` | text of the tooltip currently shown, or `null` |

## Page to host

| type | fields | when |
|---|---|---|
| `ready` | `jsVersion` string, `runtimeVersion` string, `timing` object | The bundle loaded; the host may send `load`. `timing` carries ms since navigation start for `responseEnd`, `domContentLoaded`, `readySent`, and the fetch duration of each resource by file name; it is diagnostic and may be empty. |
| `rendered` | `id`, `ms` integer, `callbacks` `{calls, ms}` | First draw of chart `id`: `ms` since `load` was received, `callbacks` the host callbacks the first draw took and the time waiting for them. Once per `load`. |
| `event` | `id`, `event` string, `data` object | A forwarded chart event. `data` carries what the event has of `pointIndex`, `x`, `value`, `series` (name), `item`, `itemIndex`; `describeError` if reading them threw. |
| `answer` | `id`, `requestId`, `result` | Reply to a `query`. |
| `error` | `id` string or null, `code` string, `message` string | Nothing fails silently. `id` is null for page-level failures. `code` is one of the codes below. |

Error codes:

| `code` | meaning |
|---|---|
| `bad-config` | `load` rejected: `fromJson` threw or produced no chart, or `config` is missing |
| `bad-data` | `update` rejected: the data or the series index |
| `unknown-chart` | a message named an `id` the page does not have |
| `callback` | a `$fn` callback has no channel, no implementation, replied with an error, or replied unreadably (the missing-channel case once per chart) |
| `bad-message` | malformed JSON, not an object, unknown `type`, `load` without `id`, unknown query kind, or a `resize` failure |
| `script` | an uncaught error in the page, or the licence key rejected by the engine |

## Config

`config` is the document `anychart.fromJson` accepts: a root key `chart`, `gauge`, `gantt` or
`map`, with the engine's registered `type` string inside. The engine uses kebab-case names for
some types (`heat-map`, `tree-map`, `circular-gauge`) where the published JSON schema for 9.0.0
lists camel-case ones; the engine wins. Tree-backed charts (tree map, sunburst, org chart...) take
their data under `treeData` in the tree's own shape, `{children: [{treeDataItemData, children}]}`.

Two engine gaps in 9.0.0 the page works around, both reported on A9-970:

- The data sheet (`type: "data-sheet"`) ignores `data` in its JSON config and its `toJson()` omits
  the rows. The page hands `config.chart.data` to the chart through `chart.data()` for this type.
- The data sheet does not descend from `anychart.core.Chart` and never fires `chartDraw`. The page
  reports `rendered` two animation frames after `draw()` when no `chartDraw` came.

The data sheet renders as HTML, not SVG, and needs `data-sheet.min.css`, which the page links.

## Callbacks

Function-valued settings (`format`, `fill`, `stroke` functions and the like) have no JSON form.
A config can carry them three ways:

| carrier | in the config | resolved by |
|---|---|---|
| engine token | `"format": "{%name}: {%value}"` | the engine itself; no host involvement |
| host callback | `"format": {"$fn": "label"}` | the page builds a function that calls `AnyChartCallbacks.invoke(json)` |
| verbatim JavaScript | `"fill": {"$js": "return this.sourceColor + ' 0.3'"}` | `new Function(body)` in the page, `this` as the engine gives it |

A placeholder is an object with exactly that one key; the page replaces them in place before
`fromJson`, at any depth. `$js` is the one place the page evaluates text from the host, and only
under that key.

For `$fn` the page sends the JSON text `{"id": <chart id>, "fn": <name>, "context": {...}}` and
expects back the JSON text `{"v": <return value>}` or `{"error": "<message>"}`; an error, an
unreadable reply or a missing channel is reported as an `error` with code `callback` and the
function returns undefined. `context` is the function's `this`: the engine's public context fields
(`name`, `value`, `x`, `index`, `sourceColor`, a sankey node's `income`, `outcome`, `dropoff`,
`isConflict`, `type`, ...) with functions and the engine's minified internals dropped. The
function's arguments are not sent: for format functions they are the same object as `this`.

The call is synchronous: the page's JavaScript thread waits for the host's answer. On Android the
`@JavascriptInterface` method runs on the WebView's bridge thread, so a host lambda must be quick
and pure, must not touch views, and must not wait on the main thread. Measured in the gate
(Chromium, fake host, 2026-10-27): 32 label calls at first draw in 0.4 to 2.6 ms, 12 to 80 µs
per call.

## Licence

If `window.ANYCHART_LICENSE_KEY` is set before `host.js` runs (the Android host injects it as a
document-start script), the page calls `anychart.licenseKey()` with it; a rejected key is an
`error` with code `script`. Without it the bundle shows its own trial credits.

## Conformance

`conformance/configs/*.json` are the configs every host must render. `conformance/playwright`
runs them against this page in Chromium with the fake host and compares screenshots, and has at
least one scenario per message type both ways, the callback carriers and every error code.
`conformance/twins/*.json` are the same charts written in the Kotlin DSL (anychart-dsl's
TwinsTest writes them with `WRITE_TWINS=1` and fails when they are stale); the gate renders each
twin against its config's reference picture, the oracle where the config is an engine state dump:

    cd conformance/playwright && npm install && npm test

The Android half is `anychart-core`'s instrumented tests (`connectedDebugAndroidTest`): the same
configs through `AnyChartView` on a device, the callback bridge, the lifecycle scenarios.

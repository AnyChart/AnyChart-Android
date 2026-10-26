# Host protocol, runtime 0.1.0

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

## Messages

| Direction | type | Fields | Effect |
|---|---|---|---|
| page → host | `ready` | `jsVersion`, `runtimeVersion` | Bundle loaded. Host may send `load`. |
| host → page | `load` | `id`, `config`, `rect?`, `events?` | `anychart.fromJson(config)` drawn into a container for `id`. `rect` `{x,y,width,height}` in CSS px, default full page. `events` is a list of AnyChart event names to forward. |
| host → page | `update` | `id`, `data`, `series?` | Replaces data in place. With `series` (index or name) only that series. |
| host → page | `resize` | `id`, `rect` | Moves and resizes the container, re-lays out the chart. |
| host → page | `dispose` | `id` | Disposes the chart, removes its container. |
| host → page | `query` | `id`, `requestId`, `what` | `what` is `selectedPoints` or `json`. Answered with `answer`. |
| page → host | `rendered` | `id`, `ms` | First draw of chart `id`, milliseconds since `load` was received. |
| page → host | `event` | `id`, `event`, `data` | A forwarded chart event. `data` carries `pointIndex`, `x`, `value`, `series`, `item`, `itemIndex` where the event has them. |
| page → host | `answer` | `id`, `requestId`, `result` | Reply to a `query`. |
| page → host | `error` | `id` (nullable), `message` | A rejected config, a bad message, a script error. Nothing fails silently. |

## Config

`config` is the document `anychart.fromJson` accepts: a root key `chart`, `gauge`, `gantt` or
`map`, with the engine's registered `type` string inside. Note that the engine uses kebab-case
names for some types (`heat-map`, `tree-map`, `circular-gauge`) where the published JSON schema
for 9.0.0 lists camel-case ones; the engine wins.

## Licence

If `window.ANYCHART_LICENSE_KEY` is set before `host.js` runs (the Android host injects it as a
document-start script), the page calls `anychart.licenseKey()` with it. Without it the bundle
shows its own trial credits.

## Conformance

`conformance/configs/*.json` are the configs every host must render. `conformance/playwright`
runs them against this page in Chromium with the fake host and compares screenshots:

    cd conformance/playwright && npm install && npm test

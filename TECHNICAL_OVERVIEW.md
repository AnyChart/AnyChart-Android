# AnyChart-Android Technical Overview

## 1. Project Summary

AnyChart-Android is an Android library that wraps the [AnyChart](https://www.anychart.com/) JavaScript charting library, exposing it through a Java API. Rather than implementing native Android rendering, the library embeds a `WebView` and generates JavaScript code at runtime from Java method calls. The JavaScript is evaluated inside the WebView against a bundled, minified copy of the AnyChart JS library.

**In short:** Java objects build up JS strings; a WebView executes them; the AnyChart JS engine renders SVG/Canvas charts inside that WebView.

| Attribute | Value |
|---|---|
| Language | Java (100%) |
| Min SDK | 19 (Android 4.4 KitKat) |
| Target SDK | 33 (Android 13) |
| Compile SDK | 33 |
| Java version | 17 |
| Library version | 1.5 |
| Distribution | JitPack (`com.github.AnyChart:AnyChart-Android`) |
| Gradle plugin | AGP 8.1.0 |

## 2. Project History and Activity

| Year | Commits | Notes |
|---|---|---|
| 2018 | 41 | Initial development, bulk of the codebase written |
| 2019 | 10 | Continued feature work |
| 2020 | 0 | Dormant |
| 2021 | 2 | Minimal maintenance |
| 2022 | 0 | Dormant |
| 2023 | 11 | Dependency updates, SDK target bump, memory leak fix |
| 2024-present | 0 | No activity |

**Total commits:** 64 across the full history.
**Contributors:** Effectively one (Arseny Malkov, ~97% of commits). Two minor external contributions.
**Releases/Tags:** None. No semantic versioning in git; version tracked only in `build.gradle` (`1.5`).

## 3. Repository Structure

```
AnyChart-Android/
+-- build.gradle                  # Root build file (AGP 8.1.0, repositories)
+-- settings.gradle               # Includes :sample and :anychart modules
+-- gradle.properties             # AndroidX, Jetifier, JVM args
+-- jitpack.yml                   # JitPack CI config (Java 17)
+-- gradlew / gradlew.bat         # Gradle wrapper
+-- README.md                     # User-facing docs with screenshots
+-- android-wait-for-emulator     # CI helper script
+-- run-instrumental-test         # CI helper script
+-- img/                          # Screenshot assets for README
+-- anychart/                     # ** Library module (AAR) **
|   +-- build.gradle
|   +-- src/main/
|       +-- assets/
|       |   +-- anychart-android.min.js   # Bundled AnyChart JS (~2.3 MB minified)
|       |   +-- anychart-ui.min.css       # Bundled AnyChart CSS
|       +-- res/layout/
|       |   +-- view_anychart.xml         # Single WebView layout
|       +-- java/com/anychart/
|           +-- AnyChartView.java         # Core Android view (WebView wrapper)
|           +-- AnyChart.java             # Static factory for all chart types
|           +-- APIlib.java               # Singleton bridge: Java -> JS line dispatch
|           +-- JsObject.java             # Abstract base for all JS-mapped objects
|           +-- AnyChartFormat.java       # Date/time formatting bridge
|           +-- chart/common/             # DataEntry classes + event listeners
|           +-- charts/                   # Chart type classes (Pie, Cartesian, etc.)
|           +-- core/                     # Core hierarchy (Chart, axes, series, UI, etc.)
|           +-- data/                     # Data structures (Table, Tree, etc.)
|           +-- enums/                    # 94 Java enums mapping JS string constants
|           +-- math/                     # Technical indicator math contexts
|           +-- graphics/                 # Vector graphics wrappers
|           +-- scales/                   # Scale types (Linear, DateTime, etc.)
|           +-- palettes/                 # Color palette wrappers
|           +-- standalones/              # Standalone axis/grid/marker objects
|           +-- editor/                   # Chart editor wrappers
|           +-- format/                   # Number/date formatting
|           +-- ui/                       # UI components (toolbar, context menu, etc.)
|           +-- utils/                    # Utility wrappers
+-- sample/                       # ** Demo application module (APK) **
    +-- build.gradle
    +-- src/main/java/com/anychart/sample/
        +-- MainActivity.java             # RecyclerView chart gallery
        +-- Chart.java                    # Chart metadata model
        +-- ChartsAdapter.java            # RecyclerView adapter
        +-- charts/                       # 44 individual chart demo activities
```

## 4. Architecture

### 4.1 Core Concept: Java-to-JavaScript Code Generation

The library does **not** perform native rendering. Every Java API call translates to a JavaScript string that gets dispatched to a WebView. The architecture is essentially a **code generator**: Java objects accumulate JS statements, which are bulk-executed when the WebView finishes loading, and individually evaluated after that.

```
  Java API call                JS string generation              WebView execution
  ---------------              --------------------              ------------------
  pie.title("Fruits")  --->   "chart1.title('Fruits');"  --->   evaluateJavascript()
```

### 4.2 Class Hierarchy

```
JsObject (abstract)
  +-- Base
       +-- VisualBase
            +-- VisualBaseWithBounds
                 +-- Chart
                      +-- SeparateChart
                           +-- Cartesian, Pie, Scatter, Polar, Radar,
                               Map, Funnel, Pyramid, Gantt, HeatMap,
                               Stock, Venn, Sankey, Waterfall, TagCloud,
                               Sunburst, TreeMap, Pert, Resource, Pareto,
                               Sparkline, Bullet, Mekko, CircularGauge,
                               LinearGauge, Cartesian3d
```

All classes in the hierarchy extend `JsObject`. Every constructor takes a JS expression string (e.g., `"anychart.pie()"`) and registers it via `APIlib`:

```java
// From Chart.java
public Chart(String jsChart) {
    jsBase = "chart" + ++variableIndex;
    APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
}
```

Every setter/method call emits a JS line:

```java
// Typical pattern across all 628 Java files
public Chart title(String settings) {
    APIlib.getInstance().addJSLine(
        String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(settings)));
    return this;
}
```

### 4.3 Key Components

#### `AnyChartView` (FrameLayout)
The main integration point. Developers add this view to their layout XML. Internally it:
1. Inflates a `WebView` from `view_anychart.xml`
2. Enables JavaScript, sets up a `WebChromeClient` and `WebViewClient`
3. Registers a `JsListener` that either buffers JS lines (pre-render) or evaluates them immediately (post-render)
4. On `setChart(chart)`, loads an HTML document containing:
   - The bundled `anychart-android.min.js` (2.3 MB)
   - The bundled `anychart-ui.min.css`
   - A `<div id="container">` target
5. On `onPageFinished`, wraps all accumulated JS in `anychart.onDocumentReady()` and evaluates it
6. Supports state save/restore across configuration changes via `onSaveInstanceState`/`onRestoreInstanceState`
7. Adds a `@JavascriptInterface` (`ListenersInterface`) to bridge JS click events back to Java

#### `APIlib` (Singleton)
A double-checked locking singleton that holds a reference to the currently active `AnyChartView`. All `JsObject` subclasses call `APIlib.getInstance().addJSLine(...)` to dispatch generated JS. This design means **only one AnyChartView can be "active" at a time** for JS generation.

#### `JsObject` (Abstract Base)
Provides:
- `jsBase` field: the JavaScript variable name (e.g., `"chart1"`)
- Static `variableIndex` counter for unique variable naming
- `wrapQuotes()`: intelligent string quoting that detects JSON and JS functions
- Array/list serialization helpers for converting Java data to JS literals

#### `DataEntry` and Subclasses
A `HashMap<String, Object>`-based data model that serializes to JS object literals:

| Class | Fields | Use Case |
|---|---|---|
| `DataEntry` | Arbitrary key-value | Base class |
| `ValueDataEntry` | x, value | Simple charts (bar, column, line) |
| `BubbleDataEntry` | x, value, size | Bubble charts |
| `BoxDataEntry` | x, low, q1, median, q3, high, outliers | Box plots |
| `HeatDataEntry` | x, y, heat | Heat maps |
| `HighLowDataEntry` | x, high, low | OHLC/range charts |
| `TreeDataEntry` | id, parent, name, children | Hierarchical data |
| `PertDataEntry` | id, name, duration, dependsOn | PERT charts |
| `CategoryValueDataEntry` | x per category | Multi-category |
| `NameValueDataEntry` | name, value | Named entries |
| `SingleValueDataSet` | raw array | Simple datasets |

#### `ListenersInterface` (JavaScript Bridge)
Singleton with `@JavascriptInterface` annotation. Receives click events from JS via `android.onClick(data)`, parses the colon-delimited data string, and dispatches to registered `OnClickListener`.

#### `AnyChart` (Static Factory)
Contains ~50 static factory methods, one per chart type:
```java
public static Pie pie() {
    return new Pie("anychart.pie()");
}
```

### 4.4 Rendering Pipeline

```
1. Developer calls AnyChart.pie() or similar
   -> Pie constructor emits: "chart1 = anychart.pie();"

2. Developer calls pie.title("..."), pie.data(...), etc.
   -> Each call emits JS line: "chart1.title('...');"
   -> Lines buffered in AnyChartView.js StringBuilder

3. Developer calls anyChartView.setChart(pie)
   -> Triggers loadHtml() which loads HTML + JS + CSS into WebView

4. WebView fires onPageFinished
   -> All buffered JS wrapped in anychart.onDocumentReady(function() { ... })
   -> evaluateJavascript() runs the accumulated code
   -> Chart renders inside <div id="container">

5. Post-render API calls (if any)
   -> JS lines evaluated immediately via evaluateJavascript()
```

### 4.5 Event System (JS -> Java)

```
1. Java: pie.setOnClickListener(new OnClickListener(["x","value"]) { ... })
   -> Emits JS: chart1.listen("pointClick", function(e) {
        android.onClick("x:" + e.point.get("x") + ",value:" + e.point.get("value"));
      });

2. User taps chart point in WebView

3. JS calls android.onClick("x:Apples,value:6371664")

4. ListenersInterface.onClick() parses string into Map<String,String>

5. Event object delivered to Java OnClickListener.onClick(event)
```

## 5. Codebase Metrics

| Metric | Value |
|---|---|
| Total Java source files (library) | 628 |
| Total lines of Java (library) | ~383,000 |
| Lines in `charts/` package | ~64,000 |
| Enum classes | 94 |
| Package directories | ~90 |
| Chart types supported | ~50 |
| Sample chart activities | 44 |
| Bundled JS asset size | ~2.3 MB (minified) |

The vast majority of code is **auto-generated or mechanical**: each of the 628 Java files mirrors a corresponding AnyChart JS API surface, with every method being a one-liner that formats and dispatches a JS string. The actual hand-written architectural code is concentrated in roughly 6 files (~600 lines):
- `AnyChartView.java` (~305 lines)
- `APIlib.java` (~30 lines)
- `JsObject.java` (~190 lines)
- `DataEntry.java` (~137 lines)
- `ListenersInterface.java` (~73 lines)
- `Event.java` (~17 lines)

## 6. Dependencies

### Library Module (`anychart/`)
| Dependency | Version | Purpose |
|---|---|---|
| `androidx.appcompat:appcompat` | 1.6.1 | AndroidX compatibility |
| `androidx.test.espresso:espresso-core` | 3.5.1 | Instrumentation tests |
| `junit:junit` | 4.13.2 | Unit tests |

### Sample Module (`sample/`)
| Dependency | Version | Purpose |
|---|---|---|
| `project(":anychart")` | - | The library itself |
| `androidx.appcompat:appcompat` | 1.6.1 | AppCompat theming |
| `androidx.constraintlayout:constraintlayout` | 2.1.4 | Layout |
| `androidx.recyclerview:recyclerview` | 1.3.1 | Chart list |
| `androidx.cardview:cardview` | 1.0.0 | Card UI |
| `androidx.annotation:annotation` | 1.6.0 | Annotations |
| Various `androidx.test.*` | 1.1.5-3.5.1 | Espresso, JUnit runner |

The library has a minimal dependency footprint: only `appcompat` at runtime.

## 7. Build and Distribution

- **Build system:** Gradle with Android Gradle Plugin 8.1.0
- **Java compatibility:** Source and target level 17
- **JitPack config:** OpenJDK 17 (`jitpack.yml`)
- **Maven coordinates:** `com.anychart:AnyChart-Android:1.5`
- **Publishing:** Configured via `maven-publish` plugin with `singleVariant('release')`
- **ProGuard:** Not enabled (`minifyEnabled false`)
- **MultiDex:** Enabled in sample app

Consumer integration:
```groovy
// build.gradle
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.AnyChart:AnyChart-Android:1.5.0'
}
```

## 8. Sample Application

The `sample/` module is a standalone demo APK containing:

- **`MainActivity`**: A searchable `RecyclerView` gallery listing all 44 chart demos
- **44 chart activity classes** (e.g., `PieChartActivity`, `LineChartActivity`, `GanttChartActivity`), each demonstrating a specific chart type with hardcoded sample data
- **`Chart`** model class: metadata for each chart (name, description, associated Activity class)
- **`ChartsAdapter`**: RecyclerView adapter with filtering support

Each demo follows the same pattern:
```java
AnyChartView anyChartView = findViewById(R.id.any_chart_view);
Pie pie = AnyChart.pie();
// configure chart...
pie.data(data);
anyChartView.setChart(pie);
```

## 9. Known Architectural Limitations

### Single Active View Constraint
`APIlib` is a singleton holding one `AnyChartView` reference. All `JsObject` method calls route through this singleton. This means:
- Only one chart can be "built" (having Java API calls made against it) at a time
- Displaying multiple charts requires careful sequencing of `setActiveAnyChartView()` calls
- This is a fundamental design constraint, not a simple bug

### WebView-Based Rendering
- **Performance:** Every chart is a full WebView instance loading a 2.3 MB JS bundle. Multiple charts means multiple WebViews.
- **Memory:** WebView is memory-heavy. The library includes a memory leak fix (commit `2b7f176`), but WebView lifecycle management remains fragile.
- **Interop overhead:** All data passes through string serialization (Java -> JS string -> WebView eval). Large datasets will produce very large JS strings.
- **No native rendering:** Touch interactions, accessibility, and rendering performance are all limited by the WebView bridge.

### String-Based JS Generation
- No AST or structured IR; just raw string concatenation via `StringBuilder`
- `wrapQuotes()` does basic detection of JSON/functions but is brittle
- The `==` comparison in `androidCheck()` compares strings by reference rather than `.equals()` (line 293 of `AnyChartView.java`)
- No sanitization or escaping of user-provided strings, which could allow JS injection if arbitrary user input is passed through the API

### Code Generation / Maintenance Burden
- 628 Java files (~383K lines) mirror the AnyChart JS API surface
- Likely generated from the AnyChart JS API docs or TypeScript definitions, but no code generator is included in the repository
- Updating to a newer AnyChart JS version would require regenerating all wrapper classes

### Licensing
- A trial-version watermark and credits logo are injected unless a valid license key is provided
- License validation uses MD5 hashing (`androidCheck` method)

## 10. Supported Chart Types

Cartesian family: Area, Bar, Box, Bubble, Column, Combined, Financial (OHLC), HiLo, Line, Range, Vertical, Waterfall (+ 3D variants)

Circular/Radial: Pie, Donut, Funnel, Pyramid, Polar, Radar, Venn, Sunburst

Gauges: Circular Gauge, Linear Gauge, Thermometer, LED, Tank

Maps: Choropleth, Bubble Map, Connector Map, Point Map, Seat Map

Specialized: Gantt, PERT, Heat Map, Mekko/Mosaic, Pareto, Resource, Sankey, Scatter, Sparkline, Stock, Tag Cloud, Tree Map, Quadrant, Bullet

Stock indicators (math package): ADL, AMA, AO, Aroon, ATR, Bollinger Bands, CCI, CHO, CMF, DMI, EMA, HA, KDJ, Keltner Channels, MACD, MFI, MMA, Momentum, OBV, Price Channels, PSAR, ROC, RSI, SMA, Stochastic, TRIX, Volume MA, Williams %R

## 11. File-Level Reference

### Core Architecture (hand-written, ~750 lines total)

| File | Lines | Role |
|---|---|---|
| `AnyChartView.java` | 305 | WebView-based chart container, HTML generation, JS evaluation lifecycle |
| `APIlib.java` | 30 | Singleton JS dispatch bridge |
| `JsObject.java` | 190 | Abstract base: variable naming, string utilities, array serialization |
| `AnyChart.java` | 230 | Static factory methods for all chart types |
| `AnyChartFormat.java` | 36 | Date/time formatting API bridge |
| `DataEntry.java` | 137 | HashMap-based data model with JS object literal serialization |
| `ValueDataEntry.java` | 15 | Simple x/value data entry |
| `ListenersInterface.java` | 73 | `@JavascriptInterface` click event bridge |
| `Event.java` | 17 | Click event data wrapper |

### Generated API Surface (~382,000 lines)

| Package | Files | Description |
|---|---|---|
| `charts/` | 29 | Top-level chart classes |
| `core/` | ~280 | Chart internals (axes, series, grids, annotations, UI, gantt, gauge, etc.) |
| `enums/` | 94 | String-constant enums |
| `data/` | ~20 | Data table, tree, view wrappers |
| `math/` | ~30 | Stock indicator math contexts |
| `graphics/` | ~30 | Vector/stage wrappers |
| `scales/` | ~10 | Scale type wrappers |
| `palettes/` | ~5 | Color palette wrappers |
| `standalones/` | ~15 | Standalone component wrappers |
| `ui/` | ~10 | Toolbar, context menu wrappers |
| `editor/` | ~5 | Chart editor wrappers |

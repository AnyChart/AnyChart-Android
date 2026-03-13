# AnyChart-Android: Revival Feasibility Analysis

## Executive Summary

**Can this project be revived? Technically yes, but it probably shouldn't be — at least not in its current form.**

The library sits at the intersection of several unfortunate trends: the Android ecosystem has moved decisively toward Jetpack Compose and native rendering, the WebView-based architecture creates fundamental problems that can't be patched away, and the competitive landscape has matured with free, open-source, Compose-native alternatives. Meanwhile, the upstream AnyChart JS library remains actively developed and commercially licensed — meaning any revival inherits both a dependency on a third party's release cycle and a licensing cost for end users.

This document analyzes the current state honestly, explores what revival options exist, and recommends a path forward.

---

## 1. Current State Assessment

### 1.1 The Numbers

| Metric | Value | Verdict |
|---|---|---|
| GitHub stars | ~2,400 | Decent — shows historical interest |
| Open issues | 111 | Bad — many are fundamental, not edge cases |
| Last meaningful commit | July 2023 | 2+ years dormant |
| Contributors | 1 (effectively) | Bus factor of one |
| Formal releases/tags | 0 | No versioning discipline |
| Fragment support | Officially unsupported | Disqualifying for modern apps |
| Jetpack Compose support | None | Disqualifying for new projects |
| License | Commercial (AnyChart JS) | Barrier to adoption |

### 1.2 The Broken Things

These aren't bugs to fix — they're architectural consequences:

**Fragment non-support.** The library [officially does not support Fragments](https://github.com/AnyChart/AnyChart-Android/issues/250). Since virtually every modern Android app uses Fragments (or Navigation Component, which uses Fragments), this alone makes the library unusable for most real projects. The root cause is `APIlib`'s singleton design — it holds one active `AnyChartView` reference, and Fragment lifecycle is incompatible with this assumption.

**Multiple charts don't work.** Users consistently report that [only the last chart renders](https://github.com/AnyChart/AnyChart-Android/issues/181) when placing multiple charts in one screen. Same root cause: the singleton `APIlib` can only target one view at a time during JS generation.

**WebView rendering overhead.** Each chart is a full WebView loading a 2.3 MB JavaScript bundle. In a RecyclerView, in a ViewPager, in a Fragment — each instance carries the memory and startup cost of a browser tab. Users report [white screens](https://github.com/AnyChart/AnyChart-Android/issues/257), [blank renders](https://github.com/AnyChart/AnyChart-Android/issues/102), and lifecycle-dependent disappearances.

**No Kotlin or Compose support.** The entire API is Java-only. Users have reported that [charts don't work in Kotlin](https://github.com/AnyChart/AnyChart-Android/issues/157) (likely the same lifecycle issues, but the maintainer was unfamiliar with Kotlin). There is zero Jetpack Compose integration.

**String-based JS injection risk.** All user data flows through `String.format()` into `evaluateJavascript()` with no escaping. Passing a string containing a single quote through the API will break the chart. Passing crafted input could execute arbitrary JS.

### 1.3 What Still Works

- The AnyChart JS engine itself is powerful and actively maintained (currently at [v8.13.0, with updates through June 2025](https://www.anychart.com/products/anychart/history/))
- The breadth of chart types (~50) is genuinely impressive and exceeds any single Android-native competitor
- The fluent Java API design is intuitive for developers coming from the JS world
- JitPack distribution works
- The sample app is comprehensive with 44 demos

---

## 2. The Competitive Landscape (2025-2026)

The Android charting world has changed fundamentally since 2018 when this library was created.

### 2.1 Jetpack Compose Is Now The Default

[60% of the top 1,000 Play Store apps use Jetpack Compose](https://developer.android.com/jetpack/compose). Google's official position: new Android projects have zero justification for choosing Views over Compose. Compose performance now [matches the View system](https://android-developers.googleblog.com/2025/12/whats-new-in-jetpack-compose-december.html) in scroll benchmarks.

A library that requires `WebView` inside `FrameLayout` inside XML layouts is two paradigms behind.

### 2.2 Direct Competitors

| Library | Stars | Compose | Native Rendering | Chart Types | License | Maintained |
|---|---|---|---|---|---|---|
| **AnyChart-Android** | 2.4K | No | No (WebView) | ~50 | Commercial | No |
| **[Vico](https://github.com/patrykandpatrick/vico)** | 2.45K | Yes (native) | Yes (Canvas) | Line, Bar, Composed | Apache 2.0 | Yes (v3.0) |
| **MPAndroidChart** | 37K+ | No (bridge) | Yes (Canvas) | ~15 | Apache 2.0 | No |
| **[Koala Plot](https://www.jetpackcompose.app/Chart-libraries-in-Jetpack-Compose)** | Growing | Yes (native) | Yes (Canvas) | Multiple | Open source | Yes |
| **[YCharts](https://medium.com/ymedialabs-innovation/meet-ycharts-an-opensource-jetpack-compose-chart-library-2568aeac19fb)** | Growing | Yes (native) | Yes (Canvas) | Basic set | Apache 2.0 | Limited |
| **[SciChart](https://www.scichart.com/android-chart-performance-comparison/)** | N/A | No | Yes (native) | Many | Commercial | Yes |

**The uncomfortable truth:** Vico has roughly the same star count as AnyChart-Android, is free, Compose-native, actively maintained, and covers the chart types that 90% of apps actually need. For the remaining 10% (Gantt, PERT, Sankey, geographic maps), developers either use specialized libraries or web views directly.

### 2.3 The AnyChart JS Library Itself

[AnyChart JS](https://www.anychart.com/) is alive and well — v8.13.0 shipped September 2024, with continued updates through 2025. The parent company actively develops the JS product. But they've clearly deprioritized the Android wrapper (this repo). This is rational from their perspective: the web version works everywhere, and maintaining 628 auto-generated Java wrapper files for a shrinking View-based Android audience isn't worthwhile.

[Pricing starts at $49 for startups](https://www.anychart.com/buy/), scaling up for commercial use. This is reasonable for the JS library but becomes awkward when competitors offer free Android-native solutions.

---

## 3. Revival Options

### Option A: Patch the Current Architecture

**Effort:** Medium | **Impact:** Low | **Viability:** Poor

What it would involve:
- Fix the `APIlib` singleton to support multiple concurrent `AnyChartView` instances
- Add Fragment lifecycle awareness to `AnyChartView`
- Update to latest AnyChart JS (8.13.0+)
- Regenerate wrapper classes (code generator not in repo — would need to be rebuilt)
- Add input sanitization to prevent JS injection
- Update SDK targets, dependencies
- Address the 111 open issues

Why it's not enough:
- You'd still have WebView-based rendering with all its performance and memory costs
- You'd still require the commercial AnyChart JS license
- You'd still have a View-based API in a Compose-first world
- The fundamental architecture (Java string concatenation -> evaluateJavascript) can't be made performant for real-time data or large datasets
- Nobody is going to choose a patched WebView wrapper over a free Compose-native library for new projects

**Verdict: Life support, not revival.**

### Option B: Compose Wrapper Around WebView

**Effort:** Medium-High | **Impact:** Medium | **Viability:** Marginal

What it would involve:
- Create a `@Composable AnyChart()` function wrapping the WebView approach
- Use `AndroidView` interop or `compose-webview-multiplatform`
- Redesign the API to be Compose-idiomatic (state-driven, not imperative)
- Fix the singleton problem (scope to Composable lifecycle)
- Keep the AnyChart JS engine underneath

Why it might work:
- Preserves the ~50 chart types
- Compose Multiplatform WebView bridges exist
- Could attract users who specifically need AnyChart's exotic chart types

Why it probably won't:
- A Compose wrapper around a WebView is still a WebView — performance, memory, and rendering issues persist
- The recomposition model (Compose re-renders on state change) is fundamentally incompatible with "accumulate JS strings and eval them once"
- Developers choosing Compose expect Canvas-native rendering
- Still requires commercial AnyChart license

**Verdict: Possible niche product, but fighting against the current.**

### Option C: Native Canvas Rewrite Inspired by AnyChart

**Effort:** Very High | **Impact:** High | **Viability:** Theoretically possible, practically unrealistic

What it would involve:
- Rewrite the rendering engine using Android Canvas / Compose Canvas
- Implement chart types natively (no WebView, no JS dependency)
- Design a Kotlin-first, Compose-native API
- Cherry-pick the best chart types (start with 10-15 most used)

Why it's appealing:
- Would be a genuinely competitive modern library
- No WebView overhead, no commercial JS dependency
- Could achieve the breadth that Vico currently lacks

Why it's unrealistic:
- AnyChart JS is hundreds of thousands of lines of rendering code built over 20+ years
- Reimplementing even 10 chart types with full interactivity, animations, and edge case handling is a multi-year, multi-developer effort
- You'd be building a competitor to AnyChart, not reviving AnyChart-Android
- The AnyChart name and branding would be misleading if the JS engine isn't underneath
- Vico and others already have a head start and active communities

**Verdict: Building a new product, not reviving this one.**

### Option D: Pivot to "AnyChart Compose Bridge" (Niche Play)

**Effort:** Medium | **Impact:** Medium (for specific audience) | **Viability:** Best of the options

What it would involve:
- Accept that WebView is the architecture (it's the whole point — leverage existing JS)
- Build a clean, Kotlin-first, Compose-aware API from scratch
- Solve the multi-instance problem properly (scoped coroutines, not singleton)
- Target specifically the users who need chart types that no native library offers: **Gantt, PERT, Sankey, geographic maps, stock with 30+ indicators, sunburst, treemap, etc.**
- Don't compete with Vico on line/bar/pie — compete on breadth
- Make the WebView a feature, not a liability: "Use the power of AnyChart JS, from Compose"
- Bundle the latest AnyChart JS
- Provide clear license guidance

Target audience:
- Enterprise Android apps that need exotic chart types
- Teams already paying for AnyChart JS licenses for their web products
- Projects where chart breadth matters more than rendering performance

What success looks like:
- Not 37K stars. Maybe 1-2K active users who specifically need what only AnyChart provides
- Acknowledged as the Android companion to AnyChart JS

**Verdict: The most honest and viable path, but with a deliberately narrow scope.**

### Option E: Archive and Document

**Effort:** Low | **Impact:** Honest | **Viability:** High

What it would involve:
- Mark the repo as archived on GitHub
- Write a clear README explaining the project's status and recommending alternatives
- Point users to Vico for basic charts, AnyChart JS + WebView for exotic chart needs
- Preserve the codebase as a reference for anyone who wants to study the Java-to-JS bridge pattern

Why this might be the right answer:
- The 111 open issues aren't getting fixed
- New users are adopting the library based on 2.4K stars and hitting immediate walls
- An archived project with clear alternatives is more helpful than an abandoned project with false hope
- The AnyChart company's resources are better spent on the JS library

**Verdict: The most responsible option if no one is going to actively maintain it.**

---

## 4. What Would Revival Actually Require?

Regardless of which option is chosen, revival requires:

### 4.1 People
- **Minimum 1 dedicated maintainer** (not part-time, not occasional commits)
- For Option D: 1-2 Kotlin/Compose developers with WebView interop experience
- For Option C: 3-5+ developers for multiple years
- Ongoing triage of issues (111 open + new ones)

### 4.2 Relationship with AnyChart (the company)
- The code generator for the 628 wrapper classes is not in this repo. Without it, updating to newer AnyChart JS versions means manually updating hundreds of files
- Alignment on licensing: is the Android wrapper free while JS is commercial? What's the business model?
- Access to AnyChart JS source or at minimum, API change documentation between versions

### 4.3 Technical Prerequisites (minimum, any option)
1. Fix `APIlib` singleton -> support multiple chart instances
2. Fragment/lifecycle awareness
3. Input sanitization (security)
4. Update bundled JS to AnyChart 8.13.0+
5. Rebuild or obtain the code generator
6. Migrate build to Kotlin DSL, update AGP
7. Target SDK 34+
8. Add automated CI (GitHub Actions replacing the shell scripts)
9. Establish semantic versioning and release process

### 4.4 Timeline Estimates

| Option | Minimum Viable | Full Featured |
|---|---|---|
| A (Patch) | 2-3 months | 6 months |
| B (Compose Wrapper) | 4-6 months | 9-12 months |
| C (Native Rewrite) | 12-18 months | 3+ years |
| D (Compose Bridge, niche) | 3-5 months | 8-12 months |
| E (Archive) | 1 week | 1 week |

---

## 5. Recommendation

**If the goal is to serve users:** Option E (Archive) is the most honest and immediately helpful action. The 111 open issues and non-existent maintenance are actively harming developers who discover the library via its star count.

**If the goal is to build something viable:** Option D (Compose Bridge, niche) is the only path that plays to the library's genuine strength (chart type breadth via AnyChart JS) while acknowledging reality (WebView is the architecture, own it). But it requires commitment from the AnyChart organization and at least one dedicated developer.

**If the goal is to revive the existing codebase as-is:** Option A (Patch) is technically possible but produces a product that nobody would choose over free alternatives for new projects. It would serve only existing users who are already locked in.

The worst outcome is the current state: an unmaintained library with 2.4K stars that looks alive but isn't, causing developers to invest time integrating it before hitting the Fragment wall, the multi-chart wall, or the abandoned-issues wall.

---

## 6. Appendix: Decision Matrix

| Criterion | Weight | A (Patch) | B (Compose Wrap) | C (Native) | D (Niche Bridge) | E (Archive) |
|---|---|---|---|---|---|---|
| Effort to ship | 20% | 7/10 | 5/10 | 1/10 | 6/10 | 10/10 |
| Market viability | 25% | 2/10 | 4/10 | 8/10 | 5/10 | N/A |
| Plays to strengths | 20% | 3/10 | 6/10 | 2/10 | 8/10 | N/A |
| User honesty | 15% | 4/10 | 6/10 | 7/10 | 7/10 | 10/10 |
| Maintenance burden | 20% | 4/10 | 5/10 | 2/10 | 5/10 | 10/10 |
| **Weighted score** | | **3.8** | **5.1** | **3.9** | **6.1** | **-** |

Option D scores highest as a product play. Option E scores highest if maintenance commitment isn't available.

---

*Analysis prepared March 2026. Based on repository state at commit `f3d46f8`, competitive landscape research, and AnyChart issue tracker review.*

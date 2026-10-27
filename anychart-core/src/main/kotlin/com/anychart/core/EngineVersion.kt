package com.anychart.core

/**
 * The DSL is generated for one engine version (`Generated.ENGINE_VERSION` in anychart-dsl); the
 * runtime page announces the bundled one in `ready`. Major.minor.patch must agree; the build
 * number after it may differ.
 */
public object EngineVersion {
    /** A warning when [expected] and [announced] disagree on major.minor.patch, else null. */
    public fun mismatch(expected: String?, announced: String): String? {
        if (expected.isNullOrBlank()) return null
        val want = expected.split(".").take(3).joinToString(".")
        val have = announced.split(".").take(3).joinToString(".")
        return if (want == have) null else "config DSL generated for AnyChart $expected, the runtime page bundles $announced"
    }
}

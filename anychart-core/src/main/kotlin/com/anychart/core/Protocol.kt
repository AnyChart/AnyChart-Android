package com.anychart.core

/**
 * The host protocol version this host implements (anychart-core/PROTOCOL.md). The runtime page
 * announces its own in `ready.runtimeVersion`; the majors must agree, minors add fields only.
 */
public object Protocol {
    public const val VERSION: String = "1.0"
    public const val MAJOR: Int = 1

    /** A message when the page's runtime version has another major than [MAJOR], else null. */
    public fun mismatch(runtimeVersion: String): String? {
        val major = runtimeVersion.substringBefore(".").toIntOrNull()
        return if (major == MAJOR) null else "runtime page speaks protocol $runtimeVersion, this host implements $VERSION"
    }
}

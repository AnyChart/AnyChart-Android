package com.anychart.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class EngineVersionTest {
    @Test
    fun `same major minor patch is fine, the build number may differ`() {
        assertNull(EngineVersion.mismatch("9.0.0", "9.0.0.3072"))
        assertNull(EngineVersion.mismatch("9.0.0", "9.0.0"))
        assertNull(EngineVersion.mismatch(null, "8.14.1"))
        assertNull(EngineVersion.mismatch("", "8.14.1"))
    }

    @Test
    fun `a different engine is named in the warning`() {
        assertEquals("config DSL generated for AnyChart 9.0.0, the runtime page bundles 9.1.0.100", EngineVersion.mismatch("9.0.0", "9.1.0.100"))
        assertEquals("config DSL generated for AnyChart 9.0.0, the runtime page bundles 8.14.1", EngineVersion.mismatch("9.0.0", "8.14.1"))
    }
}

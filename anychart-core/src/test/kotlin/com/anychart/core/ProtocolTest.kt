package com.anychart.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class ProtocolTest {
    @Test
    fun `the page's major must match, minors and patches may differ`() {
        assertNull(Protocol.mismatch("1.0.0"))
        assertNull(Protocol.mismatch("1.4.2"))
        assertEquals("runtime page speaks protocol 0.3.0, this host implements 1.0", Protocol.mismatch("0.3.0"))
        assertEquals("runtime page speaks protocol 2.0.0, this host implements 1.0", Protocol.mismatch("2.0.0"))
        assertEquals("runtime page speaks protocol unknown, this host implements 1.0", Protocol.mismatch("unknown"))
    }

    @Test
    fun `the shipped page announces this host's protocol`() {
        val hostJs = java.io.File("src/main/assets/runtime/host.js").readText()
        val announced = Regex("""RUNTIME_VERSION = '([0-9.]+)'""").find(hostJs)!!.groupValues[1]
        assertNull("host.js announces $announced", Protocol.mismatch(announced))
        assertEquals(Protocol.VERSION, announced.substringBeforeLast("."))
    }
}

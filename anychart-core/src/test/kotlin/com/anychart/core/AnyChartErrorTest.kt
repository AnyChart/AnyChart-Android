package com.anychart.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class AnyChartErrorTest {
    @Test
    fun `every page code has its type, unknown codes are page errors`() {
        assertTrue(AnyChartError.fromPage("c", "bad-config", "x") is AnyChartError.BadConfig)
        assertTrue(AnyChartError.fromPage("c", "bad-data", "x") is AnyChartError.BadData)
        assertTrue(AnyChartError.fromPage("c", "unknown-chart", "x") is AnyChartError.UnknownChart)
        assertTrue(AnyChartError.fromPage("c", "callback", "x") is AnyChartError.Callback)
        assertTrue(AnyChartError.fromPage(null, "bad-message", "x") is AnyChartError.BadMessage)
        assertTrue(AnyChartError.fromPage(null, "script", "x") is AnyChartError.Page)
        assertTrue(AnyChartError.fromPage(null, "something-new", "x") is AnyChartError.Page)
        assertEquals("c", AnyChartError.fromPage("c", "bad-config", "x").chartId)
        assertEquals("BadConfig(c: boom)", AnyChartError.fromPage("c", "bad-config", "boom").toString())
    }
}

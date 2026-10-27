package com.anychart.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/** The host's pure types from Java: no Kotlin defaults, no lambdas needed. INTEG-7. */
public class JavaApiTest {
    @Test
    public void typesAreUsableFromJava() {
        ChartRect rect = new ChartRect(0, 0, 320, 240);
        assertEquals(320, rect.getWidth());
        assertFalse(License.INSTANCE.isUsable(""));
        assertNull(EngineVersion.INSTANCE.mismatch("9.0.0", "9.0.0.3072"));
        AnyChartError e = AnyChartError.fromPage("c1", "unknown-chart", "no chart with id c1");
        assertTrue(e instanceof AnyChartError.UnknownChart);
        assertEquals("c1", e.getChartId());
        AnyChartError.EngineMismatch mismatch = new AnyChartError.EngineMismatch("9.0.0", "8.14.1", "x");
        assertEquals("8.14.1", mismatch.getAnnounced());
    }
}

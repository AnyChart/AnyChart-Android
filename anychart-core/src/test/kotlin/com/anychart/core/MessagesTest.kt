package com.anychart.core

import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class MessagesTest {

    private val pie = """{"chart":{"type":"pie","data":[{"x":"Cote d'Ivoire","value":1},{"x":"O'Reilly \"Media\"","value":2}]}}"""

    @Test
    fun `load carries the config as a document, not as text`() {
        val m = Messages.load("c1", pie, listOf("pointClick"), ChartRect(0, 10, 300, 200))
        assertEquals("load", m.getString("type"))
        assertEquals("c1", m.getString("id"))
        assertEquals("pie", m.getJSONObject("config").getJSONObject("chart").getString("type"))
        assertEquals("pointClick", m.getJSONArray("events").getString(0))
        assertEquals(200, m.getJSONObject("rect").getInt("height"))
    }

    @Test
    fun `hostile strings survive a round trip through the message`() {
        val text = Messages.load("c1", pie, emptyList(), null).toString()
        val back = JSONObject(text).getJSONObject("config").getJSONObject("chart").getJSONArray("data")
        assertEquals("Cote d'Ivoire", back.getJSONObject(0).getString("x"))
        assertEquals("O'Reilly \"Media\"", back.getJSONObject(1).getString("x"))
    }

    @Test
    fun `update takes a data array and an optional series`() {
        val m = Messages.update("c1", """[{"x":"a","value":1}]""", 2)
        assertEquals(1, m.getJSONArray("data").length())
        assertEquals(2, m.getInt("series"))
        assertFalse(Messages.update("c1", "[]", null).has("series"))
    }

    @Test
    fun `incoming messages decode by type`() {
        // Ready carries a JSONObject (timing), which compares by identity: check the fields.
        val ready = Messages.parse("""{"type":"ready","jsVersion":"9.0.0.3072","runtimeVersion":"0.1.0"}""") as Messages.Incoming.Ready
        assertEquals("9.0.0.3072", ready.jsVersion)
        assertEquals("0.1.0", ready.runtimeVersion)
        assertEquals(0, ready.timing.length())
        assertEquals(Messages.Incoming.Rendered("c1", 36),
            Messages.parse("""{"type":"rendered","id":"c1","ms":36}"""))
        assertEquals(Messages.Incoming.Rendered("c1", 36, 32, 2.6),
            Messages.parse("""{"type":"rendered","id":"c1","ms":36,"callbacks":{"calls":32,"ms":2.6}}"""))
        val ev = Messages.parse("""{"type":"event","id":"c1","event":"pointClick","data":{"pointIndex":7,"x":"Eyeliner","value":213210,"series":"Revenue"}}""")
        assertTrue(ev is Messages.Incoming.Event)
        assertEquals("Eyeliner", (ev as Messages.Incoming.Event).data.getString("x"))
        val err = Messages.parse("""{"type":"error","id":null,"message":"boom"}""")
        assertEquals(Messages.Incoming.Error(null, "boom"), err)
    }

    @Test
    fun `garbage from the page becomes an error, not an exception`() {
        val m = Messages.parse("{not json")
        assertTrue(m is Messages.Incoming.Error)
        assertNull((m as Messages.Incoming.Error).chartId)
        assertTrue(Messages.parse("""{"type":"whatever"}""") is Messages.Incoming.Error)
    }
}

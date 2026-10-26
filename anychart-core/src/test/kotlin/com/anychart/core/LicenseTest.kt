package com.anychart.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class LicenseTest {

    @Test
    fun `md5 matches the reference vector`() {
        assertEquals("900150983cd24fb0d6963f7d28e17f72", License.md5("abc"))
    }

    @Test
    fun `blank keys are not usable and inject nothing`() {
        assertFalse(License.isUsable(null))
        assertFalse(License.isUsable(""))
        assertFalse(License.isUsable("   "))
        assertNull(License.documentStartScript(""))
    }

    @Test
    fun `a real key is injected as a quoted JS string`() {
        assertTrue(License.isUsable("acme-corp-1234"))
        assertEquals("""window.ANYCHART_LICENSE_KEY="acme-corp-1234";""", License.documentStartScript("acme-corp-1234"))
        // quotes inside a key cannot break out of the string
        assertEquals("""window.ANYCHART_LICENSE_KEY="a\"b";""", License.documentStartScript("a\"b"))
    }
}

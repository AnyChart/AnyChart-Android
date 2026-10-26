package com.anychart.core

import org.json.JSONObject
import java.security.MessageDigest

/**
 * The 1.x licence rule, ported as is: a key is usable unless it is blank or hashes to the known
 * trial value. 1.x compared the hash with `==` on strings, so that branch never matched; this
 * port compares by value, which is what the author meant.
 *
 * Without a usable key nothing is injected and the bundle shows its own trial credits.
 */
public object License {
    private const val TRIAL_KEY_MD5 = "0df80e76aeca7dc40e01e876dca3542b"

    public fun isUsable(key: String?): Boolean = !key.isNullOrBlank() && md5(key) != TRIAL_KEY_MD5

    /** The script the host injects at document start, or null when there is nothing to inject. */
    internal fun documentStartScript(key: String?): String? =
        if (isUsable(key)) "window.ANYCHART_LICENSE_KEY=${JSONObject.quote(key)};" else null

    internal fun md5(s: String): String =
        MessageDigest.getInstance("MD5").digest(s.toByteArray(Charsets.UTF_8))
            .joinToString("") { "%02x".format(it) }
}

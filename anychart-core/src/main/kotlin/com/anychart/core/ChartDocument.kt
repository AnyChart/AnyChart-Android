package com.anychart.core

import org.json.JSONObject

/**
 * A chart configuration the view can load: the JSON document the runtime page takes, the host
 * callbacks it refers to, and the engine version it was written for. anychart-dsl's chart roots
 * implement it; a host with its own JSON can too.
 */
public interface ChartDocument {
    /** `{"chart": {...}}` (or `gauge`, `map`, `gantt`) as `anychart.fromJson` accepts it. */
    public fun toDocumentString(): String

    /** Host lambdas for the document's `{"$fn": id}` placeholders; empty when there are none. */
    public fun callbacks(): Map<String, (JSONObject) -> Any?> = emptyMap()

    /** Engine version the document was generated for (`Generated.ENGINE_VERSION`), or null to skip the check. */
    public val engineVersion: String? get() = null
}

package com.anychart.samplecore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.anychart.compose.AnyChart

/**
 * Gallery: the conformance configs in a real Android app through the Compose entry point.
 * Pick a config, it loads into the same chart surface; tap a point, the event shows in the status line.
 */
class GalleryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The conformance configs are bundled as assets; the pie comes first, as in step 2.
        val names = assets.list("")!!.filter { it.endsWith(".json") }.sortedBy { if (it == "pie.json") "" else it }
        fun config(name: String) = assets.open(name).bufferedReader().use { it.readText() }

        setContent {
            MaterialTheme {
                var selected by remember { mutableStateOf(names.first()) }
                var status by remember { mutableStateOf("loading…") }
                Column(Modifier.fillMaxSize().safeDrawingPadding().padding(horizontal = 12.dp)) {
                    Text("Gallery · every conformance config", style = MaterialTheme.typography.titleMedium)
                    LazyRow(Modifier.fillMaxWidth()) {
                        items(names) { name ->
                            Row(Modifier.padding(end = 6.dp)) {
                                FilterChip(
                                    selected = name == selected,
                                    onClick = { status = "loading…"; selected = name },
                                    label = { Text(name.removeSuffix(".json")) },
                                )
                            }
                        }
                    }
                    Text(status, style = MaterialTheme.typography.bodySmall)
                    AnyChart(
                        config = config(selected),
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        onRendered = { ms -> status = "${selected.removeSuffix(".json")} rendered in $ms ms. Tap a point." },
                        onEvent = { e -> status = "${e.name}: ${e.x} = ${e.value}" },
                        onError = { error -> status = "error: ${error.message}" },
                    )
                }
            }
        }
    }
}

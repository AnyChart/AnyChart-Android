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
 * Gallery: the conformance set as DSL code (Gallery.kt) in a real Android app through the Compose
 * entry point. Pick a chart, it loads into the same chart surface; tap a point, the event shows in
 * the status line.
 */
class GalleryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = Gallery.names

        setContent {
            MaterialTheme {
                // `--es chart <name>` preselects a chart, so a device walk-through can be scripted (device-checks.sh)
                var selected by remember { mutableStateOf(intent.getStringExtra("chart")?.takeIf { it in names } ?: names.first()) }
                var status by remember { mutableStateOf("loading…") }
                Column(Modifier.fillMaxSize().safeDrawingPadding().padding(horizontal = 12.dp)) {
                    Text("Gallery · every conformance chart, as DSL code", style = MaterialTheme.typography.titleMedium)
                    LazyRow(Modifier.fillMaxWidth()) {
                        items(names) { name ->
                            Row(Modifier.padding(end = 6.dp)) {
                                FilterChip(
                                    selected = name == selected,
                                    onClick = { status = "loading…"; selected = name },
                                    label = { Text(name) },
                                )
                            }
                        }
                    }
                    Text(status, style = MaterialTheme.typography.bodySmall)
                    AnyChart(
                        chart = remember(selected) { Gallery.chart(selected) },
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        onRendered = { ms -> status = "$selected rendered in $ms ms. Tap a point." },
                        onEvent = { e -> status = "${e.name}: ${e.x} = ${e.value}" },
                        onError = { error -> status = "error: ${error.message}" },
                    )
                }
            }
        }
    }
}

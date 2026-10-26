package com.anychart.samplecore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.anychart.compose.AnyChart

/** Step 2 of A9-970: one chart in a real Android app, through the Compose entry point. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var status by remember { mutableStateOf("loading…") }
                Column(Modifier.fillMaxSize().padding(12.dp)) {
                    Text("AnyChart-Android PoC · step 2", style = MaterialTheme.typography.titleMedium)
                    Text(status, style = MaterialTheme.typography.bodySmall)
                    AnyChart(
                        config = assets.open("pie.json").bufferedReader().use { it.readText() },
                        modifier = Modifier.fillMaxSize(),
                        onRendered = { ms -> status = "rendered in $ms ms. Tap a slice." },
                        onEvent = { e -> status = "${e.name}: ${e.x} = ${e.value}" },
                        onError = { _, message -> status = "error: $message" },
                    )
                }
            }
        }
    }
}

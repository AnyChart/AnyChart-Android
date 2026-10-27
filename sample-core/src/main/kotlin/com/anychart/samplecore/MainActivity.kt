package com.anychart.samplecore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A9-970 proof of concept, step 3. Each screen exists to kill one class of the 1.x issues:
 * several charts on one screen, charts in Fragments, charts in a list, charts driving each other.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val screens = listOf(
            "Gallery: every conformance config" to GalleryActivity::class.java,
            "Several charts in one Activity" to MultiChartActivity::class.java,
            "Charts in Fragments (ViewPager)" to FragmentsActivity::class.java,
            "Charts in a RecyclerView" to RecyclerActivity::class.java,
            "Coordination: one tap, three charts" to CoordinationActivity::class.java,
            "Compose and View, side by side" to SideBySideActivity::class.java,
        )
        setContent {
            MaterialTheme {
                Column(Modifier.fillMaxSize().safeDrawingPadding().padding(16.dp)) {
                    Text("AnyChart-Android 2.0 sample", style = MaterialTheme.typography.titleLarge)
                    Text("Kotlin DSL over the shared runtime page, AnyChart JS 9.0.0", style = MaterialTheme.typography.bodyMedium)
                    for ((label, activity) in screens) {
                        Button(onClick = { startActivity(Intent(this@MainActivity, activity)) }, modifier = Modifier.fillMaxWidth().padding(top = 12.dp)) {
                            Text(label)
                        }
                    }
                }
            }
        }
    }
}

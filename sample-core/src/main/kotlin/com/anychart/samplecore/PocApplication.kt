package com.anychart.samplecore

import android.annotation.SuppressLint
import android.app.Application
import android.os.SystemClock
import android.util.Log
import android.webkit.WebView
import androidx.webkit.ProfileStore
import androidx.webkit.WebViewFeature
import com.anychart.core.AnyChartView
import java.io.File

/**
 * Step 4 benchmark support. The warm-up mode is read from files/bench-mode (written over adb with
 * run-as), because the Application runs before any Activity can receive an intent extra.
 *
 *   M0  nothing early (baseline)
 *   M1  Profile.warmUpRendererProcess() at app start (androidx.webkit, experimental)
 *   M2  a throwaway WebView constructed at app start (pays Chromium's load early)
 *   M3  an AnyChartView created and warmed up at app start, adopted by the Activity
 */
class PocApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        appStartedAt = SystemClock.uptimeMillis()
        mode = runCatching { File(filesDir, "bench-mode").readText().trim() }.getOrDefault("M0").ifEmpty { "M0" }
        Log.i(TAG, "application start, mode=$mode")
        when (mode) {
            "M1" -> warmUpRenderer()
            "M2" -> { @SuppressLint("WebViewApiAvailability") val w = WebView(this); w.destroy(); Log.i(TAG, "M2 throwaway WebView built in ${SystemClock.uptimeMillis() - appStartedAt} ms") }
            "M3" -> { prewarmed = AnyChartView(this).also { it.warmUp() }; Log.i(TAG, "M3 view warmed up in ${SystemClock.uptimeMillis() - appStartedAt} ms") }
        }
    }

    @SuppressLint("RequiresFeature")
    @androidx.annotation.OptIn(androidx.webkit.Profile.ExperimentalWarmUpRendererProcess::class)
    private fun warmUpRenderer() {
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.WARM_UP_RENDERER_PROCESS)) { Log.i(TAG, "M1 unsupported on this WebView"); return }
        ProfileStore.getInstance().getOrCreateProfile("Default").warmUpRendererProcess()
        Log.i(TAG, "M1 warmUpRendererProcess called at ${SystemClock.uptimeMillis() - appStartedAt} ms")
    }

    companion object {
        const val TAG = "ACBENCH"
        var appStartedAt: Long = 0
        var mode: String = "M0"
        var prewarmed: AnyChartView? = null
    }
}

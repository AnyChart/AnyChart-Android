package com.anychart.core

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout

/** Bare Activity that gives the instrumented tests a window to put views in. */
class HostActivity : Activity() {
    lateinit var root: FrameLayout
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        root = FrameLayout(this)
        setContentView(root)
    }
}

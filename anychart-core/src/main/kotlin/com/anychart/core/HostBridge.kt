package com.anychart.core

import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.webkit.JavaScriptReplyProxy
import androidx.webkit.WebViewAssetLoader
import androidx.webkit.WebViewCompat
import androidx.webkit.WebViewFeature
import org.json.JSONObject

/**
 * Owns the transport between one WebView and the runtime page: serves the page from the AAR's
 * assets over an https origin, receives the page's messages through a WebMessageListener and
 * sends ours back through the reply proxy that listener hands us. Messages sent before the page
 * has spoken are queued and flushed on its first message, which is always `ready`.
 */
internal class HostBridge(
    private val webView: WebView,
    private val onMessage: (String) -> Unit,
    private val callbackLookup: (chartId: String, fn: String) -> ((JSONObject) -> Any?)?,
) {
    private var reply: JavaScriptReplyProxy? = null
    private val queue = ArrayDeque<String>()

    /** Configures the WebView and starts loading the page. Returns the typed reason on failure. */
    fun start(documentStartScript: String?): AnyChartError? {
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            // ponytail: no addJavascriptInterface fallback. Chromium 83 (2020) is the floor; an
            // older System WebView is told so instead of getting a half-working bridge.
            return AnyChartError.UnsupportedWebView("This device's WebView has no WebMessageListener support. Update Android System WebView.")
        }
        with(webView.settings) {
            javaScriptEnabled = true
            domStorageEnabled = true
            allowFileAccess = false
            allowContentAccess = false
        }
        val loader = WebViewAssetLoader.Builder()
            .setDomain(DOMAIN)
            .addPathHandler("/assets/", WebViewAssetLoader.AssetsPathHandler(webView.context))
            .build()
        webView.webViewClient = object : WebViewClient() {
            override fun shouldInterceptRequest(view: WebView, request: WebResourceRequest): WebResourceResponse? =
                loader.shouldInterceptRequest(request.url)

            // The runtime page never navigates. Anything that tries is dropped.
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean = true
        }
        // Only @JavascriptInterface methods are reachable (API 17+), the page is ours and never navigates.
        webView.addJavascriptInterface(CallbackChannel(callbackLookup), CallbackChannel.JS_OBJECT)
        WebViewCompat.addWebMessageListener(webView, HOST_OBJECT, setOf(ORIGIN)) { _, message, _, _, replyProxy ->
            reply = replyProxy
            flush()
            message.data?.let(onMessage)
        }
        if (documentStartScript != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
                WebViewCompat.addDocumentStartJavaScript(webView, documentStartScript, setOf(ORIGIN))
            } else {
                return AnyChartError.License("This device's WebView cannot run document-start scripts; the licence key was not applied.")
            }
        }
        webView.loadUrl(RUNTIME_URL)
        return null
    }

    fun post(message: JSONObject) {
        val text = message.toString()
        val r = reply
        if (r == null) queue.addLast(text) else r.postMessage(text)
    }

    private fun flush() {
        val r = reply ?: return
        while (queue.isNotEmpty()) r.postMessage(queue.removeFirst())
    }

    fun destroy() {
        reply = null
        queue.clear()
    }

    companion object {
        const val DOMAIN = "appassets.androidplatform.net"
        const val ORIGIN = "https://$DOMAIN"
        const val RUNTIME_URL = "$ORIGIN/assets/runtime/index.html"
        const val HOST_OBJECT = "AnyChartHost"
    }
}

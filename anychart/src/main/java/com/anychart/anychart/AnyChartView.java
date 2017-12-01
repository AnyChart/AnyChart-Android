package com.anychart.anychart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.anychart.anychart.application.MyApplication;

import static com.anychart.anychart.JsObject.isRendered;

public final class AnyChartView extends FrameLayout {

    private WebView webView;
    private Chart chart;

    private boolean isRestored;

    protected StringBuilder js = new StringBuilder();

    public AnyChartView(Context context) {
        super(context);

        init();
    }

    public AnyChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AnyChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putString("js", this.js.toString());

        return bundle;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.js.append(bundle.getString("js"));
            state = bundle.getParcelable("superState");
        }
        isRestored = true;

        super.onRestoreInstanceState(state);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_anychart, this, true);

        webView = view.findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                webView.setEnabled(false);
                return true;
            }
        });

        isRendered = false;
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                if (chart != null) {
                    if (!isRendered && !isRestored) {
                        js.append(chart.generateJs());
                    }
                } else {
                    throw new NullPointerException();
                }

                String resultJs = (isRestored)
                        ? js.toString()
                        : js.append("chart.container(\"container\");")
                            .append("chart.draw();")
                            .toString();

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    webView.evaluateJavascript("anychart.onDocumentReady(function () {\n" +
                            resultJs +
                            "});", null);
                } else {
                    webView.loadUrl("javascript:anychart.onDocumentReady(function () {\n" +
                            resultJs +
                            "});");
                }

                isRendered = true;
                
                chart.setOnChangeListener(new Chart.OnChange() {
                    @Override
                    public void onChange(final String jsChange) {
                        js.append(jsChange);
                        webView.post(new Runnable() {
                            @Override
                            public void run() {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                                    webView.evaluateJavascript(jsChange, null);
                                } else {
                                    webView.loadUrl("javascript:" + jsChange);
                                }
                            }
                        });
                    }
                });
            }
        });

        webView.addJavascriptInterface(MyApplication.getInstance().getJavaScriptInterface(), "android");
        webView.loadUrl("file:///android_asset/base.html");
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

}

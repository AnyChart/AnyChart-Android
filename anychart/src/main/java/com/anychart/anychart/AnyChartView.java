package com.anychart.anychart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.anychart.anychart.application.MyApplication;

public final class AnyChartView extends FrameLayout {

    private WebView webView;
    private Chart chart;

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

    @SuppressLint("SetJavaScriptEnabled")
    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_anychart, this, true);

        webView = view.findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                if (chart != null) {
                    js.append(chart.generateJs());
                } else {
                    throw new NullPointerException();
                }

                String resultJs = js.append("chart.container(\"container\");" +
                        "chart.draw();")
                        .toString();

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                    webView.evaluateJavascript("anychart.onDocumentReady(function () {\n" +
                            resultJs +
                            "});", null);
                } else {
                    webView.loadUrl("javascript:anychart.onDocumentReady(function () {\n" +
                            resultJs +
                            "});");
                }

                chart.setOnChangeListener(new Chart.OnChange() {
                    @Override
                    public void onChange(String jsChange) {
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                            webView.evaluateJavascript(jsChange, null);
                        } else {
                            webView.loadUrl("javascript:" + jsChange);
                        }
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

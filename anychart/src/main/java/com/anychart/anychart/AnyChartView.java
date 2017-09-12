package com.anychart.anychart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.anychart.anychart.application.MyApplication;


/**
 * Created by NeverKnowsBest on 08/04/2017.
 */

public class AnyChartView extends FrameLayout {

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
//        webSettings.setUseWideViewPort(true);

        webView.setWebChromeClient(new WebChromeClient() {
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.wtf("AnyChart", consoleMessage.message() + " -- From line "
                        + consoleMessage.lineNumber() + " of "
                        + consoleMessage.sourceId());

                return true;
            }
        });

        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                if (chart != null) {
                    js.append(chart.generateJs());
                    System.out.println(js.toString());
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

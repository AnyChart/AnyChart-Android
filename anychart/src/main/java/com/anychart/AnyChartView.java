package com.anychart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.Chart;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public final class AnyChartView extends FrameLayout {

    public interface JsListener {
        void onJsLineAdd(String jsLine);
    }

    public interface OnRenderedListener {
        void onRendered();
    }

    private JsListener jsListener;
    private OnRenderedListener onRenderedListener;

    private WebView webView;
    private Chart chart;

    private boolean isRestored;
    private boolean isRendered;
    private boolean isDebug;

    private StringBuilder scripts = new StringBuilder();
    private StringBuilder fonts = new StringBuilder();

    protected StringBuilder js = new StringBuilder();

    private String licenceKey = "";
    private View progressBar;
    private String backgroundColor;

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
        bundle.putString("js", js.toString());

        return bundle;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            js.append(bundle.getString("js"));
            state = bundle.getParcelable("superState");
        }
        isRestored = true;

        super.onRestoreInstanceState(state);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_anychart, this, true);

        APIlib.getInstance().setActiveAnyChartView(this);

        if (progressBar != null)
            progressBar.setVisibility(VISIBLE);

        webView = view.findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (isDebug) Log.e("AnyChart", consoleMessage.message());
                webView.setEnabled(false);
                return true;
            }
        });

        isRendered = false;
        JsObject.variableIndex = 0;
        setJsListener(new JsListener() {
            @Override
            public void onJsLineAdd(final String jsLine) {
                webView.post(new Runnable() {
                    @Override
                    public void run() {
                        if (isRestored) {
                            return;
                        }
                        if (isRendered) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                                webView.evaluateJavascript(jsLine, null);
                            } else {
                                webView.loadUrl("javascript:" + jsLine);
                            }
                        } else {
                            js.append(jsLine);
                        }
                    }
                });
            }
        });

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                String resultJs = (isRestored)
                        ? js.toString()
                        : js
                        .append((getContext().getPackageName() != "com.anychart.anychart") ? androidCheck(licenceKey) : "")
                        .append(chart.getJsBase()).append(".container(\"container\");")
                        .toString();

                webView.evaluateJavascript(
                        "anychart.theme({\n" +
                                "     chart: {\n" +
                                "       credits: {\n" +
                                "         logoSrc: 'https://static.anychart.com/logo-for-android.png',\n" +
                                "         text: 'AnyChart Trial Version'\n" +
                                "       }\n" +
                                "     }\n" +
                                "   });" +
                                "anychart.onDocumentReady(function () {\n" +
                                resultJs +
                                "});",
                        new ValueCallback<String>() {
                            @Override
                            public void onReceiveValue(String value) {
                                if (onRenderedListener != null)
                                    onRenderedListener.onRendered();
                                if (progressBar != null)
                                    progressBar.setVisibility(GONE);
                            }
                        });

                isRestored = false;
                isRendered = true;
            }
        });
        webView.addJavascriptInterface(ListenersInterface.getInstance(), "android");
    }

    private void loadHtml() {
        String htmlData = "<html>\n" +
                "<head>\n" +
                "    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <style type=\"text/css\">\n" +
                "        html, body, #container {\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                ((backgroundColor != null) ? "background-color: " + backgroundColor + ";" : "") +
                "        }\n" +
                fonts.toString() +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script src=\"file:///android_asset/anychart-android.min.js\"></script>" +
                scripts.toString() +
                "<link rel=\"stylesheet\" href=\"file:///android_asset/anychart-ui.min.css\"/>\n" +
                "<div id=\"container\"></div>\n" +
                "</body>\n" +
                "</html>";
        
        webView.loadDataWithBaseURL("https://www.google.com", htmlData, "text/html", "UTF-8", null);
    }

    public void addScript(String url) {
        scripts.append("<script src=\"")
                .append(url)
                .append("\"></script>\n");
    }

    public void addCss(String url) {
        scripts.append("<link rel=\"stylesheet\" href=\"")
                .append(url)
                .append("\"/>\n");
    }

    public void addFont(String fontFamily, String url) {
        fonts.append("@font-face {\n")
                .append("font-family: ").append(fontFamily).append(";\n")
                .append("src: url(").append(url).append(");\n")
                .append("}\n");
    }

    public void setLicenceKey(String key) {
        licenceKey = key;
    }

    public void setZoomEnabled(Boolean value) {
        webView.getSettings().setBuiltInZoomControls(value);
        webView.getSettings().setDisplayZoomControls(!value);
    }

    public void clear() {
        webView.loadUrl("about:blank");
        isRendered = false;
        if (progressBar != null) {
            progressBar.setVisibility(VISIBLE);
        }
    }

    public void setChart(Chart chart) {
        isRestored = false;
        this.chart = chart;
        loadHtml();
    }

    public void setProgressBar(View progressBar) {
        this.progressBar = progressBar;
        progressBar.setVisibility(VISIBLE);
    }

    public void setBackgroundColor(String color) {
        this.backgroundColor = color;
        webView.setBackgroundColor(Color.parseColor(color));
    }

    public void setJsListener(JsListener listener) {
        this.jsListener = listener;
    }

    public JsListener getJsListener() {
        return jsListener;
    }

    public OnRenderedListener getOnRenderedListener() {
        return onRenderedListener;
    }

    public void setOnRenderedListener(OnRenderedListener onRenderedListener) {
        this.onRenderedListener = onRenderedListener;
    }

    public void setDebug(boolean value) {
        this.isDebug = value;
    }
    
    private String md5(String s) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
        }
        return "";
    }
    
    private String androidCheck(String l) {
        if (l == null || l.isEmpty() || md5(l) == "0df80e76aeca7dc40e01e876dca3542b") {
            return "var btoa = window.btoa(JSON.stringify({\n" +
                    "    chartType: '" + chart.getJsBase().replaceAll("\\d","") + "',\n" +
                    "    apkName: \"" + getContext().getPackageName() + "\"\n" +
                    "}));" +
                    chart.getJsBase() + ".credits({\n" +
                    "         logoSrc: 'https://static.anychart.com/logo-for-android.png?data=' + btoa,\n" +
                    "         text: 'AnyChart Trial Version'\n" +
                    "       });\n";
        }
        return "";
    }
}

package com.anychart.anychart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
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

import com.anychart.anychart.chart.common.CapturePictureListener;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.lang.ref.WeakReference;

import static com.anychart.anychart.JsObject.isRendered;

public final class AnyChartView extends FrameLayout {

    private WebView webView;
    private Chart chart;

    private boolean isRestored;

    private StringBuilder scripts = new StringBuilder();

    protected StringBuilder js = new StringBuilder();

    private String licenceKey = "";

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
                    webView.evaluateJavascript(
                            "anychart.licenseKey(\"" + licenceKey + "\");" +
                                    "anychart.onDocumentReady(function () {\n" +
                                    resultJs +
                                    "});", null);
                } else {
                    webView.loadUrl(
                            "anychart.licenseKey(\"" + licenceKey + "\");" +
                                    "javascript:anychart.onDocumentReady(function () {\n" +
                                    resultJs +
                                    "});");
                }

//                isRendered = true;

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
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script src=\"file:///android_asset/anychart-bundle.min.js\"></script>" +
                scripts.toString() +
                "<link rel=\"stylesheet\" href=\"file:///android_asset/anychart-ui.min.css\"/>\n" +
                "<div id=\"container\"></div>\n" +
                "</body>\n" +
                "</html>";

        webView.loadDataWithBaseURL("", htmlData, "text/HTML", "UTF-8", "");
    }

    public void addScript(String url) {
        scripts.append("<script src=\"")
                .append(url)
                .append("\"></script>\n");
    }

    public void setLicenceKey(String key) {
        licenceKey = key;
    }

    public void setZoomEnabled(Boolean value) {
        webView.getSettings().setBuiltInZoomControls(value);
        webView.getSettings().setDisplayZoomControls(!value);
    }

    public void setChart(Chart chart) {
        js.setLength(0);
        isRestored = false;
        this.chart = chart;
        loadHtml();
    }

    public void capturePicture(CapturePictureListener listener) {
        new CapturePictureAsyncTask(webView, listener).execute();
    }

    private static class CapturePictureAsyncTask extends AsyncTask<Void, Void, Bitmap> {
        private WeakReference<WebView> webViewReference;
        private CapturePictureListener listener;

        CapturePictureAsyncTask(WebView webView, CapturePictureListener listener) {
            webViewReference = new WeakReference<>(webView);
            this.listener = listener;
        }

        @Override
        protected Bitmap doInBackground(Void... params) {
            WebView webView = webViewReference.get();
            if (webView == null) return null;
            try {
                Bitmap bitmap = Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                webView.draw(canvas);
                return bitmap;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            listener.onDone(bitmap);
        }
    }

}

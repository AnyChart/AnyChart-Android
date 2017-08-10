package com.anychart.anychart.chart.common;

import android.webkit.JavascriptInterface;

/**
 * Created by arseny on 8/7/17.
 */

public class JavaScriptInterface {

    private OnClick listener;

    public interface OnClick {
        void onClick(String x, String value);
    }

//    Context context;

    public JavaScriptInterface() {
//        context = context;
    }

    public void setOnClickListener(OnClick listener) {
        this.listener = listener;
    }

    @JavascriptInterface
    public void onClick(String x, String value) {
        listener.onClick(x, value);
    }

}

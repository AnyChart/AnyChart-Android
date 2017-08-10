package com.anychart.anychart.chart.common;

import android.util.Log;
import android.webkit.JavascriptInterface;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by arseny on 8/7/17.
 */

public class JavaScriptInterface {

    private OnClick listener;

    public interface OnClick {
        void onClick(Event event);
    }

//    Context context;

    public JavaScriptInterface() {
//        context = context;
    }

    public void setOnClickListener(OnClick listener) {
        this.listener = listener;
    }

    @JavascriptInterface
    public void onClick(String json) {
        Event event = new Event();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);

            String x = jsonObject.getString("x");
            String value = jsonObject.getString("value");

            event.setX(x);
            event.setValue(value);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        listener.onClick(event);
    }

}

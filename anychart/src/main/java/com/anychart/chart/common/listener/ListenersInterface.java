package com.anychart.chart.common.listener;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

import java.util.HashMap;
import java.util.Map;

public class ListenersInterface {

    private static volatile ListenersInterface instance = null;

    private ListenersInterface() {}

    public static ListenersInterface getInstance() {
        if (instance == null) {
            synchronized(ListenersInterface.class) {
                if (instance == null) {
                    instance = new ListenersInterface();
                }
            }
        }
        return instance;
    }

    private OnClickListener listener;

    private interface ClickListener {
        void onClick(Event event);
    }

    public abstract static class OnClickListener implements ClickListener {

        private String[] fields;

        public OnClickListener() {

        }

        public OnClickListener(String[] fields) {
            this.fields = fields;
        }

        public String[] getFields() {
            return fields;
        }

    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    @JavascriptInterface
    public void onClick(String sData) {
        if (TextUtils.isEmpty(sData)) {
            listener.onClick(new Event(null));
        } else {
            Map<String, String> data = new HashMap<>();

            for (String item : sData.split(",")) {
                String[] itemSplit = item.split(":");
                String field = itemSplit[0];
                String value = itemSplit[1];
                data.put(field, value);
            }

            listener.onClick(new Event(data));
        }

    }

}

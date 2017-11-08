package com.anychart.anychart.application;

import android.app.Application;

import com.anychart.anychart.chart.common.ListenersInterface;

public class MyApplication extends Application {

    private static ListenersInterface listenersInterface;
    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
        listenersInterface = new ListenersInterface();
    }

    public static MyApplication getInstance() {
        return application;
    }

    public ListenersInterface getJavaScriptInterface() {
        return listenersInterface;
    }
}

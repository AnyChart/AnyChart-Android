package com.anychart.anychart;

import android.app.Application;

import com.anychart.anychart.chart.common.JavaScriptInterface;


/**
 * Created by arseny on 8/7/17.
 */

public class MyApplication extends Application {

    private static JavaScriptInterface javaScriptInterface;
    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
        javaScriptInterface = new JavaScriptInterface();
    }

    public static MyApplication getInstance() {
        return application;
    }

    public JavaScriptInterface getJavaScriptInterface() {
        return javaScriptInterface;
    }
}

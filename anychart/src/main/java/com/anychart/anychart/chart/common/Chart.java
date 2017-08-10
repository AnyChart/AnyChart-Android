package com.anychart.anychart.chart.common;

/**
 * Created by NeverKnowsBest on 08/04/2017.
 */

public abstract class Chart extends JsObject {

    protected OnChange onChangeListener;

    protected boolean isRendered = false;

    public interface OnChange {
        void onChange(String jsChange);
    }

    public void setOnChangeListener(OnChange listener) {
        onChangeListener = listener;

        isRendered = true;
    }

}

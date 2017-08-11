package com.anychart.anychart;

/**
 * Created by NeverKnowsBest on 08/04/2017.
 */

public abstract class Chart extends JsObject {

    protected OnChange onChangeListener;

    protected boolean isRendered = false;

    interface OnChange {
        void onChange(String jsChange);
    }

    void setOnChangeListener(OnChange listener) {
        onChangeListener = listener;

        isRendered = true;
    }

}

package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Zoom settings aggregate.
 */
public class OrdinalZoom extends JsObject {

    protected OrdinalZoom() {

    }

    public static OrdinalZoom instantiate() {
        return new OrdinalZoom("new anychart.core.utils.ordinalZoom()");
    }

    

    public OrdinalZoom(String jsChart) {
        jsBase = "ordinalZoom" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for zoom mode.
     */
    public void continuous() {
        APIlib.getInstance().addJSLine(jsBase + ".continuous();");
    }
    /**
     * Whether to zoom on moving of the scroller or only on mouseUp.
     */
    public com.anychart.core.utils.OrdinalZoom continuous(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".continuous(%s);", enabled));

        return this;
    }
    /**
     * Returns zoom end ratio.
     */
    public void getEndRatio() {
        APIlib.getInstance().addJSLine(jsBase + ".getEndRatio();");
    }
    /**
     * Returns zoom start ratio.
     */
    public void getStartRatio() {
        APIlib.getInstance().addJSLine(jsBase + ".getStartRatio();");
    }
    /**
     * Sets zoom to passed start and end ratios.
     */
    public com.anychart.core.utils.OrdinalZoom setTo(Number startRatio, Number endRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setTo(%s, %s);", startRatio, endRatio));

        return this;
    }
    /**
     * Setups zoom by passed values.
     */
    public com.anychart.core.utils.OrdinalZoom setToPointsCount(Number pointsCount, Boolean fromEnd, com.anychart.scales.Base scale) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setToPointsCount(%s, %s, %s);", pointsCount, fromEnd, (scale != null) ? scale.getJsBase() : null));

        return this;
    }
    /**
     * Setups zoom by passed values.
     */
    public com.anychart.core.utils.OrdinalZoom setToValues(String startValue, String endValue, com.anychart.scales.Base scale) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setToValues(%s, %s, %s);", wrapQuotes(startValue), wrapQuotes(endValue), (scale != null) ? scale.getJsBase() : null));

        return this;
    }

}
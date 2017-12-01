package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * RangeSplineArea Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian#rangeSplineArea} method to get this series.<br/>
{docs:Basic_Charts/Range_Spline_Area_Chart}Learn more about RangeSplineArea series{docs}
 */
public class CartesianSeriesRangeSplineArea extends ContinuousRangeBase {

    public CartesianSeriesRangeSplineArea() {
        js.setLength(0);
        js.append("var cartesianSeriesRangeSplineArea").append(++variableIndex).append(" = anychart.core.cartesian.series.rangeSplineArea();");
        jsBase = "cartesianSeriesRangeSplineArea" + variableIndex;
    }

    protected CartesianSeriesRangeSplineArea(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesRangeSplineArea(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
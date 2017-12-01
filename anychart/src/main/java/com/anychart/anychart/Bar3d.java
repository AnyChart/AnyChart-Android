package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * 3D Bar Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian3d#bar3d} method to get this series.<br/>
{docs:Basic_Charts/3D/Bar_Chart}Learn more about 3D Bar series{docs}
 */
public class Bar3d extends WidthBased {

    public Bar3d() {
        js.setLength(0);
        js.append("var bar3d").append(++variableIndex).append(" = anychart.core.cartesian.series.bar3d();");
        jsBase = "bar3d" + variableIndex;
    }

    protected Bar3d(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Bar3d(StringBuilder js, String jsBase, boolean isChain) {
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
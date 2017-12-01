package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Rectangle class.
 */
public class GraphicsMathRect extends JsObject {

    public GraphicsMathRect() {
        js.setLength(0);
        js.append("var graphicsMathRect").append(++variableIndex).append(" = anychart.graphics.math.rect();");
        jsBase = "graphicsMathRect" + variableIndex;
    }

    protected GraphicsMathRect(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GraphicsMathRect(StringBuilder js, String jsBase, boolean isChain) {
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
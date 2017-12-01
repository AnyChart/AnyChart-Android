package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Define rectangle.
This class is an alias of the {@link anychart.graphics.math.Rect} class.
 */
public class AnychartMathRect extends JsObject {

    public AnychartMathRect() {
        js.setLength(0);
        js.append("var anychartMathRect").append(++variableIndex).append(" = anychart.math.rect();");
        jsBase = "anychartMathRect" + variableIndex;
    }

    protected AnychartMathRect(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AnychartMathRect(StringBuilder js, String jsBase, boolean isChain) {
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
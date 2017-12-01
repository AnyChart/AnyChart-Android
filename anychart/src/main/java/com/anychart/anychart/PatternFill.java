package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Pattern fill class.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics#patternFill}.
 */
public class PatternFill extends Layer {

    public PatternFill() {
        js.setLength(0);
        js.append("var patternFill").append(++variableIndex).append(" = anychart.graphics.vector.patternFill();");
        jsBase = "patternFill" + variableIndex;
    }

    protected PatternFill(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PatternFill(StringBuilder js, String jsBase, boolean isChain) {
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
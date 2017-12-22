package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class implements all the work with consistency states.
invalidate() and markConsistent() are used to change states.
isConsistent() and hasInvalidationState() are used to check states.
 */
public class CoreTimeline extends JsObject {

    public CoreTimeline() {
        js.setLength(0);
        js.append("var coreTimeline").append(++variableIndex).append(" = anychart.core.base();");
        jsBase = "coreTimeline" + variableIndex;
    }

    protected CoreTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CoreTimeline(StringBuilder js, String jsBase, boolean isChain) {
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
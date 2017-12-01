package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Anychart accessibility class.<br/>
{docs:Common_Settings/Accessibility_(508_section)}Learn more about the accessibility (508 Section).{docs}
 */
public class A11y extends CoreBase {

    public A11y() {
        js.setLength(0);
        js.append("var a11y").append(++variableIndex).append(" = anychart.core.utils.a11y();");
        jsBase = "a11y" + variableIndex;
    }

    protected A11y(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected A11y(StringBuilder js, String jsBase, boolean isChain) {
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
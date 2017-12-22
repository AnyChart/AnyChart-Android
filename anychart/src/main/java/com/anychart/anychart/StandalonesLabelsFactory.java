package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The LabelsFactory class contains methods for configuring standalones labels factory.
 */
public class StandalonesLabelsFactory extends UiLabelsFactory {

    public StandalonesLabelsFactory() {
        js.setLength(0);
        js.append("var standalonesLabelsFactory").append(++variableIndex).append(" = anychart.standalones.labelsFactory();");
        jsBase = "standalonesLabelsFactory" + variableIndex;
    }

    protected StandalonesLabelsFactory(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesLabelsFactory(StringBuilder js, String jsBase, boolean isChain) {
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
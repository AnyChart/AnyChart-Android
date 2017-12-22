package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The MarkersFactory class contains methods for configuring standalones markers factory.
 */
public class StandalonesMarkersFactory extends UiMarkersFactory {

    public StandalonesMarkersFactory() {
        js.setLength(0);
        js.append("var standalonesMarkersFactory").append(++variableIndex).append(" = anychart.standalones.markersFactory();");
        jsBase = "standalonesMarkersFactory" + variableIndex;
    }

    protected StandalonesMarkersFactory(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesMarkersFactory(StringBuilder js, String jsBase, boolean isChain) {
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
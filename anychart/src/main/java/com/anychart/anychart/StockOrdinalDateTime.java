package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The StockOrdinalDateTime class contains methods for configuring ordinal date time scale on the Stock.
 */
public class StockOrdinalDateTime extends StockScatterDateTime {

    public StockOrdinalDateTime() {
        js.setLength(0);
        js.append("var stockOrdinalDateTime").append(++variableIndex).append(" = anychart.scales.stockOrdinalDateTime();");
        jsBase = "stockOrdinalDateTime" + variableIndex;
    }

    protected StockOrdinalDateTime(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockOrdinalDateTime(StringBuilder js, String jsBase, boolean isChain) {
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
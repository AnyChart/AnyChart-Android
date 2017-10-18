package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TableselectableRowProxy extends JsObject {

    public TableselectableRowProxy() {

    }

    protected TableselectableRowProxy(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TableselectableRowProxy(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String field;

    public void get(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".get(%s);", field));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s)", field));
                js.setLength(0);
            }
        }
    }

    private Double column;

    public void getColumn(Double column) {
        if (jsBase == null) {
            this.column = column;
        } else {
            this.column = column;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getColumn(%f);", column));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getColumn(%f)", column));
                js.setLength(0);
            }
        }
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %f,", column);
        }
        return "";
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append(generateJScolumn());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
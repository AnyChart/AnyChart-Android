package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Iterator extends JsObject {

    public Iterator() {

    }

    protected Iterator(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Iterator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String name;

    public Iterator setMeta(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".meta(%s)", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".meta(%s)", name));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;

    public void setSelect(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".select(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f)", index));
                js.setLength(0);
            }
        }
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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
            js.append(generateJSname());
            js.append(generateJSindex());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
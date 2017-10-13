package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Traverser extends JsObject {

    public Traverser() {

    }

    protected Traverser(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Traverser(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private TreeDataItem getCurrent;

    public TreeDataItem getCurrent() {
        if (getCurrent == null)
            getCurrent = new TreeDataItem(jsBase + ".current()");

        return getCurrent;
    }

    private String key;

    public void setMeta(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".meta(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s)", key));
                js.setLength(0);
            }
        }
    }

    private String key1;

    public Traverser setSet(String key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", key1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", key1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetCurrent() {
        if (getCurrent != null) {
            return getCurrent.generateJs();
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", key1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCurrent());

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
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
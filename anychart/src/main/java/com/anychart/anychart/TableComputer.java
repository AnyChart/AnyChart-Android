package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TableComputer extends JsObject {

    public TableComputer() {

    }

    protected TableComputer(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TableComputer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String name;
    private String uid;

    public void addOutputField(String name, String uid) {
        if (jsBase == null) {
            this.name = name;
            this.uid = uid;
        } else {
            this.name = name;
            this.uid = uid;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addOutputField(%s, %s);", name, uid));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addOutputField(%s, %s)", name, uid));
                js.setLength(0);
            }
        }
    }

    private String name1;

    public void getFieldIndex(String name1) {
        if (jsBase == null) {
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.name1 = name1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getFieldIndex(%s);", name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getFieldIndex(%s)", name1));
                js.setLength(0);
            }
        }
    }

    private String setContext;

    public void setSetContext(String setContext) {
        if (jsBase == null) {
            this.setContext = setContext;
        } else {
            this.setContext = setContext;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".setContext(%s);", setContext));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setContext(%s)", setContext));
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

    private String generateJSuid() {
        if (uid != null) {
            return String.format(Locale.US, "uid: %s,", uid);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJSsetContext() {
        if (setContext != null) {
            return String.format(Locale.US, "setContext: %s,", setContext);
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
            js.append(generateJSuid());
            js.append(generateJSname1());
            js.append(generateJSsetContext());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class DistinctColors extends CoreBase {

    public DistinctColors() {

    }

    protected DistinctColors(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DistinctColors(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double index;
    private Fill color;

    public DistinctColors setItemAt(Double index, Fill color) {
        if (jsBase == null) {
            this.index = index;
            this.color = color;
        } else {
            this.index = index;
            this.color = color;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index, (color != null) ? color.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index, (color != null) ? color.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill[] items;
    private Fill items1;
    private Fill var_args;

    public DistinctColors setItems(Fill[] items, Fill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items = items;
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public DistinctColors setItems(Fill items1, Fill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items1 = items1;
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", (items1 != null) ? items1.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", (items1 != null) ? items1.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", (color != null) ? color.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items));
        }
        return "";
    }

    private String generateJSitems1() {
        if (items1 != null) {
            return String.format(Locale.US, "items: %s,", (items1 != null) ? items1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args != null) ? var_args.generateJs() : "null");
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
            js.append(generateJSindex());
            js.append(generateJScolor());
            js.append(generateJSitems());
            js.append(generateJSitems1());
            js.append(generateJSvar_args());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
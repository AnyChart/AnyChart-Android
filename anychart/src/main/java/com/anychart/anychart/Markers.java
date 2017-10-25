package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Markers extends CoreBase {

    public Markers() {

    }

    protected Markers(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Markers(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double index;
    private String type;

    public Markers setItemAt(Double index, String type) {
        if (jsBase == null) {
            this.index = index;
            this.type = type;
        } else {
            this.index = index;
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index, wrapQuotes(type)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index, wrapQuotes(type)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] items;
    private String items1;
    private String var_args;

    public Markers setItems(String[] items, String var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items = items;
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items), wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Markers setItems(String items1, String var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items1 = items1;
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items1), wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items1), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJStype());
////        
//            js.append(generateJSitems());
////        
//            js.append(generateJSitems1());
////        
//            js.append(generateJSvar_args());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
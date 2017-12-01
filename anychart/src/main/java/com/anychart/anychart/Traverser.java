package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Tree data traverser.
 */
public class Traverser extends JsObject {

    public Traverser() {
        js.setLength(0);
        js.append("var traverser").append(++variableIndex).append(" = anychart.data.traverser();");
        jsBase = "traverser" + variableIndex;
    }

    protected Traverser(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Traverser(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TreeDataItem getCurrent;

    /**
     * Gets current tree data item.
     */
    public TreeDataItem getCurrent() {
        if (getCurrent == null)
            getCurrent = new TreeDataItem(jsBase + ".current()");

        return getCurrent;
    }

    private String key;

    /**
     * Setter for a meta value.
     */
    public void setMeta(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".meta(%s);", wrapQuotes(key)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));
                js.setLength(0);
            }
        }
    }

    private String key1;

    /**
     * Sets current item's value by key specified.
     */
    public Traverser setSet(String key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".set(%s)", wrapQuotes(key1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", wrapQuotes(key1)));
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
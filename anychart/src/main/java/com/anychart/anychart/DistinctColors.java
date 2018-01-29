package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Color palette class.
 */
public class DistinctColors extends CoreBase {

    public DistinctColors() {
        js.setLength(0);
        js.append("var distinctColors").append(++variableIndex).append(" = anychart.palettes.distinctColors();");
        jsBase = "distinctColors" + variableIndex;
    }

    protected DistinctColors(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DistinctColors(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number index;
    private Fill color;

    /**
     * Setter for color palette colors from list by index.
     */
    public DistinctColors setItemAt(Number index, Fill color) {
        if (jsBase == null) {
            this.index = index;
            this.color = color;
        } else {
            this.index = index;
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemAt(%s, %s)", index, ((color != null) ? color.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, ((color != null) ? color.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill[] items;
    private Fill items1;
    private Fill var_args;

    /**
     * Setter for color palette colors list.
     */
    public DistinctColors setItems(Fill[] items, Fill var_args) {
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
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for color palette colors list.
     */
    public DistinctColors setItems(Fill items1, Fill var_args) {
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
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
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
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Radar class contains methods for configuring standalones Radar grids.
 */
public class StandalonesGridsRadar extends CoreGridsRadar {

    public StandalonesGridsRadar() {
        js.setLength(0);
        js.append("var standalonesGridsRadar").append(++variableIndex).append(" = anychart.standalones.grids.radar();");
        jsBase = "standalonesGridsRadar" + variableIndex;
    }

    protected StandalonesGridsRadar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesGridsRadar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String innerRadius;
    private Number innerRadius1;
    private List<CoreGridsRadar> setInnerRadius = new ArrayList<>();

    /**
     * Setter for the inner radius.
     */
    public CoreGridsRadar setInnerRadius(String innerRadius) {
        if (jsBase == null) {
            this.innerRadius = null;
            this.innerRadius1 = null;
            
            this.innerRadius = innerRadius;
        } else {
            this.innerRadius = innerRadius;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setInnerRadius" + ++variableIndex + " = " + jsBase + ".innerRadius(%s);", wrapQuotes(innerRadius)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".innerRadius(%s);", wrapQuotes(innerRadius)));
                js.setLength(0);
            }
        }
        CoreGridsRadar item = new CoreGridsRadar("setInnerRadius" + variableIndex);
        setInnerRadius.add(item);
        return item;
    }
    private String generateJSsetInnerRadius() {
        if (!setInnerRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsRadar item : setInnerRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreGridsRadar> setInnerRadius1 = new ArrayList<>();

    /**
     * Setter for the inner radius.
     */
    public CoreGridsRadar setInnerRadius(Number innerRadius1) {
        if (jsBase == null) {
            this.innerRadius = null;
            this.innerRadius1 = null;
            
            this.innerRadius1 = innerRadius1;
        } else {
            this.innerRadius1 = innerRadius1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setInnerRadius1" + ++variableIndex + " = " + jsBase + ".innerRadius(%s);", innerRadius1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".innerRadius(%s);", innerRadius1));
                js.setLength(0);
            }
        }
        CoreGridsRadar item = new CoreGridsRadar("setInnerRadius1" + variableIndex);
        setInnerRadius1.add(item);
        return item;
    }
    private String generateJSsetInnerRadius1() {
        if (!setInnerRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsRadar item : setInnerRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Layout layout;
    private String layout1;

    /**
     * Setter for the grid layout.
     */
    public StandalonesGridsRadar setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", ((layout != null) ? layout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the grid layout.
     */
    public StandalonesGridsRadar setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", wrapQuotes(layout1)));
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

        js.append(generateJSsetInnerRadius());
        js.append(generateJSsetInnerRadius1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
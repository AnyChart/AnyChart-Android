package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Rendering functions context.
 */
public class RenderingsettingsContext extends JsObject {

    public RenderingsettingsContext() {
        js.setLength(0);
        js.append("var renderingsettingsContext").append(++variableIndex).append(" = anychart.core.series.RenderingSettings.context();");
        jsBase = "renderingsettingsContext" + variableIndex;
    }

    protected RenderingsettingsContext(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RenderingsettingsContext(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private PointState state;
    private String state1;
    private Number baseZIndex;
    private String restrictShapes;

    /**
     * Generates a shapes group.
     */
    public void getShapesGroup(PointState state, Number baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = null;
            this.state1 = null;
            
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getShapesGroup(%s, %s, %s);", ((state != null) ? state.generateJs() : "null"), baseZIndex, wrapQuotes(restrictShapes)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %s, %s);", ((state != null) ? state.generateJs() : "null"), baseZIndex, wrapQuotes(restrictShapes)));
                js.setLength(0);
            }
        }
    }


    /**
     * Generates a shapes group.
     */
    public void getShapesGroup(String state1, Number baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = null;
            this.state1 = null;
            
            this.state1 = state1;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state1 = state1;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getShapesGroup(%s, %s, %s);", wrapQuotes(state1), baseZIndex, wrapQuotes(restrictShapes)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %s, %s);", wrapQuotes(state1), baseZIndex, wrapQuotes(restrictShapes)));
                js.setLength(0);
            }
        }
    }

    private String key;

    /**
     * Fetch statistics value by its key or a whole object if no key provided.
     */
    public void getStat(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getStat(%s);", wrapQuotes(key)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
                js.setLength(0);
            }
        }
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
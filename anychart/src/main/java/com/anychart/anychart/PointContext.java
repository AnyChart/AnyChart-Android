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
public class PointContext extends RenderingsettingsContext {

    public PointContext() {
        js.setLength(0);
        js.append("var pointContext").append(++variableIndex).append(" = anychart.core.series.RenderingSettings.pointContext();");
        jsBase = "pointContext" + variableIndex;
    }

    protected PointContext(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PointContext(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String name;

    /**
     * Returns data value by name.
     */
    public void getDataValue(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getDataValue(%s);", wrapQuotes(name)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getDataValue(%s);", wrapQuotes(name)));
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
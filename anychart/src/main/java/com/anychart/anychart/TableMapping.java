package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Table mapping constructor.
 */
public class TableMapping extends CoreBase {

    public TableMapping() {
        js.setLength(0);
        js.append("var tableMapping").append(++variableIndex).append(" = anychart.data.tableMapping();");
        jsBase = "tableMapping" + variableIndex;
    }

    protected TableMapping(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableMapping(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String name;
    private Double column;
    private AggregationType type;
    private String type1;
    private Double weightsColumn;

    /**
     * Adds a field to the mapping.
     */
    public TableMapping addField(AggregationType type, String name, Double column, Double weightsColumn) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
            this.name = name;
            this.column = column;
            this.weightsColumn = weightsColumn;
        } else {
            this.type = type;
            this.name = name;
            this.column = column;
            this.weightsColumn = weightsColumn;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addField(%s, %s, %f, %f)", ((type != null) ? type.generateJs() : "null"), wrapQuotes(name), column, weightsColumn));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addField(%s, %s, %f, %f)", ((type != null) ? type.generateJs() : "null"), wrapQuotes(name), column, weightsColumn));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a field to the mapping.
     */
    public TableMapping addField(String type1, String name, Double column, Double weightsColumn) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.name = name;
            this.column = column;
            this.weightsColumn = weightsColumn;
        } else {
            this.type1 = type1;
            this.name = name;
            this.column = column;
            this.weightsColumn = weightsColumn;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addField(%s, %s, %f, %f)", wrapQuotes(type1), wrapQuotes(name), column, weightsColumn));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addField(%s, %s, %f, %f)", wrapQuotes(type1), wrapQuotes(name), column, weightsColumn));
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
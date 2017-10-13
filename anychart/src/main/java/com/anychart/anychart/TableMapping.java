package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TableMapping extends CoreBase {

    public TableMapping() {

    }

    protected TableMapping(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TableMapping(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String name;
    private Double column;
    private AggregationType type;
    private Double weightsColumn;

    public TableMapping addField(String name, Double column, AggregationType type, Double weightsColumn) {
        if (jsBase == null) {
            this.name = name;
            this.column = column;
            this.type = type;
            this.weightsColumn = weightsColumn;
        } else {
            this.name = name;
            this.column = column;
            this.type = type;
            this.weightsColumn = weightsColumn;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addField(%s, %f, %s, %f)", name, column, (type != null) ? type.generateJs() : "null", weightsColumn));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addField(%s, %f, %s, %f)", name, column, (type != null) ? type.generateJs() : "null", weightsColumn));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %f,", column);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJSweightsColumn() {
        if (weightsColumn != null) {
            return String.format(Locale.US, "weightsColumn: %f,", weightsColumn);
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
            js.append(generateJScolumn());
            js.append(generateJStype());
            js.append(generateJSweightsColumn());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
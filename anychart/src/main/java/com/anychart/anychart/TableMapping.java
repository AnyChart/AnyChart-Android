package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
    private String type1;
    private Double weightsColumn;

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
//            js.append(generateJSname());
////        
//            js.append(generateJScolumn());
////        
//            js.append(generateJStype());
////        
//            js.append(generateJStype1());
////        
//            js.append(generateJSweightsColumn());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
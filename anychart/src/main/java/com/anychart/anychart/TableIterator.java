package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Table iterator class. Assumes iterator (if any) to return not fewer keys than the table has.
 */
public class TableIterator extends JsObject {

    public TableIterator() {
        js.setLength(0);
        js.append("var tableIterator").append(++variableIndex).append(" = anychart.data.tableIterator();");
        jsBase = "tableIterator" + variableIndex;
    }

    protected TableIterator(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableIterator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String field;

    /**
     * Returns current field values.
     */
    public void get(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".get(%s);", wrapQuotes(field)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
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
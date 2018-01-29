package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Row proxy for computational functions.
 */
public class TablecomputerRowProxy extends TableselectableRowProxy {

    public TablecomputerRowProxy() {
        js.setLength(0);
        js.append("var tablecomputerRowProxy").append(++variableIndex).append(" = anychart.data.TableComputer.rowProxy();");
        jsBase = "tablecomputerRowProxy" + variableIndex;
    }

    protected TablecomputerRowProxy(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TablecomputerRowProxy(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String name;

    /**
     * Sets field value by field name.
     */
    public void setSet(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".set(%s);", wrapQuotes(name)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", wrapQuotes(name)));
                js.setLength(0);
            }
        }
    }

    private Number index;

    /**
     * Sets value by column.
     */
    public void setSetColumn(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".setColumn(%s);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumn(%s);", index));
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
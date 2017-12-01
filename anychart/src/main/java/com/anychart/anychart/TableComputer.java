package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock table computer constructor.
 */
public class TableComputer extends JsObject {

    public TableComputer() {
        js.setLength(0);
        js.append("var tableComputer").append(++variableIndex).append(" = anychart.data.tableComputer();");
        jsBase = "tableComputer" + variableIndex;
    }

    protected TableComputer(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableComputer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String name;
    private String uid;

    /**
     * Adds output field to the computer with the given name.
     */
    public void addOutputField(String name, String uid) {
        if (jsBase == null) {
            this.name = name;
            this.uid = uid;
        } else {
            this.name = name;
            this.uid = uid;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addOutputField(%s, %s);", wrapQuotes(name), wrapQuotes(uid)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addOutputField(%s, %s);", wrapQuotes(name), wrapQuotes(uid)));
                js.setLength(0);
            }
        }
    }

    private String name1;

    /**
     * Returns field index by the field name.
     */
    public void getFieldIndex(String name1) {
        if (jsBase == null) {
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.name1 = name1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getFieldIndex(%s);", wrapQuotes(name1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getFieldIndex(%s);", wrapQuotes(name1)));
                js.setLength(0);
            }
        }
    }

    private String setContext;

    /**
     * Sets computer context. If not set - defaults to Window.
     */
    public void setSetContext(String setContext) {
        if (jsBase == null) {
            this.setContext = setContext;
        } else {
            this.setContext = setContext;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".setContext(%s);", wrapQuotes(setContext)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setContext(%s);", wrapQuotes(setContext)));
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
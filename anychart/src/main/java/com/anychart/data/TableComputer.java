package com.anychart.data;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Stock table computer constructor.
 */
public class TableComputer extends JsObject {

    protected TableComputer() {

    }

    public static TableComputer instantiate() {
        return new TableComputer("new anychart.data.tableComputer()");
    }

    

    public TableComputer(String jsChart) {
        jsBase = "tableComputer" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds output field to the computer with the given name.
     */
    public void addOutputField(String name, String uid) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addOutputField(%s, %s);", wrapQuotes(name), wrapQuotes(uid)));
    }
    /**
     * Returns field index by the field name.
     */
    public void getFieldIndex(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getFieldIndex(%s);", wrapQuotes(name)));
    }
    /**
     * Sets function that is executed for each row of the table storage.
     */
    public void setCalculationFunction(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setCalculationFunction(%s);", wrapQuotes(value)));
    }
    /**
     * Sets computer context. If not set - defaults to Window.
     */
    public void setContext(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setContext(%s);", wrapQuotes(value)));
    }
    /**
     * Sets function that will be executed on each calculation start.
     */
    public void setStartFunction(String function) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setStartFunction(%s);", wrapQuotes(function)));
    }

}
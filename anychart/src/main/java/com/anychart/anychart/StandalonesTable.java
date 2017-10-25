package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class StandalonesTable extends UiTable {

    public StandalonesTable() {

    }

    protected StandalonesTable(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StandalonesTable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String csvSettings;
    private String filename;

    public void saveAsCsv(String csvSettings, String filename) {
        if (jsBase == null) {
            this.csvSettings = csvSettings;
            this.filename = filename;
        } else {
            this.csvSettings = csvSettings;
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s);", wrapQuotes(csvSettings), wrapQuotes(filename)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s)", wrapQuotes(csvSettings), wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private String filename1;

    public void saveAsXlsx(String filename1) {
        if (jsBase == null) {
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s);", wrapQuotes(filename1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s)", wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }

    private String csvSettings1;

    public void toCsv(String csvSettings1) {
        if (jsBase == null) {
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s);", wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s)", wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
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
//            js.append(generateJScsvSettings());
////        
//            js.append(generateJSfilename());
////        
//            js.append(generateJSfilename1());
////        
//            js.append(generateJScsvSettings1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
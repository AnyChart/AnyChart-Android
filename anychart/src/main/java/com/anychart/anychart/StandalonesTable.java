package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

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

    public void setSaveAsCsv(String csvSettings, String filename) {
        if (jsBase == null) {
            this.csvSettings = csvSettings;
            this.filename = filename;
        } else {
            this.csvSettings = csvSettings;
            this.filename = filename;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s);", csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s)", csvSettings, filename));
                js.setLength(0);
            }
        }
    }

    private String filename1;

    public void setSaveAsXlsx(String filename1) {
        if (jsBase == null) {
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.filename1 = filename1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s);", filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s)", filename1));
                js.setLength(0);
            }
        }
    }

    private String csvSettings1;

    public void setToCsv(String csvSettings1) {
        if (jsBase == null) {
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.csvSettings1 = csvSettings1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s);", csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s)", csvSettings1));
                js.setLength(0);
            }
        }
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: %s,", filename);
        }
        return "";
    }

    private String generateJSfilename1() {
        if (filename1 != null) {
            return String.format(Locale.US, "filename: %s,", filename1);
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings1);
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
            js.append(generateJScsvSettings());
            js.append(generateJSfilename());
            js.append(generateJSfilename1());
            js.append(generateJScsvSettings1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
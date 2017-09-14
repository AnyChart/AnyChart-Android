package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RowProxy extends JsObject {

    
    private String field;

    public void setGet(String field) {
        this.field = field;
    }

    private Double column;

    public void setGetcolumn(Double column) {
        this.column = column;
    }

    private String name;

    public void setSet(String name) {
        this.name = name;
    }

    private Double index;

    public void setSetcolumn(Double index) {
        this.index = index;
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: \"%s\",", field);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %f,", column);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: \"%s\",", name);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSfield());
        js.append(generateJScolumn());
        js.append(generateJSname());
        js.append(generateJSindex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
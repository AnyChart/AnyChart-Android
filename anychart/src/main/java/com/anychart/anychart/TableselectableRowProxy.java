package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TableselectableRowProxy extends JsObject {

    
    private String field;

    public void setGet(String field) {
        this.field = field;
    }

    private Double column;

    public void setGetcolumn(Double column) {
        this.column = column;
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %f,", column);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSfield());
        js.append(generateJScolumn());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
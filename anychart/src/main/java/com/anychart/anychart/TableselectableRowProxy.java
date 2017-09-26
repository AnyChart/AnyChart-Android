package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TableselectableRowProxy extends JsObject {

    private String jsBase;

    public TableselectableRowProxy() {

    }

    protected TableselectableRowProxy(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String field;

    public void setGet(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;

            js.append(String.format(Locale.US, jsBase + ".get(%s);", field));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", field));
                js.setLength(0);
            }
        }
    }

    private Double column;

    public void setGetcolumn(Double column) {
        if (jsBase == null) {
            this.column = column;
        } else {
            this.column = column;

            js.append(String.format(Locale.US, jsBase + ".getColumn(%f);", column));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getColumn(%f);", column));
                js.setLength(0);
            }
        }
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append(generateJScolumn());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
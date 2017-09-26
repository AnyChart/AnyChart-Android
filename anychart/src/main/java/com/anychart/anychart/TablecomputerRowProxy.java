package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TablecomputerRowProxy extends JsObject {

    private String jsBase;

    public TablecomputerRowProxy() {

    }

    protected TablecomputerRowProxy(String jsBase) {
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

    private String name;

    public void setSet(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".set(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", name));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setSetcolumn(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".setColumn(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumn(%f);", index));
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

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append(generateJScolumn());
            js.append(generateJSname());
            js.append(generateJSindex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
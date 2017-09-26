package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TableIterator extends JsObject {

    private String jsBase;

    public TableIterator() {

    }

    protected TableIterator(String jsBase) {
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

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
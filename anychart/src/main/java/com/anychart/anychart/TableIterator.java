package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TableIterator extends JsObject {

    
    private String field;

    public void setGet(String field) {
        this.field = field;
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSfield());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
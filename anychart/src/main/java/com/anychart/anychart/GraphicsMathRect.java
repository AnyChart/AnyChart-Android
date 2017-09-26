package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class GraphicsMathRect extends JsObject {

    private String jsBase;

    public GraphicsMathRect() {

    }

    protected GraphicsMathRect(String jsBase) {
        this.jsBase = jsBase;
    }

    

    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
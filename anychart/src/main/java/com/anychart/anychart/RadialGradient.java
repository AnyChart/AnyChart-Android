package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class RadialGradient extends JsObject {

    private String jsBase;

    public RadialGradient() {

    }

    protected RadialGradient(String jsBase) {
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
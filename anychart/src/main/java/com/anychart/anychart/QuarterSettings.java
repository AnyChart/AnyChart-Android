package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class QuarterSettings extends JsObject {

    

    @Override
    protected String generateJs() {
        js.append("{");

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
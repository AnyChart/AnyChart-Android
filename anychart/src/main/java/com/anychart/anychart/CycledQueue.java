package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class CycledQueue extends JsObject {

    
    private Double newLengthLimit;

    public void setClear(Double newLengthLimit) {
        this.newLengthLimit = newLengthLimit;
    }

    private Double index;

    public void setGet(Double index) {
        this.index = index;
    }

    private String generateJSnewLengthLimit() {
        if (newLengthLimit != null) {
            return String.format(Locale.US, "newLengthLimit: %f,", newLengthLimit);
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
        js.append(generateJSnewLengthLimit());
        js.append(generateJSindex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
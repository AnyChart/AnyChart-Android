package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class CycledQueue extends JsObject {

    private String jsBase;

    public CycledQueue() {

    }

    protected CycledQueue(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double newLengthLimit;

    public void setClear(Double newLengthLimit) {
        if (jsBase == null) {
            this.newLengthLimit = newLengthLimit;
        } else {
            this.newLengthLimit = newLengthLimit;

            js.append(String.format(Locale.US, jsBase + ".clear(%f);", newLengthLimit));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clear(%f);", newLengthLimit));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setGet(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".get(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%f);", index));
                js.setLength(0);
            }
        }
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSnewLengthLimit());
            js.append(generateJSindex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
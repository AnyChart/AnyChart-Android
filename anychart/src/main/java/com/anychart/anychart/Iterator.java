package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Iterator extends JsObject {

    
    private String fieldName;

    public void setGet(String fieldName) {
        this.fieldName = fieldName;
    }

    private String name;

    public void setMeta(String name) {
        this.name = name;
    }

    private String name1;
    private Double index;

    public void setSelect(Double index) {
        this.index = index;
    }

    private String generateJSfieldName() {
        if (fieldName != null) {
            return String.format(Locale.US, "fieldName: \"%s\",", fieldName);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: \"%s\",", name);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: \"%s\",", name1);
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
        js.append(generateJSfieldName());
        js.append(generateJSname());
        js.append(generateJSname1());
        js.append(generateJSindex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
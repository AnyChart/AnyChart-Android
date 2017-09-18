package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class SettingsWithMargin extends JsObject {

    
    private Double[] margin;
    private String[] margin1;

    public void setMargin(Double[] margin) {
        this.margin = null;
        this.margin1 = null;
        
        this.margin = margin;
    }


    public void setMargin(String[] margin1) {
        this.margin = null;
        this.margin1 = null;
        
        this.margin1 = margin1;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value6 = value6;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value7 = value7;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
    }

    private String generateJSmargin() {
        if (margin != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin));
        }
        return "";
    }

    private String generateJSmargin1() {
        if (margin1 != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin1));
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSmargin());
        js.append(generateJSmargin1());
        js.append(generateJSvalue());
        js.append(generateJSvalue1());
        js.append(generateJSvalue2());
        js.append(generateJSvalue3());
        js.append(generateJSvalue4());
        js.append(generateJSvalue5());
        js.append(generateJSvalue6());
        js.append(generateJSvalue7());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
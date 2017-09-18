package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Traverser extends JsObject {

    
    private String key;

    public void setGet(String key) {
        this.key = key;
    }

    private String key1;

    public void setMeta(String key1) {
        this.key = null;
        this.key1 = null;
        
        this.key1 = key1;
    }

    private String key2;
    private String key3;

    public void setSet(String key3) {
        this.key = null;
        this.key1 = null;
        this.key2 = null;
        this.key3 = null;
        
        this.key3 = key3;
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", key1);
        }
        return "";
    }

    private String generateJSkey2() {
        if (key2 != null) {
            return String.format(Locale.US, "key: %s,", key2);
        }
        return "";
    }

    private String generateJSkey3() {
        if (key3 != null) {
            return String.format(Locale.US, "key: %s,", key3);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSkey());
        js.append(generateJSkey1());
        js.append(generateJSkey2());
        js.append(generateJSkey3());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
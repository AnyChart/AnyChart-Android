package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class FormatContext extends JsObject {

    
    private String name;

    public void setGetmeta(String name) {
        this.name = name;
    }

    private String key;

    public void setGetstat(String key) {
        this.key = key;
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSname());
        js.append(generateJSkey());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
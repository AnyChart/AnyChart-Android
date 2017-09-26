package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class FormatContext extends JsObject {

    private String jsBase;

    public FormatContext() {

    }

    protected FormatContext(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String name;

    public void setGetmeta(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".getMeta(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getMeta(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSname());
            js.append(generateJSkey());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
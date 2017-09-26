package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Iterator extends JsObject {

    private String jsBase;

    public Iterator() {

    }

    protected Iterator(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String fieldName;

    public void setGet(String fieldName) {
        if (jsBase == null) {
            this.fieldName = fieldName;
        } else {
            this.fieldName = fieldName;

            js.append(String.format(Locale.US, jsBase + ".get(%s);", fieldName));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", fieldName));
                js.setLength(0);
            }
        }
    }

    private String name;

    public void setMeta(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".meta(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String name1;
    private Double index;

    public void setSelect(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".select(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f);", index));
                js.setLength(0);
            }
        }
    }

    private String generateJSfieldName() {
        if (fieldName != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
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
            js.append(generateJSfieldName());
            js.append(generateJSname());
            js.append(generateJSname1());
            js.append(generateJSindex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
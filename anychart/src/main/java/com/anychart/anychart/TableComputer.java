package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TableComputer extends JsObject {

    
    private String name;
    private String uid;

    public void setAddoutputfield(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    private String name1;

    public void setGetfieldindex(String name1) {
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSuid() {
        if (uid != null) {
            return String.format(Locale.US, "uid: %s,", uid);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSname());
        js.append(generateJSuid());
        js.append(generateJSname1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
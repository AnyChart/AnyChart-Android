package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TableComputer extends JsObject {

    private String jsBase;

    public TableComputer() {

    }

    protected TableComputer(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String name;
    private String uid;

    public void setAddoutputfield(String name, String uid) {
        if (jsBase == null) {
            this.name = name;
            this.uid = uid;
        } else {
            this.name = name;
            this.uid = uid;

            js.append(String.format(Locale.US, jsBase + ".addOutputField(%s, %s);", name, uid));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addOutputField(%s, %s);", name, uid));
                js.setLength(0);
            }
        }
    }

    private String name1;

    public void setGetfieldindex(String name1) {
        if (jsBase == null) {
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".getFieldIndex(%s);", name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getFieldIndex(%s);", name1));
                js.setLength(0);
            }
        }
    }

    private String setContext;

    public void setSetcontext(String setContext) {
        if (jsBase == null) {
            this.setContext = setContext;
        } else {
            this.setContext = setContext;

            js.append(String.format(Locale.US, jsBase + ".setContext(%s);", setContext));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setContext(%s);", setContext));
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

    private String generateJSsetContext() {
        if (setContext != null) {
            return String.format(Locale.US, "setContext: %s,", setContext);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSname());
            js.append(generateJSuid());
            js.append(generateJSname1());
            js.append(generateJSsetContext());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
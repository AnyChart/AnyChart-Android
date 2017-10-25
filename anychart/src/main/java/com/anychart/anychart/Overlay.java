package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Overlay extends CoreBase {

    public Overlay() {

    }

    protected Overlay(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Overlay(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String className;

    public Overlay setClassName(String className) {
        if (jsBase == null) {
            this.className = className;
        } else {
            this.className = className;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".className(%s)", wrapQuotes(className)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".className(%s)", wrapQuotes(className)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    public Overlay setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element getGetElement;

    public Element getGetElement() {
        if (getGetElement == null)
            getGetElement = new Element(jsBase + ".getElement()");

        return getGetElement;
    }

    private String id;

    public Overlay setId(String id) {
        if (jsBase == null) {
            this.id = id;
        } else {
            this.id = id;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSElement getGetElement() {
//        if (Element getGetElement != null) {
//            return Element getGetElement.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetGetElement() {
        if (getGetElement != null) {
            return getGetElement.generateJs();
            //return String.format(Locale.US, "getGetElement: %s,", ((getGetElement != null) ? getGetElement.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetElement());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSclassName());
////        
//            js.append(generateJSenabled());
////        
//            js.append(generateJSid());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
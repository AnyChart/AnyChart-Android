package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class UnmanagedLayer extends Element {

    public UnmanagedLayer() {

    }

    protected UnmanagedLayer(String jsBase) {
        this.jsBase = jsBase;
    }

    protected UnmanagedLayer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element getContent;

    public Element getContent() {
        if (getContent == null)
            getContent = new Element(jsBase + ".content()");

        return getContent;
    }

    private String content;
    private Element content1;

    public UnmanagedLayer setContent(String content) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            
            this.content = content;
        } else {
            this.content = content;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".content(%s)", wrapQuotes(content)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".content(%s)", wrapQuotes(content)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UnmanagedLayer setContent(Element content1) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            
            this.content1 = content1;
        } else {
            this.content1 = content1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".content(%s)", ((content1 != null) ? content1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".content(%s)", ((content1 != null) ? content1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSElement getContent() {
//        if (Element getContent != null) {
//            return Element getContent.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetContent() {
        if (getContent != null) {
            return getContent.generateJs();
            //return String.format(Locale.US, "getContent: %s,", ((getContent != null) ? getContent.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContent());

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
//            js.append(generateJScontent());
////        
//            js.append(generateJScontent1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
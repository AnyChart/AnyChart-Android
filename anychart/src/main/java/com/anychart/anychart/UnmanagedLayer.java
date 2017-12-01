package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * 
 */
public class UnmanagedLayer extends Element {

    public UnmanagedLayer() {
        js.setLength(0);
        js.append("var unmanagedLayer").append(++variableIndex).append(" = anychart.graphics.vector.unmanagedLayer();");
        jsBase = "unmanagedLayer" + variableIndex;
    }

    protected UnmanagedLayer(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UnmanagedLayer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContent;

    /**
     * Getter for the inner content.
     */
    public Element getContent() {
        if (getContent == null)
            getContent = new Element(jsBase + ".content()");

        return getContent;
    }

    private String content;
    private Element content1;

    /**
     * Setter for the inner content.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".content(%s);", wrapQuotes(content)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the inner content.
     */
    public UnmanagedLayer setContent(Element content1) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            
            this.content1 = content1;
        } else {
            this.content1 = content1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(content1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".content(%s);",  ((content1 != null) ? content1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".content(%s);", ((content1 != null) ? content1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetContent() {
        if (getContent != null) {
            return getContent.generateJs();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
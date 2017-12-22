package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Preloader class contains methods for configuring preloader.
 */
public class Preloader extends JsObject {

    public Preloader() {
        js.setLength(0);
        js.append("var preloader").append(++variableIndex).append(" = anychart.ui.preloader();");
        jsBase = "preloader" + variableIndex;
    }

    protected Preloader(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Preloader(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element element;

    /**
     * Decorates the element for the preloader.
     */
    public void decorate(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".decorate(%s);",  ((element != null) ? element.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s);", ((element != null) ? element.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private Element parentElement;

    /**
     * Renders the preloader.
     */
    public void render(Element parentElement) {
        if (jsBase == null) {
            this.parentElement = parentElement;
        } else {
            this.parentElement = parentElement;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentElement.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement != null) ? parentElement.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement != null) ? parentElement.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private Boolean visible;

    /**
     * Setter for the visibility of the preloader.
     */
    public Preloader setVisible(Boolean visible) {
        if (jsBase == null) {
            this.visible = visible;
        } else {
            this.visible = visible;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".visible(%b)", visible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".visible(%b);", visible));
                js.setLength(0);
            }
        }
        return this;
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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
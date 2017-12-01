package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Overlay element class.
 */
public class Overlay extends CoreBase {

    public Overlay() {
        js.setLength(0);
        js.append("var overlay").append(++variableIndex).append(" = anychart.core.ui.overlay();");
        jsBase = "overlay" + variableIndex;
    }

    protected Overlay(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Overlay(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String className;

    /**
     * Setter for the name of DIV class.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".className(%s);", wrapQuotes(className)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    /**
     * Setter for the enabled state.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element getGetElement;

    /**
     * Gets the overlay DOM element.
     */
    public Element getGetElement() {
        if (getGetElement == null)
            getGetElement = new Element(jsBase + ".getElement()");

        return getGetElement;
    }

    private String id;

    /**
     * Setter for the DIV identifier.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetGetElement() {
        if (getGetElement != null) {
            return getGetElement.generateJs();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
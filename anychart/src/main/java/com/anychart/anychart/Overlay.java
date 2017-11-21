package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private List<Overlay> setClassName = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".className(%s)", wrapQuotes(className)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetClassName() {
        if (!setClassName.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Overlay item : setClassName) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean enabled;
    private List<Overlay> setEnabled = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Overlay item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Overlay> setId = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetId() {
        if (!setId.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Overlay item : setId) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetClassName());
        js.append(generateJSsetEnabled());
        js.append(generateJSsetId());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
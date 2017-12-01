package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Resource Chart Logo element.
 */
public class Logo extends UiBackground {

    public Logo() {
        js.setLength(0);
        js.append("var logo").append(++variableIndex).append(" = anychart.core.resource.logo();");
        jsBase = "logo" + variableIndex;
    }

    protected Logo(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Logo(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Overlay getOverlay;

    /**
     * Getter for the overlay element.
     */
    public Overlay getOverlay() {
        if (getOverlay == null)
            getOverlay = new Overlay(jsBase + ".overlay()");

        return getOverlay;
    }

    private String overlay;
    private Boolean overlay1;

    /**
     * Setter for the overlay element.
     */
    public Logo setOverlay(String overlay) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay = overlay;
        } else {
            this.overlay = overlay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlay(%s)", wrapQuotes(overlay)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlay(%s);", wrapQuotes(overlay)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the overlay element.
     */
    public Logo setOverlay(Boolean overlay1) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay1 = overlay1;
        } else {
            this.overlay1 = overlay1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlay(%b);", overlay1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetOverlay() {
        if (getOverlay != null) {
            return getOverlay.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetOverlay());

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
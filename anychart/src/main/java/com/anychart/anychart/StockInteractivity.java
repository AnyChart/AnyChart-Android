package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Interactivity class for stocks.
 */
public class StockInteractivity extends Interactivity {

    public StockInteractivity() {
        js.setLength(0);
        js.append("var stockInteractivity").append(++variableIndex).append(" = anychart.core.utils.stockInteractivity();");
        jsBase = "stockInteractivity" + variableIndex;
    }

    protected StockInteractivity(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockInteractivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean scrollOnMouseWheel;

    /**
     * Setter for the scrolling.<br/>
Allows use mouse wheel for scrolling. Press "ctrl" or "shift" and scroll mouse wheel.
     */
    public StockInteractivity setScrollOnMouseWheel(Boolean scrollOnMouseWheel) {
        if (jsBase == null) {
            this.scrollOnMouseWheel = scrollOnMouseWheel;
        } else {
            this.scrollOnMouseWheel = scrollOnMouseWheel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scrollOnMouseWheel(%b)", scrollOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scrollOnMouseWheel(%b);", scrollOnMouseWheel));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean zoomOnMouseWheel;

    /**
     * Setter for the zoom.<br/>
Allows use mouse wheel for zooming. Press "ctrl" or "shift" and zoom mouse wheel.
     */
    public StockInteractivity setZoomOnMouseWheel(Boolean zoomOnMouseWheel) {
        if (jsBase == null) {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
        } else {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b);", zoomOnMouseWheel));
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
package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private List<StockInteractivity> setScrollOnMouseWheel = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".scrollOnMouseWheel(%b)", scrollOnMouseWheel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetScrollOnMouseWheel() {
        if (!setScrollOnMouseWheel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockInteractivity item : setScrollOnMouseWheel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean zoomOnMouseWheel;
    private List<StockInteractivity> setZoomOnMouseWheel = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetZoomOnMouseWheel() {
        if (!setZoomOnMouseWheel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockInteractivity item : setZoomOnMouseWheel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetScrollOnMouseWheel());
        js.append(generateJSsetZoomOnMouseWheel());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
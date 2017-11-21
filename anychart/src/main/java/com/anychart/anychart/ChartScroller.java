package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Chart scroller class that also exposes position method that is used by chart.
 */
public class ChartScroller extends UiScroller {

    public ChartScroller() {
        js.setLength(0);
        js.append("var chartScroller").append(++variableIndex).append(" = anychart.core.ui.chartScroller();");
        jsBase = "chartScroller" + variableIndex;
    }

    protected ChartScroller(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChartScroller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean inverted;
    private List<ChartScroller> setInverted = new ArrayList<>();

    /**
     * Setter for the scroller inversion.
     */
    public ChartScroller setInverted(Boolean inverted) {
        if (jsBase == null) {
            this.inverted = inverted;
        } else {
            this.inverted = inverted;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".inverted(%b)", inverted));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".inverted(%b)", inverted));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetInverted() {
        if (!setInverted.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartScroller item : setInverted) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ChartScrollerPosition position;
    private String position1;
    private List<ChartScroller> setPosition = new ArrayList<>();

    /**
     * Setter for the scroller position.
     */
    public ChartScroller setPosition(ChartScrollerPosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartScroller item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartScroller> setPosition1 = new ArrayList<>();

    /**
     * Setter for the scroller position.
     */
    public ChartScroller setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartScroller item : setPosition1) {
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

        js.append(generateJSsetInverted());
        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class AnychartResourceTimeline extends UiTimeline {

    public AnychartResourceTimeline() {
        js.setLength(0);
        js.append("var anychartResourceTimeline").append(++variableIndex).append(" = anychart.standalones.resourceTimeline();");
        jsBase = "anychartResourceTimeline" + variableIndex;
    }

    protected AnychartResourceTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AnychartResourceTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double defaultRowHeight;
    private List<AnychartResourceTimeline> setDefaultRowHeight = new ArrayList<>();

    /**
     * Setter for the default row height.
     */
    public AnychartResourceTimeline setDefaultRowHeight(Double defaultRowHeight) {
        if (jsBase == null) {
            this.defaultRowHeight = defaultRowHeight;
        } else {
            this.defaultRowHeight = defaultRowHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDefaultRowHeight() {
        if (!setDefaultRowHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartResourceTimeline item : setDefaultRowHeight) {
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

        js.append(generateJSsetDefaultRowHeight());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
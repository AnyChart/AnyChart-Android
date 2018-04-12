package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Baselines element settings.
 */
public class BaselinesElement extends TimelineElement {

    public BaselinesElement() {
        js.setLength(0);
        js.append("var baselinesElement").append(++variableIndex).append(" = anychart.core.gantt.elements.baselinesElement();");
        jsBase = "baselinesElement" + variableIndex;
    }

    protected BaselinesElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected BaselinesElement(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean above;

    /**
     * Setter for the "above" flag.
     */
    public BaselinesElement setAbove(Boolean above) {
        if (jsBase == null) {
            this.above = above;
        } else {
            this.above = above;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".above(%b)", above));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".above(%b);", above));
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
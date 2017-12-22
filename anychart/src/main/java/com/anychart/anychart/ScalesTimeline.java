package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Base class contains methods for all types scales.
 */
public class ScalesTimeline extends CoreTimeline {

    public ScalesTimeline() {
        js.setLength(0);
        js.append("var scalesTimeline").append(++variableIndex).append(" = anychart.scales.base();");
        jsBase = "scalesTimeline" + variableIndex;
    }

    protected ScalesTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScalesTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean silently;

    /**
     * Informs the scale that an auto-range calculation started for the chart in past was ended.
     */
    public void finishAutoCalc(Boolean silently) {
        if (jsBase == null) {
            this.silently = silently;
        } else {
            this.silently = silently;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".finishAutoCalc(%b);", silently));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".finishAutoCalc(%b);", silently));
                js.setLength(0);
            }
        }
    }

    private Boolean inverted;

    /**
     * Setter for scale inversion.<br/> If the scale is <b>inverted</b>, axes and series go upside-down or right-to-left
instead of bottom-to-top and left-to-right.
     */
    public ScalesTimeline setInverted(Boolean inverted) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));
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
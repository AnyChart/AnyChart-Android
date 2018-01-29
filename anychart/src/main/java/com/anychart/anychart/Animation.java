package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Animation class. The animation class is used in maps.
 */
public class Animation extends CoreBase {

    public Animation() {
        js.setLength(0);
        js.append("var animation").append(++variableIndex).append(" = anychart.core.utils.animation();");
        jsBase = "animation" + variableIndex;
    }

    protected Animation(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Animation(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number duration;

    /**
     * Setter for animation duration in milliseconds.
See sample at {@link anychart.core.Chart#animation}.
     */
    public Animation setDuration(Number duration) {
        if (jsBase == null) {
            this.duration = duration;
        } else {
            this.duration = duration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".duration(%s)", duration));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".duration(%s);", duration));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    /**
     * Setter for the animation enabled state.<br/>
See sample at {@link anychart.core.Chart#animation}.
     */
    public Animation setEnabled(Boolean enabled) {
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
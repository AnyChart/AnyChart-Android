package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * 
 */
public class ProjectTimeline extends Timeline {

    public ProjectTimeline() {
        js.setLength(0);
        js.append("var projectTimeline").append(++variableIndex).append(" = anychart.standalones.projectTimeline();");
        jsBase = "projectTimeline" + variableIndex;
    }

    protected ProjectTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ProjectTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double defaultRowHeight;

    /**
     * Setter for the default row height.
     */
    public ProjectTimeline setDefaultRowHeight(Double defaultRowHeight) {
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
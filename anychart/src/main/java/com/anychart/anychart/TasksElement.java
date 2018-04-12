package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Tasks element settings. This class provides settings for tasks and grouping tasks.
 */
public class TasksElement extends TimelineElement {

    public TasksElement() {
        js.setLength(0);
        js.append("var tasksElement").append(++variableIndex).append(" = anychart.core.gantt.elements.tasksElement();");
        jsBase = "tasksElement" + variableIndex;
    }

    protected TasksElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TasksElement(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ProgressElement getProgress;

    /**
     * Getter for the task progress.
     */
    public ProgressElement getProgress() {
        if (getProgress == null)
            getProgress = new ProgressElement(jsBase + ".progress()");

        return getProgress;
    }

    private String settings;

    /**
     * Setter for the task progress.
     */
    public TasksElement setProgress(String settings) {
        if (jsBase == null) {
            this.settings = settings;
        } else {
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".progress(%s)", wrapQuotes(settings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".progress(%s);", wrapQuotes(settings)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetProgress() {
        if (getProgress != null) {
            return getProgress.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetProgress());

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
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Pert critical path settings collector.
 */
public class CriticalPath extends CoreBase {

    public CriticalPath() {
        js.setLength(0);
        js.append("var criticalPath").append(++variableIndex).append(" = anychart.core.pert.criticalPath();");
        jsBase = "criticalPath" + variableIndex;
    }

    protected CriticalPath(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CriticalPath(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Milestones getMilestones;

    /**
     * Getter for milestones settings.
     */
    public Milestones getMilestones() {
        if (getMilestones == null)
            getMilestones = new Milestones(jsBase + ".milestones()");

        return getMilestones;
    }

    private String milestones;

    /**
     * Setter for milestones settings.
     */
    public CriticalPath setMilestones(String milestones) {
        if (jsBase == null) {
            this.milestones = milestones;
        } else {
            this.milestones = milestones;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".milestones(%s)", wrapQuotes(milestones)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".milestones(%s);", wrapQuotes(milestones)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tasks getTasks;

    /**
     * Getter for tasks settings.
     */
    public Tasks getTasks() {
        if (getTasks == null)
            getTasks = new Tasks(jsBase + ".tasks()");

        return getTasks;
    }

    private String tasks;

    /**
     * Setter for tasks settings object.
     */
    public CriticalPath setTasks(String tasks) {
        if (jsBase == null) {
            this.tasks = tasks;
        } else {
            this.tasks = tasks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tasks(%s)", wrapQuotes(tasks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tasks(%s);", wrapQuotes(tasks)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetMilestones() {
        if (getMilestones != null) {
            return getMilestones.generateJs();
        }
        return "";
    }

    private String generateJSgetTasks() {
        if (getTasks != null) {
            return getTasks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMilestones());
        jsGetters.append(generateJSgetTasks());

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
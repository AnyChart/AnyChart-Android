package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CriticalPath extends CoreBase {

    public CriticalPath() {

    }

    protected CriticalPath(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CriticalPath(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Milestones getMilestones;

    public Milestones getMilestones() {
        if (getMilestones == null)
            getMilestones = new Milestones(jsBase + ".milestones()");

        return getMilestones;
    }

    private String milestones;

    public CriticalPath setMilestones(String milestones) {
        if (jsBase == null) {
            this.milestones = milestones;
        } else {
            this.milestones = milestones;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".milestones(%s)", milestones));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestones(%s)", milestones));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tasks getTasks;

    public Tasks getTasks() {
        if (getTasks == null)
            getTasks = new Tasks(jsBase + ".tasks()");

        return getTasks;
    }

    private String tasks;

    public CriticalPath setTasks(String tasks) {
        if (jsBase == null) {
            this.tasks = tasks;
        } else {
            this.tasks = tasks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".tasks(%s)", tasks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tasks(%s)", tasks));
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

    private String generateJSmilestones() {
        if (milestones != null) {
            return String.format(Locale.US, "milestones: %s,", milestones);
        }
        return "";
    }

    private String generateJStasks() {
        if (tasks != null) {
            return String.format(Locale.US, "tasks: %s,", tasks);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSmilestones());
            js.append(generateJStasks());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
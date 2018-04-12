package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Grouping tasks element settings.
 */
public class GroupingTasksElement extends TimelineElement {

    public GroupingTasksElement() {
        js.setLength(0);
        js.append("var groupingTasksElement").append(++variableIndex).append(" = anychart.core.gantt.elements.groupingTasksElement();");
        jsBase = "groupingTasksElement" + variableIndex;
    }

    protected GroupingTasksElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GroupingTasksElement(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ProgressElement getProgress;

    /**
     * Getter for the grouping task progress.
     */
    public ProgressElement getProgress() {
        if (getProgress == null)
            getProgress = new ProgressElement(jsBase + ".progress()");

        return getProgress;
    }

    private String settings;

    /**
     * Setter for the grouping task progress.
     */
    public GroupingTasksElement setProgress(String settings) {
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
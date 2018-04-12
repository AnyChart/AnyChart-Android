package com.anychart.anychart;

// class
/**
 * Periods element settings.
 */
public class PeriodsElement extends TimelineElement {

    public PeriodsElement() {
        js.setLength(0);
        js.append("var periodsElement").append(++variableIndex).append(" = anychart.core.gantt.elements.periodsElement();");
        jsBase = "periodsElement" + variableIndex;
    }

    protected PeriodsElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PeriodsElement(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
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
package com.anychart.anychart;

// class
/**
 * Milestones element settings.
 */
public class MilestonesElement extends TimelineElement {

    public MilestonesElement() {
        js.setLength(0);
        js.append("var milestonesElement").append(++variableIndex).append(" = anychart.core.gantt.elements.milestonesElement();");
        jsBase = "milestonesElement" + variableIndex;
    }

    protected MilestonesElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected MilestonesElement(StringBuilder js, String jsBase, boolean isChain) {
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
package com.anychart.anychart;

// class
/**
 * Progress element settings.
 */
public class ProgressElement extends TimelineElement {

    public ProgressElement() {
        js.setLength(0);
        js.append("var progressElement").append(++variableIndex).append(" = anychart.core.gantt.elements.progressElement();");
        jsBase = "progressElement" + variableIndex;
    }

    protected ProgressElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ProgressElement(StringBuilder js, String jsBase, boolean isChain) {
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
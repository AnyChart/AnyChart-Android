package com.anychart.anychart;

// class
public class A11y extends CoreBase {

    private String jsBase;

    public A11y() {

    }

    protected A11y(String jsBase) {
        this.jsBase = jsBase;
    }

    

    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
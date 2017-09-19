package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Zoom extends JsObject {

    
    private Element decorate;

    public void setDecorate(Element decorate) {
        this.decorate = decorate;
    }

    private ChartsMap parentElement;
    private Element parentElement1;

    public void setRender(ChartsMap parentElement) {
        this.parentElement = null;
        this.parentElement1 = null;
        
        this.parentElement = parentElement;
    }


    public void setRender(Element parentElement1) {
        this.parentElement = null;
        this.parentElement1 = null;
        
        this.parentElement1 = parentElement1;
    }

    private ChartsMap chart;

    public void setTarget(ChartsMap chart) {
        this.chart = chart;
    }

    private String generateJSdecorate() {
        if (decorate != null) {
            return String.format(Locale.US, "decorate: %s,", (decorate != null) ? decorate.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentElement() {
        if (parentElement != null) {
            return String.format(Locale.US, "parentElement: %s,", (parentElement != null) ? parentElement.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentElement1() {
        if (parentElement1 != null) {
            return String.format(Locale.US, "parentElement: %s,", (parentElement1 != null) ? parentElement1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchart() {
        if (chart != null) {
            return String.format(Locale.US, "chart: %s,", (chart != null) ? chart.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSdecorate());
        js.append(generateJSparentElement());
        js.append(generateJSparentElement1());
        js.append(generateJSchart());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
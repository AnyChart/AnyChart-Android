package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RangePicker extends JsObject {

    
    private Element decorate;

    public void setDecorate(Element decorate) {
        this.decorate = decorate;
    }

    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    private String fromLabelText;

    public void setFromlabeltext(String fromLabelText) {
        this.fromLabelText = fromLabelText;
    }

    private Stock parentElement;
    private Element parentElement1;

    public void setRender(Stock parentElement) {
        this.parentElement = null;
        this.parentElement1 = null;
        
        this.parentElement = parentElement;
    }


    public void setRender(Element parentElement1) {
        this.parentElement = null;
        this.parentElement1 = null;
        
        this.parentElement1 = parentElement1;
    }

    private Stock chart;

    public void setTarget(Stock chart) {
        this.chart = chart;
    }

    private String toLabelText;

    public void setTolabeltext(String toLabelText) {
        this.toLabelText = toLabelText;
    }

    private String generateJSdecorate() {
        if (decorate != null) {
            return String.format(Locale.US, "decorate: %s,", (decorate != null) ? decorate.generateJs() : "null");
        }
        return "";
    }

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: \"%s\",", format);
        }
        return "";
    }

    private String generateJSfromLabelText() {
        if (fromLabelText != null) {
            return String.format(Locale.US, "fromLabelText: \"%s\",", fromLabelText);
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

    private String generateJStoLabelText() {
        if (toLabelText != null) {
            return String.format(Locale.US, "toLabelText: \"%s\",", toLabelText);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSdecorate());
        js.append(generateJSformat());
        js.append(generateJSfromLabelText());
        js.append(generateJSparentElement());
        js.append(generateJSparentElement1());
        js.append(generateJSchart());
        js.append(generateJStoLabelText());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
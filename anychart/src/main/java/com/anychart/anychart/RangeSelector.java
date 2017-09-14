package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RangeSelector extends JsObject {

    
    private Element decorate;

    public void setDecorate(Element decorate) {
        this.decorate = decorate;
    }

    private Range[] ranges;

    public void setRanges(Range[] ranges) {
        this.ranges = ranges;
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

    private String zoomLabelText;

    public void setZoomlabeltext(String zoomLabelText) {
        this.zoomLabelText = zoomLabelText;
    }

    private String generateJSdecorate() {
        if (decorate != null) {
            return String.format(Locale.US, "decorate: %s,", (decorate != null) ? decorate.generateJs() : "null");
        }
        return "";
    }

    private String generateJSranges() {
        if (ranges != null) {
            return String.format(Locale.US, "ranges: %s,", arrayToString(ranges));
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

    private String generateJSzoomLabelText() {
        if (zoomLabelText != null) {
            return String.format(Locale.US, "zoomLabelText: \"%s\",", zoomLabelText);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSdecorate());
        js.append(generateJSranges());
        js.append(generateJSparentElement());
        js.append(generateJSparentElement1());
        js.append(generateJSchart());
        js.append(generateJSzoomLabelText());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
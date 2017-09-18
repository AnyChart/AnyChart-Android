package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class BBandsWidth extends JsObject {

    
    private Double deviation;

    public void setDeviation(Double deviation) {
        this.deviation = deviation;
    }

    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private StockSeriesType type;
    private String type1;

    public void setSeries(StockSeriesType type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setSeries(String type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private String generateJSdeviation() {
        if (deviation != null) {
            return String.format(Locale.US, "deviation: %f,", deviation);
        }
        return "";
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSdeviation());
        js.append(generateJSperiod());
        js.append(generateJStype());
        js.append(generateJStype1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
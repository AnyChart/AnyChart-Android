package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class AMA extends JsObject {

    
    private Double fastPeriod;

    public void setFastperiod(Double fastPeriod) {
        this.fastPeriod = fastPeriod;
    }

    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private StockSeriesType type;

    public void setSeries(StockSeriesType type) {
        this.type = type;
    }

    private Double slowPeriod;

    public void setSlowperiod(Double slowPeriod) {
        this.slowPeriod = slowPeriod;
    }

    private String generateJSfastPeriod() {
        if (fastPeriod != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod);
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

    private String generateJSslowPeriod() {
        if (slowPeriod != null) {
            return String.format(Locale.US, "slowPeriod: %f,", slowPeriod);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSfastPeriod());
        js.append(generateJSperiod());
        js.append(generateJStype());
        js.append(generateJSslowPeriod());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
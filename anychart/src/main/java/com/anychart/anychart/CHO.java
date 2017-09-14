package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class CHO extends JsObject {

    
    private Double fastPeriod;

    public void setFastperiod(Double fastPeriod) {
        this.fastPeriod = fastPeriod;
    }

    private MovingAverageType maType;
    private String maType1;

    public void setMatype(MovingAverageType maType) {
        this.maType = null;
        this.maType1 = null;
        
        this.maType = maType;
    }


    public void setMatype(String maType1) {
        this.maType = null;
        this.maType1 = null;
        
        this.maType1 = maType1;
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

    private String generateJSmaType() {
        if (maType != null) {
            return String.format(Locale.US, "maType: %s,", (maType != null) ? maType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmaType1() {
        if (maType1 != null) {
            return String.format(Locale.US, "maType: \"%s\",", maType1);
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
        js.append(generateJSmaType());
        js.append(generateJSmaType1());
        js.append(generateJStype());
        js.append(generateJSslowPeriod());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class SMA extends JsObject {

    
    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private String type;
    private StockSeriesType type1;

    public void setSeries(String type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setSeries(StockSeriesType type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", (type1 != null) ? type1.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSperiod());
        js.append(generateJStype());
        js.append(generateJStype1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Aroon extends JsObject {

    
    private String type;
    private StockSeriesType type1;

    public void setDownseries(String type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setDownseries(StockSeriesType type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private String type2;
    private StockSeriesType type3;

    public void setUpseries(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type2 = type2;
    }


    public void setUpseries(StockSeriesType type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
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

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", (type3 != null) ? type3.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJStype());
        js.append(generateJStype1());
        js.append(generateJSperiod());
        js.append(generateJStype2());
        js.append(generateJStype3());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
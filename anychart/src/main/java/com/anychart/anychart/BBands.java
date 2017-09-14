package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class BBands extends JsObject {

    
    private Double deviation;

    public void setDeviation(Double deviation) {
        this.deviation = deviation;
    }

    private StockSeriesType type;
    private String type1;

    public void setLowerseries(StockSeriesType type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setLowerseries(String type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private StockSeriesType type2;

    public void setMiddleseries(StockSeriesType type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private StockSeriesType type3;
    private String type4;

    public void setUpperseries(StockSeriesType type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        
        this.type3 = type3;
    }


    public void setUpperseries(String type4) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        
        this.type4 = type4;
    }

    private String generateJSdeviation() {
        if (deviation != null) {
            return String.format(Locale.US, "deviation: %f,", deviation);
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
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", (type2 != null) ? type2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", (type3 != null) ? type3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: \"%s\",", type4);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSdeviation());
        js.append(generateJStype());
        js.append(generateJStype1());
        js.append(generateJStype2());
        js.append(generateJSperiod());
        js.append(generateJStype3());
        js.append(generateJStype4());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
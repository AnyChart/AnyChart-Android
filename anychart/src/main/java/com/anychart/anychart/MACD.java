package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class MACD extends JsObject {

    
    private Double fastPeriod;

    public void setFastperiod(Double fastPeriod) {
        this.fastPeriod = fastPeriod;
    }

    private String type;
    private StockSeriesType type1;

    public void setHistogramseries(String type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setHistogramseries(StockSeriesType type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private String type2;
    private StockSeriesType type3;

    public void setMacdseries(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type2 = type2;
    }


    public void setMacdseries(StockSeriesType type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
    }

    private Double signalPeriod;

    public void setSignalperiod(Double signalPeriod) {
        this.signalPeriod = signalPeriod;
    }

    private String type4;
    private StockSeriesType type5;

    public void setSignalseries(String type4) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        this.type5 = null;
        
        this.type4 = type4;
    }


    public void setSignalseries(StockSeriesType type5) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        this.type5 = null;
        
        this.type5 = type5;
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

    private String generateJSsignalPeriod() {
        if (signalPeriod != null) {
            return String.format(Locale.US, "signalPeriod: %f,", signalPeriod);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
        }
        return "";
    }

    private String generateJStype5() {
        if (type5 != null) {
            return String.format(Locale.US, "type: %s,", (type5 != null) ? type5.generateJs() : "null");
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
        js.append(generateJStype());
        js.append(generateJStype1());
        js.append(generateJStype2());
        js.append(generateJStype3());
        js.append(generateJSsignalPeriod());
        js.append(generateJStype4());
        js.append(generateJStype5());
        js.append(generateJSslowPeriod());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
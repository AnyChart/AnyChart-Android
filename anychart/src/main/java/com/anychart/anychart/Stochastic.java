package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Stochastic extends JsObject {

    
    private MovingAverageType dMAType;

    public void setDmatype(MovingAverageType dMAType) {
        this.dMAType = dMAType;
    }

    private Double dPeriod;

    public void setDperiod(Double dPeriod) {
        this.dPeriod = dPeriod;
    }

    private StockSeriesType type;

    public void setDseries(StockSeriesType type) {
        this.type = type;
    }

    private Double kMAPeriod;

    public void setKmaperiod(Double kMAPeriod) {
        this.kMAPeriod = kMAPeriod;
    }

    private MovingAverageType kMAType;

    public void setKmatype(MovingAverageType kMAType) {
        this.kMAType = kMAType;
    }

    private Double kPeriod;

    public void setKperiod(Double kPeriod) {
        this.kPeriod = kPeriod;
    }

    private StockSeriesType type1;

    public void setKseries(StockSeriesType type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private String generateJSdMAType() {
        if (dMAType != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType != null) ? dMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdPeriod() {
        if (dPeriod != null) {
            return String.format(Locale.US, "dPeriod: %f,", dPeriod);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkMAPeriod() {
        if (kMAPeriod != null) {
            return String.format(Locale.US, "kMAPeriod: %f,", kMAPeriod);
        }
        return "";
    }

    private String generateJSkMAType() {
        if (kMAType != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType != null) ? kMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkPeriod() {
        if (kPeriod != null) {
            return String.format(Locale.US, "kPeriod: %f,", kPeriod);
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
        js.append(generateJSdMAType());
        js.append(generateJSdPeriod());
        js.append(generateJStype());
        js.append(generateJSkMAPeriod());
        js.append(generateJSkMAType());
        js.append(generateJSkPeriod());
        js.append(generateJStype1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
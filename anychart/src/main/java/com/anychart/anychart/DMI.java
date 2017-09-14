package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DMI extends JsObject {

    
    private Double adxPeriod;

    public void setAdxperiod(Double adxPeriod) {
        this.adxPeriod = adxPeriod;
    }

    private StockSeriesType type;
    private String type1;

    public void setAdxseries(StockSeriesType type) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
    }


    public void setAdxseries(String type1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
    }

    private StockSeriesType type2;
    private String type3;

    public void setNdiseries(StockSeriesType type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type2 = type2;
    }


    public void setNdiseries(String type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
    }

    private StockSeriesType type4;
    private String type5;

    public void setPdiseries(StockSeriesType type4) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        this.type5 = null;
        
        this.type4 = type4;
    }


    public void setPdiseries(String type5) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        this.type5 = null;
        
        this.type5 = type5;
    }

    private Double period;

    public void setPeriod(Double period) {
        this.period = period;
    }

    private Boolean useWildersSmoothing;

    public void setUsewilderssmoothing(Boolean useWildersSmoothing) {
        this.useWildersSmoothing = useWildersSmoothing;
    }

    private String generateJSadxPeriod() {
        if (adxPeriod != null) {
            return String.format(Locale.US, "adxPeriod: %f,", adxPeriod);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", (type4 != null) ? type4.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype5() {
        if (type5 != null) {
            return String.format(Locale.US, "type: \"%s\",", type5);
        }
        return "";
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJSuseWildersSmoothing() {
        if (useWildersSmoothing != null) {
            return String.format(Locale.US, "useWildersSmoothing: %b,", useWildersSmoothing);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSadxPeriod());
        js.append(generateJStype());
        js.append(generateJStype1());
        js.append(generateJStype2());
        js.append(generateJStype3());
        js.append(generateJStype4());
        js.append(generateJStype5());
        js.append(generateJSperiod());
        js.append(generateJSuseWildersSmoothing());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
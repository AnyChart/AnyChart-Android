package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Aroon extends JsObject {

    private String jsBase;

    public Aroon() {

    }

    protected Aroon(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private StockSeriesBase getDownSeries;

    public StockSeriesBase getDownSeries() {
        if (getDownSeries == null)
            getDownSeries = new StockSeriesBase(jsBase + ".downSeries()");

        return getDownSeries;
    }

    private String type;
    private StockSeriesType type1;

    public void setDownseries(String type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".downSeries(%s);", type));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".downSeries(%s);", type));
                js.setLength(0);
            }
        }
    }


    public void setDownseries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".downSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".downSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double period;

    public void setPeriod(Double period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;

            js.append(String.format(Locale.US, jsBase + ".period(%f);", period));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".period(%f);", period));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getUpSeries;

    public StockSeriesBase getUpSeries() {
        if (getUpSeries == null)
            getUpSeries = new StockSeriesBase(jsBase + ".upSeries()");

        return getUpSeries;
    }

    private String type2;
    private StockSeriesType type3;

    public void setUpseries(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".upSeries(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upSeries(%s);", type2));
                js.setLength(0);
            }
        }
    }


    public void setUpseries(StockSeriesType type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;

            js.append(String.format(Locale.US, jsBase + ".upSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetDownSeries() {
        if (getDownSeries != null) {
            return getDownSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetUpSeries() {
        if (getUpSeries != null) {
            return getUpSeries.generateJs();
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJSperiod());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append("}");
        }
            js.append(generateJSgetDownSeries());
            js.append(generateJSgetUpSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
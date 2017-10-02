package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class AMA extends JsObject {

    private String jsBase;

    public AMA() {

    }

    protected AMA(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double fastPeriod;

    public void setFastperiod(Double fastPeriod) {
        if (jsBase == null) {
            this.fastPeriod = fastPeriod;
        } else {
            this.fastPeriod = fastPeriod;

            js.append(String.format(Locale.US, jsBase + ".fastPeriod(%f);", fastPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fastPeriod(%f);", fastPeriod));
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

    private StockSeriesBase getSeries;

    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;

    public void setSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double slowPeriod;

    public void setSlowperiod(Double slowPeriod) {
        if (jsBase == null) {
            this.slowPeriod = slowPeriod;
        } else {
            this.slowPeriod = slowPeriod;

            js.append(String.format(Locale.US, jsBase + ".slowPeriod(%f);", slowPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".slowPeriod(%f);", slowPeriod));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfastPeriod());
            js.append(generateJSperiod());
            js.append(generateJStype());
            js.append(generateJSslowPeriod());
            js.append("}");
        }
            js.append(generateJSgetSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
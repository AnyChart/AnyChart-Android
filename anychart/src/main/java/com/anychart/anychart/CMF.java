package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class CMF extends JsObject {

    private String jsBase;

    public CMF() {

    }

    protected CMF(String jsBase) {
        this.jsBase = jsBase;
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

    private StockSeriesBase getseries;

    public StockSeriesBase getSeries() {
        if (getseries == null)
            getseries = new StockSeriesBase(jsBase + ".series()");

        return getseries;
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

    private String generateJSgetseries() {
        if (getseries != null) {
            return getseries.generateJs();
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSperiod());
            js.append(generateJStype());
            js.append("}");
        }
            js.append(generateJSgetseries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
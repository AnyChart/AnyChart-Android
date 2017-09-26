package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class RSI extends JsObject {

    private String jsBase;

    public RSI() {

    }

    protected RSI(String jsBase) {
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

    private String type;
    private StockSeriesType type1;

    public void setSeries(String type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".series(%s);", type));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", type));
                js.setLength(0);
            }
        }
    }


    public void setSeries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".series(%s);", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", (type1 != null) ? type1.generateJs() : "null"));
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSperiod());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append("}");
        }
            js.append(generateJSgetseries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
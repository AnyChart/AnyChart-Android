package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ADL extends JsObject {

    private String jsBase;

    public ADL() {

    }

    protected ADL(String jsBase) {
        this.jsBase = jsBase;
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

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
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
            js.append(generateJStype());
            js.append("}");
        }
            js.append(generateJSgetSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
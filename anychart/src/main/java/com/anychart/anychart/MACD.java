package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class MACD extends JsObject {

    private String jsBase;

    public MACD() {

    }

    protected MACD(String jsBase) {
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

    private StockSeriesBase getHistogramSeries;

    public StockSeriesBase getHistogramSeries() {
        if (getHistogramSeries == null)
            getHistogramSeries = new StockSeriesBase(jsBase + ".histogramSeries()");

        return getHistogramSeries;
    }

    private String type;
    private StockSeriesType type1;

    public void setHistogramseries(String type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".histogramSeries(%s);", type));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".histogramSeries(%s);", type));
                js.setLength(0);
            }
        }
    }


    public void setHistogramseries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".histogramSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".histogramSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getMacdSeries;

    public StockSeriesBase getMacdSeries() {
        if (getMacdSeries == null)
            getMacdSeries = new StockSeriesBase(jsBase + ".macdSeries()");

        return getMacdSeries;
    }

    private String type2;
    private StockSeriesType type3;

    public void setMacdseries(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".macdSeries(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macdSeries(%s);", type2));
                js.setLength(0);
            }
        }
    }


    public void setMacdseries(StockSeriesType type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;

            js.append(String.format(Locale.US, jsBase + ".macdSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macdSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double signalPeriod;

    public void setSignalperiod(Double signalPeriod) {
        if (jsBase == null) {
            this.signalPeriod = signalPeriod;
        } else {
            this.signalPeriod = signalPeriod;

            js.append(String.format(Locale.US, jsBase + ".signalPeriod(%f);", signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalPeriod(%f);", signalPeriod));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getSignalSeries;

    public StockSeriesBase getSignalSeries() {
        if (getSignalSeries == null)
            getSignalSeries = new StockSeriesBase(jsBase + ".signalSeries()");

        return getSignalSeries;
    }

    private String type4;
    private StockSeriesType type5;

    public void setSignalseries(String type4) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type4 = type4;
        } else {
            this.type4 = type4;

            js.append(String.format(Locale.US, jsBase + ".signalSeries(%s);", type4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalSeries(%s);", type4));
                js.setLength(0);
            }
        }
    }


    public void setSignalseries(StockSeriesType type5) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type5 = type5;
        } else {
            this.type5 = type5;

            js.append(String.format(Locale.US, jsBase + ".signalSeries(%s);", (type5 != null) ? type5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalSeries(%s);", (type5 != null) ? type5.generateJs() : "null"));
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

    private String generateJSgetHistogramSeries() {
        if (getHistogramSeries != null) {
            return getHistogramSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetMacdSeries() {
        if (getMacdSeries != null) {
            return getMacdSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetSignalSeries() {
        if (getSignalSeries != null) {
            return getSignalSeries.generateJs();
        }
        return "";
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
        if (jsBase == null) {
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
        }
            js.append(generateJSgetHistogramSeries());
            js.append(generateJSgetMacdSeries());
            js.append(generateJSgetSignalSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
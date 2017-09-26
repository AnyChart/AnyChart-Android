package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Stochastic extends JsObject {

    private String jsBase;

    public Stochastic() {

    }

    protected Stochastic(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private MovingAverageType dMAType;

    public void setDmatype(MovingAverageType dMAType) {
        if (jsBase == null) {
            this.dMAType = dMAType;
        } else {
            this.dMAType = dMAType;

            js.append(String.format(Locale.US, jsBase + ".dMAType(%s);", (dMAType != null) ? dMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dMAType(%s);", (dMAType != null) ? dMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double dPeriod;

    public void setDperiod(Double dPeriod) {
        if (jsBase == null) {
            this.dPeriod = dPeriod;
        } else {
            this.dPeriod = dPeriod;

            js.append(String.format(Locale.US, jsBase + ".dPeriod(%f);", dPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dPeriod(%f);", dPeriod));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getdSeries;

    public StockSeriesBase getDseries() {
        if (getdSeries == null)
            getdSeries = new StockSeriesBase(jsBase + ".dSeries()");

        return getdSeries;
    }

    private StockSeriesType type;

    public void setDseries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".dSeries(%s);", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dSeries(%s);", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double kMAPeriod;

    public void setKmaperiod(Double kMAPeriod) {
        if (jsBase == null) {
            this.kMAPeriod = kMAPeriod;
        } else {
            this.kMAPeriod = kMAPeriod;

            js.append(String.format(Locale.US, jsBase + ".kMAPeriod(%f);", kMAPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMAPeriod(%f);", kMAPeriod));
                js.setLength(0);
            }
        }
    }

    private MovingAverageType kMAType;

    public void setKmatype(MovingAverageType kMAType) {
        if (jsBase == null) {
            this.kMAType = kMAType;
        } else {
            this.kMAType = kMAType;

            js.append(String.format(Locale.US, jsBase + ".kMAType(%s);", (kMAType != null) ? kMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMAType(%s);", (kMAType != null) ? kMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double kPeriod;

    public void setKperiod(Double kPeriod) {
        if (jsBase == null) {
            this.kPeriod = kPeriod;
        } else {
            this.kPeriod = kPeriod;

            js.append(String.format(Locale.US, jsBase + ".kPeriod(%f);", kPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kPeriod(%f);", kPeriod));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getkSeries;

    public StockSeriesBase getKseries() {
        if (getkSeries == null)
            getkSeries = new StockSeriesBase(jsBase + ".kSeries()");

        return getkSeries;
    }

    private StockSeriesType type1;

    public void setKseries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".kSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetdSeries() {
        if (getdSeries != null) {
            return getdSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetkSeries() {
        if (getkSeries != null) {
            return getkSeries.generateJs();
        }
        return "";
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdMAType());
            js.append(generateJSdPeriod());
            js.append(generateJStype());
            js.append(generateJSkMAPeriod());
            js.append(generateJSkMAType());
            js.append(generateJSkPeriod());
            js.append(generateJStype1());
            js.append("}");
        }
            js.append(generateJSgetdSeries());
            js.append(generateJSgetkSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class KDJ extends JsObject {

    private String jsBase;

    public KDJ() {

    }

    protected KDJ(String jsBase) {
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

    private Double dMultiplier;

    public void setDmultiplier(Double dMultiplier) {
        if (jsBase == null) {
            this.dMultiplier = dMultiplier;
        } else {
            this.dMultiplier = dMultiplier;

            js.append(String.format(Locale.US, jsBase + ".dMultiplier(%f);", dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dMultiplier(%f);", dMultiplier));
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

    private StockSeriesBase getDSeries;

    public StockSeriesBase getDSeries() {
        if (getDSeries == null)
            getDSeries = new StockSeriesBase(jsBase + ".dSeries()");

        return getDSeries;
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

    private StockSeriesBase getJSeries;

    public StockSeriesBase getJSeries() {
        if (getJSeries == null)
            getJSeries = new StockSeriesBase(jsBase + ".jSeries()");

        return getJSeries;
    }

    private StockSeriesType type1;

    public void setJseries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".jSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jSeries(%s);", (type1 != null) ? type1.generateJs() : "null"));
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

    private KDJ getKMAPeriod;

    public KDJ getKMAPeriod() {
        if (getKMAPeriod == null)
            getKMAPeriod = new KDJ(jsBase + ".kMAPeriod()");

        return getKMAPeriod;
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

    private Double kMultiplier;

    public void setKmultiplier(Double kMultiplier) {
        if (jsBase == null) {
            this.kMultiplier = kMultiplier;
        } else {
            this.kMultiplier = kMultiplier;

            js.append(String.format(Locale.US, jsBase + ".kMultiplier(%f);", kMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMultiplier(%f);", kMultiplier));
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

    private StockSeriesBase getKSeries;

    public StockSeriesBase getKSeries() {
        if (getKSeries == null)
            getKSeries = new StockSeriesBase(jsBase + ".kSeries()");

        return getKSeries;
    }

    private StockSeriesType type2;

    public void setKseries(StockSeriesType type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".kSeries(%s);", (type2 != null) ? type2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kSeries(%s);", (type2 != null) ? type2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetDSeries() {
        if (getDSeries != null) {
            return getDSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetJSeries() {
        if (getJSeries != null) {
            return getJSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetKMAPeriod() {
        if (getKMAPeriod != null) {
            return getKMAPeriod.generateJs();
        }
        return "";
    }

    private String generateJSgetKSeries() {
        if (getKSeries != null) {
            return getKSeries.generateJs();
        }
        return "";
    }

    private String generateJSdMAType() {
        if (dMAType != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType != null) ? dMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdMultiplier() {
        if (dMultiplier != null) {
            return String.format(Locale.US, "dMultiplier: %f,", dMultiplier);
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

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", (type1 != null) ? type1.generateJs() : "null");
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

    private String generateJSkMultiplier() {
        if (kMultiplier != null) {
            return String.format(Locale.US, "kMultiplier: %f,", kMultiplier);
        }
        return "";
    }

    private String generateJSkPeriod() {
        if (kPeriod != null) {
            return String.format(Locale.US, "kPeriod: %f,", kPeriod);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", (type2 != null) ? type2.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdMAType());
            js.append(generateJSdMultiplier());
            js.append(generateJSdPeriod());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJSkMAPeriod());
            js.append(generateJSkMAType());
            js.append(generateJSkMultiplier());
            js.append(generateJSkPeriod());
            js.append(generateJStype2());
            js.append("}");
        }
            js.append(generateJSgetDSeries());
            js.append(generateJSgetJSeries());
            js.append(generateJSgetKMAPeriod());
            js.append(generateJSgetKSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
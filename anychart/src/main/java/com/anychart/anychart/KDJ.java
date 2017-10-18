package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class KDJ extends JsObject {

    public KDJ() {

    }

    protected KDJ(String jsBase) {
        this.jsBase = jsBase;
    }

    protected KDJ(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private MovingAverageType dMAType;
    private String dMAType1;

    public KDJ setDMAType(MovingAverageType dMAType) {
        if (jsBase == null) {
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
        } else {
            this.dMAType = dMAType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dMAType(%s)", (dMAType != null) ? dMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMAType(%s)", (dMAType != null) ? dMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public KDJ setDMAType(String dMAType1) {
        if (jsBase == null) {
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
        } else {
            this.dMAType1 = dMAType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dMAType(%s)", dMAType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMAType(%s)", dMAType1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double dMultiplier;

    public KDJ setDMultiplier(Double dMultiplier) {
        if (jsBase == null) {
            this.dMultiplier = dMultiplier;
        } else {
            this.dMultiplier = dMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dMultiplier(%f)", dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMultiplier(%f)", dMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double dPeriod;

    public KDJ setDPeriod(Double dPeriod) {
        if (jsBase == null) {
            this.dPeriod = dPeriod;
        } else {
            this.dPeriod = dPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dPeriod(%f)", dPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dPeriod(%f)", dPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getDSeries;

    public StockSeriesBase getDSeries() {
        if (getDSeries == null)
            getDSeries = new StockSeriesBase(jsBase + ".dSeries()");

        return getDSeries;
    }

    private StockSeriesType type;
    private String type1;

    public KDJ setDSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dSeries(%s)", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dSeries(%s)", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public KDJ setDSeries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dSeries(%s)", type1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dSeries(%s)", type1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getJSeries;

    public StockSeriesBase getJSeries() {
        if (getJSeries == null)
            getJSeries = new StockSeriesBase(jsBase + ".jSeries()");

        return getJSeries;
    }

    private StockSeriesType type2;
    private String type3;

    public KDJ setJSeries(StockSeriesType type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".jSeries(%s)", (type2 != null) ? type2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".jSeries(%s)", (type2 != null) ? type2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public KDJ setJSeries(String type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".jSeries(%s)", type3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".jSeries(%s)", type3));
                js.setLength(0);
            }
        }
        return this;
    }

    private KDJ getKMAPeriod;

    public KDJ getKMAPeriod() {
        if (getKMAPeriod == null)
            getKMAPeriod = new KDJ(jsBase + ".kMAPeriod()");

        return getKMAPeriod;
    }

    private MovingAverageType kMAType;
    private String kMAType1;

    public KDJ setKMAType(MovingAverageType kMAType) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
        } else {
            this.kMAType = kMAType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kMAType(%s)", (kMAType != null) ? kMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAType(%s)", (kMAType != null) ? kMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public KDJ setKMAType(String kMAType1) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
        } else {
            this.kMAType1 = kMAType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kMAType(%s)", kMAType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAType(%s)", kMAType1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double kMultiplier;

    public KDJ setKMultiplier(Double kMultiplier) {
        if (jsBase == null) {
            this.kMultiplier = kMultiplier;
        } else {
            this.kMultiplier = kMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kMultiplier(%f)", kMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMultiplier(%f)", kMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double kPeriod;

    public KDJ setKPeriod(Double kPeriod) {
        if (jsBase == null) {
            this.kPeriod = kPeriod;
        } else {
            this.kPeriod = kPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kPeriod(%f)", kPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kPeriod(%f)", kPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getKSeries;

    public StockSeriesBase getKSeries() {
        if (getKSeries == null)
            getKSeries = new StockSeriesBase(jsBase + ".kSeries()");

        return getKSeries;
    }

    private StockSeriesType type4;
    private String type5;

    public KDJ setKSeries(StockSeriesType type4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kSeries(%s)", (type4 != null) ? type4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", (type4 != null) ? type4.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public KDJ setKSeries(String type5) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kSeries(%s)", type5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", type5));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJSdMAType1() {
        if (dMAType1 != null) {
            return String.format(Locale.US, "dMAType: %s,", dMAType1);
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
            return String.format(Locale.US, "type: %s,", type1);
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
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSkMAType() {
        if (kMAType != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType != null) ? kMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkMAType1() {
        if (kMAType1 != null) {
            return String.format(Locale.US, "kMAType: %s,", kMAType1);
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

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", (type4 != null) ? type4.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype5() {
        if (type5 != null) {
            return String.format(Locale.US, "type: %s,", type5);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetDSeries());
        jsGetters.append(generateJSgetJSeries());
        jsGetters.append(generateJSgetKMAPeriod());
        jsGetters.append(generateJSgetKSeries());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdMAType());
            js.append(generateJSdMAType1());
            js.append(generateJSdMultiplier());
            js.append(generateJSdPeriod());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append(generateJSkMAType());
            js.append(generateJSkMAType1());
            js.append(generateJSkMultiplier());
            js.append(generateJSkPeriod());
            js.append(generateJStype4());
            js.append(generateJStype5());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
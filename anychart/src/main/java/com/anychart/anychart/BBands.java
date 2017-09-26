package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class BBands extends JsObject {

    private String jsBase;

    public BBands() {

    }

    protected BBands(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double deviation;

    public void setDeviation(Double deviation) {
        if (jsBase == null) {
            this.deviation = deviation;
        } else {
            this.deviation = deviation;

            js.append(String.format(Locale.US, jsBase + ".deviation(%f);", deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".deviation(%f);", deviation));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getlowerSeries;

    public StockSeriesBase getLowerseries() {
        if (getlowerSeries == null)
            getlowerSeries = new StockSeriesBase(jsBase + ".lowerSeries()");

        return getlowerSeries;
    }

    private StockSeriesType type;
    private String type1;

    public void setLowerseries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".lowerSeries(%s);", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerSeries(%s);", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLowerseries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".lowerSeries(%s);", type1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerSeries(%s);", type1));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getmiddleSeries;

    public StockSeriesBase getMiddleseries() {
        if (getmiddleSeries == null)
            getmiddleSeries = new StockSeriesBase(jsBase + ".middleSeries()");

        return getmiddleSeries;
    }

    private StockSeriesType type2;

    public void setMiddleseries(StockSeriesType type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".middleSeries(%s);", (type2 != null) ? type2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleSeries(%s);", (type2 != null) ? type2.generateJs() : "null"));
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

    private StockSeriesBase getupperSeries;

    public StockSeriesBase getUpperseries() {
        if (getupperSeries == null)
            getupperSeries = new StockSeriesBase(jsBase + ".upperSeries()");

        return getupperSeries;
    }

    private StockSeriesType type3;
    private String type4;

    public void setUpperseries(StockSeriesType type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;

            js.append(String.format(Locale.US, jsBase + ".upperSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperSeries(%s);", (type3 != null) ? type3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setUpperseries(String type4) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            
            this.type4 = type4;
        } else {
            this.type4 = type4;

            js.append(String.format(Locale.US, jsBase + ".upperSeries(%s);", type4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperSeries(%s);", type4));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetlowerSeries() {
        if (getlowerSeries != null) {
            return getlowerSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetmiddleSeries() {
        if (getmiddleSeries != null) {
            return getmiddleSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetupperSeries() {
        if (getupperSeries != null) {
            return getupperSeries.generateJs();
        }
        return "";
    }

    private String generateJSdeviation() {
        if (deviation != null) {
            return String.format(Locale.US, "deviation: %f,", deviation);
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

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", (type3 != null) ? type3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdeviation());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJStype2());
            js.append(generateJSperiod());
            js.append(generateJStype3());
            js.append(generateJStype4());
            js.append("}");
        }
            js.append(generateJSgetlowerSeries());
            js.append(generateJSgetmiddleSeries());
            js.append(generateJSgetupperSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
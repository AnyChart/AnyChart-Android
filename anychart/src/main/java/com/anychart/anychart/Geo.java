package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Define geo scale.
 */
public class Geo extends CoreBase {

    public Geo() {
        js.setLength(0);
        js.append("var geo").append(++variableIndex).append(" = anychart.scales.geo();");
        jsBase = "geo" + variableIndex;
    }

    protected Geo(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Geo(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double x;
    private Double y;
    private List<Geo> setExtendDataRange = new ArrayList<>();

    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).
     */
    public Geo extendDataRange(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".extendDataRange(%f, %f)", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".extendDataRange(%f, %f)", x, y));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetExtendDataRange() {
        if (!setExtendDataRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setExtendDataRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double gap;
    private List<Geo> setGap = new ArrayList<>();

    /**
     * Setter for the gap setting.
     */
    public Geo setGap(Double gap) {
        if (jsBase == null) {
            this.gap = gap;
        } else {
            this.gap = gap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".gap(%f)", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%f)", gap));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGap() {
        if (!setGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxTicksCount;
    private List<Geo> setMaxTicksCount = new ArrayList<>();

    /**
     * Setter for maximum ticks count.<br/>
Use the maxTicksCount() method for interval-mode ticks calculation.<br/>
If the number of ticks is greater than set in maxTicksCount(), the scale calculates from 4 to 6 ticks.
     */
    public Geo setMaxTicksCount(Double maxTicksCount) {
        if (jsBase == null) {
            this.maxTicksCount = maxTicksCount;
        } else {
            this.maxTicksCount = maxTicksCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxTicksCount() {
        if (!setMaxTicksCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setMaxTicksCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maximumX;
    private List<Geo> setMaximumX = new ArrayList<>();

    /**
     * Setter for the maximum X.
     */
    public Geo setMaximumX(Double maximumX) {
        if (jsBase == null) {
            this.maximumX = maximumX;
        } else {
            this.maximumX = maximumX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximumX(%f)", maximumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumX(%f)", maximumX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaximumX() {
        if (!setMaximumX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setMaximumX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maximumY;
    private List<Geo> setMaximumY = new ArrayList<>();

    /**
     * Setter for the maximum Y.
     */
    public Geo setMaximumY(Double maximumY) {
        if (jsBase == null) {
            this.maximumY = maximumY;
        } else {
            this.maximumY = maximumY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximumY(%f)", maximumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumY(%f)", maximumY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaximumY() {
        if (!setMaximumY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setMaximumY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumX;
    private List<Geo> setMinimumX = new ArrayList<>();

    /**
     * Setter for the minimum X.
     */
    public Geo setMinimumX(Double minimumX) {
        if (jsBase == null) {
            this.minimumX = minimumX;
        } else {
            this.minimumX = minimumX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimumX(%f)", minimumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumX(%f)", minimumX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinimumX() {
        if (!setMinimumX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setMinimumX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumY;
    private List<Geo> setMinimumY = new ArrayList<>();

    /**
     * Setter for the minimum Y.
     */
    public Geo setMinimumY(Double minimumY) {
        if (jsBase == null) {
            this.minimumY = minimumY;
        } else {
            this.minimumY = minimumY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimumY(%f)", minimumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumY(%f)", minimumY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinimumY() {
        if (!setMinimumY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setMinimumY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] precision;
    private List<Geo> setPrecision = new ArrayList<>();

    /**
     * Setter for the precision using one value.
     */
    public Geo setPrecision(Double[] precision) {
        if (jsBase == null) {
            this.precision = precision;
        } else {
            this.precision = precision;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".precision(%s)", Arrays.toString(precision)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".precision(%s)", Arrays.toString(precision)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPrecision() {
        if (!setPrecision.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setPrecision) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double xPrecision;
    private Double yPrecision;
    private List<Geo> setPrecision1 = new ArrayList<>();

    /**
     * Setter for the precision using several values.
     */
    public Geo setPrecision(Double xPrecision, Double yPrecision) {
        if (jsBase == null) {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;
        } else {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".precision(%f, %f)", xPrecision, yPrecision));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".precision(%f, %f)", xPrecision, yPrecision));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPrecision1() {
        if (!setPrecision1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setPrecision1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GeoTicks getXMinorTicks;

    /**
     * Getter for the set of scale x minor ticks.
     */
    public GeoTicks getXMinorTicks() {
        if (getXMinorTicks == null)
            getXMinorTicks = new GeoTicks(jsBase + ".xMinorTicks()");

        return getXMinorTicks;
    }

    private String xMinorTicks;
    private String[] xMinorTicks1;
    private List<Geo> setXMinorTicks = new ArrayList<>();

    /**
     * Setter for the set of scale x minor ticks.
     */
    public Geo setXMinorTicks(String xMinorTicks) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks = xMinorTicks;
        } else {
            this.xMinorTicks = xMinorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorTicks(%s)", wrapQuotes(xMinorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorTicks(%s)", wrapQuotes(xMinorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorTicks() {
        if (!setXMinorTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setXMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Geo> setXMinorTicks1 = new ArrayList<>();

    /**
     * Setter for the set of scale x minor ticks.
     */
    public Geo setXMinorTicks(String[] xMinorTicks1) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks1 = xMinorTicks1;
        } else {
            this.xMinorTicks1 = xMinorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorTicks(%s)", arrayToStringWrapQuotes(xMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorTicks(%s)", arrayToStringWrapQuotes(xMinorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorTicks1() {
        if (!setXMinorTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setXMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GeoTicks getXTicks;

    /**
     * Getter for the set of scale x ticks.
     */
    public GeoTicks getXTicks() {
        if (getXTicks == null)
            getXTicks = new GeoTicks(jsBase + ".xTicks()");

        return getXTicks;
    }

    private String xTicks;
    private String[] xTicks1;
    private List<Geo> setXTicks = new ArrayList<>();

    /**
     * Setter for the set of scale x ticks.
     */
    public Geo setXTicks(String xTicks) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks = xTicks;
        } else {
            this.xTicks = xTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xTicks(%s)", wrapQuotes(xTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xTicks(%s)", wrapQuotes(xTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXTicks() {
        if (!setXTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setXTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Geo> setXTicks1 = new ArrayList<>();

    /**
     * Setter for the set of scale x ticks.
     */
    public Geo setXTicks(String[] xTicks1) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks1 = xTicks1;
        } else {
            this.xTicks1 = xTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xTicks(%s)", arrayToStringWrapQuotes(xTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xTicks(%s)", arrayToStringWrapQuotes(xTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXTicks1() {
        if (!setXTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setXTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GeoTicks getYMinorTicks;

    /**
     * Getter for the set of scale y minor ticks.
     */
    public GeoTicks getYMinorTicks() {
        if (getYMinorTicks == null)
            getYMinorTicks = new GeoTicks(jsBase + ".yMinorTicks()");

        return getYMinorTicks;
    }

    private String yMinorTicks;
    private String[] yMinorTicks1;
    private List<Geo> setYMinorTicks = new ArrayList<>();

    /**
     * Setter for the set of scale y minor ticks.
     */
    public Geo setYMinorTicks(String yMinorTicks) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks = yMinorTicks;
        } else {
            this.yMinorTicks = yMinorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorTicks(%s)", wrapQuotes(yMinorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorTicks(%s)", wrapQuotes(yMinorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorTicks() {
        if (!setYMinorTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setYMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Geo> setYMinorTicks1 = new ArrayList<>();

    /**
     * Setter for the set of scale y minor ticks.
     */
    public Geo setYMinorTicks(String[] yMinorTicks1) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks1 = yMinorTicks1;
        } else {
            this.yMinorTicks1 = yMinorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorTicks(%s)", arrayToStringWrapQuotes(yMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorTicks(%s)", arrayToStringWrapQuotes(yMinorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorTicks1() {
        if (!setYMinorTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setYMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GeoTicks getYTicks;

    /**
     * Getter for the set of scale y ticks.
     */
    public GeoTicks getYTicks() {
        if (getYTicks == null)
            getYTicks = new GeoTicks(jsBase + ".yTicks()");

        return getYTicks;
    }

    private String yTicks;
    private String[] yTicks1;
    private List<Geo> setYTicks = new ArrayList<>();

    /**
     * Setter for the set of scale y ticks.
     */
    public Geo setYTicks(String yTicks) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks = yTicks;
        } else {
            this.yTicks = yTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yTicks(%s)", wrapQuotes(yTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yTicks(%s)", wrapQuotes(yTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYTicks() {
        if (!setYTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setYTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Geo> setYTicks1 = new ArrayList<>();

    /**
     * Setter for the set of scale y ticks.
     */
    public Geo setYTicks(String[] yTicks1) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks1 = yTicks1;
        } else {
            this.yTicks1 = yTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yTicks(%s)", arrayToStringWrapQuotes(yTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yTicks(%s)", arrayToStringWrapQuotes(yTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYTicks1() {
        if (!setYTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setYTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetXMinorTicks() {
        if (getXMinorTicks != null) {
            return getXMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetXTicks() {
        if (getXTicks != null) {
            return getXTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetYMinorTicks() {
        if (getYMinorTicks != null) {
            return getYMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetYTicks() {
        if (getYTicks != null) {
            return getYTicks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetXMinorTicks());
        jsGetters.append(generateJSgetXTicks());
        jsGetters.append(generateJSgetYMinorTicks());
        jsGetters.append(generateJSgetYTicks());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetExtendDataRange());
        js.append(generateJSsetGap());
        js.append(generateJSsetMaxTicksCount());
        js.append(generateJSsetMaximumX());
        js.append(generateJSsetMaximumY());
        js.append(generateJSsetMinimumX());
        js.append(generateJSsetMinimumY());
        js.append(generateJSsetPrecision());
        js.append(generateJSsetPrecision1());
        js.append(generateJSsetXMinorTicks());
        js.append(generateJSsetXMinorTicks1());
        js.append(generateJSsetXTicks());
        js.append(generateJSsetXTicks1());
        js.append(generateJSsetYMinorTicks());
        js.append(generateJSsetYMinorTicks1());
        js.append(generateJSsetYTicks());
        js.append(generateJSsetYTicks1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
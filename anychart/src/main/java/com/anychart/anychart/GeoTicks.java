package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class GeoTicks extends CoreBase {

    private String jsBase;

    public GeoTicks() {

    }

    protected GeoTicks(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double count;

    public void setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".count(%f);", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%f);", count));
                js.setLength(0);
            }
        }
    }

    private Double minimumCount;
    private Double maximumCount;

    public void setCount(Double minimumCount, Double maximumCount) {
        if (jsBase == null) {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;
        } else {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;

            js.append(String.format(Locale.US, jsBase + ".count(%f, %f);", minimumCount, maximumCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%f, %f);", minimumCount, maximumCount));
                js.setLength(0);
            }
        }
    }

    private Double interval;

    public void setInterval(Double interval) {
        if (jsBase == null) {
            this.interval = interval;
        } else {
            this.interval = interval;

            js.append(String.format(Locale.US, jsBase + ".interval(%f);", interval));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%f);", interval));
                js.setLength(0);
            }
        }
    }

    private String[] ticks;

    public void setSet(String[] ticks) {
        if (jsBase == null) {
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

            js.append(String.format(Locale.US, jsBase + ".set(%s);", Arrays.toString(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", Arrays.toString(ticks)));
                js.setLength(0);
            }
        }
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSminimumCount() {
        if (minimumCount != null) {
            return String.format(Locale.US, "minimumCount: %f,", minimumCount);
        }
        return "";
    }

    private String generateJSmaximumCount() {
        if (maximumCount != null) {
            return String.format(Locale.US, "maximumCount: %f,", maximumCount);
        }
        return "";
    }

    private String generateJSinterval() {
        if (interval != null) {
            return String.format(Locale.US, "interval: %f,", interval);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScount());
            js.append(generateJSminimumCount());
            js.append(generateJSmaximumCount());
            js.append(generateJSinterval());
            js.append(generateJSticks());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
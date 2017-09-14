package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class GeoTicks extends JsObject {

    
    private Double count;

    public void setCount(Double count) {
        this.count = count;
    }

    private Double minimumCount;
    private Double maximumCount;

    public void setCount(Double minimumCount, Double maximumCount) {
        this.minimumCount = minimumCount;
        this.maximumCount = maximumCount;
    }

    private Double interval;

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    private String[] ticks;

    public void setSet(String[] ticks) {
        this.ticks = ticks;
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
        js.append("{");
        js.append(generateJScount());
        js.append(generateJSminimumCount());
        js.append(generateJSmaximumCount());
        js.append(generateJSinterval());
        js.append(generateJSticks());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
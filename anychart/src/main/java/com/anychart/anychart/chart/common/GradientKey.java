package com.anychart.anychart.chart.common;

import android.graphics.Color;

import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class GradientKey extends JsObject {

    private String color;
    private double offset = -1d;
    private double opacity = -1d;

    public GradientKey(String color) {
        this.color = color;
    }

    public GradientKey(String color, double offset, double opacity) {
        this.color = color;
        this.offset = offset;
        this.opacity = opacity;
    }

    @Override
    public String generateJs() {
        js.append(String.format(Locale.US, "{" +
                "color: \"%s\"", color));
        if (offset != -1d) {
            js.append(String.format(Locale.US, "," +
                    "offset: %f", offset));
        }
        if (opacity != -1d) {
            js.append(String.format(Locale.US, "," +
                    "opacity: %f", opacity));
        }
        js.append("}");

        return js.toString();
    }

}

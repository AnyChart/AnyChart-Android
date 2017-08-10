package com.anychart.anychart.chart.common.fill;

import android.graphics.Color;

import java.util.Locale;

/**
 * Created by arseny on 8/7/17.
 */

public class SolidFill extends Fill {

    private String color;
    private double opacity = 1d;

    public SolidFill(String color) {
        this.color = color;
    }

    public SolidFill(String color, double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    @Override
    public String generateJs() {
        js.append(String.format(Locale.US,
                "{" +
                "color: \"%s\"," +
                "opacity: %f" +
                "}",
                color, opacity));

        return js.toString();
    }

}

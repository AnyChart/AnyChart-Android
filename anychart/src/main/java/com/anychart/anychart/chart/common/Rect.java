package com.anychart.anychart.chart.common;

import com.anychart.anychart.JsObject;

import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class Rect extends JsObject {

    private double x;
    private double y;
    private double width;
    private double height;

    public Rect(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    protected String generateJs() {
        js.append(String.format(Locale.US, "acgraph.math.Rect(%f, %f, %f, %f)",
                x, y, width, height));

        return super.generateJs();
    }
}

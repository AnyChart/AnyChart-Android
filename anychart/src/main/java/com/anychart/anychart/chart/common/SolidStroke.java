package com.anychart.anychart.chart.common;

import com.anychart.anychart.chart.common.Stroke;

import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class SolidStroke extends Stroke {

    private String color;
    private String dash;
    private LineCap lineCap;
    private LineJoin lineJoin;
    private double opacity;
    private double thickness;

    public SolidStroke(String color, String dash, LineCap lineCap, LineJoin lineJoin, double opacity, double thickness) {
        this.color = color;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;
    }

    @Override
    protected String generateJs() {
        js.append(String.format(Locale.US, "{" +
                "color: \"%s\"," +
                "dash: \"%s\"," +
                "lineCap: \"%s\"," +
                "lineJoin: \"%s\"," +
                "opacity: %f," +
                "thickness: %f" +
                "}",
                color, dash, lineCap.get(), lineJoin.get(), opacity, thickness));

        return js.toString();
    }
}

package com.anychart.anychart.chart.common;

import com.anychart.anychart.chart.common.GradientKey;
import com.anychart.anychart.chart.common.Mode;
import com.anychart.anychart.chart.common.Stroke;

import java.util.List;
import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class RadialGradientStroke extends Stroke {

    private double cx;
    private double cy;
    private double fx;
    private double fy;
    private String dash;
    private List<GradientKey> gradientKeys;
    private LineCap lineCap;
    private LineJoin lineJoin;
    private Mode mode;
    private double opacity;
    private double thickness;

    public RadialGradientStroke(double cx, double cy, double fx, double fy, String dash, List<GradientKey> gradientKeys,
                                LineCap lineCap, LineJoin lineJoin, Mode mode, double opacity, double thickness) {
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.dash = dash;
        this.gradientKeys = gradientKeys;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.mode = mode;
        this.opacity = opacity;
        this.thickness = thickness;
    }

    @Override
    protected String generateJs() {
        js.append("{" +
                "keys: [");
        for (int i = 0; i < gradientKeys.size(); i++) {
            GradientKey gradientKey = gradientKeys.get(i);
            js.append(gradientKey.generateJs());

            if (i != gradientKeys.size() - 1)
                js.append(",");
        }
        js.append("],");

        js.append(String.format(Locale.US,
                "cx: %f," +
                "cy: %f," +
                "fx: %f," +
                "fy: %f," +
                "dash: \"%s\"," +
                "lineCap: \"%s\"," +
                "lineJoin: \"%s\"," +
                "get: %s," +
                "opacity: %f," +
                "thickness: %f",
                cx, cy, fx, fy, dash, lineCap.get(), lineJoin.get(), (mode == null) ? "null" : mode.generateJs(), opacity, thickness));
        js.append("}");

        return super.generateJs();
    }
}

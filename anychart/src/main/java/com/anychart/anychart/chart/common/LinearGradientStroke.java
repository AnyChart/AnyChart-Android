package com.anychart.anychart.chart.common;

import com.anychart.anychart.chart.common.GradientKey;
import com.anychart.anychart.chart.common.Mode;
import com.anychart.anychart.chart.common.Stroke;

import java.util.List;
import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class LinearGradientStroke extends Stroke {

    private double angle;
    private String dash;
    private List<GradientKey> gradientKeys;
    private LineCap lineCap;
    private LineJoin lineJoin;
    private Mode mode;
    private double opacity;
    private double thickness;

    public LinearGradientStroke(double angle, String dash, List<GradientKey> gradientKeys,
                                LineCap lineCap, LineJoin lineJoin, Mode mode, double opacity, double thickness) {
        this.angle = angle;
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
                        "angle: %f," +
                        "dash: \"%s\"," +
                        "lineCap: \"%s\"," +
                        "lineJoin: \"%s\"," +
                        "get: %s," +
                        "opacity: %f," +
                        "thickness: %f",
                angle, dash, lineCap.get(), lineJoin.get(), (mode == null) ? "null" : mode.generateJs(), opacity, thickness));
        js.append("}");

        System.out.println(js);

        return js.toString();
    }
}

package com.anychart.anychart.chart.common.fill;

import com.anychart.anychart.chart.common.GradientKey;
import com.anychart.anychart.chart.common.Mode;
import com.anychart.anychart.chart.common.Rect;

import java.util.List;
import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class RadialGradientFill extends Fill {

    private double cx;
    private double cy;
    private double fx;
    private double fy;
    private List<GradientKey> gradientKeys;
    private Mode mode;
    private double opacity;

    public RadialGradientFill(double cx, double cy, double fx, double fy, List<GradientKey> gradientKeys, Mode mode, double opacity) {
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.gradientKeys = gradientKeys;
        this.mode = mode;
        this.opacity = opacity;
    }

    @Override
    public String generateJs() {
        js.append("{" +
                "keys: [");
        for (int i = 0; i < gradientKeys.size(); i++) {
            GradientKey gradientKey = gradientKeys.get(i);
            js.append(gradientKey.generateJs());

            if (i != gradientKeys.size() - 1)
                js.append(",");
        }
        js.append("],");

        js.append(String.format(Locale.US, "cx: %f," +
                        "cy: %f," +
                        "fx: %f," +
                        "fy: %f," +
                        "get: %s," +
                        "opacity: %f" +
                        "}",
                cx, cy, fx, fy,
                (mode == null) ? "null" : mode.generateJs(),
                opacity));

        return super.generateJs();
    }
}

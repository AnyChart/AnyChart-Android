package com.anychart.anychart.chart.common.fill;

import com.anychart.anychart.chart.common.GradientKey;
import com.anychart.anychart.chart.common.Mode;
import com.anychart.anychart.chart.common.Rect;

import java.util.List;
import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class LinearGradientFill extends Fill {

    private double angle;
    private List<GradientKey> gradientKeys;
    private Mode mode;
    private double opacity;

    public LinearGradientFill(double angle, List<GradientKey> gradientKeys, Mode mode, double opacity) {
        this.angle = angle;
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

        js.append(String.format(Locale.US, "angle: %f," +
                "get: %s," +
                "opacity: %f",
                angle, (mode == null) ? "null" : mode.generateJs(), opacity));
        js.append("}");

        return super.generateJs();
    }
}

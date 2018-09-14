package com.anychart.graphics.vector;

import com.anychart.JsObject;

import com.anychart.graphics.vector.GradientKey;
import com.anychart.graphics.math.Rect;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Radial gradient fill.
 */
public class RadialGradientFill extends JsObject implements ColoredFill, Fill {

    
    public RadialGradientFill(Number cx, Number cy, Number fx, Number fy, GradientKey[] keys, Rect mode, Number opacity) {
        js.append(String.format(Locale.US, "{cx:%s, cy: %s, fx: %s, fy: %s, keys: %s, mode: %s, opacity: %s, } ", cx, cy, fx, fy, arrayToString(keys), (mode != null) ? mode.getJsBase() : null, opacity));
    }
    public RadialGradientFill(Number cx, Number cy, Number fx, Number fy, String keys, Rect mode, Number opacity) {
        js.append(String.format(Locale.US, "{cx:%s, cy: %s, fx: %s, fy: %s, keys: %s, mode: %s, opacity: %s, } ", cx, cy, fx, fy, wrapQuotes(keys), (mode != null) ? mode.getJsBase() : null, opacity));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
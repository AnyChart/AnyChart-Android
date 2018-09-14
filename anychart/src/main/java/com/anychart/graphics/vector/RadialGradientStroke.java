package com.anychart.graphics.vector;

import com.anychart.JsObject;

import com.anychart.graphics.vector.GradientKey;
import com.anychart.graphics.math.Rect;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Radial gradient stroke.
 */
public class RadialGradientStroke extends JsObject implements Stroke {

    
    public RadialGradientStroke(Number cx, Number cy, String dash, Number fx, Number fy, GradientKey[] keys, String lineCap, String lineJoin, Rect mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{cx:%s, cy: %s, dash: %s, fx: %s, fy: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", cx, cy, wrapQuotes(dash), fx, fy, arrayToString(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), (mode != null) ? mode.getJsBase() : null, opacity, thickness));
    }
    public RadialGradientStroke(Number cx, Number cy, String dash, Number fx, Number fy, String keys, String lineCap, String lineJoin, Rect mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{cx:%s, cy: %s, dash: %s, fx: %s, fy: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", cx, cy, wrapQuotes(dash), fx, fy, wrapQuotes(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), (mode != null) ? mode.getJsBase() : null, opacity, thickness));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
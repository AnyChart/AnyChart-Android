package com.anychart.graphics.vector;

import com.anychart.JsObject;

import com.anychart.graphics.vector.GradientKey;
import com.anychart.graphics.math.Rect;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Linear gradient stroke.
 */
public class LinearGradientStroke extends JsObject implements Stroke {

    
    public LinearGradientStroke(Number angle, String dash, GradientKey[] keys, String lineCap, String lineJoin, Boolean mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{angle:%s, dash: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", angle, wrapQuotes(dash), arrayToString(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), mode, opacity, thickness));
    }
    public LinearGradientStroke(Number angle, String dash, GradientKey[] keys, String lineCap, String lineJoin, Rect mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{angle:%s, dash: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", angle, wrapQuotes(dash), arrayToString(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), (mode != null) ? mode.getJsBase() : null, opacity, thickness));
    }
    public LinearGradientStroke(Number angle, String dash, String keys, String lineCap, String lineJoin, Boolean mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{angle:%s, dash: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", angle, wrapQuotes(dash), wrapQuotes(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), mode, opacity, thickness));
    }
    public LinearGradientStroke(Number angle, String dash, String keys, String lineCap, String lineJoin, Rect mode, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{angle:%s, dash: %s, keys: %s, lineCap: %s, lineJoin: %s, mode: %s, opacity: %s, thickness: %s, } ", angle, wrapQuotes(dash), wrapQuotes(keys), wrapQuotes(lineCap), wrapQuotes(lineJoin), (mode != null) ? mode.getJsBase() : null, opacity, thickness));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
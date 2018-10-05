package com.anychart.graphics.vector;

import com.anychart.JsObject;

import com.anychart.graphics.vector.GradientKey;
import com.anychart.graphics.vector.Rect;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Linear gradient.
 */
public class LinearGradientFill extends JsObject implements ColoredFill, Fill {

    
    public LinearGradientFill(Number angle, GradientKey[] keys, Boolean mode, Number opacity) {
        js.append(String.format(Locale.US, "{angle:%s, keys: %s, mode: %s, opacity: %s, } ", angle, arrayToString(keys), mode, opacity));
    }
    public LinearGradientFill(Number angle, GradientKey[] keys, Rect mode, Number opacity) {
        js.append(String.format(Locale.US, "{angle:%s, keys: %s, mode: %s, opacity: %s, } ", angle, arrayToString(keys), (mode != null) ? mode.getJsBase() : null, opacity));
    }
    public LinearGradientFill(Number angle, String keys, Boolean mode, Number opacity) {
        js.append(String.format(Locale.US, "{angle:%s, keys: %s, mode: %s, opacity: %s, } ", angle, wrapQuotes(keys), mode, opacity));
    }
    public LinearGradientFill(Number angle, String keys, Rect mode, Number opacity) {
        js.append(String.format(Locale.US, "{angle:%s, keys: %s, mode: %s, opacity: %s, } ", angle, wrapQuotes(keys), (mode != null) ? mode.getJsBase() : null, opacity));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
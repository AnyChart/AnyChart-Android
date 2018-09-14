package com.anychart.graphics.vector;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Linear gradient.<br/>
Used to fill shapes with linear gradient configured with (anychart.graphics.vector.GradientKey)
array. Gradient line is a perpendicular to colors line. Gradient angle is an angle relative to
horizontal line (0 degrees means horizontal). Gradient has its own opacity, but keys opacity has
priority over it.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Shape#fill}
to create linear gradient.<br/>
See also:<br/>
{@link anychart.graphics.vector.Circle#fill}
{@link anychart.graphics.vector.Ellipse#fill}<br/>
Linear gradient has three modes: ObjectBoundingBox with angle value preservation,
ObjectBoundingBox without angle value preservation and UserSpaceOnUse.
{docs:Graphics/Fill_Settings#linear_gradient}Learn more about gradient modes.{docs}
 */
public class LinearGradient extends JsObject {

    protected LinearGradient() {

    }

    public static LinearGradient instantiate() {
        return new LinearGradient("new anychart.graphics.vector.linearGradient()");
    }

    

    public LinearGradient(String jsChart) {
        jsBase = "linearGradient" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Disposes gradient completely, removes from parent layer, null internal links, removes from DOM structure.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }

}
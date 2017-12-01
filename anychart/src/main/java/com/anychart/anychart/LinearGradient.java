package com.anychart.anychart;

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

    public LinearGradient() {
        js.setLength(0);
        js.append("var linearGradient").append(++variableIndex).append(" = anychart.graphics.vector.linearGradient();");
        jsBase = "linearGradient" + variableIndex;
    }

    protected LinearGradient(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LinearGradient(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
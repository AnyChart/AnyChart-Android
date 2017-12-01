package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Radial gradient.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Shape#fill}
to create linear gradient.<br/>
See also:<br/>
{@link anychart.graphics.vector.Circle#fill}<br/>
{@link anychart.graphics.vector.Ellipse#fill}
 */
public class RadialGradient extends JsObject {

    public RadialGradient() {
        js.setLength(0);
        js.append("var radialGradient").append(++variableIndex).append(" = anychart.graphics.vector.radialGradient();");
        jsBase = "radialGradient" + variableIndex;
    }

    protected RadialGradient(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RadialGradient(StringBuilder js, String jsBase, boolean isChain) {
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
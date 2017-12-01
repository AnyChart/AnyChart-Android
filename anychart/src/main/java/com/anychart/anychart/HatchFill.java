package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * HatchFill is a special pattern fill with predefined set of a primitives. Sets of a primitives does numbered and
declared in {@link anychart.graphics.vector.HatchFill.HatchFillType} enum. Hatch fill properties will be applied to his
children (sets of a primitives). HatchFill is a immutable fill, therefore after rendering his a properties
can not be changed.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#hatchFill} or
{@link anychart.graphics#hatchFill}.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#hatchFill},<br/>
{@link anychart.graphics#hatchFill}.
 */
public class HatchFill extends PatternFill {

    public HatchFill() {
        js.setLength(0);
        js.append("var hatchFill").append(++variableIndex).append(" = anychart.graphics.vector.hatchFill();");
        jsBase = "hatchFill" + variableIndex;
    }

    protected HatchFill(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected HatchFill(StringBuilder js, String jsBase, boolean isChain) {
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
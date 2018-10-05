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
 * Class representing independent clip, that can be applied to any element.<br/>
Used to set one clip to many elements, and updates only clip.
 */
public class Clip extends JsObject {

    protected Clip() {

    }

    public static Clip instantiate() {
        return new Clip("new anychart.graphics.vector.clip()");
    }

    

    public Clip(String jsChart) {
        jsBase = "clip" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Disposes a clip. Removes it and its children from defs, clears the clip for managed elements.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Getter for the shape of the clip.
     */
    public com.anychart.graphics.vector.Shape shape() {
        return new com.anychart.graphics.vector.Shape(jsBase + ".shape()");
    }
    /**
     * Setter for the shape of the clip.
     */
    public com.anychart.graphics.vector.Clip shape(Number[] shape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shape(%s);", Arrays.toString(shape)));

        return this;
    }
    /**
     * Setter for the shape of the clip.
     */
    public com.anychart.graphics.vector.Clip shape(com.anychart.graphics.vector.Shape shape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shape(%s);", (shape != null) ? shape.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the shape of the clip.
     */
    public com.anychart.graphics.vector.Clip shape(com.anychart.graphics.math.Rect shape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shape(%s);", (shape != null) ? shape.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the shape of the clip.
     */
    public com.anychart.graphics.vector.Clip shape(String shape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shape(%s);", wrapQuotes(shape)));

        return this;
    }
    /**
     * Setter for the shape of the clip with coordinates.
     */
    public com.anychart.graphics.vector.Clip shape(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shape(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }

}
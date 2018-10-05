package com.anychart.graphics.math;

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
 * A class for representing coordinates and positions.
 */
public class Coordinate extends JsObject {

    protected Coordinate() {

    }

    public static Coordinate instantiate() {
        return new Coordinate("new anychart.graphics.math.coordinate()");
    }

    

    public Coordinate(String jsChart) {
        jsBase = "coordinate" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the X-coordinate.
     */
    public void getX() {
        APIlib.getInstance().addJSLine(jsBase + ".getX();");
    }
    /**
     * Getter for the Y-coordinate.
     */
    public void getY() {
        APIlib.getInstance().addJSLine(jsBase + ".getY();");
    }

}
package com.anychart.graphics.math;

import com.anychart.APIlib;
import com.anychart.JsObject;

// class
/**
 * Rectangle class.
 */
public class Rect extends JsObject {

    protected Rect() {

    }

    public static Rect instantiate() {
        return new Rect("new anychart.graphics.math.rect()");
    }

    

    public Rect(String jsChart) {
        jsBase = "rect" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the bottom of a rectangle.
     */
    public void getBottom() {
        APIlib.getInstance().addJSLine(jsBase + ".getBottom();");
    }
    /**
     * Getter for the height of a rectangle.
     */
    public void getHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".getHeight();");
    }
    /**
     * Getter for the X-coordinate of the left side of a rectangle.
     */
    public void getLeft() {
        APIlib.getInstance().addJSLine(jsBase + ".getLeft();");
    }
    /**
     * Getter for the X-coordinate of the right side of a rectangle.
     */
    public void getRight() {
        APIlib.getInstance().addJSLine(jsBase + ".getRight();");
    }
    /**
     * Getter for the top of a rectangle.
     */
    public void getTop() {
        APIlib.getInstance().addJSLine(jsBase + ".getTop();");
    }
    /**
     * Getter for the width of a rectangle.
     */
    public void getWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".getWidth();");
    }

}
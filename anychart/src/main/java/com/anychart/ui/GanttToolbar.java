package com.anychart.ui;

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
 * The GanttToolbar class contains methods for configuring toolbar.<br/>
Toolbar is a part of Gantt chart. Toolbar contains menu Print with options print A4 - A0, buttons ZoomIn, ZoomOut,
FitAll, ExpandAll/CollapseAll and menu with option Save As (SVG, PNG, JPG, PDF).
 */
public class GanttToolbar extends JsObject {

    protected GanttToolbar() {

    }

    public static GanttToolbar instantiate() {
        return new GanttToolbar("new anychart.ui.ganttToolbar()");
    }

    

    public GanttToolbar(String jsChart) {
        jsBase = "ganttToolbar" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the Gantt chart toolbar container.
     */
    public void container() {
        APIlib.getInstance().addJSLine(jsBase + ".container();");
    }
    /**
     * Setter for the Gantt chart toolbar container.
     */
    public com.anychart.ui.GanttToolbar container(String element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(element)));

        return this;
    }
    /**
     * Draws Gantt chart toolbar.
     */
    public com.anychart.ui.GanttToolbar draw() {
        APIlib.getInstance().addJSLine(jsBase + ".draw();");

        return this;
    }
    /**
     * Getter for the print paper sizes.
     */
    public void printPaperSizes() {
        APIlib.getInstance().addJSLine(jsBase + ".printPaperSizes();");
    }
    /**
     * Setter for the print paper sizes.
     */
    public com.anychart.ui.GanttToolbar printPaperSizes(com.anychart.graphics.vector.PaperSize[] paperSizeList) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".printPaperSizes(%s);", arrayToString(paperSizeList)));

        return this;
    }
    /**
     * Getter for the toolbar target.
     */
    public com.anychart.core.Chart target() {
        return new com.anychart.core.Chart(jsBase + ".target()");
    }
    /**
     * Setter for the toolbar target.
     */
    public com.anychart.ui.GanttToolbar target(com.anychart.core.Chart target) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".target(%s);", (target != null) ? target.getJsBase() : null));

        return this;
    }

}
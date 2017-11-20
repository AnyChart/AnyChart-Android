package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Fibonacci Fan annotation.
 */
public class FibonacciFan extends FibonacciBase {

    public FibonacciFan() {
        js.setLength(0);
        js.append("var fibonacciFan").append(++variableIndex).append(" = anychart.core.annotations.fibonacciFan();");
        jsBase = "fibonacciFan" + variableIndex;
    }

    protected FibonacciFan(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected FibonacciFan(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Stroke grid;
    private ColoredFill grid1;
    private String grid2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<FibonacciFan> setGrid = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public FibonacciFan setGrid(Stroke grid, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid = grid;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.grid = grid;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid() {
        if (!setGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciFan item : setGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<FibonacciFan> setGrid1 = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public FibonacciFan setGrid(ColoredFill grid1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid1 = grid1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.grid1 = grid1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid1() {
        if (!setGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciFan item : setGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<FibonacciFan> setGrid2 = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public FibonacciFan setGrid(String grid2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid2 = grid2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.grid2 = grid2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid2() {
        if (!setGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciFan item : setGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetGrid());
        js.append(generateJSsetGrid1());
        js.append(generateJSsetGrid2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
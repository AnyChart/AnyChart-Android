package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * OHLC Series Class.<br/>
{docs:Stock_Charts/Series/OHLC}Learn more about OHLC series{docs}
 */
public class ScrollerseriesOHLC extends ScrollerseriesDiscreteBase {

    public ScrollerseriesOHLC() {
        js.setLength(0);
        js.append("var scrollerseriesOHLC").append(++variableIndex).append(" = anychart.core.stock.scrollerSeries.oHLC();");
        jsBase = "scrollerseriesOHLC" + variableIndex;
    }

    protected ScrollerseriesOHLC(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollerseriesOHLC(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Stroke fallingStroke;
    private ColoredFill fallingStroke1;
    private String fallingStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<ScrollerseriesOHLC> setFallingStroke = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setFallingStroke(Stroke fallingStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke != null) ? fallingStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke != null) ? fallingStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke() {
        if (!setFallingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setFallingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setFallingStroke1 = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setFallingStroke(ColoredFill fallingStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke1 != null) ? fallingStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke1 != null) ? fallingStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke1() {
        if (!setFallingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setFallingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setFallingStroke2 = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setFallingStroke(String fallingStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(fallingStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(fallingStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke2() {
        if (!setFallingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setFallingStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke risingStroke;
    private ColoredFill risingStroke1;
    private String risingStroke2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<ScrollerseriesOHLC> setRisingStroke = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setRisingStroke(Stroke risingStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke = risingStroke;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke = risingStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke != null) ? risingStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke != null) ? risingStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke() {
        if (!setRisingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setRisingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setRisingStroke1 = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setRisingStroke(ColoredFill risingStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke1 = risingStroke1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke1 = risingStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke1 != null) ? risingStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke1 != null) ? risingStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke1() {
        if (!setRisingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setRisingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setRisingStroke2 = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScrollerseriesOHLC setRisingStroke(String risingStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke2 = risingStroke2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke2 = risingStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(risingStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(risingStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke2() {
        if (!setRisingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setRisingStroke2) {
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

        js.append(generateJSsetFallingStroke());
        js.append(generateJSsetFallingStroke1());
        js.append(generateJSsetFallingStroke2());
        js.append(generateJSsetRisingStroke());
        js.append(generateJSsetRisingStroke1());
        js.append(generateJSsetRisingStroke2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
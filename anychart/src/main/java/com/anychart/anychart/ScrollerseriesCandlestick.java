package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Candlestick Series Class.<br/>
{docs:Stock_Charts/Series/Japanese_Candlestick}Learn more about Candlestick series{docs}
 */
public class ScrollerseriesCandlestick extends ScrollerseriesOHLC {

    public ScrollerseriesCandlestick() {
        js.setLength(0);
        js.append("var scrollerseriesCandlestick").append(++variableIndex).append(" = anychart.core.stock.scrollerSeries.candlestick();");
        jsBase = "scrollerseriesCandlestick" + variableIndex;
    }

    protected ScrollerseriesCandlestick(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollerseriesCandlestick(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fallingFill;
    private List<ScrollerseriesCandlestick> setFallingFill = new ArrayList<>();

    /**
     * Setter for the falling fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill() {
        if (!setFallingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<ScrollerseriesCandlestick> setFallingFill1 = new ArrayList<>();

    /**
     * Falling fill color with opacity.
     */
    public ScrollerseriesCandlestick fallingFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill1() {
        if (!setFallingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<ScrollerseriesCandlestick> setFallingFill2 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill2() {
        if (!setFallingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill3 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill3() {
        if (!setFallingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill4 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill4() {
        if (!setFallingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill5 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill5() {
        if (!setFallingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill6 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill6() {
        if (!setFallingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill7 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill7() {
        if (!setFallingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<ScrollerseriesCandlestick> setFallingFill8 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill8() {
        if (!setFallingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setFallingFill9 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick fallingFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill9() {
        if (!setFallingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setFallingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private PatternFill getFallingHatchFill;

    /**
     * Getter for the falling hatch fill settings.
     */
    public PatternFill getFallingHatchFill() {
        if (getFallingHatchFill == null)
            getFallingHatchFill = new PatternFill(jsBase + ".fallingHatchFill()");

        return getFallingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color1;
    private Double thickness;
    private Double size;
    private List<ScrollerseriesBase> setFallingHatchFill = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setFallingHatchFill(PatternFill patternFillOrTypeOrState, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setFallingHatchFill" + variableIndex);
        setFallingHatchFill.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill() {
        if (!setFallingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setFallingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setFallingHatchFill1 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setFallingHatchFill(HatchFill patternFillOrTypeOrState1, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setFallingHatchFill1" + variableIndex);
        setFallingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill1() {
        if (!setFallingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setFallingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setFallingHatchFill2 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setFallingHatchFill(HatchFillType patternFillOrTypeOrState2, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setFallingHatchFill2" + variableIndex);
        setFallingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill2() {
        if (!setFallingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setFallingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setFallingHatchFill3 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setFallingHatchFill(String patternFillOrTypeOrState3, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setFallingHatchFill3" + variableIndex);
        setFallingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill3() {
        if (!setFallingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setFallingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setFallingHatchFill4 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setFallingHatchFill(Boolean patternFillOrTypeOrState4, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setFallingHatchFill4" + variableIndex);
        setFallingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill4() {
        if (!setFallingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setFallingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill risingFill;
    private List<ScrollerseriesBase> setRisingFill = new ArrayList<>();

    /**
     * Setter for the rising fill settings using an object or a string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill" + variableIndex);
        setRisingFill.add(item);
        return item;
    }
    private String generateJSsetRisingFill() {
        if (!setRisingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Double opacity3;
    private List<ScrollerseriesBase> setRisingFill1 = new ArrayList<>();

    /**
     * Rising fill color with opacity.
     */
    public ScrollerseriesBase risingFill(String color2, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color2 = color2;
            this.opacity3 = opacity3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %f)", wrapQuotes(color2), opacity3));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill1" + variableIndex);
        setRisingFill1.add(item);
        return item;
    }
    private String generateJSsetRisingFill1() {
        if (!setRisingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;
    private List<ScrollerseriesBase> setRisingFill2 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill2" + variableIndex);
        setRisingFill2.add(item);
        return item;
    }
    private String generateJSsetRisingFill2() {
        if (!setRisingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill3 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill3" + variableIndex);
        setRisingFill3.add(item);
        return item;
    }
    private String generateJSsetRisingFill3() {
        if (!setRisingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill4 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill4" + variableIndex);
        setRisingFill4.add(item);
        return item;
    }
    private String generateJSsetRisingFill4() {
        if (!setRisingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill5 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill5" + variableIndex);
        setRisingFill5.add(item);
        return item;
    }
    private String generateJSsetRisingFill5() {
        if (!setRisingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill6 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill6" + variableIndex);
        setRisingFill6.add(item);
        return item;
    }
    private String generateJSsetRisingFill6() {
        if (!setRisingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill7 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill7" + variableIndex);
        setRisingFill7.add(item);
        return item;
    }
    private String generateJSsetRisingFill7() {
        if (!setRisingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;
    private List<ScrollerseriesCandlestick> setRisingFill8 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick risingFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill8() {
        if (!setRisingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setRisingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setRisingFill9 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesCandlestick risingFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill9() {
        if (!setRisingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setRisingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private PatternFill getRisingHatchFill;

    /**
     * Getter for the rising hatch fill settings.
     */
    public PatternFill getRisingHatchFill() {
        if (getRisingHatchFill == null)
            getRisingHatchFill = new PatternFill(jsBase + ".risingHatchFill()");

        return getRisingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color3;
    private Double thickness1;
    private Double size1;
    private List<ScrollerseriesBase> setRisingHatchFill = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(PatternFill patternFillOrTypeOrState5, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill" + variableIndex);
        setRisingHatchFill.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill() {
        if (!setRisingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill1 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFill patternFillOrTypeOrState6, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill1" + variableIndex);
        setRisingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill1() {
        if (!setRisingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill2 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFillType patternFillOrTypeOrState7, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill2" + variableIndex);
        setRisingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill2() {
        if (!setRisingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill3 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(String patternFillOrTypeOrState8, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill3" + variableIndex);
        setRisingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill3() {
        if (!setRisingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill4 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(Boolean patternFillOrTypeOrState9, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState9, wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill4" + variableIndex);
        setRisingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill4() {
        if (!setRisingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetFallingHatchFill() {
        if (getFallingHatchFill != null) {
            return getFallingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingHatchFill() {
        if (getRisingHatchFill != null) {
            return getRisingHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetFallingHatchFill());
        jsGetters.append(generateJSgetRisingHatchFill());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetFallingFill());
        js.append(generateJSsetFallingFill1());
        js.append(generateJSsetFallingFill2());
        js.append(generateJSsetFallingFill3());
        js.append(generateJSsetFallingFill4());
        js.append(generateJSsetFallingFill5());
        js.append(generateJSsetFallingFill6());
        js.append(generateJSsetFallingFill7());
        js.append(generateJSsetFallingFill8());
        js.append(generateJSsetFallingFill9());
        js.append(generateJSsetFallingHatchFill());
        js.append(generateJSsetFallingHatchFill1());
        js.append(generateJSsetFallingHatchFill2());
        js.append(generateJSsetFallingHatchFill3());
        js.append(generateJSsetFallingHatchFill4());
        js.append(generateJSsetRisingFill());
        js.append(generateJSsetRisingFill1());
        js.append(generateJSsetRisingFill2());
        js.append(generateJSsetRisingFill3());
        js.append(generateJSsetRisingFill4());
        js.append(generateJSsetRisingFill5());
        js.append(generateJSsetRisingFill6());
        js.append(generateJSsetRisingFill7());
        js.append(generateJSsetRisingFill8());
        js.append(generateJSsetRisingFill9());
        js.append(generateJSsetRisingHatchFill());
        js.append(generateJSsetRisingHatchFill1());
        js.append(generateJSsetRisingHatchFill2());
        js.append(generateJSsetRisingHatchFill3());
        js.append(generateJSsetRisingHatchFill4());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
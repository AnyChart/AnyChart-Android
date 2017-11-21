package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Scroll bar.
 */
public class ScrollBar extends VisualBaseWithBounds {

    public ScrollBar() {
        js.setLength(0);
        js.append("var scrollBar").append(++variableIndex).append(" = anychart.core.ui.scrollBar();");
        jsBase = "scrollBar" + variableIndex;
    }

    protected ScrollBar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollBar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill backgroundFill;
    private List<ScrollBar> setBackgroundFill = new ArrayList<>();

    /**
     * Setter for background fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar setBackgroundFill(Fill backgroundFill) {
        if (jsBase == null) {
            this.backgroundFill = backgroundFill;
        } else {
            this.backgroundFill = backgroundFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill() {
        if (!setBackgroundFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<ScrollBar> setBackgroundFill1 = new ArrayList<>();

    /**
     * Background fill color with opacity.
     */
    public ScrollBar backgroundFill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill1() {
        if (!setBackgroundFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill1) {
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
    private List<ScrollBar> setBackgroundFill2 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill2() {
        if (!setBackgroundFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill3 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill3() {
        if (!setBackgroundFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill4 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill4() {
        if (!setBackgroundFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill5 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill5() {
        if (!setBackgroundFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill6 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill6() {
        if (!setBackgroundFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill7 = new ArrayList<>();

    /**
     * Linear gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(String[] keys1, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill7() {
        if (!setBackgroundFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill7) {
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
    private List<ScrollBar> setBackgroundFill8 = new ArrayList<>();

    /**
     * Radial gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill8() {
        if (!setBackgroundFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundFill9 = new ArrayList<>();

    /**
     * Radial gradient fill for background.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar backgroundFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill9() {
        if (!setBackgroundFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<ScrollBar> setBackgroundStroke = new ArrayList<>();

    /**
     * Setter for the background stroke.
     */
    public ScrollBar setBackgroundStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundStroke() {
        if (!setBackgroundStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundStroke1 = new ArrayList<>();

    /**
     * Setter for the background stroke.
     */
    public ScrollBar setBackgroundStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundStroke1() {
        if (!setBackgroundStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setBackgroundStroke2 = new ArrayList<>();

    /**
     * Setter for the background stroke.
     */
    public ScrollBar setBackgroundStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundStroke2() {
        if (!setBackgroundStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBackgroundStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double barSize;
    private List<ScrollBar> setBarSize = new ArrayList<>();

    /**
     * Setter for the bar size.
     */
    public ScrollBar setBarSize(Double barSize) {
        if (jsBase == null) {
            this.barSize = barSize;
        } else {
            this.barSize = barSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".barSize(%f)", barSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".barSize(%f)", barSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBarSize() {
        if (!setBarSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setBarSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean buttonsVisible;
    private List<ScrollBar> setButtonsVisible = new ArrayList<>();

    /**
     * Setter for the adding/removing the scroll button from the scroll bar.
     */
    public ScrollBar setButtonsVisible(Boolean buttonsVisible) {
        if (jsBase == null) {
            this.buttonsVisible = buttonsVisible;
        } else {
            this.buttonsVisible = buttonsVisible;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".buttonsVisible(%b)", buttonsVisible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".buttonsVisible(%b)", buttonsVisible));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetButtonsVisible() {
        if (!setButtonsVisible.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setButtonsVisible) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double mouseOutOpacity;
    private List<ScrollBar> setMouseOutOpacity = new ArrayList<>();

    /**
     * Setter for the mouse out opacity.
     */
    public ScrollBar setMouseOutOpacity(Double mouseOutOpacity) {
        if (jsBase == null) {
            this.mouseOutOpacity = mouseOutOpacity;
        } else {
            this.mouseOutOpacity = mouseOutOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mouseOutOpacity(%f)", mouseOutOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mouseOutOpacity(%f)", mouseOutOpacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMouseOutOpacity() {
        if (!setMouseOutOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setMouseOutOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double mouseOverOpacity;
    private List<ScrollBar> setMouseOverOpacity = new ArrayList<>();

    /**
     * Setter for the mouse over opacity.
     */
    public ScrollBar setMouseOverOpacity(Double mouseOverOpacity) {
        if (jsBase == null) {
            this.mouseOverOpacity = mouseOverOpacity;
        } else {
            this.mouseOverOpacity = mouseOverOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mouseOverOpacity(%f)", mouseOverOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mouseOverOpacity(%f)", mouseOverOpacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMouseOverOpacity() {
        if (!setMouseOverOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setMouseOverOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill sliderFill;
    private List<ScrollBar> setSliderFill = new ArrayList<>();

    /**
     * Setter for slider fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar setSliderFill(Fill sliderFill) {
        if (jsBase == null) {
            this.sliderFill = sliderFill;
        } else {
            this.sliderFill = sliderFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s)", ((sliderFill != null) ? sliderFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s)", ((sliderFill != null) ? sliderFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill() {
        if (!setSliderFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color1;
    private Double opacity3;
    private List<ScrollBar> setSliderFill1 = new ArrayList<>();

    /**
     * Slider fill color with opacity.
     */
    public ScrollBar sliderFill(String color1, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color1 = color1;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s, %f)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f)", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill1() {
        if (!setSliderFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill1) {
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
    private List<ScrollBar> setSliderFill2 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(GradientKey[] keys4, Double angle1, Double opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill2() {
        if (!setSliderFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill3 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(GradientKey[] keys4, Double angle1, Double opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill3() {
        if (!setSliderFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill4 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(GradientKey[] keys4, Double angle1, Double opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill4() {
        if (!setSliderFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill5 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(String[] keys5, Double angle1, Double opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill5() {
        if (!setSliderFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill6 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(String[] keys5, Double angle1, Double opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill6() {
        if (!setSliderFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill7 = new ArrayList<>();

    /**
     * Linear gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(String[] keys5, Double angle1, Double opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill7() {
        if (!setSliderFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill7) {
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
    private List<ScrollBar> setSliderFill8 = new ArrayList<>();

    /**
     * Radial gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill8() {
        if (!setSliderFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderFill9 = new ArrayList<>();

    /**
     * Radial gradient fill for slider.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollBar sliderFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderFill9() {
        if (!setSliderFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private Stroke stroke3;
    private ColoredFill stroke4;
    private String stroke5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<ScrollBar> setSliderStroke = new ArrayList<>();

    /**
     * Setter for the slider stroke.
     */
    public ScrollBar setSliderStroke(Stroke stroke3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke3 = stroke3;
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
            this.stroke3 = stroke3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderStroke() {
        if (!setSliderStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderStroke1 = new ArrayList<>();

    /**
     * Setter for the slider stroke.
     */
    public ScrollBar setSliderStroke(ColoredFill stroke4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke4 = stroke4;
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
            this.stroke4 = stroke4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", ((stroke4 != null) ? stroke4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", ((stroke4 != null) ? stroke4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderStroke1() {
        if (!setSliderStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollBar> setSliderStroke2 = new ArrayList<>();

    /**
     * Setter for the slider stroke.
     */
    public ScrollBar setSliderStroke(String stroke5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke5 = stroke5;
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
            this.stroke5 = stroke5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sliderStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSliderStroke2() {
        if (!setSliderStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollBar item : setSliderStroke2) {
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

        js.append(generateJSsetBackgroundFill());
        js.append(generateJSsetBackgroundFill1());
        js.append(generateJSsetBackgroundFill2());
        js.append(generateJSsetBackgroundFill3());
        js.append(generateJSsetBackgroundFill4());
        js.append(generateJSsetBackgroundFill5());
        js.append(generateJSsetBackgroundFill6());
        js.append(generateJSsetBackgroundFill7());
        js.append(generateJSsetBackgroundFill8());
        js.append(generateJSsetBackgroundFill9());
        js.append(generateJSsetBackgroundStroke());
        js.append(generateJSsetBackgroundStroke1());
        js.append(generateJSsetBackgroundStroke2());
        js.append(generateJSsetBarSize());
        js.append(generateJSsetButtonsVisible());
        js.append(generateJSsetMouseOutOpacity());
        js.append(generateJSsetMouseOverOpacity());
        js.append(generateJSsetSliderFill());
        js.append(generateJSsetSliderFill1());
        js.append(generateJSsetSliderFill2());
        js.append(generateJSsetSliderFill3());
        js.append(generateJSsetSliderFill4());
        js.append(generateJSsetSliderFill5());
        js.append(generateJSsetSliderFill6());
        js.append(generateJSsetSliderFill7());
        js.append(generateJSsetSliderFill8());
        js.append(generateJSsetSliderFill9());
        js.append(generateJSsetSliderStroke());
        js.append(generateJSsetSliderStroke1());
        js.append(generateJSsetSliderStroke2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
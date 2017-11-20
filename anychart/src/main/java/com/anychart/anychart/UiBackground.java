package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Background element class.<br/>
Background can be a part of another complex element (chart, legend, title and so on),
or used separately.<br/>
Background has a fill, a border and corner shape settings.<br/>
<b>Note:</b> Always specify display bounds if you use Background separately.
 */
public class UiBackground extends VisualBaseWithBounds {

    public UiBackground() {
        js.setLength(0);
        js.append("var uiBackground").append(++variableIndex).append(" = anychart.core.ui.background();");
        jsBase = "uiBackground" + variableIndex;
    }

    protected UiBackground(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiBackground(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Stroke bottomStroke;
    private ColoredFill bottomStroke1;
    private String bottomStroke2;
    private List<UiBackground> setBottomStroke = new ArrayList<>();

    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public UiBackground setBottomStroke(Stroke bottomStroke) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke = bottomStroke;
        } else {
            this.bottomStroke = bottomStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomStroke(%s)", ((bottomStroke != null) ? bottomStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomStroke(%s)", ((bottomStroke != null) ? bottomStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottomStroke() {
        if (!setBottomStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setBottomStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setBottomStroke1 = new ArrayList<>();

    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public UiBackground setBottomStroke(ColoredFill bottomStroke1) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke1 = bottomStroke1;
        } else {
            this.bottomStroke1 = bottomStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomStroke(%s)", ((bottomStroke1 != null) ? bottomStroke1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomStroke(%s)", ((bottomStroke1 != null) ? bottomStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottomStroke1() {
        if (!setBottomStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setBottomStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setBottomStroke2 = new ArrayList<>();

    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public UiBackground setBottomStroke(String bottomStroke2) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke2 = bottomStroke2;
        } else {
            this.bottomStroke2 = bottomStroke2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomStroke(%s)", wrapQuotes(bottomStroke2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomStroke(%s)", wrapQuotes(bottomStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottomStroke2() {
        if (!setBottomStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setBottomStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke bottomStroke3;
    private String bottomStroke4;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<UiBackground> setBottomStroke3 = new ArrayList<>();

    /**
     * Setter for bottom stroke settings.
     */
    public UiBackground setBottomStroke(Stroke bottomStroke3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            this.bottomStroke3 = null;
            this.bottomStroke4 = null;
            
            this.bottomStroke3 = bottomStroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.bottomStroke3 = bottomStroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomStroke(%s, %f, %s, %s, %s)", ((bottomStroke3 != null) ? bottomStroke3.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomStroke(%s, %f, %s, %s, %s)", ((bottomStroke3 != null) ? bottomStroke3.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottomStroke3() {
        if (!setBottomStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setBottomStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setBottomStroke4 = new ArrayList<>();

    /**
     * Setter for bottom stroke settings.
     */
    public UiBackground setBottomStroke(String bottomStroke4, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            this.bottomStroke3 = null;
            this.bottomStroke4 = null;
            
            this.bottomStroke4 = bottomStroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.bottomStroke4 = bottomStroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomStroke(%s, %f, %s, %s, %s)", wrapQuotes(bottomStroke4), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomStroke(%s, %f, %s, %s, %s)", wrapQuotes(bottomStroke4), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottomStroke4() {
        if (!setBottomStroke4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setBottomStroke4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private BackgroundCornersType cornerType;
    private String cornerType1;
    private List<UiBackground> setCornerType = new ArrayList<>();

    /**
     * Setter for the corner type.
     */
    public UiBackground setCornerType(BackgroundCornersType cornerType) {
        if (jsBase == null) {
            this.cornerType = null;
            this.cornerType1 = null;
            
            this.cornerType = cornerType;
        } else {
            this.cornerType = cornerType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cornerType(%s)", ((cornerType != null) ? cornerType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornerType(%s)", ((cornerType != null) ? cornerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornerType() {
        if (!setCornerType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCornerType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setCornerType1 = new ArrayList<>();

    /**
     * Setter for the corner type.
     */
    public UiBackground setCornerType(String cornerType1) {
        if (jsBase == null) {
            this.cornerType = null;
            this.cornerType1 = null;
            
            this.cornerType1 = cornerType1;
        } else {
            this.cornerType1 = cornerType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cornerType(%s)", wrapQuotes(cornerType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornerType(%s)", wrapQuotes(cornerType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornerType1() {
        if (!setCornerType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCornerType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double corners;
    private String corners1;
    private Double[] corners2;
    private List<UiBackground> setCorners = new ArrayList<>();

    /**
     * Setter for the corner radius by one value.
     */
    public UiBackground setCorners(Double[] corners2) {
        if (jsBase == null) {
            this.corners = null;
            this.corners1 = null;
            this.corners2 = null;
            
            this.corners2 = corners2;
        } else {
            this.corners2 = corners2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".corners(%s)", Arrays.toString(corners2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".corners(%s)", Arrays.toString(corners2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCorners() {
        if (!setCorners.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCorners) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setCorners1 = new ArrayList<>();

    /**
     * Setter for the corner radius by one value.
     */
    public UiBackground setCorners(String corners1) {
        if (jsBase == null) {
            this.corners = null;
            this.corners1 = null;
            this.corners2 = null;
            
            this.corners1 = corners1;
        } else {
            this.corners1 = corners1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".corners(%s)", wrapQuotes(corners1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".corners(%s)", wrapQuotes(corners1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCorners1() {
        if (!setCorners1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCorners1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double topLeft;
    private String topLeft1;
    private Double topRight;
    private String topRight1;
    private Double bottomRight;
    private String bottomRight1;
    private Double bottomLeft;
    private String bottomLeft1;
    private List<UiBackground> setCorners2 = new ArrayList<>();

    /**
     * Setter for the corner radius by each value.
     */
    public UiBackground setCorners(String topLeft1, String topRight1, String bottomRight1, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight1 = topRight1;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft1 = bottomLeft1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".corners(%s, %s, %s, %s)", wrapQuotes(topLeft1), wrapQuotes(topRight1), wrapQuotes(bottomRight1), wrapQuotes(bottomLeft1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".corners(%s, %s, %s, %s)", wrapQuotes(topLeft1), wrapQuotes(topRight1), wrapQuotes(bottomRight1), wrapQuotes(bottomLeft1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCorners2() {
        if (!setCorners2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCorners2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setCorners3 = new ArrayList<>();

    /**
     * Setter for the corner radius by each value.
     */
    public UiBackground setCorners(Double topLeft, Double topRight, Double bottomRight, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomRight = bottomRight;
            this.bottomLeft = bottomLeft;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".corners(%f, %f, %f, %f)", topLeft, topRight, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".corners(%f, %f, %f, %f)", topLeft, topRight, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCorners3() {
        if (!setCorners3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setCorners3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<UiBackground> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an object or a string.<br/>
Accepts:
<ul>
<li>{@link anychart.graphics.vector.LinearGradientFill}</li>
<li>{@link anychart.graphics.vector.RadialGradientFill}</li>
<li>{@link anychart.graphics.vector.Fill}</li>
<li>{@link anychart.graphics.vector.ImageFill}</li>
</ul>
or a color as a string, along with opacity, if needed, format is "<b>Color Opacity</b>",
e.g. "red 0.5".
     */
    public UiBackground setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<UiBackground> setFill1 = new ArrayList<>();

    /**
     * Fill as a color with opacity.
     */
    public UiBackground fill(String color, Double opacity) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill1) {
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
    private List<UiBackground> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill7) {
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
    private List<UiBackground> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
     */
    public UiBackground fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
     */
    public UiBackground fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke leftStroke;
    private String leftStroke1;
    private List<UiBackground> setLeftStroke = new ArrayList<>();

    /**
     * Setter for left stroke settings using one parameter.
     */
    public UiBackground setLeftStroke(Stroke leftStroke) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            
            this.leftStroke = leftStroke;
        } else {
            this.leftStroke = leftStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".leftStroke(%s)", ((leftStroke != null) ? leftStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftStroke(%s)", ((leftStroke != null) ? leftStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeftStroke() {
        if (!setLeftStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setLeftStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setLeftStroke1 = new ArrayList<>();

    /**
     * Setter for left stroke settings using one parameter.
     */
    public UiBackground setLeftStroke(String leftStroke1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            
            this.leftStroke1 = leftStroke1;
        } else {
            this.leftStroke1 = leftStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".leftStroke(%s)", wrapQuotes(leftStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftStroke(%s)", wrapQuotes(leftStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeftStroke1() {
        if (!setLeftStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setLeftStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke leftStroke2;
    private String leftStroke3;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<UiBackground> setLeftStroke2 = new ArrayList<>();

    /**
     * Setter for left stroke settings.
     */
    public UiBackground setLeftStroke(Stroke leftStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            this.leftStroke2 = null;
            this.leftStroke3 = null;
            
            this.leftStroke2 = leftStroke2;
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
            this.leftStroke2 = leftStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".leftStroke(%s, %f, %s, %s, %s)", ((leftStroke2 != null) ? leftStroke2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftStroke(%s, %f, %s, %s, %s)", ((leftStroke2 != null) ? leftStroke2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeftStroke2() {
        if (!setLeftStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setLeftStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setLeftStroke3 = new ArrayList<>();

    /**
     * Setter for left stroke settings.
     */
    public UiBackground setLeftStroke(String leftStroke3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            this.leftStroke2 = null;
            this.leftStroke3 = null;
            
            this.leftStroke3 = leftStroke3;
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
            this.leftStroke3 = leftStroke3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".leftStroke(%s, %f, %s, %s, %s)", wrapQuotes(leftStroke3), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftStroke(%s, %f, %s, %s, %s)", wrapQuotes(leftStroke3), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeftStroke3() {
        if (!setLeftStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setLeftStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke rightStroke;
    private ColoredFill rightStroke1;
    private String rightStroke2;
    private List<UiBackground> setRightStroke = new ArrayList<>();

    /**
     * Setter for right stroke settings using one parameter.
     */
    public UiBackground setRightStroke(Stroke rightStroke) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke = rightStroke;
        } else {
            this.rightStroke = rightStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rightStroke(%s)", ((rightStroke != null) ? rightStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightStroke(%s)", ((rightStroke != null) ? rightStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRightStroke() {
        if (!setRightStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setRightStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setRightStroke1 = new ArrayList<>();

    /**
     * Setter for right stroke settings using one parameter.
     */
    public UiBackground setRightStroke(ColoredFill rightStroke1) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke1 = rightStroke1;
        } else {
            this.rightStroke1 = rightStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rightStroke(%s)", ((rightStroke1 != null) ? rightStroke1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightStroke(%s)", ((rightStroke1 != null) ? rightStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRightStroke1() {
        if (!setRightStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setRightStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setRightStroke2 = new ArrayList<>();

    /**
     * Setter for right stroke settings using one parameter.
     */
    public UiBackground setRightStroke(String rightStroke2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke2 = rightStroke2;
        } else {
            this.rightStroke2 = rightStroke2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rightStroke(%s)", wrapQuotes(rightStroke2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightStroke(%s)", wrapQuotes(rightStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRightStroke2() {
        if (!setRightStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setRightStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke rightStroke3;
    private String rightStroke4;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;
    private List<UiBackground> setRightStroke3 = new ArrayList<>();

    /**
     * Setter for right stroke settings.
     */
    public UiBackground setRightStroke(Stroke rightStroke3, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            this.rightStroke3 = null;
            this.rightStroke4 = null;
            
            this.rightStroke3 = rightStroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.rightStroke3 = rightStroke3;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rightStroke(%s, %f, %s, %s, %s)", ((rightStroke3 != null) ? rightStroke3.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightStroke(%s, %f, %s, %s, %s)", ((rightStroke3 != null) ? rightStroke3.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRightStroke3() {
        if (!setRightStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setRightStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setRightStroke4 = new ArrayList<>();

    /**
     * Setter for right stroke settings.
     */
    public UiBackground setRightStroke(String rightStroke4, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            this.rightStroke3 = null;
            this.rightStroke4 = null;
            
            this.rightStroke4 = rightStroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.rightStroke4 = rightStroke4;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rightStroke(%s, %f, %s, %s, %s)", wrapQuotes(rightStroke4), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightStroke(%s, %f, %s, %s, %s)", wrapQuotes(rightStroke4), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRightStroke4() {
        if (!setRightStroke4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setRightStroke4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private List<UiBackground> setStroke = new ArrayList<>();

    /**
     * Setter for stroke settings using one parameter.
     */
    public UiBackground setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
        } else {
            this.stroke = stroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s)", ((stroke != null) ? stroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", ((stroke != null) ? stroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings using one parameter.
     */
    public UiBackground setStroke(ColoredFill stroke1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
        } else {
            this.stroke1 = stroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s)", ((stroke1 != null) ? stroke1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", ((stroke1 != null) ? stroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setStroke2 = new ArrayList<>();

    /**
     * Setter for stroke settings using one parameter.
     */
    public UiBackground setStroke(String stroke2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
        } else {
            this.stroke2 = stroke2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s)", wrapQuotes(stroke2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", wrapQuotes(stroke2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke3;
    private String stroke4;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;
    private List<UiBackground> setStroke3 = new ArrayList<>();

    /**
     * Setter for stroke settings.
     */
    public UiBackground setStroke(Stroke stroke3, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            
            this.stroke3 = stroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.stroke3 = stroke3;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke3() {
        if (!setStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setStroke4 = new ArrayList<>();

    /**
     * Setter for stroke settings.
     */
    public UiBackground setStroke(String stroke4, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            
            this.stroke4 = stroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.stroke4 = stroke4;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke4), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke4), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke4() {
        if (!setStroke4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setStroke4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke topStroke;
    private ColoredFill topStroke1;
    private String topStroke2;
    private List<UiBackground> setTopStroke = new ArrayList<>();

    /**
     * Setter for top stroke settings using one parameter.
     */
    public UiBackground setTopStroke(Stroke topStroke) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke = topStroke;
        } else {
            this.topStroke = topStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topStroke(%s)", ((topStroke != null) ? topStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topStroke(%s)", ((topStroke != null) ? topStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopStroke() {
        if (!setTopStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setTopStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setTopStroke1 = new ArrayList<>();

    /**
     * Setter for top stroke settings using one parameter.
     */
    public UiBackground setTopStroke(ColoredFill topStroke1) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke1 = topStroke1;
        } else {
            this.topStroke1 = topStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topStroke(%s)", ((topStroke1 != null) ? topStroke1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topStroke(%s)", ((topStroke1 != null) ? topStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopStroke1() {
        if (!setTopStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setTopStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setTopStroke2 = new ArrayList<>();

    /**
     * Setter for top stroke settings using one parameter.
     */
    public UiBackground setTopStroke(String topStroke2) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke2 = topStroke2;
        } else {
            this.topStroke2 = topStroke2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topStroke(%s)", wrapQuotes(topStroke2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topStroke(%s)", wrapQuotes(topStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopStroke2() {
        if (!setTopStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setTopStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke topStroke3;
    private String topStroke4;
    private Double thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;
    private List<UiBackground> setTopStroke3 = new ArrayList<>();

    /**
     * Setter for top stroke settings.
     */
    public UiBackground setTopStroke(Stroke topStroke3, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            this.topStroke3 = null;
            this.topStroke4 = null;
            
            this.topStroke3 = topStroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.topStroke3 = topStroke3;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topStroke(%s, %f, %s, %s, %s)", ((topStroke3 != null) ? topStroke3.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topStroke(%s, %f, %s, %s, %s)", ((topStroke3 != null) ? topStroke3.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopStroke3() {
        if (!setTopStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setTopStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiBackground> setTopStroke4 = new ArrayList<>();

    /**
     * Setter for top stroke settings.
     */
    public UiBackground setTopStroke(String topStroke4, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            this.topStroke3 = null;
            this.topStroke4 = null;
            
            this.topStroke4 = topStroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.topStroke4 = topStroke4;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topStroke(%s, %f, %s, %s, %s)", wrapQuotes(topStroke4), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topStroke(%s, %f, %s, %s, %s)", wrapQuotes(topStroke4), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopStroke4() {
        if (!setTopStroke4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiBackground item : setTopStroke4) {
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

        js.append(generateJSsetBottomStroke());
        js.append(generateJSsetBottomStroke1());
        js.append(generateJSsetBottomStroke2());
        js.append(generateJSsetBottomStroke3());
        js.append(generateJSsetBottomStroke4());
        js.append(generateJSsetCornerType());
        js.append(generateJSsetCornerType1());
        js.append(generateJSsetCorners());
        js.append(generateJSsetCorners1());
        js.append(generateJSsetCorners2());
        js.append(generateJSsetCorners3());
        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetLeftStroke());
        js.append(generateJSsetLeftStroke1());
        js.append(generateJSsetLeftStroke2());
        js.append(generateJSsetLeftStroke3());
        js.append(generateJSsetRightStroke());
        js.append(generateJSsetRightStroke1());
        js.append(generateJSsetRightStroke2());
        js.append(generateJSsetRightStroke3());
        js.append(generateJSsetRightStroke4());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetStroke3());
        js.append(generateJSsetStroke4());
        js.append(generateJSsetTopStroke());
        js.append(generateJSsetTopStroke1());
        js.append(generateJSsetTopStroke2());
        js.append(generateJSsetTopStroke3());
        js.append(generateJSsetTopStroke4());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
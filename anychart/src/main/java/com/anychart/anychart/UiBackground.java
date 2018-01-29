package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", ((bottomStroke != null) ? bottomStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", ((bottomStroke1 != null) ? bottomStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", wrapQuotes(bottomStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke bottomStroke3;
    private String bottomStroke4;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for bottom stroke settings.
     */
    public UiBackground setBottomStroke(Stroke bottomStroke3, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".bottomStroke(%s, %s, %s, %s, %s)", ((bottomStroke3 != null) ? bottomStroke3.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", ((bottomStroke3 != null) ? bottomStroke3.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for bottom stroke settings.
     */
    public UiBackground setBottomStroke(String bottomStroke4, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".bottomStroke(%s, %s, %s, %s, %s)", wrapQuotes(bottomStroke4), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", wrapQuotes(bottomStroke4), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private BackgroundCornersType cornerType;
    private String cornerType1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornerType(%s);", ((cornerType != null) ? cornerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornerType(%s);", wrapQuotes(cornerType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number corners;
    private String corners1;
    private Number[] corners2;

    /**
     * Setter for the corner radius by one value.
     */
    public UiBackground setCorners(Number[] corners2) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s);", Arrays.toString(corners2)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s);", wrapQuotes(corners1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number topLeft;
    private String topLeft1;
    private Number topRight;
    private String topRight1;
    private Number bottomRight;
    private String bottomRight1;
    private Number bottomLeft;
    private String bottomLeft1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft1), wrapQuotes(topRight1), wrapQuotes(bottomRight1), wrapQuotes(bottomLeft1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the corner radius by each value.
     */
    public UiBackground setCorners(Number topLeft, Number topRight, Number bottomRight, Number bottomLeft) {
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
            
            js.append(String.format(Locale.US, ".corners(%s, %s, %s, %s)", topLeft, topRight, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, topRight, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public UiBackground setFill(String json) {
        if (jsBase == null) {
        } else {
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(json)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Number opacity;

    /**
     * Fill as a color with opacity.
     */
    public UiBackground fill(String color, Number opacity) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %s)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;

    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
     */
    public UiBackground fill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
     */
    public UiBackground fill(String[] keys1, Number angle, Number opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;

    /**
     * Radial gradient fill.
     */
    public UiBackground fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
     */
    public UiBackground fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke leftStroke;
    private String leftStroke1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s);", ((leftStroke != null) ? leftStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s);", wrapQuotes(leftStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke leftStroke2;
    private String leftStroke3;
    private Number thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for left stroke settings.
     */
    public UiBackground setLeftStroke(Stroke leftStroke2, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            js.append(String.format(Locale.US, ".leftStroke(%s, %s, %s, %s, %s)", ((leftStroke2 != null) ? leftStroke2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", ((leftStroke2 != null) ? leftStroke2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for left stroke settings.
     */
    public UiBackground setLeftStroke(String leftStroke3, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            js.append(String.format(Locale.US, ".leftStroke(%s, %s, %s, %s, %s)", wrapQuotes(leftStroke3), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", wrapQuotes(leftStroke3), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke rightStroke;
    private ColoredFill rightStroke1;
    private String rightStroke2;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", ((rightStroke != null) ? rightStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", ((rightStroke1 != null) ? rightStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", wrapQuotes(rightStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke rightStroke3;
    private String rightStroke4;
    private Number thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    /**
     * Setter for right stroke settings.
     */
    public UiBackground setRightStroke(Stroke rightStroke3, Number thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
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
            
            js.append(String.format(Locale.US, ".rightStroke(%s, %s, %s, %s, %s)", ((rightStroke3 != null) ? rightStroke3.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", ((rightStroke3 != null) ? rightStroke3.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for right stroke settings.
     */
    public UiBackground setRightStroke(String rightStroke4, Number thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
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
            
            js.append(String.format(Locale.US, ".rightStroke(%s, %s, %s, %s, %s)", wrapQuotes(rightStroke4), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", wrapQuotes(rightStroke4), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", ((stroke != null) ? stroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public UiBackground setStroke(String json) {
        if (jsBase == null) {
        } else {
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s)", wrapQuotes(json)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", ((stroke1 != null) ? stroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke stroke3;
    private String stroke4;
    private Number thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    /**
     * Setter for stroke settings.
     */
    public UiBackground setStroke(Stroke stroke3, Number thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
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
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((stroke3 != null) ? stroke3.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
     */
    public UiBackground setStroke(String stroke4, Number thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
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
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(stroke4), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(stroke4), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke topStroke;
    private ColoredFill topStroke1;
    private String topStroke2;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", ((topStroke != null) ? topStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", ((topStroke1 != null) ? topStroke1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", wrapQuotes(topStroke2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke topStroke3;
    private String topStroke4;
    private Number thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    /**
     * Setter for top stroke settings.
     */
    public UiBackground setTopStroke(Stroke topStroke3, Number thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
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
            
            js.append(String.format(Locale.US, ".topStroke(%s, %s, %s, %s, %s)", ((topStroke3 != null) ? topStroke3.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", ((topStroke3 != null) ? topStroke3.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for top stroke settings.
     */
    public UiBackground setTopStroke(String topStroke4, Number thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
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
            
            js.append(String.format(Locale.US, ".topStroke(%s, %s, %s, %s, %s)", wrapQuotes(topStroke4), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", wrapQuotes(topStroke4), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
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
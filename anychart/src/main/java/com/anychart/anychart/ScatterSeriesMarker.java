package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Define Marker series type.
Get instance by methods {@link anychart.charts.Scatter#marker}.
 */
public class ScatterSeriesMarker extends ScatterSeriesBase {

    public ScatterSeriesMarker() {
        js.setLength(0);
        js.append("var scatterSeriesMarker").append(++variableIndex).append(" = anychart.core.scatter.series.marker();");
        jsBase = "scatterSeriesMarker" + variableIndex;
    }

    protected ScatterSeriesMarker(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScatterSeriesMarker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker setFill(Fill fill) {
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

    private String color;
    private Double opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public ScatterSeriesMarker fill(String color, Double opacity) {
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

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScatterSeriesMarker fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScatterSeriesMarker setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScatterSeriesMarker setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType1.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScatterSeriesMarker setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScatterSeriesMarker setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double size1;

    /**
     * Setter for the marker size.
     */
    public ScatterSeriesMarker setSize(Double size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%f)", size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScatterSeriesMarker setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color2 = color2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScatterSeriesMarker setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScatterSeriesMarker setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private MarkerType type;
    private String type1;

    /**
     * Setter for marker type settings.
     */
    public ScatterSeriesMarker setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for marker type settings.
     */
    public ScatterSeriesMarker setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHatchFill());

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
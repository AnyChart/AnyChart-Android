package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class for the Gantt chart timeline.
 */
public class UiTimeline extends JsObject {

    public UiTimeline() {
        js.setLength(0);
        js.append("var uiTimeline").append(++variableIndex).append(" = anychart.core.ui.timeline();");
        jsBase = "uiTimeline" + variableIndex;
    }

    protected UiTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill backgroundFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setBackgroundFill(Fill backgroundFill) {
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

    private String color;
    private Double opacity;

    /**
     * Fill color with opacity.
     */
    public UiTimeline backgroundFill(String color, Double opacity) {
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
    public UiTimeline backgroundFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
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
    public UiTimeline backgroundFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline backgroundFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private Fill baseFill;

    /**
     * Setter for base fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setBaseFill(Fill baseFill) {
        if (jsBase == null) {
            this.baseFill = baseFill;
        } else {
            this.baseFill = baseFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s)", ((baseFill != null) ? baseFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s)", ((baseFill != null) ? baseFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color1;
    private Double opacity3;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline baseFill(String color1, Double opacity3) {
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
            js.append(String.format(Locale.US, ".baseFill(%s, %f)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %f)", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".baseFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baseFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".baseFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings1;
    private UiLabelsFactory getBaseLabels;

    /**
     * Getter for base labels.
     */
    public UiLabelsFactory getBaseLabels() {
        if (getBaseLabels == null)
            getBaseLabels = new UiLabelsFactory(jsBase + ".baseLabels()");

        return getBaseLabels;
    }

    private String baseLabels;
    private Boolean baseLabels1;

    /**
     * Setter for base labels.
     */
    public UiTimeline setBaseLabels(String baseLabels) {
        if (jsBase == null) {
            this.baseLabels = null;
            this.baseLabels1 = null;
            
            this.baseLabels = baseLabels;
        } else {
            this.baseLabels = baseLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseLabels(%s)", wrapQuotes(baseLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseLabels(%s)", wrapQuotes(baseLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for base labels.
     */
    public UiTimeline setBaseLabels(Boolean baseLabels1) {
        if (jsBase == null) {
            this.baseLabels = null;
            this.baseLabels1 = null;
            
            this.baseLabels1 = baseLabels1;
        } else {
            this.baseLabels1 = baseLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseLabels(%b)", baseLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseLabels(%b)", baseLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke baseStroke;
    private ColoredFill baseStroke1;
    private String baseStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the base stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaseStroke(Stroke baseStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.baseStroke = null;
            this.baseStroke1 = null;
            this.baseStroke2 = null;
            
            this.baseStroke = baseStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.baseStroke = baseStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", ((baseStroke != null) ? baseStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", ((baseStroke != null) ? baseStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the base stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaseStroke(ColoredFill baseStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.baseStroke = null;
            this.baseStroke1 = null;
            this.baseStroke2 = null;
            
            this.baseStroke1 = baseStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.baseStroke1 = baseStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", ((baseStroke1 != null) ? baseStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", ((baseStroke1 != null) ? baseStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the base stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaseStroke(String baseStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.baseStroke = null;
            this.baseStroke1 = null;
            this.baseStroke2 = null;
            
            this.baseStroke2 = baseStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.baseStroke2 = baseStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", wrapQuotes(baseStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baseStroke(%s, %f, %s, %s, %s)", wrapQuotes(baseStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean baselineAbove;

    /**
     * Setter for the "baseline above" flag.
     */
    public UiTimeline setBaselineAbove(Boolean baselineAbove) {
        if (jsBase == null) {
            this.baselineAbove = baselineAbove;
        } else {
            this.baselineAbove = baselineAbove;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineAbove(%b)", baselineAbove));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineAbove(%b)", baselineAbove));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill baselineFill;

    /**
     * Setter for baseline fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setBaselineFill(Fill baselineFill) {
        if (jsBase == null) {
            this.baselineFill = baselineFill;
        } else {
            this.baselineFill = baselineFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s)", ((baselineFill != null) ? baselineFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s)", ((baselineFill != null) ? baselineFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color2;
    private Double opacity6;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline baselineFill(String color2, Double opacity6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.color2 = color2;
            this.opacity6 = opacity6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %f)", wrapQuotes(color2), opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %f)", wrapQuotes(color2), opacity6));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys10 = keys10;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys10 = keys10;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline baselineFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys11 = keys11;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys11 = keys11;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings2;
    private UiLabelsFactory getBaselineLabels;

    /**
     * Getter for base line labels.
     */
    public UiLabelsFactory getBaselineLabels() {
        if (getBaselineLabels == null)
            getBaselineLabels = new UiLabelsFactory(jsBase + ".baselineLabels()");

        return getBaselineLabels;
    }

    private String baselineLabels;
    private Boolean baselineLabels1;

    /**
     * Setter for base line labels.
     */
    public UiTimeline setBaselineLabels(String baselineLabels) {
        if (jsBase == null) {
            this.baselineLabels = null;
            this.baselineLabels1 = null;
            
            this.baselineLabels = baselineLabels;
        } else {
            this.baselineLabels = baselineLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineLabels(%s)", wrapQuotes(baselineLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineLabels(%s)", wrapQuotes(baselineLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for base line labels.
     */
    public UiTimeline setBaselineLabels(Boolean baselineLabels1) {
        if (jsBase == null) {
            this.baselineLabels = null;
            this.baselineLabels1 = null;
            
            this.baselineLabels1 = baselineLabels1;
        } else {
            this.baselineLabels1 = baselineLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineLabels(%b)", baselineLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineLabels(%b)", baselineLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke baselineStroke;
    private ColoredFill baselineStroke1;
    private String baselineStroke2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for the baseline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaselineStroke(Stroke baselineStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.baselineStroke = null;
            this.baselineStroke1 = null;
            this.baselineStroke2 = null;
            
            this.baselineStroke = baselineStroke;
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
            this.baselineStroke = baselineStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", ((baselineStroke != null) ? baselineStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", ((baselineStroke != null) ? baselineStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaselineStroke(ColoredFill baselineStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.baselineStroke = null;
            this.baselineStroke1 = null;
            this.baselineStroke2 = null;
            
            this.baselineStroke1 = baselineStroke1;
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
            this.baselineStroke1 = baselineStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", ((baselineStroke1 != null) ? baselineStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", ((baselineStroke1 != null) ? baselineStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setBaselineStroke(String baselineStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.baselineStroke = null;
            this.baselineStroke1 = null;
            this.baselineStroke2 = null;
            
            this.baselineStroke2 = baselineStroke2;
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
            this.baselineStroke2 = baselineStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", wrapQuotes(baselineStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".baselineStroke(%s, %f, %s, %s, %s)", wrapQuotes(baselineStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke columnStroke;
    private String columnStroke1;

    /**
     * Setter for the column stroke.
     */
    public UiTimeline setColumnStroke(Stroke columnStroke) {
        if (jsBase == null) {
            this.columnStroke = null;
            this.columnStroke1 = null;
            
            this.columnStroke = columnStroke;
        } else {
            this.columnStroke = columnStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column stroke.
     */
    public UiTimeline setColumnStroke(String columnStroke1) {
        if (jsBase == null) {
            this.columnStroke = null;
            this.columnStroke1 = null;
            
            this.columnStroke1 = columnStroke1;
        } else {
            this.columnStroke1 = columnStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill connectorFill;
    private GradientKey[] connectorFill1;
    private String[] connectorFill2;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect opacityOrMode;
    private Double opacity9;
    private Double fx3;
    private Double fy3;

    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setConnectorFill(Fill connectorFill, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.connectorFill = null;
            this.connectorFill1 = null;
            this.connectorFill2 = null;
            
            this.connectorFill = connectorFill;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.connectorFill = connectorFill;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity9 = opacity9;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", ((connectorFill != null) ? connectorFill.generateJs() : "null"), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", ((connectorFill != null) ? connectorFill.generateJs() : "null"), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setConnectorFill(GradientKey[] connectorFill1, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.connectorFill = null;
            this.connectorFill1 = null;
            this.connectorFill2 = null;
            
            this.connectorFill1 = connectorFill1;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.connectorFill1 = connectorFill1;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity9 = opacity9;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(connectorFill1), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(connectorFill1), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setConnectorFill(String[] connectorFill2, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.connectorFill = null;
            this.connectorFill1 = null;
            this.connectorFill2 = null;
            
            this.connectorFill2 = connectorFill2;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.connectorFill2 = connectorFill2;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.opacityOrMode = opacityOrMode;
            this.opacity9 = opacity9;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(connectorFill2), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(connectorFill2), cx3, cy3, ((opacityOrMode != null) ? opacityOrMode.generateJs() : "null"), opacity9, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke connectorPreviewStroke;
    private ColoredFill connectorPreviewStroke1;
    private String connectorPreviewStroke2;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorPreviewStroke(Stroke connectorPreviewStroke, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke = connectorPreviewStroke;
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
            this.connectorPreviewStroke = connectorPreviewStroke;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", ((connectorPreviewStroke != null) ? connectorPreviewStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", ((connectorPreviewStroke != null) ? connectorPreviewStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorPreviewStroke(ColoredFill connectorPreviewStroke1, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke1 = connectorPreviewStroke1;
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
            this.connectorPreviewStroke1 = connectorPreviewStroke1;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", ((connectorPreviewStroke1 != null) ? connectorPreviewStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", ((connectorPreviewStroke1 != null) ? connectorPreviewStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorPreviewStroke(String connectorPreviewStroke2, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke2 = connectorPreviewStroke2;
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
            this.connectorPreviewStroke2 = connectorPreviewStroke2;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(connectorPreviewStroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorPreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(connectorPreviewStroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke connectorStroke;
    private ColoredFill connectorStroke1;
    private String connectorStroke2;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorStroke(Stroke connectorStroke, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.connectorStroke = null;
            this.connectorStroke1 = null;
            this.connectorStroke2 = null;
            
            this.connectorStroke = connectorStroke;
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
            this.connectorStroke = connectorStroke;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", ((connectorStroke != null) ? connectorStroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", ((connectorStroke != null) ? connectorStroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorStroke(ColoredFill connectorStroke1, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.connectorStroke = null;
            this.connectorStroke1 = null;
            this.connectorStroke2 = null;
            
            this.connectorStroke1 = connectorStroke1;
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
            this.connectorStroke1 = connectorStroke1;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", ((connectorStroke1 != null) ? connectorStroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", ((connectorStroke1 != null) ? connectorStroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setConnectorStroke(String connectorStroke2, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.connectorStroke = null;
            this.connectorStroke1 = null;
            this.connectorStroke2 = null;
            
            this.connectorStroke2 = connectorStroke2;
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
            this.connectorStroke2 = connectorStroke2;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", wrapQuotes(connectorStroke2), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", wrapQuotes(connectorStroke2), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill editConnectorThumbFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setEditConnectorThumbFill(Fill editConnectorThumbFill) {
        if (jsBase == null) {
            this.editConnectorThumbFill = editConnectorThumbFill;
        } else {
            this.editConnectorThumbFill = editConnectorThumbFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s)", ((editConnectorThumbFill != null) ? editConnectorThumbFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s)", ((editConnectorThumbFill != null) ? editConnectorThumbFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color3;
    private Double opacity10;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline editConnectorThumbFill(String color3, Double opacity10) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.color3 = color3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %f)", wrapQuotes(color3), opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %f)", wrapQuotes(color3), opacity10));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity11;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(GradientKey[] keys12, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(String[] keys13, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(String[] keys13, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(String[] keys13, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode15;
    private Double opacity12;
    private Double fx4;
    private Double fy4;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(GradientKey[] keys14, Double cx4, Double cy4, GraphicsMathRect mode15, Double opacity12, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys14 = keys14;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys14 = keys14;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx4, cy4, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx4, cy4, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editConnectorThumbFill(String[] keys15, Double cx4, Double cy4, GraphicsMathRect mode15, Double opacity12, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys15 = keys15;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys15 = keys15;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx4, cy4, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx4, cy4, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings3;
    private Stroke editConnectorThumbStroke;
    private ColoredFill editConnectorThumbStroke1;
    private String editConnectorThumbStroke2;
    private Double thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditConnectorThumbStroke(Stroke editConnectorThumbStroke, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke = editConnectorThumbStroke;
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
            this.editConnectorThumbStroke = editConnectorThumbStroke;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", ((editConnectorThumbStroke != null) ? editConnectorThumbStroke.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", ((editConnectorThumbStroke != null) ? editConnectorThumbStroke.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditConnectorThumbStroke(ColoredFill editConnectorThumbStroke1, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke1 = editConnectorThumbStroke1;
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
            this.editConnectorThumbStroke1 = editConnectorThumbStroke1;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", ((editConnectorThumbStroke1 != null) ? editConnectorThumbStroke1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", ((editConnectorThumbStroke1 != null) ? editConnectorThumbStroke1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditConnectorThumbStroke(String editConnectorThumbStroke2, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke2 = editConnectorThumbStroke2;
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
            this.editConnectorThumbStroke2 = editConnectorThumbStroke2;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", wrapQuotes(editConnectorThumbStroke2), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editConnectorThumbStroke(%s, %f, %s, %s, %s)", wrapQuotes(editConnectorThumbStroke2), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double editFinishConnectorMarkerHorizontalOffset;

    /**
     * Setter for the finish edit connector control horizontal offset.
     */
    public UiTimeline setEditFinishConnectorMarkerHorizontalOffset(Double editFinishConnectorMarkerHorizontalOffset) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerHorizontalOffset = editFinishConnectorMarkerHorizontalOffset;
        } else {
            this.editFinishConnectorMarkerHorizontalOffset = editFinishConnectorMarkerHorizontalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerHorizontalOffset(%f)", editFinishConnectorMarkerHorizontalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editFinishConnectorMarkerHorizontalOffset(%f)", editFinishConnectorMarkerHorizontalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double editFinishConnectorMarkerSize;

    /**
     * Setter for the finish edit connector control size.
     */
    public UiTimeline setEditFinishConnectorMarkerSize(Double editFinishConnectorMarkerSize) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerSize = editFinishConnectorMarkerSize;
        } else {
            this.editFinishConnectorMarkerSize = editFinishConnectorMarkerSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerSize(%f)", editFinishConnectorMarkerSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editFinishConnectorMarkerSize(%f)", editFinishConnectorMarkerSize));
                js.setLength(0);
            }
        }
        return this;
    }

    private MarkerType editFinishConnectorMarkerType;
    private String editFinishConnectorMarkerType1;

    /**
     * Setter for the finish edit connector control type.
     */
    public void setEditFinishConnectorMarkerType(MarkerType editFinishConnectorMarkerType) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerType = null;
            this.editFinishConnectorMarkerType1 = null;
            
            this.editFinishConnectorMarkerType = editFinishConnectorMarkerType;
        } else {
            this.editFinishConnectorMarkerType = editFinishConnectorMarkerType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s)", ((editFinishConnectorMarkerType != null) ? editFinishConnectorMarkerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Setter for the finish edit connector control type.
     */
    public void setEditFinishConnectorMarkerType(String editFinishConnectorMarkerType1) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerType = null;
            this.editFinishConnectorMarkerType1 = null;
            
            this.editFinishConnectorMarkerType1 = editFinishConnectorMarkerType1;
        } else {
            this.editFinishConnectorMarkerType1 = editFinishConnectorMarkerType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s)", wrapQuotes(editFinishConnectorMarkerType1)));
                js.setLength(0);
            }
        }
    }

    private Double editFinishConnectorMarkerVerticalOffset;

    /**
     * Setter for the finish edit connector control vertical offset.
     */
    public UiTimeline setEditFinishConnectorMarkerVerticalOffset(Double editFinishConnectorMarkerVerticalOffset) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerVerticalOffset = editFinishConnectorMarkerVerticalOffset;
        } else {
            this.editFinishConnectorMarkerVerticalOffset = editFinishConnectorMarkerVerticalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerVerticalOffset(%f)", editFinishConnectorMarkerVerticalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editFinishConnectorMarkerVerticalOffset(%f)", editFinishConnectorMarkerVerticalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill editIntervalThumbFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setEditIntervalThumbFill(Fill editIntervalThumbFill) {
        if (jsBase == null) {
            this.editIntervalThumbFill = editIntervalThumbFill;
        } else {
            this.editIntervalThumbFill = editIntervalThumbFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s)", ((editIntervalThumbFill != null) ? editIntervalThumbFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s)", ((editIntervalThumbFill != null) ? editIntervalThumbFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color4;
    private Double opacity13;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline editIntervalThumbFill(String color4, Double opacity13) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.color4 = color4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %f)", wrapQuotes(color4), opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %f)", wrapQuotes(color4), opacity13));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity14;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(GradientKey[] keys16, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(String[] keys17, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(String[] keys17, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(String[] keys17, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode19;
    private Double opacity15;
    private Double fx5;
    private Double fy5;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(GradientKey[] keys18, Double cx5, Double cy5, GraphicsMathRect mode19, Double opacity15, Double fx5, Double fy5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys18 = keys18;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys18 = keys18;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx5, cy5, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx5, cy5, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editIntervalThumbFill(String[] keys19, Double cx5, Double cy5, GraphicsMathRect mode19, Double opacity15, Double fx5, Double fy5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys19 = keys19;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys19 = keys19;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx5, cy5, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx5, cy5, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings4;
    private Stroke editIntervalThumbStroke;
    private ColoredFill editIntervalThumbStroke1;
    private String editIntervalThumbStroke2;
    private Double thickness5;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditIntervalThumbStroke(Stroke editIntervalThumbStroke, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke = editIntervalThumbStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.editIntervalThumbStroke = editIntervalThumbStroke;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", ((editIntervalThumbStroke != null) ? editIntervalThumbStroke.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", ((editIntervalThumbStroke != null) ? editIntervalThumbStroke.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditIntervalThumbStroke(ColoredFill editIntervalThumbStroke1, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke1 = editIntervalThumbStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.editIntervalThumbStroke1 = editIntervalThumbStroke1;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", ((editIntervalThumbStroke1 != null) ? editIntervalThumbStroke1.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", ((editIntervalThumbStroke1 != null) ? editIntervalThumbStroke1.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditIntervalThumbStroke(String editIntervalThumbStroke2, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke2 = editIntervalThumbStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.editIntervalThumbStroke2 = editIntervalThumbStroke2;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", wrapQuotes(editIntervalThumbStroke2), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalThumbStroke(%s, %f, %s, %s, %s)", wrapQuotes(editIntervalThumbStroke2), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double editIntervalWidth;

    /**
     * Setter for the interval edit control width.
     */
    public UiTimeline setEditIntervalWidth(Double editIntervalWidth) {
        if (jsBase == null) {
            this.editIntervalWidth = editIntervalWidth;
        } else {
            this.editIntervalWidth = editIntervalWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editIntervalWidth(%f)", editIntervalWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editIntervalWidth(%f)", editIntervalWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill editPreviewFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setEditPreviewFill(Fill editPreviewFill) {
        if (jsBase == null) {
            this.editPreviewFill = editPreviewFill;
        } else {
            this.editPreviewFill = editPreviewFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s)", ((editPreviewFill != null) ? editPreviewFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s)", ((editPreviewFill != null) ? editPreviewFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color5;
    private Double opacity16;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline editPreviewFill(String color5, Double opacity16) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.color5 = color5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %f)", wrapQuotes(color5), opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %f)", wrapQuotes(color5), opacity16));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Double opacity17;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(GradientKey[] keys20, Boolean mode20, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys20 = keys20;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(GradientKey[] keys20, VectorRect mode21, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys20 = keys20;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(GradientKey[] keys20, String mode22, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys20 = keys20;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(String[] keys21, Boolean mode20, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys21 = keys21;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(String[] keys21, VectorRect mode21, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys21 = keys21;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(String[] keys21, String mode22, Double angle5, Double opacity17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
        } else {
            this.keys21 = keys21;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity17 = opacity17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity17));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx6;
    private Double cy6;
    private GraphicsMathRect mode23;
    private Double opacity18;
    private Double fx6;
    private Double fy6;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(GradientKey[] keys22, Double cx6, Double cy6, GraphicsMathRect mode23, Double opacity18, Double fx6, Double fy6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys22 = keys22;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            
            this.cx6 = cx6;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            
            this.cy6 = cy6;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            
            this.opacity18 = opacity18;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            
            this.fx6 = fx6;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            
            this.fy6 = fy6;
        } else {
            this.keys22 = keys22;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode23 = mode23;
            this.opacity18 = opacity18;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx6, cy6, ((mode23 != null) ? mode23.generateJs() : "null"), opacity18, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx6, cy6, ((mode23 != null) ? mode23.generateJs() : "null"), opacity18, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editPreviewFill(String[] keys23, Double cx6, Double cy6, GraphicsMathRect mode23, Double opacity18, Double fx6, Double fy6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys23 = keys23;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            
            this.cx6 = cx6;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            
            this.cy6 = cy6;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            
            this.opacity18 = opacity18;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            
            this.fx6 = fx6;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            
            this.fy6 = fy6;
        } else {
            this.keys23 = keys23;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode23 = mode23;
            this.opacity18 = opacity18;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx6, cy6, ((mode23 != null) ? mode23.generateJs() : "null"), opacity18, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx6, cy6, ((mode23 != null) ? mode23.generateJs() : "null"), opacity18, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings5;
    private Stroke editPreviewStroke;
    private ColoredFill editPreviewStroke1;
    private String editPreviewStroke2;
    private Double thickness6;
    private String dashpattern6;
    private StrokeLineJoin lineJoin6;
    private StrokeLineCap lineCap6;

    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditPreviewStroke(Stroke editPreviewStroke, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke = editPreviewStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.editPreviewStroke = editPreviewStroke;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", ((editPreviewStroke != null) ? editPreviewStroke.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", ((editPreviewStroke != null) ? editPreviewStroke.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditPreviewStroke(ColoredFill editPreviewStroke1, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke1 = editPreviewStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.editPreviewStroke1 = editPreviewStroke1;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", ((editPreviewStroke1 != null) ? editPreviewStroke1.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", ((editPreviewStroke1 != null) ? editPreviewStroke1.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditPreviewStroke(String editPreviewStroke2, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke2 = editPreviewStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.editPreviewStroke2 = editPreviewStroke2;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(editPreviewStroke2), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editPreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(editPreviewStroke2), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill editProgressFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setEditProgressFill(Fill editProgressFill) {
        if (jsBase == null) {
            this.editProgressFill = editProgressFill;
        } else {
            this.editProgressFill = editProgressFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s)", ((editProgressFill != null) ? editProgressFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s)", ((editProgressFill != null) ? editProgressFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color6;
    private Double opacity19;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline editProgressFill(String color6, Double opacity19) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            
            this.opacity19 = opacity19;
        } else {
            this.color6 = color6;
            this.opacity19 = opacity19;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %f)", wrapQuotes(color6), opacity19));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %f)", wrapQuotes(color6), opacity19));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Double angle6;
    private Boolean mode24;
    private VectorRect mode25;
    private String mode26;
    private Double opacity20;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(GradientKey[] keys24, Boolean mode24, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode24 = mode24;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys24 = keys24;
            this.mode24 = mode24;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %b, %f, %f)", arrayToString(keys24), mode24, angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %b, %f, %f)", arrayToString(keys24), mode24, angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(GradientKey[] keys24, VectorRect mode25, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode25 = mode25;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys24 = keys24;
            this.mode25 = mode25;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToString(keys24), ((mode25 != null) ? mode25.generateJs() : "null"), angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToString(keys24), ((mode25 != null) ? mode25.generateJs() : "null"), angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(GradientKey[] keys24, String mode26, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode26 = mode26;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys24 = keys24;
            this.mode26 = mode26;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToString(keys24), wrapQuotes(mode26), angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToString(keys24), wrapQuotes(mode26), angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(String[] keys25, Boolean mode24, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode24 = mode24;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys25 = keys25;
            this.mode24 = mode24;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys25), mode24, angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys25), mode24, angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(String[] keys25, VectorRect mode25, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode25 = mode25;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys25 = keys25;
            this.mode25 = mode25;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys25), ((mode25 != null) ? mode25.generateJs() : "null"), angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys25), ((mode25 != null) ? mode25.generateJs() : "null"), angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(String[] keys25, String mode26, Double angle6, Double opacity20) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode26 = mode26;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            
            this.opacity20 = opacity20;
        } else {
            this.keys25 = keys25;
            this.mode26 = mode26;
            this.angle6 = angle6;
            this.opacity20 = opacity20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys25), wrapQuotes(mode26), angle6, opacity20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys25), wrapQuotes(mode26), angle6, opacity20));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Double cx7;
    private Double cy7;
    private GraphicsMathRect mode27;
    private Double opacity21;
    private Double fx7;
    private Double fy7;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(GradientKey[] keys26, Double cx7, Double cy7, GraphicsMathRect mode27, Double opacity21, Double fx7, Double fy7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            
            this.keys26 = keys26;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            
            this.cx7 = cx7;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            
            this.cy7 = cy7;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            
            this.mode27 = mode27;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            
            this.opacity21 = opacity21;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            
            this.fx7 = fx7;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            
            this.fy7 = fy7;
        } else {
            this.keys26 = keys26;
            this.cx7 = cx7;
            this.cy7 = cy7;
            this.mode27 = mode27;
            this.opacity21 = opacity21;
            this.fx7 = fx7;
            this.fy7 = fy7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys26), cx7, cy7, ((mode27 != null) ? mode27.generateJs() : "null"), opacity21, fx7, fy7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys26), cx7, cy7, ((mode27 != null) ? mode27.generateJs() : "null"), opacity21, fx7, fy7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editProgressFill(String[] keys27, Double cx7, Double cy7, GraphicsMathRect mode27, Double opacity21, Double fx7, Double fy7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            
            this.keys27 = keys27;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            
            this.cx7 = cx7;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            
            this.cy7 = cy7;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            
            this.mode27 = mode27;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            
            this.opacity21 = opacity21;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            
            this.fx7 = fx7;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            
            this.fy7 = fy7;
        } else {
            this.keys27 = keys27;
            this.cx7 = cx7;
            this.cy7 = cy7;
            this.mode27 = mode27;
            this.opacity21 = opacity21;
            this.fx7 = fx7;
            this.fy7 = fy7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys27), cx7, cy7, ((mode27 != null) ? mode27.generateJs() : "null"), opacity21, fx7, fy7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys27), cx7, cy7, ((mode27 != null) ? mode27.generateJs() : "null"), opacity21, fx7, fy7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings6;
    private Stroke editProgressStroke;
    private ColoredFill editProgressStroke1;
    private String editProgressStroke2;
    private Double thickness7;
    private String dashpattern7;
    private StrokeLineJoin lineJoin7;
    private StrokeLineCap lineCap7;

    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditProgressStroke(Stroke editProgressStroke, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.editProgressStroke = null;
            this.editProgressStroke1 = null;
            this.editProgressStroke2 = null;
            
            this.editProgressStroke = editProgressStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.editProgressStroke = editProgressStroke;
            this.thickness7 = thickness7;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", ((editProgressStroke != null) ? editProgressStroke.generateJs() : "null"), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", ((editProgressStroke != null) ? editProgressStroke.generateJs() : "null"), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditProgressStroke(ColoredFill editProgressStroke1, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.editProgressStroke = null;
            this.editProgressStroke1 = null;
            this.editProgressStroke2 = null;
            
            this.editProgressStroke1 = editProgressStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.editProgressStroke1 = editProgressStroke1;
            this.thickness7 = thickness7;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", ((editProgressStroke1 != null) ? editProgressStroke1.generateJs() : "null"), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", ((editProgressStroke1 != null) ? editProgressStroke1.generateJs() : "null"), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditProgressStroke(String editProgressStroke2, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.editProgressStroke = null;
            this.editProgressStroke1 = null;
            this.editProgressStroke2 = null;
            
            this.editProgressStroke2 = editProgressStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.editProgressStroke2 = editProgressStroke2;
            this.thickness7 = thickness7;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", wrapQuotes(editProgressStroke2), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editProgressStroke(%s, %f, %s, %s, %s)", wrapQuotes(editProgressStroke2), thickness7, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double editStartConnectorMarkerHorizontalOffset;

    /**
     * Setter for the start edit connector control horizontal offset.
     */
    public UiTimeline setEditStartConnectorMarkerHorizontalOffset(Double editStartConnectorMarkerHorizontalOffset) {
        if (jsBase == null) {
            this.editStartConnectorMarkerHorizontalOffset = editStartConnectorMarkerHorizontalOffset;
        } else {
            this.editStartConnectorMarkerHorizontalOffset = editStartConnectorMarkerHorizontalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStartConnectorMarkerHorizontalOffset(%f)", editStartConnectorMarkerHorizontalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStartConnectorMarkerHorizontalOffset(%f)", editStartConnectorMarkerHorizontalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double editStartConnectorMarkerSize;

    /**
     * Setter for the start edit connector control size.
     */
    public UiTimeline setEditStartConnectorMarkerSize(Double editStartConnectorMarkerSize) {
        if (jsBase == null) {
            this.editStartConnectorMarkerSize = editStartConnectorMarkerSize;
        } else {
            this.editStartConnectorMarkerSize = editStartConnectorMarkerSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStartConnectorMarkerSize(%f)", editStartConnectorMarkerSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStartConnectorMarkerSize(%f)", editStartConnectorMarkerSize));
                js.setLength(0);
            }
        }
        return this;
    }

    private MarkerType editStartConnectorMarkerType;
    private String editStartConnectorMarkerType1;

    /**
     * Setter for the start edit connector control type.
     */
    public void setEditStartConnectorMarkerType(MarkerType editStartConnectorMarkerType) {
        if (jsBase == null) {
            this.editStartConnectorMarkerType = null;
            this.editStartConnectorMarkerType1 = null;
            
            this.editStartConnectorMarkerType = editStartConnectorMarkerType;
        } else {
            this.editStartConnectorMarkerType = editStartConnectorMarkerType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s)", ((editStartConnectorMarkerType != null) ? editStartConnectorMarkerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Setter for the start edit connector control type.
     */
    public void setEditStartConnectorMarkerType(String editStartConnectorMarkerType1) {
        if (jsBase == null) {
            this.editStartConnectorMarkerType = null;
            this.editStartConnectorMarkerType1 = null;
            
            this.editStartConnectorMarkerType1 = editStartConnectorMarkerType1;
        } else {
            this.editStartConnectorMarkerType1 = editStartConnectorMarkerType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s)", wrapQuotes(editStartConnectorMarkerType1)));
                js.setLength(0);
            }
        }
    }

    private Double editStartConnectorMarkerVerticalOffset;

    /**
     * Setter for the start edit connector control vertical offset.
     */
    public UiTimeline setEditStartConnectorMarkerVerticalOffset(Double editStartConnectorMarkerVerticalOffset) {
        if (jsBase == null) {
            this.editStartConnectorMarkerVerticalOffset = editStartConnectorMarkerVerticalOffset;
        } else {
            this.editStartConnectorMarkerVerticalOffset = editStartConnectorMarkerVerticalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStartConnectorMarkerVerticalOffset(%f)", editStartConnectorMarkerVerticalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStartConnectorMarkerVerticalOffset(%f)", editStartConnectorMarkerVerticalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke editStructurePreviewDashStroke;
    private ColoredFill editStructurePreviewDashStroke1;
    private String editStructurePreviewDashStroke2;
    private Double thickness8;
    private String dashpattern8;
    private StrokeLineJoin lineJoin8;
    private StrokeLineCap lineCap8;

    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewDashStroke(Stroke editStructurePreviewDashStroke, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.editStructurePreviewDashStroke = null;
            this.editStructurePreviewDashStroke1 = null;
            this.editStructurePreviewDashStroke2 = null;
            
            this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
            this.thickness8 = thickness8;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null"), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null"), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewDashStroke(ColoredFill editStructurePreviewDashStroke1, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.editStructurePreviewDashStroke = null;
            this.editStructurePreviewDashStroke1 = null;
            this.editStructurePreviewDashStroke2 = null;
            
            this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
            this.thickness8 = thickness8;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewDashStroke1 != null) ? editStructurePreviewDashStroke1.generateJs() : "null"), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewDashStroke1 != null) ? editStructurePreviewDashStroke1.generateJs() : "null"), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewDashStroke(String editStructurePreviewDashStroke2, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.editStructurePreviewDashStroke = null;
            this.editStructurePreviewDashStroke1 = null;
            this.editStructurePreviewDashStroke2 = null;
            
            this.editStructurePreviewDashStroke2 = editStructurePreviewDashStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.editStructurePreviewDashStroke2 = editStructurePreviewDashStroke2;
            this.thickness8 = thickness8;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", wrapQuotes(editStructurePreviewDashStroke2), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %f, %s, %s, %s)", wrapQuotes(editStructurePreviewDashStroke2), thickness8, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill editStructurePreviewFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setEditStructurePreviewFill(Fill editStructurePreviewFill) {
        if (jsBase == null) {
            this.editStructurePreviewFill = editStructurePreviewFill;
        } else {
            this.editStructurePreviewFill = editStructurePreviewFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s)", ((editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s)", ((editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color7;
    private Double opacity22;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline editStructurePreviewFill(String color7, Double opacity22) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            
            this.opacity22 = opacity22;
        } else {
            this.color7 = color7;
            this.opacity22 = opacity22;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f)", wrapQuotes(color7), opacity22));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f)", wrapQuotes(color7), opacity22));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys28;
    private String[] keys29;
    private Double angle7;
    private Boolean mode28;
    private VectorRect mode29;
    private String mode30;
    private Double opacity23;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(GradientKey[] keys28, Boolean mode28, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys28 = keys28;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode28 = mode28;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys28 = keys28;
            this.mode28 = mode28;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToString(keys28), mode28, angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToString(keys28), mode28, angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(GradientKey[] keys28, VectorRect mode29, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys28 = keys28;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode29 = mode29;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys28 = keys28;
            this.mode29 = mode29;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys28), ((mode29 != null) ? mode29.generateJs() : "null"), angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys28), ((mode29 != null) ? mode29.generateJs() : "null"), angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(GradientKey[] keys28, String mode30, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys28 = keys28;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode30 = mode30;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys28 = keys28;
            this.mode30 = mode30;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys28), wrapQuotes(mode30), angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys28), wrapQuotes(mode30), angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(String[] keys29, Boolean mode28, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys29 = keys29;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode28 = mode28;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys29 = keys29;
            this.mode28 = mode28;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys29), mode28, angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys29), mode28, angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(String[] keys29, VectorRect mode29, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys29 = keys29;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode29 = mode29;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys29 = keys29;
            this.mode29 = mode29;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys29), ((mode29 != null) ? mode29.generateJs() : "null"), angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys29), ((mode29 != null) ? mode29.generateJs() : "null"), angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(String[] keys29, String mode30, Double angle7, Double opacity23) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            
            this.keys29 = keys29;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            
            this.mode30 = mode30;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            
            this.angle7 = angle7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            
            this.opacity23 = opacity23;
        } else {
            this.keys29 = keys29;
            this.mode30 = mode30;
            this.angle7 = angle7;
            this.opacity23 = opacity23;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys29), wrapQuotes(mode30), angle7, opacity23));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys29), wrapQuotes(mode30), angle7, opacity23));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys30;
    private String[] keys31;
    private Double cx8;
    private Double cy8;
    private GraphicsMathRect mode31;
    private Double opacity24;
    private Double fx8;
    private Double fy8;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(GradientKey[] keys30, Double cx8, Double cy8, GraphicsMathRect mode31, Double opacity24, Double fx8, Double fy8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            
            this.keys30 = keys30;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            
            this.cx8 = cx8;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            
            this.cy8 = cy8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            
            this.mode31 = mode31;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            
            this.opacity24 = opacity24;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            
            this.fx8 = fx8;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            
            this.fy8 = fy8;
        } else {
            this.keys30 = keys30;
            this.cx8 = cx8;
            this.cy8 = cy8;
            this.mode31 = mode31;
            this.opacity24 = opacity24;
            this.fx8 = fx8;
            this.fy8 = fy8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys30), cx8, cy8, ((mode31 != null) ? mode31.generateJs() : "null"), opacity24, fx8, fy8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys30), cx8, cy8, ((mode31 != null) ? mode31.generateJs() : "null"), opacity24, fx8, fy8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline editStructurePreviewFill(String[] keys31, Double cx8, Double cy8, GraphicsMathRect mode31, Double opacity24, Double fx8, Double fy8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            
            this.keys31 = keys31;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            
            this.cx8 = cx8;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            
            this.cy8 = cy8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            
            this.mode31 = mode31;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            
            this.opacity24 = opacity24;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            
            this.fx8 = fx8;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            
            this.fy8 = fy8;
        } else {
            this.keys31 = keys31;
            this.cx8 = cx8;
            this.cy8 = cy8;
            this.mode31 = mode31;
            this.opacity24 = opacity24;
            this.fx8 = fx8;
            this.fy8 = fy8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys31), cx8, cy8, ((mode31 != null) ? mode31.generateJs() : "null"), opacity24, fx8, fy8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys31), cx8, cy8, ((mode31 != null) ? mode31.generateJs() : "null"), opacity24, fx8, fy8));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings7;
    private Stroke editStructurePreviewStroke;
    private ColoredFill editStructurePreviewStroke1;
    private String editStructurePreviewStroke2;
    private Double thickness9;
    private String dashpattern9;
    private StrokeLineJoin lineJoin9;
    private StrokeLineCap lineCap9;

    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewStroke(Stroke editStructurePreviewStroke, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.editStructurePreviewStroke = null;
            this.editStructurePreviewStroke1 = null;
            this.editStructurePreviewStroke2 = null;
            
            this.editStructurePreviewStroke = editStructurePreviewStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.editStructurePreviewStroke = editStructurePreviewStroke;
            this.thickness9 = thickness9;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null"), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null"), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewStroke(ColoredFill editStructurePreviewStroke1, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.editStructurePreviewStroke = null;
            this.editStructurePreviewStroke1 = null;
            this.editStructurePreviewStroke2 = null;
            
            this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
            this.thickness9 = thickness9;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewStroke1 != null) ? editStructurePreviewStroke1.generateJs() : "null"), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", ((editStructurePreviewStroke1 != null) ? editStructurePreviewStroke1.generateJs() : "null"), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setEditStructurePreviewStroke(String editStructurePreviewStroke2, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.editStructurePreviewStroke = null;
            this.editStructurePreviewStroke1 = null;
            this.editStructurePreviewStroke2 = null;
            
            this.editStructurePreviewStroke2 = editStructurePreviewStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.editStructurePreviewStroke2 = editStructurePreviewStroke2;
            this.thickness9 = thickness9;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(editStructurePreviewStroke2), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewStroke(%s, %f, %s, %s, %s)", wrapQuotes(editStructurePreviewStroke2), thickness9, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean editing;

    /**
     * Enables or disables live edit mode.
     */
    public UiTimeline editing(Boolean editing) {
        if (jsBase == null) {
            this.editing = editing;
        } else {
            this.editing = editing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editing(%b)", editing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editing(%b)", editing));
                js.setLength(0);
            }
        }
        return this;
    }

    private TimelineHeader getHeader;

    /**
     * Getter for the timeline header.
     */
    public TimelineHeader getHeader() {
        if (getHeader == null)
            getHeader = new TimelineHeader(jsBase + ".header()");

        return getHeader;
    }

    private String header;

    /**
     * Setter for the timeline header.
     */
    public UiTimeline setHeader(String header) {
        if (jsBase == null) {
            this.header = header;
        } else {
            this.header = header;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".header(%s)", wrapQuotes(header)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".header(%s)", wrapQuotes(header)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScrollBar getHorizontalScrollBar;

    /**
     * Getter for the horizontal scroll bar.
     */
    public ScrollBar getHorizontalScrollBar() {
        if (getHorizontalScrollBar == null)
            getHorizontalScrollBar = new ScrollBar(jsBase + ".horizontalScrollBar()");

        return getHorizontalScrollBar;
    }

    private String horizontalScrollBar;

    /**
     * Setter for the horizontal scroll bar.
     */
    public UiTimeline setHorizontalScrollBar(String horizontalScrollBar) {
        if (jsBase == null) {
            this.horizontalScrollBar = horizontalScrollBar;
        } else {
            this.horizontalScrollBar = horizontalScrollBar;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for the labels factory.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;

    /**
     * Setter for the labels factory.
     */
    public UiTimeline setLabels(String labels) {
        if (jsBase == null) {
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttLine> getLineMarker = new ArrayList<>();

    /**
     * Getter for the line marker.
     */
    public GanttLine getLineMarker(Double index) {
        GanttLine item = new GanttLine(jsBase + ".lineMarker(" + index + ")");
        getLineMarker.add(item);
        return item;
    }

    private String lineMarker;
    private Boolean lineMarker1;

    /**
     * Setter for the line marker.
     */
    public UiTimeline setLineMarker(String lineMarker) {
        if (jsBase == null) {
            this.lineMarker = null;
            this.lineMarker1 = null;
            
            this.lineMarker = lineMarker;
        } else {
            this.lineMarker = lineMarker;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker.
     */
    public UiTimeline setLineMarker(Boolean lineMarker1) {
        if (jsBase == null) {
            this.lineMarker = null;
            this.lineMarker1 = null;
            
            this.lineMarker1 = lineMarker1;
        } else {
            this.lineMarker1 = lineMarker1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;
    private String lineMarker2;
    private Boolean lineMarker3;
    private GanttDateTimeMarkers lineMarker4;
    private String lineMarker5;

    /**
     * Setter for the line marker by index.
     */
    public UiTimeline setLineMarker(String lineMarker2, Double index) {
        if (jsBase == null) {
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker2 = lineMarker2;
            this.index = index;
        } else {
            this.lineMarker2 = lineMarker2;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker by index.
     */
    public UiTimeline setLineMarker(Boolean lineMarker3, Double index) {
        if (jsBase == null) {
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker3 = lineMarker3;
            this.index = index;
        } else {
            this.lineMarker3 = lineMarker3;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker by index.
     */
    public UiTimeline setLineMarker(GanttDateTimeMarkers lineMarker4, Double index) {
        if (jsBase == null) {
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker4 = lineMarker4;
            this.index = index;
        } else {
            this.lineMarker4 = lineMarker4;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineMarker(%s, %f)", ((lineMarker4 != null) ? lineMarker4.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", ((lineMarker4 != null) ? lineMarker4.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for the markers factory.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;

    /**
     * Setter for the markers factory.
     */
    public UiTimeline setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill milestoneFill;

    /**
     * Setter for milestone fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setMilestoneFill(Fill milestoneFill) {
        if (jsBase == null) {
            this.milestoneFill = milestoneFill;
        } else {
            this.milestoneFill = milestoneFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s)", ((milestoneFill != null) ? milestoneFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s)", ((milestoneFill != null) ? milestoneFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color8;
    private Double opacity25;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline milestoneFill(String color8, Double opacity25) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color8 = color8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            
            this.opacity25 = opacity25;
        } else {
            this.color8 = color8;
            this.opacity25 = opacity25;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %f)", wrapQuotes(color8), opacity25));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %f)", wrapQuotes(color8), opacity25));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys32;
    private String[] keys33;
    private Double angle8;
    private Boolean mode32;
    private VectorRect mode33;
    private String mode34;
    private Double opacity26;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(GradientKey[] keys32, Boolean mode32, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys32 = keys32;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode32 = mode32;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys32 = keys32;
            this.mode32 = mode32;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %b, %f, %f)", arrayToString(keys32), mode32, angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %b, %f, %f)", arrayToString(keys32), mode32, angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(GradientKey[] keys32, VectorRect mode33, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys32 = keys32;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode33 = mode33;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys32 = keys32;
            this.mode33 = mode33;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToString(keys32), ((mode33 != null) ? mode33.generateJs() : "null"), angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToString(keys32), ((mode33 != null) ? mode33.generateJs() : "null"), angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(GradientKey[] keys32, String mode34, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys32 = keys32;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode34 = mode34;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys32 = keys32;
            this.mode34 = mode34;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToString(keys32), wrapQuotes(mode34), angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToString(keys32), wrapQuotes(mode34), angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(String[] keys33, Boolean mode32, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys33 = keys33;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode32 = mode32;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys33 = keys33;
            this.mode32 = mode32;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys33), mode32, angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys33), mode32, angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(String[] keys33, VectorRect mode33, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys33 = keys33;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode33 = mode33;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys33 = keys33;
            this.mode33 = mode33;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys33), ((mode33 != null) ? mode33.generateJs() : "null"), angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys33), ((mode33 != null) ? mode33.generateJs() : "null"), angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(String[] keys33, String mode34, Double angle8, Double opacity26) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            
            this.keys33 = keys33;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            
            this.mode34 = mode34;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            
            this.angle8 = angle8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            
            this.opacity26 = opacity26;
        } else {
            this.keys33 = keys33;
            this.mode34 = mode34;
            this.angle8 = angle8;
            this.opacity26 = opacity26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys33), wrapQuotes(mode34), angle8, opacity26));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys33), wrapQuotes(mode34), angle8, opacity26));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys34;
    private String[] keys35;
    private Double cx9;
    private Double cy9;
    private GraphicsMathRect mode35;
    private Double opacity27;
    private Double fx9;
    private Double fy9;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(GradientKey[] keys34, Double cx9, Double cy9, GraphicsMathRect mode35, Double opacity27, Double fx9, Double fy9) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            
            this.keys34 = keys34;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            
            this.cx9 = cx9;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            
            this.cy9 = cy9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            
            this.mode35 = mode35;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            
            this.opacity27 = opacity27;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            
            this.fx9 = fx9;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            
            this.fy9 = fy9;
        } else {
            this.keys34 = keys34;
            this.cx9 = cx9;
            this.cy9 = cy9;
            this.mode35 = mode35;
            this.opacity27 = opacity27;
            this.fx9 = fx9;
            this.fy9 = fy9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys34), cx9, cy9, ((mode35 != null) ? mode35.generateJs() : "null"), opacity27, fx9, fy9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys34), cx9, cy9, ((mode35 != null) ? mode35.generateJs() : "null"), opacity27, fx9, fy9));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline milestoneFill(String[] keys35, Double cx9, Double cy9, GraphicsMathRect mode35, Double opacity27, Double fx9, Double fy9) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            
            this.keys35 = keys35;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            
            this.cx9 = cx9;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            
            this.cy9 = cy9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            
            this.mode35 = mode35;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            
            this.opacity27 = opacity27;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            
            this.fx9 = fx9;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            
            this.fy9 = fy9;
        } else {
            this.keys35 = keys35;
            this.cx9 = cx9;
            this.cy9 = cy9;
            this.mode35 = mode35;
            this.opacity27 = opacity27;
            this.fx9 = fx9;
            this.fy9 = fy9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys35), cx9, cy9, ((mode35 != null) ? mode35.generateJs() : "null"), opacity27, fx9, fy9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys35), cx9, cy9, ((mode35 != null) ? mode35.generateJs() : "null"), opacity27, fx9, fy9));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings8;
    private UiLabelsFactory getMilestoneLabels;

    /**
     * Getter for milestone labels.
     */
    public UiLabelsFactory getMilestoneLabels() {
        if (getMilestoneLabels == null)
            getMilestoneLabels = new UiLabelsFactory(jsBase + ".milestoneLabels()");

        return getMilestoneLabels;
    }

    private String milestoneLabels;
    private Boolean milestoneLabels1;

    /**
     * Setter for milestone labels.
     */
    public UiTimeline setMilestoneLabels(String milestoneLabels) {
        if (jsBase == null) {
            this.milestoneLabels = null;
            this.milestoneLabels1 = null;
            
            this.milestoneLabels = milestoneLabels;
        } else {
            this.milestoneLabels = milestoneLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneLabels(%s)", wrapQuotes(milestoneLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneLabels(%s)", wrapQuotes(milestoneLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for milestone labels.
     */
    public UiTimeline setMilestoneLabels(Boolean milestoneLabels1) {
        if (jsBase == null) {
            this.milestoneLabels = null;
            this.milestoneLabels1 = null;
            
            this.milestoneLabels1 = milestoneLabels1;
        } else {
            this.milestoneLabels1 = milestoneLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneLabels(%b)", milestoneLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneLabels(%b)", milestoneLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke milestoneStroke;
    private ColoredFill milestoneStroke1;
    private String milestoneStroke2;
    private Double thickness10;
    private String dashpattern10;
    private StrokeLineJoin lineJoin10;
    private StrokeLineCap lineCap10;

    /**
     * Setter for the milestone stroke settings.
     */
    public UiTimeline setMilestoneStroke(Stroke milestoneStroke, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.milestoneStroke = null;
            this.milestoneStroke1 = null;
            this.milestoneStroke2 = null;
            
            this.milestoneStroke = milestoneStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.milestoneStroke = milestoneStroke;
            this.thickness10 = thickness10;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", ((milestoneStroke != null) ? milestoneStroke.generateJs() : "null"), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", ((milestoneStroke != null) ? milestoneStroke.generateJs() : "null"), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the milestone stroke settings.
     */
    public UiTimeline setMilestoneStroke(ColoredFill milestoneStroke1, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.milestoneStroke = null;
            this.milestoneStroke1 = null;
            this.milestoneStroke2 = null;
            
            this.milestoneStroke1 = milestoneStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.milestoneStroke1 = milestoneStroke1;
            this.thickness10 = thickness10;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", ((milestoneStroke1 != null) ? milestoneStroke1.generateJs() : "null"), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", ((milestoneStroke1 != null) ? milestoneStroke1.generateJs() : "null"), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the milestone stroke settings.
     */
    public UiTimeline setMilestoneStroke(String milestoneStroke2, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.milestoneStroke = null;
            this.milestoneStroke1 = null;
            this.milestoneStroke2 = null;
            
            this.milestoneStroke2 = milestoneStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.milestoneStroke2 = milestoneStroke2;
            this.thickness10 = thickness10;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", wrapQuotes(milestoneStroke2), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".milestoneStroke(%s, %f, %s, %s, %s)", wrapQuotes(milestoneStroke2), thickness10, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill parentFill;

    /**
     * Setter for parent fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setParentFill(Fill parentFill) {
        if (jsBase == null) {
            this.parentFill = parentFill;
        } else {
            this.parentFill = parentFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s)", ((parentFill != null) ? parentFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s)", ((parentFill != null) ? parentFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color9;
    private Double opacity28;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline parentFill(String color9, Double opacity28) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            
            this.opacity28 = opacity28;
        } else {
            this.color9 = color9;
            this.opacity28 = opacity28;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %f)", wrapQuotes(color9), opacity28));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %f)", wrapQuotes(color9), opacity28));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys36;
    private String[] keys37;
    private Double angle9;
    private Boolean mode36;
    private VectorRect mode37;
    private String mode38;
    private Double opacity29;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(GradientKey[] keys36, Boolean mode36, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys36 = keys36;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode36 = mode36;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys36 = keys36;
            this.mode36 = mode36;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %b, %f, %f)", arrayToString(keys36), mode36, angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %b, %f, %f)", arrayToString(keys36), mode36, angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(GradientKey[] keys36, VectorRect mode37, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys36 = keys36;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode37 = mode37;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys36 = keys36;
            this.mode37 = mode37;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToString(keys36), ((mode37 != null) ? mode37.generateJs() : "null"), angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToString(keys36), ((mode37 != null) ? mode37.generateJs() : "null"), angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(GradientKey[] keys36, String mode38, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys36 = keys36;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode38 = mode38;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys36 = keys36;
            this.mode38 = mode38;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToString(keys36), wrapQuotes(mode38), angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToString(keys36), wrapQuotes(mode38), angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(String[] keys37, Boolean mode36, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys37 = keys37;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode36 = mode36;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys37 = keys37;
            this.mode36 = mode36;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys37), mode36, angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys37), mode36, angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(String[] keys37, VectorRect mode37, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys37 = keys37;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode37 = mode37;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys37 = keys37;
            this.mode37 = mode37;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys37), ((mode37 != null) ? mode37.generateJs() : "null"), angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys37), ((mode37 != null) ? mode37.generateJs() : "null"), angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(String[] keys37, String mode38, Double angle9, Double opacity29) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            
            this.keys37 = keys37;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            
            this.mode38 = mode38;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            
            this.angle9 = angle9;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            
            this.opacity29 = opacity29;
        } else {
            this.keys37 = keys37;
            this.mode38 = mode38;
            this.angle9 = angle9;
            this.opacity29 = opacity29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys37), wrapQuotes(mode38), angle9, opacity29));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys37), wrapQuotes(mode38), angle9, opacity29));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys38;
    private String[] keys39;
    private Double cx10;
    private Double cy10;
    private GraphicsMathRect mode39;
    private Double opacity30;
    private Double fx10;
    private Double fy10;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(GradientKey[] keys38, Double cx10, Double cy10, GraphicsMathRect mode39, Double opacity30, Double fx10, Double fy10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            
            this.keys38 = keys38;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            
            this.cx10 = cx10;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            
            this.cy10 = cy10;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            
            this.mode39 = mode39;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            
            this.opacity30 = opacity30;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            
            this.fx10 = fx10;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            
            this.fy10 = fy10;
        } else {
            this.keys38 = keys38;
            this.cx10 = cx10;
            this.cy10 = cy10;
            this.mode39 = mode39;
            this.opacity30 = opacity30;
            this.fx10 = fx10;
            this.fy10 = fy10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys38), cx10, cy10, ((mode39 != null) ? mode39.generateJs() : "null"), opacity30, fx10, fy10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys38), cx10, cy10, ((mode39 != null) ? mode39.generateJs() : "null"), opacity30, fx10, fy10));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline parentFill(String[] keys39, Double cx10, Double cy10, GraphicsMathRect mode39, Double opacity30, Double fx10, Double fy10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            
            this.keys39 = keys39;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            
            this.cx10 = cx10;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            
            this.cy10 = cy10;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            
            this.mode39 = mode39;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            
            this.opacity30 = opacity30;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            
            this.fx10 = fx10;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            
            this.fy10 = fy10;
        } else {
            this.keys39 = keys39;
            this.cx10 = cx10;
            this.cy10 = cy10;
            this.mode39 = mode39;
            this.opacity30 = opacity30;
            this.fx10 = fx10;
            this.fy10 = fy10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys39), cx10, cy10, ((mode39 != null) ? mode39.generateJs() : "null"), opacity30, fx10, fy10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys39), cx10, cy10, ((mode39 != null) ? mode39.generateJs() : "null"), opacity30, fx10, fy10));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings9;
    private UiLabelsFactory getParentLabels;

    /**
     * Getter for parent labels.
     */
    public UiLabelsFactory getParentLabels() {
        if (getParentLabels == null)
            getParentLabels = new UiLabelsFactory(jsBase + ".parentLabels()");

        return getParentLabels;
    }

    private String parentLabels;
    private Boolean parentLabels1;

    /**
     * Setter for parent labels.
     */
    public UiTimeline setParentLabels(String parentLabels) {
        if (jsBase == null) {
            this.parentLabels = null;
            this.parentLabels1 = null;
            
            this.parentLabels = parentLabels;
        } else {
            this.parentLabels = parentLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentLabels(%s)", wrapQuotes(parentLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentLabels(%s)", wrapQuotes(parentLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for parent labels.
     */
    public UiTimeline setParentLabels(Boolean parentLabels1) {
        if (jsBase == null) {
            this.parentLabels = null;
            this.parentLabels1 = null;
            
            this.parentLabels1 = parentLabels1;
        } else {
            this.parentLabels1 = parentLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentLabels(%b)", parentLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentLabels(%b)", parentLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke parentStroke;
    private ColoredFill parentStroke1;
    private String parentStroke2;
    private Double thickness11;
    private String dashpattern11;
    private StrokeLineJoin lineJoin11;
    private StrokeLineCap lineCap11;

    /**
     * Setter for the parent stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setParentStroke(Stroke parentStroke, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.parentStroke = null;
            this.parentStroke1 = null;
            this.parentStroke2 = null;
            
            this.parentStroke = parentStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.parentStroke = parentStroke;
            this.thickness11 = thickness11;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", ((parentStroke != null) ? parentStroke.generateJs() : "null"), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", ((parentStroke != null) ? parentStroke.generateJs() : "null"), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the parent stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setParentStroke(ColoredFill parentStroke1, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.parentStroke = null;
            this.parentStroke1 = null;
            this.parentStroke2 = null;
            
            this.parentStroke1 = parentStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.parentStroke1 = parentStroke1;
            this.thickness11 = thickness11;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", ((parentStroke1 != null) ? parentStroke1.generateJs() : "null"), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", ((parentStroke1 != null) ? parentStroke1.generateJs() : "null"), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the parent stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setParentStroke(String parentStroke2, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.parentStroke = null;
            this.parentStroke1 = null;
            this.parentStroke2 = null;
            
            this.parentStroke2 = parentStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.parentStroke2 = parentStroke2;
            this.thickness11 = thickness11;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", wrapQuotes(parentStroke2), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentStroke(%s, %f, %s, %s, %s)", wrapQuotes(parentStroke2), thickness11, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill progressFill;

    /**
     * Setter for progress fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setProgressFill(Fill progressFill) {
        if (jsBase == null) {
            this.progressFill = progressFill;
        } else {
            this.progressFill = progressFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s)", ((progressFill != null) ? progressFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s)", ((progressFill != null) ? progressFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color10;
    private Double opacity31;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline progressFill(String color10, Double opacity31) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            
            this.color10 = color10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            
            this.opacity31 = opacity31;
        } else {
            this.color10 = color10;
            this.opacity31 = opacity31;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %f)", wrapQuotes(color10), opacity31));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %f)", wrapQuotes(color10), opacity31));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys40;
    private String[] keys41;
    private Double angle10;
    private Boolean mode40;
    private VectorRect mode41;
    private String mode42;
    private Double opacity32;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(GradientKey[] keys40, Boolean mode40, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys40 = keys40;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode40 = mode40;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys40 = keys40;
            this.mode40 = mode40;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %b, %f, %f)", arrayToString(keys40), mode40, angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %b, %f, %f)", arrayToString(keys40), mode40, angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(GradientKey[] keys40, VectorRect mode41, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys40 = keys40;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode41 = mode41;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys40 = keys40;
            this.mode41 = mode41;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToString(keys40), ((mode41 != null) ? mode41.generateJs() : "null"), angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToString(keys40), ((mode41 != null) ? mode41.generateJs() : "null"), angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(GradientKey[] keys40, String mode42, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys40 = keys40;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode42 = mode42;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys40 = keys40;
            this.mode42 = mode42;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToString(keys40), wrapQuotes(mode42), angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToString(keys40), wrapQuotes(mode42), angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(String[] keys41, Boolean mode40, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys41 = keys41;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode40 = mode40;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys41 = keys41;
            this.mode40 = mode40;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys41), mode40, angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys41), mode40, angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(String[] keys41, VectorRect mode41, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys41 = keys41;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode41 = mode41;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys41 = keys41;
            this.mode41 = mode41;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys41), ((mode41 != null) ? mode41.generateJs() : "null"), angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys41), ((mode41 != null) ? mode41.generateJs() : "null"), angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(String[] keys41, String mode42, Double angle10, Double opacity32) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            
            this.keys41 = keys41;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            
            this.mode42 = mode42;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            
            this.angle10 = angle10;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            
            this.opacity32 = opacity32;
        } else {
            this.keys41 = keys41;
            this.mode42 = mode42;
            this.angle10 = angle10;
            this.opacity32 = opacity32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys41), wrapQuotes(mode42), angle10, opacity32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys41), wrapQuotes(mode42), angle10, opacity32));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys42;
    private String[] keys43;
    private Double cx11;
    private Double cy11;
    private GraphicsMathRect mode43;
    private Double opacity33;
    private Double fx11;
    private Double fy11;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(GradientKey[] keys42, Double cx11, Double cy11, GraphicsMathRect mode43, Double opacity33, Double fx11, Double fy11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            
            this.keys42 = keys42;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            
            this.cx11 = cx11;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            
            this.cy11 = cy11;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            
            this.mode43 = mode43;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            
            this.opacity33 = opacity33;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            
            this.fx11 = fx11;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            
            this.fy11 = fy11;
        } else {
            this.keys42 = keys42;
            this.cx11 = cx11;
            this.cy11 = cy11;
            this.mode43 = mode43;
            this.opacity33 = opacity33;
            this.fx11 = fx11;
            this.fy11 = fy11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys42), cx11, cy11, ((mode43 != null) ? mode43.generateJs() : "null"), opacity33, fx11, fy11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys42), cx11, cy11, ((mode43 != null) ? mode43.generateJs() : "null"), opacity33, fx11, fy11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline progressFill(String[] keys43, Double cx11, Double cy11, GraphicsMathRect mode43, Double opacity33, Double fx11, Double fy11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            
            this.keys43 = keys43;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            
            this.cx11 = cx11;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            
            this.cy11 = cy11;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            
            this.mode43 = mode43;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            
            this.opacity33 = opacity33;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            
            this.fx11 = fx11;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            
            this.fy11 = fy11;
        } else {
            this.keys43 = keys43;
            this.cx11 = cx11;
            this.cy11 = cy11;
            this.mode43 = mode43;
            this.opacity33 = opacity33;
            this.fx11 = fx11;
            this.fy11 = fy11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys43), cx11, cy11, ((mode43 != null) ? mode43.generateJs() : "null"), opacity33, fx11, fy11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys43), cx11, cy11, ((mode43 != null) ? mode43.generateJs() : "null"), opacity33, fx11, fy11));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings10;
    private UiLabelsFactory getProgressLabels;

    /**
     * Getter for progress labels.
     */
    public UiLabelsFactory getProgressLabels() {
        if (getProgressLabels == null)
            getProgressLabels = new UiLabelsFactory(jsBase + ".progressLabels()");

        return getProgressLabels;
    }

    private String progressLabels;
    private Boolean progressLabels1;

    /**
     * Setter for progress labels.
     */
    public UiTimeline setProgressLabels(String progressLabels) {
        if (jsBase == null) {
            this.progressLabels = null;
            this.progressLabels1 = null;
            
            this.progressLabels = progressLabels;
        } else {
            this.progressLabels = progressLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressLabels(%s)", wrapQuotes(progressLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressLabels(%s)", wrapQuotes(progressLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for progress labels.
     */
    public UiTimeline setProgressLabels(Boolean progressLabels1) {
        if (jsBase == null) {
            this.progressLabels = null;
            this.progressLabels1 = null;
            
            this.progressLabels1 = progressLabels1;
        } else {
            this.progressLabels1 = progressLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressLabels(%b)", progressLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressLabels(%b)", progressLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke progressStroke;
    private ColoredFill progressStroke1;
    private String progressStroke2;
    private Double thickness12;
    private String dashpattern12;
    private StrokeLineJoin lineJoin12;
    private StrokeLineCap lineCap12;

    /**
     * Setter for the progress bar stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setProgressStroke(Stroke progressStroke, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        if (jsBase == null) {
            this.progressStroke = null;
            this.progressStroke1 = null;
            this.progressStroke2 = null;
            
            this.progressStroke = progressStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            
            this.dashpattern12 = dashpattern12;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            
            this.lineJoin12 = lineJoin12;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            
            this.lineCap12 = lineCap12;
        } else {
            this.progressStroke = progressStroke;
            this.thickness12 = thickness12;
            this.dashpattern12 = dashpattern12;
            this.lineJoin12 = lineJoin12;
            this.lineCap12 = lineCap12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", ((progressStroke != null) ? progressStroke.generateJs() : "null"), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", ((progressStroke != null) ? progressStroke.generateJs() : "null"), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the progress bar stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setProgressStroke(ColoredFill progressStroke1, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        if (jsBase == null) {
            this.progressStroke = null;
            this.progressStroke1 = null;
            this.progressStroke2 = null;
            
            this.progressStroke1 = progressStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            
            this.dashpattern12 = dashpattern12;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            
            this.lineJoin12 = lineJoin12;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            
            this.lineCap12 = lineCap12;
        } else {
            this.progressStroke1 = progressStroke1;
            this.thickness12 = thickness12;
            this.dashpattern12 = dashpattern12;
            this.lineJoin12 = lineJoin12;
            this.lineCap12 = lineCap12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", ((progressStroke1 != null) ? progressStroke1.generateJs() : "null"), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", ((progressStroke1 != null) ? progressStroke1.generateJs() : "null"), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the progress bar stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setProgressStroke(String progressStroke2, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        if (jsBase == null) {
            this.progressStroke = null;
            this.progressStroke1 = null;
            this.progressStroke2 = null;
            
            this.progressStroke2 = progressStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            
            this.dashpattern12 = dashpattern12;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            
            this.lineJoin12 = lineJoin12;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            
            this.lineCap12 = lineCap12;
        } else {
            this.progressStroke2 = progressStroke2;
            this.thickness12 = thickness12;
            this.dashpattern12 = dashpattern12;
            this.lineJoin12 = lineJoin12;
            this.lineCap12 = lineCap12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", wrapQuotes(progressStroke2), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".progressStroke(%s, %f, %s, %s, %s)", wrapQuotes(progressStroke2), thickness12, wrapQuotes(dashpattern12), ((lineJoin12 != null) ? lineJoin12.generateJs() : "null"), ((lineCap12 != null) ? lineCap12.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttRange> getRangeMarker = new ArrayList<>();

    /**
     * Getter for the range marker.
     */
    public GanttRange getRangeMarker(Double index) {
        GanttRange item = new GanttRange(jsBase + ".rangeMarker(" + index + ")");
        getRangeMarker.add(item);
        return item;
    }

    private String rangeMarker;
    private Boolean rangeMarker1;

    /**
     * Setter for the range marker.
     */
    public UiTimeline setRangeMarker(String rangeMarker) {
        if (jsBase == null) {
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            
            this.rangeMarker = rangeMarker;
        } else {
            this.rangeMarker = rangeMarker;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker.
     */
    public UiTimeline setRangeMarker(Boolean rangeMarker1) {
        if (jsBase == null) {
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            
            this.rangeMarker1 = rangeMarker1;
        } else {
            this.rangeMarker1 = rangeMarker1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;
    private String rangeMarker2;
    private Boolean rangeMarker3;
    private GanttDateTimeMarkers rangeMarker4;
    private String rangeMarker5;

    /**
     * Setter for the range marker by index.
     */
    public UiTimeline setRangeMarker(String rangeMarker2, Double index1) {
        if (jsBase == null) {
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker2 = rangeMarker2;
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.rangeMarker2 = rangeMarker2;
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker by index.
     */
    public UiTimeline setRangeMarker(Boolean rangeMarker3, Double index1) {
        if (jsBase == null) {
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker3 = rangeMarker3;
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.rangeMarker3 = rangeMarker3;
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker by index.
     */
    public UiTimeline setRangeMarker(GanttDateTimeMarkers rangeMarker4, Double index1) {
        if (jsBase == null) {
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker4 = rangeMarker4;
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.rangeMarker4 = rangeMarker4;
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", ((rangeMarker4 != null) ? rangeMarker4.generateJs() : "null"), index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", ((rangeMarker4 != null) ? rangeMarker4.generateJs() : "null"), index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill rowEvenFill;

    /**
     * Setter for row even fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setRowEvenFill(Fill rowEvenFill) {
        if (jsBase == null) {
            this.rowEvenFill = rowEvenFill;
        } else {
            this.rowEvenFill = rowEvenFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s)", ((rowEvenFill != null) ? rowEvenFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s)", ((rowEvenFill != null) ? rowEvenFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color11;
    private Double opacity34;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline rowEvenFill(String color11, Double opacity34) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color11 = color11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            
            this.opacity34 = opacity34;
        } else {
            this.color11 = color11;
            this.opacity34 = opacity34;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color11), opacity34));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color11), opacity34));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys44;
    private String[] keys45;
    private Double angle11;
    private Boolean mode44;
    private VectorRect mode45;
    private String mode46;
    private Double opacity35;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(GradientKey[] keys44, Boolean mode44, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys44 = keys44;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode44 = mode44;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys44 = keys44;
            this.mode44 = mode44;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys44), mode44, angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys44), mode44, angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(GradientKey[] keys44, VectorRect mode45, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys44 = keys44;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode45 = mode45;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys44 = keys44;
            this.mode45 = mode45;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys44), ((mode45 != null) ? mode45.generateJs() : "null"), angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys44), ((mode45 != null) ? mode45.generateJs() : "null"), angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(GradientKey[] keys44, String mode46, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys44 = keys44;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode46 = mode46;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys44 = keys44;
            this.mode46 = mode46;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys44), wrapQuotes(mode46), angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys44), wrapQuotes(mode46), angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(String[] keys45, Boolean mode44, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys45 = keys45;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode44 = mode44;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys45 = keys45;
            this.mode44 = mode44;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys45), mode44, angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys45), mode44, angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(String[] keys45, VectorRect mode45, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys45 = keys45;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode45 = mode45;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys45 = keys45;
            this.mode45 = mode45;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys45), ((mode45 != null) ? mode45.generateJs() : "null"), angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys45), ((mode45 != null) ? mode45.generateJs() : "null"), angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(String[] keys45, String mode46, Double angle11, Double opacity35) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            
            this.keys45 = keys45;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            
            this.mode46 = mode46;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            
            this.angle11 = angle11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            
            this.opacity35 = opacity35;
        } else {
            this.keys45 = keys45;
            this.mode46 = mode46;
            this.angle11 = angle11;
            this.opacity35 = opacity35;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys45), wrapQuotes(mode46), angle11, opacity35));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys45), wrapQuotes(mode46), angle11, opacity35));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys46;
    private String[] keys47;
    private Double cx12;
    private Double cy12;
    private GraphicsMathRect mode47;
    private Double opacity36;
    private Double fx12;
    private Double fy12;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(GradientKey[] keys46, Double cx12, Double cy12, GraphicsMathRect mode47, Double opacity36, Double fx12, Double fy12) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            
            this.keys46 = keys46;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            
            this.cx12 = cx12;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            
            this.cy12 = cy12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            
            this.mode47 = mode47;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            
            this.opacity36 = opacity36;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            
            this.fx12 = fx12;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            
            this.fy12 = fy12;
        } else {
            this.keys46 = keys46;
            this.cx12 = cx12;
            this.cy12 = cy12;
            this.mode47 = mode47;
            this.opacity36 = opacity36;
            this.fx12 = fx12;
            this.fy12 = fy12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys46), cx12, cy12, ((mode47 != null) ? mode47.generateJs() : "null"), opacity36, fx12, fy12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys46), cx12, cy12, ((mode47 != null) ? mode47.generateJs() : "null"), opacity36, fx12, fy12));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowEvenFill(String[] keys47, Double cx12, Double cy12, GraphicsMathRect mode47, Double opacity36, Double fx12, Double fy12) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            
            this.keys47 = keys47;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            
            this.cx12 = cx12;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            
            this.cy12 = cy12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            
            this.mode47 = mode47;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            
            this.opacity36 = opacity36;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            
            this.fx12 = fx12;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            
            this.fy12 = fy12;
        } else {
            this.keys47 = keys47;
            this.cx12 = cx12;
            this.cy12 = cy12;
            this.mode47 = mode47;
            this.opacity36 = opacity36;
            this.fx12 = fx12;
            this.fy12 = fy12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys47), cx12, cy12, ((mode47 != null) ? mode47.generateJs() : "null"), opacity36, fx12, fy12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys47), cx12, cy12, ((mode47 != null) ? mode47.generateJs() : "null"), opacity36, fx12, fy12));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings11;
    private Fill rowFill;

    /**
     * Setter for row fill settings using an array or a string. Resets odd fill and even fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setRowFill(Fill rowFill) {
        if (jsBase == null) {
            this.rowFill = rowFill;
        } else {
            this.rowFill = rowFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s)", ((rowFill != null) ? rowFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s)", ((rowFill != null) ? rowFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color12;
    private Double opacity37;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline rowFill(String color12, Double opacity37) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color12 = color12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            
            this.opacity37 = opacity37;
        } else {
            this.color12 = color12;
            this.opacity37 = opacity37;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f)", wrapQuotes(color12), opacity37));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f)", wrapQuotes(color12), opacity37));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys48;
    private String[] keys49;
    private Double angle12;
    private Boolean mode48;
    private VectorRect mode49;
    private String mode50;
    private Double opacity38;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(GradientKey[] keys48, Boolean mode48, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys48 = keys48;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode48 = mode48;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys48 = keys48;
            this.mode48 = mode48;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToString(keys48), mode48, angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToString(keys48), mode48, angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(GradientKey[] keys48, VectorRect mode49, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys48 = keys48;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode49 = mode49;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys48 = keys48;
            this.mode49 = mode49;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys48), ((mode49 != null) ? mode49.generateJs() : "null"), angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys48), ((mode49 != null) ? mode49.generateJs() : "null"), angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(GradientKey[] keys48, String mode50, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys48 = keys48;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode50 = mode50;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys48 = keys48;
            this.mode50 = mode50;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys48), wrapQuotes(mode50), angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys48), wrapQuotes(mode50), angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(String[] keys49, Boolean mode48, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys49 = keys49;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode48 = mode48;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys49 = keys49;
            this.mode48 = mode48;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys49), mode48, angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys49), mode48, angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(String[] keys49, VectorRect mode49, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys49 = keys49;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode49 = mode49;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys49 = keys49;
            this.mode49 = mode49;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys49), ((mode49 != null) ? mode49.generateJs() : "null"), angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys49), ((mode49 != null) ? mode49.generateJs() : "null"), angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(String[] keys49, String mode50, Double angle12, Double opacity38) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            
            this.keys49 = keys49;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            
            this.mode50 = mode50;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            
            this.angle12 = angle12;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            
            this.opacity38 = opacity38;
        } else {
            this.keys49 = keys49;
            this.mode50 = mode50;
            this.angle12 = angle12;
            this.opacity38 = opacity38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys49), wrapQuotes(mode50), angle12, opacity38));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys49), wrapQuotes(mode50), angle12, opacity38));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys50;
    private String[] keys51;
    private Double cx13;
    private Double cy13;
    private GraphicsMathRect mode51;
    private Double opacity39;
    private Double fx13;
    private Double fy13;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(GradientKey[] keys50, Double cx13, Double cy13, GraphicsMathRect mode51, Double opacity39, Double fx13, Double fy13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            
            this.keys50 = keys50;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            
            this.cx13 = cx13;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            
            this.cy13 = cy13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            
            this.mode51 = mode51;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            
            this.opacity39 = opacity39;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            
            this.fx13 = fx13;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            
            this.fy13 = fy13;
        } else {
            this.keys50 = keys50;
            this.cx13 = cx13;
            this.cy13 = cy13;
            this.mode51 = mode51;
            this.opacity39 = opacity39;
            this.fx13 = fx13;
            this.fy13 = fy13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys50), cx13, cy13, ((mode51 != null) ? mode51.generateJs() : "null"), opacity39, fx13, fy13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys50), cx13, cy13, ((mode51 != null) ? mode51.generateJs() : "null"), opacity39, fx13, fy13));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowFill(String[] keys51, Double cx13, Double cy13, GraphicsMathRect mode51, Double opacity39, Double fx13, Double fy13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            
            this.keys51 = keys51;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            
            this.cx13 = cx13;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            
            this.cy13 = cy13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            
            this.mode51 = mode51;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            
            this.opacity39 = opacity39;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            
            this.fx13 = fx13;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            
            this.fy13 = fy13;
        } else {
            this.keys51 = keys51;
            this.cx13 = cx13;
            this.cy13 = cy13;
            this.mode51 = mode51;
            this.opacity39 = opacity39;
            this.fx13 = fx13;
            this.fy13 = fy13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys51), cx13, cy13, ((mode51 != null) ? mode51.generateJs() : "null"), opacity39, fx13, fy13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys51), cx13, cy13, ((mode51 != null) ? mode51.generateJs() : "null"), opacity39, fx13, fy13));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings12;
    private Fill rowHoverFill;

    /**
     * Setter for row hover fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setRowHoverFill(Fill rowHoverFill) {
        if (jsBase == null) {
            this.rowHoverFill = rowHoverFill;
        } else {
            this.rowHoverFill = rowHoverFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color13;
    private Double opacity40;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline rowHoverFill(String color13, Double opacity40) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            
            this.color13 = color13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            
            this.opacity40 = opacity40;
        } else {
            this.color13 = color13;
            this.opacity40 = opacity40;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color13), opacity40));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color13), opacity40));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys52;
    private String[] keys53;
    private Double angle13;
    private Boolean mode52;
    private VectorRect mode53;
    private String mode54;
    private Double opacity41;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(GradientKey[] keys52, Boolean mode52, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys52 = keys52;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode52 = mode52;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys52 = keys52;
            this.mode52 = mode52;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys52), mode52, angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys52), mode52, angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(GradientKey[] keys52, VectorRect mode53, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys52 = keys52;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode53 = mode53;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys52 = keys52;
            this.mode53 = mode53;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys52), ((mode53 != null) ? mode53.generateJs() : "null"), angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys52), ((mode53 != null) ? mode53.generateJs() : "null"), angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(GradientKey[] keys52, String mode54, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys52 = keys52;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode54 = mode54;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys52 = keys52;
            this.mode54 = mode54;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys52), wrapQuotes(mode54), angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys52), wrapQuotes(mode54), angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(String[] keys53, Boolean mode52, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys53 = keys53;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode52 = mode52;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys53 = keys53;
            this.mode52 = mode52;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys53), mode52, angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys53), mode52, angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(String[] keys53, VectorRect mode53, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys53 = keys53;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode53 = mode53;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys53 = keys53;
            this.mode53 = mode53;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys53), ((mode53 != null) ? mode53.generateJs() : "null"), angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys53), ((mode53 != null) ? mode53.generateJs() : "null"), angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(String[] keys53, String mode54, Double angle13, Double opacity41) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            
            this.keys53 = keys53;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            
            this.mode54 = mode54;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            
            this.angle13 = angle13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            
            this.opacity41 = opacity41;
        } else {
            this.keys53 = keys53;
            this.mode54 = mode54;
            this.angle13 = angle13;
            this.opacity41 = opacity41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys53), wrapQuotes(mode54), angle13, opacity41));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys53), wrapQuotes(mode54), angle13, opacity41));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys54;
    private String[] keys55;
    private Double cx14;
    private Double cy14;
    private GraphicsMathRect mode55;
    private Double opacity42;
    private Double fx14;
    private Double fy14;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(GradientKey[] keys54, Double cx14, Double cy14, GraphicsMathRect mode55, Double opacity42, Double fx14, Double fy14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            
            this.keys54 = keys54;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            
            this.cx14 = cx14;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            
            this.cy14 = cy14;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            
            this.mode55 = mode55;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            
            this.opacity42 = opacity42;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            
            this.fx14 = fx14;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            
            this.fy14 = fy14;
        } else {
            this.keys54 = keys54;
            this.cx14 = cx14;
            this.cy14 = cy14;
            this.mode55 = mode55;
            this.opacity42 = opacity42;
            this.fx14 = fx14;
            this.fy14 = fy14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys54), cx14, cy14, ((mode55 != null) ? mode55.generateJs() : "null"), opacity42, fx14, fy14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys54), cx14, cy14, ((mode55 != null) ? mode55.generateJs() : "null"), opacity42, fx14, fy14));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowHoverFill(String[] keys55, Double cx14, Double cy14, GraphicsMathRect mode55, Double opacity42, Double fx14, Double fy14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            
            this.keys55 = keys55;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            
            this.cx14 = cx14;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            
            this.cy14 = cy14;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            
            this.mode55 = mode55;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            
            this.opacity42 = opacity42;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            
            this.fx14 = fx14;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            
            this.fy14 = fy14;
        } else {
            this.keys55 = keys55;
            this.cx14 = cx14;
            this.cy14 = cy14;
            this.mode55 = mode55;
            this.opacity42 = opacity42;
            this.fx14 = fx14;
            this.fy14 = fy14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys55), cx14, cy14, ((mode55 != null) ? mode55.generateJs() : "null"), opacity42, fx14, fy14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys55), cx14, cy14, ((mode55 != null) ? mode55.generateJs() : "null"), opacity42, fx14, fy14));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill rowOddFill;

    /**
     * Setter for row odd fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setRowOddFill(Fill rowOddFill) {
        if (jsBase == null) {
            this.rowOddFill = rowOddFill;
        } else {
            this.rowOddFill = rowOddFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s)", ((rowOddFill != null) ? rowOddFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s)", ((rowOddFill != null) ? rowOddFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color14;
    private Double opacity43;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline rowOddFill(String color14, Double opacity43) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            
            this.opacity43 = opacity43;
        } else {
            this.color14 = color14;
            this.opacity43 = opacity43;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color14), opacity43));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color14), opacity43));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys56;
    private String[] keys57;
    private Double angle14;
    private Boolean mode56;
    private VectorRect mode57;
    private String mode58;
    private Double opacity44;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(GradientKey[] keys56, Boolean mode56, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys56 = keys56;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode56 = mode56;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys56 = keys56;
            this.mode56 = mode56;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys56), mode56, angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys56), mode56, angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(GradientKey[] keys56, VectorRect mode57, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys56 = keys56;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode57 = mode57;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys56 = keys56;
            this.mode57 = mode57;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys56), ((mode57 != null) ? mode57.generateJs() : "null"), angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys56), ((mode57 != null) ? mode57.generateJs() : "null"), angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(GradientKey[] keys56, String mode58, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys56 = keys56;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode58 = mode58;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys56 = keys56;
            this.mode58 = mode58;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys56), wrapQuotes(mode58), angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys56), wrapQuotes(mode58), angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(String[] keys57, Boolean mode56, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys57 = keys57;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode56 = mode56;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys57 = keys57;
            this.mode56 = mode56;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys57), mode56, angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys57), mode56, angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(String[] keys57, VectorRect mode57, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys57 = keys57;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode57 = mode57;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys57 = keys57;
            this.mode57 = mode57;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys57), ((mode57 != null) ? mode57.generateJs() : "null"), angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys57), ((mode57 != null) ? mode57.generateJs() : "null"), angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(String[] keys57, String mode58, Double angle14, Double opacity44) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            
            this.keys57 = keys57;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            
            this.mode58 = mode58;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            
            this.angle14 = angle14;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            
            this.opacity44 = opacity44;
        } else {
            this.keys57 = keys57;
            this.mode58 = mode58;
            this.angle14 = angle14;
            this.opacity44 = opacity44;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys57), wrapQuotes(mode58), angle14, opacity44));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys57), wrapQuotes(mode58), angle14, opacity44));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys58;
    private String[] keys59;
    private Double cx15;
    private Double cy15;
    private GraphicsMathRect mode59;
    private Double opacity45;
    private Double fx15;
    private Double fy15;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(GradientKey[] keys58, Double cx15, Double cy15, GraphicsMathRect mode59, Double opacity45, Double fx15, Double fy15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            
            this.keys58 = keys58;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            
            this.cx15 = cx15;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            
            this.cy15 = cy15;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            
            this.mode59 = mode59;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            
            this.opacity45 = opacity45;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            
            this.fx15 = fx15;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            
            this.fy15 = fy15;
        } else {
            this.keys58 = keys58;
            this.cx15 = cx15;
            this.cy15 = cy15;
            this.mode59 = mode59;
            this.opacity45 = opacity45;
            this.fx15 = fx15;
            this.fy15 = fy15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys58), cx15, cy15, ((mode59 != null) ? mode59.generateJs() : "null"), opacity45, fx15, fy15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys58), cx15, cy15, ((mode59 != null) ? mode59.generateJs() : "null"), opacity45, fx15, fy15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowOddFill(String[] keys59, Double cx15, Double cy15, GraphicsMathRect mode59, Double opacity45, Double fx15, Double fy15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            
            this.keys59 = keys59;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            
            this.cx15 = cx15;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            
            this.cy15 = cy15;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            
            this.mode59 = mode59;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            
            this.opacity45 = opacity45;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            
            this.fx15 = fx15;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            
            this.fy15 = fy15;
        } else {
            this.keys59 = keys59;
            this.cx15 = cx15;
            this.cy15 = cy15;
            this.mode59 = mode59;
            this.opacity45 = opacity45;
            this.fx15 = fx15;
            this.fy15 = fy15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys59), cx15, cy15, ((mode59 != null) ? mode59.generateJs() : "null"), opacity45, fx15, fy15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys59), cx15, cy15, ((mode59 != null) ? mode59.generateJs() : "null"), opacity45, fx15, fy15));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings13;
    private Fill rowSelectedFill;

    /**
     * Setter for row fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setRowSelectedFill(Fill rowSelectedFill) {
        if (jsBase == null) {
            this.rowSelectedFill = rowSelectedFill;
        } else {
            this.rowSelectedFill = rowSelectedFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color15;
    private Double opacity46;

    /**
     * Fill color in selected mode with opacity. Fill as a string or an object.
     */
    public UiTimeline rowSelectedFill(String color15, Double opacity46) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color15 = color15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            
            this.opacity46 = opacity46;
        } else {
            this.color15 = color15;
            this.opacity46 = opacity46;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color15), opacity46));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color15), opacity46));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys60;
    private String[] keys61;
    private Double angle15;
    private Boolean mode60;
    private VectorRect mode61;
    private String mode62;

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(GradientKey[] keys60, Boolean mode60, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys60 = keys60;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode60 = mode60;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys60 = keys60;
            this.mode60 = mode60;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToString(keys60), mode60, angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToString(keys60), mode60, angle15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(GradientKey[] keys60, VectorRect mode61, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys60 = keys60;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode61 = mode61;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys60 = keys60;
            this.mode61 = mode61;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys60), ((mode61 != null) ? mode61.generateJs() : "null"), angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys60), ((mode61 != null) ? mode61.generateJs() : "null"), angle15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(GradientKey[] keys60, String mode62, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys60 = keys60;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode62 = mode62;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys60 = keys60;
            this.mode62 = mode62;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys60), wrapQuotes(mode62), angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys60), wrapQuotes(mode62), angle15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(String[] keys61, Boolean mode60, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys61 = keys61;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode60 = mode60;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys61 = keys61;
            this.mode60 = mode60;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToStringWrapQuotes(keys61), mode60, angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToStringWrapQuotes(keys61), mode60, angle15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(String[] keys61, VectorRect mode61, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys61 = keys61;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode61 = mode61;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys61 = keys61;
            this.mode61 = mode61;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys61), ((mode61 != null) ? mode61.generateJs() : "null"), angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys61), ((mode61 != null) ? mode61.generateJs() : "null"), angle15));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(String[] keys61, String mode62, Double angle15) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            
            this.keys61 = keys61;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            
            this.mode62 = mode62;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            
            this.angle15 = angle15;
        } else {
            this.keys61 = keys61;
            this.mode62 = mode62;
            this.angle15 = angle15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys61), wrapQuotes(mode62), angle15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys61), wrapQuotes(mode62), angle15));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys62;
    private String[] keys63;
    private Double cx16;
    private Double cy16;
    private GraphicsMathRect mode63;
    private Double opacity47;
    private Double fx16;
    private Double fy16;

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(GradientKey[] keys62, Double cx16, Double cy16, GraphicsMathRect mode63, Double opacity47, Double fx16, Double fy16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            
            this.keys62 = keys62;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            this.cx16 = null;
            
            this.cx16 = cx16;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            this.cy16 = null;
            
            this.cy16 = cy16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            
            this.mode63 = mode63;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            
            this.opacity47 = opacity47;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            this.fx16 = null;
            
            this.fx16 = fx16;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            this.fy16 = null;
            
            this.fy16 = fy16;
        } else {
            this.keys62 = keys62;
            this.cx16 = cx16;
            this.cy16 = cy16;
            this.mode63 = mode63;
            this.opacity47 = opacity47;
            this.fx16 = fx16;
            this.fy16 = fy16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys62), cx16, cy16, ((mode63 != null) ? mode63.generateJs() : "null"), opacity47, fx16, fy16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys62), cx16, cy16, ((mode63 != null) ? mode63.generateJs() : "null"), opacity47, fx16, fy16));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline rowSelectedFill(String[] keys63, Double cx16, Double cy16, GraphicsMathRect mode63, Double opacity47, Double fx16, Double fy16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            
            this.keys63 = keys63;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            this.cx16 = null;
            
            this.cx16 = cx16;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            this.cy16 = null;
            
            this.cy16 = cy16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            
            this.mode63 = mode63;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            
            this.opacity47 = opacity47;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            this.fx16 = null;
            
            this.fx16 = fx16;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            this.fy16 = null;
            
            this.fy16 = fy16;
        } else {
            this.keys63 = keys63;
            this.cx16 = cx16;
            this.cy16 = cy16;
            this.mode63 = mode63;
            this.opacity47 = opacity47;
            this.fx16 = fx16;
            this.fy16 = fy16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys63), cx16, cy16, ((mode63 != null) ? mode63.generateJs() : "null"), opacity47, fx16, fy16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys63), cx16, cy16, ((mode63 != null) ? mode63.generateJs() : "null"), opacity47, fx16, fy16));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings14;
    private GanttDateTime getScale;

    /**
     * Getter for the timeline scale.
     */
    public GanttDateTime getScale() {
        if (getScale == null)
            getScale = new GanttDateTime(jsBase + ".scale()");

        return getScale;
    }

    private String scale;

    /**
     * Setter for the timeline scale.
     */
    public UiTimeline setScale(String scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill selectedElementFill;

    /**
     * Setter for selected element fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline setSelectedElementFill(Fill selectedElementFill) {
        if (jsBase == null) {
            this.selectedElementFill = selectedElementFill;
        } else {
            this.selectedElementFill = selectedElementFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s)", ((selectedElementFill != null) ? selectedElementFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s)", ((selectedElementFill != null) ? selectedElementFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color16;
    private Double opacity48;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTimeline selectedElementFill(String color16, Double opacity48) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            
            this.color16 = color16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            
            this.opacity48 = opacity48;
        } else {
            this.color16 = color16;
            this.opacity48 = opacity48;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %f)", wrapQuotes(color16), opacity48));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %f)", wrapQuotes(color16), opacity48));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys64;
    private String[] keys65;
    private Double angle16;
    private Boolean mode64;
    private VectorRect mode65;
    private String mode66;
    private Double opacity49;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(GradientKey[] keys64, Boolean mode64, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys64 = keys64;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode64 = mode64;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys64 = keys64;
            this.mode64 = mode64;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %b, %f, %f)", arrayToString(keys64), mode64, angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %b, %f, %f)", arrayToString(keys64), mode64, angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(GradientKey[] keys64, VectorRect mode65, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys64 = keys64;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode65 = mode65;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys64 = keys64;
            this.mode65 = mode65;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToString(keys64), ((mode65 != null) ? mode65.generateJs() : "null"), angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToString(keys64), ((mode65 != null) ? mode65.generateJs() : "null"), angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(GradientKey[] keys64, String mode66, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys64 = keys64;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode66 = mode66;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys64 = keys64;
            this.mode66 = mode66;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToString(keys64), wrapQuotes(mode66), angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToString(keys64), wrapQuotes(mode66), angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(String[] keys65, Boolean mode64, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys65 = keys65;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode64 = mode64;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys65 = keys65;
            this.mode64 = mode64;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys65), mode64, angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys65), mode64, angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(String[] keys65, VectorRect mode65, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys65 = keys65;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode65 = mode65;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys65 = keys65;
            this.mode65 = mode65;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys65), ((mode65 != null) ? mode65.generateJs() : "null"), angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys65), ((mode65 != null) ? mode65.generateJs() : "null"), angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(String[] keys65, String mode66, Double angle16, Double opacity49) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            
            this.keys65 = keys65;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            
            this.mode66 = mode66;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            this.angle7 = null;
            this.angle8 = null;
            this.angle9 = null;
            this.angle10 = null;
            this.angle11 = null;
            this.angle12 = null;
            this.angle13 = null;
            this.angle14 = null;
            this.angle15 = null;
            this.angle16 = null;
            
            this.angle16 = angle16;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            
            this.opacity49 = opacity49;
        } else {
            this.keys65 = keys65;
            this.mode66 = mode66;
            this.angle16 = angle16;
            this.opacity49 = opacity49;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys65), wrapQuotes(mode66), angle16, opacity49));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys65), wrapQuotes(mode66), angle16, opacity49));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys66;
    private String[] keys67;
    private Double cx17;
    private Double cy17;
    private GraphicsMathRect mode67;
    private Double opacity50;
    private Double fx17;
    private Double fy17;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(GradientKey[] keys66, Double cx17, Double cy17, GraphicsMathRect mode67, Double opacity50, Double fx17, Double fy17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            this.keys66 = null;
            this.keys67 = null;
            
            this.keys66 = keys66;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            this.cx16 = null;
            this.cx17 = null;
            
            this.cx17 = cx17;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            this.cy16 = null;
            this.cy17 = null;
            
            this.cy17 = cy17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            this.mode67 = null;
            
            this.mode67 = mode67;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            this.opacity50 = null;
            
            this.opacity50 = opacity50;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            this.fx16 = null;
            this.fx17 = null;
            
            this.fx17 = fx17;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            this.fy16 = null;
            this.fy17 = null;
            
            this.fy17 = fy17;
        } else {
            this.keys66 = keys66;
            this.cx17 = cx17;
            this.cy17 = cy17;
            this.mode67 = mode67;
            this.opacity50 = opacity50;
            this.fx17 = fx17;
            this.fy17 = fy17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys66), cx17, cy17, ((mode67 != null) ? mode67.generateJs() : "null"), opacity50, fx17, fy17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys66), cx17, cy17, ((mode67 != null) ? mode67.generateJs() : "null"), opacity50, fx17, fy17));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTimeline selectedElementFill(String[] keys67, Double cx17, Double cy17, GraphicsMathRect mode67, Double opacity50, Double fx17, Double fy17) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            this.keys28 = null;
            this.keys29 = null;
            this.keys30 = null;
            this.keys31 = null;
            this.keys32 = null;
            this.keys33 = null;
            this.keys34 = null;
            this.keys35 = null;
            this.keys36 = null;
            this.keys37 = null;
            this.keys38 = null;
            this.keys39 = null;
            this.keys40 = null;
            this.keys41 = null;
            this.keys42 = null;
            this.keys43 = null;
            this.keys44 = null;
            this.keys45 = null;
            this.keys46 = null;
            this.keys47 = null;
            this.keys48 = null;
            this.keys49 = null;
            this.keys50 = null;
            this.keys51 = null;
            this.keys52 = null;
            this.keys53 = null;
            this.keys54 = null;
            this.keys55 = null;
            this.keys56 = null;
            this.keys57 = null;
            this.keys58 = null;
            this.keys59 = null;
            this.keys60 = null;
            this.keys61 = null;
            this.keys62 = null;
            this.keys63 = null;
            this.keys64 = null;
            this.keys65 = null;
            this.keys66 = null;
            this.keys67 = null;
            
            this.keys67 = keys67;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            this.cx7 = null;
            this.cx8 = null;
            this.cx9 = null;
            this.cx10 = null;
            this.cx11 = null;
            this.cx12 = null;
            this.cx13 = null;
            this.cx14 = null;
            this.cx15 = null;
            this.cx16 = null;
            this.cx17 = null;
            
            this.cx17 = cx17;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            this.cy7 = null;
            this.cy8 = null;
            this.cy9 = null;
            this.cy10 = null;
            this.cy11 = null;
            this.cy12 = null;
            this.cy13 = null;
            this.cy14 = null;
            this.cy15 = null;
            this.cy16 = null;
            this.cy17 = null;
            
            this.cy17 = cy17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            this.mode28 = null;
            this.mode29 = null;
            this.mode30 = null;
            this.mode31 = null;
            this.mode32 = null;
            this.mode33 = null;
            this.mode34 = null;
            this.mode35 = null;
            this.mode36 = null;
            this.mode37 = null;
            this.mode38 = null;
            this.mode39 = null;
            this.mode40 = null;
            this.mode41 = null;
            this.mode42 = null;
            this.mode43 = null;
            this.mode44 = null;
            this.mode45 = null;
            this.mode46 = null;
            this.mode47 = null;
            this.mode48 = null;
            this.mode49 = null;
            this.mode50 = null;
            this.mode51 = null;
            this.mode52 = null;
            this.mode53 = null;
            this.mode54 = null;
            this.mode55 = null;
            this.mode56 = null;
            this.mode57 = null;
            this.mode58 = null;
            this.mode59 = null;
            this.mode60 = null;
            this.mode61 = null;
            this.mode62 = null;
            this.mode63 = null;
            this.mode64 = null;
            this.mode65 = null;
            this.mode66 = null;
            this.mode67 = null;
            
            this.mode67 = mode67;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            this.opacity20 = null;
            this.opacity21 = null;
            this.opacity22 = null;
            this.opacity23 = null;
            this.opacity24 = null;
            this.opacity25 = null;
            this.opacity26 = null;
            this.opacity27 = null;
            this.opacity28 = null;
            this.opacity29 = null;
            this.opacity30 = null;
            this.opacity31 = null;
            this.opacity32 = null;
            this.opacity33 = null;
            this.opacity34 = null;
            this.opacity35 = null;
            this.opacity36 = null;
            this.opacity37 = null;
            this.opacity38 = null;
            this.opacity39 = null;
            this.opacity40 = null;
            this.opacity41 = null;
            this.opacity42 = null;
            this.opacity43 = null;
            this.opacity44 = null;
            this.opacity45 = null;
            this.opacity46 = null;
            this.opacity47 = null;
            this.opacity48 = null;
            this.opacity49 = null;
            this.opacity50 = null;
            
            this.opacity50 = opacity50;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            this.fx7 = null;
            this.fx8 = null;
            this.fx9 = null;
            this.fx10 = null;
            this.fx11 = null;
            this.fx12 = null;
            this.fx13 = null;
            this.fx14 = null;
            this.fx15 = null;
            this.fx16 = null;
            this.fx17 = null;
            
            this.fx17 = fx17;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            this.fy7 = null;
            this.fy8 = null;
            this.fy9 = null;
            this.fy10 = null;
            this.fy11 = null;
            this.fy12 = null;
            this.fy13 = null;
            this.fy14 = null;
            this.fy15 = null;
            this.fy16 = null;
            this.fy17 = null;
            
            this.fy17 = fy17;
        } else {
            this.keys67 = keys67;
            this.cx17 = cx17;
            this.cy17 = cy17;
            this.mode67 = mode67;
            this.opacity50 = opacity50;
            this.fx17 = fx17;
            this.fy17 = fy17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys67), cx17, cy17, ((mode67 != null) ? mode67.generateJs() : "null"), opacity50, fx17, fy17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys67), cx17, cy17, ((mode67 != null) ? mode67.generateJs() : "null"), opacity50, fx17, fy17));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings15;
    private Stroke selectedElementStroke;
    private ColoredFill selectedElementStroke1;
    private String selectedElementStroke2;
    private Double thickness13;
    private String dashpattern13;
    private StrokeLineJoin lineJoin13;
    private StrokeLineCap lineCap13;

    /**
     * Setter for the selected element on timeline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setSelectedElementStroke(Stroke selectedElementStroke, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        if (jsBase == null) {
            this.selectedElementStroke = null;
            this.selectedElementStroke1 = null;
            this.selectedElementStroke2 = null;
            
            this.selectedElementStroke = selectedElementStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            this.dashpattern13 = null;
            
            this.dashpattern13 = dashpattern13;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            this.lineJoin13 = null;
            
            this.lineJoin13 = lineJoin13;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            this.lineCap13 = null;
            
            this.lineCap13 = lineCap13;
        } else {
            this.selectedElementStroke = selectedElementStroke;
            this.thickness13 = thickness13;
            this.dashpattern13 = dashpattern13;
            this.lineJoin13 = lineJoin13;
            this.lineCap13 = lineCap13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", ((selectedElementStroke != null) ? selectedElementStroke.generateJs() : "null"), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", ((selectedElementStroke != null) ? selectedElementStroke.generateJs() : "null"), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the selected element on timeline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setSelectedElementStroke(ColoredFill selectedElementStroke1, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        if (jsBase == null) {
            this.selectedElementStroke = null;
            this.selectedElementStroke1 = null;
            this.selectedElementStroke2 = null;
            
            this.selectedElementStroke1 = selectedElementStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            this.dashpattern13 = null;
            
            this.dashpattern13 = dashpattern13;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            this.lineJoin13 = null;
            
            this.lineJoin13 = lineJoin13;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            this.lineCap13 = null;
            
            this.lineCap13 = lineCap13;
        } else {
            this.selectedElementStroke1 = selectedElementStroke1;
            this.thickness13 = thickness13;
            this.dashpattern13 = dashpattern13;
            this.lineJoin13 = lineJoin13;
            this.lineCap13 = lineCap13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", ((selectedElementStroke1 != null) ? selectedElementStroke1.generateJs() : "null"), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", ((selectedElementStroke1 != null) ? selectedElementStroke1.generateJs() : "null"), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the selected element on timeline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTimeline setSelectedElementStroke(String selectedElementStroke2, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        if (jsBase == null) {
            this.selectedElementStroke = null;
            this.selectedElementStroke1 = null;
            this.selectedElementStroke2 = null;
            
            this.selectedElementStroke2 = selectedElementStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            this.dashpattern12 = null;
            this.dashpattern13 = null;
            
            this.dashpattern13 = dashpattern13;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            this.lineJoin12 = null;
            this.lineJoin13 = null;
            
            this.lineJoin13 = lineJoin13;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            this.lineCap12 = null;
            this.lineCap13 = null;
            
            this.lineCap13 = lineCap13;
        } else {
            this.selectedElementStroke2 = selectedElementStroke2;
            this.thickness13 = thickness13;
            this.dashpattern13 = dashpattern13;
            this.lineJoin13 = lineJoin13;
            this.lineCap13 = lineCap13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", wrapQuotes(selectedElementStroke2), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedElementStroke(%s, %f, %s, %s, %s)", wrapQuotes(selectedElementStroke2), thickness13, wrapQuotes(dashpattern13), ((lineJoin13 != null) ? lineJoin13.generateJs() : "null"), ((lineCap13 != null) ? lineCap13.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttText> getTextMarker = new ArrayList<>();

    /**
     * Getter for the text marker.
     */
    public GanttText getTextMarker(Double index) {
        GanttText item = new GanttText(jsBase + ".textMarker(" + index + ")");
        getTextMarker.add(item);
        return item;
    }

    private String textMarker;
    private Boolean textMarker1;

    /**
     * Setter for the text marker.
     */
    public UiTimeline setTextMarker(String textMarker) {
        if (jsBase == null) {
            this.textMarker = null;
            this.textMarker1 = null;
            
            this.textMarker = textMarker;
        } else {
            this.textMarker = textMarker;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text marker.
     */
    public UiTimeline setTextMarker(Boolean textMarker1) {
        if (jsBase == null) {
            this.textMarker = null;
            this.textMarker1 = null;
            
            this.textMarker1 = textMarker1;
        } else {
            this.textMarker1 = textMarker1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textMarker(%b)", textMarker1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b)", textMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index2;
    private String textMarker2;
    private Boolean textMarker3;
    private GanttDateTimeMarkers textMarker4;
    private String textMarker5;

    /**
     * Setter for text marker by index.
     */
    public UiTimeline setTextMarker(String textMarker2, Double index2) {
        if (jsBase == null) {
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker2 = textMarker2;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.textMarker2 = textMarker2;
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text marker by index.
     */
    public UiTimeline setTextMarker(Boolean textMarker3, Double index2) {
        if (jsBase == null) {
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker3 = textMarker3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.textMarker3 = textMarker3;
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text marker by index.
     */
    public UiTimeline setTextMarker(GanttDateTimeMarkers textMarker4, Double index2) {
        if (jsBase == null) {
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker4 = textMarker4;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.textMarker4 = textMarker4;
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textMarker(%s, %f)", ((textMarker4 != null) ? textMarker4.generateJs() : "null"), index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", ((textMarker4 != null) ? textMarker4.generateJs() : "null"), index2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tooltip getTooltip;

    /**
     * Getter for tooltip settings.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    /**
     * Setter for the tooltip.
     */
    public UiTimeline setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the tooltip.
     */
    public UiTimeline setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".tooltip(%b)", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScrollBar getVerticalScrollBar;

    /**
     * Getter for the vertical scroll bar.
     */
    public ScrollBar getVerticalScrollBar() {
        if (getVerticalScrollBar == null)
            getVerticalScrollBar = new ScrollBar(jsBase + ".verticalScrollBar()");

        return getVerticalScrollBar;
    }

    private String verticalScrollBar;

    /**
     * Setter for the vertical scroll bar.
     */
    public UiTimeline setVerticalScrollBar(String verticalScrollBar) {
        if (jsBase == null) {
            this.verticalScrollBar = verticalScrollBar;
        } else {
            this.verticalScrollBar = verticalScrollBar;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBaseLabels() {
        if (getBaseLabels != null) {
            return getBaseLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetBaselineLabels() {
        if (getBaselineLabels != null) {
            return getBaselineLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetHeader() {
        if (getHeader != null) {
            return getHeader.generateJs();
        }
        return "";
    }

    private String generateJSgetHorizontalScrollBar() {
        if (getHorizontalScrollBar != null) {
            return getHorizontalScrollBar.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLineMarker() {
        if (!getLineMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : getLineMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetMilestoneLabels() {
        if (getMilestoneLabels != null) {
            return getMilestoneLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetParentLabels() {
        if (getParentLabels != null) {
            return getParentLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetProgressLabels() {
        if (getProgressLabels != null) {
            return getProgressLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetRangeMarker() {
        if (!getRangeMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : getRangeMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetTextMarker() {
        if (!getTextMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : getTextMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }

    private String generateJSgetVerticalScrollBar() {
        if (getVerticalScrollBar != null) {
            return getVerticalScrollBar.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBaseLabels());
        jsGetters.append(generateJSgetBaselineLabels());
        jsGetters.append(generateJSgetHeader());
        jsGetters.append(generateJSgetHorizontalScrollBar());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLineMarker());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetMilestoneLabels());
        jsGetters.append(generateJSgetParentLabels());
        jsGetters.append(generateJSgetProgressLabels());
        jsGetters.append(generateJSgetRangeMarker());
        jsGetters.append(generateJSgetScale());
        jsGetters.append(generateJSgetTextMarker());
        jsGetters.append(generateJSgetTooltip());
        jsGetters.append(generateJSgetVerticalScrollBar());

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
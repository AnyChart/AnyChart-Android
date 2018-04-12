package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class for the Gantt chart timeline.
 */
public class Timeline extends JsObject {

    public Timeline() {
        js.setLength(0);
        js.append("var timeline").append(++variableIndex).append(" = anychart.core.ui.timeline();");
        jsBase = "timeline" + variableIndex;
    }

    protected Timeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Timeline(StringBuilder js, String jsBase, boolean isChain) {
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
    public Timeline setBackgroundFill(Fill backgroundFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s);", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Number opacity;

    /**
     * Fill color with opacity.
     */
    public Timeline backgroundFill(String color, Number opacity) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s);", wrapQuotes(color), opacity));
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(String[] keys1, Number angle, Number opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline backgroundFill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private String baseBarOffset;
    private Number baseBarOffset1;

    /**
     * Setter for the base bar offset.
     */
    public Timeline setBaseBarOffset(String baseBarOffset) {
        if (jsBase == null) {
            this.baseBarOffset = null;
            this.baseBarOffset1 = null;
            
            this.baseBarOffset = baseBarOffset;
        } else {
            this.baseBarOffset = baseBarOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baseBarOffset(%s)", wrapQuotes(baseBarOffset)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baseBarOffset(%s);", wrapQuotes(baseBarOffset)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the base bar offset.
     */
    public Timeline setBaseBarOffset(Number baseBarOffset1) {
        if (jsBase == null) {
            this.baseBarOffset = null;
            this.baseBarOffset1 = null;
            
            this.baseBarOffset1 = baseBarOffset1;
        } else {
            this.baseBarOffset1 = baseBarOffset1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baseBarOffset(%s)", baseBarOffset1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baseBarOffset(%s);", baseBarOffset1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String baselineBarAnchor;
    private EnumsAnchor baselineBarAnchor1;

    /**
     * Setter for the baseline bar anchor.
     */
    public Timeline setBaselineBarAnchor(String baselineBarAnchor) {
        if (jsBase == null) {
            this.baselineBarAnchor = null;
            this.baselineBarAnchor1 = null;
            
            this.baselineBarAnchor = baselineBarAnchor;
        } else {
            this.baselineBarAnchor = baselineBarAnchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarAnchor(%s)", wrapQuotes(baselineBarAnchor)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarAnchor(%s);", wrapQuotes(baselineBarAnchor)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline bar anchor.
     */
    public Timeline setBaselineBarAnchor(EnumsAnchor baselineBarAnchor1) {
        if (jsBase == null) {
            this.baselineBarAnchor = null;
            this.baselineBarAnchor1 = null;
            
            this.baselineBarAnchor1 = baselineBarAnchor1;
        } else {
            this.baselineBarAnchor1 = baselineBarAnchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarAnchor(%s)", ((baselineBarAnchor1 != null) ? baselineBarAnchor1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarAnchor(%s);", ((baselineBarAnchor1 != null) ? baselineBarAnchor1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String baselineBarHeight;
    private Number baselineBarHeight1;

    /**
     * Setter for the baseline bar height.
     */
    public Timeline setBaselineBarHeight(String baselineBarHeight) {
        if (jsBase == null) {
            this.baselineBarHeight = null;
            this.baselineBarHeight1 = null;
            
            this.baselineBarHeight = baselineBarHeight;
        } else {
            this.baselineBarHeight = baselineBarHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarHeight(%s)", wrapQuotes(baselineBarHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarHeight(%s);", wrapQuotes(baselineBarHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline bar height.
     */
    public Timeline setBaselineBarHeight(Number baselineBarHeight1) {
        if (jsBase == null) {
            this.baselineBarHeight = null;
            this.baselineBarHeight1 = null;
            
            this.baselineBarHeight1 = baselineBarHeight1;
        } else {
            this.baselineBarHeight1 = baselineBarHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarHeight(%s)", baselineBarHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarHeight(%s);", baselineBarHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String baselineBarOffset;
    private Number baselineBarOffset1;

    /**
     * Setter for the baseline bar offset.
     */
    public Timeline setBaselineBarOffset(String baselineBarOffset) {
        if (jsBase == null) {
            this.baselineBarOffset = null;
            this.baselineBarOffset1 = null;
            
            this.baselineBarOffset = baselineBarOffset;
        } else {
            this.baselineBarOffset = baselineBarOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarOffset(%s)", wrapQuotes(baselineBarOffset)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarOffset(%s);", wrapQuotes(baselineBarOffset)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline bar offset.
     */
    public Timeline setBaselineBarOffset(Number baselineBarOffset1) {
        if (jsBase == null) {
            this.baselineBarOffset = null;
            this.baselineBarOffset1 = null;
            
            this.baselineBarOffset1 = baselineBarOffset1;
        } else {
            this.baselineBarOffset1 = baselineBarOffset1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarOffset(%s)", baselineBarOffset1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarOffset(%s);", baselineBarOffset1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String baselineBarPosition;
    private EnumsAnchor baselineBarPosition1;

    /**
     * Setter for the baseline bar position.
     */
    public Timeline setBaselineBarPosition(String baselineBarPosition) {
        if (jsBase == null) {
            this.baselineBarPosition = null;
            this.baselineBarPosition1 = null;
            
            this.baselineBarPosition = baselineBarPosition;
        } else {
            this.baselineBarPosition = baselineBarPosition;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarPosition(%s)", wrapQuotes(baselineBarPosition)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarPosition(%s);", wrapQuotes(baselineBarPosition)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the baseline bar position.
     */
    public Timeline setBaselineBarPosition(EnumsAnchor baselineBarPosition1) {
        if (jsBase == null) {
            this.baselineBarPosition = null;
            this.baselineBarPosition1 = null;
            
            this.baselineBarPosition1 = baselineBarPosition1;
        } else {
            this.baselineBarPosition1 = baselineBarPosition1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselineBarPosition(%s)", ((baselineBarPosition1 != null) ? baselineBarPosition1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselineBarPosition(%s);", ((baselineBarPosition1 != null) ? baselineBarPosition1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private BaselinesElement getBaselines;

    /**
     * Getter for baselines.
     */
    public BaselinesElement getBaselines() {
        if (getBaselines == null)
            getBaselines = new BaselinesElement(jsBase + ".baselines()");

        return getBaselines;
    }

    private String settings;

    /**
     * Setter for baselines.
     */
    public Timeline setBaselines(String settings) {
        if (jsBase == null) {
            this.settings = settings;
        } else {
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".baselines(%s)", wrapQuotes(settings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".baselines(%s);", wrapQuotes(settings)));
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
    public Timeline setColumnStroke(Stroke columnStroke) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".columnStroke(%s);", ((columnStroke != null) ? columnStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column stroke.
     */
    public Timeline setColumnStroke(String columnStroke1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".columnStroke(%s);", wrapQuotes(columnStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke connectorPreviewStroke;
    private ColoredFill connectorPreviewStroke1;
    private String connectorPreviewStroke2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setConnectorPreviewStroke(Stroke connectorPreviewStroke, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke = connectorPreviewStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.connectorPreviewStroke = connectorPreviewStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %s, %s, %s, %s)", ((connectorPreviewStroke != null) ? connectorPreviewStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", ((connectorPreviewStroke != null) ? connectorPreviewStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setConnectorPreviewStroke(ColoredFill connectorPreviewStroke1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke1 = connectorPreviewStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.connectorPreviewStroke1 = connectorPreviewStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %s, %s, %s, %s)", ((connectorPreviewStroke1 != null) ? connectorPreviewStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", ((connectorPreviewStroke1 != null) ? connectorPreviewStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setConnectorPreviewStroke(String connectorPreviewStroke2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.connectorPreviewStroke = null;
            this.connectorPreviewStroke1 = null;
            this.connectorPreviewStroke2 = null;
            
            this.connectorPreviewStroke2 = connectorPreviewStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.connectorPreviewStroke2 = connectorPreviewStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connectorPreviewStroke(%s, %s, %s, %s, %s)", wrapQuotes(connectorPreviewStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(connectorPreviewStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private ConnectorElement getConnectors;

    /**
     * Getter for connectors.
     */
    public ConnectorElement getConnectors() {
        if (getConnectors == null)
            getConnectors = new ConnectorElement(jsBase + ".connectors()");

        return getConnectors;
    }

    private String setting;

    /**
     * Setter for connectors.
     */
    public Timeline setConnectors(String setting) {
        if (jsBase == null) {
            this.setting = setting;
        } else {
            this.setting = setting;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connectors(%s)", wrapQuotes(setting)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectors(%s);", wrapQuotes(setting)));
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
    public Timeline setEditConnectorThumbFill(Fill editConnectorThumbFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s);", ((editConnectorThumbFill != null) ? editConnectorThumbFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color1;
    private Number opacity3;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline editConnectorThumbFill(String color1, Number opacity3) {
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
            
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s);", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Number angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Number opacity4;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(GradientKey[] keys4, Number angle1, Number opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %b);", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(GradientKey[] keys4, Number angle1, Number opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(GradientKey[] keys4, Number angle1, Number opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(String[] keys5, Number angle1, Number opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(String[] keys5, Number angle1, Number opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(String[] keys5, Number angle1, Number opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Number cx1;
    private Number cy1;
    private GraphicsMathRect mode7;
    private Number opacity5;
    private Number fx1;
    private Number fy1;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(GradientKey[] keys6, Number cx1, Number cy1, GraphicsMathRect mode7, Number opacity5, Number fx1, Number fy1) {
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
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editConnectorThumbFill(String[] keys7, Number cx1, Number cy1, GraphicsMathRect mode7, Number opacity5, Number fx1, Number fy1) {
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
            js.append(String.format(Locale.US, ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings1;
    private Stroke editConnectorThumbStroke;
    private ColoredFill editConnectorThumbStroke1;
    private String editConnectorThumbStroke2;
    private Number thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditConnectorThumbStroke(Stroke editConnectorThumbStroke, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke = editConnectorThumbStroke;
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
            this.editConnectorThumbStroke = editConnectorThumbStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %s, %s, %s, %s)", ((editConnectorThumbStroke != null) ? editConnectorThumbStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", ((editConnectorThumbStroke != null) ? editConnectorThumbStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditConnectorThumbStroke(ColoredFill editConnectorThumbStroke1, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke1 = editConnectorThumbStroke1;
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
            this.editConnectorThumbStroke1 = editConnectorThumbStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %s, %s, %s, %s)", ((editConnectorThumbStroke1 != null) ? editConnectorThumbStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", ((editConnectorThumbStroke1 != null) ? editConnectorThumbStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit connector thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditConnectorThumbStroke(String editConnectorThumbStroke2, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.editConnectorThumbStroke = null;
            this.editConnectorThumbStroke1 = null;
            this.editConnectorThumbStroke2 = null;
            
            this.editConnectorThumbStroke2 = editConnectorThumbStroke2;
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
            this.editConnectorThumbStroke2 = editConnectorThumbStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editConnectorThumbStroke(%s, %s, %s, %s, %s)", wrapQuotes(editConnectorThumbStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(editConnectorThumbStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editFinishConnectorMarkerHorizontalOffset;

    /**
     * Setter for the finish edit connector control horizontal offset.
     */
    public Timeline setEditFinishConnectorMarkerHorizontalOffset(Number editFinishConnectorMarkerHorizontalOffset) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerHorizontalOffset = editFinishConnectorMarkerHorizontalOffset;
        } else {
            this.editFinishConnectorMarkerHorizontalOffset = editFinishConnectorMarkerHorizontalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerHorizontalOffset(%s)", editFinishConnectorMarkerHorizontalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerHorizontalOffset(%s);", editFinishConnectorMarkerHorizontalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editFinishConnectorMarkerSize;

    /**
     * Setter for the finish edit connector control size.
     */
    public Timeline setEditFinishConnectorMarkerSize(Number editFinishConnectorMarkerSize) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerSize = editFinishConnectorMarkerSize;
        } else {
            this.editFinishConnectorMarkerSize = editFinishConnectorMarkerSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerSize(%s)", editFinishConnectorMarkerSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerSize(%s);", editFinishConnectorMarkerSize));
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
    public Timeline setEditFinishConnectorMarkerType(MarkerType editFinishConnectorMarkerType) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerType = null;
            this.editFinishConnectorMarkerType1 = null;
            
            this.editFinishConnectorMarkerType = editFinishConnectorMarkerType;
        } else {
            this.editFinishConnectorMarkerType = editFinishConnectorMarkerType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerType(%s)", ((editFinishConnectorMarkerType != null) ? editFinishConnectorMarkerType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s);", ((editFinishConnectorMarkerType != null) ? editFinishConnectorMarkerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the finish edit connector control type.
     */
    public Timeline setEditFinishConnectorMarkerType(String editFinishConnectorMarkerType1) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerType = null;
            this.editFinishConnectorMarkerType1 = null;
            
            this.editFinishConnectorMarkerType1 = editFinishConnectorMarkerType1;
        } else {
            this.editFinishConnectorMarkerType1 = editFinishConnectorMarkerType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerType(%s)", wrapQuotes(editFinishConnectorMarkerType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s);", wrapQuotes(editFinishConnectorMarkerType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editFinishConnectorMarkerVerticalOffset;

    /**
     * Setter for the finish edit connector control vertical offset.
     */
    public Timeline setEditFinishConnectorMarkerVerticalOffset(Number editFinishConnectorMarkerVerticalOffset) {
        if (jsBase == null) {
            this.editFinishConnectorMarkerVerticalOffset = editFinishConnectorMarkerVerticalOffset;
        } else {
            this.editFinishConnectorMarkerVerticalOffset = editFinishConnectorMarkerVerticalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editFinishConnectorMarkerVerticalOffset(%s)", editFinishConnectorMarkerVerticalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerVerticalOffset(%s);", editFinishConnectorMarkerVerticalOffset));
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
    public Timeline setEditIntervalThumbFill(Fill editIntervalThumbFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s);", ((editIntervalThumbFill != null) ? editIntervalThumbFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color2;
    private Number opacity6;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline editIntervalThumbFill(String color2, Number opacity6) {
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
            
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s)", wrapQuotes(color2), opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s);", wrapQuotes(color2), opacity6));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Number angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Number opacity7;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(GradientKey[] keys8, Number angle2, Number opacity7, Boolean mode8) {
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode8 = mode8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %b)", arrayToString(keys8), angle2, opacity7, mode8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %b);", arrayToString(keys8), angle2, opacity7, mode8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(GradientKey[] keys8, Number angle2, Number opacity7, VectorRect mode9) {
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode9 = mode9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode9.generateJs());
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s)", arrayToString(keys8), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToString(keys8), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(GradientKey[] keys8, Number angle2, Number opacity7, String mode10) {
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode10 = mode10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s)", arrayToString(keys8), angle2, opacity7, wrapQuotes(mode10)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToString(keys8), angle2, opacity7, wrapQuotes(mode10)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(String[] keys9, Number angle2, Number opacity7, Boolean mode8) {
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode8 = mode8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys9), angle2, opacity7, mode8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys9), angle2, opacity7, mode8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(String[] keys9, Number angle2, Number opacity7, VectorRect mode9) {
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode9 = mode9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode9.generateJs());
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys9), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(String[] keys9, Number angle2, Number opacity7, String mode10) {
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode10 = mode10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, wrapQuotes(mode10)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys9), angle2, opacity7, wrapQuotes(mode10)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Number cx2;
    private Number cy2;
    private GraphicsMathRect mode11;
    private Number opacity8;
    private Number fx2;
    private Number fy2;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(GradientKey[] keys10, Number cx2, Number cy2, GraphicsMathRect mode11, Number opacity8, Number fx2, Number fy2) {
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
            js.append(mode11.generateJs());
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editIntervalThumbFill(String[] keys11, Number cx2, Number cy2, GraphicsMathRect mode11, Number opacity8, Number fx2, Number fy2) {
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
            js.append(mode11.generateJs());
            js.append(String.format(Locale.US, ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings2;
    private Stroke editIntervalThumbStroke;
    private ColoredFill editIntervalThumbStroke1;
    private String editIntervalThumbStroke2;
    private Number thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditIntervalThumbStroke(Stroke editIntervalThumbStroke, Number thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke = editIntervalThumbStroke;
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
            this.editIntervalThumbStroke = editIntervalThumbStroke;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %s, %s, %s, %s)", ((editIntervalThumbStroke != null) ? editIntervalThumbStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", ((editIntervalThumbStroke != null) ? editIntervalThumbStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditIntervalThumbStroke(ColoredFill editIntervalThumbStroke1, Number thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke1 = editIntervalThumbStroke1;
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
            this.editIntervalThumbStroke1 = editIntervalThumbStroke1;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %s, %s, %s, %s)", ((editIntervalThumbStroke1 != null) ? editIntervalThumbStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", ((editIntervalThumbStroke1 != null) ? editIntervalThumbStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit interval thumb stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditIntervalThumbStroke(String editIntervalThumbStroke2, Number thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.editIntervalThumbStroke = null;
            this.editIntervalThumbStroke1 = null;
            this.editIntervalThumbStroke2 = null;
            
            this.editIntervalThumbStroke2 = editIntervalThumbStroke2;
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
            this.editIntervalThumbStroke2 = editIntervalThumbStroke2;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalThumbStroke(%s, %s, %s, %s, %s)", wrapQuotes(editIntervalThumbStroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(editIntervalThumbStroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editIntervalWidth;

    /**
     * Setter for the interval edit control width.
     */
    public Timeline setEditIntervalWidth(Number editIntervalWidth) {
        if (jsBase == null) {
            this.editIntervalWidth = editIntervalWidth;
        } else {
            this.editIntervalWidth = editIntervalWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editIntervalWidth(%s)", editIntervalWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editIntervalWidth(%s);", editIntervalWidth));
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
    public Timeline setEditPreviewFill(Fill editPreviewFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s);", ((editPreviewFill != null) ? editPreviewFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color3;
    private Number opacity9;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline editPreviewFill(String color3, Number opacity9) {
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
            
            this.opacity9 = opacity9;
        } else {
            this.color3 = color3;
            this.opacity9 = opacity9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s)", wrapQuotes(color3), opacity9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s);", wrapQuotes(color3), opacity9));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Number angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Number opacity10;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(GradientKey[] keys12, Number angle3, Number opacity10, Boolean mode12) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys12 = keys12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode12 = mode12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %b)", arrayToString(keys12), angle3, opacity10, mode12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %b);", arrayToString(keys12), angle3, opacity10, mode12));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(GradientKey[] keys12, Number angle3, Number opacity10, VectorRect mode13) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys12 = keys12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode13 = mode13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode13.generateJs());
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s)", arrayToString(keys12), angle3, opacity10, ((mode13 != null) ? mode13.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToString(keys12), angle3, opacity10, ((mode13 != null) ? mode13.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(GradientKey[] keys12, Number angle3, Number opacity10, String mode14) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys12 = keys12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode14 = mode14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s)", arrayToString(keys12), angle3, opacity10, wrapQuotes(mode14)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToString(keys12), angle3, opacity10, wrapQuotes(mode14)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(String[] keys13, Number angle3, Number opacity10, Boolean mode12) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys13 = keys13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode12 = mode12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys13), angle3, opacity10, mode12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys13), angle3, opacity10, mode12));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(String[] keys13, Number angle3, Number opacity10, VectorRect mode13) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys13 = keys13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode13 = mode13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode13.generateJs());
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys13), angle3, opacity10, ((mode13 != null) ? mode13.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys13), angle3, opacity10, ((mode13 != null) ? mode13.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(String[] keys13, Number angle3, Number opacity10, String mode14) {
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
            
            this.opacity10 = opacity10;
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
        } else {
            this.keys13 = keys13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            this.mode14 = mode14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys13), angle3, opacity10, wrapQuotes(mode14)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys13), angle3, opacity10, wrapQuotes(mode14)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Number cx3;
    private Number cy3;
    private GraphicsMathRect mode15;
    private Number opacity11;
    private Number fx3;
    private Number fy3;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(GradientKey[] keys14, Number cx3, Number cy3, GraphicsMathRect mode15, Number opacity11, Number fx3, Number fy3) {
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
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
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
            
            this.opacity11 = opacity11;
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
            this.keys14 = keys14;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode15.generateJs());
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.getJsBase() : "null"), opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.getJsBase() : "null"), opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editPreviewFill(String[] keys15, Number cx3, Number cy3, GraphicsMathRect mode15, Number opacity11, Number fx3, Number fy3) {
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
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
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
            
            this.opacity11 = opacity11;
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
            this.keys15 = keys15;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode15.generateJs());
            js.append(String.format(Locale.US, ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.getJsBase() : "null"), opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.getJsBase() : "null"), opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings3;
    private Stroke editPreviewStroke;
    private ColoredFill editPreviewStroke1;
    private String editPreviewStroke2;
    private Number thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditPreviewStroke(Stroke editPreviewStroke, Number thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke = editPreviewStroke;
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
            this.editPreviewStroke = editPreviewStroke;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %s, %s, %s, %s)", ((editPreviewStroke != null) ? editPreviewStroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", ((editPreviewStroke != null) ? editPreviewStroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditPreviewStroke(ColoredFill editPreviewStroke1, Number thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke1 = editPreviewStroke1;
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
            this.editPreviewStroke1 = editPreviewStroke1;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %s, %s, %s, %s)", ((editPreviewStroke1 != null) ? editPreviewStroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", ((editPreviewStroke1 != null) ? editPreviewStroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit preview stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditPreviewStroke(String editPreviewStroke2, Number thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.editPreviewStroke = null;
            this.editPreviewStroke1 = null;
            this.editPreviewStroke2 = null;
            
            this.editPreviewStroke2 = editPreviewStroke2;
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
            this.editPreviewStroke2 = editPreviewStroke2;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editPreviewStroke(%s, %s, %s, %s, %s)", wrapQuotes(editPreviewStroke2), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(editPreviewStroke2), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
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
    public Timeline setEditProgressFill(Fill editProgressFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s);", ((editProgressFill != null) ? editProgressFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color4;
    private Number opacity12;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline editProgressFill(String color4, Number opacity12) {
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
            
            this.opacity12 = opacity12;
        } else {
            this.color4 = color4;
            this.opacity12 = opacity12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s)", wrapQuotes(color4), opacity12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s);", wrapQuotes(color4), opacity12));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Number angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Number opacity13;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(GradientKey[] keys16, Number angle4, Number opacity13, Boolean mode16) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys16 = keys16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode16 = mode16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %b)", arrayToString(keys16), angle4, opacity13, mode16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %b);", arrayToString(keys16), angle4, opacity13, mode16));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(GradientKey[] keys16, Number angle4, Number opacity13, VectorRect mode17) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys16 = keys16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode17 = mode17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode17.generateJs());
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s)", arrayToString(keys16), angle4, opacity13, ((mode17 != null) ? mode17.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToString(keys16), angle4, opacity13, ((mode17 != null) ? mode17.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(GradientKey[] keys16, Number angle4, Number opacity13, String mode18) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys16 = keys16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode18 = mode18;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s)", arrayToString(keys16), angle4, opacity13, wrapQuotes(mode18)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToString(keys16), angle4, opacity13, wrapQuotes(mode18)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(String[] keys17, Number angle4, Number opacity13, Boolean mode16) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys17 = keys17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode16 = mode16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys17), angle4, opacity13, mode16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys17), angle4, opacity13, mode16));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(String[] keys17, Number angle4, Number opacity13, VectorRect mode17) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys17 = keys17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode17 = mode17;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode17.generateJs());
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys17), angle4, opacity13, ((mode17 != null) ? mode17.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys17), angle4, opacity13, ((mode17 != null) ? mode17.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(String[] keys17, Number angle4, Number opacity13, String mode18) {
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
            
            this.opacity13 = opacity13;
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
        } else {
            this.keys17 = keys17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            this.mode18 = mode18;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys17), angle4, opacity13, wrapQuotes(mode18)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys17), angle4, opacity13, wrapQuotes(mode18)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Number cx4;
    private Number cy4;
    private GraphicsMathRect mode19;
    private Number opacity14;
    private Number fx4;
    private Number fy4;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(GradientKey[] keys18, Number cx4, Number cy4, GraphicsMathRect mode19, Number opacity14, Number fx4, Number fy4) {
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
            
            this.opacity14 = opacity14;
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
            this.keys18 = keys18;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode19.generateJs());
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.getJsBase() : "null"), opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.getJsBase() : "null"), opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editProgressFill(String[] keys19, Number cx4, Number cy4, GraphicsMathRect mode19, Number opacity14, Number fx4, Number fy4) {
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
            
            this.opacity14 = opacity14;
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
            this.keys19 = keys19;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode19.generateJs());
            js.append(String.format(Locale.US, ".editProgressFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.getJsBase() : "null"), opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.getJsBase() : "null"), opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings4;
    private Stroke editProgressStroke;
    private ColoredFill editProgressStroke1;
    private String editProgressStroke2;
    private Number thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditProgressStroke(Stroke editProgressStroke, Number thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
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
            this.editProgressStroke = editProgressStroke;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %s, %s, %s, %s)", ((editProgressStroke != null) ? editProgressStroke.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", ((editProgressStroke != null) ? editProgressStroke.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditProgressStroke(ColoredFill editProgressStroke1, Number thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
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
            this.editProgressStroke1 = editProgressStroke1;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %s, %s, %s, %s)", ((editProgressStroke1 != null) ? editProgressStroke1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", ((editProgressStroke1 != null) ? editProgressStroke1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the edit progress stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditProgressStroke(String editProgressStroke2, Number thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
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
            this.editProgressStroke2 = editProgressStroke2;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editProgressStroke(%s, %s, %s, %s, %s)", wrapQuotes(editProgressStroke2), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", wrapQuotes(editProgressStroke2), thickness4, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editStartConnectorMarkerHorizontalOffset;

    /**
     * Setter for the start edit connector control horizontal offset.
     */
    public Timeline setEditStartConnectorMarkerHorizontalOffset(Number editStartConnectorMarkerHorizontalOffset) {
        if (jsBase == null) {
            this.editStartConnectorMarkerHorizontalOffset = editStartConnectorMarkerHorizontalOffset;
        } else {
            this.editStartConnectorMarkerHorizontalOffset = editStartConnectorMarkerHorizontalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStartConnectorMarkerHorizontalOffset(%s)", editStartConnectorMarkerHorizontalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerHorizontalOffset(%s);", editStartConnectorMarkerHorizontalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editStartConnectorMarkerSize;

    /**
     * Setter for the start edit connector control size.
     */
    public Timeline setEditStartConnectorMarkerSize(Number editStartConnectorMarkerSize) {
        if (jsBase == null) {
            this.editStartConnectorMarkerSize = editStartConnectorMarkerSize;
        } else {
            this.editStartConnectorMarkerSize = editStartConnectorMarkerSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStartConnectorMarkerSize(%s)", editStartConnectorMarkerSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerSize(%s);", editStartConnectorMarkerSize));
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
    public Timeline setEditStartConnectorMarkerType(MarkerType editStartConnectorMarkerType) {
        if (jsBase == null) {
            this.editStartConnectorMarkerType = null;
            this.editStartConnectorMarkerType1 = null;
            
            this.editStartConnectorMarkerType = editStartConnectorMarkerType;
        } else {
            this.editStartConnectorMarkerType = editStartConnectorMarkerType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStartConnectorMarkerType(%s)", ((editStartConnectorMarkerType != null) ? editStartConnectorMarkerType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s);", ((editStartConnectorMarkerType != null) ? editStartConnectorMarkerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the start edit connector control type.
     */
    public Timeline setEditStartConnectorMarkerType(String editStartConnectorMarkerType1) {
        if (jsBase == null) {
            this.editStartConnectorMarkerType = null;
            this.editStartConnectorMarkerType1 = null;
            
            this.editStartConnectorMarkerType1 = editStartConnectorMarkerType1;
        } else {
            this.editStartConnectorMarkerType1 = editStartConnectorMarkerType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStartConnectorMarkerType(%s)", wrapQuotes(editStartConnectorMarkerType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s);", wrapQuotes(editStartConnectorMarkerType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number editStartConnectorMarkerVerticalOffset;

    /**
     * Setter for the start edit connector control vertical offset.
     */
    public Timeline setEditStartConnectorMarkerVerticalOffset(Number editStartConnectorMarkerVerticalOffset) {
        if (jsBase == null) {
            this.editStartConnectorMarkerVerticalOffset = editStartConnectorMarkerVerticalOffset;
        } else {
            this.editStartConnectorMarkerVerticalOffset = editStartConnectorMarkerVerticalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStartConnectorMarkerVerticalOffset(%s)", editStartConnectorMarkerVerticalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStartConnectorMarkerVerticalOffset(%s);", editStartConnectorMarkerVerticalOffset));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke editStructurePreviewDashStroke;
    private ColoredFill editStructurePreviewDashStroke1;
    private String editStructurePreviewDashStroke2;
    private Number thickness5;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewDashStroke(Stroke editStructurePreviewDashStroke, Number thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
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
            this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s)", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewDashStroke(ColoredFill editStructurePreviewDashStroke1, Number thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
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
            this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s)", ((editStructurePreviewDashStroke1 != null) ? editStructurePreviewDashStroke1.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", ((editStructurePreviewDashStroke1 != null) ? editStructurePreviewDashStroke1.generateJs() : "null"), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview dash stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewDashStroke(String editStructurePreviewDashStroke2, Number thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
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
            this.editStructurePreviewDashStroke2 = editStructurePreviewDashStroke2;
            this.thickness5 = thickness5;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s)", wrapQuotes(editStructurePreviewDashStroke2), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", wrapQuotes(editStructurePreviewDashStroke2), thickness5, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
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
    public Timeline setEditStructurePreviewFill(Fill editStructurePreviewFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s);", ((editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color5;
    private Number opacity15;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline editStructurePreviewFill(String color5, Number opacity15) {
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
            
            this.opacity15 = opacity15;
        } else {
            this.color5 = color5;
            this.opacity15 = opacity15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s)", wrapQuotes(color5), opacity15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s);", wrapQuotes(color5), opacity15));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Number angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Number opacity16;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(GradientKey[] keys20, Number angle5, Number opacity16, Boolean mode20) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys20 = keys20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode20 = mode20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %b)", arrayToString(keys20), angle5, opacity16, mode20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %b);", arrayToString(keys20), angle5, opacity16, mode20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(GradientKey[] keys20, Number angle5, Number opacity16, VectorRect mode21) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys20 = keys20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode21 = mode21;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode21.generateJs());
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s)", arrayToString(keys20), angle5, opacity16, ((mode21 != null) ? mode21.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToString(keys20), angle5, opacity16, ((mode21 != null) ? mode21.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(GradientKey[] keys20, Number angle5, Number opacity16, String mode22) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys20 = keys20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode22 = mode22;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s)", arrayToString(keys20), angle5, opacity16, wrapQuotes(mode22)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToString(keys20), angle5, opacity16, wrapQuotes(mode22)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(String[] keys21, Number angle5, Number opacity16, Boolean mode20) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys21 = keys21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode20 = mode20;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys21), angle5, opacity16, mode20));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys21), angle5, opacity16, mode20));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(String[] keys21, Number angle5, Number opacity16, VectorRect mode21) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys21 = keys21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode21 = mode21;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode21.generateJs());
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys21), angle5, opacity16, ((mode21 != null) ? mode21.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys21), angle5, opacity16, ((mode21 != null) ? mode21.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(String[] keys21, Number angle5, Number opacity16, String mode22) {
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
            
            this.opacity16 = opacity16;
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
        } else {
            this.keys21 = keys21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            this.mode22 = mode22;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys21), angle5, opacity16, wrapQuotes(mode22)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys21), angle5, opacity16, wrapQuotes(mode22)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Number cx5;
    private Number cy5;
    private GraphicsMathRect mode23;
    private Number opacity17;
    private Number fx5;
    private Number fy5;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(GradientKey[] keys22, Number cx5, Number cy5, GraphicsMathRect mode23, Number opacity17, Number fx5, Number fy5) {
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
            
            this.opacity17 = opacity17;
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
            this.keys22 = keys22;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode23.generateJs());
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.getJsBase() : "null"), opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.getJsBase() : "null"), opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline editStructurePreviewFill(String[] keys23, Number cx5, Number cy5, GraphicsMathRect mode23, Number opacity17, Number fx5, Number fy5) {
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
            
            this.opacity17 = opacity17;
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
            this.keys23 = keys23;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode23.generateJs());
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.getJsBase() : "null"), opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.getJsBase() : "null"), opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings5;
    private Stroke editStructurePreviewStroke;
    private ColoredFill editStructurePreviewStroke1;
    private String editStructurePreviewStroke2;
    private Number thickness6;
    private String dashpattern6;
    private StrokeLineJoin lineJoin6;
    private StrokeLineCap lineCap6;

    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewStroke(Stroke editStructurePreviewStroke, Number thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
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
            this.editStructurePreviewStroke = editStructurePreviewStroke;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %s, %s, %s, %s)", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewStroke(ColoredFill editStructurePreviewStroke1, Number thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
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
            this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %s, %s, %s, %s)", ((editStructurePreviewStroke1 != null) ? editStructurePreviewStroke1.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", ((editStructurePreviewStroke1 != null) ? editStructurePreviewStroke1.generateJs() : "null"), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the preview stroke when editing structure.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Timeline setEditStructurePreviewStroke(String editStructurePreviewStroke2, Number thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
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
            this.editStructurePreviewStroke2 = editStructurePreviewStroke2;
            this.thickness6 = thickness6;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s, %s, %s, %s, %s)", wrapQuotes(editStructurePreviewStroke2), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(editStructurePreviewStroke2), thickness6, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean editing;

    /**
     * Enables or disables live edit mode.
     */
    public Timeline editing(Boolean editing) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editing(%b);", editing));
                js.setLength(0);
            }
        }
        return this;
    }

    private TimelineElement getElements;

    /**
     * Getter for elements.
     */
    public TimelineElement getElements() {
        if (getElements == null)
            getElements = new TimelineElement(jsBase + ".elements()");

        return getElements;
    }

    private String setting1;

    /**
     * Setter for elements.
     */
    public Timeline setElements(String setting1) {
        if (jsBase == null) {
            this.setting = null;
            this.setting1 = null;
            
            this.setting1 = setting1;
        } else {
            this.setting1 = setting1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".elements(%s)", wrapQuotes(setting1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".elements(%s);", wrapQuotes(setting1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GroupingTasksElement getGroupingTasks;

    /**
     * Getter for grouping tasks.
     */
    public GroupingTasksElement getGroupingTasks() {
        if (getGroupingTasks == null)
            getGroupingTasks = new GroupingTasksElement(jsBase + ".groupingTasks()");

        return getGroupingTasks;
    }

    private String setting2;

    /**
     * Setter for grouping tasks.
     */
    public Timeline setGroupingTasks(String setting2) {
        if (jsBase == null) {
            this.setting = null;
            this.setting1 = null;
            this.setting2 = null;
            
            this.setting2 = setting2;
        } else {
            this.setting2 = setting2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".groupingTasks(%s)", wrapQuotes(setting2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".groupingTasks(%s);", wrapQuotes(setting2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TimeLineHeader getHeader;

    /**
     * Getter for the timeline header.
     */
    public TimeLineHeader getHeader() {
        if (getHeader == null)
            getHeader = new TimeLineHeader(jsBase + ".header()");

        return getHeader;
    }

    private String header;

    /**
     * Setter for the timeline header.
     */
    public Timeline setHeader(String header) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".header(%s);", wrapQuotes(header)));
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
    public Timeline setHorizontalScrollBar(String horizontalScrollBar) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".horizontalScrollBar(%s);", wrapQuotes(horizontalScrollBar)));
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
    public Timeline setLabels(String labels) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttLine> getLineMarker = new ArrayList<>();

    /**
     * Getter for the line marker.
     */
    public GanttLine getLineMarker(Number index) {
        GanttLine item = new GanttLine(jsBase + ".lineMarker(" + index + ")");
        getLineMarker.add(item);
        return item;
    }

    private String lineMarker;
    private Boolean lineMarker1;

    /**
     * Setter for the line marker.
     */
    public Timeline setLineMarker(String lineMarker) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineMarker(%s);", wrapQuotes(lineMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker.
     */
    public Timeline setLineMarker(Boolean lineMarker1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineMarker(%b);", lineMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private String lineMarker2;
    private Boolean lineMarker3;
    private GanttDateTimeMarkers lineMarker4;
    private String lineMarker5;

    /**
     * Setter for the line marker by index.
     */
    public Timeline setLineMarker(Number index, String lineMarker2) {
        if (jsBase == null) {
            this.index = index;
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker2 = lineMarker2;
        } else {
            this.index = index;
            this.lineMarker2 = lineMarker2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".lineMarker(%s, %s)", index, wrapQuotes(lineMarker2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, wrapQuotes(lineMarker2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker by index.
     */
    public Timeline setLineMarker(Number index, Boolean lineMarker3) {
        if (jsBase == null) {
            this.index = index;
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker3 = lineMarker3;
        } else {
            this.index = index;
            this.lineMarker3 = lineMarker3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".lineMarker(%s, %b)", index, lineMarker3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineMarker(%s, %b);", index, lineMarker3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the line marker by index.
     */
    public Timeline setLineMarker(Number index, GanttDateTimeMarkers lineMarker4) {
        if (jsBase == null) {
            this.index = index;
            this.lineMarker = null;
            this.lineMarker1 = null;
            this.lineMarker2 = null;
            this.lineMarker3 = null;
            this.lineMarker4 = null;
            this.lineMarker5 = null;
            
            this.lineMarker4 = lineMarker4;
        } else {
            this.index = index;
            this.lineMarker4 = lineMarker4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".lineMarker(%s, %s)", index, ((lineMarker4 != null) ? lineMarker4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, ((lineMarker4 != null) ? lineMarker4.generateJs() : "null")));
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
    public Timeline setMarkers(String markers) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%s);", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }

    private MilestonesElement getMilestones;

    /**
     * Getter for milestones.
     */
    public MilestonesElement getMilestones() {
        if (getMilestones == null)
            getMilestones = new MilestonesElement(jsBase + ".milestones()");

        return getMilestones;
    }

    private String setting3;

    /**
     * Setter for milestones.
     */
    public Timeline setMilestones(String setting3) {
        if (jsBase == null) {
            this.setting = null;
            this.setting1 = null;
            this.setting2 = null;
            this.setting3 = null;
            
            this.setting3 = setting3;
        } else {
            this.setting3 = setting3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".milestones(%s)", wrapQuotes(setting3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".milestones(%s);", wrapQuotes(setting3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private PeriodsElement getPeriods;

    /**
     * Getter for periods.
     */
    public PeriodsElement getPeriods() {
        if (getPeriods == null)
            getPeriods = new PeriodsElement(jsBase + ".periods()");

        return getPeriods;
    }

    private String setting4;

    /**
     * Setter for periods.
     */
    public Timeline setPeriods(String setting4) {
        if (jsBase == null) {
            this.setting = null;
            this.setting1 = null;
            this.setting2 = null;
            this.setting3 = null;
            this.setting4 = null;
            
            this.setting4 = setting4;
        } else {
            this.setting4 = setting4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".periods(%s)", wrapQuotes(setting4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".periods(%s);", wrapQuotes(setting4)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttRange> getRangeMarker = new ArrayList<>();

    /**
     * Getter for the range marker.
     */
    public GanttRange getRangeMarker(Number index) {
        GanttRange item = new GanttRange(jsBase + ".rangeMarker(" + index + ")");
        getRangeMarker.add(item);
        return item;
    }

    private String rangeMarker;
    private Boolean rangeMarker1;

    /**
     * Setter for the range marker.
     */
    public Timeline setRangeMarker(String rangeMarker) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeMarker(%s);", wrapQuotes(rangeMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker.
     */
    public Timeline setRangeMarker(Boolean rangeMarker1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeMarker(%b);", rangeMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;
    private String rangeMarker2;
    private Boolean rangeMarker3;
    private GanttDateTimeMarkers rangeMarker4;
    private String rangeMarker5;

    /**
     * Setter for the range marker by index.
     */
    public Timeline setRangeMarker(Number index1, String rangeMarker2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker2 = rangeMarker2;
        } else {
            this.index1 = index1;
            this.rangeMarker2 = rangeMarker2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rangeMarker(%s, %s)", index1, wrapQuotes(rangeMarker2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index1, wrapQuotes(rangeMarker2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker by index.
     */
    public Timeline setRangeMarker(Number index1, Boolean rangeMarker3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker3 = rangeMarker3;
        } else {
            this.index1 = index1;
            this.rangeMarker3 = rangeMarker3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rangeMarker(%s, %b)", index1, rangeMarker3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeMarker(%s, %b);", index1, rangeMarker3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range marker by index.
     */
    public Timeline setRangeMarker(Number index1, GanttDateTimeMarkers rangeMarker4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.rangeMarker = null;
            this.rangeMarker1 = null;
            this.rangeMarker2 = null;
            this.rangeMarker3 = null;
            this.rangeMarker4 = null;
            this.rangeMarker5 = null;
            
            this.rangeMarker4 = rangeMarker4;
        } else {
            this.index1 = index1;
            this.rangeMarker4 = rangeMarker4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rangeMarker(%s, %s)", index1, ((rangeMarker4 != null) ? rangeMarker4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index1, ((rangeMarker4 != null) ? rangeMarker4.generateJs() : "null")));
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
    public Timeline setRowEvenFill(Fill rowEvenFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", ((rowEvenFill != null) ? rowEvenFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color6;
    private Number opacity18;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline rowEvenFill(String color6, Number opacity18) {
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
            
            this.opacity18 = opacity18;
        } else {
            this.color6 = color6;
            this.opacity18 = opacity18;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s)", wrapQuotes(color6), opacity18));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s);", wrapQuotes(color6), opacity18));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Number angle6;
    private Boolean mode24;
    private VectorRect mode25;
    private String mode26;
    private Number opacity19;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(GradientKey[] keys24, Number angle6, Number opacity19, Boolean mode24) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys24 = keys24;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode24 = mode24;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %b)", arrayToString(keys24), angle6, opacity19, mode24));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %b);", arrayToString(keys24), angle6, opacity19, mode24));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(GradientKey[] keys24, Number angle6, Number opacity19, VectorRect mode25) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys24 = keys24;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode25 = mode25;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode25.generateJs());
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s)", arrayToString(keys24), angle6, opacity19, ((mode25 != null) ? mode25.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToString(keys24), angle6, opacity19, ((mode25 != null) ? mode25.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(GradientKey[] keys24, Number angle6, Number opacity19, String mode26) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys24 = keys24;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode26 = mode26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s)", arrayToString(keys24), angle6, opacity19, wrapQuotes(mode26)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToString(keys24), angle6, opacity19, wrapQuotes(mode26)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(String[] keys25, Number angle6, Number opacity19, Boolean mode24) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys25 = keys25;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode24 = mode24;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys25), angle6, opacity19, mode24));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys25), angle6, opacity19, mode24));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(String[] keys25, Number angle6, Number opacity19, VectorRect mode25) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys25 = keys25;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode25 = mode25;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode25.generateJs());
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys25), angle6, opacity19, ((mode25 != null) ? mode25.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys25), angle6, opacity19, ((mode25 != null) ? mode25.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(String[] keys25, Number angle6, Number opacity19, String mode26) {
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
            
            this.opacity19 = opacity19;
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
        } else {
            this.keys25 = keys25;
            this.angle6 = angle6;
            this.opacity19 = opacity19;
            this.mode26 = mode26;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys25), angle6, opacity19, wrapQuotes(mode26)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys25), angle6, opacity19, wrapQuotes(mode26)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Number cx6;
    private Number cy6;
    private GraphicsMathRect mode27;
    private Number opacity20;
    private Number fx6;
    private Number fy6;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(GradientKey[] keys26, Number cx6, Number cy6, GraphicsMathRect mode27, Number opacity20, Number fx6, Number fy6) {
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
            
            this.opacity20 = opacity20;
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
            this.keys26 = keys26;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode27 = mode27;
            this.opacity20 = opacity20;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode27.generateJs());
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys26), cx6, cy6, ((mode27 != null) ? mode27.getJsBase() : "null"), opacity20, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys26), cx6, cy6, ((mode27 != null) ? mode27.getJsBase() : "null"), opacity20, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowEvenFill(String[] keys27, Number cx6, Number cy6, GraphicsMathRect mode27, Number opacity20, Number fx6, Number fy6) {
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
            
            this.opacity20 = opacity20;
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
            this.keys27 = keys27;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode27 = mode27;
            this.opacity20 = opacity20;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode27.generateJs());
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys27), cx6, cy6, ((mode27 != null) ? mode27.getJsBase() : "null"), opacity20, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys27), cx6, cy6, ((mode27 != null) ? mode27.getJsBase() : "null"), opacity20, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings6;
    private Fill rowFill;

    /**
     * Setter for row fill settings using an array or a string. Resets odd fill and even fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline setRowFill(Fill rowFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s);", ((rowFill != null) ? rowFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color7;
    private Number opacity21;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline rowFill(String color7, Number opacity21) {
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
            
            this.opacity21 = opacity21;
        } else {
            this.color7 = color7;
            this.opacity21 = opacity21;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowFill(%s, %s)", wrapQuotes(color7), opacity21));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s);", wrapQuotes(color7), opacity21));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys28;
    private String[] keys29;
    private Number angle7;
    private Boolean mode28;
    private VectorRect mode29;
    private String mode30;
    private Number opacity22;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(GradientKey[] keys28, Number angle7, Number opacity22, Boolean mode28) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys28 = keys28;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode28 = mode28;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %b)", arrayToString(keys28), angle7, opacity22, mode28));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %b);", arrayToString(keys28), angle7, opacity22, mode28));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(GradientKey[] keys28, Number angle7, Number opacity22, VectorRect mode29) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys28 = keys28;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode29 = mode29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode29.generateJs());
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s)", arrayToString(keys28), angle7, opacity22, ((mode29 != null) ? mode29.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToString(keys28), angle7, opacity22, ((mode29 != null) ? mode29.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(GradientKey[] keys28, Number angle7, Number opacity22, String mode30) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys28 = keys28;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode30 = mode30;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s)", arrayToString(keys28), angle7, opacity22, wrapQuotes(mode30)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToString(keys28), angle7, opacity22, wrapQuotes(mode30)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(String[] keys29, Number angle7, Number opacity22, Boolean mode28) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys29 = keys29;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode28 = mode28;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys29), angle7, opacity22, mode28));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys29), angle7, opacity22, mode28));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(String[] keys29, Number angle7, Number opacity22, VectorRect mode29) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys29 = keys29;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode29 = mode29;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode29.generateJs());
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys29), angle7, opacity22, ((mode29 != null) ? mode29.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys29), angle7, opacity22, ((mode29 != null) ? mode29.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(String[] keys29, Number angle7, Number opacity22, String mode30) {
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
            
            this.opacity22 = opacity22;
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
        } else {
            this.keys29 = keys29;
            this.angle7 = angle7;
            this.opacity22 = opacity22;
            this.mode30 = mode30;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys29), angle7, opacity22, wrapQuotes(mode30)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys29), angle7, opacity22, wrapQuotes(mode30)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys30;
    private String[] keys31;
    private Number cx7;
    private Number cy7;
    private GraphicsMathRect mode31;
    private Number opacity23;
    private Number fx7;
    private Number fy7;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(GradientKey[] keys30, Number cx7, Number cy7, GraphicsMathRect mode31, Number opacity23, Number fx7, Number fy7) {
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
            
            this.opacity23 = opacity23;
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
            this.keys30 = keys30;
            this.cx7 = cx7;
            this.cy7 = cy7;
            this.mode31 = mode31;
            this.opacity23 = opacity23;
            this.fx7 = fx7;
            this.fy7 = fy7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode31.generateJs());
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys30), cx7, cy7, ((mode31 != null) ? mode31.getJsBase() : "null"), opacity23, fx7, fy7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys30), cx7, cy7, ((mode31 != null) ? mode31.getJsBase() : "null"), opacity23, fx7, fy7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowFill(String[] keys31, Number cx7, Number cy7, GraphicsMathRect mode31, Number opacity23, Number fx7, Number fy7) {
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
            
            this.opacity23 = opacity23;
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
            this.keys31 = keys31;
            this.cx7 = cx7;
            this.cy7 = cy7;
            this.mode31 = mode31;
            this.opacity23 = opacity23;
            this.fx7 = fx7;
            this.fy7 = fy7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode31.generateJs());
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys31), cx7, cy7, ((mode31 != null) ? mode31.getJsBase() : "null"), opacity23, fx7, fy7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys31), cx7, cy7, ((mode31 != null) ? mode31.getJsBase() : "null"), opacity23, fx7, fy7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings7;
    private Fill rowHoverFill;

    /**
     * Setter for row hover fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline setRowHoverFill(Fill rowHoverFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s);", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color8;
    private Number opacity24;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline rowHoverFill(String color8, Number opacity24) {
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
            
            this.opacity24 = opacity24;
        } else {
            this.color8 = color8;
            this.opacity24 = opacity24;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s)", wrapQuotes(color8), opacity24));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s);", wrapQuotes(color8), opacity24));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys32;
    private String[] keys33;
    private Number angle8;
    private Boolean mode32;
    private VectorRect mode33;
    private String mode34;
    private Number opacity25;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(GradientKey[] keys32, Number angle8, Number opacity25, Boolean mode32) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys32 = keys32;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode32 = mode32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %b)", arrayToString(keys32), angle8, opacity25, mode32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %b);", arrayToString(keys32), angle8, opacity25, mode32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(GradientKey[] keys32, Number angle8, Number opacity25, VectorRect mode33) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys32 = keys32;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode33 = mode33;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode33.generateJs());
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s)", arrayToString(keys32), angle8, opacity25, ((mode33 != null) ? mode33.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToString(keys32), angle8, opacity25, ((mode33 != null) ? mode33.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(GradientKey[] keys32, Number angle8, Number opacity25, String mode34) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys32 = keys32;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode34 = mode34;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s)", arrayToString(keys32), angle8, opacity25, wrapQuotes(mode34)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToString(keys32), angle8, opacity25, wrapQuotes(mode34)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(String[] keys33, Number angle8, Number opacity25, Boolean mode32) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys33 = keys33;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode32 = mode32;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys33), angle8, opacity25, mode32));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys33), angle8, opacity25, mode32));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(String[] keys33, Number angle8, Number opacity25, VectorRect mode33) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys33 = keys33;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode33 = mode33;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode33.generateJs());
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys33), angle8, opacity25, ((mode33 != null) ? mode33.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys33), angle8, opacity25, ((mode33 != null) ? mode33.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(String[] keys33, Number angle8, Number opacity25, String mode34) {
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
            
            this.opacity25 = opacity25;
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
        } else {
            this.keys33 = keys33;
            this.angle8 = angle8;
            this.opacity25 = opacity25;
            this.mode34 = mode34;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys33), angle8, opacity25, wrapQuotes(mode34)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys33), angle8, opacity25, wrapQuotes(mode34)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys34;
    private String[] keys35;
    private Number cx8;
    private Number cy8;
    private GraphicsMathRect mode35;
    private Number opacity26;
    private Number fx8;
    private Number fy8;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(GradientKey[] keys34, Number cx8, Number cy8, GraphicsMathRect mode35, Number opacity26, Number fx8, Number fy8) {
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
            
            this.opacity26 = opacity26;
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
            this.keys34 = keys34;
            this.cx8 = cx8;
            this.cy8 = cy8;
            this.mode35 = mode35;
            this.opacity26 = opacity26;
            this.fx8 = fx8;
            this.fy8 = fy8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode35.generateJs());
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys34), cx8, cy8, ((mode35 != null) ? mode35.getJsBase() : "null"), opacity26, fx8, fy8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys34), cx8, cy8, ((mode35 != null) ? mode35.getJsBase() : "null"), opacity26, fx8, fy8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowHoverFill(String[] keys35, Number cx8, Number cy8, GraphicsMathRect mode35, Number opacity26, Number fx8, Number fy8) {
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
            
            this.opacity26 = opacity26;
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
            this.keys35 = keys35;
            this.cx8 = cx8;
            this.cy8 = cy8;
            this.mode35 = mode35;
            this.opacity26 = opacity26;
            this.fx8 = fx8;
            this.fy8 = fy8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode35.generateJs());
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys35), cx8, cy8, ((mode35 != null) ? mode35.getJsBase() : "null"), opacity26, fx8, fy8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys35), cx8, cy8, ((mode35 != null) ? mode35.getJsBase() : "null"), opacity26, fx8, fy8));
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
    public Timeline setRowOddFill(Fill rowOddFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s);", ((rowOddFill != null) ? rowOddFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color9;
    private Number opacity27;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Timeline rowOddFill(String color9, Number opacity27) {
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
            
            this.opacity27 = opacity27;
        } else {
            this.color9 = color9;
            this.opacity27 = opacity27;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s)", wrapQuotes(color9), opacity27));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s);", wrapQuotes(color9), opacity27));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys36;
    private String[] keys37;
    private Number angle9;
    private Boolean mode36;
    private VectorRect mode37;
    private String mode38;
    private Number opacity28;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(GradientKey[] keys36, Number angle9, Number opacity28, Boolean mode36) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys36 = keys36;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode36 = mode36;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %b)", arrayToString(keys36), angle9, opacity28, mode36));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %b);", arrayToString(keys36), angle9, opacity28, mode36));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(GradientKey[] keys36, Number angle9, Number opacity28, VectorRect mode37) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys36 = keys36;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode37 = mode37;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode37.generateJs());
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s)", arrayToString(keys36), angle9, opacity28, ((mode37 != null) ? mode37.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToString(keys36), angle9, opacity28, ((mode37 != null) ? mode37.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(GradientKey[] keys36, Number angle9, Number opacity28, String mode38) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys36 = keys36;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode38 = mode38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s)", arrayToString(keys36), angle9, opacity28, wrapQuotes(mode38)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToString(keys36), angle9, opacity28, wrapQuotes(mode38)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(String[] keys37, Number angle9, Number opacity28, Boolean mode36) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys37 = keys37;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode36 = mode36;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys37), angle9, opacity28, mode36));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys37), angle9, opacity28, mode36));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(String[] keys37, Number angle9, Number opacity28, VectorRect mode37) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys37 = keys37;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode37 = mode37;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode37.generateJs());
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys37), angle9, opacity28, ((mode37 != null) ? mode37.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys37), angle9, opacity28, ((mode37 != null) ? mode37.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(String[] keys37, Number angle9, Number opacity28, String mode38) {
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
            
            this.opacity28 = opacity28;
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
        } else {
            this.keys37 = keys37;
            this.angle9 = angle9;
            this.opacity28 = opacity28;
            this.mode38 = mode38;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys37), angle9, opacity28, wrapQuotes(mode38)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys37), angle9, opacity28, wrapQuotes(mode38)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys38;
    private String[] keys39;
    private Number cx9;
    private Number cy9;
    private GraphicsMathRect mode39;
    private Number opacity29;
    private Number fx9;
    private Number fy9;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(GradientKey[] keys38, Number cx9, Number cy9, GraphicsMathRect mode39, Number opacity29, Number fx9, Number fy9) {
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
            
            this.opacity29 = opacity29;
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
            this.keys38 = keys38;
            this.cx9 = cx9;
            this.cy9 = cy9;
            this.mode39 = mode39;
            this.opacity29 = opacity29;
            this.fx9 = fx9;
            this.fy9 = fy9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode39.generateJs());
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys38), cx9, cy9, ((mode39 != null) ? mode39.getJsBase() : "null"), opacity29, fx9, fy9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys38), cx9, cy9, ((mode39 != null) ? mode39.getJsBase() : "null"), opacity29, fx9, fy9));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowOddFill(String[] keys39, Number cx9, Number cy9, GraphicsMathRect mode39, Number opacity29, Number fx9, Number fy9) {
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
            
            this.opacity29 = opacity29;
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
            this.keys39 = keys39;
            this.cx9 = cx9;
            this.cy9 = cy9;
            this.mode39 = mode39;
            this.opacity29 = opacity29;
            this.fx9 = fx9;
            this.fy9 = fy9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode39.generateJs());
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys39), cx9, cy9, ((mode39 != null) ? mode39.getJsBase() : "null"), opacity29, fx9, fy9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys39), cx9, cy9, ((mode39 != null) ? mode39.getJsBase() : "null"), opacity29, fx9, fy9));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings8;
    private Fill rowSelectedFill;

    /**
     * Setter for row fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline setRowSelectedFill(Fill rowSelectedFill) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s);", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color10;
    private Number opacity30;

    /**
     * Fill color in selected mode with opacity. Fill as a string or an object.
     */
    public Timeline rowSelectedFill(String color10, Number opacity30) {
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
            
            this.opacity30 = opacity30;
        } else {
            this.color10 = color10;
            this.opacity30 = opacity30;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s)", wrapQuotes(color10), opacity30));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s);", wrapQuotes(color10), opacity30));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys40;
    private String[] keys41;
    private Number angle10;
    private Boolean mode40;
    private VectorRect mode41;
    private String mode42;

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(GradientKey[] keys40, Number angle10, Boolean mode40) {
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
        } else {
            this.keys40 = keys40;
            this.angle10 = angle10;
            this.mode40 = mode40;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %b)", arrayToString(keys40), angle10, mode40));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %b);", arrayToString(keys40), angle10, mode40));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(GradientKey[] keys40, Number angle10, VectorRect mode41) {
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
        } else {
            this.keys40 = keys40;
            this.angle10 = angle10;
            this.mode41 = mode41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode41.generateJs());
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s)", arrayToString(keys40), angle10, ((mode41 != null) ? mode41.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToString(keys40), angle10, ((mode41 != null) ? mode41.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(GradientKey[] keys40, Number angle10, String mode42) {
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
        } else {
            this.keys40 = keys40;
            this.angle10 = angle10;
            this.mode42 = mode42;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s)", arrayToString(keys40), angle10, wrapQuotes(mode42)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToString(keys40), angle10, wrapQuotes(mode42)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(String[] keys41, Number angle10, Boolean mode40) {
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
        } else {
            this.keys41 = keys41;
            this.angle10 = angle10;
            this.mode40 = mode40;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %b)", arrayToStringWrapQuotes(keys41), angle10, mode40));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %b);", arrayToStringWrapQuotes(keys41), angle10, mode40));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(String[] keys41, Number angle10, VectorRect mode41) {
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
        } else {
            this.keys41 = keys41;
            this.angle10 = angle10;
            this.mode41 = mode41;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode41.generateJs());
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s)", arrayToStringWrapQuotes(keys41), angle10, ((mode41 != null) ? mode41.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToStringWrapQuotes(keys41), angle10, ((mode41 != null) ? mode41.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(String[] keys41, Number angle10, String mode42) {
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
        } else {
            this.keys41 = keys41;
            this.angle10 = angle10;
            this.mode42 = mode42;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s)", arrayToStringWrapQuotes(keys41), angle10, wrapQuotes(mode42)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToStringWrapQuotes(keys41), angle10, wrapQuotes(mode42)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys42;
    private String[] keys43;
    private Number cx10;
    private Number cy10;
    private GraphicsMathRect mode43;
    private Number opacity31;
    private Number fx10;
    private Number fy10;

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(GradientKey[] keys42, Number cx10, Number cy10, GraphicsMathRect mode43, Number opacity31, Number fx10, Number fy10) {
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
            
            this.opacity31 = opacity31;
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
            this.keys42 = keys42;
            this.cx10 = cx10;
            this.cy10 = cy10;
            this.mode43 = mode43;
            this.opacity31 = opacity31;
            this.fx10 = fx10;
            this.fy10 = fy10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode43.generateJs());
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys42), cx10, cy10, ((mode43 != null) ? mode43.getJsBase() : "null"), opacity31, fx10, fy10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys42), cx10, cy10, ((mode43 != null) ? mode43.getJsBase() : "null"), opacity31, fx10, fy10));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Timeline rowSelectedFill(String[] keys43, Number cx10, Number cy10, GraphicsMathRect mode43, Number opacity31, Number fx10, Number fy10) {
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
            
            this.opacity31 = opacity31;
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
            this.keys43 = keys43;
            this.cx10 = cx10;
            this.cy10 = cy10;
            this.mode43 = mode43;
            this.opacity31 = opacity31;
            this.fx10 = fx10;
            this.fy10 = fy10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode43.generateJs());
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys43), cx10, cy10, ((mode43 != null) ? mode43.getJsBase() : "null"), opacity31, fx10, fy10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys43), cx10, cy10, ((mode43 != null) ? mode43.getJsBase() : "null"), opacity31, fx10, fy10));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings9;
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
    public Timeline setScale(String scale) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", wrapQuotes(scale)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TasksElement getTasks;

    /**
     * Getter for tasks.
     */
    public TasksElement getTasks() {
        if (getTasks == null)
            getTasks = new TasksElement(jsBase + ".tasks()");

        return getTasks;
    }

    private String setting5;

    /**
     * Setter for tasks.
     */
    public Timeline setTasks(String setting5) {
        if (jsBase == null) {
            this.setting = null;
            this.setting1 = null;
            this.setting2 = null;
            this.setting3 = null;
            this.setting4 = null;
            this.setting5 = null;
            
            this.setting5 = setting5;
        } else {
            this.setting5 = setting5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tasks(%s)", wrapQuotes(setting5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tasks(%s);", wrapQuotes(setting5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GanttText> getTextMarker = new ArrayList<>();

    /**
     * Getter for the text marker.
     */
    public GanttText getTextMarker(Number index) {
        GanttText item = new GanttText(jsBase + ".textMarker(" + index + ")");
        getTextMarker.add(item);
        return item;
    }

    private String textMarker;
    private Boolean textMarker1;

    /**
     * Setter for the text marker.
     */
    public Timeline setTextMarker(String textMarker) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textMarker(%s);", wrapQuotes(textMarker)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text marker.
     */
    public Timeline setTextMarker(Boolean textMarker1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textMarker(%b);", textMarker1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index2;
    private String textMarker2;
    private Boolean textMarker3;
    private GanttDateTimeMarkers textMarker4;
    private String textMarker5;

    /**
     * Setter for text marker by index.
     */
    public Timeline setTextMarker(Number index2, String textMarker2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker2 = textMarker2;
        } else {
            this.index2 = index2;
            this.textMarker2 = textMarker2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textMarker(%s, %s)", index2, wrapQuotes(textMarker2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index2, wrapQuotes(textMarker2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text marker by index.
     */
    public Timeline setTextMarker(Number index2, Boolean textMarker3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker3 = textMarker3;
        } else {
            this.index2 = index2;
            this.textMarker3 = textMarker3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textMarker(%s, %b)", index2, textMarker3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textMarker(%s, %b);", index2, textMarker3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text marker by index.
     */
    public Timeline setTextMarker(Number index2, GanttDateTimeMarkers textMarker4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.textMarker = null;
            this.textMarker1 = null;
            this.textMarker2 = null;
            this.textMarker3 = null;
            this.textMarker4 = null;
            this.textMarker5 = null;
            
            this.textMarker4 = textMarker4;
        } else {
            this.index2 = index2;
            this.textMarker4 = textMarker4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textMarker(%s, %s)", index2, ((textMarker4 != null) ? textMarker4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index2, ((textMarker4 != null) ? textMarker4.generateJs() : "null")));
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
    public Timeline setTooltip(String tooltip) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the tooltip.
     */
    public Timeline setTooltip(Boolean tooltip1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
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
    public Timeline setVerticalScrollBar(String verticalScrollBar) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".verticalScrollBar(%s);", wrapQuotes(verticalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBaselines() {
        if (getBaselines != null) {
            return getBaselines.generateJs();
        }
        return "";
    }

    private String generateJSgetConnectors() {
        if (getConnectors != null) {
            return getConnectors.generateJs();
        }
        return "";
    }

    private String generateJSgetElements() {
        if (getElements != null) {
            return getElements.generateJs();
        }
        return "";
    }

    private String generateJSgetGroupingTasks() {
        if (getGroupingTasks != null) {
            return getGroupingTasks.generateJs();
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

    private String generateJSgetMilestones() {
        if (getMilestones != null) {
            return getMilestones.generateJs();
        }
        return "";
    }

    private String generateJSgetPeriods() {
        if (getPeriods != null) {
            return getPeriods.generateJs();
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

    private String generateJSgetTasks() {
        if (getTasks != null) {
            return getTasks.generateJs();
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

    
        jsGetters.append(generateJSgetBaselines());
        jsGetters.append(generateJSgetConnectors());
        jsGetters.append(generateJSgetElements());
        jsGetters.append(generateJSgetGroupingTasks());
        jsGetters.append(generateJSgetHeader());
        jsGetters.append(generateJSgetHorizontalScrollBar());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLineMarker());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetMilestones());
        jsGetters.append(generateJSgetPeriods());
        jsGetters.append(generateJSgetRangeMarker());
        jsGetters.append(generateJSgetScale());
        jsGetters.append(generateJSgetTasks());
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
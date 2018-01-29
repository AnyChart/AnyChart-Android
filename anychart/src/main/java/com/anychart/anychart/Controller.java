package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Chart event markers controller.
Common settings for all event markers.
 */
public class Controller extends CoreBase {

    public Controller() {
        js.setLength(0);
        js.append("var controller").append(++variableIndex).append(" = anychart.core.stock.eventMarkers.controller();");
        jsBase = "controller" + variableIndex;
    }

    protected Controller(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Controller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private String adjustOrAdjustByWidth2;
    private Boolean adjustByHeight;

    /**
     * Setter for the adjusting font size.
     */
    public Controller setAdjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", adjustOrAdjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjusting font size.
     */
    public Controller setAdjustFontSize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjusting font size.
     */
    public Controller setAdjustFontSize(String adjustOrAdjustByWidth2, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsConnector getConnector;

    /**
     * Getter for connector settings.
     */
    public UtilsConnector getConnector() {
        if (getConnector == null)
            getConnector = new UtilsConnector(jsBase + ".connector()");

        return getConnector;
    }

    private String connector;

    /**
     * Setter for the connector length.
     */
    public Controller setConnector(String connector) {
        if (jsBase == null) {
            this.connector = connector;
        } else {
            this.connector = connector;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connector(%s)", wrapQuotes(connector)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s);", wrapQuotes(connector)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping getData;

    /**
     * Getter for data of a group with index 0 of the chart.
     */
    public TableMapping getData() {
        if (getData == null)
            getData = new TableMapping(jsBase + ".data()");

        return getData;
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;

    /**
     * Setter for data of a group with index 0 of the chart.
     */
    public Controller setData(TableMapping data) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
        } else {
            this.data = data;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".data(%s);",  ((data != null) ? data.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", ((data != null) ? data.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for data of a group with index 0 of the chart.
     */
    public Controller setData(DataTable data1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
        } else {
            this.data1 = data1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".data(%s);",  ((data1 != null) ? data1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", ((data1 != null) ? data1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for data of a group with index 0 of the chart.
     */
    public Controller setData(String data2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
        } else {
            this.data2 = data2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s)", wrapQuotes(data2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", wrapQuotes(data2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private EventMarkerDirection direction;
    private String direction1;

    /**
     * Setter for the direction.
     */
    public Controller setDirection(EventMarkerDirection direction) {
        if (jsBase == null) {
            this.direction = null;
            this.direction1 = null;
            
            this.direction = direction;
        } else {
            this.direction = direction;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".direction(%s)", ((direction != null) ? direction.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".direction(%s);", ((direction != null) ? direction.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the direction.
     */
    public Controller setDirection(String direction1) {
        if (jsBase == null) {
            this.direction = null;
            this.direction1 = null;
            
            this.direction1 = direction1;
        } else {
            this.direction1 = direction1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".direction(%s)", wrapQuotes(direction1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".direction(%s);", wrapQuotes(direction1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    /**
     * Setter for the pointer events setting.
     */
    public Controller setDisablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName;

    /**
     * Setter for the fieldName.<br/>
<b>Note</b>: Sets a series field name for all {@link anychart.core.stock.eventMarkers.Controller#position} values with exception of "axis" value.
     */
    public Controller setFieldName(String fieldName) {
        if (jsBase == null) {
            this.fieldName = fieldName;
        } else {
            this.fieldName = fieldName;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fieldName(%s)", wrapQuotes(fieldName)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fieldName(%s);", wrapQuotes(fieldName)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller setFill(Fill fill) {
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
    public Controller setFill(String json) {
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
     * Fill color with opacity. Fill as a string or an object.
     */
    public Controller fill(String color, Number opacity) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(String[] keys1, Number angle, Number opacity1, String mode2) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Controller fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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

    private Fill imageSettings;
    private String fontColor;

    /**
     * Setter for font color settings.
     */
    public Controller setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(fontColor)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    /**
     * Setter for font decoration settings.
     */
    public Controller setFontDecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font decoration settings.
     */
    public Controller setFontDecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(fontDecoration1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontFamily;

    /**
     * Setter for font family settings.
     */
    public Controller setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number fontOpacity;

    /**
     * Setter for font opacity settings.
     */
    public Controller setFontOpacity(Number fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontOpacity(%s)", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%s);", fontOpacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number fontPadding;
    private String fontPadding1;

    /**
     * Setter for the font padding.
     */
    public Controller setFontPadding(Number fontPadding) {
        if (jsBase == null) {
            this.fontPadding = null;
            this.fontPadding1 = null;
            
            this.fontPadding = fontPadding;
        } else {
            this.fontPadding = fontPadding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontPadding(%s)", fontPadding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontPadding(%s);", fontPadding));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the font padding.
     */
    public Controller setFontPadding(String fontPadding1) {
        if (jsBase == null) {
            this.fontPadding = null;
            this.fontPadding1 = null;
            
            this.fontPadding1 = fontPadding1;
        } else {
            this.fontPadding1 = fontPadding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontPadding(%s)", wrapQuotes(fontPadding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontPadding(%s);", wrapQuotes(fontPadding1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number fontSize;
    private String fontSize1;

    /**
     * Setter for font size settings.
     */
    public Controller setFontSize(Number fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontSize(%s)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font size settings.
     */
    public Controller setFontSize(String fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(fontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontStyle;
    private TextFontStyle fontStyle1;

    /**
     * Setter for font style settings.
     */
    public Controller setFontStyle(String fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(fontStyle)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font style settings.
     */
    public Controller setFontStyle(TextFontStyle fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontVariant;
    private TextFontVariant fontVariant1;

    /**
     * Setter for font variant settings.
     */
    public Controller setFontVariant(String fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(fontVariant)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font variant settings.
     */
    public Controller setFontVariant(TextFontVariant fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontWeight;
    private Number fontWeight1;

    /**
     * Setter for font weight settings.
     */
    public Controller setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font weight settings.
     */
    public Controller setFontWeight(Number fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontWeight(%s)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String format;

    /**
     * Setter for function content text for the tooltip.<br/>
     */
    public Controller setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".format(%s)", wrapQuotes(format)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(format)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<Group> getGroup = new ArrayList<>();

    /**
     * Getter for the group.
     */
    public Group getGroup(Number indexOrValue) {
        Group item = new Group(jsBase + ".group(" + indexOrValue + ")");
        getGroup.add(item);
        return item;
    }

    private String group;
    private String[] group1;
    private Boolean group2;

    /**
     * Setter for the group.
     */
    public Controller setGroup(String group) {
        if (jsBase == null) {
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            
            this.group = group;
        } else {
            this.group = group;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%s)", wrapQuotes(group)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%s);", wrapQuotes(group)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the group.
     */
    public Controller setGroup(String[] group1) {
        if (jsBase == null) {
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            
            this.group1 = group1;
        } else {
            this.group1 = group1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%s)", arrayToStringWrapQuotes(group1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%s);", arrayToStringWrapQuotes(group1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the group.
     */
    public Controller setGroup(Boolean group2) {
        if (jsBase == null) {
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            
            this.group2 = group2;
        } else {
            this.group2 = group2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%b)", group2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%b);", group2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private String group3;
    private String[] group4;
    private Boolean group5;

    /**
     * Setter for the group by index.
     */
    public Controller setGroup(Number index, String group3) {
        if (jsBase == null) {
            this.index = index;
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            this.group3 = null;
            this.group4 = null;
            this.group5 = null;
            
            this.group3 = group3;
        } else {
            this.index = index;
            this.group3 = group3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%s, %s)", index, wrapQuotes(group3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%s, %s);", index, wrapQuotes(group3)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the group by index.
     */
    public Controller setGroup(Number index, String[] group4) {
        if (jsBase == null) {
            this.index = index;
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            this.group3 = null;
            this.group4 = null;
            this.group5 = null;
            
            this.group4 = group4;
        } else {
            this.index = index;
            this.group4 = group4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%s, %s)", index, arrayToStringWrapQuotes(group4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%s, %s);", index, arrayToStringWrapQuotes(group4)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the group by index.
     */
    public Controller setGroup(Number index, Boolean group5) {
        if (jsBase == null) {
            this.index = index;
            this.group = null;
            this.group1 = null;
            this.group2 = null;
            this.group3 = null;
            this.group4 = null;
            this.group5 = null;
            
            this.group5 = group5;
        } else {
            this.index = index;
            this.group5 = group5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".group(%s, %b)", index, group5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".group(%s, %b);", index, group5));
                js.setLength(0);
            }
        }
        return this;
    }

    private String hAlign;
    private TextHAlign hAlign1;

    /**
     * Setter for the horizontal align settings.
     */
    public Controller setHAlign(String hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(hAlign)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the horizontal align settings.
     */
    public Controller setHAlign(TextHAlign hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hAlign(%s)", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String height;
    private Number height1;

    /**
     * Setter for the markers height.
     */
    public Controller setHeight(String height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the markers height.
     */
    public Controller setHeight(Number height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getHovered;

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;

    /**
     * Setter for hovered state settings.
     */
    public Controller setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number letterSpacing;

    /**
     * Setter for text letter spacing settings.
     */
    public Controller setLetterSpacing(Number letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".letterSpacing(%s)", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number lineHeight;
    private String lineHeight1;

    /**
     * Setter for line height settings.
     */
    public Controller setLineHeight(Number lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".lineHeight(%s)", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for line height settings.
     */
    public Controller setLineHeight(String lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(lineHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxFontSize;
    private String maxFontSize1;

    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public Controller setMaxFontSize(Number maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%s)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%s);", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public Controller setMaxFontSize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%s);", wrapQuotes(maxFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minFontSize;
    private String minFontSize1;

    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public Controller setMinFontSize(Number minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%s)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%s);", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public Controller setMinFontSize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%s);", wrapQuotes(minFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    /**
     * Setter for normal state settings.
     */
    public Controller setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        return this;
    }

    private EventMarkerPosition position;
    private String position1;

    /**
     * Setter for the position.
     */
    public Controller setPosition(EventMarkerPosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the position.
     */
    public Controller setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean selectable;

    /**
     * Setter for the text selectable option.
     */
    public Controller setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectable(%b)", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;

    /**
     * Setter for selected state settings.
     */
    public Controller setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String seriesId;

    /**
     * Setter for the seriesId.<br/>
<b>Note</b>: Sets a series by id for all {@link anychart.core.stock.eventMarkers.Controller#position} values with exception of "axis" value.
     */
    public Controller setSeriesId(String seriesId) {
        if (jsBase == null) {
            this.seriesId = seriesId;
        } else {
            this.seriesId = seriesId;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".seriesId(%s)", wrapQuotes(seriesId)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".seriesId(%s);", wrapQuotes(seriesId)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color1;
    private String color2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<MapSeriesBase> setStroke = new ArrayList<>();

    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public MapSeriesBase setStroke(Stroke color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke" + ++variableIndex + " = " + jsBase + ".stroke(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MapSeriesBase item = new MapSeriesBase("setStroke" + variableIndex);
        setStroke.add(item);
        return item;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBase> setStroke1 = new ArrayList<>();

    /**
     * 
     */
    public MapSeriesBase setStroke(String json) {
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke1" + ++variableIndex + " = " + jsBase + ".stroke(%s);", wrapQuotes(json)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        MapSeriesBase item = new MapSeriesBase("setStroke1" + variableIndex);
        setStroke1.add(item);
        return item;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBase> setStroke2 = new ArrayList<>();

    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public MapSeriesBase setStroke(String color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke2" + ++variableIndex + " = " + jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MapSeriesBase item = new MapSeriesBase("setStroke2" + variableIndex);
        setStroke2.add(item);
        return item;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String textDirection;
    private Direction textDirection1;

    /**
     * Setter for text direction settings.
     */
    public Controller setTextDirection(String textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(textDirection)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text direction settings.
     */
    public Controller setTextDirection(Direction textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number textIndent;

    /**
     * Setter for text-indent settings.
     */
    public Controller setTextIndent(Number textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textIndent(%s)", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%s);", textIndent));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    /**
     * Setter for text overflow settings.
     */
    public Controller setTextOverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text overflow settings.
     */
    public Controller setTextOverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(textOverflow1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Controller getTooltip;

    /**
     * Getter for tooltip settings.
     */
    public Controller getTooltip() {
        if (getTooltip == null)
            getTooltip = new Controller(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<Pie> setTooltip = new ArrayList<>();

    /**
     * Setter for tooltip settings.
     */
    public Pie setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTooltip" + ++variableIndex + " = " + jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        Pie item = new Pie("setTooltip" + variableIndex);
        setTooltip.add(item);
        return item;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pie item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pie> setTooltip1 = new ArrayList<>();

    /**
     * Setter for tooltip settings.
     */
    public Pie setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTooltip1" + ++variableIndex + " = " + jsBase + ".tooltip(%b);", tooltip1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
        Pie item = new Pie("setTooltip1" + variableIndex);
        setTooltip1.add(item);
        return item;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pie item : setTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String type;
    private EventMarkerType type1;

    /**
     * Setter for the marker type.
     */
    public Controller setType(String type) {
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
            
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".type(%s);", wrapQuotes(type)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the marker type.
     */
    public Controller setType(EventMarkerType type1) {
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
            
            js.append(String.format(Locale.US, ".type(%s)", ((type1 != null) ? type1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".type(%s);", ((type1 != null) ? type1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean useHtml;

    /**
     * Setter for the useHTML flag.
     */
    public Controller setUseHtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".useHtml(%b)", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
        return this;
    }

    private String vAlign;
    private TextVAlign vAlign1;

    /**
     * Setter for text vertical align settings.
     */
    public Controller setVAlign(String vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(vAlign)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text vertical align settings.
     */
    public Controller setVAlign(TextVAlign vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String width;
    private Number width1;

    /**
     * Setter for the markers width.
     */
    public Controller setWidth(String width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the markers width.
     */
    public Controller setWidth(Number width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;

    /**
     * Setter for the word-break mode.
     */
    public Controller setWordBreak(EnumsWordBreak wordBreak) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak = wordBreak;
        } else {
            this.wordBreak = wordBreak;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordBreak(%s);", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the word-break mode.
     */
    public Controller setWordBreak(String wordBreak1) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak1 = wordBreak1;
        } else {
            this.wordBreak1 = wordBreak1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(wordBreak1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;

    /**
     * Setter for the word-wrap mode.
     */
    public Controller setWordWrap(EnumsWordWrap wordWrap) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap = wordWrap;
        } else {
            this.wordWrap = wordWrap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordWrap(%s);", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the word-wrap mode.
     */
    public Controller setWordWrap(String wordWrap1) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap1 = wordWrap1;
        } else {
            this.wordWrap1 = wordWrap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(wordWrap1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetConnector() {
        if (getConnector != null) {
            return getConnector.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGroup() {
        if (!getGroup.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Group item : getGroup) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetConnector());
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetGroup());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetTooltip());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetStroke2());
        js.append(generateJSsetTooltip());
        js.append(generateJSsetTooltip1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
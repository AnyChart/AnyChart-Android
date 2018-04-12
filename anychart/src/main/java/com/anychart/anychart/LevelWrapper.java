package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Single timeline header level.
 */
public class LevelWrapper extends CoreBase {

    public LevelWrapper() {
        js.setLength(0);
        js.append("var levelWrapper").append(++variableIndex).append(" = anychart.core.gantt.TimeLineHeader.levelWrapper();");
        jsBase = "levelWrapper" + variableIndex;
    }

    protected LevelWrapper(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LevelWrapper(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String bothOrByWidth;
    private Boolean[] bothOrByWidth1;
    private Boolean bothOrByWidth2;
    private Boolean byHeight;

    /**
     * Setter for the adjust font settings.
     */
    public LevelWrapper setAdjustFontSize(String bothOrByWidth, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(bothOrByWidth), byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", wrapQuotes(bothOrByWidth), byHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjust font settings.
     */
    public LevelWrapper setAdjustFontSize(Boolean[] bothOrByWidth1, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(bothOrByWidth1), byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(bothOrByWidth1), byHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjust font settings.
     */
    public LevelWrapper setAdjustFontSize(Boolean bothOrByWidth2, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", bothOrByWidth2, byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", bothOrByWidth2, byHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    /**
     * Setter for the pointer events settings.
     */
    public LevelWrapper setDisablePointerEvents(Boolean disablePointerEvents) {
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

    private Boolean state;
    private List<UiLabelsFactory> setEnabled = new ArrayList<>();

    /**
     * Setter for the level enabled state.
     */
    public UiLabelsFactory setEnabled(Boolean state) {
        if (jsBase == null) {
            this.state = state;
        } else {
            this.state = state;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setEnabled" + ++variableIndex + " = " + jsBase + ".enabled(%b);", state));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", state));
                js.setLength(0);
            }
        }
        UiLabelsFactory item = new UiLabelsFactory("setEnabled" + variableIndex);
        setEnabled.add(item);
        return item;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LevelWrapper setFill(Fill fill) {
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
    public LevelWrapper setFill(String json) {
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
     * Fill color with opacity.
     */
    public LevelWrapper fill(String color, Number opacity) {
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
    public LevelWrapper fill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
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
    public LevelWrapper fill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
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
    public LevelWrapper fill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
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
    public LevelWrapper fill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
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
    public LevelWrapper fill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
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
    public LevelWrapper fill(String[] keys1, Number angle, Number opacity1, String mode2) {
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
    public LevelWrapper fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
    public LevelWrapper fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
    private String color1;

    /**
     * Setter for font color settings.
     */
    public LevelWrapper setFontColor(String color1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
        } else {
            this.color1 = color1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(color1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(color1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    /**
     * Setter for the text font decoration.
     */
    public LevelWrapper setFontDecoration(Decoration fontDecoration) {
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
     * Setter for the text font decoration.
     */
    public LevelWrapper setFontDecoration(String fontDecoration1) {
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

    private String family;

    /**
     * Setter for font family.
     */
    public LevelWrapper setFontFamily(String family) {
        if (jsBase == null) {
            this.family = family;
        } else {
            this.family = family;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(family)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(family)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number opacity3;

    /**
     * Setter for the text font opacity.<br/>
Double value from 0 to 1.
     */
    public LevelWrapper setFontOpacity(Number opacity3) {
        if (jsBase == null) {
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontOpacity(%s)", opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%s);", opacity3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number size;
    private String size1;

    /**
     * Setter for font size settings.
     */
    public LevelWrapper setFontSize(Number size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontSize(%s)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font size settings.
     */
    public LevelWrapper setFontSize(String size1) {
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
            
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(size1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(size1)));
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
    public LevelWrapper setFontStyle(String fontStyle) {
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
    public LevelWrapper setFontStyle(TextFontStyle fontStyle1) {
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
    public LevelWrapper setFontVariant(String fontVariant) {
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
    public LevelWrapper setFontVariant(TextFontVariant fontVariant1) {
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

    private String weight;
    private Number weight1;

    /**
     * Setter for font weight settings.
     */
    public LevelWrapper setFontWeight(String weight) {
        if (jsBase == null) {
            this.weight = null;
            this.weight1 = null;
            
            this.weight = weight;
        } else {
            this.weight = weight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(weight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(weight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font weight settings.
     */
    public LevelWrapper setFontWeight(Number weight1) {
        if (jsBase == null) {
            this.weight = null;
            this.weight1 = null;
            
            this.weight1 = weight1;
        } else {
            this.weight1 = weight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontWeight(%s)", weight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", weight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String format;

    /**
     * Setter for the function content text.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using the format() method.{docs}
     */
    public LevelWrapper setFormat(String format) {
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

    private String hAlign;
    private TextHAlign hAlign1;

    /**
     * Setter for the text horizontal align settings.
     */
    public LevelWrapper setHAlign(String hAlign) {
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
     * Setter for the text horizontal align settings.
     */
    public LevelWrapper setHAlign(TextHAlign hAlign1) {
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

    private Number letterSpacing;

    /**
     * Setter for letter spacing settings.
     */
    public LevelWrapper setLetterSpacing(Number letterSpacing) {
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

    private String lineHeight;
    private Number lineHeight1;

    /**
     * Setter for the text line height.<br/> {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public LevelWrapper setLineHeight(String lineHeight) {
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
            
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(lineHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text line height.<br/> {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public LevelWrapper setLineHeight(Number lineHeight1) {
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
            
            js.append(String.format(Locale.US, ".lineHeight(%s)", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxFontSize;
    private String maxFontSize1;

    /**
     * Setter for the font size for adjust text to.
     */
    public LevelWrapper setMaxFontSize(Number maxFontSize) {
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
     * Setter for the font size for adjust text to.
     */
    public LevelWrapper setMaxFontSize(String maxFontSize1) {
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
    public LevelWrapper setMinFontSize(Number minFontSize) {
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
    public LevelWrapper setMinFontSize(String minFontSize1) {
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

    private Boolean selectable;

    /**
     * Setter for the text selectable.
     */
    public LevelWrapper setSelectable(Boolean selectable) {
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

    private Stroke settings;
    private ColoredFill settings1;
    private String settings2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the level stroke.
     */
    public LevelWrapper setStroke(Stroke settings, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings = settings;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.settings = settings;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((settings != null) ? settings.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((settings != null) ? settings.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public LevelWrapper setStroke(String json) {
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
     * Setter for the level stroke.
     */
    public LevelWrapper setStroke(ColoredFill settings1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings1 = settings1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.settings1 = settings1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((settings1 != null) ? settings1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((settings1 != null) ? settings1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the level stroke.
     */
    public LevelWrapper setStroke(String settings2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings2 = settings2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.settings2 = settings2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(settings2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(settings2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String settings3;
    private Direction textDirection;
    private String textDirection1;

    /**
     * Setter for the text direction.
     */
    public LevelWrapper setTextDirection(Direction textDirection) {
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
            
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection != null) ? textDirection.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", ((textDirection != null) ? textDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text direction.
     */
    public LevelWrapper setTextDirection(String textDirection1) {
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
            
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(textDirection1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number textIndent;

    /**
     * Setter for the text indent.
     */
    public LevelWrapper setTextIndent(Number textIndent) {
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
     * Setter for the text overflow settings.
     */
    public LevelWrapper setTextOverflow(TextOverflow textOverflow) {
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
     * Setter for the text overflow settings.
     */
    public LevelWrapper setTextOverflow(String textOverflow1) {
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

    private Boolean useHtml;

    /**
     * Setter for the useHTML flag.
     */
    public LevelWrapper setUseHtml(Boolean useHtml) {
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

    private TextVAlign vAlign;
    private String vAlign1;

    /**
     * Setter for the text vertical align.
     */
    public LevelWrapper setVAlign(TextVAlign vAlign) {
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
            
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign != null) ? vAlign.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", ((vAlign != null) ? vAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text vertical align.
     */
    public LevelWrapper setVAlign(String vAlign1) {
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
            
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(vAlign1)));
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
    public LevelWrapper setWordBreak(EnumsWordBreak wordBreak) {
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
    public LevelWrapper setWordBreak(String wordBreak1) {
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
    public LevelWrapper setWordWrap(EnumsWordWrap wordWrap) {
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
    public LevelWrapper setWordWrap(String wordWrap1) {
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

        js.append(generateJSsetEnabled());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
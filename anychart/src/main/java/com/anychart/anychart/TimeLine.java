package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TimeLine extends VisualBaseWithBounds {

    public TimeLine() {

    }

    protected TimeLine(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TimeLine(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private String adjustOrAdjustByWidth2;
    private Boolean adjustByHeight;

    public TimeLine setAdjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
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
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setAdjustFontSize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
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
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setAdjustFontSize(String adjustOrAdjustByWidth2, Boolean adjustByHeight) {
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

            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", adjustOrAdjustByWidth2, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", adjustOrAdjustByWidth2, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    public TimeLine setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".background(%s)", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", background));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    public TimeLine setDisablePointerEvents(Boolean disablePointerEvents) {
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
                onChangeListener.onChange(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean drawBottomLine;

    public Grid setDrawBottomLine(Boolean drawBottomLine) {
        if (jsBase == null) {
            this.drawBottomLine = drawBottomLine;
        } else {
            this.drawBottomLine = drawBottomLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".drawBottomLine(%b);", drawBottomLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawBottomLine(%b)", drawBottomLine));
                js.setLength(0);
            }
        }
        return new Grid(jsBase);
    }

    private Boolean drawLeftLine;

    public Grid setDrawLeftLine(Boolean drawLeftLine) {
        if (jsBase == null) {
            this.drawLeftLine = drawLeftLine;
        } else {
            this.drawLeftLine = drawLeftLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".drawLeftLine(%b);", drawLeftLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawLeftLine(%b)", drawLeftLine));
                js.setLength(0);
            }
        }
        return new Grid(jsBase);
    }

    private Boolean drawRightLine;

    public Grid setDrawRightLine(Boolean drawRightLine) {
        if (jsBase == null) {
            this.drawRightLine = drawRightLine;
        } else {
            this.drawRightLine = drawRightLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".drawRightLine(%b);", drawRightLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawRightLine(%b)", drawRightLine));
                js.setLength(0);
            }
        }
        return new Grid(jsBase);
    }

    private Boolean drawTopLine;

    public Grid setDrawTopLine(Boolean drawTopLine) {
        if (jsBase == null) {
            this.drawTopLine = drawTopLine;
        } else {
            this.drawTopLine = drawTopLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".drawTopLine(%b);", drawTopLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawTopLine(%b)", drawTopLine));
                js.setLength(0);
            }
        }
        return new Grid(jsBase);
    }

    private Fill fill;

    public TimeLine setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Double opacity;

    public TimeLine fill(String color, Double opacity) {
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

            js.append(String.format(Locale.US, ".fill(%s, %f)", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", color, opacity));
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

    public TimeLine fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public TimeLine fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
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

    public TimeLine fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private String fontColor;

    public TimeLine setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontColor(%s)", fontColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontColor(%s)", fontColor));
                js.setLength(0);
            }
        }
        return this;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public TimeLine setFontDecoration(Decoration fontDecoration) {
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

            js.append(String.format(Locale.US, ".fontDecoration(%s)", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setFontDecoration(String fontDecoration1) {
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

            js.append(String.format(Locale.US, ".fontDecoration(%s)", fontDecoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", fontDecoration1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontFamily;

    public TimeLine setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontFamily(%s)", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", fontFamily));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double fontOpacity;

    public TimeLine setFontOpacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double fontSize;
    private String fontSize1;

    public TimeLine setFontSize(Double fontSize) {
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

            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setFontSize(String fontSize1) {
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

            js.append(String.format(Locale.US, ".fontSize(%s)", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", fontSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontStyle;
    private TextFontStyle fontStyle1;

    public TimeLine setFontStyle(String fontStyle) {
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

            js.append(String.format(Locale.US, ".fontStyle(%s)", fontStyle));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", fontStyle));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setFontStyle(TextFontStyle fontStyle1) {
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

            js.append(String.format(Locale.US, ".fontStyle(%s)", (fontStyle1 != null) ? fontStyle1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", (fontStyle1 != null) ? fontStyle1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontVariant;
    private TextFontVariant fontVariant1;

    public TimeLine setFontVariant(String fontVariant) {
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

            js.append(String.format(Locale.US, ".fontVariant(%s)", fontVariant));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", fontVariant));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setFontVariant(TextFontVariant fontVariant1) {
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

            js.append(String.format(Locale.US, ".fontVariant(%s)", (fontVariant1 != null) ? fontVariant1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", (fontVariant1 != null) ? fontVariant1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontWeight;
    private Double fontWeight1;

    public TimeLine setFontWeight(String fontWeight) {
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

            js.append(String.format(Locale.US, ".fontWeight(%s)", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", fontWeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setFontWeight(Double fontWeight1) {
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

            js.append(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String format;

    public TimeLineLevelHolidaysSettings setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".format(%s);", format));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s)", format));
                js.setLength(0);
            }
        }
        return new TimeLineLevelHolidaysSettings(jsBase);
    }

    private String hAlign;
    private TextHAlign hAlign1;

    public TimeLine setHAlign(String hAlign) {
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

            js.append(String.format(Locale.US, ".hAlign(%s)", hAlign));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", hAlign));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setHAlign(TextHAlign hAlign1) {
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

            js.append(String.format(Locale.US, ".hAlign(%s)", (hAlign1 != null) ? hAlign1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", (hAlign1 != null) ? hAlign1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private TimeLineLevelHolidaysSettings getHolidays;

    public TimeLineLevelHolidaysSettings getHolidays() {
        if (getHolidays == null)
            getHolidays = new TimeLineLevelHolidaysSettings(jsBase + ".holidays()");

        return getHolidays;
    }

    private String holidays;

    public TimeLine setHolidays(String holidays) {
        if (jsBase == null) {
            this.holidays = holidays;
        } else {
            this.holidays = holidays;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".holidays(%s)", holidays));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".holidays(%s)", holidays));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double letterSpacing;
    private String letterSpacing1;

    public TimeLine setLetterSpacing(Double letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setLetterSpacing(String letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".letterSpacing(%s)", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%s)", letterSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double levelHeight;

    public TimeLine setLevelHeight(Double levelHeight) {
        if (jsBase == null) {
            this.levelHeight = levelHeight;
        } else {
            this.levelHeight = levelHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".levelHeight(%f)", levelHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelHeight(%f)", levelHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double lineHeight;
    private String lineHeight1;

    public TimeLine setLineHeight(Double lineHeight) {
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

            js.append(String.format(Locale.US, ".lineHeight(%f)", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%f)", lineHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setLineHeight(String lineHeight1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", lineHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxFontSize;
    private String maxFontSize1;

    public TimeLine setMaxFontSize(Double maxFontSize) {
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

            js.append(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setMaxFontSize(String maxFontSize1) {
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

            js.append(String.format(Locale.US, ".maxFontSize(%s)", maxFontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%s)", maxFontSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minFontSize;
    private String minFontSize1;

    public TimeLine setMinFontSize(Double minFontSize) {
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

            js.append(String.format(Locale.US, ".minFontSize(%f)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%f)", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setMinFontSize(String minFontSize1) {
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

            js.append(String.format(Locale.US, ".minFontSize(%s)", minFontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%s)", minFontSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Overlay getOverlay;

    public Overlay getOverlay() {
        if (getOverlay == null)
            getOverlay = new Overlay(jsBase + ".overlay()");

        return getOverlay;
    }

    private String overlay;
    private Boolean overlay1;

    public TimeLine setOverlay(String overlay) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay = overlay;
        } else {
            this.overlay = overlay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".overlay(%s)", overlay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlay(%s)", overlay));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setOverlay(Boolean overlay1) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay1 = overlay1;
        } else {
            this.overlay1 = overlay1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlay(%b)", overlay1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public TimeLine setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s)", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", padding2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public TimeLine setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value, value2, value4, value6));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setPadding(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean selectable;

    public TimeLine setSelectable(Boolean selectable) {
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
                onChangeListener.onChange(String.format(Locale.US, ".selectable(%b)", selectable));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public TimeLine setStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String textDirection;
    private Direction textDirection1;

    public TimeLine setTextDirection(String textDirection) {
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

            js.append(String.format(Locale.US, ".textDirection(%s)", textDirection));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", textDirection));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setTextDirection(Direction textDirection1) {
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

            js.append(String.format(Locale.US, ".textDirection(%s)", (textDirection1 != null) ? textDirection1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", (textDirection1 != null) ? textDirection1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double textIndent;

    public TimeLine setTextIndent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".textIndent(%f)", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textIndent(%f)", textIndent));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public TimeLine setTextOverflow(TextOverflow textOverflow) {
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

            js.append(String.format(Locale.US, ".textOverflow(%s)", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setTextOverflow(String textOverflow1) {
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

            js.append(String.format(Locale.US, ".textOverflow(%s)", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", textOverflow1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean useHtml;

    public TimeLine setUseHtml(Boolean useHtml) {
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
                onChangeListener.onChange(String.format(Locale.US, ".useHtml(%b)", useHtml));
                js.setLength(0);
            }
        }
        return this;
    }

    private String vAlign;
    private TextVAlign vAlign1;

    public TimeLine setVAlign(String vAlign) {
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

            js.append(String.format(Locale.US, ".vAlign(%s)", vAlign));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", vAlign));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setVAlign(TextVAlign vAlign1) {
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

            js.append(String.format(Locale.US, ".vAlign(%s)", (vAlign1 != null) ? vAlign1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", (vAlign1 != null) ? vAlign1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;

    public TimeLine setWordBreak(EnumsWordBreak wordBreak) {
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

            js.append(String.format(Locale.US, ".wordBreak(%s)", (wordBreak != null) ? wordBreak.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", (wordBreak != null) ? wordBreak.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setWordBreak(String wordBreak1) {
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

            js.append(String.format(Locale.US, ".wordBreak(%s)", wordBreak1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wordBreak1));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;

    public TimeLine setWordWrap(EnumsWordWrap wordWrap) {
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

            js.append(String.format(Locale.US, ".wordWrap(%s)", (wordWrap != null) ? wordWrap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", (wordWrap != null) ? wordWrap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimeLine setWordWrap(String wordWrap1) {
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

            js.append(String.format(Locale.US, ".wordWrap(%s)", wordWrap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wordWrap1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetHolidays() {
        if (getHolidays != null) {
            return getHolidays.generateJs();
        }
        return "";
    }

    private String generateJSgetOverlay() {
        if (getOverlay != null) {
            return getOverlay.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth() {
        if (adjustOrAdjustByWidth != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %b,", adjustOrAdjustByWidth);
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth1() {
        if (adjustOrAdjustByWidth1 != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %s,", Arrays.toString(adjustOrAdjustByWidth1));
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth2() {
        if (adjustOrAdjustByWidth2 != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %s,", adjustOrAdjustByWidth2);
        }
        return "";
    }

    private String generateJSadjustByHeight() {
        if (adjustByHeight != null) {
            return String.format(Locale.US, "adjustByHeight: %b,", adjustByHeight);
        }
        return "";
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %s,", background1);
        }
        return "";
    }

    private String generateJSbackground2() {
        if (background2 != null) {
            return String.format(Locale.US, "background: %b,", background2);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdrawBottomLine() {
        if (drawBottomLine != null) {
            return String.format(Locale.US, "drawBottomLine: %b,", drawBottomLine);
        }
        return "";
    }

    private String generateJSdrawLeftLine() {
        if (drawLeftLine != null) {
            return String.format(Locale.US, "drawLeftLine: %b,", drawLeftLine);
        }
        return "";
    }

    private String generateJSdrawRightLine() {
        if (drawRightLine != null) {
            return String.format(Locale.US, "drawRightLine: %b,", drawRightLine);
        }
        return "";
    }

    private String generateJSdrawTopLine() {
        if (drawTopLine != null) {
            return String.format(Locale.US, "drawTopLine: %b,", drawTopLine);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle);
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle1 != null) ? fontStyle1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant);
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant1 != null) ? fontVariant1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: %s,", format);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign);
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign1 != null) ? hAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSholidays() {
        if (holidays != null) {
            return String.format(Locale.US, "holidays: %s,", holidays);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlevelHeight() {
        if (levelHeight != null) {
            return String.format(Locale.US, "levelHeight: %f,", levelHeight);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight1);
        }
        return "";
    }

    private String generateJSmaxFontSize() {
        if (maxFontSize != null) {
            return String.format(Locale.US, "maxFontSize: %f,", maxFontSize);
        }
        return "";
    }

    private String generateJSmaxFontSize1() {
        if (maxFontSize1 != null) {
            return String.format(Locale.US, "maxFontSize: %s,", maxFontSize1);
        }
        return "";
    }

    private String generateJSminFontSize() {
        if (minFontSize != null) {
            return String.format(Locale.US, "minFontSize: %f,", minFontSize);
        }
        return "";
    }

    private String generateJSminFontSize1() {
        if (minFontSize1 != null) {
            return String.format(Locale.US, "minFontSize: %s,", minFontSize1);
        }
        return "";
    }

    private String generateJSoverlay() {
        if (overlay != null) {
            return String.format(Locale.US, "overlay: %s,", overlay);
        }
        return "";
    }

    private String generateJSoverlay1() {
        if (overlay1 != null) {
            return String.format(Locale.US, "overlay: %b,", overlay1);
        }
        return "";
    }

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSpadding2() {
        if (padding2 != null) {
            return String.format(Locale.US, "padding: %s,", padding2);
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", (color2 != null) ? color2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection);
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection1 != null) ? textDirection1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign);
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign1 != null) ? vAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSwordBreak() {
        if (wordBreak != null) {
            return String.format(Locale.US, "wordBreak: %s,", (wordBreak != null) ? wordBreak.generateJs() : "null");
        }
        return "";
    }

    private String generateJSwordBreak1() {
        if (wordBreak1 != null) {
            return String.format(Locale.US, "wordBreak: %s,", wordBreak1);
        }
        return "";
    }

    private String generateJSwordWrap() {
        if (wordWrap != null) {
            return String.format(Locale.US, "wordWrap: %s,", (wordWrap != null) ? wordWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSwordWrap1() {
        if (wordWrap1 != null) {
            return String.format(Locale.US, "wordWrap: %s,", wordWrap1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetHolidays());
        jsGetters.append(generateJSgetOverlay());
        jsGetters.append(generateJSgetPadding());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSadjustOrAdjustByWidth());
            js.append(generateJSadjustOrAdjustByWidth1());
            js.append(generateJSadjustOrAdjustByWidth2());
            js.append(generateJSadjustByHeight());
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdrawBottomLine());
            js.append(generateJSdrawLeftLine());
            js.append(generateJSdrawRightLine());
            js.append(generateJSdrawTopLine());
            js.append(generateJSfill());
            js.append(generateJScolor());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJSfontColor());
            js.append(generateJSfontDecoration());
            js.append(generateJSfontDecoration1());
            js.append(generateJSfontFamily());
            js.append(generateJSfontOpacity());
            js.append(generateJSfontSize());
            js.append(generateJSfontSize1());
            js.append(generateJSfontStyle());
            js.append(generateJSfontStyle1());
            js.append(generateJSfontVariant());
            js.append(generateJSfontVariant1());
            js.append(generateJSfontWeight());
            js.append(generateJSfontWeight1());
            js.append(generateJSformat());
            js.append(generateJShAlign());
            js.append(generateJShAlign1());
            js.append(generateJSholidays());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlevelHeight());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJSmaxFontSize());
            js.append(generateJSmaxFontSize1());
            js.append(generateJSminFontSize());
            js.append(generateJSminFontSize1());
            js.append(generateJSoverlay());
            js.append(generateJSoverlay1());
            js.append(generateJSpadding());
            js.append(generateJSpadding1());
            js.append(generateJSpadding2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJSselectable());
            js.append(generateJScolor1());
            js.append(generateJScolor2());
            js.append(generateJScolor3());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSwordBreak());
            js.append(generateJSwordBreak1());
            js.append(generateJSwordWrap());
            js.append(generateJSwordWrap1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
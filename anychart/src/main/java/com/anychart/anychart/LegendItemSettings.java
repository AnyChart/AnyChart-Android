package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class LegendItemSettings extends JsObject {

    private String jsBase;

    public LegendItemSettings() {

    }

    protected LegendItemSettings(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;

            js.append(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
    }

    private Boolean disabled;

    public void setDisabled(Boolean disabled) {
        if (jsBase == null) {
            this.disabled = disabled;
        } else {
            this.disabled = disabled;

            js.append(String.format(Locale.US, jsBase + ".disabled(%b);", disabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disabled(%b);", disabled));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;

            js.append(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));
                js.setLength(0);
            }
        }
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontdecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));
                js.setLength(0);
            }
        }
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;

            js.append(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));
                js.setLength(0);
            }
        }
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;

            js.append(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));
                js.setLength(0);
            }
        }
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));
                js.setLength(0);
            }
        }
    }


    public void setFontsize(Double fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));
                js.setLength(0);
            }
        }
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontstyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));
                js.setLength(0);
            }
        }
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontvariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));
                js.setLength(0);
            }
        }
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));
                js.setLength(0);
            }
        }
    }


    public void setFontweight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));
                js.setLength(0);
            }
        }
    }

    private String format;

    public void setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;

            js.append(String.format(Locale.US, jsBase + ".format(%s);", format));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s);", format));
                js.setLength(0);
            }
        }
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public void setHalign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHalign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));
                js.setLength(0);
            }
        }
    }

    private Boolean iconEnabled;

    public void setIconenabled(Boolean iconEnabled) {
        if (jsBase == null) {
            this.iconEnabled = iconEnabled;
        } else {
            this.iconEnabled = iconEnabled;

            js.append(String.format(Locale.US, jsBase + ".iconEnabled(%b);", iconEnabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconEnabled(%b);", iconEnabled));
                js.setLength(0);
            }
        }
    }

    private Fill iconFill;

    public void setIconfill(Fill iconFill) {
        if (jsBase == null) {
            this.iconFill = iconFill;
        } else {
            this.iconFill = iconFill;

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s);", (iconFill != null) ? iconFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s);", (iconFill != null) ? iconFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setIconfill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %f);", color, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setIconfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setIconfill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setIconfill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".iconFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private PatternFill geticonHatchFill;

    public PatternFill getIconhatchfill() {
        if (geticonHatchFill == null)
            geticonHatchFill = new PatternFill(jsBase + ".iconHatchFill()");

        return geticonHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;

    public void setIconhatchfill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
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

            js.append(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setIconhatchfill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
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

            js.append(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setIconhatchfill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
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

            js.append(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setIconhatchfill(String patternFillOrType3, String color1, Double thickness, Double size) {
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

            js.append(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness, size));
                js.setLength(0);
            }
        }
    }

    private Fill fillOrColorOrKeys;
    private GradientKey[] fillOrColorOrKeys1;
    private String[] fillOrColorOrKeys2;
    private Double opacityOrAngleOrCx;
    private Double modeOrCy;
    private Boolean modeOrCy1;
    private GraphicsMathRect modeOrCy2;
    private String modeOrCy3;
    private Double opacityOrMode;
    private GraphicsMathRect opacityOrMode1;
    private String opacityOrMode2;
    private Double opacity3;
    private Double fx1;
    private Double fy1;

    public void setIconmarkerfill(Fill fillOrColorOrKeys, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity3 = opacity3;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity3, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setIconmarkerstroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerstroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkerstroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerStroke(%s, %f, %s, %s, %s);", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private MarkerType iconMarkerType;
    private String iconMarkerType1;

    public void setIconmarkertype(MarkerType iconMarkerType) {
        if (jsBase == null) {
            this.iconMarkerType = null;
            this.iconMarkerType1 = null;
            
            this.iconMarkerType = iconMarkerType;
        } else {
            this.iconMarkerType = iconMarkerType;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerType(%s);", (iconMarkerType != null) ? iconMarkerType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerType(%s);", (iconMarkerType != null) ? iconMarkerType.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIconmarkertype(String iconMarkerType1) {
        if (jsBase == null) {
            this.iconMarkerType = null;
            this.iconMarkerType1 = null;
            
            this.iconMarkerType1 = iconMarkerType1;
        } else {
            this.iconMarkerType1 = iconMarkerType1;

            js.append(String.format(Locale.US, jsBase + ".iconMarkerType(%s);", iconMarkerType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconMarkerType(%s);", iconMarkerType1));
                js.setLength(0);
            }
        }
    }

    private Double iconSize;
    private String iconSize1;

    public void setIconsize(Double iconSize) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize = iconSize;
        } else {
            this.iconSize = iconSize;

            js.append(String.format(Locale.US, jsBase + ".iconSize(%f);", iconSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%f);", iconSize));
                js.setLength(0);
            }
        }
    }


    public void setIconsize(String iconSize1) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize1 = iconSize1;
        } else {
            this.iconSize1 = iconSize1;

            js.append(String.format(Locale.US, jsBase + ".iconSize(%s);", iconSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%s);", iconSize1));
                js.setLength(0);
            }
        }
    }

    private Stroke iconStroke;
    private ColoredFill iconStroke1;
    private String iconStroke2;
    private Double thickness2;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setIconstroke(Stroke iconStroke, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke = iconStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke = iconStroke;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", (iconStroke != null) ? iconStroke.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", (iconStroke != null) ? iconStroke.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIconstroke(ColoredFill iconStroke1, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke1 = iconStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke1 = iconStroke1;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", (iconStroke1 != null) ? iconStroke1.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", (iconStroke1 != null) ? iconStroke1.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIconstroke(String iconStroke2, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke2 = iconStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke2 = iconStroke2;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", iconStroke2, thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconStroke(%s, %f, %s, %s, %s);", iconStroke2, thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double iconTextSpacing;

    public void setIcontextspacing(Double iconTextSpacing) {
        if (jsBase == null) {
            this.iconTextSpacing = iconTextSpacing;
        } else {
            this.iconTextSpacing = iconTextSpacing;

            js.append(String.format(Locale.US, jsBase + ".iconTextSpacing(%f);", iconTextSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconTextSpacing(%f);", iconTextSpacing));
                js.setLength(0);
            }
        }
    }

    private LegendItemIconType iconType;
    private String iconType1;

    public void setIcontype(LegendItemIconType iconType) {
        if (jsBase == null) {
            this.iconType = null;
            this.iconType1 = null;
            
            this.iconType = iconType;
        } else {
            this.iconType = iconType;

            js.append(String.format(Locale.US, jsBase + ".iconType(%s);", (iconType != null) ? iconType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconType(%s);", (iconType != null) ? iconType.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIcontype(String iconType1) {
        if (jsBase == null) {
            this.iconType = null;
            this.iconType1 = null;
            
            this.iconType1 = iconType1;
        } else {
            this.iconType1 = iconType1;

            js.append(String.format(Locale.US, jsBase + ".iconType(%s);", iconType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconType(%s);", iconType1));
                js.setLength(0);
            }
        }
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));
                js.setLength(0);
            }
        }
    }


    public void setLetterspacing(Double letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));
                js.setLength(0);
            }
        }
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));
                js.setLength(0);
            }
        }
    }


    public void setLineheight(Double lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;

            js.append(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
    }

    private String text;

    public void setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;

            js.append(String.format(Locale.US, jsBase + ".text(%s);", text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%s);", text));
                js.setLength(0);
            }
        }
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextdirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));
                js.setLength(0);
            }
        }
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;

            js.append(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));
                js.setLength(0);
            }
        }
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextoverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));
                js.setLength(0);
            }
        }
    }

    private String name;

    public void setTextsettings(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String objectWithSettings;
    private String name1;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings = textSettings;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings = textSettings;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Double textSettings1, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings1 = textSettings1;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings1 = textSettings1;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Boolean textSettings2, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings2 = textSettings2;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings2 = textSettings2;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));
                js.setLength(0);
            }
        }
    }

    private TextTextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextTextWrap textWrap) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap = textWrap;
        } else {
            this.textWrap = textWrap;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextwrap(String textWrap1) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap1 = textWrap1;
        } else {
            this.textWrap1 = textWrap1;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;

            js.append(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public void setValign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgeticonHatchFill() {
        if (geticonHatchFill != null) {
            return geticonHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdisabled() {
        if (disabled != null) {
            return String.format(Locale.US, "disabled: %b,", disabled);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
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
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
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
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
        }
        return "";
    }

    private String generateJSiconEnabled() {
        if (iconEnabled != null) {
            return String.format(Locale.US, "iconEnabled: %b,", iconEnabled);
        }
        return "";
    }

    private String generateJSiconFill() {
        if (iconFill != null) {
            return String.format(Locale.US, "iconFill: %s,", (iconFill != null) ? iconFill.generateJs() : "null");
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

    private String generateJSpatternFillOrType() {
        if (patternFillOrType != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType1() {
        if (patternFillOrType1 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType2() {
        if (patternFillOrType2 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType3() {
        if (patternFillOrType3 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType3);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys() {
        if (fillOrColorOrKeys != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys1() {
        if (fillOrColorOrKeys1 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys1));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys2() {
        if (fillOrColorOrKeys2 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys2));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx() {
        if (opacityOrAngleOrCx != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx);
        }
        return "";
    }

    private String generateJSmodeOrCy() {
        if (modeOrCy != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy);
        }
        return "";
    }

    private String generateJSmodeOrCy1() {
        if (modeOrCy1 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy1);
        }
        return "";
    }

    private String generateJSmodeOrCy2() {
        if (modeOrCy2 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmodeOrCy3() {
        if (modeOrCy3 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", modeOrCy3);
        }
        return "";
    }

    private String generateJSopacityOrMode() {
        if (opacityOrMode != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode);
        }
        return "";
    }

    private String generateJSopacityOrMode1() {
        if (opacityOrMode1 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode2() {
        if (opacityOrMode2 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", opacityOrMode2);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
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
            return String.format(Locale.US, "color: %s,", (color3 != null) ? color3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
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

    private String generateJSiconMarkerType() {
        if (iconMarkerType != null) {
            return String.format(Locale.US, "iconMarkerType: %s,", (iconMarkerType != null) ? iconMarkerType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconMarkerType1() {
        if (iconMarkerType1 != null) {
            return String.format(Locale.US, "iconMarkerType: %s,", iconMarkerType1);
        }
        return "";
    }

    private String generateJSiconSize() {
        if (iconSize != null) {
            return String.format(Locale.US, "iconSize: %f,", iconSize);
        }
        return "";
    }

    private String generateJSiconSize1() {
        if (iconSize1 != null) {
            return String.format(Locale.US, "iconSize: %s,", iconSize1);
        }
        return "";
    }

    private String generateJSiconStroke() {
        if (iconStroke != null) {
            return String.format(Locale.US, "iconStroke: %s,", (iconStroke != null) ? iconStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconStroke1() {
        if (iconStroke1 != null) {
            return String.format(Locale.US, "iconStroke: %s,", (iconStroke1 != null) ? iconStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconStroke2() {
        if (iconStroke2 != null) {
            return String.format(Locale.US, "iconStroke: %s,", iconStroke2);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconTextSpacing() {
        if (iconTextSpacing != null) {
            return String.format(Locale.US, "iconTextSpacing: %f,", iconTextSpacing);
        }
        return "";
    }

    private String generateJSiconType() {
        if (iconType != null) {
            return String.format(Locale.US, "iconType: %s,", (iconType != null) ? iconType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconType1() {
        if (iconType1 != null) {
            return String.format(Locale.US, "iconType: %s,", iconType1);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
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

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSobjectWithSettings() {
        if (objectWithSettings != null) {
            return String.format(Locale.US, "objectWithSettings: %s,", objectWithSettings);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdisabled());
            js.append(generateJSenabled());
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
            js.append(generateJSiconEnabled());
            js.append(generateJSiconFill());
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
            js.append(generateJSpatternFillOrType());
            js.append(generateJSpatternFillOrType1());
            js.append(generateJSpatternFillOrType2());
            js.append(generateJSpatternFillOrType3());
            js.append(generateJScolor1());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSfillOrColorOrKeys());
            js.append(generateJSfillOrColorOrKeys1());
            js.append(generateJSfillOrColorOrKeys2());
            js.append(generateJSopacityOrAngleOrCx());
            js.append(generateJSmodeOrCy());
            js.append(generateJSmodeOrCy1());
            js.append(generateJSmodeOrCy2());
            js.append(generateJSmodeOrCy3());
            js.append(generateJSopacityOrMode());
            js.append(generateJSopacityOrMode1());
            js.append(generateJSopacityOrMode2());
            js.append(generateJSopacity3());
            js.append(generateJSfx1());
            js.append(generateJSfy1());
            js.append(generateJScolor2());
            js.append(generateJScolor3());
            js.append(generateJScolor4());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSiconMarkerType());
            js.append(generateJSiconMarkerType1());
            js.append(generateJSiconSize());
            js.append(generateJSiconSize1());
            js.append(generateJSiconStroke());
            js.append(generateJSiconStroke1());
            js.append(generateJSiconStroke2());
            js.append(generateJSthickness2());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSiconTextSpacing());
            js.append(generateJSiconType());
            js.append(generateJSiconType1());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSselectable());
            js.append(generateJStext());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJSname());
            js.append(generateJSobjectWithSettings());
            js.append(generateJSname1());
            js.append(generateJStextSettings());
            js.append(generateJStextSettings1());
            js.append(generateJStextSettings2());
            js.append(generateJStextWrap());
            js.append(generateJStextWrap1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgeticonHatchFill());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
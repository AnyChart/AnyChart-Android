package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Tank extends JsObject {

    private String jsBase;

    public Tank() {

    }

    protected Tank(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String color;

    public void setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;

            js.append(String.format(Locale.US, jsBase + ".color(%s);", color));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".color(%s);", color));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setDataindex(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".dataIndex(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dataIndex(%f);", index));
                js.setLength(0);
            }
        }
    }

    private Fill emptyFill;
    private String emptyFill1;

    public void setEmptyfill(Fill emptyFill) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill = emptyFill;
        } else {
            this.emptyFill = emptyFill;

            js.append(String.format(Locale.US, jsBase + ".emptyFill(%s);", (emptyFill != null) ? emptyFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyFill(%s);", (emptyFill != null) ? emptyFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setEmptyfill(String emptyFill1) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill1 = emptyFill1;
        } else {
            this.emptyFill1 = emptyFill1;

            js.append(String.format(Locale.US, jsBase + ".emptyFill(%s);", emptyFill1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyFill(%s);", emptyFill1));
                js.setLength(0);
            }
        }
    }

    private String color1;
    private Double opacity;

    public void setEmptyfill(String color1, Double opacity) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.opacity = opacity;
        } else {
            this.color1 = color1;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".emptyFill(%s, %f);", color1, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyFill(%s, %f);", color1, opacity));
                js.setLength(0);
            }
        }
    }

    private PatternFill getemptyHatchFill;

    public PatternFill getEmptyhatchfill() {
        if (getemptyHatchFill == null)
            getemptyHatchFill = new PatternFill(jsBase + ".emptyHatchFill()");

        return getemptyHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color2;
    private Double thickness;
    private Double size;

    public void setEmptyhatchfill(PatternFill patternFillOrType, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setEmptyhatchfill(HatchFill patternFillOrType1, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setEmptyhatchfill(HatchFillType patternFillOrType2, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setEmptyhatchfill(String patternFillOrType3, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", patternFillOrType3, color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyHatchFill(%s, %s, %f, %f);", patternFillOrType3, color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setEmptyhatchfill(Boolean patternFillOrType4, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType4 = patternFillOrType4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".emptyHatchFill(%b, %s, %f, %f);", patternFillOrType4, color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".emptyHatchFill(%b, %s, %f, %f);", patternFillOrType4, color2, thickness, size));
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

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color3;
    private Double opacity1;

    public void setFill(String color3, Double opacity1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.color3 = color3;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color3, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color3, opacity1));
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
    private Double opacity2;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity2));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity2));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity2));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity2));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity2));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity2) {
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
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity2 = opacity2;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity2));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity3;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity3, Double fx, Double fy) {
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
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity3 = opacity3;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity3, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity3, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity3, Double fx, Double fy) {
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
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity3 = opacity3;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity3, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity3, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private PatternFill gethatchFill;

    public PatternFill getHatchfill() {
        if (gethatchFill == null)
            gethatchFill = new PatternFill(jsBase + ".hatchFill()");

        return gethatchFill;
    }

    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private Boolean patternFillOrType9;
    private String color4;
    private Double thickness1;
    private Double size1;

    public void setHatchfill(PatternFill patternFillOrType5, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            
            this.patternFillOrType5 = patternFillOrType5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType5 = patternFillOrType5;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(HatchFill patternFillOrType6, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            
            this.patternFillOrType6 = patternFillOrType6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType6 = patternFillOrType6;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(HatchFillType patternFillOrType7, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            
            this.patternFillOrType7 = patternFillOrType7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType7 = patternFillOrType7;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(String patternFillOrType8, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            
            this.patternFillOrType8 = patternFillOrType8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType8 = patternFillOrType8;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", patternFillOrType8, color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", patternFillOrType8, color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(Boolean patternFillOrType9, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            
            this.patternFillOrType9 = patternFillOrType9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType9 = patternFillOrType9;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrType9, color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrType9, color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }

    private Fill hoverEmptyFill;
    private String hoverEmptyFill1;

    public void setHoveremptyfill(Fill hoverEmptyFill) {
        if (jsBase == null) {
            this.hoverEmptyFill = null;
            this.hoverEmptyFill1 = null;
            
            this.hoverEmptyFill = hoverEmptyFill;
        } else {
            this.hoverEmptyFill = hoverEmptyFill;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s);", (hoverEmptyFill != null) ? hoverEmptyFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s);", (hoverEmptyFill != null) ? hoverEmptyFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoveremptyfill(String hoverEmptyFill1) {
        if (jsBase == null) {
            this.hoverEmptyFill = null;
            this.hoverEmptyFill1 = null;
            
            this.hoverEmptyFill1 = hoverEmptyFill1;
        } else {
            this.hoverEmptyFill1 = hoverEmptyFill1;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s);", hoverEmptyFill1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s);", hoverEmptyFill1));
                js.setLength(0);
            }
        }
    }

    private String color5;
    private Double opacity4;

    public void setHoveremptyfill(String color5, Double opacity4) {
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
            
            this.opacity4 = opacity4;
        } else {
            this.color5 = color5;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s, %f);", color5, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyFill(%s, %f);", color5, opacity4));
                js.setLength(0);
            }
        }
    }

    private PatternFill gethoverEmptyHatchFill;

    public PatternFill getHoveremptyhatchfill() {
        if (gethoverEmptyHatchFill == null)
            gethoverEmptyHatchFill = new PatternFill(jsBase + ".hoverEmptyHatchFill()");

        return gethoverEmptyHatchFill;
    }

    private PatternFill patternFillOrType10;
    private HatchFill patternFillOrType11;
    private HatchFillType patternFillOrType12;
    private String patternFillOrType13;
    private Boolean patternFillOrType14;
    private String color6;
    private Double thickness2;
    private Double size2;

    public void setHoveremptyhatchfill(PatternFill patternFillOrType10, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            
            this.patternFillOrType10 = patternFillOrType10;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType10 = patternFillOrType10;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHoveremptyhatchfill(HatchFill patternFillOrType11, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            
            this.patternFillOrType11 = patternFillOrType11;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType11 = patternFillOrType11;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHoveremptyhatchfill(HatchFillType patternFillOrType12, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            
            this.patternFillOrType12 = patternFillOrType12;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType12 = patternFillOrType12;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHoveremptyhatchfill(String patternFillOrType13, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            
            this.patternFillOrType13 = patternFillOrType13;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType13 = patternFillOrType13;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", patternFillOrType13, color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%s, %s, %f, %f);", patternFillOrType13, color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHoveremptyhatchfill(Boolean patternFillOrType14, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            
            this.patternFillOrType14 = patternFillOrType14;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType14 = patternFillOrType14;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%b, %s, %f, %f);", patternFillOrType14, color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverEmptyHatchFill(%b, %s, %f, %f);", patternFillOrType14, color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }

    private Fill hoverFill;

    public void setHoverfill(Fill hoverFill) {
        if (jsBase == null) {
            this.hoverFill = hoverFill;
        } else {
            this.hoverFill = hoverFill;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color7;
    private Double opacity5;

    public void setHoverfill(String color7, Double opacity5) {
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
            
            this.opacity5 = opacity5;
        } else {
            this.color7 = color7;
            this.opacity5 = opacity5;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f);", color7, opacity5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f);", color7, opacity5));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity6;

    public void setHoverfill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity6));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity6));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] keys4, String mode6, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity6));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, Boolean mode4, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity6));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, VectorRect mode5, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity6));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, String mode6, Double angle1, Double opacity6) {
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
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity6));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity7;
    private Double fx1;
    private Double fy1;

    public void setHoverfill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity7, Double fx1, Double fy1) {
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
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
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
            this.opacity7 = opacity7;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity7, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity7, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity7, Double fx1, Double fy1) {
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
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
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
            this.opacity7 = opacity7;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity7, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity7, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings1;
    private PatternFill gethoverHatchFill;

    public PatternFill getHoverhatchfill() {
        if (gethoverHatchFill == null)
            gethoverHatchFill = new PatternFill(jsBase + ".hoverHatchFill()");

        return gethoverHatchFill;
    }

    private PatternFill patternFillOrType15;
    private HatchFill patternFillOrType16;
    private HatchFillType patternFillOrType17;
    private String patternFillOrType18;
    private Boolean patternFillOrType19;
    private String color8;
    private Double thickness3;
    private Double size3;

    public void setHoverhatchfill(PatternFill patternFillOrType15, String color8, Double thickness3, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            
            this.patternFillOrType15 = patternFillOrType15;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType15 = patternFillOrType15;
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType15 != null) ? patternFillOrType15.generateJs() : "null", color8, thickness3, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType15 != null) ? patternFillOrType15.generateJs() : "null", color8, thickness3, size3));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(HatchFill patternFillOrType16, String color8, Double thickness3, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            
            this.patternFillOrType16 = patternFillOrType16;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType16 = patternFillOrType16;
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null", color8, thickness3, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null", color8, thickness3, size3));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(HatchFillType patternFillOrType17, String color8, Double thickness3, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            
            this.patternFillOrType17 = patternFillOrType17;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType17 = patternFillOrType17;
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null", color8, thickness3, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null", color8, thickness3, size3));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(String patternFillOrType18, String color8, Double thickness3, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            
            this.patternFillOrType18 = patternFillOrType18;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType18 = patternFillOrType18;
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", patternFillOrType18, color8, thickness3, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", patternFillOrType18, color8, thickness3, size3));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(Boolean patternFillOrType19, String color8, Double thickness3, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            
            this.patternFillOrType19 = patternFillOrType19;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType19 = patternFillOrType19;
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%b, %s, %f, %f);", patternFillOrType19, color8, thickness3, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%b, %s, %f, %f);", patternFillOrType19, color8, thickness3, size3));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory gethoverLabel;

    public UiLabelsFactory getHoverlabel() {
        if (gethoverLabel == null)
            gethoverLabel = new UiLabelsFactory(jsBase + ".hoverLabel()");

        return gethoverLabel;
    }

    private UiLabelsFactory hoverLabel;
    private String hoverLabel1;
    private Boolean hoverLabel2;

    public void setHoverlabel(UiLabelsFactory hoverLabel) {
        if (jsBase == null) {
            this.hoverLabel = null;
            this.hoverLabel1 = null;
            this.hoverLabel2 = null;
            
            this.hoverLabel = hoverLabel;
        } else {
            this.hoverLabel = hoverLabel;

            js.append(String.format(Locale.US, jsBase + ".hoverLabel(%s);", (hoverLabel != null) ? hoverLabel.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLabel(%s);", (hoverLabel != null) ? hoverLabel.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverlabel(String hoverLabel1) {
        if (jsBase == null) {
            this.hoverLabel = null;
            this.hoverLabel1 = null;
            this.hoverLabel2 = null;
            
            this.hoverLabel1 = hoverLabel1;
        } else {
            this.hoverLabel1 = hoverLabel1;

            js.append(String.format(Locale.US, jsBase + ".hoverLabel(%s);", hoverLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLabel(%s);", hoverLabel1));
                js.setLength(0);
            }
        }
    }


    public void setHoverlabel(Boolean hoverLabel2) {
        if (jsBase == null) {
            this.hoverLabel = null;
            this.hoverLabel1 = null;
            this.hoverLabel2 = null;
            
            this.hoverLabel2 = hoverLabel2;
        } else {
            this.hoverLabel2 = hoverLabel2;

            js.append(String.format(Locale.US, jsBase + ".hoverLabel(%b);", hoverLabel2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLabel(%b);", hoverLabel2));
                js.setLength(0);
            }
        }
    }

    private Stroke hoverStroke;

    public void setHoverstroke(Stroke hoverStroke) {
        if (jsBase == null) {
            this.hoverStroke = hoverStroke;
        } else {
            this.hoverStroke = hoverStroke;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke color9;
    private ColoredFill color10;
    private String color11;
    private Double thickness4;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHoverstroke(Stroke color9, Double thickness4, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color9 = color9;
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color9 != null) ? color9.generateJs() : "null", thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color9 != null) ? color9.generateJs() : "null", thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(ColoredFill color10, Double thickness4, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color10 = color10;
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(String color11, Double thickness4, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color11 = color11;
            this.thickness4 = thickness4;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color11, thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color11, thickness4, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getlabel;

    public UiLabelsFactory getLabel() {
        if (getlabel == null)
            getlabel = new UiLabelsFactory(jsBase + ".label()");

        return getlabel;
    }

    private UiLabelsFactory label;
    private String label1;
    private Boolean label2;

    public void setLabel(UiLabelsFactory label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;

            js.append(String.format(Locale.US, jsBase + ".label(%s);", (label != null) ? label.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", (label != null) ? label.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLabel(String label1) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label1 = label1;
        } else {
            this.label1 = label1;

            js.append(String.format(Locale.US, jsBase + ".label(%s);", label1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", label1));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Boolean label2) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label2 = label2;
        } else {
            this.label2 = label2;

            js.append(String.format(Locale.US, jsBase + ".label(%b);", label2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label2));
                js.setLength(0);
            }
        }
    }

    private LegendItemSettings getlegendItem;

    public LegendItemSettings getLegenditem() {
        if (getlegendItem == null)
            getlegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getlegendItem;
    }

    private String legendItem;

    public void setLegenditem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;

            js.append(String.format(Locale.US, jsBase + ".legendItem(%s);", legendItem));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legendItem(%s);", legendItem));
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

    private String name;

    public void setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".name(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".name(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String offset;

    public void setOffset(String offset) {
        if (jsBase == null) {
            this.offset = offset;
        } else {
            this.offset = offset;

            js.append(String.format(Locale.US, jsBase + ".offset(%s);", offset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offset(%s);", offset));
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

    private ScalesBase getscale;

    public ScalesBase getScale() {
        if (getscale == null)
            getscale = new ScalesBase(jsBase + ".scale()");

        return getscale;
    }

    private ScalesBase scale;

    public void setScale(ScalesBase scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Fill selectEmptyFill;
    private String selectEmptyFill1;

    public void setSelectemptyfill(Fill selectEmptyFill) {
        if (jsBase == null) {
            this.selectEmptyFill = null;
            this.selectEmptyFill1 = null;
            
            this.selectEmptyFill = selectEmptyFill;
        } else {
            this.selectEmptyFill = selectEmptyFill;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyFill(%s);", (selectEmptyFill != null) ? selectEmptyFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyFill(%s);", (selectEmptyFill != null) ? selectEmptyFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectemptyfill(String selectEmptyFill1) {
        if (jsBase == null) {
            this.selectEmptyFill = null;
            this.selectEmptyFill1 = null;
            
            this.selectEmptyFill1 = selectEmptyFill1;
        } else {
            this.selectEmptyFill1 = selectEmptyFill1;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyFill(%s);", selectEmptyFill1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyFill(%s);", selectEmptyFill1));
                js.setLength(0);
            }
        }
    }

    private String color12;
    private Double opacity8;

    public void setSelectemptyfill(String color12, Double opacity8) {
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
            
            this.opacity8 = opacity8;
        } else {
            this.color12 = color12;
            this.opacity8 = opacity8;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyFill(%s, %f);", color12, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyFill(%s, %f);", color12, opacity8));
                js.setLength(0);
            }
        }
    }

    private PatternFill getselectEmptyHatchFill;

    public PatternFill getSelectemptyhatchfill() {
        if (getselectEmptyHatchFill == null)
            getselectEmptyHatchFill = new PatternFill(jsBase + ".selectEmptyHatchFill()");

        return getselectEmptyHatchFill;
    }

    private PatternFill patternFillOrType20;
    private HatchFill patternFillOrType21;
    private HatchFillType patternFillOrType22;
    private String patternFillOrType23;
    private Boolean patternFillOrType24;
    private String color13;
    private Double thickness5;
    private Double size4;

    public void setSelectemptyhatchfill(PatternFill patternFillOrType20, String color13, Double thickness5, Double size4) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            
            this.patternFillOrType20 = patternFillOrType20;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrType20 = patternFillOrType20;
            this.color13 = color13;
            this.thickness5 = thickness5;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null", color13, thickness5, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null", color13, thickness5, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelectemptyhatchfill(HatchFill patternFillOrType21, String color13, Double thickness5, Double size4) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            
            this.patternFillOrType21 = patternFillOrType21;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrType21 = patternFillOrType21;
            this.color13 = color13;
            this.thickness5 = thickness5;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null", color13, thickness5, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null", color13, thickness5, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelectemptyhatchfill(HatchFillType patternFillOrType22, String color13, Double thickness5, Double size4) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            
            this.patternFillOrType22 = patternFillOrType22;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrType22 = patternFillOrType22;
            this.color13 = color13;
            this.thickness5 = thickness5;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null", color13, thickness5, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", (patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null", color13, thickness5, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelectemptyhatchfill(String patternFillOrType23, String color13, Double thickness5, Double size4) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            
            this.patternFillOrType23 = patternFillOrType23;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrType23 = patternFillOrType23;
            this.color13 = color13;
            this.thickness5 = thickness5;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", patternFillOrType23, color13, thickness5, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%s, %s, %f, %f);", patternFillOrType23, color13, thickness5, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelectemptyhatchfill(Boolean patternFillOrType24, String color13, Double thickness5, Double size4) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            
            this.patternFillOrType24 = patternFillOrType24;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrType24 = patternFillOrType24;
            this.color13 = color13;
            this.thickness5 = thickness5;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%b, %s, %f, %f);", patternFillOrType24, color13, thickness5, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectEmptyHatchFill(%b, %s, %f, %f);", patternFillOrType24, color13, thickness5, size4));
                js.setLength(0);
            }
        }
    }

    private Fill selectFill;

    public void setSelectfill(Fill selectFill) {
        if (jsBase == null) {
            this.selectFill = selectFill;
        } else {
            this.selectFill = selectFill;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color14;
    private Double opacity9;

    public void setSelectfill(String color14, Double opacity9) {
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
            
            this.opacity9 = opacity9;
        } else {
            this.color14 = color14;
            this.opacity9 = opacity9;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f);", color14, opacity9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f);", color14, opacity9));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity10;

    public void setSelectfill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] keys8, String mode10, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys9, Boolean mode8, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys9, VectorRect mode9, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys9, String mode10, Double angle2, Double opacity10) {
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
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity10));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity11;
    private Double fx2;
    private Double fy2;

    public void setSelectfill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity11, Double fx2, Double fy2) {
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
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
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
            this.opacity11 = opacity11;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity11, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity11, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity11, Double fx2, Double fy2) {
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
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
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
            this.opacity11 = opacity11;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity11, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity11, fx2, fy2));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings2;
    private PatternFill getselectHatchFill;

    public PatternFill getSelecthatchfill() {
        if (getselectHatchFill == null)
            getselectHatchFill = new PatternFill(jsBase + ".selectHatchFill()");

        return getselectHatchFill;
    }

    private PatternFill patternFillOrType25;
    private HatchFill patternFillOrType26;
    private HatchFillType patternFillOrType27;
    private String patternFillOrType28;
    private Boolean patternFillOrType29;
    private String color15;
    private Double thickness6;
    private Double size5;

    public void setSelecthatchfill(PatternFill patternFillOrType25, String color15, Double thickness6, Double size5) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            this.patternFillOrType25 = null;
            this.patternFillOrType26 = null;
            this.patternFillOrType27 = null;
            this.patternFillOrType28 = null;
            this.patternFillOrType29 = null;
            
            this.patternFillOrType25 = patternFillOrType25;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrType25 = patternFillOrType25;
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType25 != null) ? patternFillOrType25.generateJs() : "null", color15, thickness6, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType25 != null) ? patternFillOrType25.generateJs() : "null", color15, thickness6, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(HatchFill patternFillOrType26, String color15, Double thickness6, Double size5) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            this.patternFillOrType25 = null;
            this.patternFillOrType26 = null;
            this.patternFillOrType27 = null;
            this.patternFillOrType28 = null;
            this.patternFillOrType29 = null;
            
            this.patternFillOrType26 = patternFillOrType26;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrType26 = patternFillOrType26;
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType26 != null) ? patternFillOrType26.generateJs() : "null", color15, thickness6, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType26 != null) ? patternFillOrType26.generateJs() : "null", color15, thickness6, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(HatchFillType patternFillOrType27, String color15, Double thickness6, Double size5) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            this.patternFillOrType25 = null;
            this.patternFillOrType26 = null;
            this.patternFillOrType27 = null;
            this.patternFillOrType28 = null;
            this.patternFillOrType29 = null;
            
            this.patternFillOrType27 = patternFillOrType27;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrType27 = patternFillOrType27;
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType27 != null) ? patternFillOrType27.generateJs() : "null", color15, thickness6, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrType27 != null) ? patternFillOrType27.generateJs() : "null", color15, thickness6, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(String patternFillOrType28, String color15, Double thickness6, Double size5) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            this.patternFillOrType25 = null;
            this.patternFillOrType26 = null;
            this.patternFillOrType27 = null;
            this.patternFillOrType28 = null;
            this.patternFillOrType29 = null;
            
            this.patternFillOrType28 = patternFillOrType28;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrType28 = patternFillOrType28;
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", patternFillOrType28, color15, thickness6, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", patternFillOrType28, color15, thickness6, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(Boolean patternFillOrType29, String color15, Double thickness6, Double size5) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            this.patternFillOrType13 = null;
            this.patternFillOrType14 = null;
            this.patternFillOrType15 = null;
            this.patternFillOrType16 = null;
            this.patternFillOrType17 = null;
            this.patternFillOrType18 = null;
            this.patternFillOrType19 = null;
            this.patternFillOrType20 = null;
            this.patternFillOrType21 = null;
            this.patternFillOrType22 = null;
            this.patternFillOrType23 = null;
            this.patternFillOrType24 = null;
            this.patternFillOrType25 = null;
            this.patternFillOrType26 = null;
            this.patternFillOrType27 = null;
            this.patternFillOrType28 = null;
            this.patternFillOrType29 = null;
            
            this.patternFillOrType29 = patternFillOrType29;
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
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrType29 = patternFillOrType29;
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%b, %s, %f, %f);", patternFillOrType29, color15, thickness6, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%b, %s, %f, %f);", patternFillOrType29, color15, thickness6, size5));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getselectLabel;

    public UiLabelsFactory getSelectlabel() {
        if (getselectLabel == null)
            getselectLabel = new UiLabelsFactory(jsBase + ".selectLabel()");

        return getselectLabel;
    }

    private UiLabelsFactory selectLabel;
    private String selectLabel1;

    public void setSelectlabel(UiLabelsFactory selectLabel) {
        if (jsBase == null) {
            this.selectLabel = null;
            this.selectLabel1 = null;
            
            this.selectLabel = selectLabel;
        } else {
            this.selectLabel = selectLabel;

            js.append(String.format(Locale.US, jsBase + ".selectLabel(%s);", (selectLabel != null) ? selectLabel.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabel(%s);", (selectLabel != null) ? selectLabel.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectlabel(String selectLabel1) {
        if (jsBase == null) {
            this.selectLabel = null;
            this.selectLabel1 = null;
            
            this.selectLabel1 = selectLabel1;
        } else {
            this.selectLabel1 = selectLabel1;

            js.append(String.format(Locale.US, jsBase + ".selectLabel(%s);", selectLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabel(%s);", selectLabel1));
                js.setLength(0);
            }
        }
    }

    private Stroke color16;
    private ColoredFill color17;
    private String color18;
    private Double thickness7;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setSelectstroke(Stroke color16, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            this.color17 = null;
            this.color18 = null;
            
            this.color16 = color16;
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
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color16 = color16;
            this.thickness7 = thickness7;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(ColoredFill color17, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            this.color17 = null;
            this.color18 = null;
            
            this.color17 = color17;
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
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color17 = color17;
            this.thickness7 = thickness7;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color17 != null) ? color17.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color17 != null) ? color17.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(String color18, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            this.color17 = null;
            this.color18 = null;
            
            this.color18 = color18;
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
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color18 = color18;
            this.thickness7 = thickness7;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color18, thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color18, thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke;

    public void setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = stroke;
        } else {
            this.stroke = stroke;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke color19;
    private ColoredFill color20;
    private String color21;
    private Double thickness8;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setStroke(Stroke color19, Double thickness8, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
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
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color19 = color19;
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
            this.color19 = color19;
            this.thickness8 = thickness8;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color19 != null) ? color19.generateJs() : "null", thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color19 != null) ? color19.generateJs() : "null", thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill color20, Double thickness8, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
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
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color20 = color20;
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
            this.color20 = color20;
            this.thickness8 = thickness8;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color20 != null) ? color20.generateJs() : "null", thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color20 != null) ? color20.generateJs() : "null", thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String color21, Double thickness8, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
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
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
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
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color21, thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color21, thickness8, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
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

    private String width;

    public void setWidth(String width) {
        if (jsBase == null) {
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width));
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

    private String generateJSgetemptyHatchFill() {
        if (getemptyHatchFill != null) {
            return getemptyHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgethatchFill() {
        if (gethatchFill != null) {
            return gethatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgethoverEmptyHatchFill() {
        if (gethoverEmptyHatchFill != null) {
            return gethoverEmptyHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgethoverHatchFill() {
        if (gethoverHatchFill != null) {
            return gethoverHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgethoverLabel() {
        if (gethoverLabel != null) {
            return gethoverLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetlabel() {
        if (getlabel != null) {
            return getlabel.generateJs();
        }
        return "";
    }

    private String generateJSgetlegendItem() {
        if (getlegendItem != null) {
            return getlegendItem.generateJs();
        }
        return "";
    }

    private String generateJSgetscale() {
        if (getscale != null) {
            return getscale.generateJs();
        }
        return "";
    }

    private String generateJSgetselectEmptyHatchFill() {
        if (getselectEmptyHatchFill != null) {
            return getselectEmptyHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetselectHatchFill() {
        if (getselectHatchFill != null) {
            return getselectHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetselectLabel() {
        if (getselectLabel != null) {
            return getselectLabel.generateJs();
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSemptyFill() {
        if (emptyFill != null) {
            return String.format(Locale.US, "emptyFill: %s,", (emptyFill != null) ? emptyFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSemptyFill1() {
        if (emptyFill1 != null) {
            return String.format(Locale.US, "emptyFill: %s,", emptyFill1);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
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

    private String generateJSpatternFillOrType4() {
        if (patternFillOrType4 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType4);
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
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

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
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

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
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

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
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

    private String generateJSpatternFillOrType5() {
        if (patternFillOrType5 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType6() {
        if (patternFillOrType6 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType7() {
        if (patternFillOrType7 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType8() {
        if (patternFillOrType8 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType8);
        }
        return "";
    }

    private String generateJSpatternFillOrType9() {
        if (patternFillOrType9 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType9);
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

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }

    private String generateJShoverEmptyFill() {
        if (hoverEmptyFill != null) {
            return String.format(Locale.US, "hoverEmptyFill: %s,", (hoverEmptyFill != null) ? hoverEmptyFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverEmptyFill1() {
        if (hoverEmptyFill1 != null) {
            return String.format(Locale.US, "hoverEmptyFill: %s,", hoverEmptyFill1);
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", color5);
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSpatternFillOrType10() {
        if (patternFillOrType10 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType11() {
        if (patternFillOrType11 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType12() {
        if (patternFillOrType12 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType13() {
        if (patternFillOrType13 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType13);
        }
        return "";
    }

    private String generateJSpatternFillOrType14() {
        if (patternFillOrType14 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType14);
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", color6);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSsize2() {
        if (size2 != null) {
            return String.format(Locale.US, "size: %f,", size2);
        }
        return "";
    }

    private String generateJShoverFill() {
        if (hoverFill != null) {
            return String.format(Locale.US, "hoverFill: %s,", (hoverFill != null) ? hoverFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", color7);
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %b,", mode4);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %s,", mode6);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
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

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType15() {
        if (patternFillOrType15 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType15 != null) ? patternFillOrType15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType16() {
        if (patternFillOrType16 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType17() {
        if (patternFillOrType17 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType18() {
        if (patternFillOrType18 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType18);
        }
        return "";
    }

    private String generateJSpatternFillOrType19() {
        if (patternFillOrType19 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType19);
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", color8);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSsize3() {
        if (size3 != null) {
            return String.format(Locale.US, "size: %f,", size3);
        }
        return "";
    }

    private String generateJShoverLabel() {
        if (hoverLabel != null) {
            return String.format(Locale.US, "hoverLabel: %s,", (hoverLabel != null) ? hoverLabel.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverLabel1() {
        if (hoverLabel1 != null) {
            return String.format(Locale.US, "hoverLabel: %s,", hoverLabel1);
        }
        return "";
    }

    private String generateJShoverLabel2() {
        if (hoverLabel2 != null) {
            return String.format(Locale.US, "hoverLabel: %b,", hoverLabel2);
        }
        return "";
    }

    private String generateJShoverStroke() {
        if (hoverStroke != null) {
            return String.format(Locale.US, "hoverStroke: %s,", (hoverStroke != null) ? hoverStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", (color9 != null) ? color9.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", (color10 != null) ? color10.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", color11);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
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

    private String generateJSlabel() {
        if (label != null) {
            return String.format(Locale.US, "label: %s,", (label != null) ? label.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlabel1() {
        if (label1 != null) {
            return String.format(Locale.US, "label: %s,", label1);
        }
        return "";
    }

    private String generateJSlabel2() {
        if (label2 != null) {
            return String.format(Locale.US, "label: %b,", label2);
        }
        return "";
    }

    private String generateJSlegendItem() {
        if (legendItem != null) {
            return String.format(Locale.US, "legendItem: %s,", legendItem);
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

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSoffset() {
        if (offset != null) {
            return String.format(Locale.US, "offset: %s,", offset);
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

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectEmptyFill() {
        if (selectEmptyFill != null) {
            return String.format(Locale.US, "selectEmptyFill: %s,", (selectEmptyFill != null) ? selectEmptyFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectEmptyFill1() {
        if (selectEmptyFill1 != null) {
            return String.format(Locale.US, "selectEmptyFill: %s,", selectEmptyFill1);
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", color12);
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSpatternFillOrType20() {
        if (patternFillOrType20 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType21() {
        if (patternFillOrType21 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType22() {
        if (patternFillOrType22 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType23() {
        if (patternFillOrType23 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType23);
        }
        return "";
    }

    private String generateJSpatternFillOrType24() {
        if (patternFillOrType24 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType24);
        }
        return "";
    }

    private String generateJScolor13() {
        if (color13 != null) {
            return String.format(Locale.US, "color: %s,", color13);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSsize4() {
        if (size4 != null) {
            return String.format(Locale.US, "size: %f,", size4);
        }
        return "";
    }

    private String generateJSselectFill() {
        if (selectFill != null) {
            return String.format(Locale.US, "selectFill: %s,", (selectFill != null) ? selectFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor14() {
        if (color14 != null) {
            return String.format(Locale.US, "color: %s,", color14);
        }
        return "";
    }

    private String generateJSopacity9() {
        if (opacity9 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity9);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %b,", mode8);
        }
        return "";
    }

    private String generateJSmode9() {
        if (mode9 != null) {
            return String.format(Locale.US, "mode: %s,", (mode9 != null) ? mode9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode10() {
        if (mode10 != null) {
            return String.format(Locale.US, "mode: %s,", mode10);
        }
        return "";
    }

    private String generateJSopacity10() {
        if (opacity10 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity10);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity11() {
        if (opacity11 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity11);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType25() {
        if (patternFillOrType25 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType25 != null) ? patternFillOrType25.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType26() {
        if (patternFillOrType26 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType26 != null) ? patternFillOrType26.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType27() {
        if (patternFillOrType27 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType27 != null) ? patternFillOrType27.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType28() {
        if (patternFillOrType28 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType28);
        }
        return "";
    }

    private String generateJSpatternFillOrType29() {
        if (patternFillOrType29 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType29);
        }
        return "";
    }

    private String generateJScolor15() {
        if (color15 != null) {
            return String.format(Locale.US, "color: %s,", color15);
        }
        return "";
    }

    private String generateJSthickness6() {
        if (thickness6 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness6);
        }
        return "";
    }

    private String generateJSsize5() {
        if (size5 != null) {
            return String.format(Locale.US, "size: %f,", size5);
        }
        return "";
    }

    private String generateJSselectLabel() {
        if (selectLabel != null) {
            return String.format(Locale.US, "selectLabel: %s,", (selectLabel != null) ? selectLabel.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectLabel1() {
        if (selectLabel1 != null) {
            return String.format(Locale.US, "selectLabel: %s,", selectLabel1);
        }
        return "";
    }

    private String generateJScolor16() {
        if (color16 != null) {
            return String.format(Locale.US, "color: %s,", (color16 != null) ? color16.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor17() {
        if (color17 != null) {
            return String.format(Locale.US, "color: %s,", (color17 != null) ? color17.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor18() {
        if (color18 != null) {
            return String.format(Locale.US, "color: %s,", color18);
        }
        return "";
    }

    private String generateJSthickness7() {
        if (thickness7 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness7);
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

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor19() {
        if (color19 != null) {
            return String.format(Locale.US, "color: %s,", (color19 != null) ? color19.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor20() {
        if (color20 != null) {
            return String.format(Locale.US, "color: %s,", (color20 != null) ? color20.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor21() {
        if (color21 != null) {
            return String.format(Locale.US, "color: %s,", color21);
        }
        return "";
    }

    private String generateJSthickness8() {
        if (thickness8 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness8);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
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

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %s,", width);
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
            js.append(generateJScolor());
            js.append(generateJSindex());
            js.append(generateJSemptyFill());
            js.append(generateJSemptyFill1());
            js.append(generateJScolor1());
            js.append(generateJSopacity());
            js.append(generateJSpatternFillOrType());
            js.append(generateJSpatternFillOrType1());
            js.append(generateJSpatternFillOrType2());
            js.append(generateJSpatternFillOrType3());
            js.append(generateJSpatternFillOrType4());
            js.append(generateJScolor2());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSenabled());
            js.append(generateJSfill());
            js.append(generateJScolor3());
            js.append(generateJSopacity1());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity2());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity3());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJSpatternFillOrType5());
            js.append(generateJSpatternFillOrType6());
            js.append(generateJSpatternFillOrType7());
            js.append(generateJSpatternFillOrType8());
            js.append(generateJSpatternFillOrType9());
            js.append(generateJScolor4());
            js.append(generateJSthickness1());
            js.append(generateJSsize1());
            js.append(generateJShoverEmptyFill());
            js.append(generateJShoverEmptyFill1());
            js.append(generateJScolor5());
            js.append(generateJSopacity4());
            js.append(generateJSpatternFillOrType10());
            js.append(generateJSpatternFillOrType11());
            js.append(generateJSpatternFillOrType12());
            js.append(generateJSpatternFillOrType13());
            js.append(generateJSpatternFillOrType14());
            js.append(generateJScolor6());
            js.append(generateJSthickness2());
            js.append(generateJSsize2());
            js.append(generateJShoverFill());
            js.append(generateJScolor7());
            js.append(generateJSopacity5());
            js.append(generateJSkeys4());
            js.append(generateJSkeys5());
            js.append(generateJSangle1());
            js.append(generateJSmode4());
            js.append(generateJSmode5());
            js.append(generateJSmode6());
            js.append(generateJSopacity6());
            js.append(generateJSkeys6());
            js.append(generateJSkeys7());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSmode7());
            js.append(generateJSopacity7());
            js.append(generateJSfx1());
            js.append(generateJSfy1());
            js.append(generateJSimageSettings1());
            js.append(generateJSpatternFillOrType15());
            js.append(generateJSpatternFillOrType16());
            js.append(generateJSpatternFillOrType17());
            js.append(generateJSpatternFillOrType18());
            js.append(generateJSpatternFillOrType19());
            js.append(generateJScolor8());
            js.append(generateJSthickness3());
            js.append(generateJSsize3());
            js.append(generateJShoverLabel());
            js.append(generateJShoverLabel1());
            js.append(generateJShoverLabel2());
            js.append(generateJShoverStroke());
            js.append(generateJScolor9());
            js.append(generateJScolor10());
            js.append(generateJScolor11());
            js.append(generateJSthickness4());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSlabel());
            js.append(generateJSlabel1());
            js.append(generateJSlabel2());
            js.append(generateJSlegendItem());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSname());
            js.append(generateJSoffset());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSscale());
            js.append(generateJSselectEmptyFill());
            js.append(generateJSselectEmptyFill1());
            js.append(generateJScolor12());
            js.append(generateJSopacity8());
            js.append(generateJSpatternFillOrType20());
            js.append(generateJSpatternFillOrType21());
            js.append(generateJSpatternFillOrType22());
            js.append(generateJSpatternFillOrType23());
            js.append(generateJSpatternFillOrType24());
            js.append(generateJScolor13());
            js.append(generateJSthickness5());
            js.append(generateJSsize4());
            js.append(generateJSselectFill());
            js.append(generateJScolor14());
            js.append(generateJSopacity9());
            js.append(generateJSkeys8());
            js.append(generateJSkeys9());
            js.append(generateJSangle2());
            js.append(generateJSmode8());
            js.append(generateJSmode9());
            js.append(generateJSmode10());
            js.append(generateJSopacity10());
            js.append(generateJSkeys10());
            js.append(generateJSkeys11());
            js.append(generateJScx2());
            js.append(generateJScy2());
            js.append(generateJSmode11());
            js.append(generateJSopacity11());
            js.append(generateJSfx2());
            js.append(generateJSfy2());
            js.append(generateJSimageSettings2());
            js.append(generateJSpatternFillOrType25());
            js.append(generateJSpatternFillOrType26());
            js.append(generateJSpatternFillOrType27());
            js.append(generateJSpatternFillOrType28());
            js.append(generateJSpatternFillOrType29());
            js.append(generateJScolor15());
            js.append(generateJSthickness6());
            js.append(generateJSsize5());
            js.append(generateJSselectLabel());
            js.append(generateJSselectLabel1());
            js.append(generateJScolor16());
            js.append(generateJScolor17());
            js.append(generateJScolor18());
            js.append(generateJSthickness7());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSstroke());
            js.append(generateJScolor19());
            js.append(generateJScolor20());
            js.append(generateJScolor21());
            js.append(generateJSthickness8());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSwidth());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetemptyHatchFill());
            js.append(generateJSgethatchFill());
            js.append(generateJSgethoverEmptyHatchFill());
            js.append(generateJSgethoverHatchFill());
            js.append(generateJSgethoverLabel());
            js.append(generateJSgetlabel());
            js.append(generateJSgetlegendItem());
            js.append(generateJSgetscale());
            js.append(generateJSgetselectEmptyHatchFill());
            js.append(generateJSgetselectHatchFill());
            js.append(generateJSgetselectLabel());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Circular extends JsObject {

    private String jsBase;

    public Circular() {

    }

    protected Circular(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double cornersRounding;
    private String cornersRounding1;

    public void setCornersrounding(Double cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;

            js.append(String.format(Locale.US, jsBase + ".cornersRounding(%f);", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%f);", cornersRounding));
                js.setLength(0);
            }
        }
    }


    public void setCornersrounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;

            js.append(String.format(Locale.US, jsBase + ".cornersRounding(%s);", cornersRounding1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%s);", cornersRounding1));
                js.setLength(0);
            }
        }
    }

    private Boolean drawFirstLabel;

    public void setDrawfirstlabel(Boolean drawFirstLabel) {
        if (jsBase == null) {
            this.drawFirstLabel = drawFirstLabel;
        } else {
            this.drawFirstLabel = drawFirstLabel;

            js.append(String.format(Locale.US, jsBase + ".drawFirstLabel(%b);", drawFirstLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawFirstLabel(%b);", drawFirstLabel));
                js.setLength(0);
            }
        }
    }

    private Boolean drawLastLabel;

    public void setDrawlastlabel(Boolean drawLastLabel) {
        if (jsBase == null) {
            this.drawLastLabel = drawLastLabel;
        } else {
            this.drawLastLabel = drawLastLabel;

            js.append(String.format(Locale.US, jsBase + ".drawLastLabel(%b);", drawLastLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawLastLabel(%b);", drawLastLabel));
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
    private String fill1;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
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


    public void setFill(String fill1) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill1 = fill1;
        } else {
            this.fill1 = fill1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", fill1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", fill1));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));
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

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
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

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private UiLabelsFactory getlabels;

    public UiLabelsFactory getLabels() {
        if (getlabels == null)
            getlabels = new UiLabelsFactory(jsBase + ".labels()");

        return getlabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;

            js.append(String.format(Locale.US, jsBase + ".labels(%s);", labels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", labels));
                js.setLength(0);
            }
        }
    }


    public void setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;

            js.append(String.format(Locale.US, jsBase + ".labels(%b);", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
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

    private UiLabelsFactory getminorLabels;

    public UiLabelsFactory getMinorlabels() {
        if (getminorLabels == null)
            getminorLabels = new UiLabelsFactory(jsBase + ".minorLabels()");

        return getminorLabels;
    }

    private String minorLabels;
    private Boolean minorLabels1;

    public void setMinorlabels(String minorLabels) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels = minorLabels;
        } else {
            this.minorLabels = minorLabels;

            js.append(String.format(Locale.US, jsBase + ".minorLabels(%s);", minorLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorLabels(%s);", minorLabels));
                js.setLength(0);
            }
        }
    }


    public void setMinorlabels(Boolean minorLabels1) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels1 = minorLabels1;
        } else {
            this.minorLabels1 = minorLabels1;

            js.append(String.format(Locale.US, jsBase + ".minorLabels(%b);", minorLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorLabels(%b);", minorLabels1));
                js.setLength(0);
            }
        }
    }

    private CircularTicks getminorTicks;

    public CircularTicks getMinorticks() {
        if (getminorTicks == null)
            getminorTicks = new CircularTicks(jsBase + ".minorTicks()");

        return getminorTicks;
    }

    private String minorTicks;
    private Boolean minorTicks1;

    public void setMinorticks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;

            js.append(String.format(Locale.US, jsBase + ".minorTicks(%s);", minorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", minorTicks));
                js.setLength(0);
            }
        }
    }


    public void setMinorticks(Boolean minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;

            js.append(String.format(Locale.US, jsBase + ".minorTicks(%b);", minorTicks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%b);", minorTicks1));
                js.setLength(0);
            }
        }
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode = overlapMode;
        } else {
            this.overlapMode = overlapMode;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setOverlapmode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode1 = overlapMode1;
        } else {
            this.overlapMode1 = overlapMode1;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%s);", overlapMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", overlapMode1));
                js.setLength(0);
            }
        }
    }


    public void setOverlapmode(Boolean overlapMode2) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode2 = overlapMode2;
        } else {
            this.overlapMode2 = overlapMode2;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%b);", overlapMode2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%b);", overlapMode2));
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

    private Double radius;
    private String radius1;

    public void setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;

            js.append(String.format(Locale.US, jsBase + ".radius(%f);", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%f);", radius));
                js.setLength(0);
            }
        }
    }


    public void setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;

            js.append(String.format(Locale.US, jsBase + ".radius(%s);", radius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%s);", radius1));
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

    private ScalesLinear getscale;

    public ScalesLinear getScale() {
        if (getscale == null)
            getscale = new ScalesLinear(jsBase + ".scale()");

        return getscale;
    }

    private GaugeScaleTypes scale;
    private ScalesLinear scale1;
    private Logarithmic scale2;
    private String scale3;

    public void setScale(GaugeScaleTypes scale) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
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


    public void setScale(ScalesLinear scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale1 != null) ? scale1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale1 != null) ? scale1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setScale(Logarithmic scale2) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale2 = scale2;
        } else {
            this.scale2 = scale2;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale2 != null) ? scale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale2 != null) ? scale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setScale(String scale3) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale3 = scale3;
        } else {
            this.scale3 = scale3;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", scale3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", scale3));
                js.setLength(0);
            }
        }
    }

    private String startAngle;
    private Double startAngle1;

    public void setStartangle(String startAngle) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle = startAngle;
        } else {
            this.startAngle = startAngle;

            js.append(String.format(Locale.US, jsBase + ".startAngle(%s);", startAngle));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%s);", startAngle));
                js.setLength(0);
            }
        }
    }


    public void setStartangle(Double startAngle1) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle1 = startAngle1;
        } else {
            this.startAngle1 = startAngle1;

            js.append(String.format(Locale.US, jsBase + ".startAngle(%f);", startAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%f);", startAngle1));
                js.setLength(0);
            }
        }
    }

    private String sweepAngle;
    private Double sweepAngle1;

    public void setSweepangle(String sweepAngle) {
        if (jsBase == null) {
            this.sweepAngle = null;
            this.sweepAngle1 = null;
            
            this.sweepAngle = sweepAngle;
        } else {
            this.sweepAngle = sweepAngle;

            js.append(String.format(Locale.US, jsBase + ".sweepAngle(%s);", sweepAngle));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sweepAngle(%s);", sweepAngle));
                js.setLength(0);
            }
        }
    }


    public void setSweepangle(Double sweepAngle1) {
        if (jsBase == null) {
            this.sweepAngle = null;
            this.sweepAngle1 = null;
            
            this.sweepAngle1 = sweepAngle1;
        } else {
            this.sweepAngle1 = sweepAngle1;

            js.append(String.format(Locale.US, jsBase + ".sweepAngle(%f);", sweepAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sweepAngle(%f);", sweepAngle1));
                js.setLength(0);
            }
        }
    }

    private CircularTicks getticks;

    public CircularTicks getTicks() {
        if (getticks == null)
            getticks = new CircularTicks(jsBase + ".ticks()");

        return getticks;
    }

    private String ticks;
    private Boolean ticks1;

    public void setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

            js.append(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));
                js.setLength(0);
            }
        }
    }


    public void setTicks(Boolean ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;

            js.append(String.format(Locale.US, jsBase + ".ticks(%b);", ticks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%b);", ticks1));
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

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
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

    private String generateJSgetlabels() {
        if (getlabels != null) {
            return getlabels.generateJs();
        }
        return "";
    }

    private String generateJSgetminorLabels() {
        if (getminorLabels != null) {
            return getminorLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetminorTicks() {
        if (getminorTicks != null) {
            return getminorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetscale() {
        if (getscale != null) {
            return getscale.generateJs();
        }
        return "";
    }

    private String generateJSgetticks() {
        if (getticks != null) {
            return getticks.generateJs();
        }
        return "";
    }

    private String generateJScornersRounding() {
        if (cornersRounding != null) {
            return String.format(Locale.US, "cornersRounding: %f,", cornersRounding);
        }
        return "";
    }

    private String generateJScornersRounding1() {
        if (cornersRounding1 != null) {
            return String.format(Locale.US, "cornersRounding: %s,", cornersRounding1);
        }
        return "";
    }

    private String generateJSdrawFirstLabel() {
        if (drawFirstLabel != null) {
            return String.format(Locale.US, "drawFirstLabel: %b,", drawFirstLabel);
        }
        return "";
    }

    private String generateJSdrawLastLabel() {
        if (drawLastLabel != null) {
            return String.format(Locale.US, "drawLastLabel: %b,", drawLastLabel);
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

    private String generateJSfill1() {
        if (fill1 != null) {
            return String.format(Locale.US, "fill: %s,", fill1);
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

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %s,", labels);
        }
        return "";
    }

    private String generateJSlabels1() {
        if (labels1 != null) {
            return String.format(Locale.US, "labels: %b,", labels1);
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

    private String generateJSminorLabels() {
        if (minorLabels != null) {
            return String.format(Locale.US, "minorLabels: %s,", minorLabels);
        }
        return "";
    }

    private String generateJSminorLabels1() {
        if (minorLabels1 != null) {
            return String.format(Locale.US, "minorLabels: %b,", minorLabels1);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %s,", minorTicks);
        }
        return "";
    }

    private String generateJSminorTicks1() {
        if (minorTicks1 != null) {
            return String.format(Locale.US, "minorTicks: %b,", minorTicks1);
        }
        return "";
    }

    private String generateJSoverlapMode() {
        if (overlapMode != null) {
            return String.format(Locale.US, "overlapMode: %s,", (overlapMode != null) ? overlapMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode1() {
        if (overlapMode1 != null) {
            return String.format(Locale.US, "overlapMode: %s,", overlapMode1);
        }
        return "";
    }

    private String generateJSoverlapMode2() {
        if (overlapMode2 != null) {
            return String.format(Locale.US, "overlapMode: %b,", overlapMode2);
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

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSradius1() {
        if (radius1 != null) {
            return String.format(Locale.US, "radius: %s,", radius1);
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

    private String generateJSscale1() {
        if (scale1 != null) {
            return String.format(Locale.US, "scale: %s,", (scale1 != null) ? scale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale2() {
        if (scale2 != null) {
            return String.format(Locale.US, "scale: %s,", (scale2 != null) ? scale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale3() {
        if (scale3 != null) {
            return String.format(Locale.US, "scale: %s,", scale3);
        }
        return "";
    }

    private String generateJSstartAngle() {
        if (startAngle != null) {
            return String.format(Locale.US, "startAngle: %s,", startAngle);
        }
        return "";
    }

    private String generateJSstartAngle1() {
        if (startAngle1 != null) {
            return String.format(Locale.US, "startAngle: %f,", startAngle1);
        }
        return "";
    }

    private String generateJSsweepAngle() {
        if (sweepAngle != null) {
            return String.format(Locale.US, "sweepAngle: %s,", sweepAngle);
        }
        return "";
    }

    private String generateJSsweepAngle1() {
        if (sweepAngle1 != null) {
            return String.format(Locale.US, "sweepAngle: %f,", sweepAngle1);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", ticks);
        }
        return "";
    }

    private String generateJSticks1() {
        if (ticks1 != null) {
            return String.format(Locale.US, "ticks: %b,", ticks1);
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
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
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
            js.append(generateJScornersRounding());
            js.append(generateJScornersRounding1());
            js.append(generateJSdrawFirstLabel());
            js.append(generateJSdrawLastLabel());
            js.append(generateJSenabled());
            js.append(generateJSfill());
            js.append(generateJSfill1());
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
            js.append(generateJSlabels());
            js.append(generateJSlabels1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSminorLabels());
            js.append(generateJSminorLabels1());
            js.append(generateJSminorTicks());
            js.append(generateJSminorTicks1());
            js.append(generateJSoverlapMode());
            js.append(generateJSoverlapMode1());
            js.append(generateJSoverlapMode2());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJSradius());
            js.append(generateJSradius1());
            js.append(generateJStype2());
            js.append(generateJSscale());
            js.append(generateJSscale1());
            js.append(generateJSscale2());
            js.append(generateJSscale3());
            js.append(generateJSstartAngle());
            js.append(generateJSstartAngle1());
            js.append(generateJSsweepAngle());
            js.append(generateJSsweepAngle1());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetlabels());
            js.append(generateJSgetminorLabels());
            js.append(generateJSgetminorTicks());
            js.append(generateJSgetscale());
            js.append(generateJSgetticks());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
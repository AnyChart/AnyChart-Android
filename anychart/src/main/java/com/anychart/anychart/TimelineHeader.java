package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TimelineHeader extends VisualBaseWithBounds {

    public TimelineHeader() {

    }

    protected TimelineHeader(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TimelineHeader(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Fill backgroundFill;

    public TimelineHeader setBackgroundFill(Fill backgroundFill) {
        if (jsBase == null) {
            this.backgroundFill = backgroundFill;
        } else {
            this.backgroundFill = backgroundFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".backgroundFill(%s)", (backgroundFill != null) ? backgroundFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s)", (backgroundFill != null) ? backgroundFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Double opacity;

    public TimelineHeader backgroundFill(String color, Double opacity) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %f)", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f)", color, opacity));
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

    public TimelineHeader backgroundFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public TimelineHeader backgroundFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader backgroundFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader backgroundFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader backgroundFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader backgroundFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
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

    public TimelineHeader backgroundFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader backgroundFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private Stroke levelsSeparationStroke;
    private String levelsSeparationStroke1;

    public TimelineHeader setLevelsSeparationStroke(Stroke levelsSeparationStroke) {
        if (jsBase == null) {
            this.levelsSeparationStroke = null;
            this.levelsSeparationStroke1 = null;
            
            this.levelsSeparationStroke = levelsSeparationStroke;
        } else {
            this.levelsSeparationStroke = levelsSeparationStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".levelsSeparationStroke(%s)", (levelsSeparationStroke != null) ? levelsSeparationStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelsSeparationStroke(%s)", (levelsSeparationStroke != null) ? levelsSeparationStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader setLevelsSeparationStroke(String levelsSeparationStroke1) {
        if (jsBase == null) {
            this.levelsSeparationStroke = null;
            this.levelsSeparationStroke1 = null;
            
            this.levelsSeparationStroke1 = levelsSeparationStroke1;
        } else {
            this.levelsSeparationStroke1 = levelsSeparationStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".levelsSeparationStroke(%s)", levelsSeparationStroke1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelsSeparationStroke(%s)", levelsSeparationStroke1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TimelineHeader getLowLevel;

    public TimelineHeader getLowLevel() {
        if (getLowLevel == null)
            getLowLevel = new TimelineHeader(jsBase + ".lowLevel()");

        return getLowLevel;
    }

    private String midLevel;
    private Boolean midLevel1;

    public TimelineHeader setMidLevel(String midLevel) {
        if (jsBase == null) {
            this.midLevel = null;
            this.midLevel1 = null;
            
            this.midLevel = midLevel;
        } else {
            this.midLevel = midLevel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".midLevel(%s)", midLevel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".midLevel(%s)", midLevel));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader setMidLevel(Boolean midLevel1) {
        if (jsBase == null) {
            this.midLevel = null;
            this.midLevel1 = null;
            
            this.midLevel1 = midLevel1;
        } else {
            this.midLevel1 = midLevel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".midLevel(%b)", midLevel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".midLevel(%b)", midLevel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String topLevel;
    private Boolean topLevel1;

    public TimelineHeader setTopLevel(String topLevel) {
        if (jsBase == null) {
            this.topLevel = null;
            this.topLevel1 = null;
            
            this.topLevel = topLevel;
        } else {
            this.topLevel = topLevel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".topLevel(%s)", topLevel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topLevel(%s)", topLevel));
                js.setLength(0);
            }
        }
        return this;
    }


    public TimelineHeader setTopLevel(Boolean topLevel1) {
        if (jsBase == null) {
            this.topLevel = null;
            this.topLevel1 = null;
            
            this.topLevel1 = topLevel1;
        } else {
            this.topLevel1 = topLevel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".topLevel(%b)", topLevel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topLevel(%b)", topLevel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLowLevel() {
        if (getLowLevel != null) {
            return getLowLevel.generateJs();
        }
        return "";
    }

    private String generateJSbackgroundFill() {
        if (backgroundFill != null) {
            return String.format(Locale.US, "backgroundFill: %s,", (backgroundFill != null) ? backgroundFill.generateJs() : "null");
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

    private String generateJSlevelsSeparationStroke() {
        if (levelsSeparationStroke != null) {
            return String.format(Locale.US, "levelsSeparationStroke: %s,", (levelsSeparationStroke != null) ? levelsSeparationStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlevelsSeparationStroke1() {
        if (levelsSeparationStroke1 != null) {
            return String.format(Locale.US, "levelsSeparationStroke: %s,", levelsSeparationStroke1);
        }
        return "";
    }

    private String generateJSmidLevel() {
        if (midLevel != null) {
            return String.format(Locale.US, "midLevel: %s,", midLevel);
        }
        return "";
    }

    private String generateJSmidLevel1() {
        if (midLevel1 != null) {
            return String.format(Locale.US, "midLevel: %b,", midLevel1);
        }
        return "";
    }

    private String generateJStopLevel() {
        if (topLevel != null) {
            return String.format(Locale.US, "topLevel: %s,", topLevel);
        }
        return "";
    }

    private String generateJStopLevel1() {
        if (topLevel1 != null) {
            return String.format(Locale.US, "topLevel: %b,", topLevel1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLowLevel());

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
            js.append(generateJSbackgroundFill());
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
            js.append(generateJSlevelsSeparationStroke());
            js.append(generateJSlevelsSeparationStroke1());
            js.append(generateJSmidLevel());
            js.append(generateJSmidLevel1());
            js.append(generateJStopLevel());
            js.append(generateJStopLevel1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * 3D Area Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian3d#area3d} method to get this series.<br/>
{docs:Basic_Charts/3D/Area_Chart}Learn more about 3D Area series{docs}
 */
public class Area3d extends CartesianSeriesContinuousBase {

    public Area3d() {
        js.setLength(0);
        js.append("var area3d").append(++variableIndex).append(" = anychart.core.cartesian.series.area3d();");
        jsBase = "area3d" + variableIndex;
    }

    protected Area3d(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Area3d(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
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
    private String color;
    private Number thickness;
    private Number size;

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Area3d setHatchFill(PatternFill patternFillOrType, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Area3d setHatchFill(HatchFill patternFillOrType1, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType1.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Area3d setHatchFill(HatchFillType patternFillOrType2, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Area3d setHatchFill(String patternFillOrType3, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", wrapQuotes(patternFillOrType3), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrType3), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Number thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Area3d setStroke(Stroke color1, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public Area3d setStroke(String json) {
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
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Area3d setStroke(ColoredFill color2, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
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
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Area3d setStroke(String color3, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
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
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color3), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color3), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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
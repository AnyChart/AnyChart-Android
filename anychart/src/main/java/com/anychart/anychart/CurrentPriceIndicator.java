package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CurrentPriceIndicator extends VisualBase {

    public CurrentPriceIndicator() {

    }

    protected CurrentPriceIndicator(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CurrentPriceIndicator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private CoreAxesLinear getAxis;

    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }

    private Double axis;
    private CoreAxesLinear axis1;

    public CurrentPriceIndicator setAxis(Double axis) {
        if (jsBase == null) {
            this.axis = null;
            this.axis1 = null;
            
            this.axis = axis;
        } else {
            this.axis = axis;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".axis(%f)", axis));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axis(%f)", axis));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setAxis(CoreAxesLinear axis1) {
        if (jsBase == null) {
            this.axis = null;
            this.axis1 = null;
            
            this.axis1 = axis1;
        } else {
            this.axis1 = axis1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".axis(%s)", (axis1 != null) ? axis1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axis(%s)", (axis1 != null) ? axis1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabel getFallingLabel;

    public UiLabel getFallingLabel() {
        if (getFallingLabel == null)
            getFallingLabel = new UiLabel(jsBase + ".fallingLabel()");

        return getFallingLabel;
    }

    private String index;
    private Double index1;
    private Boolean fallingLabel;
    private String fallingLabel1;

    public CurrentPriceIndicator setFallingLabel(String index, Boolean fallingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel = fallingLabel;
        } else {
            this.index = index;
            this.fallingLabel = fallingLabel;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingLabel(%s, %b)", index, fallingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%s, %b)", index, fallingLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setFallingLabel(String index, String fallingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel1 = fallingLabel1;
        } else {
            this.index = index;
            this.fallingLabel1 = fallingLabel1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingLabel(%s, %s)", index, fallingLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%s, %s)", index, fallingLabel1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setFallingLabel(Double index1, Boolean fallingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel = fallingLabel;
        } else {
            this.index1 = index1;
            this.fallingLabel = fallingLabel;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingLabel(%f, %b)", index1, fallingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%f, %b)", index1, fallingLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setFallingLabel(Double index1, String fallingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel1 = fallingLabel1;
        } else {
            this.index1 = index1;
            this.fallingLabel1 = fallingLabel1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingLabel(%f, %s)", index1, fallingLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%f, %s)", index1, fallingLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke fallingStroke;
    private ColoredFill fallingStroke1;
    private String fallingStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public CurrentPriceIndicator setFallingStroke(Stroke fallingStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", (fallingStroke != null) ? fallingStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", (fallingStroke != null) ? fallingStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setFallingStroke(ColoredFill fallingStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", (fallingStroke1 != null) ? fallingStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", (fallingStroke1 != null) ? fallingStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setFallingStroke(String fallingStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", fallingStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", fallingStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabel getLabel;

    public UiLabel getLabel() {
        if (getLabel == null)
            getLabel = new UiLabel(jsBase + ".label()");

        return getLabel;
    }

    private String index2;
    private Double index3;
    private Boolean label;
    private String label1;

    public CurrentPriceIndicator setLabel(String index2, Boolean label) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            
            this.label = label;
        } else {
            this.index2 = index2;
            this.label = label;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".label(%s, %b)", index2, label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %b)", index2, label));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setLabel(String index2, String label1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            
            this.label1 = label1;
        } else {
            this.index2 = index2;
            this.label1 = label1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".label(%s, %s)", index2, label1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %s)", index2, label1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setLabel(Double index3, Boolean label) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            
            this.label = label;
        } else {
            this.index3 = index3;
            this.label = label;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".label(%f, %b)", index3, label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %b)", index3, label));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setLabel(Double index3, String label1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            
            this.label1 = label1;
        } else {
            this.index3 = index3;
            this.label1 = label1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".label(%f, %s)", index3, label1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %s)", index3, label1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabel getRisingLabel;

    public UiLabel getRisingLabel() {
        if (getRisingLabel == null)
            getRisingLabel = new UiLabel(jsBase + ".risingLabel()");

        return getRisingLabel;
    }

    private String index4;
    private Double index5;
    private Boolean risingLabel;
    private String risingLabel1;

    public CurrentPriceIndicator setRisingLabel(String index4, Boolean risingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index4 = index4;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel = risingLabel;
        } else {
            this.index4 = index4;
            this.risingLabel = risingLabel;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingLabel(%s, %b)", index4, risingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%s, %b)", index4, risingLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setRisingLabel(String index4, String risingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index4 = index4;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel1 = risingLabel1;
        } else {
            this.index4 = index4;
            this.risingLabel1 = risingLabel1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingLabel(%s, %s)", index4, risingLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%s, %s)", index4, risingLabel1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setRisingLabel(Double index5, Boolean risingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index5 = index5;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel = risingLabel;
        } else {
            this.index5 = index5;
            this.risingLabel = risingLabel;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingLabel(%f, %b)", index5, risingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%f, %b)", index5, risingLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setRisingLabel(Double index5, String risingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index5 = index5;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel1 = risingLabel1;
        } else {
            this.index5 = index5;
            this.risingLabel1 = risingLabel1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingLabel(%f, %s)", index5, risingLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%f, %s)", index5, risingLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke risingStroke;
    private ColoredFill risingStroke1;
    private String risingStroke2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public CurrentPriceIndicator setRisingStroke(Stroke risingStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke = risingStroke;
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
            this.risingStroke = risingStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", (risingStroke != null) ? risingStroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", (risingStroke != null) ? risingStroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setRisingStroke(ColoredFill risingStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke1 = risingStroke1;
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
            this.risingStroke1 = risingStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", (risingStroke1 != null) ? risingStroke1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", (risingStroke1 != null) ? risingStroke1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setRisingStroke(String risingStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke2 = risingStroke2;
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
            this.risingStroke2 = risingStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", risingStroke2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", risingStroke2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getSeries;

    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private Double series;
    private StockSeriesBase series1;

    public CurrentPriceIndicator setSeries(Double series) {
        if (jsBase == null) {
            this.series = null;
            this.series1 = null;
            
            this.series = series;
        } else {
            this.series = series;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".series(%f)", series));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%f)", series));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setSeries(StockSeriesBase series1) {
        if (jsBase == null) {
            this.series = null;
            this.series1 = null;
            
            this.series1 = series1;
        } else {
            this.series1 = series1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".series(%s)", (series1 != null) ? series1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", (series1 != null) ? series1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public CurrentPriceIndicator setStroke(Stroke stroke, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
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
            this.stroke = stroke;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (stroke != null) ? stroke.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (stroke != null) ? stroke.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setStroke(ColoredFill stroke1, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
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
            this.stroke1 = stroke1;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (stroke1 != null) ? stroke1.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (stroke1 != null) ? stroke1.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setStroke(String stroke2, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
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
            this.stroke2 = stroke2;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", stroke2, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", stroke2, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private PriceIndicatorDataSource value1;
    private Double value2;

    public CurrentPriceIndicator setValue(String value) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value = value;
        } else {
            this.value = value;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".value(%s)", value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", value));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setValue(PriceIndicatorDataSource value1) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value1 = value1;
        } else {
            this.value1 = value1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".value(%s)", (value1 != null) ? value1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", (value1 != null) ? value1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CurrentPriceIndicator setValue(Double value2) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value2 = value2;
        } else {
            this.value2 = value2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".value(%f)", value2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%f)", value2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueField;

    public void setValueField(String valueField) {
        if (jsBase == null) {
            this.valueField = valueField;
        } else {
            this.valueField = valueField;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".valueField(%s);", valueField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueField(%s)", valueField));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetFallingLabel() {
        if (getFallingLabel != null) {
            return getFallingLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingLabel() {
        if (getRisingLabel != null) {
            return getRisingLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
    }

    private String generateJSaxis() {
        if (axis != null) {
            return String.format(Locale.US, "axis: %f,", axis);
        }
        return "";
    }

    private String generateJSaxis1() {
        if (axis1 != null) {
            return String.format(Locale.US, "axis: %s,", (axis1 != null) ? axis1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %s,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSfallingLabel() {
        if (fallingLabel != null) {
            return String.format(Locale.US, "fallingLabel: %b,", fallingLabel);
        }
        return "";
    }

    private String generateJSfallingLabel1() {
        if (fallingLabel1 != null) {
            return String.format(Locale.US, "fallingLabel: %s,", fallingLabel1);
        }
        return "";
    }

    private String generateJSfallingStroke() {
        if (fallingStroke != null) {
            return String.format(Locale.US, "fallingStroke: %s,", (fallingStroke != null) ? fallingStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfallingStroke1() {
        if (fallingStroke1 != null) {
            return String.format(Locale.US, "fallingStroke: %s,", (fallingStroke1 != null) ? fallingStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfallingStroke2() {
        if (fallingStroke2 != null) {
            return String.format(Locale.US, "fallingStroke: %s,", fallingStroke2);
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

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %s,", index2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSlabel() {
        if (label != null) {
            return String.format(Locale.US, "label: %b,", label);
        }
        return "";
    }

    private String generateJSlabel1() {
        if (label1 != null) {
            return String.format(Locale.US, "label: %s,", label1);
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %s,", index4);
        }
        return "";
    }

    private String generateJSindex5() {
        if (index5 != null) {
            return String.format(Locale.US, "index: %f,", index5);
        }
        return "";
    }

    private String generateJSrisingLabel() {
        if (risingLabel != null) {
            return String.format(Locale.US, "risingLabel: %b,", risingLabel);
        }
        return "";
    }

    private String generateJSrisingLabel1() {
        if (risingLabel1 != null) {
            return String.format(Locale.US, "risingLabel: %s,", risingLabel1);
        }
        return "";
    }

    private String generateJSrisingStroke() {
        if (risingStroke != null) {
            return String.format(Locale.US, "risingStroke: %s,", (risingStroke != null) ? risingStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrisingStroke1() {
        if (risingStroke1 != null) {
            return String.format(Locale.US, "risingStroke: %s,", (risingStroke1 != null) ? risingStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrisingStroke2() {
        if (risingStroke2 != null) {
            return String.format(Locale.US, "risingStroke: %s,", risingStroke2);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
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

    private String generateJSseries() {
        if (series != null) {
            return String.format(Locale.US, "series: %f,", series);
        }
        return "";
    }

    private String generateJSseries1() {
        if (series1 != null) {
            return String.format(Locale.US, "series: %s,", (series1 != null) ? series1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
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

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %s,", (value1 != null) ? value1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %f,", value2);
        }
        return "";
    }

    private String generateJSvalueField() {
        if (valueField != null) {
            return String.format(Locale.US, "valueField: %s,", valueField);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAxis());
        jsGetters.append(generateJSgetFallingLabel());
        jsGetters.append(generateJSgetLabel());
        jsGetters.append(generateJSgetRisingLabel());
        jsGetters.append(generateJSgetSeries());

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
            js.append(generateJSaxis());
            js.append(generateJSaxis1());
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJSfallingLabel());
            js.append(generateJSfallingLabel1());
            js.append(generateJSfallingStroke());
            js.append(generateJSfallingStroke1());
            js.append(generateJSfallingStroke2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSindex2());
            js.append(generateJSindex3());
            js.append(generateJSlabel());
            js.append(generateJSlabel1());
            js.append(generateJSindex4());
            js.append(generateJSindex5());
            js.append(generateJSrisingLabel());
            js.append(generateJSrisingLabel1());
            js.append(generateJSrisingStroke());
            js.append(generateJSrisingStroke1());
            js.append(generateJSrisingStroke2());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSseries());
            js.append(generateJSseries1());
            js.append(generateJSstroke());
            js.append(generateJSstroke1());
            js.append(generateJSstroke2());
            js.append(generateJSthickness2());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalueField());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
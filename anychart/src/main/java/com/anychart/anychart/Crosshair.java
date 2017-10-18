package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Crosshair extends VisualBase {

    public Crosshair() {

    }

    protected Crosshair(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Crosshair(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private CrosshairDisplayMode displayMode;
    private String displayMode1;

    public Crosshair setDisplayMode(CrosshairDisplayMode displayMode) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode = displayMode;
        } else {
            this.displayMode = displayMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".displayMode(%s)", (displayMode != null) ? displayMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", (displayMode != null) ? displayMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Crosshair setDisplayMode(String displayMode1) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode1 = displayMode1;
        } else {
            this.displayMode1 = displayMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".displayMode(%s)", displayMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", displayMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private CrosshairLabel getXLabel;

    public CrosshairLabel getXLabel() {
        if (getXLabel == null)
            getXLabel = new CrosshairLabel(jsBase + ".xLabel()");

        return getXLabel;
    }

    private String xLabel;
    private Boolean xLabel1;

    public Crosshair setXLabel(String xLabel) {
        if (jsBase == null) {
            this.xLabel = null;
            this.xLabel1 = null;
            
            this.xLabel = xLabel;
        } else {
            this.xLabel = xLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xLabel(%s)", xLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLabel(%s)", xLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public Crosshair setXLabel(Boolean xLabel1) {
        if (jsBase == null) {
            this.xLabel = null;
            this.xLabel1 = null;
            
            this.xLabel1 = xLabel1;
        } else {
            this.xLabel1 = xLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xLabel(%b)", xLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLabel(%b)", xLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke xStroke;
    private String xStroke1;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public Crosshair setXStroke(Stroke xStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.xStroke = null;
            this.xStroke1 = null;
            
            this.xStroke = xStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.xStroke = xStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", (xStroke != null) ? xStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", (xStroke != null) ? xStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Crosshair setXStroke(String xStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.xStroke = null;
            this.xStroke1 = null;
            
            this.xStroke1 = xStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.xStroke1 = xStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", xStroke1, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", xStroke1, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private CrosshairLabel getYLabel;

    public CrosshairLabel getYLabel() {
        if (getYLabel == null)
            getYLabel = new CrosshairLabel(jsBase + ".yLabel()");

        return getYLabel;
    }

    private String yLabel;
    private Boolean yLabel1;

    public Crosshair setYLabel(String yLabel) {
        if (jsBase == null) {
            this.yLabel = null;
            this.yLabel1 = null;
            
            this.yLabel = yLabel;
        } else {
            this.yLabel = yLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yLabel(%s)", yLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yLabel(%s)", yLabel));
                js.setLength(0);
            }
        }
        return this;
    }


    public Crosshair setYLabel(Boolean yLabel1) {
        if (jsBase == null) {
            this.yLabel = null;
            this.yLabel1 = null;
            
            this.yLabel1 = yLabel1;
        } else {
            this.yLabel1 = yLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yLabel(%b)", yLabel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yLabel(%b)", yLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke yStroke;
    private String yStroke1;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public Crosshair setYStroke(Stroke yStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.yStroke = null;
            this.yStroke1 = null;
            
            this.yStroke = yStroke;
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
            this.yStroke = yStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", (yStroke != null) ? yStroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", (yStroke != null) ? yStroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Crosshair setYStroke(String yStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.yStroke = null;
            this.yStroke1 = null;
            
            this.yStroke1 = yStroke1;
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
            this.yStroke1 = yStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", yStroke1, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", yStroke1, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetXLabel() {
        if (getXLabel != null) {
            return getXLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetYLabel() {
        if (getYLabel != null) {
            return getYLabel.generateJs();
        }
        return "";
    }

    private String generateJSdisplayMode() {
        if (displayMode != null) {
            return String.format(Locale.US, "displayMode: %s,", (displayMode != null) ? displayMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdisplayMode1() {
        if (displayMode1 != null) {
            return String.format(Locale.US, "displayMode: %s,", displayMode1);
        }
        return "";
    }

    private String generateJSxLabel() {
        if (xLabel != null) {
            return String.format(Locale.US, "xLabel: %s,", xLabel);
        }
        return "";
    }

    private String generateJSxLabel1() {
        if (xLabel1 != null) {
            return String.format(Locale.US, "xLabel: %b,", xLabel1);
        }
        return "";
    }

    private String generateJSxStroke() {
        if (xStroke != null) {
            return String.format(Locale.US, "xStroke: %s,", (xStroke != null) ? xStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxStroke1() {
        if (xStroke1 != null) {
            return String.format(Locale.US, "xStroke: %s,", xStroke1);
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

    private String generateJSyLabel() {
        if (yLabel != null) {
            return String.format(Locale.US, "yLabel: %s,", yLabel);
        }
        return "";
    }

    private String generateJSyLabel1() {
        if (yLabel1 != null) {
            return String.format(Locale.US, "yLabel: %b,", yLabel1);
        }
        return "";
    }

    private String generateJSyStroke() {
        if (yStroke != null) {
            return String.format(Locale.US, "yStroke: %s,", (yStroke != null) ? yStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyStroke1() {
        if (yStroke1 != null) {
            return String.format(Locale.US, "yStroke: %s,", yStroke1);
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetXLabel());
        jsGetters.append(generateJSgetYLabel());

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
            js.append(generateJSdisplayMode());
            js.append(generateJSdisplayMode1());
            js.append(generateJSxLabel());
            js.append(generateJSxLabel1());
            js.append(generateJSxStroke());
            js.append(generateJSxStroke1());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSyLabel());
            js.append(generateJSyLabel1());
            js.append(generateJSyStroke());
            js.append(generateJSyStroke1());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
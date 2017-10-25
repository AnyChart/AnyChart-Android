package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

            js.append(String.format(Locale.US, ".displayMode(%s)", ((displayMode != null) ? displayMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", ((displayMode != null) ? displayMode.generateJs() : "null")));
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

            js.append(String.format(Locale.US, ".displayMode(%s)", wrapQuotes(displayMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", wrapQuotes(displayMode1)));
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

            js.append(String.format(Locale.US, ".xLabel(%s)", wrapQuotes(xLabel)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLabel(%s)", wrapQuotes(xLabel)));
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

            js.append(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", ((xStroke != null) ? xStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", ((xStroke != null) ? xStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

            js.append(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", wrapQuotes(xStroke1), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xStroke(%s, %f, %s, %s, %s)", wrapQuotes(xStroke1), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

            js.append(String.format(Locale.US, ".yLabel(%s)", wrapQuotes(yLabel)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yLabel(%s)", wrapQuotes(yLabel)));
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

            js.append(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", ((yStroke != null) ? yStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", ((yStroke != null) ? yStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
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

            js.append(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", wrapQuotes(yStroke1), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yStroke(%s, %f, %s, %s, %s)", wrapQuotes(yStroke1), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSCrosshairLabel getXLabel() {
//        if (CrosshairLabel getXLabel != null) {
//            return CrosshairLabel getXLabel.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSCrosshairLabel getYLabel() {
//        if (CrosshairLabel getYLabel != null) {
//            return CrosshairLabel getYLabel.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetXLabel() {
        if (getXLabel != null) {
            return getXLabel.generateJs();
            //return String.format(Locale.US, "getXLabel: %s,", ((getXLabel != null) ? getXLabel.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetYLabel() {
        if (getYLabel != null) {
            return getYLabel.generateJs();
            //return String.format(Locale.US, "getYLabel: %s,", ((getYLabel != null) ? getYLabel.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSdisplayMode());
////        
//            js.append(generateJSdisplayMode1());
////        
//            js.append(generateJSxLabel());
////        
//            js.append(generateJSxLabel1());
////        
//            js.append(generateJSxStroke());
////        
//            js.append(generateJSxStroke1());
////        
//            js.append(generateJSthickness());
////        
//            js.append(generateJSdashpattern());
////        
//            js.append(generateJSlineJoin());
////        
//            js.append(generateJSlineCap());
////        
//            js.append(generateJSyLabel());
////        
//            js.append(generateJSyLabel1());
////        
//            js.append(generateJSyStroke());
////        
//            js.append(generateJSyStroke1());
////        
//            js.append(generateJSthickness1());
////        
//            js.append(generateJSdashpattern1());
////        
//            js.append(generateJSlineJoin1());
////        
//            js.append(generateJSlineCap1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
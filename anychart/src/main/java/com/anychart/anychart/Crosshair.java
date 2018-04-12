package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Crosshair class.
 */
public class Crosshair extends VisualBase {

    public Crosshair() {
        js.setLength(0);
        js.append("var crosshair").append(++variableIndex).append(" = anychart.core.ui.crosshair();");
        jsBase = "crosshair" + variableIndex;
    }

    protected Crosshair(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Crosshair(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private CrosshairDisplayMode displayMode;
    private String displayMode1;

    /**
     * Setter for the display mode for crosshair.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".displayMode(%s);", ((displayMode != null) ? displayMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the display mode for crosshair.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".displayMode(%s);", wrapQuotes(displayMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<CrosshairLabel> getXLabel = new ArrayList<>();

    /**
     * Getter for the crosshair X-label settings.
     */
    public CrosshairLabel getXLabel(Number index) {
        CrosshairLabel item = new CrosshairLabel(jsBase + ".xLabel(" + index + ")");
        getXLabel.add(item);
        return item;
    }

    private String xLabel;
    private Boolean xLabel1;

    /**
     * Setter for the crosshair X-label settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLabel(%s);", wrapQuotes(xLabel)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the crosshair X-label settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLabel(%b);", xLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private String xLabel2;
    private Boolean xLabel3;

    /**
     * Setter for the crosshair X-label settings by index.
     */
    public Crosshair setXLabel(Number index, String xLabel2) {
        if (jsBase == null) {
            this.index = index;
            this.xLabel = null;
            this.xLabel1 = null;
            this.xLabel2 = null;
            this.xLabel3 = null;
            
            this.xLabel2 = xLabel2;
        } else {
            this.index = index;
            this.xLabel2 = xLabel2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xLabel(%s, %s)", index, wrapQuotes(xLabel2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLabel(%s, %s);", index, wrapQuotes(xLabel2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the crosshair X-label settings by index.
     */
    public Crosshair setXLabel(Number index, Boolean xLabel3) {
        if (jsBase == null) {
            this.index = index;
            this.xLabel = null;
            this.xLabel1 = null;
            this.xLabel2 = null;
            this.xLabel3 = null;
            
            this.xLabel3 = xLabel3;
        } else {
            this.index = index;
            this.xLabel3 = xLabel3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xLabel(%s, %b)", index, xLabel3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLabel(%s, %b);", index, xLabel3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke xStroke;
    private String xStroke1;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the X-line stroke.
     */
    public Crosshair setXStroke(Stroke xStroke, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".xStroke(%s, %s, %s, %s, %s)", ((xStroke != null) ? xStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", ((xStroke != null) ? xStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the X-line stroke.
     */
    public Crosshair setXStroke(String xStroke1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".xStroke(%s, %s, %s, %s, %s)", wrapQuotes(xStroke1), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", wrapQuotes(xStroke1), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<CrosshairLabel> getYLabel = new ArrayList<>();

    /**
     * Getter for the crosshair Y-label settings.
     */
    public CrosshairLabel getYLabel(Number index) {
        CrosshairLabel item = new CrosshairLabel(jsBase + ".yLabel(" + index + ")");
        getYLabel.add(item);
        return item;
    }

    private String yLabel;
    private Boolean yLabel1;

    /**
     * Setter for the crosshair Y-label settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yLabel(%s);", wrapQuotes(yLabel)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the crosshair Y-label settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yLabel(%b);", yLabel1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;
    private String yLabel2;
    private Boolean yLabel3;

    /**
     * Setter for the crosshair Y-label settings by index.
     */
    public Crosshair setYLabel(Number index1, String yLabel2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.yLabel = null;
            this.yLabel1 = null;
            this.yLabel2 = null;
            this.yLabel3 = null;
            
            this.yLabel2 = yLabel2;
        } else {
            this.index1 = index1;
            this.yLabel2 = yLabel2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yLabel(%s, %s)", index1, wrapQuotes(yLabel2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yLabel(%s, %s);", index1, wrapQuotes(yLabel2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the crosshair Y-label settings by index.
     */
    public Crosshair setYLabel(Number index1, Boolean yLabel3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.yLabel = null;
            this.yLabel1 = null;
            this.yLabel2 = null;
            this.yLabel3 = null;
            
            this.yLabel3 = yLabel3;
        } else {
            this.index1 = index1;
            this.yLabel3 = yLabel3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yLabel(%s, %b)", index1, yLabel3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yLabel(%s, %b);", index1, yLabel3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke yStroke;
    private String yStroke1;
    private Number thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for the Y-line stroke.
     */
    public Crosshair setYStroke(Stroke yStroke, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            js.append(String.format(Locale.US, ".yStroke(%s, %s, %s, %s, %s)", ((yStroke != null) ? yStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", ((yStroke != null) ? yStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Y-line stroke.
     */
    public Crosshair setYStroke(String yStroke1, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            js.append(String.format(Locale.US, ".yStroke(%s, %s, %s, %s, %s)", wrapQuotes(yStroke1), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", wrapQuotes(yStroke1), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetXLabel() {
        if (!getXLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : getXLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYLabel() {
        if (!getYLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : getYLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
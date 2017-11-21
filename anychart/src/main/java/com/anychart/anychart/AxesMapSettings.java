package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Map axes settings class.
 */
public class AxesMapSettings extends VisualBase {

    public AxesMapSettings() {
        js.setLength(0);
        js.append("var axesMapSettings").append(++variableIndex).append(" = anychart.core.axes.mapSettings();");
        jsBase = "axesMapSettings" + variableIndex;
    }

    protected AxesMapSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AxesMapSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AxesMap getBottom;

    /**
     * Getter for the bottom axis.
     */
    public AxesMap getBottom() {
        if (getBottom == null)
            getBottom = new AxesMap(jsBase + ".bottom()");

        return getBottom;
    }

    private Boolean bottom;
    private String bottom1;
    private List<AxesMapSettings> setBottom = new ArrayList<>();

    /**
     * Setter for the bottom axis.
     */
    public AxesMapSettings setBottom(Boolean bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%b)", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%b)", bottom));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom() {
        if (!setBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setBottom1 = new ArrayList<>();

    /**
     * Setter for the bottom axis.
     */
    public AxesMapSettings setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom1() {
        if (!setBottom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setBottom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawFirstLabel;
    private List<AxesMapSettings> setDrawFirstLabel = new ArrayList<>();

    /**
     * Setter for the first label drawing flag.
     */
    public AxesMapSettings setDrawFirstLabel(Boolean drawFirstLabel) {
        if (jsBase == null) {
            this.drawFirstLabel = drawFirstLabel;
        } else {
            this.drawFirstLabel = drawFirstLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".drawFirstLabel(%b)", drawFirstLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drawFirstLabel(%b)", drawFirstLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDrawFirstLabel() {
        if (!setDrawFirstLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setDrawFirstLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLastLabel;
    private List<AxesMapSettings> setDrawLastLabel = new ArrayList<>();

    /**
     * Setter for the last label drawing flag.
     */
    public AxesMapSettings setDrawLastLabel(Boolean drawLastLabel) {
        if (jsBase == null) {
            this.drawLastLabel = drawLastLabel;
        } else {
            this.drawLastLabel = drawLastLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".drawLastLabel(%b)", drawLastLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drawLastLabel(%b)", drawLastLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDrawLastLabel() {
        if (!setDrawLastLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setDrawLastLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for axis labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;
    private List<AxesMapSettings> setLabels = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public AxesMapSettings setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setLabels1 = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public AxesMapSettings setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AxesMap getLeft;

    /**
     * Getter for the left axis.
     */
    public AxesMap getLeft() {
        if (getLeft == null)
            getLeft = new AxesMap(jsBase + ".left()");

        return getLeft;
    }

    private Boolean left;
    private String left1;
    private List<AxesMapSettings> setLeft = new ArrayList<>();

    /**
     * Setter for the left axis.
     */
    public AxesMapSettings setLeft(Boolean left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%b)", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%b)", left));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft() {
        if (!setLeft.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setLeft) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setLeft1 = new ArrayList<>();

    /**
     * Setter for the left axis.
     */
    public AxesMapSettings setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft1() {
        if (!setLeft1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setLeft1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getMinorLabels;

    /**
     * Getter for axis minor labels.
     */
    public UiLabelsFactory getMinorLabels() {
        if (getMinorLabels == null)
            getMinorLabels = new UiLabelsFactory(jsBase + ".minorLabels()");

        return getMinorLabels;
    }

    private String minorLabels;
    private Boolean minorLabels1;
    private List<AxesMapSettings> setMinorLabels = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public AxesMapSettings setMinorLabels(String minorLabels) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels = minorLabels;
        } else {
            this.minorLabels = minorLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorLabels(%s)", wrapQuotes(minorLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorLabels(%s)", wrapQuotes(minorLabels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorLabels() {
        if (!setMinorLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setMinorLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setMinorLabels1 = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public AxesMapSettings setMinorLabels(Boolean minorLabels1) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels1 = minorLabels1;
        } else {
            this.minorLabels1 = minorLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorLabels(%b)", minorLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorLabels(%b)", minorLabels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorLabels1() {
        if (!setMinorLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setMinorLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MapTicks getMinorTicks;

    /**
     * Getter for minor axis ticks.
     */
    public MapTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new MapTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private Boolean minorTicks1;
    private List<AxesMapSettings> setMinorTicks = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public AxesMapSettings setMinorTicks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks() {
        if (!setMinorTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setMinorTicks1 = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public AxesMapSettings setMinorTicks(Boolean minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%b)", minorTicks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%b)", minorTicks1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks1() {
        if (!setMinorTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private List<AxesMapSettings> setOverlapMode = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public AxesMapSettings setOverlapMode(LabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            
            this.overlapMode = overlapMode;
        } else {
            this.overlapMode = overlapMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlapMode() {
        if (!setOverlapMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setOverlapMode1 = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public AxesMapSettings setOverlapMode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            
            this.overlapMode1 = overlapMode1;
        } else {
            this.overlapMode1 = overlapMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlapMode1() {
        if (!setOverlapMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AxesMap getRight;

    /**
     * Getter for the right axis.
     */
    public AxesMap getRight() {
        if (getRight == null)
            getRight = new AxesMap(jsBase + ".right()");

        return getRight;
    }

    private Boolean right;
    private String right1;
    private List<AxesMapSettings> setRight = new ArrayList<>();

    /**
     * Setter for the right axis.
     */
    public AxesMapSettings setRight(Boolean right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%b)", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%b)", right));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight() {
        if (!setRight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setRight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setRight1 = new ArrayList<>();

    /**
     * Setter for the right axis.
     */
    public AxesMapSettings setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight1() {
        if (!setRight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setRight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<AxesMapSettings> setStroke = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMapSettings setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setStroke1 = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMapSettings setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setStroke2 = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMapSettings setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MapTicks getTicks;

    /**
     * Getter for axis ticks.
     */
    public MapTicks getTicks() {
        if (getTicks == null)
            getTicks = new MapTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private Boolean ticks1;
    private List<AxesMapSettings> setTicks = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public AxesMapSettings setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTicks() {
        if (!setTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setTicks1 = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public AxesMapSettings setTicks(Boolean ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%b)", ticks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%b)", ticks1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTicks1() {
        if (!setTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiTitle getTitle;

    /**
     * Getter for the axis title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;
    private List<AxesMapSettings> setTitle = new ArrayList<>();

    /**
     * Setter for the axis title.
     */
    public AxesMapSettings setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%b)", title));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle() {
        if (!setTitle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTitle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setTitle1 = new ArrayList<>();

    /**
     * Setter for the axis title.
     */
    public AxesMapSettings setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle1() {
        if (!setTitle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTitle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AxesMap getTop;

    /**
     * Getter for the top axis.
     */
    public AxesMap getTop() {
        if (getTop == null)
            getTop = new AxesMap(jsBase + ".top()");

        return getTop;
    }

    private Boolean top;
    private String top1;
    private List<AxesMapSettings> setTop = new ArrayList<>();

    /**
     * Setter for the top axis.
     */
    public AxesMapSettings setTop(Boolean top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%b)", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%b)", top));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop() {
        if (!setTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMapSettings> setTop1 = new ArrayList<>();

    /**
     * Setter for the top axis.
     */
    public AxesMapSettings setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop1() {
        if (!setTop1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMapSettings item : setTop1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetBottom() {
        if (getBottom != null) {
            return getBottom.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLeft() {
        if (getLeft != null) {
            return getLeft.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorLabels() {
        if (getMinorLabels != null) {
            return getMinorLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorTicks() {
        if (getMinorTicks != null) {
            return getMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetRight() {
        if (getRight != null) {
            return getRight.generateJs();
        }
        return "";
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSgetTop() {
        if (getTop != null) {
            return getTop.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBottom());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLeft());
        jsGetters.append(generateJSgetMinorLabels());
        jsGetters.append(generateJSgetMinorTicks());
        jsGetters.append(generateJSgetRight());
        jsGetters.append(generateJSgetTicks());
        jsGetters.append(generateJSgetTitle());
        jsGetters.append(generateJSgetTop());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetBottom());
        js.append(generateJSsetBottom1());
        js.append(generateJSsetDrawFirstLabel());
        js.append(generateJSsetDrawLastLabel());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetLeft());
        js.append(generateJSsetLeft1());
        js.append(generateJSsetMinorLabels());
        js.append(generateJSsetMinorLabels1());
        js.append(generateJSsetMinorTicks());
        js.append(generateJSsetMinorTicks1());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetRight());
        js.append(generateJSsetRight1());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTicks());
        js.append(generateJSsetTicks1());
        js.append(generateJSsetTitle());
        js.append(generateJSsetTitle1());
        js.append(generateJSsetTop());
        js.append(generateJSsetTop1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
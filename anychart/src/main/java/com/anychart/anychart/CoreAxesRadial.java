package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Axis Class.<br/>
Any axis must be bound to a scale.<br/>
To obtain a new instance of Axis use {@link anychart.standalones.axes#radial}.
 */
public class CoreAxesRadial extends VisualBase {

    public CoreAxesRadial() {
        js.setLength(0);
        js.append("var coreAxesRadial").append(++variableIndex).append(" = anychart.core.axes.radial();");
        jsBase = "coreAxesRadial" + variableIndex;
    }

    protected CoreAxesRadial(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CoreAxesRadial(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean drawFirstLabel;
    private List<CoreAxesRadial> setDrawFirstLabel = new ArrayList<>();

    /**
     * Setter for the first label drawing flag.
     */
    public CoreAxesRadial setDrawFirstLabel(Boolean drawFirstLabel) {
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
            for (CoreAxesRadial item : setDrawFirstLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLastLabel;
    private List<CoreAxesRadial> setDrawLastLabel = new ArrayList<>();

    /**
     * Setter for the last label drawing flag.
     */
    public CoreAxesRadial setDrawLastLabel(Boolean drawLastLabel) {
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
            for (CoreAxesRadial item : setDrawLastLabel) {
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
    private List<CoreAxesRadial> setLabels = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public CoreAxesRadial setLabels(String labels) {
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
            for (CoreAxesRadial item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setLabels1 = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public CoreAxesRadial setLabels(Boolean labels1) {
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
            for (CoreAxesRadial item : setLabels1) {
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
    private List<CoreAxesRadial> setMinorLabels = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public CoreAxesRadial setMinorLabels(String minorLabels) {
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
            for (CoreAxesRadial item : setMinorLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setMinorLabels1 = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public CoreAxesRadial setMinorLabels(Boolean minorLabels1) {
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
            for (CoreAxesRadial item : setMinorLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RadialTicks getMinorTicks;

    /**
     * Getter for axis minor ticks.
     */
    public RadialTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new RadialTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private Boolean minorTicks1;
    private List<CoreAxesRadial> setMinorTicks = new ArrayList<>();

    /**
     * Setter for axis minor ticks.
     */
    public CoreAxesRadial setMinorTicks(String minorTicks) {
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
            for (CoreAxesRadial item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setMinorTicks1 = new ArrayList<>();

    /**
     * Setter for axis minor ticks.
     */
    public CoreAxesRadial setMinorTicks(Boolean minorTicks1) {
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
            for (CoreAxesRadial item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private List<CoreAxesRadial> setOverlapMode = new ArrayList<>();

    /**
     * Setter for labels overlap mode for.
     */
    public CoreAxesRadial setOverlapMode(LabelsOverlapMode overlapMode) {
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
            for (CoreAxesRadial item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setOverlapMode1 = new ArrayList<>();

    /**
     * Setter for labels overlap mode for.
     */
    public CoreAxesRadial setOverlapMode(String overlapMode1) {
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
            for (CoreAxesRadial item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesBase getScale;

    /**
     * Getter for the axis scale.
     */
    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }

    private ScalesBase scale;
    private String scale1;
    private ScaleTypes scale2;
    private String scale3;
    private List<CoreAxesRadial> setScale = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public CoreAxesRadial setScale(ScalesBase scale) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale = scale;
        } else {
            this.scale = scale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(scale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".scale(%s);",  ((scale != null) ? scale.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesRadial item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setScale1 = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public CoreAxesRadial setScale(String scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetScale1() {
        if (!setScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesRadial item : setScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setScale2 = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public CoreAxesRadial setScale(ScaleTypes scale2) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale2 = scale2;
        } else {
            this.scale2 = scale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scale(%s)", ((scale2 != null) ? scale2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale2 != null) ? scale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetScale2() {
        if (!setScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesRadial item : setScale2) {
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
    private List<CoreAxesRadial> setStroke = new ArrayList<>();

    /**
     * Setter for the axis stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreAxesRadial setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (CoreAxesRadial item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setStroke1 = new ArrayList<>();

    /**
     * Setter for the axis stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreAxesRadial setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (CoreAxesRadial item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setStroke2 = new ArrayList<>();

    /**
     * Setter for the axis stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreAxesRadial setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (CoreAxesRadial item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RadialTicks getTicks;

    /**
     * Getter for axis ticks.
     */
    public RadialTicks getTicks() {
        if (getTicks == null)
            getTicks = new RadialTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private Boolean ticks1;
    private List<CoreAxesRadial> setTicks = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public CoreAxesRadial setTicks(String ticks) {
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
            for (CoreAxesRadial item : setTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesRadial> setTicks1 = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public CoreAxesRadial setTicks(Boolean ticks1) {
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
            for (CoreAxesRadial item : setTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
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

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetMinorLabels());
        jsGetters.append(generateJSgetMinorTicks());
        jsGetters.append(generateJSgetScale());
        jsGetters.append(generateJSgetTicks());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDrawFirstLabel());
        js.append(generateJSsetDrawLastLabel());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMinorLabels());
        js.append(generateJSsetMinorLabels1());
        js.append(generateJSsetMinorTicks());
        js.append(generateJSsetMinorTicks1());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetScale2());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTicks());
        js.append(generateJSsetTicks1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
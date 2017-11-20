package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Map axis class.
 */
public class AxesMap extends VisualBase {

    public AxesMap() {
        js.setLength(0);
        js.append("var axesMap").append(++variableIndex).append(" = anychart.core.axes.map();");
        jsBase = "axesMap" + variableIndex;
    }

    protected AxesMap(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AxesMap(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean drawFirstLabel;
    private List<AxesMap> setDrawFirstLabel = new ArrayList<>();

    /**
     * Setter for the first label drawing flag.
     */
    public AxesMap setDrawFirstLabel(Boolean drawFirstLabel) {
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
            for (AxesMap item : setDrawFirstLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLastLabel;
    private List<AxesMap> setDrawLastLabel = new ArrayList<>();

    /**
     * Setter for the last label drawing flag.
     */
    public AxesMap setDrawLastLabel(Boolean drawLastLabel) {
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
            for (AxesMap item : setDrawLastLabel) {
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
    private List<AxesMap> setLabels = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public AxesMap setLabels(String labels) {
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
            for (AxesMap item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setLabels1 = new ArrayList<>();

    /**
     * Setter for axis labels.
     */
    public AxesMap setLabels(Boolean labels1) {
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
            for (AxesMap item : setLabels1) {
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
    private List<AxesMap> setMinorLabels = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public AxesMap setMinorLabels(String minorLabels) {
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
            for (AxesMap item : setMinorLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setMinorLabels1 = new ArrayList<>();

    /**
     * Setter for axis minor labels.
     */
    public AxesMap setMinorLabels(Boolean minorLabels1) {
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
            for (AxesMap item : setMinorLabels1) {
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
    private List<AxesMap> setMinorTicks = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public AxesMap setMinorTicks(String minorTicks) {
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
            for (AxesMap item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setMinorTicks1 = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public AxesMap setMinorTicks(Boolean minorTicks1) {
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
            for (AxesMap item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private List<AxesMap> setOverlapMode = new ArrayList<>();

    /**
     * Setter for overlap mode for labels.
     */
    public AxesMap setOverlapMode(LabelsOverlapMode overlapMode) {
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
            for (AxesMap item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setOverlapMode1 = new ArrayList<>();

    /**
     * Setter for overlap mode for labels.
     */
    public AxesMap setOverlapMode(String overlapMode1) {
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
            for (AxesMap item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<AxesMap> setStroke = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMap setStroke(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMap item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setStroke1 = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMap setStroke(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMap item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setStroke2 = new ArrayList<>();

    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public AxesMap setStroke(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesMap item : setStroke2) {
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
    private List<AxesMap> setTicks = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public AxesMap setTicks(String ticks) {
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
            for (AxesMap item : setTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setTicks1 = new ArrayList<>();

    /**
     * Setter for axis ticks.
     */
    public AxesMap setTicks(Boolean ticks1) {
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
            for (AxesMap item : setTicks1) {
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
    private List<AxesMap> setTitle = new ArrayList<>();

    /**
     * Setter for the axis title.
     */
    public AxesMap setTitle(Boolean title) {
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
            for (AxesMap item : setTitle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AxesMap> setTitle1 = new ArrayList<>();

    /**
     * Setter for the axis title.
     */
    public AxesMap setTitle(String title1) {
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
            for (AxesMap item : setTitle1) {
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetMinorLabels());
        jsGetters.append(generateJSgetMinorTicks());
        jsGetters.append(generateJSgetTicks());
        jsGetters.append(generateJSgetTitle());

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
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTicks());
        js.append(generateJSsetTicks1());
        js.append(generateJSsetTitle());
        js.append(generateJSsetTitle1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
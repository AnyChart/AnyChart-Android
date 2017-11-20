package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Gantt line marker.
 */
public class GanttLine extends VisualBase {

    public GanttLine() {
        js.setLength(0);
        js.append("var ganttLine").append(++variableIndex).append(" = anychart.core.axisMarkers.ganttLine();");
        jsBase = "ganttLine" + variableIndex;
    }

    protected GanttLine(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GanttLine(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Layout layout;
    private String layout1;
    private List<GanttLine> setLayout = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker layout.<br/>
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttLine setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout() {
        if (!setLayout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : setLayout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttLine> setLayout1 = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker layout.<br/>
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttLine setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout1() {
        if (!setLayout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : setLayout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GanttDateTime getScale;

    /**
     * Getter for the Gantt chart line marker scale.
     */
    public GanttDateTime getScale() {
        if (getScale == null)
            getScale = new GanttDateTime(jsBase + ".scale()");

        return getScale;
    }

    private GanttDateTime scale;
    private List<GanttLine> setScale = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker scale.<br/>
<b>Note:</b> The scale() method will not work here, only "dateTime" scale are available in Gantt Chart.
{docs:Gantt_Chart/Timeline#special_features}Learn more about scale.{docs}
     */
    public GanttLine setScale(GanttDateTime scale) {
        if (jsBase == null) {
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
            for (GanttLine item : setScale) {
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
    private List<GanttLine> setStroke = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker stroke.
     */
    public GanttLine setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (GanttLine item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttLine> setStroke1 = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker stroke.
     */
    public GanttLine setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (GanttLine item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttLine> setStroke2 = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker stroke.
     */
    public GanttLine setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            for (GanttLine item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double value;
    private GanttDateTimeMarkers value1;
    private String value2;
    private List<GanttLine> setValue = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker value.
     */
    public GanttLine setValue(Double value) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value = value;
        } else {
            this.value = value;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%f)", value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%f)", value));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue() {
        if (!setValue.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : setValue) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttLine> setValue1 = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker value.
     */
    public GanttLine setValue(GanttDateTimeMarkers value1) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value1 = value1;
        } else {
            this.value1 = value1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", ((value1 != null) ? value1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", ((value1 != null) ? value1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue1() {
        if (!setValue1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : setValue1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttLine> setValue2 = new ArrayList<>();

    /**
     * Setter for the Gantt chart line marker value.
     */
    public GanttLine setValue(String value2) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value2 = value2;
        } else {
            this.value2 = value2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", wrapQuotes(value2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", wrapQuotes(value2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue2() {
        if (!setValue2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttLine item : setValue2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetLayout());
        js.append(generateJSsetLayout1());
        js.append(generateJSsetScale());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetValue());
        js.append(generateJSsetValue1());
        js.append(generateJSsetValue2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
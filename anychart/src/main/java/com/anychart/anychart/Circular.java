package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Circular axis class.
{docs:Gauges/Circular_Gauge#axis}Learn more about circular axis.{docs}
 */
public class Circular extends VisualBase {

    public Circular() {
        js.setLength(0);
        js.append("var circular").append(++variableIndex).append(" = anychart.core.axes.circular();");
        jsBase = "circular" + variableIndex;
    }

    protected Circular(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Circular(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double cornersRounding;
    private String cornersRounding1;
    private List<Circular> setCornersRounding = new ArrayList<>();

    /**
     * Setter for the rounding of corners.
Round off the ends of axes to the specified radius.
     */
    public Circular setCornersRounding(Double cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornersRounding() {
        if (!setCornersRounding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setCornersRounding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setCornersRounding1 = new ArrayList<>();

    /**
     * Setter for the rounding of corners.
Round off the ends of axes to the specified radius.
     */
    public Circular setCornersRounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%s)", wrapQuotes(cornersRounding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%s)", wrapQuotes(cornersRounding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornersRounding1() {
        if (!setCornersRounding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setCornersRounding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawFirstLabel;
    private List<Circular> setDrawFirstLabel = new ArrayList<>();

    /**
     * Setter for the first label drawing flag.
     */
    public Circular setDrawFirstLabel(Boolean drawFirstLabel) {
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
            for (Circular item : setDrawFirstLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLastLabel;
    private List<Circular> setDrawLastLabel = new ArrayList<>();

    /**
     * Setter for the last label drawing flag.
     */
    public Circular setDrawLastLabel(Boolean drawLastLabel) {
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
            for (Circular item : setDrawLastLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private String fill1;
    private List<Circular> setFill = new ArrayList<>();

    /**
     * Setter for axis fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill1 = new ArrayList<>();

    /**
     * Setter for axis fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular setFill(String fill1) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill1 = fill1;
        } else {
            this.fill1 = fill1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<Circular> setFill2 = new ArrayList<>();

    /**
     * Axis fill color with opacity. Fill as a string or an object.
     */
    public Circular fill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<Circular> setFill3 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill4 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill5 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill6 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill7 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill8 = new ArrayList<>();

    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(String[] keys1, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<Circular> setFill9 = new ArrayList<>();

    /**
     * Radial axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setFill10 = new ArrayList<>();

    /**
     * Radial axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Circular fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill10() {
        if (!setFill10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setFill10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private UiLabelsFactory getLabels;

    /**
     * Getter for labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;
    private List<Circular> setLabels = new ArrayList<>();

    /**
     * Setter for labels.
     */
    public Circular setLabels(String labels) {
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
            for (Circular item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setLabels1 = new ArrayList<>();

    /**
     * Setter for labels.
     */
    public Circular setLabels(Boolean labels1) {
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
            for (Circular item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getMinorLabels;

    /**
     * Getter for minor labels.
     */
    public UiLabelsFactory getMinorLabels() {
        if (getMinorLabels == null)
            getMinorLabels = new UiLabelsFactory(jsBase + ".minorLabels()");

        return getMinorLabels;
    }

    private String minorLabels;
    private Boolean minorLabels1;
    private List<Circular> setMinorLabels = new ArrayList<>();

    /**
     * Setter for minor labels.
     */
    public Circular setMinorLabels(String minorLabels) {
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
            for (Circular item : setMinorLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setMinorLabels1 = new ArrayList<>();

    /**
     * Setter for minor labels.
     */
    public Circular setMinorLabels(Boolean minorLabels1) {
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
            for (Circular item : setMinorLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CircularTicks getMinorTicks;

    /**
     * Getter for minor axis ticks.
     */
    public CircularTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new CircularTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private Boolean minorTicks1;
    private List<Circular> setMinorTicks = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public Circular setMinorTicks(String minorTicks) {
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
            for (Circular item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setMinorTicks1 = new ArrayList<>();

    /**
     * Setter for minor axis ticks.
     */
    public Circular setMinorTicks(Boolean minorTicks1) {
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
            for (Circular item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;
    private List<Circular> setOverlapMode = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public Circular setOverlapMode(LabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
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
            for (Circular item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setOverlapMode1 = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public Circular setOverlapMode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
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
            for (Circular item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setOverlapMode2 = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public Circular setOverlapMode(Boolean overlapMode2) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode2 = overlapMode2;
        } else {
            this.overlapMode2 = overlapMode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlapMode2() {
        if (!setOverlapMode2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setOverlapMode2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radius;
    private String radius1;
    private List<Circular> setRadius = new ArrayList<>();

    /**
     * Setter for the axis radius.
     */
    public Circular setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%f)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%f)", radius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius() {
        if (!setRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setRadius1 = new ArrayList<>();

    /**
     * Setter for the axis radius.
     */
    public Circular setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius1() {
        if (!setRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesLinear getScale;

    /**
     * Getter for the axis scale.
     */
    public ScalesLinear getScale() {
        if (getScale == null)
            getScale = new ScalesLinear(jsBase + ".scale()");

        return getScale;
    }

    private GaugeScaleTypes scale;
    private String scale1;
    private ScalesLinear scale2;
    private String scale3;
    private List<Circular> setScale = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public Circular setScale(GaugeScaleTypes scale) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setScale1 = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public Circular setScale(String scale1) {
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
            for (Circular item : setScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setScale2 = new ArrayList<>();

    /**
     * Setter for the axis scale.
     */
    public Circular setScale(ScalesLinear scale2) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale2 = scale2;
        } else {
            this.scale2 = scale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(scale2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".scale(%s);",  ((scale2 != null) ? scale2.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetScale2() {
        if (!setScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String startAngle;
    private Double startAngle1;
    private List<Circular> setStartAngle = new ArrayList<>();

    /**
     * Setter for the start angle.
     */
    public Circular setStartAngle(String startAngle) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle = startAngle;
        } else {
            this.startAngle = startAngle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartAngle() {
        if (!setStartAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setStartAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setStartAngle1 = new ArrayList<>();

    /**
     * Setter for the start angle.
     */
    public Circular setStartAngle(Double startAngle1) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle1 = startAngle1;
        } else {
            this.startAngle1 = startAngle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startAngle(%f)", startAngle1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartAngle1() {
        if (!setStartAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setStartAngle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String sweepAngle;
    private Double sweepAngle1;
    private List<Circular> setSweepAngle = new ArrayList<>();

    /**
     * Setter for the sweep angle.
     */
    public Circular setSweepAngle(String sweepAngle) {
        if (jsBase == null) {
            this.sweepAngle = null;
            this.sweepAngle1 = null;
            
            this.sweepAngle = sweepAngle;
        } else {
            this.sweepAngle = sweepAngle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sweepAngle(%s)", wrapQuotes(sweepAngle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sweepAngle(%s)", wrapQuotes(sweepAngle)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSweepAngle() {
        if (!setSweepAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setSweepAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setSweepAngle1 = new ArrayList<>();

    /**
     * Setter for the sweep angle.
     */
    public Circular setSweepAngle(Double sweepAngle1) {
        if (jsBase == null) {
            this.sweepAngle = null;
            this.sweepAngle1 = null;
            
            this.sweepAngle1 = sweepAngle1;
        } else {
            this.sweepAngle1 = sweepAngle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sweepAngle(%f)", sweepAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sweepAngle(%f)", sweepAngle1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSweepAngle1() {
        if (!setSweepAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setSweepAngle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CircularTicks getTicks;

    /**
     * Getter for circular ticks.
     */
    public CircularTicks getTicks() {
        if (getTicks == null)
            getTicks = new CircularTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private Boolean ticks1;
    private List<Circular> setTicks = new ArrayList<>();

    /**
     * Setter for circular ticks.
     */
    public Circular setTicks(String ticks) {
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
            for (Circular item : setTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setTicks1 = new ArrayList<>();

    /**
     * Setter for circular ticks.
     */
    public Circular setTicks(Boolean ticks1) {
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
            for (Circular item : setTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<Circular> setWidth = new ArrayList<>();

    /**
     * Setter for the axis width.
     */
    public Circular setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Circular> setWidth1 = new ArrayList<>();

    /**
     * Setter for the axis width.
     */
    public Circular setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth1() {
        if (!setWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circular item : setWidth1) {
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

        js.append(generateJSsetCornersRounding());
        js.append(generateJSsetCornersRounding1());
        js.append(generateJSsetDrawFirstLabel());
        js.append(generateJSsetDrawLastLabel());
        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetFill10());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMinorLabels());
        js.append(generateJSsetMinorLabels1());
        js.append(generateJSsetMinorTicks());
        js.append(generateJSsetMinorTicks1());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetOverlapMode2());
        js.append(generateJSsetRadius());
        js.append(generateJSsetRadius1());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetScale2());
        js.append(generateJSsetStartAngle());
        js.append(generateJSsetStartAngle1());
        js.append(generateJSsetSweepAngle());
        js.append(generateJSsetSweepAngle1());
        js.append(generateJSsetTicks());
        js.append(generateJSsetTicks1());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
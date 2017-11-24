package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// chart class
/**
 * AnyChart TreeMap class.
 */
public class TreeMap extends SeparateChart {

    protected TreeMap(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public TreeMap setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public TreeMap setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public TreeMap setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    public TreeMap setData(Mapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(mapping.generateJs());

        js.append(jsBase).append(".data(").append(mapping.getJsBase()).append(");");

        return this;
    }

    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append("chart.listen('pointClick', function(e) {");
        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);
    }

    

    private UiColorRange getColorRange;

    /**
     * Getter for the current color range.
     */
    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;

    /**
     * Setter for the color range.
     */
    public TreeMap setColorRange(String colorRange) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));
            js.setLength(0);
        }
        return this;
    }


    private OrdinalColor getColorScale;

    /**
     * Getter for the color scale.
     */
    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }
    private OrdinalColor colorScale;
    private LinearColor colorScale1;
    private String colorScale2;
    private ScaleTypes colorScale3;
    private String colorScale4;
    private List<LinearColor> setColorScale = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public LinearColor setColorScale(OrdinalColor colorScale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(colorScale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));
        LinearColor item = new LinearColor("setColorScale" + variableIndex);
        setColorScale.add(item);
        return item;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale1 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public LinearColor setColorScale(LinearColor colorScale1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(colorScale1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
        LinearColor item = new LinearColor("setColorScale1" + variableIndex);
        setColorScale1.add(item);
        return item;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale2 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public LinearColor setColorScale(String colorScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale2" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", wrapQuotes(colorScale2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", wrapQuotes(colorScale2)));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale2" + variableIndex);
        setColorScale2.add(item);
        return item;
    }
    private String generateJSsetColorScale2() {
        if (!setColorScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale3 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public LinearColor setColorScale(ScaleTypes colorScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale3" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", ((colorScale3 != null) ? colorScale3.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", ((colorScale3 != null) ? colorScale3.generateJs() : "null")));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale3" + variableIndex);
        setColorScale3.add(item);
        return item;
    }
    private String generateJSsetColorScale3() {
        if (!setColorScale3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Tree getData;

    /**
     * Getter for the current data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the data.
     */
    public TreeMap data(List<DataEntry> data) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (!data.isEmpty()) {
            StringBuilder resultData = new StringBuilder();
            resultData.append("[");
            for (DataEntry dataEntry : data) {
                resultData.append(dataEntry.generateJs()).append(",");
            }
            resultData.setLength(resultData.length() - 1);
            resultData.append("]");

            js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s);", resultData.toString()));
        }
        return this;
    }


    /**
     * 
     */
    public TreeMap data(View mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  ((mapping != null) ? mapping.getJsBase() : "null")));
        return this;
    }

    private TreeDataItem target;
    private String[] target1;
    private String target2;

    /**
     * Drills down to target.
     */
    public void drillTo(TreeDataItem target) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(target.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".drillTo(%s);",  ((target != null) ? target.getJsBase() : "null")));
    }


    /**
     * Drills down to target.
     */
    public void drillTo(String[] target1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillTo(%s);", arrayToStringWrapQuotes(target1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", arrayToStringWrapQuotes(target1)));
            js.setLength(0);
        }
    }


    /**
     * Drills down to target.
     */
    public void drillTo(String target2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillTo(%s);", wrapQuotes(target2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", wrapQuotes(target2)));
            js.setLength(0);
        }
    }

    private Fill fill;

    /**
     * Sets fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap setFill(Fill fill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color;
    private Double opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public TreeMap fill(String color, Double opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TreeMap fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    /**
     * Getter for current hatch fill settings.
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
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness;
    private Double size;

    /**
     * Setter for the hatch fill settings.
     */
    public TreeMap setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public TreeMap setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public TreeMap setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public TreeMap setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public TreeMap setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    private UiLabelsFactory getHeaders;

    /**
     * Getter for the current point header labels.
     */
    public UiLabelsFactory getHeaders() {
        if (getHeaders == null)
            getHeaders = new UiLabelsFactory(jsBase + ".headers()");

        return getHeaders;
    }
    private String headers;
    private Boolean headers1;

    /**
     * Setter for the point header labels.
     */
    public TreeMap setHeaders(String headers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the point header labels.
     */
    public TreeMap setHeaders(Boolean headers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headers(%b)", headers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headers(%b)", headers1));
            js.setLength(0);
        }
        return this;
    }

    private LabelsDisplayMode headersDisplayMode;
    private String headersDisplayMode1;

    /**
     * Setter for the headers display mode.
     */
    public TreeMap setHeadersDisplayMode(LabelsDisplayMode headersDisplayMode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headersDisplayMode(%s)", ((headersDisplayMode != null) ? headersDisplayMode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headersDisplayMode(%s)", ((headersDisplayMode != null) ? headersDisplayMode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the headers display mode.
     */
    public TreeMap setHeadersDisplayMode(String headersDisplayMode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headersDisplayMode(%s)", wrapQuotes(headersDisplayMode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headersDisplayMode(%s)", wrapQuotes(headersDisplayMode1)));
            js.setLength(0);
        }
        return this;
    }

    private Double hintDepth;

    /**
     * Setter for the additional segmentation of treeMap points.
     */
    public TreeMap setHintDepth(Double hintDepth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hintDepth(%f)", hintDepth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hintDepth(%f)", hintDepth));
            js.setLength(0);
        }
        return this;
    }

    private Double hintOpacity;

    /**
     * Setter for current hint opacity.
     */
    public TreeMap setHintOpacity(Double hintOpacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hintOpacity(%f)", hintOpacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hintOpacity(%f)", hintOpacity));
            js.setLength(0);
        }
        return this;
    }


    private StateSettings getHovered;

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;

    /**
     * Setter for hovered state settings.
     */
    public TreeMap setHovered(String hovered) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
            js.setLength(0);
        }
        return this;
    }


    private UiLabelsFactory getLabels;

    /**
     * Getter for the current point labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;

    /**
     * Setter for the point labels.
     */
    public TreeMap setLabels(String labels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the point labels.
     */
    public TreeMap setLabels(Boolean labels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%b)", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersFactory getMarkers;

    /**
     * Getter for the current point markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }
    private String markers;
    private Boolean markers1;
    private String markers2;

    /**
     * Setter for the point markers.
     */
    public TreeMap setMarkers(String markers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the point markers.
     */
    public TreeMap setMarkers(Boolean markers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markers(%b)", markers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
            js.setLength(0);
        }
        return this;
    }

    private Double maxDepth;

    /**
     * Setter for the maximal drawing depth.
     */
    public TreeMap setMaxDepth(Double maxDepth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxDepth(%f)", maxDepth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxDepth(%f)", maxDepth));
            js.setLength(0);
        }
        return this;
    }

    private Double maxHeadersHeight;
    private String maxHeadersHeight1;

    /**
     * Setter for the maximum headers height.
     */
    public TreeMap setMaxHeadersHeight(Double maxHeadersHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHeadersHeight(%f)", maxHeadersHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHeadersHeight(%f)", maxHeadersHeight));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the maximum headers height.
     */
    public TreeMap setMaxHeadersHeight(String maxHeadersHeight1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHeadersHeight(%s)", wrapQuotes(maxHeadersHeight1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHeadersHeight(%s)", wrapQuotes(maxHeadersHeight1)));
            js.setLength(0);
        }
        return this;
    }


    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }
    private String normal;

    /**
     * Setter for normal state settings.
     */
    public TreeMap setNormal(String normal) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
            js.setLength(0);
        }
        return this;
    }


    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }
    private String selected;

    /**
     * Setter for selected state settings.
     */
    public TreeMap setSelected(String selected) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
            js.setLength(0);
        }
        return this;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    /**
     * Setter for the selection mode.
     */
    public TreeMap setSelectionMode(SelectionMode selectionMode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectionMode(%s)", ((selectionMode != null) ? selectionMode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", ((selectionMode != null) ? selectionMode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the selection mode.
     */
    public TreeMap setSelectionMode(String selectionMode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectionMode(%s)", wrapQuotes(selectionMode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", wrapQuotes(selectionMode1)));
            js.setLength(0);
        }
        return this;
    }

    private Sort sort;
    private String sort1;

    /**
     * Setter for the sort settings.<br/>
Ascending, Descending and No sorting is supported.
     */
    public TreeMap setSort(Sort sort) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", ((sort != null) ? sort.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", ((sort != null) ? sort.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the sort settings.<br/>
Ascending, Descending and No sorting is supported.
     */
    public TreeMap setSort(String sort1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", wrapQuotes(sort1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", wrapQuotes(sort1)));
            js.setLength(0);
        }
        return this;
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TreeMap setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TreeMap setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TreeMap setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String generateJSgetColorRange() {
        if (getColorRange != null) {
            return getColorRange.generateJs();
        }
        return "";
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHeaders() {
        if (getHeaders != null) {
            return getHeaders.generateJs();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetColorRange());
        js.append(generateJSgetColorScale());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHeaders());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetSelected());
        js.append(generateJSsetColorScale());
        js.append(generateJSsetColorScale1());
        js.append(generateJSsetColorScale2());
        js.append(generateJSsetColorScale3());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
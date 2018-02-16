package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * AnyChart HeatMap class.<br/>
<b>Note:</b> Use {@link anychart#heatMap} method to get an instance of this class.
 */
public class HeatMap extends SeparateChart {

    protected HeatMap(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
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

        ListenersInterface.getInstance().setOnClickListener(listener);
    }

    

    private OrdinalColor getColorScale;

    /**
     * Getter for the current color scale.
     */
    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }
    private OrdinalColor colorScale;
    private String colorScale1;
    private ScaleTypes colorScale2;
    private String colorScale3;

    /**
     * Setter for the color scale.
     */
    public HeatMap setColorScale(OrdinalColor colorScale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(colorScale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale != null) ? colorScale.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the color scale.
     */
    public HeatMap setColorScale(String colorScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", wrapQuotes(colorScale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", wrapQuotes(colorScale1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the color scale.
     */
    public HeatMap setColorScale(ScaleTypes colorScale2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", ((colorScale2 != null) ? colorScale2.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale2 != null) ? colorScale2.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private View getData;

    /**
     * Getter for the current chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the chart data.
     */
    public HeatMap setData(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public HeatMap setData(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", view.getJsBase()));
            js.setLength(0);
        }
        return this;
    }

    private Fill fill;

    /**
     * Sets fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap setFill(Fill fill) {
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


    /**
     * 
     */
    public HeatMap setFill(String json) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(json)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", wrapQuotes(json)));
            js.setLength(0);
        }
        return this;
    }

    private String color;
    private Number opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public HeatMap fill(String color, Number opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s)", wrapQuotes(color), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s)", wrapQuotes(color), opacity));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(GradientKey[] keys, Boolean mode, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(GradientKey[] keys, VectorRect mode1, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(GradientKey[] keys, String mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(String[] keys1, Boolean mode, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(String[] keys1, VectorRect mode1, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(String[] keys1, String mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public HeatMap fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    /**
     * Getter for the current hatch fill settings.
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
    private Number thickness;
    private Number size;

    /**
     * Setter for the hatch fill settings.
     */
    public HeatMap setHatchFill(PatternFill patternFillOrType, String color1, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public HeatMap setHatchFill(HatchFill patternFillOrType1, String color1, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public HeatMap setHatchFill(HatchFillType patternFillOrType2, String color1, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public HeatMap setHatchFill(String patternFillOrType3, String color1, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill settings.
     */
    public HeatMap setHatchFill(Boolean patternFillOrType4, String color1, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %s, %s)", patternFillOrType4, wrapQuotes(color1), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %s, %s)", patternFillOrType4, wrapQuotes(color1), thickness, size));
            js.setLength(0);
        }
        return this;
    }

    private Number indexOrIndexes;
    private Number[] indexOrIndexes1;

    /**
     * Hovers point by index.
<b>Note:</b> Works only after {@link anychart.charts.HeatMap#draw} is called.
     */
    public HeatMap hover(Number indexOrIndexes) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", indexOrIndexes));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Hovers point by index.
<b>Note:</b> Works only after {@link anychart.charts.HeatMap#draw} is called.
     */
    public HeatMap hover(Number[] indexOrIndexes1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexOrIndexes1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexOrIndexes1)));
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
    public HeatMap setHovered(String hovered) {
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
     * Getter for the current chart data labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;

    /**
     * Setter for the chart data labels.
     */
    public HeatMap setLabels(String labels) {
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
     * Setter for the chart data labels.
     */
    public HeatMap setLabels(Boolean labels1) {
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

    private LabelsDisplayMode labelsDisplayMode;
    private String labelsDisplayMode1;

    /**
     * Setter for the labels display mode.
     */
    public HeatMap setLabelsDisplayMode(LabelsDisplayMode labelsDisplayMode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", ((labelsDisplayMode != null) ? labelsDisplayMode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labelsDisplayMode(%s)", ((labelsDisplayMode != null) ? labelsDisplayMode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the labels display mode.
     */
    public HeatMap setLabelsDisplayMode(String labelsDisplayMode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", wrapQuotes(labelsDisplayMode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labelsDisplayMode(%s)", wrapQuotes(labelsDisplayMode1)));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersFactory getMarkers;

    /**
     * Getter for the current data markers.
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
     * Setter for data markers.
     */
    public HeatMap setMarkers(String markers) {
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
     * Setter for data markers.
     */
    public HeatMap setMarkers(Boolean markers1) {
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
    public HeatMap setNormal(String normal) {
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

    private Number indexOrIndexes2;
    private Number[] indexOrIndexes3;

    /**
     * Selects point by index.
<b>Note:</b> Works only after {@link anychart.charts.HeatMap#draw} is called.
     */
    public HeatMap select(Number indexOrIndexes2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", indexOrIndexes2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", indexOrIndexes2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects point by index.
<b>Note:</b> Works only after {@link anychart.charts.HeatMap#draw} is called.
     */
    public HeatMap select(Number[] indexOrIndexes3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexOrIndexes3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexOrIndexes3)));
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
    public HeatMap setSelected(String selected) {
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

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Number thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public HeatMap setStroke(Stroke color2, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * 
     */
    public HeatMap setStroke(String json) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s)", wrapQuotes(json)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", wrapQuotes(json)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public HeatMap setStroke(ColoredFill color3, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public HeatMap setStroke(String color4, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getXAxis;

    /**
     * Getter for the current chart X-axis.
     */
    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear(jsBase + ".xAxis()");

        return getXAxis;
    }

    private List<CoreAxesLinear> getXAxis1 = new ArrayList<>();

    /**
     * Getter for the current chart X-axis.
     */
    public CoreAxesLinear getXAxis(Number index) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the chart X-axis.
     */
    public HeatMap setXAxis(String xAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-axis.
     */
    public HeatMap setXAxis(Boolean xAxis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b)", xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
            js.setLength(0);
        }
        return this;
    }

    private Number index1;
    private String xAxis2;
    private Boolean xAxis3;

    /**
     * Setter for the chart X-axis by index.
     */
    public HeatMap setXAxis(String xAxis2, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-axis by index.
     */
    public HeatMap setXAxis(Boolean xAxis3, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index1));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getXGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsLinear(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsLinear> getXGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid(Number index2) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public HeatMap setXGrid(String xGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by X-scale.
     */
    public HeatMap setXGrid(Boolean xGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b)", xGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b)", xGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index3;
    private String xGrid2;
    private Boolean xGrid3;

    /**
     * Setter for the chart grid by index.
     */
    public HeatMap setXGrid(String xGrid2, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by index.
     */
    public HeatMap setXGrid(Boolean xGrid3, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getXScale;

    /**
     * Getter for the current chart X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private ScaleTypes xScale;
    private String xScale1;
    private Ordinal xScale2;

    /**
     * Setter for the chart X scale.
     */
    public HeatMap setXScale(ScaleTypes xScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", ((xScale != null) ? xScale.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale != null) ? xScale.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X scale.
     */
    public HeatMap setXScale(String xScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X scale.
     */
    public HeatMap setXScale(Ordinal xScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale2 != null) ? xScale2.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale2 != null) ? xScale2.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private ChartScroller getXScroller;

    /**
     * Getter for the current X scroller.
     */
    public ChartScroller getXScroller() {
        if (getXScroller == null)
            getXScroller = new ChartScroller(jsBase + ".xScroller()");

        return getXScroller;
    }
    private String xScroller;
    private Boolean xScroller1;

    /**
     * Setter for the X scroller.
     */
    public HeatMap setXScroller(String xScroller) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%s)", wrapQuotes(xScroller)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%s)", wrapQuotes(xScroller)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the X scroller.
     */
    public HeatMap setXScroller(Boolean xScroller1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%b)", xScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%b)", xScroller1));
            js.setLength(0);
        }
        return this;
    }


    private OrdinalZoom getXZoom;

    /**
     * Getter for X Zoom settings.
     */
    public OrdinalZoom getXZoom() {
        if (getXZoom == null)
            getXZoom = new OrdinalZoom(jsBase + ".xZoom()");

        return getXZoom;
    }
    private Number xZoom;
    private Boolean xZoom1;
    private String xZoom2;

    /**
     * Setter for X Zoom settings.
     */
    public HeatMap setXZoom(Number xZoom) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", xZoom));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for X Zoom settings.
     */
    public HeatMap setXZoom(Boolean xZoom1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%b)", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%b)", xZoom1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for X Zoom settings.
     */
    public HeatMap setXZoom(String xZoom2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", wrapQuotes(xZoom2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", wrapQuotes(xZoom2)));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getYAxis;

    /**
     * Getter for the current chart Y-axis.
     */
    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear(jsBase + ".yAxis()");

        return getYAxis;
    }

    private List<CoreAxesLinear> getYAxis1 = new ArrayList<>();

    /**
     * Getter for the current chart Y-axis.
     */
    public CoreAxesLinear getYAxis(Number index4) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index4+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the chart Y-axis.
     */
    public HeatMap setYAxis(String yAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-axis.
     */
    public HeatMap setYAxis(Boolean yAxis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b)", yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b)", yAxis1));
            js.setLength(0);
        }
        return this;
    }

    private Number index5;
    private String yAxis2;
    private Boolean yAxis3;

    /**
     * Setter for the chart Y-axis by index.
     */
    public HeatMap setYAxis(String yAxis2, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-axis by index.
     */
    public HeatMap setYAxis(Boolean yAxis3, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index5));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getYGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsLinear(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsLinear> getYGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getYGrid(Number index6) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index6+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public HeatMap setYGrid(String yGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by X-scale.
     */
    public HeatMap setYGrid(Boolean yGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b)", yGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b)", yGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index7;
    private String yGrid2;
    private Boolean yGrid3;

    /**
     * Setter for the chart grid by index.
     */
    public HeatMap setYGrid(String yGrid2, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by index.
     */
    public HeatMap setYGrid(Boolean yGrid3, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index7));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getYScale;

    /**
     * Getter for the current chart Y scale.
     */
    public Ordinal getYScale() {
        if (getYScale == null)
            getYScale = new Ordinal(jsBase + ".yScale()");

        return getYScale;
    }
    private ScaleTypes yScale;
    private String yScale1;
    private Ordinal yScale2;

    /**
     * Setter for the chart Y scale.
     */
    public HeatMap setYScale(ScaleTypes yScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", ((yScale != null) ? yScale.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale != null) ? yScale.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y scale.
     */
    public HeatMap setYScale(String yScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y scale.
     */
    public HeatMap setYScale(Ordinal yScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale2 != null) ? yScale2.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private ChartScroller getYScroller;

    /**
     * Getter for the current Y scroller.
     */
    public ChartScroller getYScroller() {
        if (getYScroller == null)
            getYScroller = new ChartScroller(jsBase + ".yScroller()");

        return getYScroller;
    }
    private String yScroller;
    private Boolean yScroller1;

    /**
     * Setter for the Y scroller.
     */
    public HeatMap setYScroller(String yScroller) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScroller(%s)", wrapQuotes(yScroller)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScroller(%s)", wrapQuotes(yScroller)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the Y scroller.
     */
    public HeatMap setYScroller(Boolean yScroller1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScroller(%b)", yScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScroller(%b)", yScroller1));
            js.setLength(0);
        }
        return this;
    }


    private OrdinalZoom getYZoom;

    /**
     * Getter for Y Zoom settings.
     */
    public OrdinalZoom getYZoom() {
        if (getYZoom == null)
            getYZoom = new OrdinalZoom(jsBase + ".yZoom()");

        return getYZoom;
    }
    private Number yZoom;
    private Boolean yZoom1;
    private String yZoom2;

    /**
     * Setter for Y Zoom settings.
     */
    public HeatMap setYZoom(Number yZoom) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%s)", yZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%s)", yZoom));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for Y Zoom settings.
     */
    public HeatMap setYZoom(Boolean yZoom1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%b)", yZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%b)", yZoom1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for Y Zoom settings.
     */
    public HeatMap setYZoom(String yZoom2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%s)", wrapQuotes(yZoom2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%s)", wrapQuotes(yZoom2)));
            js.setLength(0);
        }
        return this;
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

    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetXAxis1() {
        if (!getXAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesLinear item : getXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXGrid() {
        if (getXGrid != null) {
            return getXGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetXGrid1() {
        if (!getXGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetXScroller() {
        if (getXScroller != null) {
            return getXScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetXZoom() {
        if (getXZoom != null) {
            return getXZoom.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis() {
        if (getYAxis != null) {
            return getYAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis1() {
        if (!getYAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesLinear item : getYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYGrid() {
        if (getYGrid != null) {
            return getYGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetYGrid1() {
        if (!getYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScroller() {
        if (getYScroller != null) {
            return getYScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetYZoom() {
        if (getYZoom != null) {
            return getYZoom.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetColorScale());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetSelected());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXGrid());
        js.append(generateJSgetXGrid1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetXScroller());
        js.append(generateJSgetXZoom());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSgetYScroller());
        js.append(generateJSgetYZoom());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
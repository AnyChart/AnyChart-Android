package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Sunburst Class.<br/>
<b>Note:</b> Use {@link anychart#sunburst} method to get an instance of this class.<br/>
{docs:Basic_Charts/Sunburst_Chart}Learn more about Sunburst Chart{docs}
 */
public class Sunburst extends SeparateChart {

    protected Sunburst(String name) {
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

    
    private SunburstCalculationMode mode;
    private String mode1;

    /**
     * Setter for the calculation mode.<br/>
The calculateMode() method allows to change the appearance and location of points in the Sunburst chart relative
to the calculated values. Learn more about permitted values at {@link anychart.enums.SunburstCalculationMode}
     */
    public Sunburst setCalculationMode(SunburstCalculationMode mode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".calculationMode(%s)", ((mode != null) ? mode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".calculationMode(%s)", ((mode != null) ? mode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the calculation mode.<br/>
The calculateMode() method allows to change the appearance and location of points in the Sunburst chart relative
to the calculated values. Learn more about permitted values at {@link anychart.enums.SunburstCalculationMode}
     */
    public Sunburst setCalculationMode(String mode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".calculationMode(%s)", wrapQuotes(mode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".calculationMode(%s)", wrapQuotes(mode1)));
            js.setLength(0);
        }
        return this;
    }


    private UiCenter getCenter;

    /**
     * Getter for center settings.
     */
    public UiCenter getCenter() {
        if (getCenter == null)
            getCenter = new UiCenter(jsBase + ".center()");

        return getCenter;
    }
    private String centerSettings;

    /**
     * Setter for center settings.
     */
    public Sunburst setCenter(String centerSettings) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".center(%s)", wrapQuotes(centerSettings)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".center(%s)", wrapQuotes(centerSettings)));
            js.setLength(0);
        }
        return this;
    }


    private Tree getData;

    /**
     * Getter for the data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the data.
     */
    public Sunburst setData(List<DataEntry> data, TreeFillingMethod fillMethod) {
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

        js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", resultData.toString(), fillMethod.generateJs()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", resultData.toString(), fillMethod.generateJs()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public Sunburst setData(View view) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", ((target != null) ? target.getJsBase() : "null")));
            js.setLength(0);
        }
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

    private Fill color;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst setFill(Fill color) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", ((color != null) ? color.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((color != null) ? color.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * 
     */
    public Sunburst setFill(String json) {
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

    private String color1;
    private Number opacity;

    /**
     * Setter for the fill color with opacity. Fill as a string or an object.
     */
    public Sunburst setFill(String color1, Number opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s)", wrapQuotes(color1), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s)", wrapQuotes(color1), opacity));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode2;
    private VectorRect mode3;
    private String mode4;
    private Number opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(GradientKey[] keys, Boolean mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(GradientKey[] keys, VectorRect mode3, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), ((mode3 != null) ? mode3.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), ((mode3 != null) ? mode3.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(GradientKey[] keys, String mode4, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode4), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode4), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(String[] keys1, Boolean mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(String[] keys1, VectorRect mode3, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode3 != null) ? mode3.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode3 != null) ? mode3.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(String[] keys1, String mode4, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode4), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode4), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode5;
    private Number opacity2;
    private Number fx;
    private Number fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode5, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode5 != null) ? mode5.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode5 != null) ? mode5.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sunburst fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode5, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode5 != null) ? mode5.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode5 != null) ? mode5.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    /**
     * Getter for the hatch fill.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }
    private Boolean enabled;

    /**
     * Setter for the hatch fill using boolean.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sunburst setHatchFill(Boolean enabled) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b)", enabled));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b)", enabled));
            js.setLength(0);
        }
        return this;
    }

    private PatternFill patternHatchFill;

    /**
     * Setter for the hatch fill using pattern.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sunburst setHatchFill(PatternFill patternHatchFill) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(patternHatchFill.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFill(%s);",  ((patternHatchFill != null) ? patternHatchFill.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s)", ((patternHatchFill != null) ? patternHatchFill.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private HatchFill settings;

    /**
     * Setter for hatch fill using an instance.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sunburst setHatchFill(HatchFill settings) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(settings.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFill(%s);",  ((settings != null) ? settings.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s)", ((settings != null) ? settings.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private HatchFillType type;
    private String type1;
    private String color2;
    private Number thickness;
    private Number size;

    /**
     * Setter for the hatch fill using several parameters.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sunburst setHatchFill(HatchFillType type, String color2, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((type != null) ? type.generateJs() : "null"), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", ((type != null) ? type.generateJs() : "null"), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the hatch fill using several parameters.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sunburst setHatchFill(String type1, String color2, Number thickness, Number size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", wrapQuotes(type1), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %s, %s)", wrapQuotes(type1), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    private HatchFills getHatchFillPalette;

    /**
     * Getter for hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }
    private HatchFillType[] settings1;
    private String settings2;
    private HatchFills settings3;

    /**
     * Setter for hatch fill palette settings.<br/>
<b>Note:</b> Works only with {@link anychart.charts.Sunburst#hatchFill} method.
     */
    public Sunburst setHatchFillPalette(HatchFillType[] settings1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(settings1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(settings1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill palette settings.<br/>
<b>Note:</b> Works only with {@link anychart.charts.Sunburst#hatchFill} method.
     */
    public Sunburst setHatchFillPalette(String settings2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(settings2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(settings2)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill palette settings.<br/>
<b>Note:</b> Works only with {@link anychart.charts.Sunburst#hatchFill} method.
     */
    public Sunburst setHatchFillPalette(HatchFills settings3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(settings3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((settings3 != null) ? settings3.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", ((settings3 != null) ? settings3.getJsBase() : "null")));
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
    private String settings4;

    /**
     * Setter for hovered state settings.
     */
    public Sunburst setHovered(String settings4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(settings4)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(settings4)));
            js.setLength(0);
        }
        return this;
    }

    private String innerRadius;
    private Number innerRadius1;

    /**
     * Setter for the inner radius.
     */
    public Sunburst setInnerRadius(String innerRadius) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the inner radius.
     */
    public Sunburst setInnerRadius(Number innerRadius1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));
            js.setLength(0);
        }
        return this;
    }


    private UiLabelsFactory getLabels;

    /**
     * Getter for labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String settings5;
    private Boolean settings6;

    /**
     * Setter for the labels.
     */
    public Sunburst setLabels(String settings5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(settings5)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(settings5)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the labels.
     */
    public Sunburst setLabels(Boolean settings6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%b)", settings6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", settings6));
            js.setLength(0);
        }
        return this;
    }

    private String settings7;
    private Boolean settings8;

    /**
     * Setter for leaves settings.
     */
    public Sunburst setLeaves(String settings7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".leaves(%s)", wrapQuotes(settings7)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".leaves(%s)", wrapQuotes(settings7)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for leaves settings.
     */
    public Sunburst setLeaves(Boolean settings8) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".leaves(%b)", settings8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".leaves(%b)", settings8));
            js.setLength(0);
        }
        return this;
    }

    private Number index1;
    private String settings9;
    private Boolean settings10;

    /**
     * Setter for levels settings.
     */
    public Sunburst setLevel(String settings9, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".level(%s, %s)", wrapQuotes(settings9), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".level(%s, %s)", wrapQuotes(settings9), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for levels settings.
     */
    public Sunburst setLevel(Boolean settings10, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".level(%b, %s)", settings10, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".level(%b, %s)", settings10, index1));
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
    private String settings11;

    /**
     * Setter for normal state settings.
     */
    public Sunburst setNormal(String settings11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(settings11)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(settings11)));
            js.setLength(0);
        }
        return this;
    }


    private RangeColors getPalette;

    /**
     * Getter for the palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }
    private RangeColors settings12;
    private DistinctColors settings13;
    private String settings14;
    private String[] settings15;

    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Sunburst setPalette(RangeColors settings12) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(settings12.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((settings12 != null) ? settings12.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((settings12 != null) ? settings12.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Sunburst setPalette(DistinctColors settings13) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(settings13.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((settings13 != null) ? settings13.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((settings13 != null) ? settings13.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Sunburst setPalette(String settings14) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(settings14)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(settings14)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Sunburst setPalette(String[] settings15) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(settings15)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(settings15)));
            js.setLength(0);
        }
        return this;
    }

    private String radius;
    private Number radius1;

    /**
     * Setter for the outer radius.
     */
    public Sunburst setRadius(String radius) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the outer radius.
     */
    public Sunburst setRadius(Number radius1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".radius(%s)", radius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", radius1));
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
    private String settings16;

    /**
     * Setter for selected state settings.
     */
    public Sunburst setSelected(String settings16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(settings16)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(settings16)));
            js.setLength(0);
        }
        return this;
    }

    private Sort mode6;
    private String mode7;

    /**
     * Setter for the sorting settings using string.<br/>
Ascending, Descending and No sorting is supported.
     */
    public Sunburst setSort(Sort mode6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", ((mode6 != null) ? mode6.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", ((mode6 != null) ? mode6.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the sorting settings using string.<br/>
Ascending, Descending and No sorting is supported.
     */
    public Sunburst setSort(String mode7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", wrapQuotes(mode7)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", wrapQuotes(mode7)));
            js.setLength(0);
        }
        return this;
    }

    private String startAngle;
    private Number startAngle1;

    /**
     * Setter for the angle.
     */
    public Sunburst setStartAngle(String startAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the angle.
     */
    public Sunburst setStartAngle(Number startAngle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", startAngle1));
            js.setLength(0);
        }
        return this;
    }

    private Stroke color3;
    private ColoredFill color4;
    private String color5;
    private Number thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sunburst setStroke(Stroke color3, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
     * 
     */
    public Sunburst setStroke(String json) {
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
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sunburst setStroke(ColoredFill color4, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sunburst setStroke(String color5, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String generateJSgetCenter() {
        if (getCenter != null) {
            return getCenter.generateJs();
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

    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
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

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
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
        js.append(generateJSgetCenter());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetSelected());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// chart class
/**
 * Venn chart class.
 */
public class Venn extends SeparateChart {

    protected Venn(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public Venn setData(SingleValueDataSet data) {
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

    public Venn setData(List<DataEntry> data) {
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

    public Venn setData(List<DataEntry> data, TreeFillingMethod mode) {
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

    public Venn setData(Mapping mapping) {
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

    

    private View getData;

    /**
     * Getter for the chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private List<Venn> setData = new ArrayList<>();

    /**
     * Setter for the data for the chart.
     */
    public Venn data(List<DataEntry> data) {
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
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setData1 = new ArrayList<>();

    /**
     * 
     */
    public Venn data(View mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  ((mapping != null) ? mapping.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String dataSeparator;
    private List<Venn> setDataSeparator = new ArrayList<>();

    /**
     * Setter for the data separator.
     */
    public Venn setDataSeparator(String dataSeparator) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".dataSeparator(%s)", wrapQuotes(dataSeparator)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".dataSeparator(%s)", wrapQuotes(dataSeparator)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDataSeparator() {
        if (!setDataSeparator.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setDataSeparator) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<Venn> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn setFill(Fill fill) {
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
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<Venn> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Venn fill(String color, Double opacity) {
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
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill1) {
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
    private List<Venn> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill7) {
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
    private List<Venn> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Venn fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
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
    private List<Venn> setHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Venn setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
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
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Venn setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
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
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Venn setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
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
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Venn setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
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
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFill4 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Venn setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
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
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private HatchFills getHatchFillPalette;

    /**
     * Getter for chart hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }
    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;
    private List<Venn> setHatchFillPalette = new ArrayList<>();

    /**
     * Setter for the chart hatch fill palette settings.
     */
    public Venn setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette() {
        if (!setHatchFillPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFillPalette1 = new ArrayList<>();

    /**
     * Setter for the chart hatch fill palette settings.
     */
    public Venn setHatchFillPalette(String hatchFillPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette1() {
        if (!setHatchFillPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setHatchFillPalette2 = new ArrayList<>();

    /**
     * Setter for the chart hatch fill palette settings.
     */
    public Venn setHatchFillPalette(HatchFills hatchFillPalette2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(hatchFillPalette2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetHatchFillPalette2() {
        if (!setHatchFillPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private List<Venn> setHover = new ArrayList<>();

    /**
     * Hovers point by index.
     */
    public Venn hover(Double index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f)", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f)", index));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes;
    private List<Venn> setHover1 = new ArrayList<>();

    /**
     * Hovers points by indexes.
     */
    public Venn hover(Double[] indexes) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexes)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexes)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover1() {
        if (!setHover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Venn> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public Venn setHovered(String hovered) {
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
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Intersections getIntersections;

    /**
     * Getter for intersections settings.
     */
    public Intersections getIntersections() {
        if (getIntersections == null)
            getIntersections = new Intersections(jsBase + ".intersections()");

        return getIntersections;
    }
    private String intersections;
    private List<Venn> setIntersections = new ArrayList<>();

    /**
     * Setter for intersections settings.
     */
    public Venn setIntersections(String intersections) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".intersections(%s)", wrapQuotes(intersections)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".intersections(%s)", wrapQuotes(intersections)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetIntersections() {
        if (!setIntersections.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setIntersections) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiLabelsFactory getLabels;

    /**
     * Getter for venn labels settings.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<Venn> setLabels = new ArrayList<>();

    /**
     * Setter for venn labels settings.
     */
    public Venn setLabels(String labels) {
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
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setLabels1 = new ArrayList<>();

    /**
     * Setter for venn labels settings.
     */
    public Venn setLabels(Boolean labels1) {
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
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Markers getMarkerPalette;

    /**
     * Getter for chart markers palette settings.
     */
    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers(jsBase + ".markerPalette()");

        return getMarkerPalette;
    }
    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;
    private String[] markerPalette3;
    private List<Venn> setMarkerPalette = new ArrayList<>();

    /**
     * Setter for chart markers palette settings.
     */
    public Venn setMarkerPalette(Markers markerPalette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(markerPalette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setMarkerPalette1 = new ArrayList<>();

    /**
     * Setter for chart markers palette settings.
     */
    public Venn setMarkerPalette(String markerPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette1() {
        if (!setMarkerPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setMarkerPalette2 = new ArrayList<>();

    /**
     * Setter for chart markers palette settings.
     */
    public Venn setMarkerPalette(MarkerType[] markerPalette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setMarkerPalette3 = new ArrayList<>();

    /**
     * Setter for chart markers palette settings.
     */
    public Venn setMarkerPalette(String[] markerPalette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette3() {
        if (!setMarkerPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiMarkersFactory getMarkers;

    /**
     * Getter for data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }
    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<Venn> setMarkers = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public Venn setMarkers(String markers) {
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
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setMarkers1 = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public Venn setMarkers(Boolean markers1) {
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
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Venn> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public Venn setNormal(String normal) {
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
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private RangeColors getPalette;

    /**
     * Getter for the venn palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }
    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;
    private List<Venn> setPalette = new ArrayList<>();

    /**
     * Setter for the venn palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Venn setPalette(RangeColors palette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setPalette1 = new ArrayList<>();

    /**
     * Setter for the venn palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Venn setPalette(DistinctColors palette1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setPalette2 = new ArrayList<>();

    /**
     * Setter for the venn palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Venn setPalette(String palette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setPalette3 = new ArrayList<>();

    /**
     * Setter for the venn palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Venn setPalette(String[] palette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<Venn> setSelect = new ArrayList<>();

    /**
     * Selects point by index.
     */
    public Venn select(Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f)", index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexes1;
    private Double[] indexes2;
    private List<Venn> setSelect1 = new ArrayList<>();

    /**
     * Selects point by indexes.
     */
    public Venn select(Double[] indexes2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setSelect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Venn> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public Venn setSelected(String selected) {
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
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Venn> setStroke = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Venn setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setStroke1 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Venn setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setStroke2 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Venn setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;
    private List<Venn> setUnhover = new ArrayList<>();

    /**
     * Removes hover from the series point or series.
     */
    public Venn unhover(Double indexOrIndexes) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%f)", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%f)", indexOrIndexes));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover() {
        if (!setUnhover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setUnhover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Venn> setUnhover1 = new ArrayList<>();

    /**
     * Removes hover from the series point or series.
     */
    public Venn unhover(Double[] indexOrIndexes1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%s)", Arrays.toString(indexOrIndexes1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%s)", Arrays.toString(indexOrIndexes1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover1() {
        if (!setUnhover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setUnhover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private List<Venn> setUnselect = new ArrayList<>();

    /**
     * Deselects selected point by index.
     */
    public Venn unselect(Double index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unselect(%f)", index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unselect(%f)", index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnselect() {
        if (!setUnselect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setUnselect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes3;
    private List<Venn> setUnselect1 = new ArrayList<>();

    /**
     * Deselects selected points by indexes.
     */
    public Venn unselect(Double[] indexes3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unselect(%s)", Arrays.toString(indexes3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unselect(%s)", Arrays.toString(indexes3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnselect1() {
        if (!setUnselect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Venn item : setUnselect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

    private String generateJSgetIntersections() {
        if (getIntersections != null) {
            return getIntersections.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
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
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetIntersections());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetSelected());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetDataSeparator());
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
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHover());
        js.append(generateJSsetHover1());
        js.append(generateJSsetHovered());
        js.append(generateJSsetIntersections());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMarkerPalette3());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetUnhover());
        js.append(generateJSsetUnhover1());
        js.append(generateJSsetUnselect());
        js.append(generateJSsetUnselect1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
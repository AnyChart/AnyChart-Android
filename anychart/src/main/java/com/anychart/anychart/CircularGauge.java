package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Circular gauge class.
 */
public class CircularGauge extends Chart {

    protected CircularGauge(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public CircularGauge setData(SingleValueDataSet data) {
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

    public CircularGauge setData(List<DataEntry> data) {
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

    public CircularGauge setData(List<DataEntry> data, TreeFillingMethod mode) {
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

    

    private Circular getAxis;

    /**
     * Getter for default gauge axis settings.
     */
    public Circular getAxis() {
        if (getAxis == null)
            getAxis = new Circular(jsBase + ".axis()");

        return getAxis;
    }
    private String axis;
    private Boolean axis1;
    private List<CircularGauge> setAxis = new ArrayList<>();

    /**
     * Setter for the gauge axis settings.
     */
    public CircularGauge setAxis(String axis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis() {
        if (!setAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setAxis1 = new ArrayList<>();

    /**
     * Setter for the gauge axis settings.
     */
    public CircularGauge setAxis(Boolean axis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b)", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b)", axis1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis1() {
        if (!setAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private String axis2;
    private Boolean axis3;
    private List<CircularGauge> setAxis2 = new ArrayList<>();

    /**
     * Setter for the gauge axis by index.
     */
    public CircularGauge setAxis(String axis2, Double index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s, %f)", wrapQuotes(axis2), index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s, %f)", wrapQuotes(axis2), index));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis2() {
        if (!setAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setAxis3 = new ArrayList<>();

    /**
     * Setter for the gauge axis by index.
     */
    public CircularGauge setAxis(Boolean axis3, Double index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b, %f)", axis3, index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b, %f)", axis3, index));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis3() {
        if (!setAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private GaugePointersBar getBar;

    /**
     * Getter for the bar pointer.
     */
    public GaugePointersBar getBar() {
        if (getBar == null)
            getBar = new GaugePointersBar(jsBase + ".bar()");

        return getBar;
    }

    private List<GaugePointersBar> getBar1 = new ArrayList<>();

    /**
     * Getter for the bar pointer.
     */
    public GaugePointersBar getBar(Double index1) {
        GaugePointersBar item = new GaugePointersBar(jsBase + ".bar("+ index1+")");
        getBar1.add(item);
        return item;
    }
    private String bar;
    private Boolean bar1;
    private List<CircularGauge> setBar = new ArrayList<>();

    /**
     * Setter for the first bar pointer.
     */
    public CircularGauge setBar(String bar) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%s)", wrapQuotes(bar)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%s)", wrapQuotes(bar)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBar() {
        if (!setBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setBar1 = new ArrayList<>();

    /**
     * Setter for the first bar pointer.
     */
    public CircularGauge setBar(Boolean bar1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%b)", bar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%b)", bar1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBar1() {
        if (!setBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private String bar2;
    private Boolean bar3;
    private List<CircularGauge> setBar2 = new ArrayList<>();

    /**
     * Setter for the bar pointer by index.
     */
    public CircularGauge setBar(String bar2, Double index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%s, %f)", wrapQuotes(bar2), index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%s, %f)", wrapQuotes(bar2), index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBar2() {
        if (!setBar2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setBar2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setBar3 = new ArrayList<>();

    /**
     * Setter for the bar pointer by index.
     */
    public CircularGauge setBar(Boolean bar3, Double index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%b, %f)", bar3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%b, %f)", bar3, index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBar3() {
        if (!setBar3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setBar3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Cap getCap;

    /**
     * Getter for the gauge cap.
     */
    public Cap getCap() {
        if (getCap == null)
            getCap = new Cap(jsBase + ".cap()");

        return getCap;
    }
    private String cap;
    private Boolean cap1;
    private List<CircularGauge> setCap = new ArrayList<>();

    /**
     * Setter for the gauge cap.
     */
    public CircularGauge setCap(String cap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cap(%s)", wrapQuotes(cap)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cap(%s)", wrapQuotes(cap)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCap() {
        if (!setCap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setCap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setCap1 = new ArrayList<>();

    /**
     * Setter for the gauge cap.
     */
    public CircularGauge setCap(Boolean cap1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cap(%b)", cap1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cap(%b)", cap1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCap1() {
        if (!setCap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setCap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double circularPadding;
    private String circularPadding1;
    private List<CircularGauge> setCircularPadding = new ArrayList<>();

    /**
     * Setter for circular space around the gauge.
     */
    public CircularGauge setCircularPadding(Double circularPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".circularPadding(%f)", circularPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".circularPadding(%f)", circularPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCircularPadding() {
        if (!setCircularPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setCircularPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setCircularPadding1 = new ArrayList<>();

    /**
     * Setter for circular space around the gauge.
     */
    public CircularGauge setCircularPadding(String circularPadding1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".circularPadding(%s)", wrapQuotes(circularPadding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".circularPadding(%s)", wrapQuotes(circularPadding1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCircularPadding1() {
        if (!setCircularPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setCircularPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for pointers mapping.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private List<CircularGauge> setData = new ArrayList<>();

    /**
     * Setter for pointers mapping
     */
    public CircularGauge data(List<DataEntry> data) {
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
            for (CircularGauge item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean encloseWithStraightLine;
    private List<CircularGauge> setEncloseWithStraightLine = new ArrayList<>();

    /**
     * Setter for enclosing frame path with a straight line.
     */
    public CircularGauge setEncloseWithStraightLine(Boolean encloseWithStraightLine) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".encloseWithStraightLine(%b)", encloseWithStraightLine));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".encloseWithStraightLine(%b)", encloseWithStraightLine));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetEncloseWithStraightLine() {
        if (!setEncloseWithStraightLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setEncloseWithStraightLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private String fill1;
    private List<CircularGauge> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge setFill(Fill fill) {
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
            for (CircularGauge item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill1 = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge setFill(String fill1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<CircularGauge> setFill2 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public CircularGauge fill(String color, Double opacity) {
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
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill2) {
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
    private List<CircularGauge> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill8 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill8) {
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
    private List<CircularGauge> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setFill10 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularGauge fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill10() {
        if (!setFill10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setFill10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;

    private Knob getKnob;

    /**
     * Getter for the knob pointer.
     */
    public Knob getKnob() {
        if (getKnob == null)
            getKnob = new Knob(jsBase + ".knob()");

        return getKnob;
    }

    private List<Knob> getKnob1 = new ArrayList<>();

    /**
     * Getter for the knob pointer.
     */
    public Knob getKnob(Double index3) {
        Knob item = new Knob(jsBase + ".knob("+ index3+")");
        getKnob1.add(item);
        return item;
    }
    private String knob;
    private Boolean knob1;
    private List<CircularGauge> setKnob = new ArrayList<>();

    /**
     * Setter for the first knob pointer.
     */
    public CircularGauge setKnob(String knob) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%s)", wrapQuotes(knob)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%s)", wrapQuotes(knob)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetKnob() {
        if (!setKnob.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setKnob) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setKnob1 = new ArrayList<>();

    /**
     * Setter for the first knob pointer.
     */
    public CircularGauge setKnob(Boolean knob1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%b)", knob1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%b)", knob1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetKnob1() {
        if (!setKnob1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setKnob1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index4;
    private String knob2;
    private Boolean knob3;
    private List<CircularGauge> setKnob2 = new ArrayList<>();

    /**
     * Setter for the knob pointer by index.
     */
    public CircularGauge setKnob(String knob2, Double index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%s, %f)", wrapQuotes(knob2), index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%s, %f)", wrapQuotes(knob2), index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetKnob2() {
        if (!setKnob2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setKnob2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setKnob3 = new ArrayList<>();

    /**
     * Setter for the knob pointer by index.
     */
    public CircularGauge setKnob(Boolean knob3, Double index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%b, %f)", knob3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%b, %f)", knob3, index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetKnob3() {
        if (!setKnob3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setKnob3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private GaugePointersMarker getMarker;

    /**
     * Getter for the marker pointer.
     */
    public GaugePointersMarker getMarker() {
        if (getMarker == null)
            getMarker = new GaugePointersMarker(jsBase + ".marker()");

        return getMarker;
    }

    private List<GaugePointersMarker> getMarker1 = new ArrayList<>();

    /**
     * Getter for the marker pointer.
     */
    public GaugePointersMarker getMarker(Double index5) {
        GaugePointersMarker item = new GaugePointersMarker(jsBase + ".marker("+ index5+")");
        getMarker1.add(item);
        return item;
    }
    private String marker;
    private Boolean marker1;
    private List<CircularGauge> setMarker = new ArrayList<>();

    /**
     * Setter for the first marker pointer.
     */
    public CircularGauge setMarker(String marker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%s)", wrapQuotes(marker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%s)", wrapQuotes(marker)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setMarker1 = new ArrayList<>();

    /**
     * Setter for the first marker pointer.
     */
    public CircularGauge setMarker(Boolean marker1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%b)", marker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%b)", marker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index6;
    private String marker2;
    private Boolean marker3;
    private List<CircularGauge> setMarker2 = new ArrayList<>();

    /**
     * Setter for the marker pointer by index.
     */
    public CircularGauge setMarker(String marker2, Double index6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%s, %f)", wrapQuotes(marker2), index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%s, %f)", wrapQuotes(marker2), index6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setMarker3 = new ArrayList<>();

    /**
     * Setter for the marker pointer by index.
     */
    public CircularGauge setMarker(Boolean marker3, Double index6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%b, %f)", marker3, index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%b, %f)", marker3, index6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Needle getNeedle;

    /**
     * Getter for the needle pointer.
     */
    public Needle getNeedle() {
        if (getNeedle == null)
            getNeedle = new Needle(jsBase + ".needle()");

        return getNeedle;
    }

    private List<Needle> getNeedle1 = new ArrayList<>();

    /**
     * Getter for the needle pointer.
     */
    public Needle getNeedle(Double index7) {
        Needle item = new Needle(jsBase + ".needle("+ index7+")");
        getNeedle1.add(item);
        return item;
    }
    private String needle;
    private Boolean needle1;
    private List<CircularGauge> setNeedle = new ArrayList<>();

    /**
     * Setter for the first needle pointer.
     */
    public CircularGauge setNeedle(String needle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%s)", wrapQuotes(needle)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%s)", wrapQuotes(needle)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNeedle() {
        if (!setNeedle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setNeedle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setNeedle1 = new ArrayList<>();

    /**
     * Setter for the first needle pointer.
     */
    public CircularGauge setNeedle(Boolean needle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%b)", needle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%b)", needle1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNeedle1() {
        if (!setNeedle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setNeedle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index8;
    private String needle2;
    private Boolean needle3;
    private List<CircularGauge> setNeedle2 = new ArrayList<>();

    /**
     * Setter for the needle pointer by index.
     */
    public CircularGauge setNeedle(String needle2, Double index8) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%s, %f)", wrapQuotes(needle2), index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%s, %f)", wrapQuotes(needle2), index8));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNeedle2() {
        if (!setNeedle2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setNeedle2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setNeedle3 = new ArrayList<>();

    /**
     * Setter for the needle pointer by index.
     */
    public CircularGauge setNeedle(Boolean needle3, Double index8) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%b, %f)", needle3, index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%b, %f)", needle3, index8));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNeedle3() {
        if (!setNeedle3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setNeedle3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CircularRange getRange;

    /**
     * Getter for the circular range.
     */
    public CircularRange getRange() {
        if (getRange == null)
            getRange = new CircularRange(jsBase + ".range()");

        return getRange;
    }

    private List<CircularRange> getRange1 = new ArrayList<>();

    /**
     * Getter for the circular range.
     */
    public CircularRange getRange(Double index9) {
        CircularRange item = new CircularRange(jsBase + ".range("+ index9+")");
        getRange1.add(item);
        return item;
    }
    private String range;
    private Boolean range1;
    private List<CircularGauge> setRange = new ArrayList<>();

    /**
     * Setter for the circular first range settings.
     */
    public CircularGauge setRange(String range) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s)", wrapQuotes(range)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s)", wrapQuotes(range)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange() {
        if (!setRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setRange1 = new ArrayList<>();

    /**
     * Setter for the circular first range settings.
     */
    public CircularGauge setRange(Boolean range1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b)", range1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b)", range1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange1() {
        if (!setRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index10;
    private String range2;
    private Boolean range3;
    private List<CircularGauge> setRange2 = new ArrayList<>();

    /**
     * Setter for the circular range settings by index.
     */
    public CircularGauge setRange(String range2, Double index10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s, %f)", wrapQuotes(range2), index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s, %f)", wrapQuotes(range2), index10));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange2() {
        if (!setRange2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setRange2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setRange3 = new ArrayList<>();

    /**
     * Setter for the circular range settings by index.
     */
    public CircularGauge setRange(Boolean range3, Double index10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b, %f)", range3, index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b, %f)", range3, index10));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange3() {
        if (!setRange3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setRange3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String startAngle;
    private Double startAngle1;
    private List<CircularGauge> setStartAngle = new ArrayList<>();

    /**
     * Setter for the start angle.
     */
    public CircularGauge setStartAngle(String startAngle) {
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
    private String generateJSsetStartAngle() {
        if (!setStartAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setStartAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setStartAngle1 = new ArrayList<>();

    /**
     * Setter for the start angle.
     */
    public CircularGauge setStartAngle(Double startAngle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%f)", startAngle1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartAngle1() {
        if (!setStartAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setStartAngle1) {
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
    private List<CircularGauge> setStroke = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setStroke2 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String sweepAngle;
    private Double sweepAngle1;
    private List<CircularGauge> setSweepAngle = new ArrayList<>();

    /**
     * Setter for the gauge sweep angle.
     */
    public CircularGauge setSweepAngle(String sweepAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sweepAngle(%s)", wrapQuotes(sweepAngle)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sweepAngle(%s)", wrapQuotes(sweepAngle)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSweepAngle() {
        if (!setSweepAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setSweepAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularGauge> setSweepAngle1 = new ArrayList<>();

    /**
     * Setter for the gauge sweep angle.
     */
    public CircularGauge setSweepAngle(Double sweepAngle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sweepAngle(%f)", sweepAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sweepAngle(%f)", sweepAngle1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSweepAngle1() {
        if (!setSweepAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularGauge item : setSweepAngle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetBar() {
        if (getBar != null) {
            return getBar.generateJs();
        }
        return "";
    }

    private String generateJSgetBar1() {
        if (!getBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersBar item : getBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetCap() {
        if (getCap != null) {
            return getCap.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetKnob() {
        if (getKnob != null) {
            return getKnob.generateJs();
        }
        return "";
    }

    private String generateJSgetKnob1() {
        if (!getKnob1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Knob item : getKnob1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMarker() {
        if (getMarker != null) {
            return getMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetMarker1() {
        if (!getMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : getMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetNeedle() {
        if (getNeedle != null) {
            return getNeedle.generateJs();
        }
        return "";
    }

    private String generateJSgetNeedle1() {
        if (!getNeedle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : getNeedle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetRange() {
        if (getRange != null) {
            return getRange.generateJs();
        }
        return "";
    }

    private String generateJSgetRange1() {
        if (!getRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : getRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetAxis());
        js.append(generateJSgetBar());
        js.append(generateJSgetBar1());
        js.append(generateJSgetCap());
        js.append(generateJSgetData());
        js.append(generateJSgetKnob());
        js.append(generateJSgetKnob1());
        js.append(generateJSgetMarker());
        js.append(generateJSgetMarker1());
        js.append(generateJSgetNeedle());
        js.append(generateJSgetNeedle1());
        js.append(generateJSgetRange());
        js.append(generateJSgetRange1());
        js.append(generateJSsetAxis());
        js.append(generateJSsetAxis1());
        js.append(generateJSsetAxis2());
        js.append(generateJSsetAxis3());
        js.append(generateJSsetBar());
        js.append(generateJSsetBar1());
        js.append(generateJSsetBar2());
        js.append(generateJSsetBar3());
        js.append(generateJSsetCap());
        js.append(generateJSsetCap1());
        js.append(generateJSsetCircularPadding());
        js.append(generateJSsetCircularPadding1());
        js.append(generateJSsetData());
        js.append(generateJSsetEncloseWithStraightLine());
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
        js.append(generateJSsetKnob());
        js.append(generateJSsetKnob1());
        js.append(generateJSsetKnob2());
        js.append(generateJSsetKnob3());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetMarker2());
        js.append(generateJSsetMarker3());
        js.append(generateJSsetNeedle());
        js.append(generateJSsetNeedle1());
        js.append(generateJSsetNeedle2());
        js.append(generateJSsetNeedle3());
        js.append(generateJSsetRange());
        js.append(generateJSsetRange1());
        js.append(generateJSsetRange2());
        js.append(generateJSsetRange3());
        js.append(generateJSsetStartAngle());
        js.append(generateJSsetStartAngle1());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetSweepAngle());
        js.append(generateJSsetSweepAngle1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
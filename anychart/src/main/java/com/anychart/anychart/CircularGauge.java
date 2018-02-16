package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    private Number index;
    private String axis2;
    private Boolean axis3;

    /**
     * Setter for the gauge axis by index.
     */
    public CircularGauge setAxis(String axis2, Number index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s, %s)", wrapQuotes(axis2), index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s, %s)", wrapQuotes(axis2), index));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge axis by index.
     */
    public CircularGauge setAxis(Boolean axis3, Number index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b, %s)", axis3, index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b, %s)", axis3, index));
            js.setLength(0);
        }
        return this;
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
    public GaugePointersBar getBar(Number index1) {
        GaugePointersBar item = new GaugePointersBar(jsBase + ".bar("+ index1+")");
        getBar1.add(item);
        return item;
    }
    private String bar;
    private Boolean bar1;

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

    private Number index2;
    private String bar2;
    private Boolean bar3;

    /**
     * Setter for the bar pointer by index.
     */
    public CircularGauge setBar(String bar2, Number index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%s, %s)", wrapQuotes(bar2), index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%s, %s)", wrapQuotes(bar2), index2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the bar pointer by index.
     */
    public CircularGauge setBar(Boolean bar3, Number index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".bar(%b, %s)", bar3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".bar(%b, %s)", bar3, index2));
            js.setLength(0);
        }
        return this;
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

    private Number circularPadding;
    private String circularPadding1;

    /**
     * Setter for circular space around the gauge.
     */
    public CircularGauge setCircularPadding(Number circularPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".circularPadding(%s)", circularPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".circularPadding(%s)", circularPadding));
            js.setLength(0);
        }
        return this;
    }


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


    private View getData;

    /**
     * Getter for pointers mapping.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for pointers mapping
     */
    public CircularGauge setData(List<DataEntry> data) {
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
    public CircularGauge setData(View view) {
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

    private Boolean encloseWithStraightLine;

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

    private Fill fill;
    private String fill1;

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


    /**
     * 
     */
    public CircularGauge setFill(String json) {
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
    public CircularGauge fill(String color, Number opacity) {
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
    public CircularGauge fill(GradientKey[] keys, Boolean mode, Number angle, Number opacity1) {
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
    public CircularGauge fill(GradientKey[] keys, VectorRect mode1, Number angle, Number opacity1) {
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
    public CircularGauge fill(GradientKey[] keys, String mode2, Number angle, Number opacity1) {
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
    public CircularGauge fill(String[] keys1, Boolean mode, Number angle, Number opacity1) {
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
    public CircularGauge fill(String[] keys1, VectorRect mode1, Number angle, Number opacity1) {
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
    public CircularGauge fill(String[] keys1, String mode2, Number angle, Number opacity1) {
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
    public CircularGauge fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
    public CircularGauge fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
    public Knob getKnob(Number index3) {
        Knob item = new Knob(jsBase + ".knob("+ index3+")");
        getKnob1.add(item);
        return item;
    }
    private String knob;
    private Boolean knob1;

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

    private Number index4;
    private String knob2;
    private Boolean knob3;

    /**
     * Setter for the knob pointer by index.
     */
    public CircularGauge setKnob(String knob2, Number index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%s, %s)", wrapQuotes(knob2), index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%s, %s)", wrapQuotes(knob2), index4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the knob pointer by index.
     */
    public CircularGauge setKnob(Boolean knob3, Number index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".knob(%b, %s)", knob3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".knob(%b, %s)", knob3, index4));
            js.setLength(0);
        }
        return this;
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
    public GaugePointersMarker getMarker(Number index5) {
        GaugePointersMarker item = new GaugePointersMarker(jsBase + ".marker("+ index5+")");
        getMarker1.add(item);
        return item;
    }
    private String marker;
    private Boolean marker1;

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

    private Number index6;
    private String marker2;
    private Boolean marker3;

    /**
     * Setter for the marker pointer by index.
     */
    public CircularGauge setMarker(String marker2, Number index6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%s, %s)", wrapQuotes(marker2), index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%s, %s)", wrapQuotes(marker2), index6));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the marker pointer by index.
     */
    public CircularGauge setMarker(Boolean marker3, Number index6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".marker(%b, %s)", marker3, index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".marker(%b, %s)", marker3, index6));
            js.setLength(0);
        }
        return this;
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
    public Needle getNeedle(Number index7) {
        Needle item = new Needle(jsBase + ".needle("+ index7+")");
        getNeedle1.add(item);
        return item;
    }
    private String needle;
    private Boolean needle1;

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

    private Number index8;
    private String needle2;
    private Boolean needle3;

    /**
     * Setter for the needle pointer by index.
     */
    public CircularGauge setNeedle(String needle2, Number index8) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%s, %s)", wrapQuotes(needle2), index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%s, %s)", wrapQuotes(needle2), index8));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the needle pointer by index.
     */
    public CircularGauge setNeedle(Boolean needle3, Number index8) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".needle(%b, %s)", needle3, index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".needle(%b, %s)", needle3, index8));
            js.setLength(0);
        }
        return this;
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
    public CircularRange getRange(Number index9) {
        CircularRange item = new CircularRange(jsBase + ".range("+ index9+")");
        getRange1.add(item);
        return item;
    }
    private String range;
    private Boolean range1;

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

    private Number index10;
    private String range2;
    private Boolean range3;

    /**
     * Setter for the circular range settings by index.
     */
    public CircularGauge setRange(String range2, Number index10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s, %s)", wrapQuotes(range2), index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s, %s)", wrapQuotes(range2), index10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the circular range settings by index.
     */
    public CircularGauge setRange(Boolean range3, Number index10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b, %s)", range3, index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b, %s)", range3, index10));
            js.setLength(0);
        }
        return this;
    }

    private String startAngle;
    private Number startAngle1;

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


    /**
     * Setter for the start angle.
     */
    public CircularGauge setStartAngle(Number startAngle1) {
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

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(Stroke stroke, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * 
     */
    public CircularGauge setStroke(String json) {
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
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(ColoredFill stroke1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularGauge setStroke(String stroke2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String sweepAngle;
    private Number sweepAngle1;

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


    /**
     * Setter for the gauge sweep angle.
     */
    public CircularGauge setSweepAngle(Number sweepAngle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sweepAngle(%s)", sweepAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sweepAngle(%s)", sweepAngle1));
            js.setLength(0);
        }
        return this;
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

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
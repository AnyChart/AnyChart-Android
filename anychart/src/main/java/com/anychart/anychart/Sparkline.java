package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Sparkline chart class.<br/>
To get the chart use {@link anychart#sparkline} method.
 */
public class Sparkline extends Chart {

    protected Sparkline(String name) {
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

        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);
    }

    

    private AnychartMathRect getClip;

    /**
     * Getter for series clip settings.
     */
    public AnychartMathRect getClip() {
        if (getClip == null)
            getClip = new AnychartMathRect(jsBase + ".clip()");

        return getClip;
    }
    private AnychartMathRect clip;

    /**
     * Setter for series clip settings. Clips visible part of a series by a rectangle (or chart).<br/>
False, if series is created manually. True, if created via the chart.
     */
    public Sparkline setClip(AnychartMathRect clip) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(clip.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".clip(%s);",  ((clip != null) ? clip.getJsBase() : "null")));
        return this;
    }

    private Boolean connectMissingPoints;

    /**
     * Setter for connecting missing points settings.
     */
    public Sparkline setConnectMissingPoints(Boolean connectMissingPoints) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));
            js.setLength(0);
        }
        return this;
    }


    private View getData;

    /**
     * Getter for the series mapping.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the series mapping.
     */
    public Sparkline setData(List<DataEntry> data) {
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
    public Sparkline setData(View view) {
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
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setFill(Fill fill) {
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
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline fill(String color, Double opacity) {
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
    public Sparkline fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
    public Sparkline fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
    public Sparkline fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
    public Sparkline fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
    public Sparkline fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
    public Sparkline fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
    public Sparkline fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    public Sparkline fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private Fill firstFill;

    /**
     * Setter for first fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setFirstFill(Fill firstFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s)", ((firstFill != null) ? firstFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s)", ((firstFill != null) ? firstFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color1;
    private Double opacity3;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline firstFill(String color1, Double opacity3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %f)", wrapQuotes(color1), opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %f)", wrapQuotes(color1), opacity3));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline firstFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings1;

    private PatternFill getFirstHatchFill;

    /**
     * Getter for first hatch fill settings.
     */
    public PatternFill getFirstHatchFill() {
        if (getFirstHatchFill == null)
            getFirstHatchFill = new PatternFill(jsBase + ".firstHatchFill()");

        return getFirstHatchFill;
    }
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color2;
    private Double thickness;
    private Double size;

    /**
     * Setter for first hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setFirstHatchFill(PatternFill patternFillOrType, String color2, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for first hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setFirstHatchFill(HatchFill patternFillOrType1, String color2, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for first hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setFirstHatchFill(HatchFillType patternFillOrType2, String color2, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for first hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setFirstHatchFill(String patternFillOrType3, String color2, Double thickness, Double size) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color2), thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color2), thickness, size));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getFirstLabels;

    /**
     * Getter for data labels of first point.
     */
    public LabelsfactoryLabel getFirstLabels() {
        if (getFirstLabels == null)
            getFirstLabels = new LabelsfactoryLabel(jsBase + ".firstLabels()");

        return getFirstLabels;
    }
    private String firstLabels;
    private Boolean firstLabels1;

    /**
     * Setter for data labels of first point.
     */
    public Sparkline setFirstLabels(String firstLabels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstLabels(%s)", wrapQuotes(firstLabels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstLabels(%s)", wrapQuotes(firstLabels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data labels of first point.
     */
    public Sparkline setFirstLabels(Boolean firstLabels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstLabels(%b)", firstLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstLabels(%b)", firstLabels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getFirstMarkers;

    /**
     * Getter for data markers of the first point.
     */
    public UiMarkersfactoryMarker getFirstMarkers() {
        if (getFirstMarkers == null)
            getFirstMarkers = new UiMarkersfactoryMarker(jsBase + ".firstMarkers()");

        return getFirstMarkers;
    }
    private String firstMarkers;
    private Boolean firstMarkers1;

    /**
     * Setter for data markers of the first point.
     */
    public Sparkline setFirstMarkers(String firstMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstMarkers(%s)", wrapQuotes(firstMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstMarkers(%s)", wrapQuotes(firstMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data markers of the first point.
     */
    public Sparkline setFirstMarkers(Boolean firstMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".firstMarkers(%b)", firstMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".firstMarkers(%b)", firstMarkers1));
            js.setLength(0);
        }
        return this;
    }


    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }
    private PatternFill patternFillOrType4;
    private HatchFill patternFillOrType5;
    private HatchFillType patternFillOrType6;
    private String patternFillOrType7;
    private String color3;
    private Double thickness1;
    private Double size1;

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setHatchFill(PatternFill patternFillOrType4, String color3, Double thickness1, Double size1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType4 != null) ? patternFillOrType4.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType4 != null) ? patternFillOrType4.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setHatchFill(HatchFill patternFillOrType5, String color3, Double thickness1, Double size1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setHatchFill(HatchFillType patternFillOrType6, String color3, Double thickness1, Double size1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setHatchFill(String patternFillOrType7, String color3, Double thickness1, Double size1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType7), wrapQuotes(color3), thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType7), wrapQuotes(color3), thickness1, size1));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getLabels;

    /**
     * Getter for data labels.
     */
    public LabelsfactoryLabel getLabels() {
        if (getLabels == null)
            getLabels = new LabelsfactoryLabel(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;

    /**
     * Setter for data labels.
     */
    public Sparkline setLabels(String labels) {
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
     * Setter for data labels.
     */
    public Sparkline setLabels(Boolean labels1) {
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

    private Fill lastFill;

    /**
     * Setter for last fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setLastFill(Fill lastFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s)", ((lastFill != null) ? lastFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s)", ((lastFill != null) ? lastFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color4;
    private Double opacity6;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline lastFill(String color4, Double opacity6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %f)", wrapQuotes(color4), opacity6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %f)", wrapQuotes(color4), opacity6));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline lastFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings2;

    private PatternFill getLastHatchFill;

    /**
     * Getter for last hatch fill settings.
     */
    public PatternFill getLastHatchFill() {
        if (getLastHatchFill == null)
            getLastHatchFill = new PatternFill(jsBase + ".lastHatchFill()");

        return getLastHatchFill;
    }
    private PatternFill patternFillOrType8;
    private HatchFill patternFillOrType9;
    private HatchFillType patternFillOrType10;
    private String patternFillOrType11;
    private String color5;
    private Double thickness2;
    private Double size2;

    /**
     * Setter for last hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setLastHatchFill(PatternFill patternFillOrType8, String color5, Double thickness2, Double size2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType8 != null) ? patternFillOrType8.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType8 != null) ? patternFillOrType8.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for last hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setLastHatchFill(HatchFill patternFillOrType9, String color5, Double thickness2, Double size2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for last hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setLastHatchFill(HatchFillType patternFillOrType10, String color5, Double thickness2, Double size2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color5), thickness2, size2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for last hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setLastHatchFill(String patternFillOrType11, String color5, Double thickness2, Double size2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType11), wrapQuotes(color5), thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType11), wrapQuotes(color5), thickness2, size2));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getLastLabels;

    /**
     * Getter for data labels of the last point.
     */
    public LabelsfactoryLabel getLastLabels() {
        if (getLastLabels == null)
            getLastLabels = new LabelsfactoryLabel(jsBase + ".lastLabels()");

        return getLastLabels;
    }
    private String lastLabels;
    private Boolean lastLabels1;

    /**
     * Setter for data labels of the last point.
     */
    public Sparkline setLastLabels(String lastLabels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastLabels(%s)", wrapQuotes(lastLabels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastLabels(%s)", wrapQuotes(lastLabels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data labels of the last point.
     */
    public Sparkline setLastLabels(Boolean lastLabels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastLabels(%b)", lastLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastLabels(%b)", lastLabels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getLastMarkers;

    /**
     * Getter for data markers of the last point.
     */
    public UiMarkersfactoryMarker getLastMarkers() {
        if (getLastMarkers == null)
            getLastMarkers = new UiMarkersfactoryMarker(jsBase + ".lastMarkers()");

        return getLastMarkers;
    }
    private String lastMarkers;
    private Boolean lastMarkers1;

    /**
     * Setter for data markers of the last point.
     */
    public Sparkline setLastMarkers(String lastMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastMarkers(%s)", wrapQuotes(lastMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastMarkers(%s)", wrapQuotes(lastMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data markers of the last point.
     */
    public Sparkline setLastMarkers(Boolean lastMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lastMarkers(%b)", lastMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lastMarkers(%b)", lastMarkers1));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxismarkersLine getLineMarker;

    /**
     * Getter for the chart line marker.
     */
    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine(jsBase + ".lineMarker()");

        return getLineMarker;
    }

    private List<CoreAxismarkersLine> getLineMarker1 = new ArrayList<>();

    /**
     * Getter for the chart line marker.
     */
    public CoreAxismarkersLine getLineMarker(Double index) {
        CoreAxismarkersLine item = new CoreAxismarkersLine(jsBase + ".lineMarker("+ index+")");
        getLineMarker1.add(item);
        return item;
    }
    private String lineMarker;
    private Boolean lineMarker1;

    /**
     * Setter for the chart line marker.
     */
    public Sparkline setLineMarker(String lineMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart line marker.
     */
    public Sparkline setLineMarker(Boolean lineMarker1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));
            js.setLength(0);
        }
        return this;
    }

    private Double index1;
    private String lineMarker2;
    private Boolean lineMarker3;

    /**
     * Setter for the chart line marker by index.
     */
    public Sparkline setLineMarker(String lineMarker2, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart line marker by index.
     */
    public Sparkline setLineMarker(Boolean lineMarker3, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getMarkers;

    /**
     * Getter for data markers.
     */
    public UiMarkersfactoryMarker getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersfactoryMarker(jsBase + ".markers()");

        return getMarkers;
    }
    private String markers;
    private Boolean markers1;

    /**
     * Setter for data markers.
     */
    public Sparkline setMarkers(String markers) {
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
    public Sparkline setMarkers(Boolean markers1) {
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

    private Fill maxFill;

    /**
     * Setter for maximum fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setMaxFill(Fill maxFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s)", ((maxFill != null) ? maxFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s)", ((maxFill != null) ? maxFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color6;
    private Double opacity9;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline maxFill(String color6, Double opacity9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %f)", wrapQuotes(color6), opacity9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %f)", wrapQuotes(color6), opacity9));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity10;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(GradientKey[] keys12, String mode14, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(String[] keys13, Boolean mode12, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(String[] keys13, VectorRect mode13, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(String[] keys13, String mode14, Double angle3, Double opacity10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity10));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity11;
    private Double fx3;
    private Double fy3;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline maxFill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings3;

    private PatternFill getMaxHatchFill;

    /**
     * Getter for hatch fill settings of maximum point.
     */
    public PatternFill getMaxHatchFill() {
        if (getMaxHatchFill == null)
            getMaxHatchFill = new PatternFill(jsBase + ".maxHatchFill()");

        return getMaxHatchFill;
    }
    private PatternFill patternFillOrType12;
    private HatchFill patternFillOrType13;
    private HatchFillType patternFillOrType14;
    private String patternFillOrType15;
    private String color7;
    private Double thickness3;
    private Double size3;

    /**
     * Setter for hatch fill settings of maximum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMaxHatchFill(PatternFill patternFillOrType12, String color7, Double thickness3, Double size3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of maximum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMaxHatchFill(HatchFill patternFillOrType13, String color7, Double thickness3, Double size3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType13 != null) ? patternFillOrType13.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType13 != null) ? patternFillOrType13.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of maximum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMaxHatchFill(HatchFillType patternFillOrType14, String color7, Double thickness3, Double size3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType14 != null) ? patternFillOrType14.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", ((patternFillOrType14 != null) ? patternFillOrType14.generateJs() : "null"), wrapQuotes(color7), thickness3, size3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of maximum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMaxHatchFill(String patternFillOrType15, String color7, Double thickness3, Double size3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType15), wrapQuotes(color7), thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType15), wrapQuotes(color7), thickness3, size3));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getMaxLabels;

    /**
     * Getter for data labels of maximum point.
     */
    public LabelsfactoryLabel getMaxLabels() {
        if (getMaxLabels == null)
            getMaxLabels = new LabelsfactoryLabel(jsBase + ".maxLabels()");

        return getMaxLabels;
    }
    private String maxLabels;
    private Boolean maxLabels1;

    /**
     * Setter for data labels of maximum point.
     */
    public Sparkline setMaxLabels(String maxLabels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxLabels(%s)", wrapQuotes(maxLabels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxLabels(%s)", wrapQuotes(maxLabels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data labels of maximum point.
     */
    public Sparkline setMaxLabels(Boolean maxLabels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxLabels(%b)", maxLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxLabels(%b)", maxLabels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getMaxMarkers;

    /**
     * Getter for data markers of maximum point.
     */
    public UiMarkersfactoryMarker getMaxMarkers() {
        if (getMaxMarkers == null)
            getMaxMarkers = new UiMarkersfactoryMarker(jsBase + ".maxMarkers()");

        return getMaxMarkers;
    }
    private String maxMarkers;
    private Boolean maxMarkers1;

    /**
     * Setter for data markers of maximum point.
     */
    public Sparkline setMaxMarkers(String maxMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxMarkers(%s)", wrapQuotes(maxMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxMarkers(%s)", wrapQuotes(maxMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data markers of maximum point.
     */
    public Sparkline setMaxMarkers(Boolean maxMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxMarkers(%b)", maxMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxMarkers(%b)", maxMarkers1));
            js.setLength(0);
        }
        return this;
    }

    private Fill minFill;

    /**
     * Setter for minimum fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setMinFill(Fill minFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s)", ((minFill != null) ? minFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s)", ((minFill != null) ? minFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color8;
    private Double opacity12;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline minFill(String color8, Double opacity12) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %f)", wrapQuotes(color8), opacity12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %f)", wrapQuotes(color8), opacity12));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity13;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(GradientKey[] keys16, String mode18, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(String[] keys17, Boolean mode16, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(String[] keys17, VectorRect mode17, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(String[] keys17, String mode18, Double angle4, Double opacity13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity13));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity14;
    private Double fx4;
    private Double fy4;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline minFill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings4;

    private PatternFill getMinHatchFill;

    /**
     * Getter for hatch fill settings of minimum point.
     */
    public PatternFill getMinHatchFill() {
        if (getMinHatchFill == null)
            getMinHatchFill = new PatternFill(jsBase + ".minHatchFill()");

        return getMinHatchFill;
    }
    private PatternFill patternFillOrType16;
    private HatchFill patternFillOrType17;
    private HatchFillType patternFillOrType18;
    private String patternFillOrType19;
    private String color9;
    private Double thickness4;
    private Double size4;

    /**
     * Setter for hatch fill settings of minimum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMinHatchFill(PatternFill patternFillOrType16, String color9, Double thickness4, Double size4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of minimum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMinHatchFill(HatchFill patternFillOrType17, String color9, Double thickness4, Double size4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of minimum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMinHatchFill(HatchFillType patternFillOrType18, String color9, Double thickness4, Double size4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType18 != null) ? patternFillOrType18.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", ((patternFillOrType18 != null) ? patternFillOrType18.generateJs() : "null"), wrapQuotes(color9), thickness4, size4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for hatch fill settings of minimum point.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setMinHatchFill(String patternFillOrType19, String color9, Double thickness4, Double size4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType19), wrapQuotes(color9), thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType19), wrapQuotes(color9), thickness4, size4));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getMinLabels;

    /**
     * Getter for data labels of minimum point.
     */
    public LabelsfactoryLabel getMinLabels() {
        if (getMinLabels == null)
            getMinLabels = new LabelsfactoryLabel(jsBase + ".minLabels()");

        return getMinLabels;
    }
    private String minLabels;
    private Boolean minLabels1;

    /**
     * Setter for data labels of minimum point.
     */
    public Sparkline setMinLabels(String minLabels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minLabels(%s)", wrapQuotes(minLabels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minLabels(%s)", wrapQuotes(minLabels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data labels of minimum point.
     */
    public Sparkline setMinLabels(Boolean minLabels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minLabels(%b)", minLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minLabels(%b)", minLabels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getMinMarkers;

    /**
     * Getter for data markers of minimum point.
     */
    public UiMarkersfactoryMarker getMinMarkers() {
        if (getMinMarkers == null)
            getMinMarkers = new UiMarkersfactoryMarker(jsBase + ".minMarkers()");

        return getMinMarkers;
    }
    private String minMarkers;
    private Boolean minMarkers1;

    /**
     * Setter for data markers of minimum point.
     */
    public Sparkline setMinMarkers(String minMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minMarkers(%s)", wrapQuotes(minMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minMarkers(%s)", wrapQuotes(minMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data markers of minimum point.
     */
    public Sparkline setMinMarkers(Boolean minMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minMarkers(%b)", minMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minMarkers(%b)", minMarkers1));
            js.setLength(0);
        }
        return this;
    }

    private Fill negativeFill;

    /**
     * Setter for the negative fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline setNegativeFill(Fill negativeFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color10;
    private Double opacity15;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Sparkline negativeFill(String color10, Double opacity15) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color10), opacity15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color10), opacity15));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Double opacity16;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(GradientKey[] keys20, Boolean mode20, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(GradientKey[] keys20, VectorRect mode21, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(GradientKey[] keys20, String mode22, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(String[] keys21, Boolean mode20, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(String[] keys21, VectorRect mode21, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(String[] keys21, String mode22, Double angle5, Double opacity16) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity16));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode23;
    private Double opacity17;
    private Double fx5;
    private Double fy5;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(GradientKey[] keys22, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Sparkline negativeFill(String[] keys23, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings5;

    private PatternFill getNegativeHatchFill;

    /**
     * Getter for negative hatch fill settings.
     */
    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }
    private PatternFill patternFillOrType20;
    private HatchFill patternFillOrType21;
    private HatchFillType patternFillOrType22;
    private String patternFillOrType23;
    private String color11;
    private Double thickness5;
    private Double size5;

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setNegativeHatchFill(PatternFill patternFillOrType20, String color11, Double thickness5, Double size5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setNegativeHatchFill(HatchFill patternFillOrType21, String color11, Double thickness5, Double size5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setNegativeHatchFill(HatchFillType patternFillOrType22, String color11, Double thickness5, Double size5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null"), wrapQuotes(color11), thickness5, size5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public Sparkline setNegativeHatchFill(String patternFillOrType23, String color11, Double thickness5, Double size5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType23), wrapQuotes(color11), thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType23), wrapQuotes(color11), thickness5, size5));
            js.setLength(0);
        }
        return this;
    }


    private LabelsfactoryLabel getNegativeLabels;

    /**
     * Getter for data labels of negative points.
     */
    public LabelsfactoryLabel getNegativeLabels() {
        if (getNegativeLabels == null)
            getNegativeLabels = new LabelsfactoryLabel(jsBase + ".negativeLabels()");

        return getNegativeLabels;
    }
    private String negativeLabels;
    private Boolean negativeLabels1;

    /**
     * Setter for data labels of negative points.
     */
    public Sparkline setNegativeLabels(String negativeLabels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeLabels(%s)", wrapQuotes(negativeLabels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeLabels(%s)", wrapQuotes(negativeLabels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data labels of negative points.
     */
    public Sparkline setNegativeLabels(Boolean negativeLabels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeLabels(%b)", negativeLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeLabels(%b)", negativeLabels1));
            js.setLength(0);
        }
        return this;
    }


    private UiMarkersfactoryMarker getNegativeMarkers;

    /**
     * Getter for data negative markers.
     */
    public UiMarkersfactoryMarker getNegativeMarkers() {
        if (getNegativeMarkers == null)
            getNegativeMarkers = new UiMarkersfactoryMarker(jsBase + ".negativeMarkers()");

        return getNegativeMarkers;
    }
    private String negativeMarkers;
    private Boolean negativeMarkers1;

    /**
     * Setter for data negative markers.
     */
    public Sparkline setNegativeMarkers(String negativeMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeMarkers(%s)", wrapQuotes(negativeMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeMarkers(%s)", wrapQuotes(negativeMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for data negative markers.
     */
    public Sparkline setNegativeMarkers(Boolean negativeMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".negativeMarkers(%b)", negativeMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".negativeMarkers(%b)", negativeMarkers1));
            js.setLength(0);
        }
        return this;
    }

    private Double pointWidth;
    private String pointWidth1;

    /**
     * Setter for point width settings.
     */
    public Sparkline setPointWidth(Double pointWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for point width settings.
     */
    public Sparkline setPointWidth(String pointWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxismarkersRange getRangeMarker;

    /**
     * Getter for the chart range marker.
     */
    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange(jsBase + ".rangeMarker()");

        return getRangeMarker;
    }

    private List<CoreAxismarkersRange> getRangeMarker1 = new ArrayList<>();

    /**
     * Getter for the chart range marker.
     */
    public CoreAxismarkersRange getRangeMarker(Double index2) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".rangeMarker("+ index2+")");
        getRangeMarker1.add(item);
        return item;
    }
    private String rangeMarker;
    private Boolean rangeMarker1;

    /**
     * Setter for the chart range marker.
     */
    public Sparkline setRangeMarker(String rangeMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart range marker.
     */
    public Sparkline setRangeMarker(Boolean rangeMarker1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));
            js.setLength(0);
        }
        return this;
    }

    private Double index3;
    private String rangeMarker2;
    private Boolean rangeMarker3;

    /**
     * Setter for the chart range marker by index.
     */
    public Sparkline setRangeMarker(String rangeMarker2, Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart range marker by index.
     */
    public Sparkline setRangeMarker(Boolean rangeMarker3, Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index3));
            js.setLength(0);
        }
        return this;
    }

    private SparklineSeriesType type;
    private String type1;

    /**
     * Setter for the sparkline series type.
     */
    public Sparkline setSeriesType(SparklineSeriesType type) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".seriesType(%s)", ((type != null) ? type.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", ((type != null) ? type.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the sparkline series type.
     */
    public Sparkline setSeriesType(String type1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(type1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(type1)));
            js.setLength(0);
        }
        return this;
    }

    private Stroke color12;
    private ColoredFill color13;
    private String color14;
    private Double thickness6;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sparkline setStroke(Stroke color12, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color12 != null) ? color12.generateJs() : "null"), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color12 != null) ? color12.generateJs() : "null"), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sparkline setStroke(ColoredFill color13, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Sparkline setStroke(String color14, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color14), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color14), thickness6, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxismarkersText getTextMarker;

    /**
     * Getter for the chart text marker.
     */
    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText(jsBase + ".textMarker()");

        return getTextMarker;
    }

    private List<CoreAxismarkersText> getTextMarker1 = new ArrayList<>();

    /**
     * Getter for the chart text marker.
     */
    public CoreAxismarkersText getTextMarker(Double index4) {
        CoreAxismarkersText item = new CoreAxismarkersText(jsBase + ".textMarker("+ index4+")");
        getTextMarker1.add(item);
        return item;
    }
    private String textMarker;
    private Boolean textMarker1;

    /**
     * Setter for the chart text marker.
     */
    public Sparkline setTextMarker(String textMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart text marker.
     */
    public Sparkline setTextMarker(Boolean textMarker1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b)", textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b)", textMarker1));
            js.setLength(0);
        }
        return this;
    }

    private Double index5;
    private String textMarker2;
    private Boolean textMarker3;

    /**
     * Setter for the chart text marker by index.
     */
    public Sparkline setTextMarker(String textMarker2, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart text marker by index.
     */
    public Sparkline setTextMarker(Boolean textMarker3, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index5));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getXScale;

    /**
     * Getter for the chart X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private ScaleTypes xScale;
    private String xScale1;
    private ScalesBase xScale2;
    private String xScale3;

    /**
     * Setter for the chart X scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setXScale(ScaleTypes xScale) {
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
     * Setter for the chart X scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setXScale(String xScale1) {
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
     * Setter for the chart X scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setXScale(ScalesBase xScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale2 != null) ? xScale2.getJsBase() : "null")));
        return this;
    }


    private ScalesBase getYScale;

    /**
     * Getter for the chart Y scale.
     */
    public ScalesBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private ScaleTypes yScale;
    private String yScale1;
    private ScalesBase yScale2;
    private String yScale3;

    /**
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setYScale(ScaleTypes yScale) {
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
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setYScale(String yScale1) {
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
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public Sparkline setYScale(ScalesBase yScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale2 != null) ? yScale2.getJsBase() : "null")));
        return this;
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstHatchFill() {
        if (getFirstHatchFill != null) {
            return getFirstHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstLabels() {
        if (getFirstLabels != null) {
            return getFirstLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstMarkers() {
        if (getFirstMarkers != null) {
            return getFirstMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLastHatchFill() {
        if (getLastHatchFill != null) {
            return getLastHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetLastLabels() {
        if (getLastLabels != null) {
            return getLastLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLastMarkers() {
        if (getLastMarkers != null) {
            return getLastMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetLineMarker() {
        if (getLineMarker != null) {
            return getLineMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetLineMarker1() {
        if (!getLineMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersLine item : getLineMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxHatchFill() {
        if (getMaxHatchFill != null) {
            return getMaxHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxLabels() {
        if (getMaxLabels != null) {
            return getMaxLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxMarkers() {
        if (getMaxMarkers != null) {
            return getMaxMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetMinHatchFill() {
        if (getMinHatchFill != null) {
            return getMinHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetMinLabels() {
        if (getMinLabels != null) {
            return getMinLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinMarkers() {
        if (getMinMarkers != null) {
            return getMinMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeLabels() {
        if (getNegativeLabels != null) {
            return getNegativeLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeMarkers() {
        if (getNegativeMarkers != null) {
            return getNegativeMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetRangeMarker() {
        if (getRangeMarker != null) {
            return getRangeMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetRangeMarker1() {
        if (!getRangeMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersRange item : getRangeMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetTextMarker() {
        if (getTextMarker != null) {
            return getTextMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetTextMarker1() {
        if (!getTextMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersText item : getTextMarker1) {
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

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetClip());
        js.append(generateJSgetData());
        js.append(generateJSgetFirstHatchFill());
        js.append(generateJSgetFirstLabels());
        js.append(generateJSgetFirstMarkers());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLastHatchFill());
        js.append(generateJSgetLastLabels());
        js.append(generateJSgetLastMarkers());
        js.append(generateJSgetLineMarker());
        js.append(generateJSgetLineMarker1());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetMaxHatchFill());
        js.append(generateJSgetMaxLabels());
        js.append(generateJSgetMaxMarkers());
        js.append(generateJSgetMinHatchFill());
        js.append(generateJSgetMinLabels());
        js.append(generateJSgetMinMarkers());
        js.append(generateJSgetNegativeHatchFill());
        js.append(generateJSgetNegativeLabels());
        js.append(generateJSgetNegativeMarkers());
        js.append(generateJSgetRangeMarker());
        js.append(generateJSgetRangeMarker1());
        js.append(generateJSgetTextMarker());
        js.append(generateJSgetTextMarker1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetYScale());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
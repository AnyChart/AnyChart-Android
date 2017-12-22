package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all cartesian series.<br/>
Base class defines common methods, such as those for:
<ul>
  <li>Binding series to a scale: <i>xScale, yScale</i></li>
  <li>Base color settings: <i>color</i></li>
</ul>
You can also obtain <i>getIterator, getResetIterator</i> iterators here.
 */
public class CartesianSeriesTimeline extends SeriesBase {

    public CartesianSeriesTimeline() {
        js.setLength(0);
        js.append("var cartesianSeriesTimeline").append(++variableIndex).append(" = anychart.core.cartesian.series.base();");
        jsBase = "cartesianSeriesTimeline" + variableIndex;
    }

    protected CartesianSeriesTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
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

    private Boolean clip;
    private AnychartMathRect clip1;
    private List<ScalesTimeline> setClip = new ArrayList<>();

    /**
     * Setter for series clip settings.
     */
    public ScalesTimeline setClip(Boolean clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setClip" + ++variableIndex + " = " + jsBase + ".clip(%b);", clip));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%b);", clip));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setClip" + variableIndex);
        setClip.add(item);
        return item;
    }
    private String generateJSsetClip() {
        if (!setClip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setClip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setClip1 = new ArrayList<>();

    /**
     * Setter for series clip settings.
     */
    public ScalesTimeline setClip(AnychartMathRect clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(clip1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".clip(%s);",  ((clip1 != null) ? clip1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", ((clip1 != null) ? clip1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setClip1" + variableIndex);
        setClip1.add(item);
        return item;
    }
    private String generateJSsetClip1() {
        if (!setClip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setClip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Error getError;

    /**
     * Getter for the series error.
     */
    public Error getError() {
        if (getError == null)
            getError = new Error(jsBase + ".error()");

        return getError;
    }

    private String error;
    private Boolean error1;
    private String error2;
    private Number error3;
    private List<ScalesTimeline> setError = new ArrayList<>();

    /**
     * Setter for the series error.
     */
    public ScalesTimeline setError(String error) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error = error;
        } else {
            this.error = error;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setError" + ++variableIndex + " = " + jsBase + ".error(%s);", wrapQuotes(error)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%s);", wrapQuotes(error)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setError" + variableIndex);
        setError.add(item);
        return item;
    }
    private String generateJSsetError() {
        if (!setError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setError1 = new ArrayList<>();

    /**
     * Setter for the series error.
     */
    public ScalesTimeline setError(Boolean error1) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error1 = error1;
        } else {
            this.error1 = error1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setError1" + ++variableIndex + " = " + jsBase + ".error(%b);", error1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%b);", error1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setError1" + variableIndex);
        setError1.add(item);
        return item;
    }
    private String generateJSsetError1() {
        if (!setError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setError2 = new ArrayList<>();

    /**
     * Setter for the series error.
     */
    public ScalesTimeline setError(Number error3) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error3 = error3;
        } else {
            this.error3 = error3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setError2" + ++variableIndex + " = " + jsBase + ".error(%f);", error3));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%f);", error3));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setError2" + variableIndex);
        setError2.add(item);
        return item;
    }
    private String generateJSsetError2() {
        if (!setError2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setError2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number indexes;
    private Number[] indexes1;

    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%f);", indexes));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));
                js.setLength(0);
            }
        }
    }


    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Number indexes2;
    private Number[] indexes3;

    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%f);", indexes2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));
                js.setLength(0);
            }
        }
    }


    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Boolean isVertical;
    private List<ScalesTimeline> setIsVertical = new ArrayList<>();

    /**
     * Setter for the series layout direction.
Set it to null to reset to the default. {docs:Basic_Charts/Vertical/Overview}Learn more about Vertical chart.{docs}
     */
    public ScalesTimeline setIsVertical(Boolean isVertical) {
        if (jsBase == null) {
            this.isVertical = isVertical;
        } else {
            this.isVertical = isVertical;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setIsVertical" + ++variableIndex + " = " + jsBase + ".isVertical(%b);", isVertical));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".isVertical(%b);", isVertical));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setIsVertical" + variableIndex);
        setIsVertical.add(item);
        return item;
    }
    private String generateJSsetIsVertical() {
        if (!setIsVertical.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setIsVertical) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number indexes4;
    private Number[] indexes5;

    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%f);", indexes4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));
                js.setLength(0);
            }
        }
    }


    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number[] indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
                js.setLength(0);
            }
        }
    }

    private RenderingSettings getRendering;

    /**
     * Getter for the series rendering.
     */
    public RenderingSettings getRendering() {
        if (getRendering == null)
            getRendering = new RenderingSettings(jsBase + ".rendering()");

        return getRendering;
    }

    private String rendering;
    private List<ScalesTimeline> setRendering = new ArrayList<>();

    /**
     * Setter for the series rendering settings.
     */
    public ScalesTimeline setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRendering" + ++variableIndex + " = " + jsBase + ".rendering(%s);", wrapQuotes(rendering)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rendering(%s);", wrapQuotes(rendering)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setRendering" + variableIndex);
        setRendering.add(item);
        return item;
    }
    private String generateJSsetRendering() {
        if (!setRendering.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setRendering) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String seriesType;
    private List<ScalesTimeline> setSeriesType = new ArrayList<>();

    /**
     * Setter for switching of the series type.
     */
    public ScalesTimeline setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSeriesType" + ++variableIndex + " = " + jsBase + ".seriesType(%s);", wrapQuotes(seriesType)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".seriesType(%s);", wrapQuotes(seriesType)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSeriesType" + variableIndex);
        setSeriesType.add(item);
        return item;
    }
    private String generateJSsetSeriesType() {
        if (!setSeriesType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number subRangeRatio;

    /**
     * Transforms X value to pixel coordinates.
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} is called.
     */
    public void transformX(Number subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transformX(%f);", subRangeRatio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformX(%f);", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Number subRangeRatio1;

    /**
     * Transforms Y value to pixel coordinates.
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} is called.
     */
    public void transformY(Number subRangeRatio1) {
        if (jsBase == null) {
            this.subRangeRatio = null;
            this.subRangeRatio1 = null;
            
            this.subRangeRatio1 = subRangeRatio1;
        } else {
            this.subRangeRatio1 = subRangeRatio1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transformY(%f);", subRangeRatio1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformY(%f);", subRangeRatio1));
                js.setLength(0);
            }
        }
    }

    private Number position;
    private List<ScalesTimeline> setXPointPosition = new ArrayList<>();

    /**
     * Setter for the position of the point on an ordinal scale.
     */
    public ScalesTimeline setXPointPosition(Number position) {
        if (jsBase == null) {
            this.position = position;
        } else {
            this.position = position;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXPointPosition" + ++variableIndex + " = " + jsBase + ".xPointPosition(%f);", position));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xPointPosition(%f);", position));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXPointPosition" + variableIndex);
        setXPointPosition.add(item);
        return item;
    }
    private String generateJSsetXPointPosition() {
        if (!setXPointPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXPointPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Ordinal getXScale;

    /**
     * Getter for the series X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesTimeline xScale;
    private String xScale1;
    private ScaleTypes xScale2;
    private String xScale3;
    private List<ScalesTimeline> setXScale = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(ScalesTimeline xScale) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale = xScale;
        } else {
            this.xScale = xScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale != null) ? xScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale != null) ? xScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale" + variableIndex);
        setXScale.add(item);
        return item;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale1 = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(String xScale1) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale1 = xScale1;
        } else {
            this.xScale1 = xScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale1" + ++variableIndex + " = " + jsBase + ".xScale(%s);", wrapQuotes(xScale1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(xScale1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale1" + variableIndex);
        setXScale1.add(item);
        return item;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale2 = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(ScaleTypes xScale2) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale2 = xScale2;
        } else {
            this.xScale2 = xScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale2" + ++variableIndex + " = " + jsBase + ".xScale(%s);", ((xScale2 != null) ? xScale2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale2 != null) ? xScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale2" + variableIndex);
        setXScale2.add(item);
        return item;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesTimeline getYScale;

    /**
     * Getter for the series Y scale.
     */
    public ScalesTimeline getYScale() {
        if (getYScale == null)
            getYScale = new ScalesTimeline(jsBase + ".yScale()");

        return getYScale;
    }

    private ScalesTimeline yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;
    private List<ScalesTimeline> setYScale = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(ScalesTimeline yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale != null) ? yScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale" + variableIndex);
        setYScale.add(item);
        return item;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale1 = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale1" + ++variableIndex + " = " + jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale1" + variableIndex);
        setYScale1.add(item);
        return item;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale2 = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale2" + ++variableIndex + " = " + jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale2" + variableIndex);
        setYScale2.add(item);
        return item;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetError() {
        if (getError != null) {
            return getError.generateJs();
        }
        return "";
    }

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetError());
        jsGetters.append(generateJSgetRendering());
        jsGetters.append(generateJSgetXScale());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetClip());
        js.append(generateJSsetClip1());
        js.append(generateJSsetError());
        js.append(generateJSsetError1());
        js.append(generateJSsetError2());
        js.append(generateJSsetIsVertical());
        js.append(generateJSsetRendering());
        js.append(generateJSsetSeriesType());
        js.append(generateJSsetXPointPosition());
        js.append(generateJSsetXScale());
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
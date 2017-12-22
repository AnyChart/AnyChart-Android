package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all stock scroller series.
 */
public class ScrollerseriesTimeline extends VisualBaseWithBounds {

    public ScrollerseriesTimeline() {
        js.setLength(0);
        js.append("var scrollerseriesTimeline").append(++variableIndex).append(" = anychart.core.stock.scrollerSeries.base();");
        jsBase = "scrollerseriesTimeline" + variableIndex;
    }

    protected ScrollerseriesTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollerseriesTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TableMapping getData;

    /**
     * Gets data for the scroller series.
     */
    public TableMapping getData() {
        if (getData == null)
            getData = new TableMapping(jsBase + ".data()");

        return getData;
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;
    private String csvSettings;
    private List<ScalesTimeline> setData = new ArrayList<>();

    /**
     * Sets data for the scroller series.
     */
    public ScalesTimeline setData(TableMapping data, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s, %s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData" + variableIndex);
        setData.add(item);
        return item;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData1 = new ArrayList<>();

    /**
     * Sets data for the scroller series.
     */
    public ScalesTimeline setData(DataTable data1, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s, %s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData1" + variableIndex);
        setData1.add(item);
        return item;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData2 = new ArrayList<>();

    /**
     * Sets data for the scroller series.
     */
    public ScalesTimeline setData(String data2, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData2" + ++variableIndex + " = " + jsBase + ".data(%s, %s, %s);", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData2" + variableIndex);
        setData2.add(item);
        return item;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number maxPointWidth;
    private String maxPointWidth1;
    private List<ScalesTimeline> setMaxPointWidth = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
    public ScalesTimeline setMaxPointWidth(Number maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxPointWidth" + ++variableIndex + " = " + jsBase + ".maxPointWidth(%f);", maxPointWidth));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%f);", maxPointWidth));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMaxPointWidth" + variableIndex);
        setMaxPointWidth.add(item);
        return item;
    }
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setMaxPointWidth1 = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
    public ScalesTimeline setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxPointWidth1" + ++variableIndex + " = " + jsBase + ".maxPointWidth(%s);", wrapQuotes(maxPointWidth1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMaxPointWidth1" + variableIndex);
        setMaxPointWidth1.add(item);
        return item;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number minPointLength;
    private String minPointLength1;
    private List<ScalesTimeline> setMinPointLength = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
    public ScalesTimeline setMinPointLength(Number minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinPointLength" + ++variableIndex + " = " + jsBase + ".minPointLength(%f);", minPointLength));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%f);", minPointLength));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMinPointLength" + variableIndex);
        setMinPointLength.add(item);
        return item;
    }
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setMinPointLength1 = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
    public ScalesTimeline setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinPointLength1" + ++variableIndex + " = " + jsBase + ".minPointLength(%s);", wrapQuotes(minPointLength1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMinPointLength1" + variableIndex);
        setMinPointLength1.add(item);
        return item;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMinPointLength1) {
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
    private List<ScalesTimeline> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public ScalesTimeline setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setNormal" + ++variableIndex + " = " + jsBase + ".normal(%s);", wrapQuotes(normal)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setNormal" + variableIndex);
        setNormal.add(item);
        return item;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number pointWidth;
    private String pointWidth1;
    private List<ScalesTimeline> setPointWidth = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
    public ScalesTimeline setPointWidth(Number pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPointWidth" + ++variableIndex + " = " + jsBase + ".pointWidth(%f);", pointWidth));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%f);", pointWidth));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setPointWidth" + variableIndex);
        setPointWidth.add(item);
        return item;
    }
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setPointWidth1 = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
    public ScalesTimeline setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPointWidth1" + ++variableIndex + " = " + jsBase + ".pointWidth(%s);", wrapQuotes(pointWidth1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setPointWidth1" + variableIndex);
        setPointWidth1.add(item);
        return item;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<ScalesTimeline> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public ScalesTimeline setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelected" + ++variableIndex + " = " + jsBase + ".selected(%s);", wrapQuotes(selected)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelected" + variableIndex);
        setSelected.add(item);
        return item;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelected) {
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

    private ScalesTimeline getYScale;

    /**
     * Getter for the current Y-scale.
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
     * Setter for the Y-scale.
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
     * Setter for the Y-scale.
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
     * Setter for the Y-scale.
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

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
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

    
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetRendering());
        jsGetters.append(generateJSgetSelected());
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

        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetRendering());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSeriesType());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
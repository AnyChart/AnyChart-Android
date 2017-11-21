package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Base class for all stock series.
 */
public class StockSeriesBase extends VisualBaseWithBounds {

    public StockSeriesBase() {
        js.setLength(0);
        js.append("var stockSeriesBase").append(++variableIndex).append(" = anychart.core.stock.series.base();");
        jsBase = "stockSeriesBase" + variableIndex;
    }

    protected StockSeriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TableMapping getData;

    /**
     * Gets data for the series.
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
    private List<StockSeriesBase> setData = new ArrayList<>();

    /**
     * Sets data for the series.
     */
    public StockSeriesBase setData(TableMapping data, String mappingSettings, String csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setData1 = new ArrayList<>();

    /**
     * Sets data for the series.
     */
    public StockSeriesBase setData(DataTable data1, String mappingSettings, String csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setData2 = new ArrayList<>();

    /**
     * Sets data for the series.
     */
    public StockSeriesBase setData(String data2, String mappingSettings, String csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setData2) {
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
    private List<StockSeriesBase> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public StockSeriesBase setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LegendItemSettings getLegendItem;

    /**
     * Gets the current legend item setting for series.
     */
    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;
    private List<StockSeriesBase> setLegendItem = new ArrayList<>();

    /**
     * Sets the legend item setting for series.
     */
    public StockSeriesBase setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".legendItem(%s)", wrapQuotes(legendItem)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".legendItem(%s)", wrapQuotes(legendItem)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLegendItem() {
        if (!setLegendItem.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setLegendItem) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for the data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<StockSeriesBase> setMarkers = new ArrayList<>();

    /**
     * Setter for the data markers.
     */
    public StockSeriesBase setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setMarkers1 = new ArrayList<>();

    /**
     * Setter for the data markers.
     */
    public StockSeriesBase setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<StockSeriesBase> setMaxPointWidth = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
    public StockSeriesBase setMaxPointWidth(Double maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setMaxPointWidth1 = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
    public StockSeriesBase setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPointLength;
    private String minPointLength1;
    private List<StockSeriesBase> setMinPointLength = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
    public StockSeriesBase setMinPointLength(Double minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setMinPointLength1 = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
    public StockSeriesBase setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMinPointLength1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private List<StockSeriesBase> setName = new ArrayList<>();

    /**
     * Sets the series name.
     */
    public StockSeriesBase setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".name(%s)", wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".name(%s)", wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetName() {
        if (!setName.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setName) {
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
    private List<StockSeriesBase> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public StockSeriesBase setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<StockSeriesBase> setPointWidth = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
    public StockSeriesBase setPointWidth(Double pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setPointWidth1 = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
    public StockSeriesBase setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setPointWidth1) {
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
    private List<StockSeriesBase> setRendering = new ArrayList<>();

    /**
     * Setter for the series rendering settings.
     */
    public StockSeriesBase setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rendering(%s)", wrapQuotes(rendering)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rendering(%s)", wrapQuotes(rendering)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRendering() {
        if (!setRendering.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setRendering) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String seriesType;
    private List<StockSeriesBase> setSeriesType = new ArrayList<>();

    /**
     * Setter for switching of the series type.
     */
    public StockSeriesBase setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(seriesType)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(seriesType)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeriesType() {
        if (!setSeriesType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tooltip getTooltip;

    /**
     * Getter for the current tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<StockSeriesBase> setTooltip = new ArrayList<>();

    /**
     * Setter for the tooltip.
     */
    public StockSeriesBase setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setTooltip1 = new ArrayList<>();

    /**
     * Setter for the tooltip.
     */
    public StockSeriesBase setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%b)", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScatterBase getYScale;

    /**
     * Getter for the current Y-scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;
    private List<StockSeriesBase> setYScale = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public StockSeriesBase setYScale(ScatterBase yScale) {
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
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setYScale1 = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public StockSeriesBase setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setYScale2 = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public StockSeriesBase setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setYScale2) {
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

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLegendItem() {
        if (getLegendItem != null) {
            return getLegendItem.generateJs();
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

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
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
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLegendItem());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetRendering());
        jsGetters.append(generateJSgetTooltip());
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
        js.append(generateJSsetHovered());
        js.append(generateJSsetLegendItem());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetName());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetRendering());
        js.append(generateJSsetSeriesType());
        js.append(generateJSsetTooltip());
        js.append(generateJSsetTooltip1());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
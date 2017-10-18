package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class StockSeriesBase extends VisualBaseWithBounds {

    public StockSeriesBase() {

    }

    protected StockSeriesBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StockSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private TableMapping getData;

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

            js.append(String.format(Locale.US, ".data(%s, %s, %s)", (data != null) ? data.generateJs() : "null", mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", (data != null) ? data.generateJs() : "null", mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s, %s)", (data1 != null) ? data1.generateJs() : "null", mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", (data1 != null) ? data1.generateJs() : "null", mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s, %s)", data2, mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", data2, mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getHovered;

    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;

    public StockSeriesBase setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hovered(%s)", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", hovered));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItemSettings getLegendItem;

    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;

    public StockSeriesBase setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".legendItem(%s)", legendItem));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".legendItem(%s)", legendItem));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

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

            js.append(String.format(Locale.US, ".markers(%s)", markers));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", markers));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private Double maxPointWidth;
    private String maxPointWidth1;

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

            js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minPointLength;
    private String minPointLength1;

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

            js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String name;

    public StockSeriesBase setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".name(%s)", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".name(%s)", name));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    public StockSeriesBase setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".normal(%s)", normal));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", normal));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double pointWidth;
    private String pointWidth1;

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

            js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private RenderingSettings getRendering;

    public RenderingSettings getRendering() {
        if (getRendering == null)
            getRendering = new RenderingSettings(jsBase + ".rendering()");

        return getRendering;
    }

    private String rendering;

    public StockSeriesBase setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rendering(%s)", rendering));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rendering(%s)", rendering));
                js.setLength(0);
            }
        }
        return this;
    }

    private String seriesType;

    public StockSeriesBase setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".seriesType(%s)", seriesType));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", seriesType));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

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

            js.append(String.format(Locale.US, ".tooltip(%s)", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", tooltip));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private ScatterBase getYScale;

    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;

    public StockSeriesBase setYScale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".yScale(%s)", yScale1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", (data != null) ? data.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", (data1 != null) ? data1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata2() {
        if (data2 != null) {
            return String.format(Locale.US, "data: %s,", data2);
        }
        return "";
    }

    private String generateJSdata3() {
        if (data3 != null) {
            return String.format(Locale.US, "data: %s,", data3);
        }
        return "";
    }

    private String generateJSmappingSettings() {
        if (mappingSettings != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %s,", hovered);
        }
        return "";
    }

    private String generateJSlegendItem() {
        if (legendItem != null) {
            return String.format(Locale.US, "legendItem: %s,", legendItem);
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %s,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: %b,", markers1);
        }
        return "";
    }

    private String generateJSmarkers2() {
        if (markers2 != null) {
            return String.format(Locale.US, "markers: %s,", markers2);
        }
        return "";
    }

    private String generateJSmaxPointWidth() {
        if (maxPointWidth != null) {
            return String.format(Locale.US, "maxPointWidth: %f,", maxPointWidth);
        }
        return "";
    }

    private String generateJSmaxPointWidth1() {
        if (maxPointWidth1 != null) {
            return String.format(Locale.US, "maxPointWidth: %s,", maxPointWidth1);
        }
        return "";
    }

    private String generateJSminPointLength() {
        if (minPointLength != null) {
            return String.format(Locale.US, "minPointLength: %f,", minPointLength);
        }
        return "";
    }

    private String generateJSminPointLength1() {
        if (minPointLength1 != null) {
            return String.format(Locale.US, "minPointLength: %s,", minPointLength1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSnormal() {
        if (normal != null) {
            return String.format(Locale.US, "normal: %s,", normal);
        }
        return "";
    }

    private String generateJSpointWidth() {
        if (pointWidth != null) {
            return String.format(Locale.US, "pointWidth: %f,", pointWidth);
        }
        return "";
    }

    private String generateJSpointWidth1() {
        if (pointWidth1 != null) {
            return String.format(Locale.US, "pointWidth: %s,", pointWidth1);
        }
        return "";
    }

    private String generateJSrendering() {
        if (rendering != null) {
            return String.format(Locale.US, "rendering: %s,", rendering);
        }
        return "";
    }

    private String generateJSseriesType() {
        if (seriesType != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %s,", tooltip);
        }
        return "";
    }

    private String generateJStooltip1() {
        if (tooltip1 != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip1);
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale1() {
        if (yScale1 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale1);
        }
        return "";
    }

    private String generateJSyScale2() {
        if (yScale2 != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale2 != null) ? yScale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale3() {
        if (yScale3 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale3);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSdata2());
            js.append(generateJSdata3());
            js.append(generateJSmappingSettings());
            js.append(generateJScsvSettings());
            js.append(generateJShovered());
            js.append(generateJSlegendItem());
            js.append(generateJSmarkers());
            js.append(generateJSmarkers1());
            js.append(generateJSmarkers2());
            js.append(generateJSmaxPointWidth());
            js.append(generateJSmaxPointWidth1());
            js.append(generateJSminPointLength());
            js.append(generateJSminPointLength1());
            js.append(generateJSname());
            js.append(generateJSnormal());
            js.append(generateJSpointWidth());
            js.append(generateJSpointWidth1());
            js.append(generateJSrendering());
            js.append(generateJSseriesType());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJSyScale());
            js.append(generateJSyScale1());
            js.append(generateJSyScale2());
            js.append(generateJSyScale3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class Pareto extends Chart {

    public Pareto() {
        js.append("chart = anychart.pareto();");
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

    public void setAddseries(View var_args) {
        this.var_args = var_args;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(Set var_args1) {
        this.var_args1 = var_args1;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(String[] var_args2) {
        this.var_args2 = var_args2;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));
            js.setLength(0);
        }
    }

    private PlotController getannotations;

    public PlotController getAnnotations() {
        if (getannotations == null)
            getannotations = new PlotController("chart.annotations()");

        return getannotations;
    }

    private String[] annotationsList;

    public void setAnnotations(String[] annotationsList) {
        this.annotationsList = annotationsList;

        js.append(String.format(Locale.US, "chart.annotations(%s);", Arrays.toString(annotationsList)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.annotations(%s);", Arrays.toString(annotationsList)));
            js.setLength(0);
        }
    }

    private Double barGroupsPadding;

    public void setBargroupspadding(Double barGroupsPadding) {
        this.barGroupsPadding = barGroupsPadding;

        js.append(String.format(Locale.US, "chart.barGroupsPadding(%f);", barGroupsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.barGroupsPadding(%f);", barGroupsPadding));
            js.setLength(0);
        }
    }

    private Double barsPadding;

    public void setBarspadding(Double barsPadding) {
        this.barsPadding = barsPadding;

        js.append(String.format(Locale.US, "chart.barsPadding(%f);", barsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.barsPadding(%f);", barsPadding));
            js.setLength(0);
        }
    }

    private Crosshair getcrosshair;

    public Crosshair getCrosshair() {
        if (getcrosshair == null)
            getcrosshair = new Crosshair("chart.crosshair()");

        return getcrosshair;
    }

    private String crosshair;
    private Boolean crosshair1;

    public void setCrosshair(String crosshair) {
        this.crosshair = crosshair;

        js.append(String.format(Locale.US, "chart.crosshair(%s);", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%s);", crosshair));
            js.setLength(0);
        }
    }


    public void setCrosshair(Boolean crosshair1) {
        this.crosshair1 = crosshair1;

        js.append(String.format(Locale.US, "chart.crosshair(%b);", crosshair1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%b);", crosshair1));
            js.setLength(0);
        }
    }

    private View getdata;

    public View getData() {
        if (getdata == null)
            getdata = new View("chart.data()");

        return getdata;
    }

    private View data;
    private Set data1;
    private DataSettings data2;
    private String[] data3;
    private String data4;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data4, TextParsingMode csvSettings) {
        this.data4 = data4;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data4, TextParsingSettings csvSettings1) {
        this.data4 = data4;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data4, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data4, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String defaultSeriesType;
    private CartesianSeriesType defaultSeriesType1;

    public void setDefaultseriestype(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));
            js.setLength(0);
        }
    }


    public void setDefaultseriestype(CartesianSeriesType defaultSeriesType1) {
        this.defaultSeriesType1 = defaultSeriesType1;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private AnychartMathRect getgetPlotBounds;

    public AnychartMathRect getGetplotbounds() {
        if (getgetPlotBounds == null)
            getgetPlotBounds = new AnychartMathRect("chart.getPlotBounds()");

        return getgetPlotBounds;
    }

    private Double id;
    private String id1;

    public void setGetseries(Double id) {
        this.id = id;

        js.append(String.format(Locale.US, "chart.getSeries(%f);", id));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%f);", id));
            js.setLength(0);
        }
    }


    public void setGetseries(String id1) {
        this.id1 = id1;

        js.append(String.format(Locale.US, "chart.getSeries(%s);", id1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%s);", id1));
            js.setLength(0);
        }
    }

    private Double index;

    public void setGetseriesat(Double index) {
        this.index = index;

        js.append(String.format(Locale.US, "chart.getSeriesAt(%f);", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeriesAt(%f);", index));
            js.setLength(0);
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.getStat(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", key));
            js.setLength(0);
        }
    }


    public void setGetstat(Statistics key1) {
        this.key1 = key1;

        js.append(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index1;

    public void setGrid(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.grid(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%f);", index1));
            js.setLength(0);
        }
    }

    private String grid;
    private Boolean grid1;

    public void setGrid(String grid) {
        this.grid = grid;

        js.append(String.format(Locale.US, "chart.grid(%s);", grid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%s);", grid));
            js.setLength(0);
        }
    }


    public void setGrid(Boolean grid1) {
        this.grid1 = grid1;

        js.append(String.format(Locale.US, "chart.grid(%b);", grid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%b);", grid1));
            js.setLength(0);
        }
    }

    private Double index2;
    private String grid2;
    private Boolean grid3;

    public void setGrid(String grid2, Double index2) {
        this.grid2 = grid2;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.grid(%s, %f);", grid2, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%s, %f);", grid2, index2));
            js.setLength(0);
        }
    }


    public void setGrid(Boolean grid3, Double index2) {
        this.grid3 = grid3;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.grid(%b, %f);", grid3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%b, %f);", grid3, index2));
            js.setLength(0);
        }
    }

    private HatchFills gethatchFillPalette;

    public HatchFills getHatchfillpalette() {
        if (gethatchFillPalette == null)
            gethatchFillPalette = new HatchFills("chart.hatchFillPalette()");

        return gethatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private UiLabelsFactory gethoverLabels;

    public UiLabelsFactory getHoverlabels() {
        if (gethoverLabels == null)
            gethoverLabels = new UiLabelsFactory("chart.hoverLabels()");

        return gethoverLabels;
    }

    private String hoverLabels;
    private Boolean hoverLabels1;

    public void setHoverlabels(String hoverLabels) {
        this.hoverLabels = hoverLabels;

        js.append(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));
            js.setLength(0);
        }
    }


    public void setHoverlabels(Boolean hoverLabels1) {
        this.hoverLabels1 = hoverLabels1;

        js.append(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getlabels;

    public UiLabelsFactory getLabels() {
        if (getlabels == null)
            getlabels = new UiLabelsFactory("chart.labels()");

        return getlabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%s);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%s);", labels));
            js.setLength(0);
        }
    }


    public void setLabels(Boolean labels1) {
        this.labels1 = labels1;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels1));
            js.setLength(0);
        }
    }

    private Double index3;

    public void setLinemarker(Double index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.lineMarker(%f);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%f);", index3));
            js.setLength(0);
        }
    }

    private String lineMarker;
    private Boolean lineMarker1;

    public void setLinemarker(String lineMarker) {
        this.lineMarker = lineMarker;

        js.append(String.format(Locale.US, "chart.lineMarker(%s);", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%s);", lineMarker));
            js.setLength(0);
        }
    }


    public void setLinemarker(Boolean lineMarker1) {
        this.lineMarker1 = lineMarker1;

        js.append(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker1));
            js.setLength(0);
        }
    }

    private Double index4;
    private String lineMarker2;
    private Boolean lineMarker3;

    public void setLinemarker(String lineMarker2, Double index4) {
        this.lineMarker2 = lineMarker2;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.lineMarker(%s, %f);", lineMarker2, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%s, %f);", lineMarker2, index4));
            js.setLength(0);
        }
    }


    public void setLinemarker(Boolean lineMarker3, Double index4) {
        this.lineMarker3 = lineMarker3;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.lineMarker(%b, %f);", lineMarker3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b, %f);", lineMarker3, index4));
            js.setLength(0);
        }
    }

    private Markers getmarkerPalette;

    public Markers getMarkerpalette() {
        if (getmarkerPalette == null)
            getmarkerPalette = new Markers("chart.markerPalette()");

        return getmarkerPalette;
    }

    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = markerPalette;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));
            js.setLength(0);
        }
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;

    public void setMaxbubblesize(Double maxBubbleSize) {
        this.maxBubbleSize = maxBubbleSize;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));
            js.setLength(0);
        }
    }


    public void setMaxbubblesize(String maxBubbleSize1) {
        this.maxBubbleSize1 = maxBubbleSize1;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));
            js.setLength(0);
        }
    }

    private Double minBubbleSize;
    private String minBubbleSize1;

    public void setMinbubblesize(Double minBubbleSize) {
        this.minBubbleSize = minBubbleSize;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));
            js.setLength(0);
        }
    }


    public void setMinbubblesize(String minBubbleSize1) {
        this.minBubbleSize1 = minBubbleSize1;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));
            js.setLength(0);
        }
    }

    private Double index5;

    public void setMinorgrid(Double index5) {
        this.index5 = index5;

        js.append(String.format(Locale.US, "chart.minorGrid(%f);", index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%f);", index5));
            js.setLength(0);
        }
    }

    private String minorGrid;
    private Boolean minorGrid1;

    public void setMinorgrid(String minorGrid) {
        this.minorGrid = minorGrid;

        js.append(String.format(Locale.US, "chart.minorGrid(%s);", minorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%s);", minorGrid));
            js.setLength(0);
        }
    }


    public void setMinorgrid(Boolean minorGrid1) {
        this.minorGrid1 = minorGrid1;

        js.append(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid1));
            js.setLength(0);
        }
    }

    private Double index6;
    private String minorGrid2;
    private Boolean minorGrid3;

    public void setMinorgrid(String minorGrid2, Double index6) {
        this.minorGrid2 = minorGrid2;
        this.index6 = index6;

        js.append(String.format(Locale.US, "chart.minorGrid(%s, %f);", minorGrid2, index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%s, %f);", minorGrid2, index6));
            js.setLength(0);
        }
    }


    public void setMinorgrid(Boolean minorGrid3, Double index6) {
        this.minorGrid3 = minorGrid3;
        this.index6 = index6;

        js.append(String.format(Locale.US, "chart.minorGrid(%b, %f);", minorGrid3, index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%b, %f);", minorGrid3, index6));
            js.setLength(0);
        }
    }

    private RangeColors getpalette;

    public RangeColors getPalette() {
        if (getpalette == null)
            getpalette = new RangeColors("chart.palette()");

        return getpalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

    public void setPalette(RangeColors palette) {
        this.palette = palette;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(DistinctColors palette1) {
        this.palette1 = palette1;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(String palette2) {
        this.palette2 = palette2;

        js.append(String.format(Locale.US, "chart.palette(%s);", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", palette2));
            js.setLength(0);
        }
    }


    public void setPalette(String[] palette3) {
        this.palette3 = palette3;

        js.append(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));
            js.setLength(0);
        }
    }

    private Double index7;

    public void setRangemarker(Double index7) {
        this.index7 = index7;

        js.append(String.format(Locale.US, "chart.rangeMarker(%f);", index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%f);", index7));
            js.setLength(0);
        }
    }

    private String rangeMarker;
    private Boolean rangeMarker1;

    public void setRangemarker(String rangeMarker) {
        this.rangeMarker = rangeMarker;

        js.append(String.format(Locale.US, "chart.rangeMarker(%s);", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%s);", rangeMarker));
            js.setLength(0);
        }
    }


    public void setRangemarker(Boolean rangeMarker1) {
        this.rangeMarker1 = rangeMarker1;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker1));
            js.setLength(0);
        }
    }

    private Double index8;
    private String rangeMarker2;
    private Boolean rangeMarker3;

    public void setRangemarker(String rangeMarker2, Double index8) {
        this.rangeMarker2 = rangeMarker2;
        this.index8 = index8;

        js.append(String.format(Locale.US, "chart.rangeMarker(%s, %f);", rangeMarker2, index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%s, %f);", rangeMarker2, index8));
            js.setLength(0);
        }
    }


    public void setRangemarker(Boolean rangeMarker3, Double index8) {
        this.rangeMarker3 = rangeMarker3;
        this.index8 = index8;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b, %f);", rangeMarker3, index8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b, %f);", rangeMarker3, index8));
            js.setLength(0);
        }
    }

    private Double id2;
    private String id3;

    public void setRemoveseries(Double id2) {
        this.id2 = id2;

        js.append(String.format(Locale.US, "chart.removeSeries(%f);", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%f);", id2));
            js.setLength(0);
        }
    }


    public void setRemoveseries(String id3) {
        this.id3 = id3;

        js.append(String.format(Locale.US, "chart.removeSeries(%s);", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%s);", id3));
            js.setLength(0);
        }
    }

    private Double index9;

    public void setRemoveseriesat(Double index9) {
        this.index9 = index9;

        js.append(String.format(Locale.US, "chart.removeSeriesAt(%f);", index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeriesAt(%f);", index9));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getselectLabels;

    public UiLabelsFactory getSelectlabels() {
        if (getselectLabels == null)
            getselectLabels = new UiLabelsFactory("chart.selectLabels()");

        return getselectLabels;
    }

    private String selectLabels;
    private Boolean selectLabels1;

    public void setSelectlabels(String selectLabels) {
        this.selectLabels = selectLabels;

        js.append(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));
            js.setLength(0);
        }
    }


    public void setSelectlabels(Boolean selectLabels1) {
        this.selectLabels1 = selectLabels1;

        js.append(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));
            js.setLength(0);
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setSelectmarqueefill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setSelectmarqueefill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        this.repeat = repeat;

        js.append(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));
            js.setLength(0);
        }
    }

    private Double index10;

    public void setTextmarker(Double index10) {
        this.index10 = index10;

        js.append(String.format(Locale.US, "chart.textMarker(%f);", index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%f);", index10));
            js.setLength(0);
        }
    }

    private String textMarker;
    private Boolean textMarker1;

    public void setTextmarker(String textMarker) {
        this.textMarker = textMarker;

        js.append(String.format(Locale.US, "chart.textMarker(%s);", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%s);", textMarker));
            js.setLength(0);
        }
    }


    public void setTextmarker(Boolean textMarker1) {
        this.textMarker1 = textMarker1;

        js.append(String.format(Locale.US, "chart.textMarker(%b);", textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b);", textMarker1));
            js.setLength(0);
        }
    }

    private Double index11;
    private String textMarker2;
    private Boolean textMarker3;

    public void setTextmarker(String textMarker2, Double index11) {
        this.textMarker2 = textMarker2;
        this.index11 = index11;

        js.append(String.format(Locale.US, "chart.textMarker(%s, %f);", textMarker2, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%s, %f);", textMarker2, index11));
            js.setLength(0);
        }
    }


    public void setTextmarker(Boolean textMarker3, Double index11) {
        this.textMarker3 = textMarker3;
        this.index11 = index11;

        js.append(String.format(Locale.US, "chart.textMarker(%b, %f);", textMarker3, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b, %f);", textMarker3, index11));
            js.setLength(0);
        }
    }

    private Double index12;

    public void setXaxis(Double index12) {
        this.index12 = index12;

        js.append(String.format(Locale.US, "chart.xAxis(%f);", index12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f);", index12));
            js.setLength(0);
        }
    }

    private String xAxis;
    private Boolean xAxis1;

    public void setXaxis(String xAxis) {
        this.xAxis = xAxis;

        js.append(String.format(Locale.US, "chart.xAxis(%s);", xAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%s);", xAxis));
            js.setLength(0);
        }
    }


    public void setXaxis(Boolean xAxis1) {
        this.xAxis1 = xAxis1;

        js.append(String.format(Locale.US, "chart.xAxis(%b);", xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%b);", xAxis1));
            js.setLength(0);
        }
    }

    private Double index13;
    private String xAxis2;
    private Boolean xAxis3;

    public void setXaxis(String xAxis2, Double index13) {
        this.xAxis2 = xAxis2;
        this.index13 = index13;

        js.append(String.format(Locale.US, "chart.xAxis(%s, %f);", xAxis2, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%s, %f);", xAxis2, index13));
            js.setLength(0);
        }
    }


    public void setXaxis(Boolean xAxis3, Double index13) {
        this.xAxis3 = xAxis3;
        this.index13 = index13;

        js.append(String.format(Locale.US, "chart.xAxis(%b, %f);", xAxis3, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%b, %f);", xAxis3, index13));
            js.setLength(0);
        }
    }

    private ScalesBase getxScale;

    public ScalesBase getXscale() {
        if (getxScale == null)
            getxScale = new ScalesBase("chart.xScale()");

        return getxScale;
    }

    private ScaleTypes xScale;
    private ScalesBase xScale1;

    public void setXscale(ScaleTypes xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setXscale(ScalesBase xScale1) {
        this.xScale1 = xScale1;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private ChartScroller getxScroller;

    public ChartScroller getXscroller() {
        if (getxScroller == null)
            getxScroller = new ChartScroller("chart.xScroller()");

        return getxScroller;
    }

    private String xScroller;
    private Boolean xScroller1;

    public void setXscroller(String xScroller) {
        this.xScroller = xScroller;

        js.append(String.format(Locale.US, "chart.xScroller(%s);", xScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScroller(%s);", xScroller));
            js.setLength(0);
        }
    }


    public void setXscroller(Boolean xScroller1) {
        this.xScroller1 = xScroller1;

        js.append(String.format(Locale.US, "chart.xScroller(%b);", xScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScroller(%b);", xScroller1));
            js.setLength(0);
        }
    }

    private OrdinalZoom getxZoom;

    public OrdinalZoom getXzoom() {
        if (getxZoom == null)
            getxZoom = new OrdinalZoom("chart.xZoom()");

        return getxZoom;
    }

    private Double xZoom;
    private Boolean xZoom1;
    private String xZoom2;

    public void setXzoom(Double xZoom) {
        this.xZoom = xZoom;

        js.append(String.format(Locale.US, "chart.xZoom(%f);", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xZoom(%f);", xZoom));
            js.setLength(0);
        }
    }


    public void setXzoom(Boolean xZoom1) {
        this.xZoom1 = xZoom1;

        js.append(String.format(Locale.US, "chart.xZoom(%b);", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xZoom(%b);", xZoom1));
            js.setLength(0);
        }
    }


    public void setXzoom(String xZoom2) {
        this.xZoom2 = xZoom2;

        js.append(String.format(Locale.US, "chart.xZoom(%s);", xZoom2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xZoom(%s);", xZoom2));
            js.setLength(0);
        }
    }

    private Double index14;

    public void setYaxis(Double index14) {
        this.index14 = index14;

        js.append(String.format(Locale.US, "chart.yAxis(%f);", index14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f);", index14));
            js.setLength(0);
        }
    }

    private String yAxis;
    private Boolean yAxis1;

    public void setYaxis(String yAxis) {
        this.yAxis = yAxis;

        js.append(String.format(Locale.US, "chart.yAxis(%s);", yAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%s);", yAxis));
            js.setLength(0);
        }
    }


    public void setYaxis(Boolean yAxis1) {
        this.yAxis1 = yAxis1;

        js.append(String.format(Locale.US, "chart.yAxis(%b);", yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%b);", yAxis1));
            js.setLength(0);
        }
    }

    private Double index15;
    private String yAxis2;
    private Boolean yAxis3;

    public void setYaxis(String yAxis2, Double index15) {
        this.yAxis2 = yAxis2;
        this.index15 = index15;

        js.append(String.format(Locale.US, "chart.yAxis(%s, %f);", yAxis2, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%s, %f);", yAxis2, index15));
            js.setLength(0);
        }
    }


    public void setYaxis(Boolean yAxis3, Double index15) {
        this.yAxis3 = yAxis3;
        this.index15 = index15;

        js.append(String.format(Locale.US, "chart.yAxis(%b, %f);", yAxis3, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%b, %f);", yAxis3, index15));
            js.setLength(0);
        }
    }

    private ScalesBase getyScale;

    public ScalesBase getYscale() {
        if (getyScale == null)
            getyScale = new ScalesBase("chart.yScale()");

        return getyScale;
    }

    private ScaleTypes yScale;
    private ScalesBase yScale1;

    public void setYscale(ScaleTypes yScale) {
        this.yScale = yScale;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setYscale(ScalesBase yScale1) {
        this.yScale1 = yScale1;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String generateJSgetannotations() {
        if (getannotations != null) {
            return getannotations.generateJs();
        }
        return "";
    }

    private String generateJSgetcrosshair() {
        if (getcrosshair != null) {
            return getcrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetdata() {
        if (getdata != null) {
            return getdata.generateJs();
        }
        return "";
    }

    private String generateJSgetgetPlotBounds() {
        if (getgetPlotBounds != null) {
            return getgetPlotBounds.generateJs();
        }
        return "";
    }

    private String generateJSgethatchFillPalette() {
        if (gethatchFillPalette != null) {
            return gethatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgethoverLabels() {
        if (gethoverLabels != null) {
            return gethoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetlabels() {
        if (getlabels != null) {
            return getlabels.generateJs();
        }
        return "";
    }

    private String generateJSgetmarkerPalette() {
        if (getmarkerPalette != null) {
            return getmarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetpalette() {
        if (getpalette != null) {
            return getpalette.generateJs();
        }
        return "";
    }

    private String generateJSgetselectLabels() {
        if (getselectLabels != null) {
            return getselectLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetxScale() {
        if (getxScale != null) {
            return getxScale.generateJs();
        }
        return "";
    }

    private String generateJSgetxScroller() {
        if (getxScroller != null) {
            return getxScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetxZoom() {
        if (getxZoom != null) {
            return getxZoom.generateJs();
        }
        return "";
    }

    private String generateJSgetyScale() {
        if (getyScale != null) {
            return getyScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append(generateJSgetannotations());
        js.append(generateJSgetcrosshair());
        js.append(generateJSgetdata());
        js.append(generateJSgetgetPlotBounds());
        js.append(generateJSgethatchFillPalette());
        js.append(generateJSgethoverLabels());
        js.append(generateJSgetlabels());
        js.append(generateJSgetmarkerPalette());
        js.append(generateJSgetpalette());
        js.append(generateJSgetselectLabels());
        js.append(generateJSgetxScale());
        js.append(generateJSgetxScroller());
        js.append(generateJSgetxZoom());
        js.append(generateJSgetyScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
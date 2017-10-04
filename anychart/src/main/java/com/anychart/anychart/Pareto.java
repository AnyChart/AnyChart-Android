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

    private PlotController getAnnotations;

    public PlotController getAnnotations() {
        if (getAnnotations == null)
            getAnnotations = new PlotController("chart.annotations()");

        return getAnnotations;
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

    private Crosshair getCrosshair;

    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair("chart.crosshair()");

        return getCrosshair;
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

    private View getData;

    public View getData() {
        if (getData == null)
            getData = new View("chart.data()");

        return getData;
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

    private AnychartMathRect getGetPlotBounds;

    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect("chart.getPlotBounds()");

        return getGetPlotBounds;
    }

    private CartesianSeriesBase getGetSeries;

    public CartesianSeriesBase getGetSeries(Double id) {
        if (getGetSeries == null)
            getGetSeries = new CartesianSeriesBase("chart.getSeries("+ id+")");

        return getGetSeries;
    }

    private CartesianSeriesBase getGetSeries1;

    public CartesianSeriesBase getGetSeries1(String id1) {
        if (getGetSeries1 == null)
            getGetSeries1 = new CartesianSeriesBase("chart.getSeries1("+ id1+")");

        return getGetSeries1;
    }

    private CartesianSeriesBase getGetSeriesAt;

    public CartesianSeriesBase getGetSeriesAt(Double index) {
        if (getGetSeriesAt == null)
            getGetSeriesAt = new CartesianSeriesBase("chart.getSeriesAt("+ index+")");

        return getGetSeriesAt;
    }

    private CoreGridsLinear getGrid;

    public CoreGridsLinear getGrid() {
        if (getGrid == null)
            getGrid = new CoreGridsLinear("chart.grid()");

        return getGrid;
    }

    private CoreGridsLinear getGrid1;

    public CoreGridsLinear getGrid1(Double index1) {
        if (getGrid1 == null)
            getGrid1 = new CoreGridsLinear("chart.grid1("+ index1+")");

        return getGrid1;
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

    private HatchFills getHatchFillPalette;

    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills("chart.hatchFillPalette()");

        return getHatchFillPalette;
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

    private UiLabelsFactory getHoverLabels;

    public UiLabelsFactory getHoverLabels() {
        if (getHoverLabels == null)
            getHoverLabels = new UiLabelsFactory("chart.hoverLabels()");

        return getHoverLabels;
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

    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory("chart.labels()");

        return getLabels;
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

    private CoreAxismarkersLine getLineMarker;

    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine("chart.lineMarker()");

        return getLineMarker;
    }

    private CoreAxismarkersLine getLineMarker1;

    public CoreAxismarkersLine getLineMarker1(Double index3) {
        if (getLineMarker1 == null)
            getLineMarker1 = new CoreAxismarkersLine("chart.lineMarker1("+ index3+")");

        return getLineMarker1;
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

    private Markers getMarkerPalette;

    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers("chart.markerPalette()");

        return getMarkerPalette;
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

    private CoreGridsLinear getMinorGrid;

    public CoreGridsLinear getMinorGrid() {
        if (getMinorGrid == null)
            getMinorGrid = new CoreGridsLinear("chart.minorGrid()");

        return getMinorGrid;
    }

    private CoreGridsLinear getMinorGrid1;

    public CoreGridsLinear getMinorGrid1(Double index5) {
        if (getMinorGrid1 == null)
            getMinorGrid1 = new CoreGridsLinear("chart.minorGrid1("+ index5+")");

        return getMinorGrid1;
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

    private RangeColors getPalette;

    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors("chart.palette()");

        return getPalette;
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

    private CoreAxismarkersRange getRangeMarker;

    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange("chart.rangeMarker()");

        return getRangeMarker;
    }

    private CoreAxismarkersRange getRangeMarker1;

    public CoreAxismarkersRange getRangeMarker1(Double index7) {
        if (getRangeMarker1 == null)
            getRangeMarker1 = new CoreAxismarkersRange("chart.rangeMarker1("+ index7+")");

        return getRangeMarker1;
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

    private UiLabelsFactory getSelectLabels;

    public UiLabelsFactory getSelectLabels() {
        if (getSelectLabels == null)
            getSelectLabels = new UiLabelsFactory("chart.selectLabels()");

        return getSelectLabels;
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

    private CoreAxismarkersText getTextMarker;

    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText("chart.textMarker()");

        return getTextMarker;
    }

    private CoreAxismarkersText getTextMarker1;

    public CoreAxismarkersText getTextMarker1(Double index10) {
        if (getTextMarker1 == null)
            getTextMarker1 = new CoreAxismarkersText("chart.textMarker1("+ index10+")");

        return getTextMarker1;
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

    private CoreAxesLinear getXAxis;

    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear("chart.xAxis()");

        return getXAxis;
    }

    private CoreAxesLinear getXAxis1;

    public CoreAxesLinear getXAxis1(Double index12) {
        if (getXAxis1 == null)
            getXAxis1 = new CoreAxesLinear("chart.xAxis1("+ index12+")");

        return getXAxis1;
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

    private ScalesBase getXScale;

    public ScalesBase getXScale() {
        if (getXScale == null)
            getXScale = new ScalesBase("chart.xScale()");

        return getXScale;
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

    private ChartScroller getXScroller;

    public ChartScroller getXScroller() {
        if (getXScroller == null)
            getXScroller = new ChartScroller("chart.xScroller()");

        return getXScroller;
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

    private OrdinalZoom getXZoom;

    public OrdinalZoom getXZoom() {
        if (getXZoom == null)
            getXZoom = new OrdinalZoom("chart.xZoom()");

        return getXZoom;
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

    private CoreAxesLinear getYAxis;

    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear("chart.yAxis()");

        return getYAxis;
    }

    private CoreAxesLinear getYAxis1;

    public CoreAxesLinear getYAxis1(Double index14) {
        if (getYAxis1 == null)
            getYAxis1 = new CoreAxesLinear("chart.yAxis1("+ index14+")");

        return getYAxis1;
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

    private ScalesBase getYScale;

    public ScalesBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesBase("chart.yScale()");

        return getYScale;
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

    private String generateJSgetAnnotations() {
        if (getAnnotations != null) {
            return getAnnotations.generateJs();
        }
        return "";
    }

    private String generateJSgetCrosshair() {
        if (getCrosshair != null) {
            return getCrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGetPlotBounds() {
        if (getGetPlotBounds != null) {
            return getGetPlotBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeries() {
        if (getGetSeries != null) {
            return getGetSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeries1() {
        if (getGetSeries1 != null) {
            return getGetSeries1.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeriesAt() {
        if (getGetSeriesAt != null) {
            return getGetSeriesAt.generateJs();
        }
        return "";
    }

    private String generateJSgetGrid() {
        if (getGrid != null) {
            return getGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetGrid1() {
        if (getGrid1 != null) {
            return getGrid1.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverLabels() {
        if (getHoverLabels != null) {
            return getHoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
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
        if (getLineMarker1 != null) {
            return getLineMarker1.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorGrid() {
        if (getMinorGrid != null) {
            return getMinorGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorGrid1() {
        if (getMinorGrid1 != null) {
            return getMinorGrid1.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
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
        if (getRangeMarker1 != null) {
            return getRangeMarker1.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLabels() {
        if (getSelectLabels != null) {
            return getSelectLabels.generateJs();
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
        if (getTextMarker1 != null) {
            return getTextMarker1.generateJs();
        }
        return "";
    }

    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetXAxis1() {
        if (getXAxis1 != null) {
            return getXAxis1.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetXScroller() {
        if (getXScroller != null) {
            return getXScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetXZoom() {
        if (getXZoom != null) {
            return getXZoom.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis() {
        if (getYAxis != null) {
            return getYAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis1() {
        if (getYAxis1 != null) {
            return getYAxis1.generateJs();
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
        js.append(generateJSgetAnnotations());
        js.append(generateJSgetCrosshair());
        js.append(generateJSgetData());
        js.append(generateJSgetGetPlotBounds());
        js.append(generateJSgetGetSeries());
        js.append(generateJSgetGetSeries1());
        js.append(generateJSgetGetSeriesAt());
        js.append(generateJSgetGrid());
        js.append(generateJSgetGrid1());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHoverLabels());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLineMarker());
        js.append(generateJSgetLineMarker1());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetMinorGrid());
        js.append(generateJSgetMinorGrid1());
        js.append(generateJSgetPalette());
        js.append(generateJSgetRangeMarker());
        js.append(generateJSgetRangeMarker1());
        js.append(generateJSgetSelectLabels());
        js.append(generateJSgetTextMarker());
        js.append(generateJSgetTextMarker1());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetXScroller());
        js.append(generateJSgetXZoom());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
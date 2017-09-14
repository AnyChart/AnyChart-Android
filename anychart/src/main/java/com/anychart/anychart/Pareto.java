package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

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

    private Boolean crosshair;

    public void setCrosshair(Boolean crosshair) {
        this.crosshair = crosshair;

        js.append(String.format(Locale.US, "chart.crosshair(%b);", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%b);", crosshair));
            js.setLength(0);
        }
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

        js.append(String.format(Locale.US, "chart.data(\"%s\", %s);", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(\"%s\", %s);", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data4, TextParsingSettings csvSettings1) {
        this.data4 = data4;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(\"%s\", %s);", data4, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(\"%s\", %s);", data4, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String defaultSeriesType;
    private CartesianSeriesType defaultSeriesType1;

    public void setDefaultseriestype(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(\"%s\");", defaultSeriesType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(\"%s\");", defaultSeriesType));
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

        js.append(String.format(Locale.US, "chart.getSeries(\"%s\");", id1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(\"%s\");", id1));
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

        js.append(String.format(Locale.US, "chart.getStat(\"%s\");", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(\"%s\");", key));
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

    private Boolean grid;

    public void setGrid(Boolean grid) {
        this.grid = grid;

        js.append(String.format(Locale.US, "chart.grid(%b);", grid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%b);", grid));
            js.setLength(0);
        }
    }

    private Double index2;
    private Boolean grid1;

    public void setGrid(Double index2, Boolean grid1) {
        this.index2 = index2;
        this.grid1 = grid1;

        js.append(String.format(Locale.US, "chart.grid(%f, %b);", index2, grid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%f, %b);", index2, grid1));
            js.setLength(0);
        }
    }

    private HatchFillType[] hatchFillPalette;
    private HatchFills hatchFillPalette1;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette1 != null) ? hatchFillPalette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette1 != null) ? hatchFillPalette1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean hoverLabels;

    public void setHoverlabels(Boolean hoverLabels) {
        this.hoverLabels = hoverLabels;

        js.append(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels));
            js.setLength(0);
        }
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels));
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

    private Boolean lineMarker;

    public void setLinemarker(Boolean lineMarker) {
        this.lineMarker = lineMarker;

        js.append(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker));
            js.setLength(0);
        }
    }

    private Double index4;
    private Boolean lineMarker1;

    public void setLinemarker(Double index4, Boolean lineMarker1) {
        this.index4 = index4;
        this.lineMarker1 = lineMarker1;

        js.append(String.format(Locale.US, "chart.lineMarker(%f, %b);", index4, lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%f, %b);", index4, lineMarker1));
            js.setLength(0);
        }
    }

    private Markers markerPalette;
    private MarkerType[] markerPalette1;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = markerPalette;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(MarkerType[] markerPalette1) {
        this.markerPalette1 = markerPalette1;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette1)));
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

        js.append(String.format(Locale.US, "chart.maxBubbleSize(\"%s\");", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(\"%s\");", maxBubbleSize1));
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

        js.append(String.format(Locale.US, "chart.minBubbleSize(\"%s\");", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(\"%s\");", minBubbleSize1));
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

    private Boolean minorGrid;

    public void setMinorgrid(Boolean minorGrid) {
        this.minorGrid = minorGrid;

        js.append(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid));
            js.setLength(0);
        }
    }

    private Double index6;
    private Boolean minorGrid1;

    public void setMinorgrid(Double index6, Boolean minorGrid1) {
        this.index6 = index6;
        this.minorGrid1 = minorGrid1;

        js.append(String.format(Locale.US, "chart.minorGrid(%f, %b);", index6, minorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%f, %b);", index6, minorGrid1));
            js.setLength(0);
        }
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String[] palette2;

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


    public void setPalette(String[] palette2) {
        this.palette2 = palette2;

        js.append(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette2)));
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

    private Boolean rangeMarker;

    public void setRangemarker(Boolean rangeMarker) {
        this.rangeMarker = rangeMarker;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker));
            js.setLength(0);
        }
    }

    private Double index8;
    private Boolean rangeMarker1;

    public void setRangemarker(Double index8, Boolean rangeMarker1) {
        this.index8 = index8;
        this.rangeMarker1 = rangeMarker1;

        js.append(String.format(Locale.US, "chart.rangeMarker(%f, %b);", index8, rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%f, %b);", index8, rangeMarker1));
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

        js.append(String.format(Locale.US, "chart.removeSeries(\"%s\");", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(\"%s\");", id3));
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

    private Boolean selectLabels;

    public void setSelectlabels(Boolean selectLabels) {
        this.selectLabels = selectLabels;

        js.append(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels));
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

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(\"%s\", %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(\"%s\", %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
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


    public void setSelectmarqueefill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
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


    public void setSelectmarqueefill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
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

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
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

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, \"%s\", %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, \"%s\", %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, \"%s\", %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, \"%s\", %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(\"%s\", %f, \"%s\", %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(\"%s\", %f, \"%s\", %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
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

    private Boolean textMarker;

    public void setTextmarker(Boolean textMarker) {
        this.textMarker = textMarker;

        js.append(String.format(Locale.US, "chart.textMarker(%b);", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b);", textMarker));
            js.setLength(0);
        }
    }

    private Double index11;
    private Boolean textMarker1;

    public void setTextmarker(Double index11, Boolean textMarker1) {
        this.index11 = index11;
        this.textMarker1 = textMarker1;

        js.append(String.format(Locale.US, "chart.textMarker(%f, %b);", index11, textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%f, %b);", index11, textMarker1));
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

    private Boolean xAxis;

    public void setXaxis(Boolean xAxis) {
        this.xAxis = xAxis;

        js.append(String.format(Locale.US, "chart.xAxis(%b);", xAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%b);", xAxis));
            js.setLength(0);
        }
    }

    private Double index13;
    private Boolean xAxis1;

    public void setXaxis(Double index13, Boolean xAxis1) {
        this.index13 = index13;
        this.xAxis1 = xAxis1;

        js.append(String.format(Locale.US, "chart.xAxis(%f, %b);", index13, xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f, %b);", index13, xAxis1));
            js.setLength(0);
        }
    }

    private ScaleTypes xScale;
    private Base xScale1;

    public void setXscale(ScaleTypes xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setXscale(Base xScale1) {
        this.xScale1 = xScale1;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean xScroller;

    public void setXscroller(Boolean xScroller) {
        this.xScroller = xScroller;

        js.append(String.format(Locale.US, "chart.xScroller(%b);", xScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScroller(%b);", xScroller));
            js.setLength(0);
        }
    }

    private Double xZoom;
    private Boolean xZoom1;

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

    private Double index14;

    public void setYaxis(Double index14) {
        this.index14 = index14;

        js.append(String.format(Locale.US, "chart.yAxis(%f);", index14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f);", index14));
            js.setLength(0);
        }
    }

    private Boolean yAxis;

    public void setYaxis(Boolean yAxis) {
        this.yAxis = yAxis;

        js.append(String.format(Locale.US, "chart.yAxis(%b);", yAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%b);", yAxis));
            js.setLength(0);
        }
    }

    private Double index15;
    private Boolean yAxis1;

    public void setYaxis(Double index15, Boolean yAxis1) {
        this.index15 = index15;
        this.yAxis1 = yAxis1;

        js.append(String.format(Locale.US, "chart.yAxis(%f, %b);", index15, yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f, %b);", index15, yAxis1));
            js.setLength(0);
        }
    }

    private ScaleTypes yScale;
    private Base yScale1;

    public void setYscale(ScaleTypes yScale) {
        this.yScale = yScale;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setYscale(Base yScale1) {
        this.yScale1 = yScale1;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }


}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartsMekko extends Chart {

    public ChartsMekko() {
        js.append("chart = anychart.mekko();");
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

    private Boolean crosshair;

    public void setCrosshair(Boolean crosshair) {
        this.crosshair = crosshair;

        js.append(String.format(Locale.US, "chart.crosshair(%b);", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%b);", crosshair));
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

    private View data;
    private Set data1;
    private String[] data2;
    private String csvSettings;

    public void setMekko(View data, String csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.mekko(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.mekko(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }


    public void setMekko(Set data1, String csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.mekko(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.mekko(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }


    public void setMekko(String[] data2, String csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.mekko(%s, %s);", Arrays.toString(data2), csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.mekko(%s, %s);", Arrays.toString(data2), csvSettings));
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

    private Double pointsPadding;

    public void setPointspadding(Double pointsPadding) {
        this.pointsPadding = pointsPadding;

        js.append(String.format(Locale.US, "chart.pointsPadding(%f);", pointsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.pointsPadding(%f);", pointsPadding));
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

    private Double index1;

    public void setRemoveseriesat(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.removeSeriesAt(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeriesAt(%f);", index1));
            js.setLength(0);
        }
    }

    private Double index2;

    public void setXaxis(Double index2) {
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.xAxis(%f);", index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f);", index2));
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

    private Double index3;
    private Boolean xAxis1;

    public void setXaxis(Double index3, Boolean xAxis1) {
        this.index3 = index3;
        this.xAxis1 = xAxis1;

        js.append(String.format(Locale.US, "chart.xAxis(%f, %b);", index3, xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f, %b);", index3, xAxis1));
            js.setLength(0);
        }
    }

    private ScaleTypes xScale;
    private Ordinal xScale1;

    public void setXscale(ScaleTypes xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setXscale(Ordinal xScale1) {
        this.xScale1 = xScale1;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index4;

    public void setYaxis(Double index4) {
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.yAxis(%f);", index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f);", index4));
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

    private Double index5;
    private Boolean yAxis1;

    public void setYaxis(Double index5, Boolean yAxis1) {
        this.index5 = index5;
        this.yAxis1 = yAxis1;

        js.append(String.format(Locale.US, "chart.yAxis(%f, %b);", index5, yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f, %b);", index5, yAxis1));
            js.setLength(0);
        }
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


}
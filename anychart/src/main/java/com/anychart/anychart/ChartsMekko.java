package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
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

    private Double index3;
    private String xAxis2;
    private Boolean xAxis3;

    public void setXaxis(String xAxis2, Double index3) {
        this.xAxis2 = xAxis2;
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.xAxis(%s, %f);", xAxis2, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%s, %f);", xAxis2, index3));
            js.setLength(0);
        }
    }


    public void setXaxis(Boolean xAxis3, Double index3) {
        this.xAxis3 = xAxis3;
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.xAxis(%b, %f);", xAxis3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%b, %f);", xAxis3, index3));
            js.setLength(0);
        }
    }

    private Ordinal getxScale;

    public Ordinal getXscale() {
        if (getxScale == null)
            getxScale = new Ordinal("chart.xScale()");

        return getxScale;
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

    private Double index5;
    private String yAxis2;
    private Boolean yAxis3;

    public void setYaxis(String yAxis2, Double index5) {
        this.yAxis2 = yAxis2;
        this.index5 = index5;

        js.append(String.format(Locale.US, "chart.yAxis(%s, %f);", yAxis2, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%s, %f);", yAxis2, index5));
            js.setLength(0);
        }
    }


    public void setYaxis(Boolean yAxis3, Double index5) {
        this.yAxis3 = yAxis3;
        this.index5 = index5;

        js.append(String.format(Locale.US, "chart.yAxis(%b, %f);", yAxis3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%b, %f);", yAxis3, index5));
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

    private String generateJSgethatchFillPalette() {
        if (gethatchFillPalette != null) {
            return gethatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetpalette() {
        if (getpalette != null) {
            return getpalette.generateJs();
        }
        return "";
    }

    private String generateJSgetxScale() {
        if (getxScale != null) {
            return getxScale.generateJs();
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
        js.append(generateJSgethatchFillPalette());
        js.append(generateJSgetpalette());
        js.append(generateJSgetxScale());
        js.append(generateJSgetyScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * TagCloud chart class.
 */
public class TagCloud extends SeparateChart {

    protected TagCloud(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public TagCloud setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public TagCloud setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public TagCloud setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    
    private Double[] angles;
    private List<TagCloud> setAngles = new ArrayList<>();

    /**
     * Setter for tags rotation angles.
     */
    public TagCloud setAngles(Double[] angles) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".angles(%s)", Arrays.toString(angles)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".angles(%s)", Arrays.toString(angles)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAngles() {
        if (!setAngles.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setAngles) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double anglesCount;
    private List<TagCloud> setAnglesCount = new ArrayList<>();

    /**
     * Setter for the angles count.
     */
    public TagCloud setAnglesCount(Double anglesCount) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".anglesCount(%f)", anglesCount));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".anglesCount(%f)", anglesCount));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAnglesCount() {
        if (!setAnglesCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setAnglesCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiColorRange getColorRange;

    /**
     * Getter for color range.
     */
    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;
    private Boolean colorRange1;
    private List<TagCloud> setColorRange = new ArrayList<>();

    /**
     * Setter for color range.
     */
    public TagCloud setColorRange(String colorRange) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorRange() {
        if (!setColorRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setColorRange1 = new ArrayList<>();

    /**
     * Setter for color range.
     */
    public TagCloud setColorRange(Boolean colorRange1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%b)", colorRange1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%b)", colorRange1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorRange1() {
        if (!setColorRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private OrdinalColor getColorScale;

    /**
     * Getter for the color scale.
     */
    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }
    private LinearColor colorScale;
    private OrdinalColor colorScale1;
    private String colorScale2;
    private ScaleTypes colorScale3;
    private String colorScale4;
    private List<TagCloud> setColorScale = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public TagCloud setColorScale(LinearColor colorScale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(colorScale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setColorScale1 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public TagCloud setColorScale(OrdinalColor colorScale1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(colorScale1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setColorScale2 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public TagCloud setColorScale(String colorScale2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", wrapQuotes(colorScale2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", wrapQuotes(colorScale2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorScale2() {
        if (!setColorScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setColorScale3 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
    public TagCloud setColorScale(ScaleTypes colorScale3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", ((colorScale3 != null) ? colorScale3.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale3 != null) ? colorScale3.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorScale3() {
        if (!setColorScale3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setColorScale3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private List<TagCloud> setData = new ArrayList<>();

    /**
     * Setter for chart data.
<b>Note:</b> All data is words values.
     */
    public TagCloud data(List<DataEntry> data) {
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
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fromAngle;
    private List<TagCloud> setFromAngle = new ArrayList<>();

    /**
     * Setter for the starting angle.
     */
    public TagCloud setFromAngle(Double fromAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fromAngle(%f)", fromAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fromAngle(%f)", fromAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFromAngle() {
        if (!setFromAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setFromAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<Point> getGetPoint = new ArrayList<>();

    /**
     * Gets wrapped point by index.
     */
    public Point getGetPoint(Double index) {
        Point item = new Point(jsBase + ".getPoint("+ index+")");
        getGetPoint.add(item);
        return item;
    }
    private Double index1;
    private Double[] index2;
    private List<TagCloud> setHover = new ArrayList<>();

    /**
     * Hovers a point by its index.
     */
    public TagCloud hover(Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f)", index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setHover1 = new ArrayList<>();

    /**
     * Hovers a point by its index.
     */
    public TagCloud hover(Double[] index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(index2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", Arrays.toString(index2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover1() {
        if (!setHover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setHover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getHovered;

    /**
     * Getter for the hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;
    private List<TagCloud> setHovered = new ArrayList<>();

    /**
     * Setter for the hovered state settings.
     */
    public TagCloud setHovered(String hovered) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TagCloudMode mode;
    private String mode1;
    private List<TagCloud> setMode = new ArrayList<>();

    /**
     * Setter for the tag cloud mode.
     */
    public TagCloud setMode(TagCloudMode mode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMode() {
        if (!setMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setMode1 = new ArrayList<>();

    /**
     * Setter for the tag cloud mode.
     */
    public TagCloud setMode(String mode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMode1() {
        if (!setMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setMode1) {
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
    private List<TagCloud> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public TagCloud setNormal(String normal) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private RangeColors getPalette;

    /**
     * Getter for the  palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }
    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;
    private List<TagCloud> setPalette = new ArrayList<>();

    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public TagCloud setPalette(RangeColors palette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setPalette1 = new ArrayList<>();

    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public TagCloud setPalette(DistinctColors palette1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setPalette2 = new ArrayList<>();

    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public TagCloud setPalette(String palette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setPalette3 = new ArrayList<>();

    /**
     * Setter for the palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public TagCloud setPalette(String[] palette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScalesBase getScale;

    /**
     * Getter for the font scale.
     */
    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }
    private ScaleTypes scale;
    private String scale1;
    private ScalesBase scale2;
    private String scale3;
    private List<TagCloud> setScale = new ArrayList<>();

    /**
     * Setter for the font scale.
     */
    public TagCloud setScale(ScaleTypes scale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setScale1 = new ArrayList<>();

    /**
     * Setter for the font scale.
     */
    public TagCloud setScale(String scale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale1() {
        if (!setScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setScale2 = new ArrayList<>();

    /**
     * Setter for the font scale.
     */
    public TagCloud setScale(ScalesBase scale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(scale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".scale(%s);",  ((scale2 != null) ? scale2.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetScale2() {
        if (!setScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private List<TagCloud> setSelect = new ArrayList<>();

    /**
     * Selects points by index.
<b>Note:</b> Works only after {@link anychart.charts.TagCloud#draw} is called.
     */
    public TagCloud select(Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f)", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f)", index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes;
    private List<TagCloud> setSelect1 = new ArrayList<>();

    /**
     * Selects points by indexes.
<b>Note:</b> Works only after {@link anychart.charts.TagCloud#draw} is called.
     */
    public TagCloud select(Double[] indexes) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setSelect1) {
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
    private List<TagCloud> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public TagCloud setSelected(String selected) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double textSpacing;
    private List<TagCloud> setTextSpacing = new ArrayList<>();

    /**
     * Setter for text spacing.
     */
    public TagCloud setTextSpacing(Double textSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textSpacing(%f)", textSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textSpacing(%f)", textSpacing));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextSpacing() {
        if (!setTextSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setTextSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double toAngle;
    private List<TagCloud> setToAngle = new ArrayList<>();

    /**
     * Setter for the end angle.
     */
    public TagCloud setToAngle(Double toAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".toAngle(%f)", toAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".toAngle(%f)", toAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetToAngle() {
        if (!setToAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setToAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    /**
     * Deselects all points or points by index.
     */
    public void unselect(Double indexOrIndexes) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%f);", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f)", indexOrIndexes));
            js.setLength(0);
        }
    }


    /**
     * Deselects all points or points by index.
     */
    public void unselect(Double[] indexOrIndexes1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s);", Arrays.toString(indexOrIndexes1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s)", Arrays.toString(indexOrIndexes1)));
            js.setLength(0);
        }
    }

    private String generateJSgetColorRange() {
        if (getColorRange != null) {
            return getColorRange.generateJs();
        }
        return "";
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGetPoint() {
        if (!getGetPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Point item : getGetPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetColorRange());
        js.append(generateJSgetColorScale());
        js.append(generateJSgetData());
        js.append(generateJSgetGetPoint());
        js.append(generateJSgetHovered());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetScale());
        js.append(generateJSgetSelected());
        js.append(generateJSsetAngles());
        js.append(generateJSsetAnglesCount());
        js.append(generateJSsetColorRange());
        js.append(generateJSsetColorRange1());
        js.append(generateJSsetColorScale());
        js.append(generateJSsetColorScale1());
        js.append(generateJSsetColorScale2());
        js.append(generateJSsetColorScale3());
        js.append(generateJSsetData());
        js.append(generateJSsetFromAngle());
        js.append(generateJSsetHover());
        js.append(generateJSsetHover1());
        js.append(generateJSsetHovered());
        js.append(generateJSsetMode());
        js.append(generateJSsetMode1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetScale2());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetTextSpacing());
        js.append(generateJSsetToAngle());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
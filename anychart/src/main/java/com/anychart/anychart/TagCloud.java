package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

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

    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append("chart.listen('pointClick', function(e) {");
        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        ListenersInterface.getInstance().setOnClickListener(listener);
    }

    
    private Number[] angles;

    /**
     * Setter for tags rotation angles.
     */
    public TagCloud setAngles(Number[] angles) {
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

    private Number anglesCount;

    /**
     * Setter for the angles count.
     */
    public TagCloud setAnglesCount(Number anglesCount) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".anglesCount(%s)", anglesCount));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".anglesCount(%s)", anglesCount));
            js.setLength(0);
        }
        return this;
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale != null) ? colorScale.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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


    private View getData;

    /**
     * Getter for chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for chart data.
<b>Note:</b> All data is words values.
     */
    public TagCloud setData(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public TagCloud setData(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", view.getJsBase()));
            js.setLength(0);
        }
        return this;
    }

    private Number fromAngle;

    /**
     * Setter for the starting angle.
     */
    public TagCloud setFromAngle(Number fromAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fromAngle(%s)", fromAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fromAngle(%s)", fromAngle));
            js.setLength(0);
        }
        return this;
    }


    private List<Point> getGetPoint = new ArrayList<>();

    /**
     * Gets wrapped point by index.
     */
    public Point getGetPoint(Number index) {
        Point item = new Point(jsBase + ".getPoint("+ index+")");
        getGetPoint.add(item);
        return item;
    }
    private Number index1;
    private Number[] index2;

    /**
     * Hovers a point by its index.
     */
    public TagCloud hover(Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Hovers a point by its index.
     */
    public TagCloud hover(Number[] index2) {
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

    private TagCloudMode mode;
    private String mode1;

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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((palette != null) ? palette.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((palette1 != null) ? palette1.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale2 != null) ? scale2.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private Number index3;

    /**
     * Selects points by index.
<b>Note:</b> Works only after {@link anychart.charts.TagCloud#draw} is called.
     */
    public TagCloud select(Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", index3));
            js.setLength(0);
        }
        return this;
    }

    private Number[] indexes;

    /**
     * Selects points by indexes.
<b>Note:</b> Works only after {@link anychart.charts.TagCloud#draw} is called.
     */
    public TagCloud select(Number[] indexes) {
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

    private Number textSpacing;

    /**
     * Setter for text spacing.
     */
    public TagCloud setTextSpacing(Number textSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textSpacing(%s)", textSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textSpacing(%s)", textSpacing));
            js.setLength(0);
        }
        return this;
    }

    private Number toAngle;

    /**
     * Setter for the end angle.
     */
    public TagCloud setToAngle(Number toAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".toAngle(%s)", toAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".toAngle(%s)", toAngle));
            js.setLength(0);
        }
        return this;
    }

    private Number indexOrIndexes;
    private Number[] indexOrIndexes1;

    /**
     * Deselects all points or points by index.
     */
    public void unselect(Number indexOrIndexes) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s);", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s)", indexOrIndexes));
            js.setLength(0);
        }
    }


    /**
     * Deselects all points or points by index.
     */
    public void unselect(Number[] indexOrIndexes1) {
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

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
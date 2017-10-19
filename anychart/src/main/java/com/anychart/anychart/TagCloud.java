package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class TagCloud extends SeparateChart {

    protected TagCloud(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    
    private Double[] angles;
    private List<TagCloud> setAngles = new ArrayList<>();

    public TagCloud setAngles(Double[] angles) {
        this.angles = angles;
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

    public TagCloud setAnglesCount(Double anglesCount) {
        this.anglesCount = anglesCount;
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

    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;
    private Boolean colorRange1;
    private List<TagCloud> setColorRange = new ArrayList<>();

    public TagCloud setColorRange(String colorRange) {
        this.colorRange = colorRange;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%s)", colorRange));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%s)", colorRange));
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

    public TagCloud setColorRange(Boolean colorRange1) {
        this.colorRange1 = colorRange1;
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

    public TagCloud setColorScale(LinearColor colorScale) {
        this.colorScale = colorScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));
            js.setLength(0);
        }
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

    public TagCloud setColorScale(OrdinalColor colorScale1) {
        this.colorScale1 = colorScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));
            js.setLength(0);
        }
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

    public TagCloud setColorScale(String colorScale2) {
        this.colorScale2 = colorScale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", colorScale2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", colorScale2));
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

    public TagCloud setColorScale(ScaleTypes colorScale3) {
        this.colorScale3 = colorScale3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale3 != null) ? colorScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale3 != null) ? colorScale3.generateJs() : "null"));
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

    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private View data;
    private Set data1;
    private String[] data2;
    private DataSettings data3;
    private String data4;
    private TextParsingMode settings;
    private String settings1;
    private TextParsingSettings settings2;
    private List<TagCloud> setData = new ArrayList<>();

    public TagCloud setData(View data, TextParsingMode settings) {
        this.data = data;
        this.settings = settings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));
            js.setLength(0);
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

    private List<TagCloud> setData1 = new ArrayList<>();

    public TagCloud setData(View data, String settings1) {
        this.data = data;
        this.settings1 = settings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", settings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", settings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData2 = new ArrayList<>();

    public TagCloud setData(View data, TextParsingSettings settings2) {
        this.data = data;
        this.settings2 = settings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData3 = new ArrayList<>();

    public TagCloud setData(Set data1, TextParsingMode settings) {
        this.data1 = data1;
        this.settings = settings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData4 = new ArrayList<>();

    public TagCloud setData(Set data1, String settings1) {
        this.data1 = data1;
        this.settings1 = settings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", settings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", settings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData5 = new ArrayList<>();

    public TagCloud setData(Set data1, TextParsingSettings settings2) {
        this.data1 = data1;
        this.settings2 = settings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData6 = new ArrayList<>();

    public TagCloud setData(String[] data2, TextParsingMode settings) {
        this.data2 = data2;
        this.settings = settings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (settings != null) ? settings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (settings != null) ? settings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData7 = new ArrayList<>();

    public TagCloud setData(String[] data2, String settings1) {
        this.data2 = data2;
        this.settings1 = settings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), settings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), settings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData8 = new ArrayList<>();

    public TagCloud setData(String[] data2, TextParsingSettings settings2) {
        this.data2 = data2;
        this.settings2 = settings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (settings2 != null) ? settings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (settings2 != null) ? settings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData8() {
        if (!setData8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData9 = new ArrayList<>();

    public TagCloud setData(DataSettings data3, TextParsingMode settings) {
        this.data3 = data3;
        this.settings = settings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (settings != null) ? settings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData9() {
        if (!setData9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData10 = new ArrayList<>();

    public TagCloud setData(DataSettings data3, String settings1) {
        this.data3 = data3;
        this.settings1 = settings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", settings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", settings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData10() {
        if (!setData10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData11 = new ArrayList<>();

    public TagCloud setData(DataSettings data3, TextParsingSettings settings2) {
        this.data3 = data3;
        this.settings2 = settings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (settings2 != null) ? settings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData11() {
        if (!setData11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData12 = new ArrayList<>();

    public TagCloud setData(String data4, TextParsingMode settings) {
        this.data4 = data4;
        this.settings = settings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (settings != null) ? settings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, (settings != null) ? settings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData12() {
        if (!setData12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData13 = new ArrayList<>();

    public TagCloud setData(String data4, String settings1) {
        this.data4 = data4;
        this.settings1 = settings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, settings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, settings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData13() {
        if (!setData13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TagCloud> setData14 = new ArrayList<>();

    public TagCloud setData(String data4, TextParsingSettings settings2) {
        this.data4 = data4;
        this.settings2 = settings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (settings2 != null) ? settings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, (settings2 != null) ? settings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData14() {
        if (!setData14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TagCloud item : setData14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fromAngle;
    private List<TagCloud> setFromAngle = new ArrayList<>();

    public TagCloud setFromAngle(Double fromAngle) {
        this.fromAngle = fromAngle;
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

    public Point getGetPoint(Double index) {
        Point item = new Point(jsBase + ".getPoint("+ index+")");
        getGetPoint.add(item);
        return item;
    }
    private Double index1;
    private Double[] index2;
    private List<TagCloud> setHover = new ArrayList<>();

    public TagCloud hover(Double index1) {
        this.index1 = index1;
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

    public TagCloud hover(Double[] index2) {
        this.index2 = index2;
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

    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;
    private List<TagCloud> setHovered = new ArrayList<>();

    public TagCloud setHovered(String hovered) {
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

    public TagCloud setMode(TagCloudMode mode) {
        this.mode = mode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));
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

    public TagCloud setMode(String mode1) {
        this.mode1 = mode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".mode(%s)", mode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", mode1));
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

    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }
    private String normal;
    private List<TagCloud> setNormal = new ArrayList<>();

    public TagCloud setNormal(String normal) {
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

    public TagCloud setPalette(RangeColors palette) {
        this.palette = palette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
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

    public TagCloud setPalette(DistinctColors palette1) {
        this.palette1 = palette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
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

    public TagCloud setPalette(String palette2) {
        this.palette2 = palette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", palette2));
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

    public TagCloud setPalette(String[] palette3) {
        this.palette3 = palette3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));
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

    public TagCloud setScale(ScaleTypes scale) {
        this.scale = scale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));
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

    public TagCloud setScale(String scale1) {
        this.scale1 = scale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", scale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", scale1));
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

    public TagCloud setScale(ScalesBase scale2) {
        this.scale2 = scale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));
            js.setLength(0);
        }
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

    public TagCloud select(Double index3) {
        this.index3 = index3;
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

    public TagCloud select(Double[] indexes) {
        this.indexes = indexes;
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

    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }
    private String selected;
    private List<TagCloud> setSelected = new ArrayList<>();

    public TagCloud setSelected(String selected) {
        this.selected = selected;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", selected));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", selected));
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

    public TagCloud setTextSpacing(Double textSpacing) {
        this.textSpacing = textSpacing;
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

    public TagCloud setToAngle(Double toAngle) {
        this.toAngle = toAngle;
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

    public void unselect(Double indexOrIndexes) {
        this.indexOrIndexes = indexOrIndexes;
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


    public void unselect(Double[] indexOrIndexes1) {
        this.indexOrIndexes1 = indexOrIndexes1;
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
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetData6());
        js.append(generateJSsetData7());
        js.append(generateJSsetData8());
        js.append(generateJSsetData9());
        js.append(generateJSsetData10());
        js.append(generateJSsetData11());
        js.append(generateJSsetData12());
        js.append(generateJSsetData13());
        js.append(generateJSsetData14());
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
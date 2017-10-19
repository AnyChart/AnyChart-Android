package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class TreeMap extends SeparateChart {

    protected TreeMap(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    

    private UiColorRange getColorRange;

    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;
    private List<TreeMap> setColorRange = new ArrayList<>();

    public TreeMap setColorRange(String colorRange) {
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
            for (TreeMap item : setColorRange) {
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
    private OrdinalColor colorScale;
    private LinearColor colorScale1;
    private String colorScale2;
    private ScaleTypes colorScale3;
    private String colorScale4;
    private List<LinearColor> setColorScale = new ArrayList<>();

    public LinearColor setColorScale(OrdinalColor colorScale) {
        this.colorScale = colorScale;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", (colorScale != null) ? colorScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale" + variableIndex);
        setColorScale.add(item);
        return item;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale1 = new ArrayList<>();

    public LinearColor setColorScale(LinearColor colorScale1) {
        this.colorScale1 = colorScale1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale1" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", (colorScale1 != null) ? colorScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale1" + variableIndex);
        setColorScale1.add(item);
        return item;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale2 = new ArrayList<>();

    public LinearColor setColorScale(String colorScale2) {
        this.colorScale2 = colorScale2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale2" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", colorScale2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", colorScale2));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale2" + variableIndex);
        setColorScale2.add(item);
        return item;
    }
    private String generateJSsetColorScale2() {
        if (!setColorScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LinearColor> setColorScale3 = new ArrayList<>();

    public LinearColor setColorScale(ScaleTypes colorScale3) {
        this.colorScale3 = colorScale3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColorScale3" + ++variableIndex + " = " + jsBase + ".colorScale(%s);", (colorScale3 != null) ? colorScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", (colorScale3 != null) ? colorScale3.generateJs() : "null"));
            js.setLength(0);
        }
        LinearColor item = new LinearColor("setColorScale3" + variableIndex);
        setColorScale3.add(item);
        return item;
    }
    private String generateJSsetColorScale3() {
        if (!setColorScale3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LinearColor item : setColorScale3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Tree getData;

    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }
    private Tree data;
    private TreeView data1;
    private String data2;
    private TreeFillingMethod fillMethod;
    private String fillMethod1;
    private List<TreeMap> setData = new ArrayList<>();

    public TreeMap setData(Tree data, TreeFillingMethod fillMethod) {
        this.data = data;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setData1 = new ArrayList<>();

    public TreeMap setData(Tree data, String fillMethod1) {
        this.data = data;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setData2 = new ArrayList<>();

    public TreeMap setData(TreeView data1, TreeFillingMethod fillMethod) {
        this.data1 = data1;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setData3 = new ArrayList<>();

    public TreeMap setData(TreeView data1, String fillMethod1) {
        this.data1 = data1;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setData4 = new ArrayList<>();

    public TreeMap setData(String data2, TreeFillingMethod fillMethod) {
        this.data2 = data2;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data2, (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data2, (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setData5 = new ArrayList<>();

    public TreeMap setData(String data2, String fillMethod1) {
        this.data2 = data2;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data2, fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data2, fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TreeDataItem target;
    private String[] target1;
    private String target2;

    public void drillTo(TreeDataItem target) {
        this.target = target;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillTo(%s);", (target != null) ? target.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", (target != null) ? target.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void drillTo(String[] target1) {
        this.target1 = target1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillTo(%s);", Arrays.toString(target1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", Arrays.toString(target1)));
            js.setLength(0);
        }
    }


    public void drillTo(String target2) {
        this.target2 = target2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillTo(%s);", target2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillTo(%s)", target2));
            js.setLength(0);
        }
    }

    private Fill fill;
    private List<TreeMap> setFill = new ArrayList<>();

    public TreeMap setFill(Fill fill) {
        this.fill = fill;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<TreeMap> setFill1 = new ArrayList<>();

    public TreeMap fill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f)", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", color, opacity));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<TreeMap> setFill2 = new ArrayList<>();

    public TreeMap fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill3 = new ArrayList<>();

    public TreeMap fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill4 = new ArrayList<>();

    public TreeMap fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill5 = new ArrayList<>();

    public TreeMap fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill6 = new ArrayList<>();

    public TreeMap fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill7 = new ArrayList<>();

    public TreeMap fill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<TreeMap> setFill8 = new ArrayList<>();

    public TreeMap fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setFill9 = new ArrayList<>();

    public TreeMap fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness;
    private Double size;
    private List<TreeMap> setHatchFill = new ArrayList<>();

    public TreeMap setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHatchFill1 = new ArrayList<>();

    public TreeMap setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHatchFill2 = new ArrayList<>();

    public TreeMap setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHatchFill3 = new ArrayList<>();

    public TreeMap setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHatchFill4 = new ArrayList<>();

    public TreeMap setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiLabelsFactory getHeaders;

    public UiLabelsFactory getHeaders() {
        if (getHeaders == null)
            getHeaders = new UiLabelsFactory(jsBase + ".headers()");

        return getHeaders;
    }
    private String headers;
    private Boolean headers1;
    private List<TreeMap> setHeaders = new ArrayList<>();

    public TreeMap setHeaders(String headers) {
        this.headers = headers;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headers(%s)", headers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headers(%s)", headers));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeaders() {
        if (!setHeaders.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHeaders) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHeaders1 = new ArrayList<>();

    public TreeMap setHeaders(Boolean headers1) {
        this.headers1 = headers1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headers(%b)", headers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headers(%b)", headers1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeaders1() {
        if (!setHeaders1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHeaders1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsDisplayMode headersDisplayMode;
    private String headersDisplayMode1;
    private List<TreeMap> setHeadersDisplayMode = new ArrayList<>();

    public TreeMap setHeadersDisplayMode(LabelsDisplayMode headersDisplayMode) {
        this.headersDisplayMode = headersDisplayMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headersDisplayMode(%s)", (headersDisplayMode != null) ? headersDisplayMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headersDisplayMode(%s)", (headersDisplayMode != null) ? headersDisplayMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeadersDisplayMode() {
        if (!setHeadersDisplayMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHeadersDisplayMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setHeadersDisplayMode1 = new ArrayList<>();

    public TreeMap setHeadersDisplayMode(String headersDisplayMode1) {
        this.headersDisplayMode1 = headersDisplayMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headersDisplayMode(%s)", headersDisplayMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headersDisplayMode(%s)", headersDisplayMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeadersDisplayMode1() {
        if (!setHeadersDisplayMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHeadersDisplayMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double hintDepth;
    private List<TreeMap> setHintDepth = new ArrayList<>();

    public TreeMap setHintDepth(Double hintDepth) {
        this.hintDepth = hintDepth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hintDepth(%f)", hintDepth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hintDepth(%f)", hintDepth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHintDepth() {
        if (!setHintDepth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHintDepth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double hintOpacity;
    private List<TreeMap> setHintOpacity = new ArrayList<>();

    public TreeMap setHintOpacity(Double hintOpacity) {
        this.hintOpacity = hintOpacity;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hintOpacity(%f)", hintOpacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hintOpacity(%f)", hintOpacity));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHintOpacity() {
        if (!setHintOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setHintOpacity) {
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
    private List<TreeMap> setHovered = new ArrayList<>();

    public TreeMap setHovered(String hovered) {
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
            for (TreeMap item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<TreeMap> setLabels = new ArrayList<>();

    public TreeMap setLabels(String labels) {
        this.labels = labels;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", labels));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setLabels1 = new ArrayList<>();

    public TreeMap setLabels(Boolean labels1) {
        this.labels1 = labels1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%b)", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<TreeMap> setMarkers = new ArrayList<>();

    public TreeMap setMarkers(String markers) {
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
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setMarkers1 = new ArrayList<>();

    public TreeMap setMarkers(Boolean markers1) {
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
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxDepth;
    private List<TreeMap> setMaxDepth = new ArrayList<>();

    public TreeMap setMaxDepth(Double maxDepth) {
        this.maxDepth = maxDepth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxDepth(%f)", maxDepth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxDepth(%f)", maxDepth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxDepth() {
        if (!setMaxDepth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setMaxDepth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxHeadersHeight;
    private String maxHeadersHeight1;
    private List<TreeMap> setMaxHeadersHeight = new ArrayList<>();

    public TreeMap setMaxHeadersHeight(Double maxHeadersHeight) {
        this.maxHeadersHeight = maxHeadersHeight;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHeadersHeight(%f)", maxHeadersHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHeadersHeight(%f)", maxHeadersHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxHeadersHeight() {
        if (!setMaxHeadersHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setMaxHeadersHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setMaxHeadersHeight1 = new ArrayList<>();

    public TreeMap setMaxHeadersHeight(String maxHeadersHeight1) {
        this.maxHeadersHeight1 = maxHeadersHeight1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxHeadersHeight(%s)", maxHeadersHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxHeadersHeight(%s)", maxHeadersHeight1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxHeadersHeight1() {
        if (!setMaxHeadersHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setMaxHeadersHeight1) {
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
    private List<TreeMap> setNormal = new ArrayList<>();

    public TreeMap setNormal(String normal) {
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
            for (TreeMap item : setNormal) {
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
    private List<TreeMap> setSelected = new ArrayList<>();

    public TreeMap setSelected(String selected) {
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
            for (TreeMap item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private SelectionMode selectionMode;
    private String selectionMode1;
    private List<TreeMap> setSelectionMode = new ArrayList<>();

    public TreeMap setSelectionMode(SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectionMode() {
        if (!setSelectionMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setSelectionMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setSelectionMode1 = new ArrayList<>();

    public TreeMap setSelectionMode(String selectionMode1) {
        this.selectionMode1 = selectionMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectionMode1() {
        if (!setSelectionMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setSelectionMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Sort sort;
    private String sort1;
    private List<TreeMap> setSort = new ArrayList<>();

    public TreeMap setSort(Sort sort) {
        this.sort = sort;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", (sort != null) ? sort.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", (sort != null) ? sort.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSort() {
        if (!setSort.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setSort) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setSort1 = new ArrayList<>();

    public TreeMap setSort(String sort1) {
        this.sort1 = sort1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sort(%s)", sort1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", sort1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSort1() {
        if (!setSort1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setSort1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<TreeMap> setStroke = new ArrayList<>();

    public TreeMap setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setStroke1 = new ArrayList<>();

    public TreeMap setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeMap> setStroke2 = new ArrayList<>();

    public TreeMap setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color4 = color4;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeMap item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHeaders() {
        if (getHeaders != null) {
            return getHeaders.generateJs();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
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
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHeaders());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetSelected());
        js.append(generateJSsetColorRange());
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
        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetHeaders());
        js.append(generateJSsetHeaders1());
        js.append(generateJSsetHeadersDisplayMode());
        js.append(generateJSsetHeadersDisplayMode1());
        js.append(generateJSsetHintDepth());
        js.append(generateJSsetHintOpacity());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetMaxDepth());
        js.append(generateJSsetMaxHeadersHeight());
        js.append(generateJSsetMaxHeadersHeight1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSelectionMode());
        js.append(generateJSsetSelectionMode1());
        js.append(generateJSsetSort());
        js.append(generateJSsetSort1());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
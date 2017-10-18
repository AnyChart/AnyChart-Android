package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Cartesian3d extends Cartesian {

    protected Cartesian3d(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    
    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<CartesianSeriesLine> setLine2d = new ArrayList<>();

    public CartesianSeriesLine line2d(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d" + variableIndex);
        setLine2d.add(item);
        return item;
    }
    private String generateJSsetLine2d() {
        if (!setLine2d.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d1 = new ArrayList<>();

    public CartesianSeriesLine line2d(View data, String csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d1" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d1" + variableIndex);
        setLine2d1.add(item);
        return item;
    }
    private String generateJSsetLine2d1() {
        if (!setLine2d1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d2 = new ArrayList<>();

    public CartesianSeriesLine line2d(View data, TextParsingSettings csvSettings2) {
        this.data = data;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d2" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d2" + variableIndex);
        setLine2d2.add(item);
        return item;
    }
    private String generateJSsetLine2d2() {
        if (!setLine2d2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d3 = new ArrayList<>();

    public CartesianSeriesLine line2d(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d3" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d3" + variableIndex);
        setLine2d3.add(item);
        return item;
    }
    private String generateJSsetLine2d3() {
        if (!setLine2d3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d4 = new ArrayList<>();

    public CartesianSeriesLine line2d(Set data1, String csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d4" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d4" + variableIndex);
        setLine2d4.add(item);
        return item;
    }
    private String generateJSsetLine2d4() {
        if (!setLine2d4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d5 = new ArrayList<>();

    public CartesianSeriesLine line2d(Set data1, TextParsingSettings csvSettings2) {
        this.data1 = data1;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d5" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d5" + variableIndex);
        setLine2d5.add(item);
        return item;
    }
    private String generateJSsetLine2d5() {
        if (!setLine2d5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d6 = new ArrayList<>();

    public CartesianSeriesLine line2d(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d6" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d6" + variableIndex);
        setLine2d6.add(item);
        return item;
    }
    private String generateJSsetLine2d6() {
        if (!setLine2d6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d7 = new ArrayList<>();

    public CartesianSeriesLine line2d(String[] data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d7" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", Arrays.toString(data2), csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", Arrays.toString(data2), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", Arrays.toString(data2), csvSettings1));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d7" + variableIndex);
        setLine2d7.add(item);
        return item;
    }
    private String generateJSsetLine2d7() {
        if (!setLine2d7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d8 = new ArrayList<>();

    public CartesianSeriesLine line2d(String[] data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d8" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d8" + variableIndex);
        setLine2d8.add(item);
        return item;
    }
    private String generateJSsetLine2d8() {
        if (!setLine2d8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d9 = new ArrayList<>();

    public CartesianSeriesLine line2d(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d9" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d9" + variableIndex);
        setLine2d9.add(item);
        return item;
    }
    private String generateJSsetLine2d9() {
        if (!setLine2d9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d10 = new ArrayList<>();

    public CartesianSeriesLine line2d(String data3, String csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d10" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", data3, csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", data3, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", data3, csvSettings1));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d10" + variableIndex);
        setLine2d10.add(item);
        return item;
    }
    private String generateJSsetLine2d10() {
        if (!setLine2d10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d11 = new ArrayList<>();

    public CartesianSeriesLine line2d(String data3, TextParsingSettings csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d11" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d11" + variableIndex);
        setLine2d11.add(item);
        return item;
    }
    private String generateJSsetLine2d11() {
        if (!setLine2d11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zAngle;
    private List<Cartesian3d> setZAngle = new ArrayList<>();

    public Cartesian3d setZAngle(Double zAngle) {
        this.zAngle = zAngle;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAngle(%f)", zAngle));

//        js.append(String.format(Locale.US, ".zAngle(%f)", zAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAngle(%f)", zAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAngle() {
        if (!setZAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zAspect;
    private String zAspect1;
    private List<Cartesian3d> setZAspect = new ArrayList<>();

    public Cartesian3d setZAspect(Double zAspect) {
        this.zAspect = zAspect;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%f)", zAspect));

//        js.append(String.format(Locale.US, ".zAspect(%f)", zAspect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%f)", zAspect));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAspect() {
        if (!setZAspect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAspect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setZAspect1 = new ArrayList<>();

    public Cartesian3d setZAspect(String zAspect1) {
        this.zAspect1 = zAspect1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%s)", zAspect1));

//        js.append(String.format(Locale.US, ".zAspect(%s)", zAspect1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%s)", zAspect1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAspect1() {
        if (!setZAspect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAspect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean zDistribution;
    private List<Cartesian3d> setZDistribution = new ArrayList<>();

    public Cartesian3d setZDistribution(Boolean zDistribution) {
        this.zDistribution = zDistribution;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zDistribution(%b)", zDistribution));

//        js.append(String.format(Locale.US, ".zDistribution(%b)", zDistribution));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zDistribution(%b)", zDistribution));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZDistribution() {
        if (!setZDistribution.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZDistribution) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zPadding;
    private List<Cartesian3d> setZPadding = new ArrayList<>();

    public Cartesian3d setZPadding(Double zPadding) {
        this.zPadding = zPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zPadding(%f)", zPadding));

//        js.append(String.format(Locale.US, ".zPadding(%f)", zPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zPadding(%f)", zPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZPadding() {
        if (!setZPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSsetLine2d());
        js.append(generateJSsetLine2d1());
        js.append(generateJSsetLine2d2());
        js.append(generateJSsetLine2d3());
        js.append(generateJSsetLine2d4());
        js.append(generateJSsetLine2d5());
        js.append(generateJSsetLine2d6());
        js.append(generateJSsetLine2d7());
        js.append(generateJSsetLine2d8());
        js.append(generateJSsetLine2d9());
        js.append(generateJSsetLine2d10());
        js.append(generateJSsetLine2d11());
        js.append(generateJSsetZAngle());
        js.append(generateJSsetZAspect());
        js.append(generateJSsetZAspect1());
        js.append(generateJSsetZDistribution());
        js.append(generateJSsetZPadding());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
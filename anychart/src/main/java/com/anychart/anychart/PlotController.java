package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Plot controller class.
 */
public class PlotController extends VisualBase {

    public PlotController() {
        js.setLength(0);
        js.append("var plotController").append(++variableIndex).append(" = anychart.core.annotations.plotController();");
        jsBase = "plotController" + variableIndex;
    }

    protected PlotController(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PlotController(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AnnotationTypes annotationTypeOrConfig;
    private String annotationTypeOrConfig1;
    private AnnotationJSONFormat annotationTypeOrConfig2;
    private List<AnnotationsBase> setAdd = new ArrayList<>();

    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(AnnotationTypes annotationTypeOrConfig) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig = annotationTypeOrConfig;
        } else {
            this.annotationTypeOrConfig = annotationTypeOrConfig;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAdd" + ++variableIndex + " = " + jsBase + ".add(%s);", ((annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s);", ((annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null")));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setAdd" + variableIndex);
        setAdd.add(item);
        return item;
    }
    private String generateJSsetAdd() {
        if (!setAdd.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setAdd) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnnotationsBase> setAdd1 = new ArrayList<>();

    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(String annotationTypeOrConfig1) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
        } else {
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAdd1" + ++variableIndex + " = " + jsBase + ".add(%s);", wrapQuotes(annotationTypeOrConfig1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s);", wrapQuotes(annotationTypeOrConfig1)));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setAdd1" + variableIndex);
        setAdd1.add(item);
        return item;
    }
    private String generateJSsetAdd1() {
        if (!setAdd1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setAdd1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnnotationsBase> setAdd2 = new ArrayList<>();

    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(AnnotationJSONFormat annotationTypeOrConfig2) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
        } else {
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAdd2" + ++variableIndex + " = " + jsBase + ".add(%s);", ((annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s);", ((annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setAdd2" + variableIndex);
        setAdd2.add(item);
        return item;
    }
    private String generateJSsetAdd2() {
        if (!setAdd2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setAdd2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config;
    private List<AndrewsPitchfork> setAndrewsPitchfork = new ArrayList<>();

    /**
     * Creates and returns an Andrews Pitchfork annotation.
     */
    public AndrewsPitchfork andrewsPitchfork(String config) {
        if (jsBase == null) {
            this.config = config;
        } else {
            this.config = config;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAndrewsPitchfork" + ++variableIndex + " = " + jsBase + ".andrewsPitchfork(%s);", wrapQuotes(config)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".andrewsPitchfork(%s);", wrapQuotes(config)));
                js.setLength(0);
            }
        }
        AndrewsPitchfork item = new AndrewsPitchfork("setAndrewsPitchfork" + variableIndex);
        setAndrewsPitchfork.add(item);
        return item;
    }
    private String generateJSsetAndrewsPitchfork() {
        if (!setAndrewsPitchfork.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AndrewsPitchfork item : setAndrewsPitchfork) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config1;
    private List<AnnotationsEllipse> setEllipse = new ArrayList<>();

    /**
     * Creates and returns an Ellipse annotation.
     */
    public AnnotationsEllipse ellipse(String config1) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            
            this.config1 = config1;
        } else {
            this.config1 = config1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setEllipse" + ++variableIndex + " = " + jsBase + ".ellipse(%s);", wrapQuotes(config1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%s);", wrapQuotes(config1)));
                js.setLength(0);
            }
        }
        AnnotationsEllipse item = new AnnotationsEllipse("setEllipse" + variableIndex);
        setEllipse.add(item);
        return item;
    }
    private String generateJSsetEllipse() {
        if (!setEllipse.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsEllipse item : setEllipse) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config2;
    private List<FibonacciArc> setFibonacciArc = new ArrayList<>();

    /**
     * Creates and returns a Fibonacci Arc annotation.
     */
    public FibonacciArc fibonacciArc(String config2) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            
            this.config2 = config2;
        } else {
            this.config2 = config2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFibonacciArc" + ++variableIndex + " = " + jsBase + ".fibonacciArc(%s);", wrapQuotes(config2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciArc(%s);", wrapQuotes(config2)));
                js.setLength(0);
            }
        }
        FibonacciArc item = new FibonacciArc("setFibonacciArc" + variableIndex);
        setFibonacciArc.add(item);
        return item;
    }
    private String generateJSsetFibonacciArc() {
        if (!setFibonacciArc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciArc item : setFibonacciArc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config3;
    private List<FibonacciFan> setFibonacciFan = new ArrayList<>();

    /**
     * Creates and returns a Fibonacci Fan annotation.
     */
    public FibonacciFan fibonacciFan(String config3) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            
            this.config3 = config3;
        } else {
            this.config3 = config3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFibonacciFan" + ++variableIndex + " = " + jsBase + ".fibonacciFan(%s);", wrapQuotes(config3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciFan(%s);", wrapQuotes(config3)));
                js.setLength(0);
            }
        }
        FibonacciFan item = new FibonacciFan("setFibonacciFan" + variableIndex);
        setFibonacciFan.add(item);
        return item;
    }
    private String generateJSsetFibonacciFan() {
        if (!setFibonacciFan.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciFan item : setFibonacciFan) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config4;
    private List<FibonacciRetracement> setFibonacciRetracement = new ArrayList<>();

    /**
     * Creates and returns a Fibonacci Retracement annotation.
     */
    public FibonacciRetracement fibonacciRetracement(String config4) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            
            this.config4 = config4;
        } else {
            this.config4 = config4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFibonacciRetracement" + ++variableIndex + " = " + jsBase + ".fibonacciRetracement(%s);", wrapQuotes(config4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciRetracement(%s);", wrapQuotes(config4)));
                js.setLength(0);
            }
        }
        FibonacciRetracement item = new FibonacciRetracement("setFibonacciRetracement" + variableIndex);
        setFibonacciRetracement.add(item);
        return item;
    }
    private String generateJSsetFibonacciRetracement() {
        if (!setFibonacciRetracement.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciRetracement item : setFibonacciRetracement) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config5;
    private List<FibonacciTimezones> setFibonacciTimezones = new ArrayList<>();

    /**
     * Creates and returns a Fibonacci Timezones annotation.
     */
    public FibonacciTimezones fibonacciTimezones(String config5) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            
            this.config5 = config5;
        } else {
            this.config5 = config5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFibonacciTimezones" + ++variableIndex + " = " + jsBase + ".fibonacciTimezones(%s);", wrapQuotes(config5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciTimezones(%s);", wrapQuotes(config5)));
                js.setLength(0);
            }
        }
        FibonacciTimezones item = new FibonacciTimezones("setFibonacciTimezones" + variableIndex);
        setFibonacciTimezones.add(item);
        return item;
    }
    private String generateJSsetFibonacciTimezones() {
        if (!setFibonacciTimezones.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (FibonacciTimezones item : setFibonacciTimezones) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config6;
    private String config7;

    /**
     * Creates annotations list by JSON config.
     */
    public PlotController fromJson(String config6) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            
            this.config6 = config6;
        } else {
            this.config6 = config6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fromJson(%s)", wrapQuotes(config6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromJson(%s);", wrapQuotes(config6)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String config8;

    /**
     * Creates annotations list by XML config.
     */
    public PlotController fromXml(String config8) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            
            this.config8 = config8;
        } else {
            this.config8 = config8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fromXml(%s)", wrapQuotes(config8)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromXml(%s);", wrapQuotes(config8)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private List<AnnotationsBase> setGetAnnotationAt = new ArrayList<>();

    /**
     * Returns annotation by index.
     */
    public AnnotationsBase getAnnotationAt(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setGetAnnotationAt" + ++variableIndex + " = " + jsBase + ".getAnnotationAt(%s);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getAnnotationAt(%s);", index));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setGetAnnotationAt" + variableIndex);
        setGetAnnotationAt.add(item);
        return item;
    }
    private String generateJSsetGetAnnotationAt() {
        if (!setGetAnnotationAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setGetAnnotationAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config9;
    private List<HorizontalLine> setHorizontalLine = new ArrayList<>();

    /**
     * Creates and returns a Horizontal Line annotation.
     */
    public HorizontalLine horizontalLine(String config9) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            
            this.config9 = config9;
        } else {
            this.config9 = config9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHorizontalLine" + ++variableIndex + " = " + jsBase + ".horizontalLine(%s);", wrapQuotes(config9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".horizontalLine(%s);", wrapQuotes(config9)));
                js.setLength(0);
            }
        }
        HorizontalLine item = new HorizontalLine("setHorizontalLine" + variableIndex);
        setHorizontalLine.add(item);
        return item;
    }
    private String generateJSsetHorizontalLine() {
        if (!setHorizontalLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HorizontalLine item : setHorizontalLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config10;
    private List<InfiniteLine> setInfiniteLine = new ArrayList<>();

    /**
     * Creates and returns an Infinite Line annotation.
     */
    public InfiniteLine infiniteLine(String config10) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            
            this.config10 = config10;
        } else {
            this.config10 = config10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setInfiniteLine" + ++variableIndex + " = " + jsBase + ".infiniteLine(%s);", wrapQuotes(config10)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".infiniteLine(%s);", wrapQuotes(config10)));
                js.setLength(0);
            }
        }
        InfiniteLine item = new InfiniteLine("setInfiniteLine" + variableIndex);
        setInfiniteLine.add(item);
        return item;
    }
    private String generateJSsetInfiniteLine() {
        if (!setInfiniteLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (InfiniteLine item : setInfiniteLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config11;
    private List<AnnotationsLabel> setLabel = new ArrayList<>();

    /**
     * Creates and returns a Label annotation.
     */
    public AnnotationsLabel label(String config11) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            
            this.config11 = config11;
        } else {
            this.config11 = config11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel" + ++variableIndex + " = " + jsBase + ".label(%s);", wrapQuotes(config11)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(config11)));
                js.setLength(0);
            }
        }
        AnnotationsLabel item = new AnnotationsLabel("setLabel" + variableIndex);
        setLabel.add(item);
        return item;
    }
    private String generateJSsetLabel() {
        if (!setLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsLabel item : setLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config12;
    private List<AnnotationsLine> setLine = new ArrayList<>();

    /**
     * Creates and returns a Line annotation.
     */
    public AnnotationsLine line(String config12) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            
            this.config12 = config12;
        } else {
            this.config12 = config12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s);", wrapQuotes(config12)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", wrapQuotes(config12)));
                js.setLength(0);
            }
        }
        AnnotationsLine item = new AnnotationsLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config13;
    private List<AnnotationsMarker> setMarker = new ArrayList<>();

    /**
     * Creates and returns a Marker annotation.
     */
    public AnnotationsMarker marker(String config13) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            
            this.config13 = config13;
        } else {
            this.config13 = config13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s);", wrapQuotes(config13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s);", wrapQuotes(config13)));
                js.setLength(0);
            }
        }
        AnnotationsMarker item = new AnnotationsMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config14;
    private List<Ray> setRay = new ArrayList<>();

    /**
     * Creates and returns a Ray annotation.
     */
    public Ray ray(String config14) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            
            this.config14 = config14;
        } else {
            this.config14 = config14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRay" + ++variableIndex + " = " + jsBase + ".ray(%s);", wrapQuotes(config14)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ray(%s);", wrapQuotes(config14)));
                js.setLength(0);
            }
        }
        Ray item = new Ray("setRay" + variableIndex);
        setRay.add(item);
        return item;
    }
    private String generateJSsetRay() {
        if (!setRay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Ray item : setRay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config15;
    private List<Rectangle> setRectangle = new ArrayList<>();

    /**
     * Creates and returns a Rectangle annotation.
     */
    public Rectangle rectangle(String config15) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            
            this.config15 = config15;
        } else {
            this.config15 = config15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRectangle" + ++variableIndex + " = " + jsBase + ".rectangle(%s);", wrapQuotes(config15)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rectangle(%s);", wrapQuotes(config15)));
                js.setLength(0);
            }
        }
        Rectangle item = new Rectangle("setRectangle" + variableIndex);
        setRectangle.add(item);
        return item;
    }
    private String generateJSsetRectangle() {
        if (!setRectangle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Rectangle item : setRectangle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnnotationsBase annotation;

    /**
     * Removes an annotation from a plot by its instance.
     */
    public PlotController removeAnnotation(AnnotationsBase annotation) {
        if (jsBase == null) {
            this.annotation = annotation;
        } else {
            this.annotation = annotation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeAnnotation(%s);",  ((annotation != null) ? annotation.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAnnotation(%s);", ((annotation != null) ? annotation.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;

    /**
     * Removes an annotation from a plot by its index.
     */
    public PlotController removeAnnotationAt(Number index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".removeAnnotationAt(%s)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAnnotationAt(%s);", index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationsBase annotation1;

    /**
     * Selects annotation.
     */
    public PlotController select(AnnotationsBase annotation1) {
        if (jsBase == null) {
            this.annotation = null;
            this.annotation1 = null;
            
            this.annotation1 = annotation1;
        } else {
            this.annotation1 = annotation1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".select(%s);",  ((annotation1 != null) ? annotation1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", ((annotation1 != null) ? annotation1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationTypes annotationTypeOrConfig3;
    private String annotationTypeOrConfig4;
    private AnnotationJSONFormat annotationTypeOrConfig5;
    private List<AnnotationsBase> setStartDrawing = new ArrayList<>();

    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationTypes annotationTypeOrConfig3) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
        } else {
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStartDrawing" + ++variableIndex + " = " + jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setStartDrawing" + variableIndex);
        setStartDrawing.add(item);
        return item;
    }
    private String generateJSsetStartDrawing() {
        if (!setStartDrawing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setStartDrawing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnnotationsBase> setStartDrawing1 = new ArrayList<>();

    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(String annotationTypeOrConfig4) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig4 = annotationTypeOrConfig4;
        } else {
            this.annotationTypeOrConfig4 = annotationTypeOrConfig4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStartDrawing1" + ++variableIndex + " = " + jsBase + ".startDrawing(%s);", wrapQuotes(annotationTypeOrConfig4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s);", wrapQuotes(annotationTypeOrConfig4)));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setStartDrawing1" + variableIndex);
        setStartDrawing1.add(item);
        return item;
    }
    private String generateJSsetStartDrawing1() {
        if (!setStartDrawing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setStartDrawing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnnotationsBase> setStartDrawing2 = new ArrayList<>();

    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationJSONFormat annotationTypeOrConfig5) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig5 = annotationTypeOrConfig5;
        } else {
            this.annotationTypeOrConfig5 = annotationTypeOrConfig5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStartDrawing2" + ++variableIndex + " = " + jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig5 != null) ? annotationTypeOrConfig5.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig5 != null) ? annotationTypeOrConfig5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        AnnotationsBase item = new AnnotationsBase("setStartDrawing2" + variableIndex);
        setStartDrawing2.add(item);
        return item;
    }
    private String generateJSsetStartDrawing2() {
        if (!setStartDrawing2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnnotationsBase item : setStartDrawing2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean stringify;

    /**
     * Return plot annotations configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        if (jsBase == null) {
            this.stringify = stringify;
        } else {
            this.stringify = stringify;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toJson(%b);", stringify));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b);", stringify));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;

    /**
     * Return plot annotations configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
        } else {
            this.asXmlNode = asXmlNode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toXml(%b);", asXmlNode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b);", asXmlNode));
                js.setLength(0);
            }
        }
    }

    private String config16;
    private List<TrendChannel> setTrendChannel = new ArrayList<>();

    /**
     * Creates and returns a Trend Channel annotation.
     */
    public TrendChannel trendChannel(String config16) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            this.config16 = null;
            
            this.config16 = config16;
        } else {
            this.config16 = config16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTrendChannel" + ++variableIndex + " = " + jsBase + ".trendChannel(%s);", wrapQuotes(config16)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".trendChannel(%s);", wrapQuotes(config16)));
                js.setLength(0);
            }
        }
        TrendChannel item = new TrendChannel("setTrendChannel" + variableIndex);
        setTrendChannel.add(item);
        return item;
    }
    private String generateJSsetTrendChannel() {
        if (!setTrendChannel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TrendChannel item : setTrendChannel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config17;
    private List<Triangle> setTriangle = new ArrayList<>();

    /**
     * Creates and returns a Triangle annotation.
     */
    public Triangle triangle(String config17) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            this.config16 = null;
            this.config17 = null;
            
            this.config17 = config17;
        } else {
            this.config17 = config17;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTriangle" + ++variableIndex + " = " + jsBase + ".triangle(%s);", wrapQuotes(config17)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".triangle(%s);", wrapQuotes(config17)));
                js.setLength(0);
            }
        }
        Triangle item = new Triangle("setTriangle" + variableIndex);
        setTriangle.add(item);
        return item;
    }
    private String generateJSsetTriangle() {
        if (!setTriangle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Triangle item : setTriangle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String config18;
    private List<VerticalLine> setVerticalLine = new ArrayList<>();

    /**
     * Creates and returns a Vertical Line annotation.
     */
    public VerticalLine verticalLine(String config18) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            this.config16 = null;
            this.config17 = null;
            this.config18 = null;
            
            this.config18 = config18;
        } else {
            this.config18 = config18;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setVerticalLine" + ++variableIndex + " = " + jsBase + ".verticalLine(%s);", wrapQuotes(config18)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".verticalLine(%s);", wrapQuotes(config18)));
                js.setLength(0);
            }
        }
        VerticalLine item = new VerticalLine("setVerticalLine" + variableIndex);
        setVerticalLine.add(item);
        return item;
    }
    private String generateJSsetVerticalLine() {
        if (!setVerticalLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VerticalLine item : setVerticalLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAdd());
        js.append(generateJSsetAdd1());
        js.append(generateJSsetAdd2());
        js.append(generateJSsetAndrewsPitchfork());
        js.append(generateJSsetEllipse());
        js.append(generateJSsetFibonacciArc());
        js.append(generateJSsetFibonacciFan());
        js.append(generateJSsetFibonacciRetracement());
        js.append(generateJSsetFibonacciTimezones());
        js.append(generateJSsetGetAnnotationAt());
        js.append(generateJSsetHorizontalLine());
        js.append(generateJSsetInfiniteLine());
        js.append(generateJSsetLabel());
        js.append(generateJSsetLine());
        js.append(generateJSsetMarker());
        js.append(generateJSsetRay());
        js.append(generateJSsetRectangle());
        js.append(generateJSsetStartDrawing());
        js.append(generateJSsetStartDrawing1());
        js.append(generateJSsetStartDrawing2());
        js.append(generateJSsetTrendChannel());
        js.append(generateJSsetTriangle());
        js.append(generateJSsetVerticalLine());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
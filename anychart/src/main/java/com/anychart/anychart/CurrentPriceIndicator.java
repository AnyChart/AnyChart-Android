package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Stock current price indicator class.
 */
public class CurrentPriceIndicator extends VisualBase {

    public CurrentPriceIndicator() {
        js.setLength(0);
        js.append("var currentPriceIndicator").append(++variableIndex).append(" = anychart.core.axisMarkers.currentPriceIndicator();");
        jsBase = "currentPriceIndicator" + variableIndex;
    }

    protected CurrentPriceIndicator(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CurrentPriceIndicator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private CoreAxesLinear getAxis;

    /**
     * Getter for the target axis.
     */
    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }

    private Double axis;
    private CoreAxesLinear axis1;
    private List<CurrentPriceIndicator> setAxis = new ArrayList<>();

    /**
     * Setter for the target axis.
     */
    public CurrentPriceIndicator setAxis(Double axis) {
        if (jsBase == null) {
            this.axis = null;
            this.axis1 = null;
            
            this.axis = axis;
        } else {
            this.axis = axis;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".axis(%f)", axis));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axis(%f)", axis));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAxis() {
        if (!setAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setAxis1 = new ArrayList<>();

    /**
     * Setter for the target axis.
     */
    public CurrentPriceIndicator setAxis(CoreAxesLinear axis1) {
        if (jsBase == null) {
            this.axis = null;
            this.axis1 = null;
            
            this.axis1 = axis1;
        } else {
            this.axis1 = axis1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(axis1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".axis(%s);",  ((axis1 != null) ? axis1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetAxis1() {
        if (!setAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabel getFallingLabel;

    /**
     * Getter for the price indicator falling label.
     */
    public UiLabel getFallingLabel() {
        if (getFallingLabel == null)
            getFallingLabel = new UiLabel(jsBase + ".fallingLabel()");

        return getFallingLabel;
    }

    private String index;
    private Double index1;
    private Boolean fallingLabel;
    private String fallingLabel1;
    private List<CurrentPriceIndicator> setFallingLabel = new ArrayList<>();

    /**
     * Setter for the price indicator falling label.
     */
    public CurrentPriceIndicator setFallingLabel(String index, Boolean fallingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel = fallingLabel;
        } else {
            this.index = index;
            this.fallingLabel = fallingLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingLabel(%s, %b)", wrapQuotes(index), fallingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%s, %b)", wrapQuotes(index), fallingLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingLabel() {
        if (!setFallingLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setFallingLabel1 = new ArrayList<>();

    /**
     * Setter for the price indicator falling label.
     */
    public CurrentPriceIndicator setFallingLabel(String index, String fallingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel1 = fallingLabel1;
        } else {
            this.index = index;
            this.fallingLabel1 = fallingLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingLabel(%s, %s)", wrapQuotes(index), wrapQuotes(fallingLabel1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%s, %s)", wrapQuotes(index), wrapQuotes(fallingLabel1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingLabel1() {
        if (!setFallingLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setFallingLabel2 = new ArrayList<>();

    /**
     * Setter for the price indicator falling label.
     */
    public CurrentPriceIndicator setFallingLabel(Double index1, Boolean fallingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel = fallingLabel;
        } else {
            this.index1 = index1;
            this.fallingLabel = fallingLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingLabel(%f, %b)", index1, fallingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%f, %b)", index1, fallingLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingLabel2() {
        if (!setFallingLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setFallingLabel3 = new ArrayList<>();

    /**
     * Setter for the price indicator falling label.
     */
    public CurrentPriceIndicator setFallingLabel(Double index1, String fallingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.fallingLabel = null;
            this.fallingLabel1 = null;
            
            this.fallingLabel1 = fallingLabel1;
        } else {
            this.index1 = index1;
            this.fallingLabel1 = fallingLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingLabel(%f, %s)", index1, wrapQuotes(fallingLabel1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingLabel(%f, %s)", index1, wrapQuotes(fallingLabel1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingLabel3() {
        if (!setFallingLabel3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingLabel3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke fallingStroke;
    private ColoredFill fallingStroke1;
    private String fallingStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<CurrentPriceIndicator> setFallingStroke = new ArrayList<>();

    /**
     * Setter for the price indicator falling stroke.
     */
    public CurrentPriceIndicator setFallingStroke(Stroke fallingStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke = fallingStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke != null) ? fallingStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke != null) ? fallingStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke() {
        if (!setFallingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setFallingStroke1 = new ArrayList<>();

    /**
     * Setter for the price indicator falling stroke.
     */
    public CurrentPriceIndicator setFallingStroke(ColoredFill fallingStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke1 = fallingStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke1 != null) ? fallingStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((fallingStroke1 != null) ? fallingStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke1() {
        if (!setFallingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setFallingStroke2 = new ArrayList<>();

    /**
     * Setter for the price indicator falling stroke.
     */
    public CurrentPriceIndicator setFallingStroke(String fallingStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.fallingStroke = null;
            this.fallingStroke1 = null;
            this.fallingStroke2 = null;
            
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.fallingStroke2 = fallingStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(fallingStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(fallingStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke2() {
        if (!setFallingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setFallingStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getLabel;

    /**
     * Getter for the price indicator label.
     */
    public UiLabelsFactory getLabel() {
        if (getLabel == null)
            getLabel = new UiLabelsFactory(jsBase + ".label()");

        return getLabel;
    }

    private String index2;
    private Double index3;
    private Boolean label;
    private String label1;
    private List<CurrentPriceIndicator> setLabel = new ArrayList<>();

    /**
     * Setter for the price indicator label.
     */
    public CurrentPriceIndicator setLabel(String index2, Boolean label) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            
            this.label = label;
        } else {
            this.index2 = index2;
            this.label = label;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%s, %b)", wrapQuotes(index2), label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %b)", wrapQuotes(index2), label));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel() {
        if (!setLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setLabel1 = new ArrayList<>();

    /**
     * Setter for the price indicator label.
     */
    public CurrentPriceIndicator setLabel(String index2, String label1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            
            this.label1 = label1;
        } else {
            this.index2 = index2;
            this.label1 = label1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%s, %s)", wrapQuotes(index2), wrapQuotes(label1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %s)", wrapQuotes(index2), wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel1() {
        if (!setLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setLabel2 = new ArrayList<>();

    /**
     * Setter for the price indicator label.
     */
    public CurrentPriceIndicator setLabel(Double index3, Boolean label) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            
            this.label = label;
        } else {
            this.index3 = index3;
            this.label = label;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%f, %b)", index3, label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %b)", index3, label));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel2() {
        if (!setLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setLabel3 = new ArrayList<>();

    /**
     * Setter for the price indicator label.
     */
    public CurrentPriceIndicator setLabel(Double index3, String label1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            
            this.label1 = label1;
        } else {
            this.index3 = index3;
            this.label1 = label1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%f, %s)", index3, wrapQuotes(label1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %s)", index3, wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel3() {
        if (!setLabel3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setLabel3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabel getRisingLabel;

    /**
     * Getter for the price indicator rising label.
     */
    public UiLabel getRisingLabel() {
        if (getRisingLabel == null)
            getRisingLabel = new UiLabel(jsBase + ".risingLabel()");

        return getRisingLabel;
    }

    private String index4;
    private Double index5;
    private Boolean risingLabel;
    private String risingLabel1;
    private List<CurrentPriceIndicator> setRisingLabel = new ArrayList<>();

    /**
     * Setter for the price indicator rising label.
     */
    public CurrentPriceIndicator setRisingLabel(String index4, Boolean risingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index4 = index4;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel = risingLabel;
        } else {
            this.index4 = index4;
            this.risingLabel = risingLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingLabel(%s, %b)", wrapQuotes(index4), risingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%s, %b)", wrapQuotes(index4), risingLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingLabel() {
        if (!setRisingLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setRisingLabel1 = new ArrayList<>();

    /**
     * Setter for the price indicator rising label.
     */
    public CurrentPriceIndicator setRisingLabel(String index4, String risingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index4 = index4;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel1 = risingLabel1;
        } else {
            this.index4 = index4;
            this.risingLabel1 = risingLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingLabel(%s, %s)", wrapQuotes(index4), wrapQuotes(risingLabel1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%s, %s)", wrapQuotes(index4), wrapQuotes(risingLabel1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingLabel1() {
        if (!setRisingLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setRisingLabel2 = new ArrayList<>();

    /**
     * Setter for the price indicator rising label.
     */
    public CurrentPriceIndicator setRisingLabel(Double index5, Boolean risingLabel) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index5 = index5;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel = risingLabel;
        } else {
            this.index5 = index5;
            this.risingLabel = risingLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingLabel(%f, %b)", index5, risingLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%f, %b)", index5, risingLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingLabel2() {
        if (!setRisingLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setRisingLabel3 = new ArrayList<>();

    /**
     * Setter for the price indicator rising label.
     */
    public CurrentPriceIndicator setRisingLabel(Double index5, String risingLabel1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            this.index5 = null;
            
            this.index5 = index5;
            this.risingLabel = null;
            this.risingLabel1 = null;
            
            this.risingLabel1 = risingLabel1;
        } else {
            this.index5 = index5;
            this.risingLabel1 = risingLabel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingLabel(%f, %s)", index5, wrapQuotes(risingLabel1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingLabel(%f, %s)", index5, wrapQuotes(risingLabel1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingLabel3() {
        if (!setRisingLabel3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingLabel3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke risingStroke;
    private ColoredFill risingStroke1;
    private String risingStroke2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<CurrentPriceIndicator> setRisingStroke = new ArrayList<>();

    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public CurrentPriceIndicator setRisingStroke(Stroke risingStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke = risingStroke;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke = risingStroke;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke != null) ? risingStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke != null) ? risingStroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke() {
        if (!setRisingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setRisingStroke1 = new ArrayList<>();

    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public CurrentPriceIndicator setRisingStroke(ColoredFill risingStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke1 = risingStroke1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke1 = risingStroke1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke1 != null) ? risingStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((risingStroke1 != null) ? risingStroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke1() {
        if (!setRisingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setRisingStroke2 = new ArrayList<>();

    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public CurrentPriceIndicator setRisingStroke(String risingStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.risingStroke = null;
            this.risingStroke1 = null;
            this.risingStroke2 = null;
            
            this.risingStroke2 = risingStroke2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.risingStroke2 = risingStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(risingStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(risingStroke2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke2() {
        if (!setRisingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setRisingStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesBase getSeries;

    /**
     * Getter for the target series.
     */
    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private Double series;
    private StockSeriesBase series1;
    private List<CurrentPriceIndicator> setSeries = new ArrayList<>();

    /**
     * Setter for the target series.
     */
    public CurrentPriceIndicator setSeries(Double series) {
        if (jsBase == null) {
            this.series = null;
            this.series1 = null;
            
            this.series = series;
        } else {
            this.series = series;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".series(%f)", series));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%f)", series));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeries() {
        if (!setSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setSeries1 = new ArrayList<>();

    /**
     * Setter for the target series.
     */
    public CurrentPriceIndicator setSeries(StockSeriesBase series1) {
        if (jsBase == null) {
            this.series = null;
            this.series1 = null;
            
            this.series1 = series1;
        } else {
            this.series1 = series1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(series1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".series(%s);",  ((series1 != null) ? series1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetSeries1() {
        if (!setSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;
    private List<CurrentPriceIndicator> setStroke = new ArrayList<>();

    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CurrentPriceIndicator setStroke(Stroke stroke, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.stroke = stroke;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setStroke1 = new ArrayList<>();

    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CurrentPriceIndicator setStroke(ColoredFill stroke1, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.stroke1 = stroke1;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setStroke2 = new ArrayList<>();

    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CurrentPriceIndicator setStroke(String stroke2, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.stroke2 = stroke2;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PriceIndicatorDataSource value;
    private String value1;
    private Double value2;
    private List<CurrentPriceIndicator> setValue = new ArrayList<>();

    /**
     * Setter for the stock price indicator.
     */
    public CurrentPriceIndicator setValue(PriceIndicatorDataSource value) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value = value;
        } else {
            this.value = value;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", ((value != null) ? value.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", ((value != null) ? value.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue() {
        if (!setValue.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setValue) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setValue1 = new ArrayList<>();

    /**
     * Setter for the stock price indicator.
     */
    public CurrentPriceIndicator setValue(String value1) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value1 = value1;
        } else {
            this.value1 = value1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", wrapQuotes(value1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", wrapQuotes(value1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue1() {
        if (!setValue1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setValue1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> setValue2 = new ArrayList<>();

    /**
     * Setter for the stock price indicator.
     */
    public CurrentPriceIndicator setValue(Double value2) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value2 = value2;
        } else {
            this.value2 = value2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%f)", value2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%f)", value2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue2() {
        if (!setValue2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : setValue2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valueField;

    /**
     * Setter for the price indicator value field.<br/>
valueField() method use with {@link anychart.core.axisMarkers.CurrentPriceIndicator#value} method.
This method sets the field to be used as the value for the price indicator
     */
    public void setValueField(String valueField) {
        if (jsBase == null) {
            this.valueField = valueField;
        } else {
            this.valueField = valueField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueField(%s)", wrapQuotes(valueField)));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetFallingLabel() {
        if (getFallingLabel != null) {
            return getFallingLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingLabel() {
        if (getRisingLabel != null) {
            return getRisingLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAxis());
        jsGetters.append(generateJSgetFallingLabel());
        jsGetters.append(generateJSgetLabel());
        jsGetters.append(generateJSgetRisingLabel());
        jsGetters.append(generateJSgetSeries());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAxis());
        js.append(generateJSsetAxis1());
        js.append(generateJSsetFallingLabel());
        js.append(generateJSsetFallingLabel1());
        js.append(generateJSsetFallingLabel2());
        js.append(generateJSsetFallingLabel3());
        js.append(generateJSsetFallingStroke());
        js.append(generateJSsetFallingStroke1());
        js.append(generateJSsetFallingStroke2());
        js.append(generateJSsetLabel());
        js.append(generateJSsetLabel1());
        js.append(generateJSsetLabel2());
        js.append(generateJSsetLabel3());
        js.append(generateJSsetRisingLabel());
        js.append(generateJSsetRisingLabel1());
        js.append(generateJSsetRisingLabel2());
        js.append(generateJSsetRisingLabel3());
        js.append(generateJSsetRisingStroke());
        js.append(generateJSsetRisingStroke1());
        js.append(generateJSsetRisingStroke2());
        js.append(generateJSsetSeries());
        js.append(generateJSsetSeries1());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetValue());
        js.append(generateJSsetValue1());
        js.append(generateJSsetValue2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
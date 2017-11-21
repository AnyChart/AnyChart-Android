package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Circular range.
 */
public class CircularRange extends VisualBase {

    public CircularRange() {
        js.setLength(0);
        js.append("var circularRange").append(++variableIndex).append(" = anychart.core.axisMarkers.circularRange();");
        jsBase = "circularRange" + variableIndex;
    }

    protected CircularRange(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CircularRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double index;
    private List<CircularRange> setAxisIndex = new ArrayList<>();

    /**
     * Setter for the axis index.
     */
    public CircularRange setAxisIndex(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".axisIndex(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axisIndex(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAxisIndex() {
        if (!setAxisIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setAxisIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double cornersRounding;
    private String cornersRounding1;
    private List<CircularRange> setCornersRounding = new ArrayList<>();

    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public CircularRange setCornersRounding(Double cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornersRounding() {
        if (!setCornersRounding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setCornersRounding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularRange> setCornersRounding1 = new ArrayList<>();

    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public CircularRange setCornersRounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%s)", wrapQuotes(cornersRounding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%s)", wrapQuotes(cornersRounding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCornersRounding1() {
        if (!setCornersRounding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setCornersRounding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double endSize;
    private String endSize1;
    private List<CircularRange> setEndSize = new ArrayList<>();

    /**
     * Setter for the range end size.
     */
    public CircularRange setEndSize(Double endSize) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize = endSize;
        } else {
            this.endSize = endSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endSize(%f)", endSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endSize(%f)", endSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndSize() {
        if (!setEndSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setEndSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularRange> setEndSize1 = new ArrayList<>();

    /**
     * Setter for the range end size.
     */
    public CircularRange setEndSize(String endSize1) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize1 = endSize1;
        } else {
            this.endSize1 = endSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endSize(%s)", wrapQuotes(endSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endSize(%s)", wrapQuotes(endSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndSize1() {
        if (!setEndSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setEndSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<CircularRange> setFill = new ArrayList<>();

    /**
     * Setter for the range fill.
     */
    public CircularRange setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double from;
    private List<CircularRange> setFrom = new ArrayList<>();

    /**
     * Setter for the starting range value.
     */
    public CircularRange setFrom(Double from) {
        if (jsBase == null) {
            this.from = from;
        } else {
            this.from = from;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".from(%f)", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".from(%f)", from));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFrom() {
        if (!setFrom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setFrom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GaugeSidePosition position;
    private String position1;
    private List<CircularRange> setPosition = new ArrayList<>();

    /**
     * Setter for the range position.
     */
    public CircularRange setPosition(GaugeSidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularRange> setPosition1 = new ArrayList<>();

    /**
     * Setter for the range position.
     */
    public CircularRange setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radius;
    private String radius1;
    private List<CircularRange> setRadius = new ArrayList<>();

    /**
     * Setter for the range radius.
     */
    public CircularRange setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%f)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%f)", radius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius() {
        if (!setRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularRange> setRadius1 = new ArrayList<>();

    /**
     * Setter for the range radius.
     */
    public CircularRange setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius1() {
        if (!setRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startSize;
    private String startSize1;
    private List<CircularRange> setStartSize = new ArrayList<>();

    /**
     * Setter for the range start size.
     */
    public CircularRange setStartSize(Double startSize) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize = startSize;
        } else {
            this.startSize = startSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startSize(%f)", startSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%f)", startSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartSize() {
        if (!setStartSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setStartSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularRange> setStartSize1 = new ArrayList<>();

    /**
     * Setter for the range start size.
     */
    public CircularRange setStartSize(String startSize1) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize1 = startSize1;
        } else {
            this.startSize1 = startSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startSize(%s)", wrapQuotes(startSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%s)", wrapQuotes(startSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartSize1() {
        if (!setStartSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setStartSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double to;
    private List<CircularRange> setTo = new ArrayList<>();

    /**
     * Setter for the ending range value.
     */
    public CircularRange setTo(Double to) {
        if (jsBase == null) {
            this.to = to;
        } else {
            this.to = to;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".to(%f)", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".to(%f)", to));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTo() {
        if (!setTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularRange item : setTo) {
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

        js.append(generateJSsetAxisIndex());
        js.append(generateJSsetCornersRounding());
        js.append(generateJSsetCornersRounding1());
        js.append(generateJSsetEndSize());
        js.append(generateJSsetEndSize1());
        js.append(generateJSsetFill());
        js.append(generateJSsetFrom());
        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        js.append(generateJSsetRadius());
        js.append(generateJSsetRadius1());
        js.append(generateJSsetStartSize());
        js.append(generateJSsetStartSize1());
        js.append(generateJSsetTo());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
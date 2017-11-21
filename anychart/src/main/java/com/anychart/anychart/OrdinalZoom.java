package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Zoom settings aggregate.
 */
public class OrdinalZoom extends JsObject {

    public OrdinalZoom() {
        js.setLength(0);
        js.append("var ordinalZoom").append(++variableIndex).append(" = anychart.core.utils.ordinalZoom();");
        jsBase = "ordinalZoom" + variableIndex;
    }

    protected OrdinalZoom(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected OrdinalZoom(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean continuous;
    private List<OrdinalZoom> setContinuous = new ArrayList<>();

    /**
     * Whether to zoom on moving of the scroller or only on mouseUp.
     */
    public OrdinalZoom continuous(Boolean continuous) {
        if (jsBase == null) {
            this.continuous = continuous;
        } else {
            this.continuous = continuous;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".continuous(%b)", continuous));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".continuous(%b)", continuous));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContinuous() {
        if (!setContinuous.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalZoom item : setContinuous) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startRatio;
    private Double endRatio;
    private List<OrdinalZoom> setSetTo = new ArrayList<>();

    /**
     * Sets zoom to passed start and end ratios.
     */
    public OrdinalZoom setSetTo(Double startRatio, Double endRatio) {
        if (jsBase == null) {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
        } else {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setTo(%f, %f)", startRatio, endRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setTo(%f, %f)", startRatio, endRatio));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetTo() {
        if (!setSetTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalZoom item : setSetTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointsCount;
    private Boolean fromEnd;
    private ScalesBase scale;
    private List<OrdinalZoom> setSetToPointsCount = new ArrayList<>();

    /**
     * Setups zoom by passed values.
     */
    public OrdinalZoom setToPointsCount(Double pointsCount, Boolean fromEnd, ScalesBase scale) {
        if (jsBase == null) {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
        } else {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(scale.generateJs());
            js.append(String.format(Locale.US, ".setToPointsCount(%f, %b, %s)", pointsCount, fromEnd, ((scale != null) ? scale.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setToPointsCount(%f, %b, %s)", pointsCount, fromEnd, ((scale != null) ? scale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetToPointsCount() {
        if (!setSetToPointsCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalZoom item : setSetToPointsCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesBase scale1;
    private List<OrdinalZoom> setSetToValues = new ArrayList<>();

    /**
     * Setups zoom by passed values.
     */
    public OrdinalZoom setToValues(ScalesBase scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(scale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".setToValues(%s);",  ((scale1 != null) ? scale1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetSetToValues() {
        if (!setSetToValues.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalZoom item : setSetToValues) {
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

        js.append(generateJSsetContinuous());
        js.append(generateJSsetSetTo());
        js.append(generateJSsetSetToPointsCount());
        js.append(generateJSsetSetToValues());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
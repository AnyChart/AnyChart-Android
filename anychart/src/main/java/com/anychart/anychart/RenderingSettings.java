package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Series renderer settings class.
 */
public class RenderingSettings extends CoreBase {

    public RenderingSettings() {
        js.setLength(0);
        js.append("var renderingSettings").append(++variableIndex).append(" = anychart.core.series.renderingSettings();");
        jsBase = "renderingSettings" + variableIndex;
    }

    protected RenderingSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RenderingSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean needsWidth;
    private List<RenderingSettings> setNeedsWidth = new ArrayList<>();

    /**
     * Setter for points width.
     */
    public RenderingSettings setNeedsWidth(Boolean needsWidth) {
        if (jsBase == null) {
            this.needsWidth = needsWidth;
        } else {
            this.needsWidth = needsWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".needsWidth(%b)", needsWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".needsWidth(%b)", needsWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNeedsWidth() {
        if (!setNeedsWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RenderingSettings item : setNeedsWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean needsZero;
    private List<RenderingSettings> setNeedsZero = new ArrayList<>();

    /**
     * Setter for zero value.
     */
    public RenderingSettings setNeedsZero(Boolean needsZero) {
        if (jsBase == null) {
            this.needsZero = needsZero;
        } else {
            this.needsZero = needsZero;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".needsZero(%b)", needsZero));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".needsZero(%b)", needsZero));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNeedsZero() {
        if (!setNeedsZero.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RenderingSettings item : setNeedsZero) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ShapeConfig[] shapes;
    private List<RenderingSettings> setShapes = new ArrayList<>();

    /**
     * Setter for the shapes settings.
     */
    public RenderingSettings setShapes(ShapeConfig[] shapes) {
        if (jsBase == null) {
            this.shapes = shapes;
        } else {
            this.shapes = shapes;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".shapes(%s)", arrayToString(shapes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shapes(%s)", arrayToString(shapes)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetShapes() {
        if (!setShapes.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RenderingSettings item : setShapes) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] yValues;
    private List<RenderingSettings> setYValues = new ArrayList<>();

    /**
     * Setter for YScale values.
     */
    public RenderingSettings setYValues(String[] yValues) {
        if (jsBase == null) {
            this.yValues = yValues;
        } else {
            this.yValues = yValues;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yValues(%s)", arrayToStringWrapQuotes(yValues)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yValues(%s)", arrayToStringWrapQuotes(yValues)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYValues() {
        if (!setYValues.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RenderingSettings item : setYValues) {
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

        js.append(generateJSsetNeedsWidth());
        js.append(generateJSsetNeedsZero());
        js.append(generateJSsetShapes());
        js.append(generateJSsetYValues());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
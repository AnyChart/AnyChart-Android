package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".needsWidth(%b);", needsWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean needsZero;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".needsZero(%b);", needsZero));
                js.setLength(0);
            }
        }
        return this;
    }

    private ShapeConfig[] shapes;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shapes(%s);", arrayToString(shapes)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] yValues;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yValues(%s);", arrayToStringWrapQuotes(yValues)));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
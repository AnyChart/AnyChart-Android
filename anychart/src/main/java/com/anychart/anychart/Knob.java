package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Knob pointer class.
 */
public class Knob extends GaugePointersBase {

    public Knob() {
        js.setLength(0);
        js.append("var knob").append(++variableIndex).append(" = anychart.core.gauge.pointers.knob();");
        jsBase = "knob" + variableIndex;
    }

    protected Knob(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Knob(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double bottomRadius;
    private String bottomRadius1;

    /**
     * Setter for the bottom radius.
     */
    public Knob setBottomRadius(Double bottomRadius) {
        if (jsBase == null) {
            this.bottomRadius = null;
            this.bottomRadius1 = null;
            
            this.bottomRadius = bottomRadius;
        } else {
            this.bottomRadius = bottomRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomRadius(%f)", bottomRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomRadius(%f)", bottomRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the bottom radius.
     */
    public Knob setBottomRadius(String bottomRadius1) {
        if (jsBase == null) {
            this.bottomRadius = null;
            this.bottomRadius1 = null;
            
            this.bottomRadius1 = bottomRadius1;
        } else {
            this.bottomRadius1 = bottomRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomRadius(%s)", wrapQuotes(bottomRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomRadius(%s)", wrapQuotes(bottomRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double bottomRatio;

    /**
     * Setter for the bottom ratio.
     */
    public Knob setBottomRatio(Double bottomRatio) {
        if (jsBase == null) {
            this.bottomRatio = bottomRatio;
        } else {
            this.bottomRatio = bottomRatio;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottomRatio(%f)", bottomRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottomRatio(%f)", bottomRatio));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double topRadius;
    private String topRadius1;

    /**
     * Setter for the top radius.
     */
    public Knob setTopRadius(Double topRadius) {
        if (jsBase == null) {
            this.topRadius = null;
            this.topRadius1 = null;
            
            this.topRadius = topRadius;
        } else {
            this.topRadius = topRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topRadius(%f)", topRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topRadius(%f)", topRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the top radius.
     */
    public Knob setTopRadius(String topRadius1) {
        if (jsBase == null) {
            this.topRadius = null;
            this.topRadius1 = null;
            
            this.topRadius1 = topRadius1;
        } else {
            this.topRadius1 = topRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topRadius(%s)", wrapQuotes(topRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topRadius(%s)", wrapQuotes(topRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double topRatio;

    /**
     * Setter for the top ratio.
     */
    public Knob setTopRatio(Double topRatio) {
        if (jsBase == null) {
            this.topRatio = topRatio;
        } else {
            this.topRatio = topRatio;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".topRatio(%f)", topRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topRatio(%f)", topRatio));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double verticesCount;

    /**
     * Setter for vertices count.
     */
    public Knob setVerticesCount(Double verticesCount) {
        if (jsBase == null) {
            this.verticesCount = verticesCount;
        } else {
            this.verticesCount = verticesCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".verticesCount(%f)", verticesCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".verticesCount(%f)", verticesCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double verticesCurvature;

    /**
     * Setter for vertices curvature.
     */
    public Knob setVerticesCurvature(Double verticesCurvature) {
        if (jsBase == null) {
            this.verticesCurvature = verticesCurvature;
        } else {
            this.verticesCurvature = verticesCurvature;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".verticesCurvature(%f)", verticesCurvature));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".verticesCurvature(%f)", verticesCurvature));
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
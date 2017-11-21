package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Base class for all scatter series.
 */
public class ScatterSeriesBase extends AnychartSeriesBase {

    public ScatterSeriesBase() {
        js.setLength(0);
        js.append("var scatterSeriesBase").append(++variableIndex).append(" = anychart.core.scatter.series.base();");
        jsBase = "scatterSeriesBase" + variableIndex;
    }

    protected ScatterSeriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScatterSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AnychartMathRect getClip;

    /**
     * Getter for series clip settings.
     */
    public AnychartMathRect getClip() {
        if (getClip == null)
            getClip = new AnychartMathRect(jsBase + ".clip()");

        return getClip;
    }

    private Boolean clip;
    private AnychartMathRect clip1;
    private List<ScatterSeriesBase> setClip = new ArrayList<>();

    /**
     * Setter for series clip settings.
Clips visible part of a series by a rectangle (or chart).
     */
    public ScatterSeriesBase setClip(Boolean clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".clip(%b)", clip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".clip(%b)", clip));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetClip() {
        if (!setClip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setClip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBase> setClip1 = new ArrayList<>();

    /**
     * Setter for series clip settings.
Clips visible part of a series by a rectangle (or chart).
     */
    public ScatterSeriesBase setClip(AnychartMathRect clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(clip1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".clip(%s);",  ((clip1 != null) ? clip1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetClip1() {
        if (!setClip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setClip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Error getError;

    /**
     * Getter for series error.
     */
    public Error getError() {
        if (getError == null)
            getError = new Error(jsBase + ".error()");

        return getError;
    }

    private String error;
    private Boolean error1;
    private String error2;
    private Double error3;
    private List<ScatterSeriesBase> setError = new ArrayList<>();

    /**
     * Setter for series error.
     */
    public ScatterSeriesBase setError(String error) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error = error;
        } else {
            this.error = error;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".error(%s)", wrapQuotes(error)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".error(%s)", wrapQuotes(error)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetError() {
        if (!setError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBase> setError1 = new ArrayList<>();

    /**
     * Setter for series error.
     */
    public ScatterSeriesBase setError(Boolean error1) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error1 = error1;
        } else {
            this.error1 = error1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".error(%b)", error1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".error(%b)", error1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetError1() {
        if (!setError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBase> setError2 = new ArrayList<>();

    /**
     * Setter for series error.
     */
    public ScatterSeriesBase setError(Double error3) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error3 = error3;
        } else {
            this.error3 = error3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".error(%f)", error3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".error(%f)", error3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetError2() {
        if (!setError2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setError2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexes;
    private Double[] indexes1;

    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Double indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%f);", indexes));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f)", indexes));
                js.setLength(0);
            }
        }
    }


    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Double[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s)", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Double indexes2;
    private Double[] indexes3;

    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Double indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%f);", indexes2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f)", indexes2));
                js.setLength(0);
            }
        }
    }


    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Double[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s)", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Double indexes4;
    private Double[] indexes5;

    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Double indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%f);", indexes4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f)", indexes4));
                js.setLength(0);
            }
        }
    }


    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Double[] indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s)", Arrays.toString(indexes5)));
                js.setLength(0);
            }
        }
    }

    private ScatterBase getXScale;

    /**
     * Getter for the series X-scale.
     */
    public ScatterBase getXScale() {
        if (getXScale == null)
            getXScale = new ScatterBase(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesBase xScale;
    private List<ScatterSeriesBase> setXScale = new ArrayList<>();

    /**
     * Setter for the series X-scale.
     */
    public ScatterSeriesBase setXScale(ScalesBase xScale) {
        if (jsBase == null) {
            this.xScale = xScale;
        } else {
            this.xScale = xScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale != null) ? xScale.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScatterBase getYScale;

    /**
     * Getter for the series Y-scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;
    private List<ScatterSeriesBase> setYScale = new ArrayList<>();

    /**
     * Setter for the series Y-scale.
     */
    public ScatterSeriesBase setYScale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBase> setYScale1 = new ArrayList<>();

    /**
     * Setter for the series Y-scale.
     */
    public ScatterSeriesBase setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBase> setYScale2 = new ArrayList<>();

    /**
     * Setter for the series Y-scale.
     */
    public ScatterSeriesBase setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetError() {
        if (getError != null) {
            return getError.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetError());
        jsGetters.append(generateJSgetXScale());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetClip());
        js.append(generateJSsetClip1());
        js.append(generateJSsetError());
        js.append(generateJSsetError1());
        js.append(generateJSsetError2());
        js.append(generateJSsetXScale());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
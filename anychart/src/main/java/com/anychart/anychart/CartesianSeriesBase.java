package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CartesianSeriesBase extends AnychartSeriesBase {

    public CartesianSeriesBase() {

    }

    protected CartesianSeriesBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CartesianSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private AnychartMathRect getClip;

    public AnychartMathRect getClip() {
        if (getClip == null)
            getClip = new AnychartMathRect(jsBase + ".clip()");

        return getClip;
    }

    private Boolean clip;
    private AnychartMathRect clip1;

    public CartesianSeriesBase setClip(Boolean clip) {
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


    public CartesianSeriesBase setClip(AnychartMathRect clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".clip(%s)", (clip1 != null) ? clip1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".clip(%s)", (clip1 != null) ? clip1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Error getError;

    public Error getError() {
        if (getError == null)
            getError = new Error(jsBase + ".error()");

        return getError;
    }

    private String error;
    private Boolean error1;
    private String error2;
    private Double error3;

    public CartesianSeriesBase setError(String error) {
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

            js.append(String.format(Locale.US, ".error(%s)", error));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".error(%s)", error));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesBase setError(Boolean error1) {
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


    public CartesianSeriesBase setError(Double error3) {
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

    private Double indexes;
    private Double[] indexes1;

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

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f)", indexes));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s)", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Double indexes2;
    private Double[] indexes3;

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

            js.append(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f)", indexes2));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s)", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Boolean isVertical;

    public CartesianSeriesBase setIsVertical(Boolean isVertical) {
        if (jsBase == null) {
            this.isVertical = isVertical;
        } else {
            this.isVertical = isVertical;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".isVertical(%b)", isVertical));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".isVertical(%b)", isVertical));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double indexes4;
    private Double[] indexes5;

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

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f)", indexes4));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s)", Arrays.toString(indexes5)));
                js.setLength(0);
            }
        }
    }

    private RenderingSettings getRendering;

    public RenderingSettings getRendering() {
        if (getRendering == null)
            getRendering = new RenderingSettings(jsBase + ".rendering()");

        return getRendering;
    }

    private String rendering;

    public CartesianSeriesBase setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rendering(%s)", rendering));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rendering(%s)", rendering));
                js.setLength(0);
            }
        }
        return this;
    }

    private String seriesType;

    public CartesianSeriesBase setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".seriesType(%s)", seriesType));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", seriesType));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double subRangeRatio;

    public void transformX(Double subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transformX(%f);", subRangeRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformX(%f)", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Double subRangeRatio1;

    public void transformY(Double subRangeRatio1) {
        if (jsBase == null) {
            this.subRangeRatio = null;
            this.subRangeRatio1 = null;
            
            this.subRangeRatio1 = subRangeRatio1;
        } else {
            this.subRangeRatio1 = subRangeRatio1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transformY(%f);", subRangeRatio1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformY(%f)", subRangeRatio1));
                js.setLength(0);
            }
        }
    }

    private Double position;

    public CartesianSeriesBase setXPointPosition(Double position) {
        if (jsBase == null) {
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xPointPosition(%f)", position));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xPointPosition(%f)", position));
                js.setLength(0);
            }
        }
        return this;
    }

    private Ordinal getXScale;

    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesBase xScale;
    private String xScale1;
    private ScaleTypes xScale2;
    private String xScale3;

    public CartesianSeriesBase setXScale(ScalesBase xScale) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale = xScale;
        } else {
            this.xScale = xScale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesBase setXScale(String xScale1) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale1 = xScale1;
        } else {
            this.xScale1 = xScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xScale(%s)", xScale1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", xScale1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesBase setXScale(ScaleTypes xScale2) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale2 = xScale2;
        } else {
            this.xScale2 = xScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xScale(%s)", (xScale2 != null) ? xScale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale2 != null) ? xScale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScalesBase getYScale;

    public ScalesBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScalesBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;

    public CartesianSeriesBase setYScale(ScalesBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesBase setYScale(String yScale1) {
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

            js.append(String.format(Locale.US, ".yScale(%s)", yScale1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesBase setYScale(ScaleTypes yScale2) {
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

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
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

    private String generateJSclip() {
        if (clip != null) {
            return String.format(Locale.US, "clip: %b,", clip);
        }
        return "";
    }

    private String generateJSclip1() {
        if (clip1 != null) {
            return String.format(Locale.US, "clip: %s,", (clip1 != null) ? clip1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSerror() {
        if (error != null) {
            return String.format(Locale.US, "error: %s,", error);
        }
        return "";
    }

    private String generateJSerror1() {
        if (error1 != null) {
            return String.format(Locale.US, "error: %b,", error1);
        }
        return "";
    }

    private String generateJSerror2() {
        if (error2 != null) {
            return String.format(Locale.US, "error: %s,", error2);
        }
        return "";
    }

    private String generateJSerror3() {
        if (error3 != null) {
            return String.format(Locale.US, "error: %f,", error3);
        }
        return "";
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %f,", indexes);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes1));
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes2);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes3));
        }
        return "";
    }

    private String generateJSisVertical() {
        if (isVertical != null) {
            return String.format(Locale.US, "isVertical: %b,", isVertical);
        }
        return "";
    }

    private String generateJSindexes4() {
        if (indexes4 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes4);
        }
        return "";
    }

    private String generateJSindexes5() {
        if (indexes5 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes5));
        }
        return "";
    }

    private String generateJSrendering() {
        if (rendering != null) {
            return String.format(Locale.US, "rendering: %s,", rendering);
        }
        return "";
    }

    private String generateJSseriesType() {
        if (seriesType != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType);
        }
        return "";
    }

    private String generateJSsubRangeRatio() {
        if (subRangeRatio != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio);
        }
        return "";
    }

    private String generateJSsubRangeRatio1() {
        if (subRangeRatio1 != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio1);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %f,", position);
        }
        return "";
    }

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale1() {
        if (xScale1 != null) {
            return String.format(Locale.US, "xScale: %s,", xScale1);
        }
        return "";
    }

    private String generateJSxScale2() {
        if (xScale2 != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale2 != null) ? xScale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale3() {
        if (xScale3 != null) {
            return String.format(Locale.US, "xScale: %s,", xScale3);
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale1() {
        if (yScale1 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale1);
        }
        return "";
    }

    private String generateJSyScale2() {
        if (yScale2 != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale2 != null) ? yScale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale3() {
        if (yScale3 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale3);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetError());
        jsGetters.append(generateJSgetRendering());
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSclip());
            js.append(generateJSclip1());
            js.append(generateJSerror());
            js.append(generateJSerror1());
            js.append(generateJSerror2());
            js.append(generateJSerror3());
            js.append(generateJSindexes());
            js.append(generateJSindexes1());
            js.append(generateJSindexes2());
            js.append(generateJSindexes3());
            js.append(generateJSisVertical());
            js.append(generateJSindexes4());
            js.append(generateJSindexes5());
            js.append(generateJSrendering());
            js.append(generateJSseriesType());
            js.append(generateJSsubRangeRatio());
            js.append(generateJSsubRangeRatio1());
            js.append(generateJSposition());
            js.append(generateJSxScale());
            js.append(generateJSxScale1());
            js.append(generateJSxScale2());
            js.append(generateJSxScale3());
            js.append(generateJSyScale());
            js.append(generateJSyScale1());
            js.append(generateJSyScale2());
            js.append(generateJSyScale3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
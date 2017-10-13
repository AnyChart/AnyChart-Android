package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ScatterSeriesBase extends AnychartSeriesBase {

    public ScatterSeriesBase() {

    }

    protected ScatterSeriesBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ScatterSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
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

    public ScatterSeriesBase setClip(Boolean clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public ScatterSeriesBase setClip(AnychartMathRect clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    public ScatterSeriesBase setError(String error) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error = error;
        } else {
            this.error = error;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public ScatterSeriesBase setError(Boolean error1) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error1 = error1;
        } else {
            this.error1 = error1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public ScatterSeriesBase setError(Double error3) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error3 = error3;
        } else {
            this.error3 = error3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private ScatterBase getXScale;

    public ScatterBase getXScale() {
        if (getXScale == null)
            getXScale = new ScatterBase(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesBase xScale;

    public ScatterSeriesBase setXScale(ScalesBase xScale) {
        if (jsBase == null) {
            this.xScale = xScale;
        } else {
            this.xScale = xScale;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private ScatterBase getYScale;

    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;

    public ScatterSeriesBase setYScale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public ScatterSeriesBase setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public ScatterSeriesBase setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
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
            js.append(generateJSindexes4());
            js.append(generateJSindexes5());
            js.append(generateJSxScale());
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
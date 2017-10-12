package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Led extends LineargaugePointersBase {

    public Led() {

    }

    protected Led(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Led(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Led getColorScale;

    public Led getColorScale() {
        if (getColorScale == null)
            getColorScale = new Led(jsBase + ".colorScale()");

        return getColorScale;
    }

    private LinearColor colorScale;
    private OrdinalColor colorScale1;

    public Led setColorScale(LinearColor colorScale) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale = colorScale;
        } else {
            this.colorScale = colorScale;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Led setColorScale(OrdinalColor colorScale1) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale1 = colorScale1;
        } else {
            this.colorScale1 = colorScale1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double count;

    public Led setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double gap;
    private String gap1;

    public Led setGap(Double gap) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap = gap;
        } else {
            this.gap = gap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".gap(%f)", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%f)", gap));
                js.setLength(0);
            }
        }
        return this;
    }


    public Led setGap(String gap1) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap1 = gap1;
        } else {
            this.gap1 = gap1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".gap(%s)", gap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%s)", gap1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double size;
    private String size1;

    public Led setSize(Double size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".size(%f)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size));
                js.setLength(0);
            }
        }
        return this;
    }


    public Led setSize(String size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".size(%s)", size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%s)", size1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }

    private String generateJScolorScale() {
        if (colorScale != null) {
            return String.format(Locale.US, "colorScale: %s,", (colorScale != null) ? colorScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolorScale1() {
        if (colorScale1 != null) {
            return String.format(Locale.US, "colorScale: %s,", (colorScale1 != null) ? colorScale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSgap() {
        if (gap != null) {
            return String.format(Locale.US, "gap: %f,", gap);
        }
        return "";
    }

    private String generateJSgap1() {
        if (gap1 != null) {
            return String.format(Locale.US, "gap: %s,", gap1);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %s,", size1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetColorScale());

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
            js.append(generateJScolorScale());
            js.append(generateJScolorScale1());
            js.append(generateJScount());
            js.append(generateJSgap());
            js.append(generateJSgap1());
            js.append(generateJSsize());
            js.append(generateJSsize1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
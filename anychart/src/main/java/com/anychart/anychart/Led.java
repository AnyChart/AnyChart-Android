package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorScale(%s)", ((colorScale != null) ? colorScale.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale != null) ? colorScale.generateJs() : "null")));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorScale(%s)", ((colorScale1 != null) ? colorScale1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", ((colorScale1 != null) ? colorScale1.generateJs() : "null")));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".gap(%s)", wrapQuotes(gap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%s)", wrapQuotes(gap1)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSLed getColorScale() {
//        if (Led getColorScale != null) {
//            return Led getColorScale.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
            //return String.format(Locale.US, "getColorScale: %s,", ((getColorScale != null) ? getColorScale.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJScolorScale());
////        
//            js.append(generateJScolorScale1());
////        
//            js.append(generateJScount());
////        
//            js.append(generateJSgap());
////        
//            js.append(generateJSgap1());
////        
//            js.append(generateJSsize());
////        
//            js.append(generateJSsize1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
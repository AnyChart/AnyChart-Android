package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class OrdinalColor extends ScalesBase {

    public OrdinalColor() {

    }

    protected OrdinalColor(String jsBase) {
        this.jsBase = jsBase;
    }

    protected OrdinalColor(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String colorToValue;

    public void colorToValue(String colorToValue) {
        if (jsBase == null) {
            this.colorToValue = colorToValue;
        } else {
            this.colorToValue = colorToValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".colorToValue(%s);", wrapQuotes(colorToValue)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorToValue(%s)", wrapQuotes(colorToValue)));
                js.setLength(0);
            }
        }
    }

    private String[] colors;

    public OrdinalColor setColors(String[] colors) {
        if (jsBase == null) {
            this.colors = colors;
        } else {
            this.colors = colors;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", arrayToStringWrapQuotes(colors)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", arrayToStringWrapQuotes(colors)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double getIndexByValue;

    public void getIndexByValue(Double getIndexByValue) {
        if (jsBase == null) {
            this.getIndexByValue = getIndexByValue;
        } else {
            this.getIndexByValue = getIndexByValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getIndexByValue(%f);", getIndexByValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getIndexByValue(%f)", getIndexByValue));
                js.setLength(0);
            }
        }
    }

    private Double getRangeByValue;

    public void getRangeByValue(Double getRangeByValue) {
        if (jsBase == null) {
            this.getRangeByValue = getRangeByValue;
        } else {
            this.getRangeByValue = getRangeByValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getRangeByValue(%f);", getRangeByValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getRangeByValue(%f)", getRangeByValue));
                js.setLength(0);
            }
        }
    }

    private Double ratio;

    public void inverseTransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f)", ratio));
                js.setLength(0);
            }
        }
    }

    private String names;

    public OrdinalColor setNames(String names) {
        if (jsBase == null) {
            this.names = names;
        } else {
            this.names = names;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".names(%s)", wrapQuotes(names)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".names(%s)", wrapQuotes(names)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String ranges;

    public OrdinalColor setRanges(String ranges) {
        if (jsBase == null) {
            this.ranges = ranges;
        } else {
            this.ranges = ranges;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ranges(%s)", wrapQuotes(ranges)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ranges(%s)", wrapQuotes(ranges)));
                js.setLength(0);
            }
        }
        return this;
    }

    private OrdinalTicks getTicks;

    public OrdinalTicks getTicks() {
        if (getTicks == null)
            getTicks = new OrdinalTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    public OrdinalColor setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }


    public OrdinalColor setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ticks(%s)", arrayToStringWrapQuotes(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", arrayToStringWrapQuotes(ticks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double subRangeRatio;

    public void transform(Double subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transform(%f);", subRangeRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%f)", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Double valueToColor;

    public void valueToColor(Double valueToColor) {
        if (jsBase == null) {
            this.valueToColor = valueToColor;
        } else {
            this.valueToColor = valueToColor;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".valueToColor(%f);", valueToColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueToColor(%f)", valueToColor));
                js.setLength(0);
            }
        }
    }


//
//    private String generateJSOrdinalTicks getTicks() {
//        if (OrdinalTicks getTicks != null) {
//            return OrdinalTicks getTicks.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
            //return String.format(Locale.US, "getTicks: %s,", ((getTicks != null) ? getTicks.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetTicks());

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
//            js.append(generateJScolorToValue());
////        
//            js.append(generateJScolors());
////        
//            js.append(generateJSgetIndexByValue());
////        
//            js.append(generateJSgetRangeByValue());
////        
//            js.append(generateJSratio());
////        
//            js.append(generateJSnames());
////        
//            js.append(generateJSranges());
////        
//            js.append(generateJSticks());
////        
//            js.append(generateJSticks1());
////        
//            js.append(generateJSsubRangeRatio());
////        
//            js.append(generateJSvalueToColor());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
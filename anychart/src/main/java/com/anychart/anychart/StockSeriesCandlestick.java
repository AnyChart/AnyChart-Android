package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class StockSeriesCandlestick extends StockSeriesOHLC {

    public StockSeriesCandlestick() {

    }

    protected StockSeriesCandlestick(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StockSeriesCandlestick(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Fill fallingFill;

    public StockSeriesBase setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingFill(%s);", (fallingFill != null) ? fallingFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s)", (fallingFill != null) ? fallingFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private PatternFill getFallingHatchFill;

    public PatternFill getFallingHatchFill() {
        if (getFallingHatchFill == null)
            getFallingHatchFill = new PatternFill(jsBase + ".fallingHatchFill()");

        return getFallingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color;
    private Double thickness;
    private Double size;

    public StockSeriesBase setFallingHatchFill(PatternFill patternFillOrTypeOrState, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setFallingHatchFill(HatchFill patternFillOrTypeOrState1, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setFallingHatchFill(HatchFillType patternFillOrTypeOrState2, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setFallingHatchFill(String patternFillOrTypeOrState3, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState3, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", patternFillOrTypeOrState3, color, thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setFallingHatchFill(Boolean patternFillOrTypeOrState4, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, color, thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private Fill risingFill;

    public StockSeriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingFill(%s);", (risingFill != null) ? risingFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s)", (risingFill != null) ? risingFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private PatternFill getRisingHatchFill;

    public PatternFill getRisingHatchFill() {
        if (getRisingHatchFill == null)
            getRisingHatchFill = new PatternFill(jsBase + ".risingHatchFill()");

        return getRisingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color1;
    private Double thickness1;
    private Double size1;

    public StockSeriesBase setRisingHatchFill(PatternFill patternFillOrTypeOrState5, String color1, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null", color1, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null", color1, thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setRisingHatchFill(HatchFill patternFillOrTypeOrState6, String color1, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null", color1, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null", color1, thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setRisingHatchFill(HatchFillType patternFillOrTypeOrState7, String color1, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null", color1, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null", color1, thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setRisingHatchFill(String patternFillOrTypeOrState8, String color1, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState8, color1, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", patternFillOrTypeOrState8, color1, thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    public StockSeriesBase setRisingHatchFill(Boolean patternFillOrTypeOrState9, String color1, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color1 = color1;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState9, color1, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState9, color1, thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private String generateJSgetFallingHatchFill() {
        if (getFallingHatchFill != null) {
            return getFallingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingHatchFill() {
        if (getRisingHatchFill != null) {
            return getRisingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSfallingFill() {
        if (fallingFill != null) {
            return String.format(Locale.US, "fallingFill: %s,", (fallingFill != null) ? fallingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState() {
        if (patternFillOrTypeOrState != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState1() {
        if (patternFillOrTypeOrState1 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState2() {
        if (patternFillOrTypeOrState2 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState3() {
        if (patternFillOrTypeOrState3 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState3);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState4() {
        if (patternFillOrTypeOrState4 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState4);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSrisingFill() {
        if (risingFill != null) {
            return String.format(Locale.US, "risingFill: %s,", (risingFill != null) ? risingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState5() {
        if (patternFillOrTypeOrState5 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState6() {
        if (patternFillOrTypeOrState6 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState7() {
        if (patternFillOrTypeOrState7 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState8() {
        if (patternFillOrTypeOrState8 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState8);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState9() {
        if (patternFillOrTypeOrState9 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState9);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetFallingHatchFill());
        jsGetters.append(generateJSgetRisingHatchFill());

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
            js.append(generateJSfallingFill());
            js.append(generateJSpatternFillOrTypeOrState());
            js.append(generateJSpatternFillOrTypeOrState1());
            js.append(generateJSpatternFillOrTypeOrState2());
            js.append(generateJSpatternFillOrTypeOrState3());
            js.append(generateJSpatternFillOrTypeOrState4());
            js.append(generateJScolor());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSrisingFill());
            js.append(generateJSpatternFillOrTypeOrState5());
            js.append(generateJSpatternFillOrTypeOrState6());
            js.append(generateJSpatternFillOrTypeOrState7());
            js.append(generateJSpatternFillOrTypeOrState8());
            js.append(generateJSpatternFillOrTypeOrState9());
            js.append(generateJScolor1());
            js.append(generateJSthickness1());
            js.append(generateJSsize1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
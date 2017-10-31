package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Candlestick Series Class.<br/>
{docs:Stock_Charts/Series/Japanese_Candlestick}Learn more about Candlestick series{docs}
 */
public class StockSeriesCandlestick extends StockSeriesOHLC {

    public StockSeriesCandlestick() {
        js.setLength(0);
        js.append("var stockSeriesCandlestick").append(++variableIndex).append(" = anychart.core.stock.series.candlestick();");
        jsBase = "stockSeriesCandlestick" + variableIndex;
    }

    protected StockSeriesCandlestick(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockSeriesCandlestick(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fallingFill;

    /**
     * Setter for the falling fill settings using a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StockSeriesBase setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".fallingFill(%s);", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private PatternFill getFallingHatchFill;

    /**
     * Getter for current falling hatch fill settings.
     */
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

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null"), wrapQuotes(color), thickness, size));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null"), wrapQuotes(color), thickness, size));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color), thickness, size));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color), thickness, size));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, wrapQuotes(color), thickness, size));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private Fill risingFill;

    /**
     * Setter for fill settings using string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StockSeriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".risingFill(%s);", ((risingFill != null) ? risingFill.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }

    private PatternFill getRisingHatchFill;

    /**
     * Getter for current rising hatch fill settings.
     */
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

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color1), thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color1), thickness1, size1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color1), thickness1, size1));
                js.setLength(0);
            }
        }
        return new StockSeriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
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

            js.append(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState9, wrapQuotes(color1), thickness1, size1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState9, wrapQuotes(color1), thickness1, size1));
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

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
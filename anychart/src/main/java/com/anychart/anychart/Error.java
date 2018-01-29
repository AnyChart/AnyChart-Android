package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class representing series error.<br/>
{docs:Basic_Charts/Error_Chart/Overview}Learn more about error chart.{docs}
 */
public class Error extends CoreBase {

    public Error() {
        js.setLength(0);
        js.append("var error").append(++variableIndex).append(" = anychart.core.utils.error();");
        jsBase = "error" + variableIndex;
    }

    protected Error(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Error(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ErrorMode mode;
    private String mode1;

    /**
     * Setter for error mode.<br/>
Error mode defines the rule to parse values for series with error.
     */
    public Error setMode(ErrorMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for error mode.<br/>
Error mode defines the rule to parse values for series with error.
     */
    public Error setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueError;
    private Number valueError1;

    /**
     * Setter for value error.
     */
    public Error setValueError(String valueError) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError = valueError;
        } else {
            this.valueError = valueError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueError(%s)", wrapQuotes(valueError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueError(%s);", wrapQuotes(valueError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for value error.
     */
    public Error setValueError(Number valueError1) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError1 = valueError1;
        } else {
            this.valueError1 = valueError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueError(%s)", valueError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueError(%s);", valueError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(Stroke strokeOrFill, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %s, %s, %s, %s)", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(ColoredFill strokeOrFill1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %s, %s, %s, %s)", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(String strokeOrFill2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %s, %s, %s, %s)", wrapQuotes(strokeOrFill2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number valueErrorWidth;

    /**
     * Setter for value error width settings. Length pins for value axis in pixels.
     */
    public Error setValueErrorWidth(Number valueErrorWidth) {
        if (jsBase == null) {
            this.valueErrorWidth = valueErrorWidth;
        } else {
            this.valueErrorWidth = valueErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueErrorWidth(%s)", valueErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorWidth(%s);", valueErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueLowerError;
    private Number valueLowerError1;

    /**
     * Setter for value lower error.
     */
    public Error setValueLowerError(String valueLowerError) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError = valueLowerError;
        } else {
            this.valueLowerError = valueLowerError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueLowerError(%s)", wrapQuotes(valueLowerError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueLowerError(%s);", wrapQuotes(valueLowerError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for value lower error.
     */
    public Error setValueLowerError(Number valueLowerError1) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError1 = valueLowerError1;
        } else {
            this.valueLowerError1 = valueLowerError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueLowerError(%s)", valueLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueLowerError(%s);", valueLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueUpperError;
    private Number valueUpperError1;

    /**
     * Setter for value upper error.
     */
    public Error setValueUpperError(String valueUpperError) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError = valueUpperError;
        } else {
            this.valueUpperError = valueUpperError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueUpperError(%s)", wrapQuotes(valueUpperError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueUpperError(%s);", wrapQuotes(valueUpperError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for value upper error.
     */
    public Error setValueUpperError(Number valueUpperError1) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError1 = valueUpperError1;
        } else {
            this.valueUpperError1 = valueUpperError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".valueUpperError(%s)", valueUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueUpperError(%s);", valueUpperError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xError;
    private Number xError1;

    /**
     * Setter for X error.
     */
    public Error setXError(String xError) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError = xError;
        } else {
            this.xError = xError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xError(%s)", wrapQuotes(xError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xError(%s);", wrapQuotes(xError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for X error.
     */
    public Error setXError(Number xError1) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError1 = xError1;
        } else {
            this.xError1 = xError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xError(%s)", xError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xError(%s);", xError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke strokeOrFill3;
    private ColoredFill strokeOrFill4;
    private String strokeOrFill5;
    private Number thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(Stroke strokeOrFill3, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill3 = strokeOrFill3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill3 = strokeOrFill3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %s, %s, %s, %s)", ((strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", ((strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(ColoredFill strokeOrFill4, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill4 = strokeOrFill4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill4 = strokeOrFill4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %s, %s, %s, %s)", ((strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", ((strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(String strokeOrFill5, Number thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill5 = strokeOrFill5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill5 = strokeOrFill5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %s, %s, %s, %s)", wrapQuotes(strokeOrFill5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number xErrorWidth;

    /**
     * Setter for X error width settings. Length pins for X axis in pixels.
     */
    public Error setXErrorWidth(Number xErrorWidth) {
        if (jsBase == null) {
            this.xErrorWidth = xErrorWidth;
        } else {
            this.xErrorWidth = xErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xErrorWidth(%s)", xErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorWidth(%s);", xErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xLowerError;
    private Number xLowerError1;

    /**
     * Setter for X lower error.
     */
    public Error setXLowerError(String xLowerError) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError = xLowerError;
        } else {
            this.xLowerError = xLowerError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xLowerError(%s)", wrapQuotes(xLowerError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLowerError(%s);", wrapQuotes(xLowerError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for X lower error.
     */
    public Error setXLowerError(Number xLowerError1) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError1 = xLowerError1;
        } else {
            this.xLowerError1 = xLowerError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xLowerError(%s)", xLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLowerError(%s);", xLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xUpperError;
    private Number xUpperError1;

    /**
     * Setter for X upper error.
     */
    public Error setXUpperError(String xUpperError) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError = xUpperError;
        } else {
            this.xUpperError = xUpperError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xUpperError(%s)", wrapQuotes(xUpperError)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xUpperError(%s);", wrapQuotes(xUpperError)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for X upper error.
     */
    public Error setXUpperError(Number xUpperError1) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError1 = xUpperError1;
        } else {
            this.xUpperError1 = xUpperError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xUpperError(%s)", xUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xUpperError(%s);", xUpperError1));
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
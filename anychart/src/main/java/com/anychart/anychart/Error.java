package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private List<Error> setMode = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode() {
        if (!setMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setMode1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode1() {
        if (!setMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valueError;
    private Double valueError1;
    private List<Error> setValueError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".valueError(%s)", wrapQuotes(valueError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueError() {
        if (!setValueError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setValueError1 = new ArrayList<>();

    /**
     * Setter for value error.
     */
    public Error setValueError(Double valueError1) {
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
            js.append(String.format(Locale.US, ".valueError(%f)", valueError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueError(%f)", valueError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueError1() {
        if (!setValueError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Error> setValueErrorStroke = new ArrayList<>();

    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(Stroke strokeOrFill, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueErrorStroke() {
        if (!setValueErrorStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueErrorStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setValueErrorStroke1 = new ArrayList<>();

    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(ColoredFill strokeOrFill1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueErrorStroke1() {
        if (!setValueErrorStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueErrorStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setValueErrorStroke2 = new ArrayList<>();

    /**
     * Setter for value error stroke settings.
     */
    public Error setValueErrorStroke(String strokeOrFill2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueErrorStroke2() {
        if (!setValueErrorStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueErrorStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double valueErrorWidth;
    private List<Error> setValueErrorWidth = new ArrayList<>();

    /**
     * Setter for value error width settings. Length pins for value axis in pixels.
     */
    public Error setValueErrorWidth(Double valueErrorWidth) {
        if (jsBase == null) {
            this.valueErrorWidth = valueErrorWidth;
        } else {
            this.valueErrorWidth = valueErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".valueErrorWidth(%f)", valueErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorWidth(%f)", valueErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueErrorWidth() {
        if (!setValueErrorWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueErrorWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valueLowerError;
    private Double valueLowerError1;
    private List<Error> setValueLowerError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".valueLowerError(%s)", wrapQuotes(valueLowerError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueLowerError() {
        if (!setValueLowerError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueLowerError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setValueLowerError1 = new ArrayList<>();

    /**
     * Setter for value lower error.
     */
    public Error setValueLowerError(Double valueLowerError1) {
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
            js.append(String.format(Locale.US, ".valueLowerError(%f)", valueLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueLowerError(%f)", valueLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueLowerError1() {
        if (!setValueLowerError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueLowerError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valueUpperError;
    private Double valueUpperError1;
    private List<Error> setValueUpperError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".valueUpperError(%s)", wrapQuotes(valueUpperError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueUpperError() {
        if (!setValueUpperError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueUpperError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setValueUpperError1 = new ArrayList<>();

    /**
     * Setter for value upper error.
     */
    public Error setValueUpperError(Double valueUpperError1) {
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
            js.append(String.format(Locale.US, ".valueUpperError(%f)", valueUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueUpperError(%f)", valueUpperError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValueUpperError1() {
        if (!setValueUpperError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setValueUpperError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String xError;
    private Double xError1;
    private List<Error> setXError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xError(%s)", wrapQuotes(xError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXError() {
        if (!setXError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setXError1 = new ArrayList<>();

    /**
     * Setter for X error.
     */
    public Error setXError(Double xError1) {
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
            js.append(String.format(Locale.US, ".xError(%f)", xError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xError(%f)", xError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXError1() {
        if (!setXError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke strokeOrFill3;
    private ColoredFill strokeOrFill4;
    private String strokeOrFill5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<Error> setXErrorStroke = new ArrayList<>();

    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(Stroke strokeOrFill3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXErrorStroke() {
        if (!setXErrorStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXErrorStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setXErrorStroke1 = new ArrayList<>();

    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(ColoredFill strokeOrFill4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", ((strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXErrorStroke1() {
        if (!setXErrorStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXErrorStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setXErrorStroke2 = new ArrayList<>();

    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Error setXErrorStroke(String strokeOrFill5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXErrorStroke2() {
        if (!setXErrorStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXErrorStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double xErrorWidth;
    private List<Error> setXErrorWidth = new ArrayList<>();

    /**
     * Setter for X error width settings. Length pins for X axis in pixels.
     */
    public Error setXErrorWidth(Double xErrorWidth) {
        if (jsBase == null) {
            this.xErrorWidth = xErrorWidth;
        } else {
            this.xErrorWidth = xErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".xErrorWidth(%f)", xErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorWidth(%f)", xErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXErrorWidth() {
        if (!setXErrorWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXErrorWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String xLowerError;
    private Double xLowerError1;
    private List<Error> setXLowerError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xLowerError(%s)", wrapQuotes(xLowerError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXLowerError() {
        if (!setXLowerError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXLowerError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setXLowerError1 = new ArrayList<>();

    /**
     * Setter for X lower error.
     */
    public Error setXLowerError(Double xLowerError1) {
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
            js.append(String.format(Locale.US, ".xLowerError(%f)", xLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLowerError(%f)", xLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXLowerError1() {
        if (!setXLowerError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXLowerError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String xUpperError;
    private Double xUpperError1;
    private List<Error> setXUpperError = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xUpperError(%s)", wrapQuotes(xUpperError)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXUpperError() {
        if (!setXUpperError.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXUpperError) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Error> setXUpperError1 = new ArrayList<>();

    /**
     * Setter for X upper error.
     */
    public Error setXUpperError(Double xUpperError1) {
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
            js.append(String.format(Locale.US, ".xUpperError(%f)", xUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xUpperError(%f)", xUpperError1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXUpperError1() {
        if (!setXUpperError1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Error item : setXUpperError1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetMode());
        js.append(generateJSsetMode1());
        js.append(generateJSsetValueError());
        js.append(generateJSsetValueError1());
        js.append(generateJSsetValueErrorStroke());
        js.append(generateJSsetValueErrorStroke1());
        js.append(generateJSsetValueErrorStroke2());
        js.append(generateJSsetValueErrorWidth());
        js.append(generateJSsetValueLowerError());
        js.append(generateJSsetValueLowerError1());
        js.append(generateJSsetValueUpperError());
        js.append(generateJSsetValueUpperError1());
        js.append(generateJSsetXError());
        js.append(generateJSsetXError1());
        js.append(generateJSsetXErrorStroke());
        js.append(generateJSsetXErrorStroke1());
        js.append(generateJSsetXErrorStroke2());
        js.append(generateJSsetXErrorWidth());
        js.append(generateJSsetXLowerError());
        js.append(generateJSsetXLowerError1());
        js.append(generateJSsetXUpperError());
        js.append(generateJSsetXUpperError1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
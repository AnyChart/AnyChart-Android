package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Error extends CoreBase {

    private String jsBase;

    public Error() {

    }

    protected Error(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String mode;
    private ErrorMode mode1;

    public void setMode(String mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;

            js.append(String.format(Locale.US, jsBase + ".mode(%s);", mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", mode));
                js.setLength(0);
            }
        }
    }


    public void setMode(ErrorMode mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;

            js.append(String.format(Locale.US, jsBase + ".mode(%s);", (mode1 != null) ? mode1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", (mode1 != null) ? mode1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private String valueError;
    private Double valueError1;

    public void setValueerror(String valueError) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError = valueError;
        } else {
            this.valueError = valueError;

            js.append(String.format(Locale.US, jsBase + ".valueError(%s);", valueError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueError(%s);", valueError));
                js.setLength(0);
            }
        }
    }


    public void setValueerror(Double valueError1) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError1 = valueError1;
        } else {
            this.valueError1 = valueError1;

            js.append(String.format(Locale.US, jsBase + ".valueError(%f);", valueError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueError(%f);", valueError1));
                js.setLength(0);
            }
        }
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setValueerrorstroke(Stroke strokeOrFill, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValueerrorstroke(ColoredFill strokeOrFill1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValueerrorstroke(String strokeOrFill2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %f, %s, %s, %s);", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double valueErrorWidth;

    public void setValueerrorwidth(Double valueErrorWidth) {
        if (jsBase == null) {
            this.valueErrorWidth = valueErrorWidth;
        } else {
            this.valueErrorWidth = valueErrorWidth;

            js.append(String.format(Locale.US, jsBase + ".valueErrorWidth(%f);", valueErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueErrorWidth(%f);", valueErrorWidth));
                js.setLength(0);
            }
        }
    }

    private String valueLowerError;
    private Double valueLowerError1;

    public void setValuelowererror(String valueLowerError) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError = valueLowerError;
        } else {
            this.valueLowerError = valueLowerError;

            js.append(String.format(Locale.US, jsBase + ".valueLowerError(%s);", valueLowerError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueLowerError(%s);", valueLowerError));
                js.setLength(0);
            }
        }
    }


    public void setValuelowererror(Double valueLowerError1) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError1 = valueLowerError1;
        } else {
            this.valueLowerError1 = valueLowerError1;

            js.append(String.format(Locale.US, jsBase + ".valueLowerError(%f);", valueLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueLowerError(%f);", valueLowerError1));
                js.setLength(0);
            }
        }
    }

    private String valueUpperError;
    private Double valueUpperError1;

    public void setValueuppererror(String valueUpperError) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError = valueUpperError;
        } else {
            this.valueUpperError = valueUpperError;

            js.append(String.format(Locale.US, jsBase + ".valueUpperError(%s);", valueUpperError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueUpperError(%s);", valueUpperError));
                js.setLength(0);
            }
        }
    }


    public void setValueuppererror(Double valueUpperError1) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError1 = valueUpperError1;
        } else {
            this.valueUpperError1 = valueUpperError1;

            js.append(String.format(Locale.US, jsBase + ".valueUpperError(%f);", valueUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueUpperError(%f);", valueUpperError1));
                js.setLength(0);
            }
        }
    }

    private String xError;
    private Double xError1;

    public void setXerror(String xError) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError = xError;
        } else {
            this.xError = xError;

            js.append(String.format(Locale.US, jsBase + ".xError(%s);", xError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xError(%s);", xError));
                js.setLength(0);
            }
        }
    }


    public void setXerror(Double xError1) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError1 = xError1;
        } else {
            this.xError1 = xError1;

            js.append(String.format(Locale.US, jsBase + ".xError(%f);", xError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xError(%f);", xError1));
                js.setLength(0);
            }
        }
    }

    private Stroke strokeOrFill3;
    private ColoredFill strokeOrFill4;
    private String strokeOrFill5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setXerrorstroke(Stroke strokeOrFill3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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

            js.append(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setXerrorstroke(ColoredFill strokeOrFill4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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

            js.append(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setXerrorstroke(String strokeOrFill5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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

            js.append(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", strokeOrFill5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %f, %s, %s, %s);", strokeOrFill5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double xErrorWidth;

    public void setXerrorwidth(Double xErrorWidth) {
        if (jsBase == null) {
            this.xErrorWidth = xErrorWidth;
        } else {
            this.xErrorWidth = xErrorWidth;

            js.append(String.format(Locale.US, jsBase + ".xErrorWidth(%f);", xErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xErrorWidth(%f);", xErrorWidth));
                js.setLength(0);
            }
        }
    }

    private String xLowerError;
    private Double xLowerError1;

    public void setXlowererror(String xLowerError) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError = xLowerError;
        } else {
            this.xLowerError = xLowerError;

            js.append(String.format(Locale.US, jsBase + ".xLowerError(%s);", xLowerError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLowerError(%s);", xLowerError));
                js.setLength(0);
            }
        }
    }


    public void setXlowererror(Double xLowerError1) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError1 = xLowerError1;
        } else {
            this.xLowerError1 = xLowerError1;

            js.append(String.format(Locale.US, jsBase + ".xLowerError(%f);", xLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xLowerError(%f);", xLowerError1));
                js.setLength(0);
            }
        }
    }

    private String xUpperError;
    private Double xUpperError1;

    public void setXuppererror(String xUpperError) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError = xUpperError;
        } else {
            this.xUpperError = xUpperError;

            js.append(String.format(Locale.US, jsBase + ".xUpperError(%s);", xUpperError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xUpperError(%s);", xUpperError));
                js.setLength(0);
            }
        }
    }


    public void setXuppererror(Double xUpperError1) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError1 = xUpperError1;
        } else {
            this.xUpperError1 = xUpperError1;

            js.append(String.format(Locale.US, jsBase + ".xUpperError(%f);", xUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xUpperError(%f);", xUpperError1));
                js.setLength(0);
            }
        }
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSvalueError() {
        if (valueError != null) {
            return String.format(Locale.US, "valueError: %s,", valueError);
        }
        return "";
    }

    private String generateJSvalueError1() {
        if (valueError1 != null) {
            return String.format(Locale.US, "valueError: %f,", valueError1);
        }
        return "";
    }

    private String generateJSstrokeOrFill() {
        if (strokeOrFill != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill1() {
        if (strokeOrFill1 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill2() {
        if (strokeOrFill2 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvalueErrorWidth() {
        if (valueErrorWidth != null) {
            return String.format(Locale.US, "valueErrorWidth: %f,", valueErrorWidth);
        }
        return "";
    }

    private String generateJSvalueLowerError() {
        if (valueLowerError != null) {
            return String.format(Locale.US, "valueLowerError: %s,", valueLowerError);
        }
        return "";
    }

    private String generateJSvalueLowerError1() {
        if (valueLowerError1 != null) {
            return String.format(Locale.US, "valueLowerError: %f,", valueLowerError1);
        }
        return "";
    }

    private String generateJSvalueUpperError() {
        if (valueUpperError != null) {
            return String.format(Locale.US, "valueUpperError: %s,", valueUpperError);
        }
        return "";
    }

    private String generateJSvalueUpperError1() {
        if (valueUpperError1 != null) {
            return String.format(Locale.US, "valueUpperError: %f,", valueUpperError1);
        }
        return "";
    }

    private String generateJSxError() {
        if (xError != null) {
            return String.format(Locale.US, "xError: %s,", xError);
        }
        return "";
    }

    private String generateJSxError1() {
        if (xError1 != null) {
            return String.format(Locale.US, "xError: %f,", xError1);
        }
        return "";
    }

    private String generateJSstrokeOrFill3() {
        if (strokeOrFill3 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill4() {
        if (strokeOrFill4 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill5() {
        if (strokeOrFill5 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill5);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxErrorWidth() {
        if (xErrorWidth != null) {
            return String.format(Locale.US, "xErrorWidth: %f,", xErrorWidth);
        }
        return "";
    }

    private String generateJSxLowerError() {
        if (xLowerError != null) {
            return String.format(Locale.US, "xLowerError: %s,", xLowerError);
        }
        return "";
    }

    private String generateJSxLowerError1() {
        if (xLowerError1 != null) {
            return String.format(Locale.US, "xLowerError: %f,", xLowerError1);
        }
        return "";
    }

    private String generateJSxUpperError() {
        if (xUpperError != null) {
            return String.format(Locale.US, "xUpperError: %s,", xUpperError);
        }
        return "";
    }

    private String generateJSxUpperError1() {
        if (xUpperError1 != null) {
            return String.format(Locale.US, "xUpperError: %f,", xUpperError1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSvalueError());
            js.append(generateJSvalueError1());
            js.append(generateJSstrokeOrFill());
            js.append(generateJSstrokeOrFill1());
            js.append(generateJSstrokeOrFill2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSvalueErrorWidth());
            js.append(generateJSvalueLowerError());
            js.append(generateJSvalueLowerError1());
            js.append(generateJSvalueUpperError());
            js.append(generateJSvalueUpperError1());
            js.append(generateJSxError());
            js.append(generateJSxError1());
            js.append(generateJSstrokeOrFill3());
            js.append(generateJSstrokeOrFill4());
            js.append(generateJSstrokeOrFill5());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSxErrorWidth());
            js.append(generateJSxLowerError());
            js.append(generateJSxLowerError1());
            js.append(generateJSxUpperError());
            js.append(generateJSxUpperError1());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Error extends JsObject {

    
    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String mode;
    private ErrorMode mode1;

    public void setMode(String mode) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
    }


    public void setMode(ErrorMode mode1) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String valueError;
    private Double valueError1;

    public void setValueerror(String valueError) {
        this.valueError = null;
        this.valueError1 = null;
        
        this.valueError = valueError;
    }


    public void setValueerror(Double valueError1) {
        this.valueError = null;
        this.valueError1 = null;
        
        this.valueError1 = valueError1;
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setValueerrorstroke(Stroke strokeOrFill, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.strokeOrFill = null;
        this.strokeOrFill1 = null;
        this.strokeOrFill2 = null;
        
        this.strokeOrFill = strokeOrFill;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setValueerrorstroke(ColoredFill strokeOrFill1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.strokeOrFill = null;
        this.strokeOrFill1 = null;
        this.strokeOrFill2 = null;
        
        this.strokeOrFill1 = strokeOrFill1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setValueerrorstroke(String strokeOrFill2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.strokeOrFill = null;
        this.strokeOrFill1 = null;
        this.strokeOrFill2 = null;
        
        this.strokeOrFill2 = strokeOrFill2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Double valueErrorWidth;

    public void setValueerrorwidth(Double valueErrorWidth) {
        this.valueErrorWidth = valueErrorWidth;
    }

    private String valueLowerError;
    private Double valueLowerError1;

    public void setValuelowererror(String valueLowerError) {
        this.valueLowerError = null;
        this.valueLowerError1 = null;
        
        this.valueLowerError = valueLowerError;
    }


    public void setValuelowererror(Double valueLowerError1) {
        this.valueLowerError = null;
        this.valueLowerError1 = null;
        
        this.valueLowerError1 = valueLowerError1;
    }

    private String valueUpperError;
    private Double valueUpperError1;

    public void setValueuppererror(String valueUpperError) {
        this.valueUpperError = null;
        this.valueUpperError1 = null;
        
        this.valueUpperError = valueUpperError;
    }


    public void setValueuppererror(Double valueUpperError1) {
        this.valueUpperError = null;
        this.valueUpperError1 = null;
        
        this.valueUpperError1 = valueUpperError1;
    }

    private String xError;
    private Double xError1;

    public void setXerror(String xError) {
        this.xError = null;
        this.xError1 = null;
        
        this.xError = xError;
    }


    public void setXerror(Double xError1) {
        this.xError = null;
        this.xError1 = null;
        
        this.xError1 = xError1;
    }

    private Stroke strokeOrFill3;
    private ColoredFill strokeOrFill4;
    private String strokeOrFill5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setXerrorstroke(Stroke strokeOrFill3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
    }


    public void setXerrorstroke(ColoredFill strokeOrFill4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
    }


    public void setXerrorstroke(String strokeOrFill5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
    }

    private Double xErrorWidth;

    public void setXerrorwidth(Double xErrorWidth) {
        this.xErrorWidth = xErrorWidth;
    }

    private String xLowerError;
    private Double xLowerError1;

    public void setXlowererror(String xLowerError) {
        this.xLowerError = null;
        this.xLowerError1 = null;
        
        this.xLowerError = xLowerError;
    }


    public void setXlowererror(Double xLowerError1) {
        this.xLowerError = null;
        this.xLowerError1 = null;
        
        this.xLowerError1 = xLowerError1;
    }

    private String xUpperError;
    private Double xUpperError1;

    public void setXuppererror(String xUpperError) {
        this.xUpperError = null;
        this.xUpperError1 = null;
        
        this.xUpperError = xUpperError;
    }


    public void setXuppererror(Double xUpperError1) {
        this.xUpperError = null;
        this.xUpperError1 = null;
        
        this.xUpperError1 = xUpperError1;
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
        js.append("{");
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJStype2());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
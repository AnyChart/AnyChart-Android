package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Path extends JsObject {

    
    private Double rx;
    private Double ry;
    private Double fromAngle;
    private Double extent;

    public void setArcto(Double rx, Double ry, Double fromAngle, Double extent) {
        this.rx = rx;
        this.ry = ry;
        this.fromAngle = fromAngle;
        this.extent = extent;
    }

    private Double rx1;
    private Double ry1;
    private Double fromAngle1;
    private Double extent1;

    public void setArctoascurves(Double rx1, Double ry1, Double fromAngle1, Double extent1) {
        this.rx = null;
        this.rx1 = null;
        
        this.rx1 = rx1;
        this.ry = null;
        this.ry1 = null;
        
        this.ry1 = ry1;
        this.fromAngle = null;
        this.fromAngle1 = null;
        
        this.fromAngle1 = fromAngle1;
        this.extent = null;
        this.extent1 = null;
        
        this.extent1 = extent1;
    }

    private Double x;
    private Double y;
    private Double rx2;
    private Double ry2;
    private Boolean largeArc;
    private Boolean clockwiseArc;

    public void setArctobyendpoint(Double x, Double y, Double rx2, Double ry2, Boolean largeArc, Boolean clockwiseArc) {
        this.x = x;
        this.y = y;
        this.rx = null;
        this.rx1 = null;
        this.rx2 = null;
        
        this.rx2 = rx2;
        this.ry = null;
        this.ry1 = null;
        this.ry2 = null;
        
        this.ry2 = ry2;
        this.largeArc = largeArc;
        this.clockwiseArc = clockwiseArc;
    }

    private Double cx;
    private Double cy;
    private Double rx3;
    private Double ry3;
    private Double fromAngle2;
    private Double sweep;
    private Boolean lineTo;

    public void setCirculararc(Double cx, Double cy, Double rx3, Double ry3, Double fromAngle2, Double sweep, Boolean lineTo) {
        this.cx = cx;
        this.cy = cy;
        this.rx = null;
        this.rx1 = null;
        this.rx2 = null;
        this.rx3 = null;
        
        this.rx3 = rx3;
        this.ry = null;
        this.ry1 = null;
        this.ry2 = null;
        this.ry3 = null;
        
        this.ry3 = ry3;
        this.fromAngle = null;
        this.fromAngle1 = null;
        this.fromAngle2 = null;
        
        this.fromAngle2 = fromAngle2;
        this.sweep = sweep;
        this.lineTo = lineTo;
    }

    private Double controlX;
    private Double controlY;
    private Double controlX1;
    private Double controlY1;
    private Double endX;
    private Double endY;
    private Double var_args;

    public void setCurveto(Double controlX, Double controlY, Double controlX1, Double controlY1, Double endX, Double endY, Double var_args) {
        this.controlX = null;
        this.controlX1 = null;
        
        this.controlX = controlX;
        this.controlY = null;
        this.controlY1 = null;
        
        this.controlY = controlY;
        this.controlX = null;
        this.controlX1 = null;
        
        this.controlX1 = controlX1;
        this.controlY = null;
        this.controlY1 = null;
        
        this.controlY1 = controlY1;
        this.endX = endX;
        this.endY = endY;
        this.var_args = var_args;
    }

    private Double x1;
    private Double y1;
    private Double var_args1;

    public void setLineto(Double x1, Double y1, Double var_args1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.var_args = null;
        this.var_args1 = null;
        
        this.var_args1 = var_args1;
    }

    private Double x2;
    private Double y2;

    public void setMoveto(Double x2, Double y2) {
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        
        this.x2 = x2;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        
        this.y2 = y2;
    }

    private Double controlX2;
    private Double controlY2;
    private Double endX1;
    private Double endY1;
    private Double var_args2;

    public void setQuadraticcurveto(Double controlX2, Double controlY2, Double endX1, Double endY1, Double var_args2) {
        this.controlX = null;
        this.controlX1 = null;
        this.controlX2 = null;
        
        this.controlX2 = controlX2;
        this.controlY = null;
        this.controlY1 = null;
        this.controlY2 = null;
        
        this.controlY2 = controlY2;
        this.endX = null;
        this.endX1 = null;
        
        this.endX1 = endX1;
        this.endY = null;
        this.endY1 = null;
        
        this.endY1 = endY1;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args2 = var_args2;
    }

    private String generateJSrx() {
        if (rx != null) {
            return String.format(Locale.US, "rx: %f,", rx);
        }
        return "";
    }

    private String generateJSry() {
        if (ry != null) {
            return String.format(Locale.US, "ry: %f,", ry);
        }
        return "";
    }

    private String generateJSfromAngle() {
        if (fromAngle != null) {
            return String.format(Locale.US, "fromAngle: %f,", fromAngle);
        }
        return "";
    }

    private String generateJSextent() {
        if (extent != null) {
            return String.format(Locale.US, "extent: %f,", extent);
        }
        return "";
    }

    private String generateJSrx1() {
        if (rx1 != null) {
            return String.format(Locale.US, "rx: %f,", rx1);
        }
        return "";
    }

    private String generateJSry1() {
        if (ry1 != null) {
            return String.format(Locale.US, "ry: %f,", ry1);
        }
        return "";
    }

    private String generateJSfromAngle1() {
        if (fromAngle1 != null) {
            return String.format(Locale.US, "fromAngle: %f,", fromAngle1);
        }
        return "";
    }

    private String generateJSextent1() {
        if (extent1 != null) {
            return String.format(Locale.US, "extent: %f,", extent1);
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSrx2() {
        if (rx2 != null) {
            return String.format(Locale.US, "rx: %f,", rx2);
        }
        return "";
    }

    private String generateJSry2() {
        if (ry2 != null) {
            return String.format(Locale.US, "ry: %f,", ry2);
        }
        return "";
    }

    private String generateJSlargeArc() {
        if (largeArc != null) {
            return String.format(Locale.US, "largeArc: %b,", largeArc);
        }
        return "";
    }

    private String generateJSclockwiseArc() {
        if (clockwiseArc != null) {
            return String.format(Locale.US, "clockwiseArc: %b,", clockwiseArc);
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSrx3() {
        if (rx3 != null) {
            return String.format(Locale.US, "rx: %f,", rx3);
        }
        return "";
    }

    private String generateJSry3() {
        if (ry3 != null) {
            return String.format(Locale.US, "ry: %f,", ry3);
        }
        return "";
    }

    private String generateJSfromAngle2() {
        if (fromAngle2 != null) {
            return String.format(Locale.US, "fromAngle: %f,", fromAngle2);
        }
        return "";
    }

    private String generateJSsweep() {
        if (sweep != null) {
            return String.format(Locale.US, "sweep: %f,", sweep);
        }
        return "";
    }

    private String generateJSlineTo() {
        if (lineTo != null) {
            return String.format(Locale.US, "lineTo: %b,", lineTo);
        }
        return "";
    }

    private String generateJScontrolX() {
        if (controlX != null) {
            return String.format(Locale.US, "controlX: %f,", controlX);
        }
        return "";
    }

    private String generateJScontrolY() {
        if (controlY != null) {
            return String.format(Locale.US, "controlY: %f,", controlY);
        }
        return "";
    }

    private String generateJScontrolX1() {
        if (controlX1 != null) {
            return String.format(Locale.US, "controlX: %f,", controlX1);
        }
        return "";
    }

    private String generateJScontrolY1() {
        if (controlY1 != null) {
            return String.format(Locale.US, "controlY: %f,", controlY1);
        }
        return "";
    }

    private String generateJSendX() {
        if (endX != null) {
            return String.format(Locale.US, "endX: %f,", endX);
        }
        return "";
    }

    private String generateJSendY() {
        if (endY != null) {
            return String.format(Locale.US, "endY: %f,", endY);
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %f,", var_args);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %f,", x1);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %f,", y1);
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %f,", var_args1);
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJScontrolX2() {
        if (controlX2 != null) {
            return String.format(Locale.US, "controlX: %f,", controlX2);
        }
        return "";
    }

    private String generateJScontrolY2() {
        if (controlY2 != null) {
            return String.format(Locale.US, "controlY: %f,", controlY2);
        }
        return "";
    }

    private String generateJSendX1() {
        if (endX1 != null) {
            return String.format(Locale.US, "endX: %f,", endX1);
        }
        return "";
    }

    private String generateJSendY1() {
        if (endY1 != null) {
            return String.format(Locale.US, "endY: %f,", endY1);
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %f,", var_args2);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSrx());
        js.append(generateJSry());
        js.append(generateJSfromAngle());
        js.append(generateJSextent());
        js.append(generateJSrx1());
        js.append(generateJSry1());
        js.append(generateJSfromAngle1());
        js.append(generateJSextent1());
        js.append(generateJSx());
        js.append(generateJSy());
        js.append(generateJSrx2());
        js.append(generateJSry2());
        js.append(generateJSlargeArc());
        js.append(generateJSclockwiseArc());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSrx3());
        js.append(generateJSry3());
        js.append(generateJSfromAngle2());
        js.append(generateJSsweep());
        js.append(generateJSlineTo());
        js.append(generateJScontrolX());
        js.append(generateJScontrolY());
        js.append(generateJScontrolX1());
        js.append(generateJScontrolY1());
        js.append(generateJSendX());
        js.append(generateJSendY());
        js.append(generateJSvar_args());
        js.append(generateJSx1());
        js.append(generateJSy1());
        js.append(generateJSvar_args1());
        js.append(generateJSx2());
        js.append(generateJSy2());
        js.append(generateJScontrolX2());
        js.append(generateJScontrolY2());
        js.append(generateJSendX1());
        js.append(generateJSendY1());
        js.append(generateJSvar_args2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
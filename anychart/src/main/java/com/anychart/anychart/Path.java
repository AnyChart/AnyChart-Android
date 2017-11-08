package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Path class.<br/>
Path is sequence of segments of different type, it can be opened or closed.<br/>
To define the internal fill this rule is used <a target='_blank'
href="https://www.w3.org/TR/SVG/painting.html#FillProperties">EVEN-ODD</a>.<br/>
Path always starts with {@link anychart.graphics.vector.Path#moveTo} command.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#path} or
{@link anychart.graphics.vector.Layer#path} to create stage or layer bound path.
<br/> To create unbound path use {@link anychart.graphics#path} <br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#path}<br/>
{@link anychart.graphics.vector.Layer#path}<br/>
{@link anychart.graphics#path}
 */
public class Path extends JsObject {

    public Path() {
        js.setLength(0);
        js.append("var path").append(++variableIndex).append(" = anychart.graphics.vector.path();");
        jsBase = "path" + variableIndex;
    }

    protected Path(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Path(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double rx;
    private Double ry;
    private Double fromAngle;
    private Double extent;

    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An ellipse with radius <b>rx, ry</b>, starting from an angle <b>fromAngle</b>, with an angular length <b>extent</b>.<br/>
The positive direction is considered the direction from a positive direction of the X-axis to a positive direction
of the Y-axis, that is clockwise.
     */
    public Path arcTo(Double rx, Double ry, Double fromAngle, Double extent) {
        if (jsBase == null) {
            this.rx = rx;
            this.ry = ry;
            this.fromAngle = fromAngle;
            this.extent = extent;
        } else {
            this.rx = rx;
            this.ry = ry;
            this.fromAngle = fromAngle;
            this.extent = extent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".arcTo(%f, %f, %f, %f)", rx, ry, fromAngle, extent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".arcTo(%f, %f, %f, %f)", rx, ry, fromAngle, extent));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rx1;
    private Double ry1;
    private Double fromAngle1;
    private Double extent1;

    /**
     * This method is similar to {@link anychart.graphics.vector.Path#arcTo}, but in this case the arc is approximated by Bezier curves.
     */
    public Path arcToAsCurves(Double rx1, Double ry1, Double fromAngle1, Double extent1) {
        if (jsBase == null) {
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
        } else {
            this.rx1 = rx1;
            this.ry1 = ry1;
            this.fromAngle1 = fromAngle1;
            this.extent1 = extent1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".arcToAsCurves(%f, %f, %f, %f)", rx1, ry1, fromAngle1, extent1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".arcToAsCurves(%f, %f, %f, %f)", rx1, ry1, fromAngle1, extent1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x;
    private Double y;
    private Double rx2;
    private Double ry2;
    private Boolean largeArc;
    private Boolean clockwiseArc;

    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An arc of an ellipse with radius <b>rx, ry</b> <b>rx, ry</b> from the current point to a point <b>x, y</b>.<br/>
The <b>largeArc</b> and <b>clockwiseArc</b> flags define which of the 4 possible arcs is drawn.<br/>
Read more at {@link https://www.w3.org/TR/SVG/implnote.html#ArcImplementationNotes}
     */
    public Path arcToByEndPoint(Double x, Double y, Double rx2, Double ry2, Boolean largeArc, Boolean clockwiseArc) {
        if (jsBase == null) {
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
        } else {
            this.x = x;
            this.y = y;
            this.rx2 = rx2;
            this.ry2 = ry2;
            this.largeArc = largeArc;
            this.clockwiseArc = clockwiseArc;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".arcToByEndPoint(%f, %f, %f, %f, %b, %b)", x, y, rx2, ry2, largeArc, clockwiseArc));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".arcToByEndPoint(%f, %f, %f, %f, %b, %b)", x, y, rx2, ry2, largeArc, clockwiseArc));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cx;
    private Double cy;
    private Double rx3;
    private Double ry3;
    private Double fromAngle2;
    private Double sweep;
    private Boolean lineTo;

    /**
     * Adds a command to the path that draws a circular arc.<br/>
An arc with a center in (cx, cy) start angle (from) and end angle (from + sweep),
with clockwise and counterclock drawing option.
     */
    public Path circularArc(Double cx, Double cy, Double rx3, Double ry3, Double fromAngle2, Double sweep, Boolean lineTo) {
        if (jsBase == null) {
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
        } else {
            this.cx = cx;
            this.cy = cy;
            this.rx3 = rx3;
            this.ry3 = ry3;
            this.fromAngle2 = fromAngle2;
            this.sweep = sweep;
            this.lineTo = lineTo;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".circularArc(%f, %f, %f, %f, %f, %f, %b)", cx, cy, rx3, ry3, fromAngle2, sweep, lineTo));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".circularArc(%f, %f, %f, %f, %f, %f, %b)", cx, cy, rx3, ry3, fromAngle2, sweep, lineTo));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double controlX;
    private Double controlY;
    private Double controlX1;
    private Double controlY1;
    private Double endX;
    private Double endY;
    private Double var_args;

    /**
     * Adds specified points to the path, drawing sequentially a cubic Bezier curve from the current point to the next.<br/>
Each curve is defined by 3 points (6 coordinates) – two control points and an endpoint.
     */
    public Path curveTo(Double controlX, Double controlY, Double controlX1, Double controlY1, Double endX, Double endY, Double var_args) {
        if (jsBase == null) {
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
        } else {
            this.controlX = controlX;
            this.controlY = controlY;
            this.controlX1 = controlX1;
            this.controlY1 = controlY1;
            this.endX = endX;
            this.endY = endY;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".curveTo(%f, %f, %f, %f, %f, %f, %f)", controlX, controlY, controlX1, controlY1, endX, endY, var_args));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".curveTo(%f, %f, %f, %f, %f, %f, %f)", controlX, controlY, controlX1, controlY1, endX, endY, var_args));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x1;
    private Double y1;
    private Double var_args1;

    /**
     * Adds specified points to the current path, drawing sequentially a straight line through the specified coordinates.
     */
    public Path lineTo(Double x1, Double y1, Double var_args1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineTo(%f, %f, %f)", x1, y1, var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineTo(%f, %f, %f)", x1, y1, var_args1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x2;
    private Double y2;

    /**
     * Moves path cursor position to a specified coordinate.</br>
Remember that if you call the <b>moveTo</b> method a few times in a row, only the last call will be applied.
     */
    public Path moveTo(Double x2, Double y2) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.x2 = x2;
            this.y2 = y2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".moveTo(%f, %f)", x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".moveTo(%f, %f)", x2, y2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double controlX2;
    private Double controlY2;
    private Double endX1;
    private Double endY1;
    private Double var_args2;

    /**
     * Adds specified points to the path, drawing sequentially a quadratic Bezier curve from the current point to the next.
Each curve is defined by 2 points (4 coordinates) – a control point and an endpoint.
     */
    public Path quadraticCurveTo(Double controlX2, Double controlY2, Double endX1, Double endY1, Double var_args2) {
        if (jsBase == null) {
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
        } else {
            this.controlX2 = controlX2;
            this.controlY2 = controlY2;
            this.endX1 = endX1;
            this.endY1 = endY1;
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".quadraticCurveTo(%f, %f, %f, %f, %f)", controlX2, controlY2, endX1, endY1, var_args2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".quadraticCurveTo(%f, %f, %f, %f, %f)", controlX2, controlY2, endX1, endY1, var_args2));
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
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

    
    private Number rx;
    private Number ry;
    private Number fromAngle;
    private Number extent;

    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An ellipse with radius <b>rx, ry</b>, starting from an angle <b>fromAngle</b>, with an angular length <b>extent</b>.<br/>
The positive direction is considered the direction from a positive direction of the X-axis to a positive direction
of the Y-axis, that is clockwise.
     */
    public Path arcTo(Number rx, Number ry, Number fromAngle, Number extent) {
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
            
            js.append(String.format(Locale.US, ".arcTo(%s, %s, %s, %s)", rx, ry, fromAngle, extent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".arcTo(%s, %s, %s, %s);", rx, ry, fromAngle, extent));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number rx1;
    private Number ry1;
    private Number fromAngle1;
    private Number extent1;

    /**
     * This method is similar to {@link anychart.graphics.vector.Path#arcTo}, but in this case the arc is approximated by Bezier curves.
     */
    public Path arcToAsCurves(Number rx1, Number ry1, Number fromAngle1, Number extent1) {
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
            
            js.append(String.format(Locale.US, ".arcToAsCurves(%s, %s, %s, %s)", rx1, ry1, fromAngle1, extent1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".arcToAsCurves(%s, %s, %s, %s);", rx1, ry1, fromAngle1, extent1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number x;
    private Number y;
    private Number rx2;
    private Number ry2;
    private Boolean largeArc;
    private Boolean clockwiseArc;

    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An arc of an ellipse with radius <b>rx, ry</b> <b>rx, ry</b> from the current point to a point <b>x, y</b>.<br/>
The <b>largeArc</b> and <b>clockwiseArc</b> flags define which of the 4 possible arcs is drawn.<br/>
Read more at {@link https://www.w3.org/TR/SVG/implnote.html#ArcImplementationNotes}
     */
    public Path arcToByEndPoint(Number x, Number y, Number rx2, Number ry2, Boolean largeArc, Boolean clockwiseArc) {
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
            
            js.append(String.format(Locale.US, ".arcToByEndPoint(%s, %s, %s, %s, %b, %b)", x, y, rx2, ry2, largeArc, clockwiseArc));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".arcToByEndPoint(%s, %s, %s, %s, %b, %b);", x, y, rx2, ry2, largeArc, clockwiseArc));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number cx;
    private Number cy;
    private Number rx3;
    private Number ry3;
    private Number fromAngle2;
    private Number sweep;
    private Boolean lineTo;

    /**
     * Adds a command to the path that draws a circular arc.<br/>
An arc with a center in (cx, cy) start angle (from) and end angle (from + sweep),
with clockwise and counterclock drawing option.
     */
    public Path circularArc(Number cx, Number cy, Number rx3, Number ry3, Number fromAngle2, Number sweep, Boolean lineTo) {
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
            
            js.append(String.format(Locale.US, ".circularArc(%s, %s, %s, %s, %s, %s, %b)", cx, cy, rx3, ry3, fromAngle2, sweep, lineTo));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".circularArc(%s, %s, %s, %s, %s, %s, %b);", cx, cy, rx3, ry3, fromAngle2, sweep, lineTo));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number controlX;
    private Number controlY;
    private Number controlX1;
    private Number controlY1;
    private Number endX;
    private Number endY;
    private Number var_args;

    /**
     * Adds specified points to the path, drawing sequentially a cubic Bezier curve from the current point to the next.<br/>
Each curve is defined by 3 points (6 coordinates) – two control points and an endpoint.
     */
    public Path curveTo(Number controlX, Number controlY, Number controlX1, Number controlY1, Number endX, Number endY, Number var_args) {
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
            
            js.append(String.format(Locale.US, ".curveTo(%s, %s, %s, %s, %s, %s, %s)", controlX, controlY, controlX1, controlY1, endX, endY, var_args));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".curveTo(%s, %s, %s, %s, %s, %s, %s);", controlX, controlY, controlX1, controlY1, endX, endY, var_args));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number x1;
    private Number y1;
    private Number var_args1;

    /**
     * Adds specified points to the current path, drawing sequentially a straight line through the specified coordinates.
     */
    public Path lineTo(Number x1, Number y1, Number var_args1) {
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
            
            js.append(String.format(Locale.US, ".lineTo(%s, %s, %s)", x1, y1, var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineTo(%s, %s, %s);", x1, y1, var_args1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number x2;
    private Number y2;

    /**
     * Moves path cursor position to a specified coordinate.</br>
Remember that if you call the <b>moveTo</b> method a few times in a row, only the last call will be applied.
     */
    public Path moveTo(Number x2, Number y2) {
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
            
            js.append(String.format(Locale.US, ".moveTo(%s, %s)", x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".moveTo(%s, %s);", x2, y2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number controlX2;
    private Number controlY2;
    private Number endX1;
    private Number endY1;
    private Number var_args2;

    /**
     * Adds specified points to the path, drawing sequentially a quadratic Bezier curve from the current point to the next.
Each curve is defined by 2 points (4 coordinates) – a control point and an endpoint.
     */
    public Path quadraticCurveTo(Number controlX2, Number controlY2, Number endX1, Number endY1, Number var_args2) {
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
            
            js.append(String.format(Locale.US, ".quadraticCurveTo(%s, %s, %s, %s, %s)", controlX2, controlY2, endX1, endY1, var_args2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".quadraticCurveTo(%s, %s, %s, %s, %s);", controlX2, controlY2, endX1, endY1, var_args2));
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
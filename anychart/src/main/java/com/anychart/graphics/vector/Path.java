package com.anychart.graphics.vector;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.graphics.vector.Shape;

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
public class Path extends Shape {

    protected Path() {

    }

    public static Path instantiate() {
        return new Path("new anychart.graphics.vector.path()");
    }

    

    public Path(String jsChart) {
        jsBase = "path" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Combines the current transformation with the given transformation matrix.
     */
    public com.anychart.graphics.vector.Path appendTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

        return this;
    }
    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An ellipse with radius <b>rx, ry</b>, starting from an angle <b>fromAngle</b>, with an angular length <b>extent</b>.<br/>
The positive direction is considered the direction from a positive direction of the X-axis to a positive direction
of the Y-axis, that is clockwise.
     */
    public com.anychart.graphics.vector.Path arcTo(Number rx, Number ry, Number fromAngle, Number extent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".arcTo(%s, %s, %s, %s);", rx, ry, fromAngle, extent));

        return this;
    }
    /**
     * This method is similar to {@link anychart.graphics.vector.Path#arcTo}, but in this case the arc is approximated by Bezier curves.
     */
    public com.anychart.graphics.vector.Path arcToAsCurves(Number rx, Number ry, Number fromAngle, Number extent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".arcToAsCurves(%s, %s, %s, %s);", rx, ry, fromAngle, extent));

        return this;
    }
    /**
     * Adds a command to the path that draws an arc of an ellipse.<br/>
An arc of an ellipse with radius <b>rx, ry</b> <b>rx, ry</b> from the current point to a point <b>x, y</b>.<br/>
The <b>largeArc</b> and <b>clockwiseArc</b> flags define which of the 4 possible arcs is drawn.<br/>
Read more at {@link https://www.w3.org/TR/SVG/implnote.html#ArcImplementationNotes}
     */
    public com.anychart.graphics.vector.Path arcToByEndPoint(Number x, Number y, Number rx, Number ry, Boolean largeArc, Boolean clockwiseArc) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".arcToByEndPoint(%s, %s, %s, %s, %s, %s);", x, y, rx, ry, largeArc, clockwiseArc));

        return this;
    }
    /**
     * Getter for the attribute.
     */
    public void attr(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".attr(%s);", wrapQuotes(key)));
    }
    /**
     * Setter for the attribute.
     */
    public com.anychart.graphics.vector.Path attr(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".attr(%s, %s);", wrapQuotes(key), wrapQuotes(value)));

        return this;
    }
    /**
     * Adds a command to the path that draws a circular arc.<br/>
An arc with a center in (cx, cy) start angle (from) and end angle (from + sweep),
with clockwise and counterclock drawing option.
     */
    public com.anychart.graphics.vector.Path circularArc(Number cx, Number cy, Number rx, Number ry, Number fromAngle, Number sweep, Boolean lineTo) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".circularArc(%s, %s, %s, %s, %s, %s, %s);", cx, cy, rx, ry, fromAngle, sweep, lineTo));

        return this;
    }
    /**
     * Resets all path operations.
     */
    public com.anychart.graphics.vector.Path clear() {
        APIlib.getInstance().addJSLine(jsBase + ".clear();");

        return this;
    }
    /**
     * Gets the current clipping rectangle.
     */
    public com.anychart.graphics.math.Rect clip() {
        return new com.anychart.graphics.math.Rect(jsBase + ".clip()");
    }
    /**
     * Sets the clipping rectangle.
     */
    public com.anychart.graphics.vector.Path clip(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets the clipping rectangle.
     */
    public com.anychart.graphics.vector.Path clip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Adds a command that closes the path by connecting the last point with the first straight line.
     */
    public com.anychart.graphics.vector.Path close() {
        APIlib.getInstance().addJSLine(jsBase + ".close();");

        return this;
    }
    /**
     * Getter for the current cursor type.
     */
    public void cursor() {
        APIlib.getInstance().addJSLine(jsBase + ".cursor();");
    }
    /**
     * Setter for the cursor type.
     */
    public com.anychart.graphics.vector.Path cursor(com.anychart.graphics.vector.Cursor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cursor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Adds specified points to the path, drawing sequentially a cubic Bezier curve from the current point to the next.<br/>
Each curve is defined by 3 points (6 coordinates) - two control points and an endpoint.
     */
    public com.anychart.graphics.vector.Path curveTo(Number control1X, Number control1Y, Number control2X, Number control2Y, Number endX, Number endY, Number var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".curveTo(%s, %s, %s, %s, %s, %s, %s);", control1X, control1Y, control2X, control2Y, endX, endY, var_args));

        return this;
    }
    /**
     * Getter for the element description value.
     */
    public void desc() {
        APIlib.getInstance().addJSLine(jsBase + ".desc();");
    }
    /**
     * Setter for the element description value.
     */
    public com.anychart.graphics.vector.Path desc(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Gets the current value of the pointer events.
     */
    public void disablePointerEvents() {
        APIlib.getInstance().addJSLine(jsBase + ".disablePointerEvents();");
    }
    /**
     * Disables the pointer events.
     */
    public com.anychart.graphics.vector.Path disablePointerEvents(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", value));

        return this;
    }
    /**
     * Getter for the current element's vector effect property.
     */
    public void disableStrokeScaling() {
        APIlib.getInstance().addJSLine(jsBase + ".disableStrokeScaling();");
    }
    /**
     * Setter for the element's vector effect property.<br/>
Learn more by <a href="https://www.w3.org/TR/2004/WD-SVG12-20041027/vectoreffects.html#vector-effect-prop">link</a>.
     */
    public com.anychart.graphics.vector.Path disableStrokeScaling(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disableStrokeScaling(%s);", value));

        return this;
    }
    /**
     * Disposes element completely.
Removes it from the parent layer, sets links to null, removes it from DOM.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Returns DOM element if element is rendered.<br/>
In case of Stage in Suspended state or unbound element - null is returned.
     */
    public void domElement() {
        APIlib.getInstance().addJSLine(jsBase + ".domElement();");
    }
    /**
     * Returns the current state flag.
     */
    public void drag() {
        APIlib.getInstance().addJSLine(jsBase + ".drag();");
    }
    /**
     * Turns off/on dragging (moving) of an element.
     */
    public com.anychart.graphics.vector.Path drag(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", value));

        return this;
    }
    /**
     * Turns off/on dragging (moving) of an element.
     */
    public com.anychart.graphics.vector.Path drag(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Gets the current fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Sets a fill as an object or a string.<br/>
     */
    public com.anychart.graphics.vector.Path fill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Sets a fill with opacity.<br/>
     */
    public com.anychart.graphics.vector.Path fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
     */
    public com.anychart.graphics.vector.Path fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Gets element bounds in absolute coordinates (root element coordinate system).
     */
    public com.anychart.graphics.math.Rect getAbsoluteBounds() {
        return new com.anychart.graphics.math.Rect(jsBase + ".getAbsoluteBounds()");
    }
    /**
     * Returns height within root bounds.<br/>
See illustrations at {@link anychart.graphics.vector.Element#getAbsoluteWidth}
     */
    public void getAbsoluteHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".getAbsoluteHeight();");
    }
    /**
     * Returns width within root bounds.
     */
    public void getAbsoluteWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".getAbsoluteWidth();");
    }
    /**
     * Returns an absolute X (root element coordinate system).
     */
    public void getAbsoluteX() {
        APIlib.getInstance().addJSLine(jsBase + ".getAbsoluteX();");
    }
    /**
     * Returns an absolute Y (root element coordinate system).
     */
    public void getAbsoluteY() {
        APIlib.getInstance().addJSLine(jsBase + ".getAbsoluteY();");
    }
    /**
     * Returns the bounds.
     */
    public com.anychart.graphics.math.Rect getBounds() {
        return new com.anychart.graphics.math.Rect(jsBase + ".getBounds()");
    }
    /**
     * Returns the last coordinates added to the path.
     */
    public com.anychart.graphics.math.Coordinate getCurrentPoint() {
        return new com.anychart.graphics.math.Coordinate(jsBase + ".getCurrentPoint()");
    }
    /**
     * Returns the height.
     */
    public void getHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".getHeight();");
    }
    /**
     * Gets path length.
     */
    public void getLength() {
        APIlib.getInstance().addJSLine(jsBase + ".getLength();");
    }
    /**
     * Returns the current rotation angle in degrees.
     */
    public void getRotationAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".getRotationAngle();");
    }
    /**
     * Stage object (to which the given element is bound).
     */
    public com.anychart.graphics.vector.Stage getStage() {
        return new com.anychart.graphics.vector.Stage(jsBase + ".getStage()");
    }
    /**
     * Returns the current transformation matrix.
     */
    public void getTransformationMatrix() {
        APIlib.getInstance().addJSLine(jsBase + ".getTransformationMatrix();");
    }
    /**
     * Returns the width.
     */
    public void getWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".getWidth();");
    }
    /**
     * Returns X in the coordinate system of the parent.
     */
    public void getX() {
        APIlib.getInstance().addJSLine(jsBase + ".getX();");
    }
    /**
     * Returns Y in the coordinate system of the parent.
     */
    public void getY() {
        APIlib.getInstance().addJSLine(jsBase + ".getY();");
    }
    /**
     * Whether parent element is set.
     */
    public void hasParent() {
        APIlib.getInstance().addJSLine(jsBase + ".hasParent();");
    }
    /**
     * Gets the current element identifier.
     */
    public void id() {
        APIlib.getInstance().addJSLine(jsBase + ".id();");
    }
    /**
     * Sets the element identifier.
     */
    public com.anychart.graphics.vector.Path id(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Adds specified points to the current path, drawing sequentially a straight line through the specified coordinates.
     */
    public com.anychart.graphics.vector.Path lineTo(Number x, Number y, Number var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineTo(%s, %s, %s);", x, y, var_args));

        return this;
    }
    /**
     * Moves path cursor position to a specified coordinate.</br>
Remember that if you call the <b>moveTo</b> method a few times in a row, only the last call will be applied.
     */
    public com.anychart.graphics.vector.Path moveTo(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".moveTo(%s, %s);", x, y));

        return this;
    }
    /**
     * Returns the parent layer.
     */
    public com.anychart.graphics.vector.Layer parent() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".parent()");
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.Path parent(com.anychart.graphics.vector.Layer parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.Path parent(com.anychart.graphics.vector.Stage parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Adds specified points to the path, drawing sequentially a quadratic Bezier curve from the current point to the next.
Each curve is defined by 2 points (4 coordinates) - a control point and an endpoint.
     */
    public com.anychart.graphics.vector.Path quadraticCurveTo(Number controlX, Number controlY, Number endX, Number endY, Number var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".quadraticCurveTo(%s, %s, %s, %s, %s);", controlX, controlY, endX, endY, var_args));

        return this;
    }
    /**
     * Current element removes itself from the parent layer.
     */
    public com.anychart.graphics.vector.Path remove() {
        APIlib.getInstance().addJSLine(jsBase + ".remove();");

        return this;
    }
    /**
     * Removes all listeners from this listenable.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Rotates a shape around the given rotation point.
     */
    public com.anychart.graphics.vector.Path rotate(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotate(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Path rotateByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Path rotateByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Scales a shape. Scaling center is set in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.Path scale(Number sx, Number sy, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s, %s, %s, %s);", sx, sy, cx, cy));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.Path scaleByAnchor(Number sx, Number sy, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.Path scaleByAnchor(Number sx, Number sy, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets top left corner of a shape (transformation taken into account) in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.Path setPosition(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setPosition(%s, %s);", x, y));

        return this;
    }
    /**
     * Rotates a shape around the given point.
     */
    public com.anychart.graphics.vector.Path setRotation(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotation(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Path setRotationByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Path setRotationByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets the transformation matrix.
     */
    public com.anychart.graphics.vector.Path setTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

        return this;
    }
    /**
     * Gets the current stroke.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Sets a stroke using one parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets a stroke using one parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.ColoredFill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets a stroke using one parameter.
     */
    public com.anychart.graphics.vector.Path stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Sets stroke settings using several parameter.
     */
    public com.anychart.graphics.vector.Path stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Gets the current stroke thickness.
     */
    public void strokeThickness() {
        APIlib.getInstance().addJSLine(jsBase + ".strokeThickness();");
    }
    /**
     * Sets a stroke thickness.
     */
    public com.anychart.graphics.vector.Path strokeThickness(Number thickness) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".strokeThickness(%s);", thickness));

        return this;
    }
    /**
     * Getter for the element title value.
     */
    public void title() {
        APIlib.getInstance().addJSLine(jsBase + ".title();");
    }
    /**
     * Setter for the element title value.
     */
    public com.anychart.graphics.vector.Path title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Moves a shape taking an account the current transformation.
     */
    public com.anychart.graphics.vector.Path translate(Number tx, Number ty) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".translate(%s, %s);", tx, ty));

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Gets the current visibility flag.
     */
    public void visible() {
        APIlib.getInstance().addJSLine(jsBase + ".visible();");
    }
    /**
     * Hides or shows an element.
     */
    public com.anychart.graphics.vector.Path visible(Boolean isVisible) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".visible(%s);", isVisible));

        return this;
    }
    /**
     * Gets the current element's zIndex.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Sets the element's zIndex.
     */
    public com.anychart.graphics.vector.Path zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * 
     */
    public com.anychart.graphics.vector.Path fill(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(value)));

        return this;
    }

}
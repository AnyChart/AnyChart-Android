package com.anychart.graphics.vector;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * <b>Abstract</b> class for all vector elements, such as groups and primitives.<br/>
Due to the fact that this class is a child of from goog.events.EventTarget
all its childs can work with events.<br/>
<b>Never call a constructor directly!</b>
 */
public class Element extends JsObject {

    protected Element() {

    }

    public static Element instantiate() {
        return new Element("new anychart.graphics.vector.element()");
    }

    

    public Element(String jsChart) {
        jsBase = "element" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Combines the current transformation with the given transformation matrix.
     */
    public com.anychart.graphics.vector.Element appendTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

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
    public com.anychart.graphics.vector.Element attr(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".attr(%s, %s);", wrapQuotes(key), wrapQuotes(value)));

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
    public com.anychart.graphics.vector.Element clip(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets the clipping rectangle.
     */
    public com.anychart.graphics.vector.Element clip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", wrapQuotes(value)));

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
    public com.anychart.graphics.vector.Element cursor(com.anychart.graphics.vector.Cursor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cursor(%s);", (value != null) ? value.getJsBase() : null));

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
    public com.anychart.graphics.vector.Element desc(String value) {
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
    public com.anychart.graphics.vector.Element disablePointerEvents(Boolean value) {
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
    public com.anychart.graphics.vector.Element disableStrokeScaling(Boolean value) {
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
    public com.anychart.graphics.vector.Element drag(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", value));

        return this;
    }
    /**
     * Turns off/on dragging (moving) of an element.
     */
    public com.anychart.graphics.vector.Element drag(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", (value != null) ? value.getJsBase() : null));

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
     * Returns the height.
     */
    public void getHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".getHeight();");
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
    public com.anychart.graphics.vector.Element id(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));

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
    public com.anychart.graphics.vector.Element parent(com.anychart.graphics.vector.Layer parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.Element parent(com.anychart.graphics.vector.Stage parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Current element removes itself from the parent layer.
     */
    public com.anychart.graphics.vector.Element remove() {
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
    public com.anychart.graphics.vector.Element rotate(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotate(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Element rotateByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Element rotateByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Scales a shape. Scaling center is set in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.Element scale(Number sx, Number sy, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s, %s, %s, %s);", sx, sy, cx, cy));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.Element scaleByAnchor(Number sx, Number sy, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.Element scaleByAnchor(Number sx, Number sy, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets top left corner of a shape (transformation taken into account) in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.Element setPosition(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setPosition(%s, %s);", x, y));

        return this;
    }
    /**
     * Rotates a shape around the given point.
     */
    public com.anychart.graphics.vector.Element setRotation(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotation(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Element setRotationByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.Element setRotationByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets the transformation matrix.
     */
    public com.anychart.graphics.vector.Element setTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

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
    public com.anychart.graphics.vector.Element title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Moves a shape taking an account the current transformation.
     */
    public com.anychart.graphics.vector.Element translate(Number tx, Number ty) {
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
     * Removes an event listener which was added with listen() by the key returned by listen().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
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
    public com.anychart.graphics.vector.Element visible(Boolean isVisible) {
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
    public com.anychart.graphics.vector.Element zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}
package com.anychart.graphics.vector;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.graphics.vector.PatternFill;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * HatchFill is a special pattern fill with predefined set of a primitives. Sets of a primitives does numbered and
declared in {@link anychart.graphics.vector.HatchFill.HatchFillType} enum. Hatch fill properties will be applied to his
children (sets of a primitives). HatchFill is a immutable fill, therefore after rendering his a properties
can not be changed.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#hatchFill} or
{@link anychart.graphics#hatchFill}.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#hatchFill},<br/>
{@link anychart.graphics#hatchFill}.
 */
public class HatchFill extends PatternFill {

    protected HatchFill() {

    }

    public static HatchFill instantiate() {
        return new HatchFill("new anychart.graphics.vector.hatchFill()");
    }

    

    public HatchFill(String jsChart) {
        jsBase = "hatchFill" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Add element to a layer, to the top (maximal index).<br/>
All DOM changes will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}. <br/>
<i>Simplified version of {@link anychart.graphics.vector.Layer#addChildAt} where element is added to the end.</i>
     */
    public com.anychart.graphics.vector.HatchFill addChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChild(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Adds an element to a layer by index. <br/>
<b>Note:</b> the greater index is - the 'higher' element is in a layer top element overlaps bottom elements.<br/>
All DOM changes will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}.<br/>
Left image shows sequential calls of {@link anychart.graphics.vector.Layer#addChild}<br/>
Right image does the same, but star is added to 0 index.<br/>
<code>.addChildAt(star5, 0);</code> (see code of this image in samples).<br/>
<img src='/si/8.4.0/anychart.graphics.vector.Layer.addChildAt.png' width='276' height='130'/>
     */
    public com.anychart.graphics.vector.HatchFill addChildAt(com.anychart.graphics.vector.Element element, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", (element != null) ? element.getJsBase() : null, index));

        return this;
    }
    /**
     * Combines the current transformation with the given transformation matrix.
     */
    public com.anychart.graphics.vector.HatchFill appendTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
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
    public com.anychart.graphics.vector.HatchFill attr(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".attr(%s, %s);", wrapQuotes(key), wrapQuotes(value)));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Circle} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.<br/>
Read more at {@link anychart.graphics.vector.Circle}
     */
    public com.anychart.graphics.vector.Circle circle(Number cx, Number cy, Number radius) {
        return new com.anychart.graphics.vector.Circle(String.format(Locale.US, jsBase + ".circle(%s, %s, %s)", cx, cy, radius));
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
    public com.anychart.graphics.vector.HatchFill clip(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets the clipping rectangle.
     */
    public com.anychart.graphics.vector.HatchFill clip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Draws a cross set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#cross}
     */
    public void cross() {
        APIlib.getInstance().addJSLine(jsBase + ".cross();");
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
    public com.anychart.graphics.vector.HatchFill cursor(com.anychart.graphics.vector.Cursor value) {
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
    public com.anychart.graphics.vector.HatchFill desc(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Draws a diagonal cross set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#diagonalCross}
     */
    public void diagonalCross() {
        APIlib.getInstance().addJSLine(jsBase + ".diagonalCross();");
    }
    /**
     * Draws a diamond set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#diamond}
     */
    public void diamond() {
        APIlib.getInstance().addJSLine(jsBase + ".diamond();");
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
    public com.anychart.graphics.vector.HatchFill disablePointerEvents(Boolean value) {
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
    public com.anychart.graphics.vector.HatchFill disableStrokeScaling(Boolean value) {
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
     * Draws sector as donut chart element.<br/>
Read more at {@link anychart.graphics.vector.primitives#donut}
     */
    public void donut() {
        APIlib.getInstance().addJSLine(jsBase + ".donut();");
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
    public com.anychart.graphics.vector.HatchFill drag(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", value));

        return this;
    }
    /**
     * Turns off/on dragging (moving) of an element.
     */
    public com.anychart.graphics.vector.HatchFill drag(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Ellipse} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.<br/>
Read more at {@link anychart.graphics.vector.Ellipse}
     */
    public com.anychart.graphics.vector.Ellipse ellipse(Number cx, Number cy, Number rx, Number ry) {
        return new com.anychart.graphics.vector.Ellipse(String.format(Locale.US, jsBase + ".ellipse(%s, %s, %s, %s)", cx, cy, rx, ry));
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
     * Returns element by index.
     */
    public com.anychart.graphics.vector.HatchFill getChildAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getChildAt(%s);", index));

        return this;
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
     * Draws a thick horizontal line set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#hLine}
     */
    public void hLine() {
        APIlib.getInstance().addJSLine(jsBase + ".hLine();");
    }
    /**
     * Checks if there is such element in children set.
     */
    public void hasChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hasChild(%s);", (element != null) ? element.getJsBase() : null));
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
    public com.anychart.graphics.vector.HatchFill id(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Image} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You need to take care of used objects yourself.
     */
    public com.anychart.graphics.vector.Image image(String src, Number x, Number y, Number width, Number height) {
        return new com.anychart.graphics.vector.Image(String.format(Locale.US, jsBase + ".image(%s, %s, %s, %s, %s)", wrapQuotes(src), x, y, width, height));
    }
    /**
     * Looks for an element in a layer and returns index or -1, if not found.
     */
    public void indexOfChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (element != null) ? element.getJsBase() : null));
    }
    /**
     * Invokes {@link anychart.graphics.vector.Layer} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.
     */
    public com.anychart.graphics.vector.HatchFill layer() {
        APIlib.getInstance().addJSLine(jsBase + ".layer();");

        return this;
    }
    /**
     * Returns the number of children.
     */
    public void numChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".numChildren();");
    }
    /**
     * Returns the parent layer.
     */
    public com.anychart.graphics.vector.HatchFill parent() {
        APIlib.getInstance().addJSLine(jsBase + ".parent();");

        return this;
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.HatchFill parent(com.anychart.graphics.vector.Layer parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.HatchFill parent(com.anychart.graphics.vector.Stage parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Path} class constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Layer does nothing to delete an object after it is used.
You have to take care of used objects yourself.<br/>
Read more at: {@link anychart.graphics.vector.Path}
     */
    public com.anychart.graphics.vector.Path path() {
        return new com.anychart.graphics.vector.Path(jsBase + ".path()");
    }
    /**
     * Draws sector as pie chart element.<br/>
Read more at {@link anychart.graphics.vector.primitives#pie}
     */
    public void pie() {
        APIlib.getInstance().addJSLine(jsBase + ".pie();");
    }
    /**
     * Invokes {@link anychart.graphics.vector.Rect} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.
     */
    public com.anychart.graphics.vector.Rect rect(Number x, Number y, Number width, Number height) {
        return new com.anychart.graphics.vector.Rect(String.format(Locale.US, jsBase + ".rect(%s, %s, %s, %s)", x, y, width, height));
    }
    /**
     * Current element removes itself from the parent layer.
     */
    public com.anychart.graphics.vector.HatchFill remove() {
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
     * Removes element from a layer.<br/>
All changes in DOM will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}. <br/>
<b>Note:</b> this method doesn't remove element, it just breaks the link between the element and the layer.<br/>
<i>This is an extension of {@link anychart.graphics.vector.Layer#removeChildAt} method.</i>
     */
    public com.anychart.graphics.vector.HatchFill removeChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeChild(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Removes element from a layer by index.<br/>
All changes in DOM will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}.<br/>
<b>Note:</b> this method doesn't remove element, it just breaks the link between the element and the layer.<br/>
     */
    public com.anychart.graphics.vector.HatchFill removeChildAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeChildAt(%s);", index));

        return this;
    }
    /**
     * Removes all children from a layer.
     */
    public void removeChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".removeChildren();");
    }
    /**
     * Rotates a shape around the given rotation point.
     */
    public com.anychart.graphics.vector.HatchFill rotate(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotate(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.HatchFill rotateByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.HatchFill rotateByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Draws rectangle with corners rounded inside.<br/>
Read more at {@link anychart.graphics.vector.primitives#roundedInnerRect}
     */
    public void roundedInnerRect() {
        APIlib.getInstance().addJSLine(jsBase + ".roundedInnerRect();");
    }
    /**
     * Draws rectangle with rounded corners.<br/>
Read more at {@link anychart.graphics.vector.primitives#roundedRect}
     */
    public void roundedRect() {
        APIlib.getInstance().addJSLine(jsBase + ".roundedRect();");
    }
    /**
     * Scales a shape. Scaling center is set in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.HatchFill scale(Number sx, Number sy, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s, %s, %s, %s);", sx, sy, cx, cy));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.HatchFill scaleByAnchor(Number sx, Number sy, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.HatchFill scaleByAnchor(Number sx, Number sy, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets top left corner of a shape (transformation taken into account) in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.HatchFill setPosition(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setPosition(%s, %s);", x, y));

        return this;
    }
    /**
     * Rotates a shape around the given point.
     */
    public com.anychart.graphics.vector.HatchFill setRotation(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotation(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.HatchFill setRotationByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.HatchFill setRotationByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets the transformation matrix.
     */
    public com.anychart.graphics.vector.HatchFill setTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

        return this;
    }
    /**
     * Draws multi-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star}
     */
    public void star() {
        APIlib.getInstance().addJSLine(jsBase + ".star();");
    }
    /**
     * Draws ten-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star10}
     */
    public void star10() {
        APIlib.getInstance().addJSLine(jsBase + ".star10();");
    }
    /**
     * Draws four-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star4}
     */
    public void star4() {
        APIlib.getInstance().addJSLine(jsBase + ".star4();");
    }
    /**
     * Draws five-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star5}
     */
    public void star5() {
        APIlib.getInstance().addJSLine(jsBase + ".star5();");
    }
    /**
     * Draws six-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star6}
     */
    public void star6() {
        APIlib.getInstance().addJSLine(jsBase + ".star6();");
    }
    /**
     * Draws seven-pointed star.<br/>
Read more at {@link anychart.graphics.vector.primitives#star7}
     */
    public void star7() {
        APIlib.getInstance().addJSLine(jsBase + ".star7();");
    }
    /**
     * Swaps children.
     */
    public com.anychart.graphics.vector.HatchFill swapChildren(com.anychart.graphics.vector.Element element1, com.anychart.graphics.vector.Element element2) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".swapChildren(%s, %s);", (element1 != null) ? element1.getJsBase() : null, (element2 != null) ? element2.getJsBase() : null));

        return this;
    }
    /**
     * Swaps children by indexes.
     */
    public com.anychart.graphics.vector.HatchFill swapChildrenAt(Number index1, Number index2) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".swapChildrenAt(%s, %s);", index1, index2));

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
    public com.anychart.graphics.vector.HatchFill title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Moves a shape taking an account the current transformation.
     */
    public com.anychart.graphics.vector.HatchFill translate(Number tx, Number ty) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".translate(%s, %s);", tx, ty));

        return this;
    }
    /**
     * Draws a triangle heading downwards set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleDown}
     */
    public void triangleDown() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleDown();");
    }
    /**
     * Draws a triangle heading leftwards set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleLeft}
     */
    public void triangleLeft() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleLeft();");
    }
    /**
     * Draws a triangle heading rightwards set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleRight}
     */
    public void triangleRight() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleRight();");
    }
    /**
     * Draws a triangle heading upwards set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleUp}
     */
    public void triangleUp() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleUp();");
    }
    /**
     * Draws rectangle with cut corners.<br/>
Read more at {@link anychart.graphics.vector.primitives#truncatedRect}
     */
    public void truncatedRect() {
        APIlib.getInstance().addJSLine(jsBase + ".truncatedRect();");
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
     * Draws a thick vertical line set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#vLine}
     */
    public void vLine() {
        APIlib.getInstance().addJSLine(jsBase + ".vLine();");
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
    public com.anychart.graphics.vector.HatchFill visible(Boolean isVisible) {
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
    public com.anychart.graphics.vector.HatchFill zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}
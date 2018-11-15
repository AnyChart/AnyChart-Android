package com.anychart.graphics.vector.vml;

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
 * A class for text formatting.<br/> Processes plain text and HTML text.<br/>
Plain text is set using the <b>setText</b> method {@link anychart.graphics.vector.Text#text}.
HTML text is set using the <b>setHtml</b> method {@link anychart.graphics.vector.Text#htmlText}.
A text style is set using the <b>setStyle</b> method {@link anychart.graphics.vector.Text#style}.
 */
public class Text extends JsObject {

    protected Text() {

    }

    public static Text instantiate() {
        return new Text("new anychart.graphics.vector.vml.text()");
    }

    

    public Text(String jsChart) {
        jsBase = "text" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Combines the current transformation with the given transformation matrix.
     */
    public com.anychart.graphics.vector.vml.Text appendTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
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
    public com.anychart.graphics.vector.vml.Text attr(String key, String value) {
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
    public com.anychart.graphics.vector.vml.Text clip(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Sets the clipping rectangle.
     */
    public com.anychart.graphics.vector.vml.Text clip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text color.
     */
    public void color() {
        APIlib.getInstance().addJSLine(jsBase + ".color();");
    }
    /**
     * Setter for the text color.
     */
    public com.anychart.graphics.vector.vml.Text color(String color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".color(%s);", wrapQuotes(color)));

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
    public com.anychart.graphics.vector.vml.Text cursor(com.anychart.graphics.vector.Cursor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cursor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the text decoration.
     */
    public void decoration() {
        APIlib.getInstance().addJSLine(jsBase + ".decoration();");
    }
    /**
     * Setter for text decoration.
     */
    public com.anychart.graphics.vector.vml.Text decoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".decoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text decoration.
     */
    public com.anychart.graphics.vector.vml.Text decoration(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".decoration(%s);", wrapQuotes(value)));

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
    public com.anychart.graphics.vector.vml.Text desc(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text direction.
     */
    public void direction() {
        APIlib.getInstance().addJSLine(jsBase + ".direction();");
    }
    /**
     * Setter for text direction.
     */
    public com.anychart.graphics.vector.vml.Text direction(com.anychart.graphics.vector.text.Direction direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", (direction != null) ? direction.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text direction.
     */
    public com.anychart.graphics.vector.vml.Text direction(String direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", wrapQuotes(direction)));

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
    public com.anychart.graphics.vector.vml.Text disablePointerEvents(Boolean value) {
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
    public com.anychart.graphics.vector.vml.Text disableStrokeScaling(Boolean value) {
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
    public com.anychart.graphics.vector.vml.Text drag(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", value));

        return this;
    }
    /**
     * Turns off/on dragging (moving) of an element.
     */
    public com.anychart.graphics.vector.vml.Text drag(com.anychart.graphics.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the font family of text.
     */
    public void fontFamily() {
        APIlib.getInstance().addJSLine(jsBase + ".fontFamily();");
    }
    /**
     * Setter for font family of text.
     */
    public com.anychart.graphics.vector.vml.Text fontFamily(String family) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(family)));

        return this;
    }
    /**
     * Getter for the font size of text.
     */
    public void fontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".fontSize();");
    }
    /**
     * Setter for font size of text.
     */
    public com.anychart.graphics.vector.vml.Text fontSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(size)));

        return this;
    }
    /**
     * Setter for font size of text.
     */
    public com.anychart.graphics.vector.vml.Text fontSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", size));

        return this;
    }
    /**
     * Getter for the font style of text.
     */
    public void fontStyle() {
        APIlib.getInstance().addJSLine(jsBase + ".fontStyle();");
    }
    /**
     * Setter for font style of text.
     */
    public com.anychart.graphics.vector.vml.Text fontStyle(com.anychart.graphics.vector.text.FontStyle style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (style != null) ? style.getJsBase() : null));

        return this;
    }
    /**
     * Setter for font style of text.
     */
    public com.anychart.graphics.vector.vml.Text fontStyle(String style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(style)));

        return this;
    }
    /**
     * Getter for the font variant of text.
     */
    public void fontVariant() {
        APIlib.getInstance().addJSLine(jsBase + ".fontVariant();");
    }
    /**
     * Setter for font variant of text.
     */
    public com.anychart.graphics.vector.vml.Text fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for font variant of text.
     */
    public com.anychart.graphics.vector.vml.Text fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font weight of text.
     */
    public void fontWeight() {
        APIlib.getInstance().addJSLine(jsBase + ".fontWeight();");
    }
    /**
     * Setter for font weight of text.
     */
    public com.anychart.graphics.vector.vml.Text fontWeight(String weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(weight)));

        return this;
    }
    /**
     * Setter for font weight of text.
     */
    public com.anychart.graphics.vector.vml.Text fontWeight(Number weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", weight));

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
     * Getter for the horizontal align of text.
     */
    public void hAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".hAlign();");
    }
    /**
     * Setter for horizontal align of text.
     */
    public com.anychart.graphics.vector.vml.Text hAlign(com.anychart.graphics.vector.text.HAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (align != null) ? align.getJsBase() : null));

        return this;
    }
    /**
     * Setter for horizontal align of text.
     */
    public com.anychart.graphics.vector.vml.Text hAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Whether parent element is set.
     */
    public void hasParent() {
        APIlib.getInstance().addJSLine(jsBase + ".hasParent();");
    }
    /**
     * Gets the current height.<br/>
<b>Note:</b> it is not calculated automatically and has no default, and if it was not set using setter - <b>NaN</b> is returned.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Sets a height.
     */
    public com.anychart.graphics.vector.vml.Text height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Sets a height.
     */
    public com.anychart.graphics.vector.vml.Text height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the HTML format.
     */
    public void htmlText() {
        APIlib.getInstance().addJSLine(jsBase + ".htmlText();");
    }
    /**
     * Setter for the HTML format.
     */
    public com.anychart.graphics.vector.vml.Text htmlText(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".htmlText(%s);", wrapQuotes(value)));

        return this;
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
    public com.anychart.graphics.vector.vml.Text id(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Getter for the letter spacing of text.
     */
    public void letterSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".letterSpacing();");
    }
    /**
     * Setter for letter spacing of text.
     */
    public com.anychart.graphics.vector.vml.Text letterSpacing(String spacing) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", wrapQuotes(spacing)));

        return this;
    }
    /**
     * Setter for letter spacing of text.
     */
    public com.anychart.graphics.vector.vml.Text letterSpacing(Number spacing) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", spacing));

        return this;
    }
    /**
     * Getter for the line height of text.
     */
    public void lineHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".lineHeight();");
    }
    /**
     * Sets line height, either as ratio or in pixels.
     */
    public com.anychart.graphics.vector.vml.Text lineHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Sets line height, either as ratio or in pixels.
     */
    public com.anychart.graphics.vector.vml.Text lineHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", height));

        return this;
    }
    /**
     * Getter for the text opacity.
     */
    public void opacity() {
        APIlib.getInstance().addJSLine(jsBase + ".opacity();");
    }
    /**
     * Setter for text opacity.
     */
    public com.anychart.graphics.vector.vml.Text opacity(Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".opacity(%s);", opacity));

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
    public com.anychart.graphics.vector.vml.Text parent(com.anychart.graphics.vector.Layer parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Adds element to the given layer.
     */
    public com.anychart.graphics.vector.vml.Text parent(com.anychart.graphics.vector.Stage parent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.getJsBase() : null));

        return this;
    }
    /**
     * Current element removes itself from the parent layer.
     */
    public com.anychart.graphics.vector.vml.Text remove() {
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
    public com.anychart.graphics.vector.vml.Text rotate(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotate(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.vml.Text rotateByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.vml.Text rotateByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Scales a shape. Scaling center is set in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.vml.Text scale(Number sx, Number sy, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s, %s, %s, %s);", sx, sy, cx, cy));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.vml.Text scaleByAnchor(Number sx, Number sy, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public com.anychart.graphics.vector.vml.Text scaleByAnchor(Number sx, Number sy, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Getter for the text selectable property.
     */
    public void selectable() {
        APIlib.getInstance().addJSLine(jsBase + ".selectable();");
    }
    /**
     * Setter for the text selectable property.<br/>
Defines whether text can be selected. If <b>false</b> - no selection.
     */
    public com.anychart.graphics.vector.vml.Text selectable(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", enabled));

        return this;
    }
    /**
     * Sets top left corner of a shape (transformation taken into account) in the coordinate system of the parent.
     */
    public com.anychart.graphics.vector.vml.Text setPosition(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setPosition(%s, %s);", x, y));

        return this;
    }
    /**
     * Rotates a shape around the given point.
     */
    public com.anychart.graphics.vector.vml.Text setRotation(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotation(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.vml.Text setRotationByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates a shape around the given anchor.
     */
    public com.anychart.graphics.vector.vml.Text setRotationByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets the transformation matrix.
     */
    public com.anychart.graphics.vector.vml.Text setTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

        return this;
    }
    /**
     * Getter for the current text style.
     */
    public void style() {
        APIlib.getInstance().addJSLine(jsBase + ".style();");
    }
    /**
     * Getter for the text.
     */
    public void text() {
        APIlib.getInstance().addJSLine(jsBase + ".text();");
    }
    /**
     * Setter for the text.
     */
    public com.anychart.graphics.vector.vml.Text text(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".text(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Getter for the text indent.
     */
    public void textIndent() {
        APIlib.getInstance().addJSLine(jsBase + ".textIndent();");
    }
    /**
     * Setter for text indent.<br/>
The text-indent property specifies the indentation of the first line in a text-block.
     */
    public com.anychart.graphics.vector.vml.Text textIndent(Number indent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", indent));

        return this;
    }
    /**
     * Getter for the text overflow mode.
     */
    public void textOverflow() {
        APIlib.getInstance().addJSLine(jsBase + ".textOverflow();");
    }
    /**
     * Setter for the text overflow mode.
     */
    public com.anychart.graphics.vector.vml.Text textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text overflow mode.
     */
    public com.anychart.graphics.vector.vml.Text textOverflow(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(value)));

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
    public com.anychart.graphics.vector.vml.Text title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Moves a shape taking an account the current transformation.
     */
    public com.anychart.graphics.vector.vml.Text translate(Number tx, Number ty) {
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
     * Getter for the vertical align of text.
     */
    public void vAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".vAlign();");
    }
    /**
     * Setter for vertical align of text.
     */
    public com.anychart.graphics.vector.vml.Text vAlign(com.anychart.graphics.vector.text.VAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (align != null) ? align.getJsBase() : null));

        return this;
    }
    /**
     * Setter for vertical align of text.
     */
    public com.anychart.graphics.vector.vml.Text vAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(align)));

        return this;
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
    public com.anychart.graphics.vector.vml.Text visible(Boolean isVisible) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".visible(%s);", isVisible));

        return this;
    }
    /**
     * Gets the current width.<br/>
<b>Note:</b> it is not calculated automatically and has no default, and if it  was not set using setter - <b>NaN</b> is returned.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Sets a width.
     */
    public com.anychart.graphics.vector.vml.Text width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

        return this;
    }
    /**
     * Sets a width.
     */
    public com.anychart.graphics.vector.vml.Text width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Getter for word break of text.
More at: <a href='https://www.w3schools.com/cssref/css3_pr_word-break.asp'>Word-break Property</a>
     */
    public void wordBreak() {
        APIlib.getInstance().addJSLine(jsBase + ".wordBreak();");
    }
    /**
     * Setter for word break of text.
     */
    public com.anychart.graphics.vector.vml.Text wordBreak(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for word break of text.
     */
    public com.anychart.graphics.vector.vml.Text wordBreak(com.anychart.graphics.vector.text.WordBreak value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for word-wrap of text.
     */
    public void wordWrap() {
        APIlib.getInstance().addJSLine(jsBase + ".wordWrap();");
    }
    /**
     * Setter for word-wrap of text.
More at: <a href='https://www.w3schools.com/cssref/css3_pr_word-wrap.asp'>Word-wrap Property</a>
     */
    public void wordWrap(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(value)));
    }
    /**
     * Setter for word-wrap of text.
More at: <a href='https://www.w3schools.com/cssref/css3_pr_word-wrap.asp'>Word-wrap Property</a>
     */
    public void wordWrap(com.anychart.graphics.vector.text.WordWrap value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (value != null) ? value.getJsBase() : null));
    }
    /**
     * Getter for the X coordinate of text.
     */
    public void x() {
        APIlib.getInstance().addJSLine(jsBase + ".x();");
    }
    /**
     * Setter for X coordinate of text.
     */
    public com.anychart.graphics.vector.vml.Text x(Number xCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".x(%s);", xCoord));

        return this;
    }
    /**
     * Getter for the current Y coordinate of text.
     */
    public void y() {
        APIlib.getInstance().addJSLine(jsBase + ".y();");
    }
    /**
     * Setter for Y coordinate of text.
     */
    public com.anychart.graphics.vector.vml.Text y(Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".y(%s);", yCoord));

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
    public com.anychart.graphics.vector.vml.Text zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Getter for the path element.
     */
    public com.anychart.graphics.vector.Path path() {
        return new com.anychart.graphics.vector.Path(jsBase + ".path()");
    }
    /**
     * Setter for the path element.
     */
    public com.anychart.graphics.vector.vml.Text path(com.anychart.graphics.vector.Path path) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".path(%s);", (path != null) ? path.getJsBase() : null));

        return this;
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}
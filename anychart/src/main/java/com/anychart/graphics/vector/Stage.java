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
 * This class provide tools for cross-browser display with the single interface for both (SVG and VML).<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics#create}.<br/>
<p><b>Note:</b><br/>
{@link anychart.graphics.vector.Stage} delegates all work with DOM elements, style and attributes
to its renderer. You can get renderer using <a href="anychart.graphics.vector.Stage#getRenderer">getRenderer
</a> method.<br/>
<strong>Note:</strong> Renderer is a singleton must not contain own fields.
</p><p>
<b>Rendering:</b><br/>
{@link anychart.graphics.vector.Stage} has the <code>rootLayer_</code> private field of <a href="anychart.graphics.vector.Layer">Layer</a>
type. All layers and elements you add to a stage go there, so rendering and other stuff happens
when this layer is rendered.
</p>
 */
public class Stage extends JsObject {

    protected Stage() {

    }

    public static Stage instantiate() {
        return new Stage("new anychart.graphics.vector.stage()");
    }

    

    public Stage(String jsChart) {
        jsBase = "stage" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds an element.<br/>
Similar to {@link anychart.graphics.vector.Layer#addChild}
     */
    public com.anychart.graphics.vector.Stage addChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChild(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Adds an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#addChildAt}
     */
    public com.anychart.graphics.vector.Stage addChildAt(com.anychart.graphics.vector.Element element, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", (element != null) ? element.getJsBase() : null, index));

        return this;
    }
    /**
     * Combines current transformation with another.<br/>
Combination is done by multiplying matrix to the right.<br/>
Read more at: {@link anychart.graphics.vector.Element#appendTransformationMatrix}.
     */
    public com.anychart.graphics.vector.Stage appendTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%s, %s, %s, %s, %s, %s);", m00, m10, m01, m11, m02, m12));

        return this;
    }
    /**
     * Getter for the current stage rendering mode.
     */
    public void asyncMode() {
        APIlib.getInstance().addJSLine(jsBase + ".asyncMode();");
    }
    /**
     * Setter for the stage rendering mode.
     */
    public com.anychart.graphics.vector.Stage asyncMode(Boolean async) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".asyncMode(%s);", async));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Circle} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.Circle}
     */
    public com.anychart.graphics.vector.Circle circle(Number cx, Number cy, Number radius) {
        return new com.anychart.graphics.vector.Circle(String.format(Locale.US, jsBase + ".circle(%s, %s, %s)", cx, cy, radius));
    }
    /**
     * Gets clip bounds.<br/>
Works only after render() is invoked.<br/>
Read more at: {@link anychart.graphics.vector.Element#clip}.
     */
    public com.anychart.graphics.math.Rect clip() {
        return new com.anychart.graphics.math.Rect(jsBase + ".clip()");
    }
    /**
     * Clips a stage.<br/>
Works only after render() is invoked.<br/>
Read more at: {@link anychart.graphics.vector.Element#clip}.
     */
    public com.anychart.graphics.vector.Stage clip(com.anychart.graphics.math.Rect rect) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (rect != null) ? rect.getJsBase() : null));

        return this;
    }
    /**
     * Returns DOM element where everything is drawn upon rendering.
     */
    public void container() {
        APIlib.getInstance().addJSLine(jsBase + ".container();");
    }
    /**
     * Creates a clip element using single value.
     */
    public com.anychart.graphics.vector.Clip createClip(Number[] rect) {
        return new com.anychart.graphics.vector.Clip(String.format(Locale.US, jsBase + ".createClip(%s)", Arrays.toString(rect)));
    }
    /**
     * Creates a clip element using single value.
     */
    public com.anychart.graphics.vector.Clip createClip(com.anychart.graphics.math.Rect rect) {
        return new com.anychart.graphics.vector.Clip(String.format(Locale.US, jsBase + ".createClip(%s)", (rect != null) ? rect.getJsBase() : null));
    }
    /**
     * Creates a clip element using single value.
     */
    public com.anychart.graphics.vector.Clip createClip(String rect) {
        return new com.anychart.graphics.vector.Clip(String.format(Locale.US, jsBase + ".createClip(%s)", wrapQuotes(rect)));
    }
    /**
     * Creates a clip element using several value.
     */
    public com.anychart.graphics.vector.Clip createClip(Number left, Number top, Number width, Number height) {
        return new com.anychart.graphics.vector.Clip(String.format(Locale.US, jsBase + ".createClip(%s, %s, %s, %s)", left, top, width, height));
    }
    /**
     * Getter for stage credits.
     */
    public com.anychart.core.ui.StageCredits credits() {
        return new com.anychart.core.ui.StageCredits(jsBase + ".credits()");
    }
    /**
     * Setter for stage credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.graphics.vector.Stage credits(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for stage credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.graphics.vector.Stage credits(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", settings));

        return this;
    }
    /**
     * Draws a cross defined by a circumscribed circle.<br/>
Read more at {@link anychart.graphics.vector.primitives#cross}
     */
    public void cross() {
        APIlib.getInstance().addJSLine(jsBase + ".cross();");
    }
    /**
     * 
     */
    public void data(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", arrayToString(data)));
    }
    /**
     * Getter for the element description value.
     */
    public void desc() {
        APIlib.getInstance().addJSLine(jsBase + ".desc();");
    }
    /**
     * Setter for the element desc value.
     */
    public com.anychart.graphics.vector.Stage desc(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Draws a diagonal cross set by it circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#diagonalCross}
     */
    public void diagonalCross() {
        APIlib.getInstance().addJSLine(jsBase + ".diagonalCross();");
    }
    /**
     * Draws a diamond set by it circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#diamond}
     */
    public void diamond() {
        APIlib.getInstance().addJSLine(jsBase + ".diamond();");
    }
    /**
     * Disposes stage.<br/>
Removes it from parent layer, nulls links, removes from DOM.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Returns stage root DOM element.
     */
    public void domElement() {
        APIlib.getInstance().addJSLine(jsBase + ".domElement();");
    }
    /**
     * Draws arc as donut chart element.<br/>
Read more at {@link anychart.graphics.vector.primitives#donut}
     */
    public void donut() {
        APIlib.getInstance().addJSLine(jsBase + ".donut();");
    }
    /**
     * Invokes {@link anychart.graphics.vector.Ellipse} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.Ellipse}
     */
    public com.anychart.graphics.vector.Ellipse ellipse(Number cx, Number cy, Number rx, Number ry) {
        return new com.anychart.graphics.vector.Ellipse(String.format(Locale.US, jsBase + ".ellipse(%s, %s, %s, %s)", cx, cy, rx, ry));
    }
    /**
     * Getter for the fullscreen mode.
     */
    public void fullScreen() {
        APIlib.getInstance().addJSLine(jsBase + ".fullScreen();");
    }
    /**
     * Setter for the fullscreen mode.
     */
    public com.anychart.graphics.vector.Stage fullScreen(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fullScreen(%s);", enabled));

        return this;
    }
    /**
     * Returns bounds.
     */
    public com.anychart.graphics.math.Rect getBounds() {
        return new com.anychart.graphics.math.Rect(jsBase + ".getBounds()");
    }
    /**
     * Returns an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#getChildAt}
     */
    public com.anychart.graphics.vector.Element getChildAt(Number index) {
        return new com.anychart.graphics.vector.Element(String.format(Locale.US, jsBase + ".getChildAt(%s)", index));
    }
    /**
     * Returns stage container element.
     */
    public void getContainerElement() {
        APIlib.getInstance().addJSLine(jsBase + ".getContainerElement();");
    }
    /**
     * Returns a DIV wrapper that contains stage and other utilitarian DOM elements.
     */
    public void getDomWrapper() {
        APIlib.getInstance().addJSLine(jsBase + ".getDomWrapper();");
    }
    /**
     * Returns rotation angle in degrees.<br/>
Read more at: {@link anychart.graphics.vector.Element#getRotationAngle}.
     */
    public void getRotationAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".getRotationAngle();");
    }
    /**
     * Returns self.
     */
    public com.anychart.graphics.vector.Stage getStage() {
        APIlib.getInstance().addJSLine(jsBase + ".getStage();");

        return this;
    }
    /**
     * Returns current transformation matrix: [
{number} m00 Scale X.
{number} m10 Shear Y.
{number} m01 Shear X.
{number} m11 Scale Y.
{number} m02 Translate X.
{number} m12 Translate Y.
]<br/>
Read more at: {@link anychart.graphics.vector.Element#getTransformationMatrix}.
     */
    public void getTransformationMatrix() {
        APIlib.getInstance().addJSLine(jsBase + ".getTransformationMatrix();");
    }
    /**
     * Returns X of top left corner.
     */
    public void getX() {
        APIlib.getInstance().addJSLine(jsBase + ".getX();");
    }
    /**
     * Returns Y of top left corner.
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
     * Checks if there is such element in children set.<br/>
Similar to {@link anychart.graphics.vector.Layer#hasChild}
     */
    public void hasChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hasChild(%s);", (element != null) ? element.getJsBase() : null));
    }
    /**
     * Invokes {@link anychart.graphics.vector.HatchFill} constructor.
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You have to delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.HatchFill}
     */
    public com.anychart.graphics.vector.HatchFill hatchFill(com.anychart.graphics.vector.hatchfill.HatchFillType type, String color, Number thickness, Number size) {
        return new com.anychart.graphics.vector.HatchFill(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s)", (type != null) ? type.getJsBase() : null, wrapQuotes(color), thickness, size));
    }
    /**
     * Getter for the stage height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for a stage height.
     */
    public com.anychart.graphics.vector.Stage height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for a stage height.
     */
    public com.anychart.graphics.vector.Stage height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Getter for the stage identifier.
If it was not set, than it will be generated.
     */
    public void id() {
        APIlib.getInstance().addJSLine(jsBase + ".id();");
    }
    /**
     * Setter for a stage identifier. Instantly applied to the DOM.
     */
    public com.anychart.graphics.vector.Stage id(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Image} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public com.anychart.graphics.vector.Image image(String src, Number x, Number y, Number width, Number height) {
        return new com.anychart.graphics.vector.Image(String.format(Locale.US, jsBase + ".image(%s, %s, %s, %s, %s)", wrapQuotes(src), x, y, width, height));
    }
    /**
     * Returns index of a child.<br/>
Similar to {@link anychart.graphics.vector.Layer#indexOfChild}
     */
    public void indexOfChild(com.anychart.graphics.vector.Element element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (element != null) ? element.getJsBase() : null));
    }
    /**
     * Whether the context menu available in the browser or not.
     */
    public void isFullScreenAvailable() {
        APIlib.getInstance().addJSLine(jsBase + ".isFullScreenAvailable();");
    }
    /**
     * Indicates if stage is in rendering process.
     */
    public void isRendering() {
        APIlib.getInstance().addJSLine(jsBase + ".isRendering();");
    }
    /**
     * Returns rendering state (true - suspended, false - instant).
     */
    public void isSuspended() {
        APIlib.getInstance().addJSLine(jsBase + ".isSuspended();");
    }
    /**
     * Invokes {@link anychart.graphics.vector.Layer} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public com.anychart.graphics.vector.Layer layer() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".layer()");
    }
    /**
     * Getter for max delay.
     */
    public void maxResizeDelay() {
        APIlib.getInstance().addJSLine(jsBase + ".maxResizeDelay();");
    }
    /**
     * Setter for max delay.
     */
    public com.anychart.graphics.vector.Stage maxResizeDelay(Number delay) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxResizeDelay(%s);", delay));

        return this;
    }
    /**
     * A number of stage children.<br/>
Similar to {@link anychart.graphics.vector.Layer#numChildren}
     */
    public void numChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".numChildren();");
    }
    /**
     * Returns self.
     */
    public com.anychart.graphics.vector.Stage parent() {
        APIlib.getInstance().addJSLine(jsBase + ".parent();");

        return this;
    }
    /**
     * Invokes {@link anychart.graphics.vector.Path} constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Stage} doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at Path: {@link anychart.graphics.vector.Path}
     */
    public com.anychart.graphics.vector.Path path() {
        return new com.anychart.graphics.vector.Path(jsBase + ".path()");
    }
    /**
     * Invokes {@link anychart.graphics.vector.PatternFill}.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.PatternFill}
     */
    public com.anychart.graphics.vector.PatternFill pattern(com.anychart.graphics.math.Rect bounds) {
        return new com.anychart.graphics.vector.PatternFill(String.format(Locale.US, jsBase + ".pattern(%s)", (bounds != null) ? bounds.getJsBase() : null));
    }
    /**
     * Draws arc as pie chart element.<br/>
Read more at {@link anychart.graphics.vector.primitives#pie}
     */
    public void pie() {
        APIlib.getInstance().addJSLine(jsBase + ".pie();");
    }
    /**
     * Print stage.
     */
    public void print(String paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrWidth), landscapeOrHeight));
    }
    /**
     * Print stage.
     */
    public void print(String paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrWidth), wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Print stage.
     */
    public void print(Number paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", paperSizeOrWidth, landscapeOrHeight));
    }
    /**
     * Print stage.
     */
    public void print(Number paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", paperSizeOrWidth, wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Invokes {@link anychart.graphics.vector.Rect} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public com.anychart.graphics.vector.Rect rect(Number x, Number y, Number width, Number height) {
        return new com.anychart.graphics.vector.Rect(String.format(Locale.US, jsBase + ".rect(%s, %s, %s, %s)", x, y, width, height));
    }
    /**
     * Removes everything.
     */
    public com.anychart.graphics.vector.Stage remove() {
        APIlib.getInstance().addJSLine(jsBase + ".remove();");

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes an element.<br/>
Similar to {@link anychart.graphics.vector.Layer#removeChild}
     */
    public com.anychart.graphics.vector.Element removeChild(com.anychart.graphics.vector.Element element) {
        return new com.anychart.graphics.vector.Element(String.format(Locale.US, jsBase + ".removeChild(%s)", (element != null) ? element.getJsBase() : null));
    }
    /**
     * Removes an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#removeChildAt}
     */
    public com.anychart.graphics.vector.Element removeChildAt(Number index) {
        return new com.anychart.graphics.vector.Element(String.format(Locale.US, jsBase + ".removeChildAt(%s)", index));
    }
    /**
     * Removes all elements.<br/>
Similar to {@link anychart.graphics.vector.Layer#removeChildren}
     */
    public void removeChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".removeChildren();");
    }
    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".resize(%s, %s);", width, height));
    }
    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".resize(%s, %s);", width, wrapQuotes(height)));
    }
    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".resize(%s, %s);", wrapQuotes(width), height));
    }
    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".resize(%s, %s);", wrapQuotes(width), wrapQuotes(height)));
    }
    /**
     * Removes suspend state and applies all changes in sync (if any).<br/>
Read more at {@link anychart.graphics.vector.Stage#suspend}.
     */
    public com.anychart.graphics.vector.Stage resume(Boolean force) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".resume(%s);", force));

        return this;
    }
    /**
     * Rotates root layer.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotate}.
     */
    public com.anychart.graphics.vector.Stage rotate(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotate(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotateByAnchor}.
     */
    public com.anychart.graphics.vector.Stage rotateByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotateByAnchor}.
     */
    public com.anychart.graphics.vector.Stage rotateByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Saves the current stage as JPG Image.<br/>
For export to image JPG use {@link anychart.graphics#server}.
     */
    public void saveAsJpg(Number width, Number height, Number quality, Boolean forceTransparentWhite, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %s, %s);", width, height, quality, forceTransparentWhite, wrapQuotes(filename)));
    }
    /**
     * Saves the current stage as PDF Document.<br/>
For export to PDF file use {@link anychart.graphics#server}.
     */
    public void saveAsPdf(String paperSize, Boolean landscape, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %s, %s, %s, %s);", wrapQuotes(paperSize), landscape, x, y, wrapQuotes(filename)));
    }
    /**
     * Saves the current stage as PNG Image.<br/>
For export to image PNG use {@link anychart.graphics#server}.
     */
    public void saveAsPng(Number width, Number height, Number quality, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s, %s);", width, height, quality, wrapQuotes(filename)));
    }
    /**
     * Saves the stage as SVG Image.<br/>
For export to SVG use {@link anychart.graphics#server}.
     */
    public void saveAsSvg(String paperSize, Boolean landscape, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s, %s);", wrapQuotes(paperSize), landscape, wrapQuotes(filename)));
    }
    /**
     * Saves the stage as SVG Image using width and height.<br/>
For export to SVG use {@link anychart.graphics#server}.
     */
    public void saveAsSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s);", width, height));
    }
    /**
     * Scales root layer in parent coordinates system. Scaling center is set in the parent system too.<br/>
Read more at: {@link anychart.graphics.vector.Element#scale}.
     */
    public com.anychart.graphics.vector.Stage scale(Number sx, Number sy, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s, %s, %s, %s);", sx, sy, cx, cy));

        return this;
    }
    /**
     * Scales root layer in parent coordinates system. Scaling center is set by root layer anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#scaleByAnchor}.
     */
    public com.anychart.graphics.vector.Stage scaleByAnchor(Number sx, Number sy, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Scales root layer in parent coordinates system. Scaling center is set by root layer anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#scaleByAnchor}.
     */
    public com.anychart.graphics.vector.Stage scaleByAnchor(Number sx, Number sy, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %s, %s);", sx, sy, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets top left corner coordinates of root layer (with transformation,in parent coordinate system).<br/>
Read more at: {@link anychart.graphics.vector.Element#setPosition}.
     */
    public com.anychart.graphics.vector.Stage setPosition(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setPosition(%s, %s);", x, y));

        return this;
    }
    /**
     * Rotates root layer around a point.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotation}.
     */
    public com.anychart.graphics.vector.Stage setRotation(Number degrees, Number cx, Number cy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotation(%s, %s, %s);", degrees, cx, cy));

        return this;
    }
    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotationByAnchor}.
     */
    public com.anychart.graphics.vector.Stage setRotationByAnchor(Number degrees, com.anychart.graphics.vector.Anchor anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, (anchor != null) ? anchor.getJsBase() : null));

        return this;
    }
    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotationByAnchor}.
     */
    public com.anychart.graphics.vector.Stage setRotationByAnchor(Number degrees, String anchor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %s);", degrees, wrapQuotes(anchor)));

        return this;
    }
    /**
     * Sets transformation matrix.<br/>
Read more at: {@link anychart.graphics.vector.Element#setTransformationMatrix}.
     */
    public com.anychart.graphics.vector.Stage setTransformationMatrix(Number m00, Number m10, Number m01, Number m11, Number m02, Number m12) {
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
     * Suspends rendering (changes instant to suspended).
     */
    public com.anychart.graphics.vector.Stage suspend() {
        APIlib.getInstance().addJSLine(jsBase + ".suspend();");

        return this;
    }
    /**
     * Swaps two children.<br/>
Similar to {@link anychart.graphics.vector.Layer#swapChildren}
     */
    public com.anychart.graphics.vector.Stage swapChildren(com.anychart.graphics.vector.Element element1, com.anychart.graphics.vector.Element element2) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".swapChildren(%s, %s);", (element1 != null) ? element1.getJsBase() : null, (element2 != null) ? element2.getJsBase() : null));

        return this;
    }
    /**
     * Swaps two children by id.<br/>
Similar to {@link anychart.graphics.vector.Layer#swapChildrenAt}
     */
    public com.anychart.graphics.vector.Stage swapChildrenAt(Number index1, Number index2) {
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
    public com.anychart.graphics.vector.Stage title(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Returns SVG string if type of content is SVG with parameters otherwise returns empty string.
     */
    public void toSvg(String paperSize, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", wrapQuotes(paperSize), landscape));
    }
    /**
     * Returns SVG string if type of content is SVG with determined the width and height otherwise returns empty string.
     */
    public void toSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", width, height));
    }
    /**
     * Moves root layer taking transformation into account.<br/>
Movement happens in root layer coordinates.<br/>
Read more at: {@link anychart.graphics.vector.Element#translate}.
     */
    public com.anychart.graphics.vector.Stage translate(Number tx, Number ty) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".translate(%s, %s);", tx, ty));

        return this;
    }
    /**
     * Draws a triangle heading downwards set by it circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleDown}
     */
    public void triangleDown() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleDown();");
    }
    /**
     * Draws a triangle heading leftwards set by it circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#triangleLeft}
     */
    public void triangleLeft() {
        APIlib.getInstance().addJSLine(jsBase + ".triangleLeft();");
    }
    /**
     * Draws a triangle heading rightwards set by it circumscribed circle center and radius.<br/>
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
     * Removes an event listener which was added with {@link anychart.graphics.vector.Stage#listen} by the key returned by
{@link anychart.graphics.vector.Stage#listen} or {@link anychart.graphics.vector.Stage#listenOnce}.
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Draws a thick vertical line set by its circumscribed circle center and radius.<br/>
Read more at {@link anychart.graphics.vector.primitives#vLine}
     */
    public void vLine() {
        APIlib.getInstance().addJSLine(jsBase + ".vLine();");
    }
    /**
     * Returns the current stage visibility.
     */
    public void visible() {
        APIlib.getInstance().addJSLine(jsBase + ".visible();");
    }
    /**
     * Shows or hides a stage.
     */
    public com.anychart.graphics.vector.Stage visible(Boolean isVisible) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".visible(%s);", isVisible));

        return this;
    }
    /**
     * Getter for the stage width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for a stage width.
     */
    public com.anychart.graphics.vector.Stage width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Setter for a stage width.
     */
    public com.anychart.graphics.vector.Stage width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

        return this;
    }
    /**
     * 
     */
    public com.anychart.graphics.vector.Stage data(com.anychart.data.View data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", (data != null) ? data.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.graphics.vector.Stage data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.graphics.vector.Stage data(List<DataEntry> data, String fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), wrapQuotes(fillMethod)));

        return this;
    }

}
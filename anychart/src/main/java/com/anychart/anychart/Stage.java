package com.anychart.anychart;

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

    public Stage() {
        js.setLength(0);
        js.append("var stage").append(++variableIndex).append(" = anychart.graphics.vector.stage();");
        jsBase = "stage" + variableIndex;
    }

    protected Stage(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Stage(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element element;

    /**
     * Adds an element.<br/>
Similar to {@link anychart.graphics.vector.Layer#addChild}
     */
    public Stage addChild(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((element != null) ? element.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", ((element != null) ? element.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element element1;
    private Double index;

    /**
     * Adds an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#addChildAt}
     */
    public Stage addChildAt(Element element1, Double index) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element1 = element1;
            this.index = index;
        } else {
            this.element1 = element1;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(element1.generateJs());
            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((element1 != null) ? element1.getJsBase() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", ((element1 != null) ? element1.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    /**
     * Combines current transformation with another.<br/>
Combination is done by multiplying matrix to the right.<br/>
Read more at: {@link anychart.graphics.vector.Element#appendTransformationMatrix}.
     */
    public Stage appendTransformationMatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
        if (jsBase == null) {
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m = m;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m1 = m1;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m2 = m2;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m3 = m3;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m4 = m4;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m5 = m5;
        } else {
            this.m = m;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
            this.m5 = m5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f)", m, m1, m2, m3, m4, m5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f);", m, m1, m2, m3, m4, m5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean asyncMode;

    /**
     * Setter for the stage rendering mode.
     */
    public Stage setAsyncMode(Boolean asyncMode) {
        if (jsBase == null) {
            this.asyncMode = asyncMode;
        } else {
            this.asyncMode = asyncMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".asyncMode(%b)", asyncMode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".asyncMode(%b);", asyncMode));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cx;
    private Double cy;
    private Double radius;
    private List<Circle> setCircle = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Circle} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.Circle}
     */
    public Circle circle(Double cx, Double cy, Double radius) {
        if (jsBase == null) {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;
        } else {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCircle" + ++variableIndex + " = " + jsBase + ".circle(%f, %f, %f);", cx, cy, radius));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".circle(%f, %f, %f);", cx, cy, radius));
                js.setLength(0);
            }
        }
        Circle item = new Circle("setCircle" + variableIndex);
        setCircle.add(item);
        return item;
    }
    private String generateJSsetCircle() {
        if (!setCircle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Circle item : setCircle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GraphicsMathRect getClip;

    /**
     * Gets clip bounds.<br/>
Works only after render() is invoked.<br/>
Read more at: {@link anychart.graphics.vector.Element#clip}.
     */
    public GraphicsMathRect getClip() {
        if (getClip == null)
            getClip = new GraphicsMathRect(jsBase + ".clip()");

        return getClip;
    }

    private GraphicsMathRect clip;

    /**
     * Clips a stage.<br/>
Works only after render() is invoked.<br/>
Read more at: {@link anychart.graphics.vector.Element#clip}.
     */
    public Stage clip(GraphicsMathRect clip) {
        if (jsBase == null) {
            this.clip = clip;
        } else {
            this.clip = clip;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(clip.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".clip(%s);",  ((clip != null) ? clip.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", ((clip != null) ? clip.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element container;

    /**
     * Sets DOM element where everything is drawn upon rendering.
     */
    public Stage setContainer(Element container) {
        if (jsBase == null) {
            this.container = container;
        } else {
            this.container = container;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container != null) ? container.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container != null) ? container.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double[] rect;
    private GraphicsMathRect rect1;
    private String rect2;
    private List<Clip> setCreateClip = new ArrayList<>();

    /**
     * Creates a clip element using single value.
     */
    public Clip createClip(Double[] rect) {
        if (jsBase == null) {
            this.rect = null;
            this.rect1 = null;
            this.rect2 = null;
            
            this.rect = rect;
        } else {
            this.rect = rect;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCreateClip" + ++variableIndex + " = " + jsBase + ".createClip(%s);", Arrays.toString(rect)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createClip(%s);", Arrays.toString(rect)));
                js.setLength(0);
            }
        }
        Clip item = new Clip("setCreateClip" + variableIndex);
        setCreateClip.add(item);
        return item;
    }
    private String generateJSsetCreateClip() {
        if (!setCreateClip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Clip item : setCreateClip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Clip> setCreateClip1 = new ArrayList<>();

    /**
     * Creates a clip element using single value.
     */
    public Clip createClip(GraphicsMathRect rect1) {
        if (jsBase == null) {
            this.rect = null;
            this.rect1 = null;
            this.rect2 = null;
            
            this.rect1 = rect1;
        } else {
            this.rect1 = rect1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(rect1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".createClip(%s);",  ((rect1 != null) ? rect1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createClip(%s);", ((rect1 != null) ? rect1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        Clip item = new Clip("setCreateClip1" + variableIndex);
        setCreateClip1.add(item);
        return item;
    }
    private String generateJSsetCreateClip1() {
        if (!setCreateClip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Clip item : setCreateClip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Clip> setCreateClip2 = new ArrayList<>();

    /**
     * Creates a clip element using single value.
     */
    public Clip createClip(String rect2) {
        if (jsBase == null) {
            this.rect = null;
            this.rect1 = null;
            this.rect2 = null;
            
            this.rect2 = rect2;
        } else {
            this.rect2 = rect2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCreateClip2" + ++variableIndex + " = " + jsBase + ".createClip(%s);", wrapQuotes(rect2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createClip(%s);", wrapQuotes(rect2)));
                js.setLength(0);
            }
        }
        Clip item = new Clip("setCreateClip2" + variableIndex);
        setCreateClip2.add(item);
        return item;
    }
    private String generateJSsetCreateClip2() {
        if (!setCreateClip2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Clip item : setCreateClip2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;
    private List<Clip> setCreateClip3 = new ArrayList<>();

    /**
     * Creates a clip element using several value.
     */
    public Clip createClip(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCreateClip3" + ++variableIndex + " = " + jsBase + ".createClip(%f, %f, %f, %f);", left, top, width, height));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createClip(%f, %f, %f, %f);", left, top, width, height));
                js.setLength(0);
            }
        }
        Clip item = new Clip("setCreateClip3" + variableIndex);
        setCreateClip3.add(item);
        return item;
    }
    private String generateJSsetCreateClip3() {
        if (!setCreateClip3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Clip item : setCreateClip3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StageCredits getCredits;

    /**
     * Getter for stage credits.
     */
    public StageCredits getCredits() {
        if (getCredits == null)
            getCredits = new StageCredits(jsBase + ".credits()");

        return getCredits;
    }

    private String credits;
    private Boolean credits1;

    /**
     * Setter for stage credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Stage setCredits(String credits) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits = credits;
        } else {
            this.credits = credits;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".credits(%s)", wrapQuotes(credits)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%s);", wrapQuotes(credits)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stage credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Stage setCredits(Boolean credits1) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits1 = credits1;
        } else {
            this.credits1 = credits1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".credits(%b)", credits1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%b);", credits1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String data;

    /**
     * Deserialize JSON. Objects are created and rendered to the current stage.<br/>
<b>Note:</b> All settings except events and handlers are serialized. JSON object
must be conformed with JSON schema (can be found in the project root). No checks are done
when we deserialize - JSON schema does this. JSON schema is created in
<a href='https://tools.ietf.org/html/draft-zyp-json-schema-04'>4-th version of standard</a>
<a href='http://json-schema.org/'>JSON schema</a>.
     */
    public Stage data(String data) {
        if (jsBase == null) {
            this.data = data;
        } else {
            this.data = data;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s)", wrapQuotes(data)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", wrapQuotes(data)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String desc;

    /**
     * Setter for the element desc value.
     */
    public Stage setDesc(String desc) {
        if (jsBase == null) {
            this.desc = desc;
        } else {
            this.desc = desc;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".desc(%s)", wrapQuotes(desc)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(desc)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cx1;
    private Double cy1;
    private Double rx;
    private Double ry;
    private List<VectorEllipse> setEllipse = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Ellipse} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.Ellipse}
     */
    public VectorEllipse ellipse(Double cx1, Double cy1, Double rx, Double ry) {
        if (jsBase == null) {
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.rx = rx;
            this.ry = ry;
        } else {
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.rx = rx;
            this.ry = ry;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setEllipse" + ++variableIndex + " = " + jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));
                js.setLength(0);
            }
        }
        VectorEllipse item = new VectorEllipse("setEllipse" + variableIndex);
        setEllipse.add(item);
        return item;
    }
    private String generateJSsetEllipse() {
        if (!setEllipse.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorEllipse item : setEllipse) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<Element> setGetChildAt = new ArrayList<>();

    /**
     * Returns an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#getChildAt}
     */
    public Element getChildAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setGetChildAt" + ++variableIndex + " = " + jsBase + ".getChildAt(%f);", index1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));
                js.setLength(0);
            }
        }
        Element item = new Element("setGetChildAt" + variableIndex);
        setGetChildAt.add(item);
        return item;
    }
    private String generateJSsetGetChildAt() {
        if (!setGetChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Element item : setGetChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width1;
    private Double height1;
    private Double quality;
    private Boolean forceTransparentWhite;

    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(Double width1, Double height1, Double quality, Boolean forceTransparentWhite) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
        } else {
            this.width1 = width1;
            this.height1 = height1;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getJpgBase64String(%f, %f, %f, %b);", width1, height1, quality, forceTransparentWhite));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%f, %f, %f, %b);", width1, height1, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private Double paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Double landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Double x;
    private Double y;

    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Double x, Double landscapeOrWidth, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%f, %f, %f, %f);", paperSizeOrWidth, x, landscapeOrWidth, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %f, %f);", paperSizeOrWidth, x, landscapeOrWidth, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Double x, Boolean landscapeOrWidth1, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%f, %f, %b, %f);", paperSizeOrWidth, x, landscapeOrWidth1, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %b, %f);", paperSizeOrWidth, x, landscapeOrWidth1, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Double x, Double landscapeOrWidth, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %f, %f, %f);", wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %f, %f);", wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Double x, Boolean landscapeOrWidth1, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %f, %b, %f);", wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth1, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %b, %f);", wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth1, y));
                js.setLength(0);
            }
        }
    }

    private Double width2;
    private Double height2;
    private Double quality1;

    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(Double width2, Double height2, Double quality1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
            this.quality = null;
            this.quality1 = null;
            
            this.quality1 = quality1;
        } else {
            this.width2 = width2;
            this.height2 = height2;
            this.quality1 = quality1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPngBase64String(%f, %f, %f);", width2, height2, quality1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%f, %f, %f);", width2, height2, quality1));
                js.setLength(0);
            }
        }
    }

    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %b);", wrapQuotes(paperSizeOrWidth2), landscapeOrHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b);", wrapQuotes(paperSizeOrWidth2), landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %s);", wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s);", wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%f, %b);", paperSizeOrWidth3, landscapeOrHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b);", paperSizeOrWidth3, landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%f, %s);", paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s);", paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }

    private Element element2;

    /**
     * Checks if there is such element in children set.<br/>
Similar to {@link anychart.graphics.vector.Layer#hasChild}
     */
    public void hasChild(Element element2) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            
            this.element2 = element2;
        } else {
            this.element2 = element2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".hasChild(%s);",  ((element2 != null) ? element2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hasChild(%s);", ((element2 != null) ? element2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private HatchFillType type;
    private String color;
    private Double thickness;
    private Double size;
    private List<HatchFill> setHatchFill = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.HatchFill} constructor.
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You have to delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.HatchFill}
     */
    public HatchFill hatchFill(HatchFillType type, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = type;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type = type;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((type != null) ? type.generateJs() : "null"), wrapQuotes(color), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((type != null) ? type.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        HatchFill item = new HatchFill("setHatchFill" + variableIndex);
        setHatchFill.add(item);
        return item;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFill item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String height3;
    private Double height4;

    /**
     * Sets a stage height.
     */
    public Stage setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height3)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets a stage height.
     */
    public Stage setHeight(Double height4) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height4 = height4;
        } else {
            this.height4 = height4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%f)", height4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x1;
    private Double y1;
    private String text;
    private List<VectorText> setHtml = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Text} and applies {@link anychart.graphics.vector.Text#htmlText} method
to parse HTML.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public VectorText html(Double x1, Double y1, String text) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.text = text;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.text = text;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHtml" + ++variableIndex + " = " + jsBase + ".html(%f, %f, %s);", x1, y1, wrapQuotes(text)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".html(%f, %f, %s);", x1, y1, wrapQuotes(text)));
                js.setLength(0);
            }
        }
        VectorText item = new VectorText("setHtml" + variableIndex);
        setHtml.add(item);
        return item;
    }
    private String generateJSsetHtml() {
        if (!setHtml.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHtml) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id;

    /**
     * Setter for a stage identifier. Instantly applied to the DOM.
     */
    public Stage setId(String id) {
        if (jsBase == null) {
            this.id = id;
        } else {
            this.id = id;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String src;
    private Double x2;
    private Double y2;
    private Double width3;
    private Double height5;
    private List<Image> setImage = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Image} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public Image image(String src, Double x2, Double y2, Double width3, Double height5) {
        if (jsBase == null) {
            this.src = src;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height5 = height5;
        } else {
            this.src = src;
            this.x2 = x2;
            this.y2 = y2;
            this.width3 = width3;
            this.height5 = height5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setImage" + ++variableIndex + " = " + jsBase + ".image(%s, %f, %f, %f, %f);", wrapQuotes(src), x2, y2, width3, height5));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f);", wrapQuotes(src), x2, y2, width3, height5));
                js.setLength(0);
            }
        }
        Image item = new Image("setImage" + variableIndex);
        setImage.add(item);
        return item;
    }
    private String generateJSsetImage() {
        if (!setImage.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Image item : setImage) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Element element3;

    /**
     * Returns index of a child.<br/>
Similar to {@link anychart.graphics.vector.Layer#indexOfChild}
     */
    public void indexOfChild(Element element3) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            
            this.element3 = element3;
        } else {
            this.element3 = element3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element3.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".indexOfChild(%s);",  ((element3 != null) ? element3.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", ((element3 != null) ? element3.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private Double maxResizeDelay;

    /**
     * Setter for max delay.
     */
    public Stage setMaxResizeDelay(Double maxResizeDelay) {
        if (jsBase == null) {
            this.maxResizeDelay = maxResizeDelay;
        } else {
            this.maxResizeDelay = maxResizeDelay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxResizeDelay(%f)", maxResizeDelay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxResizeDelay(%f);", maxResizeDelay));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect bounds;
    private List<PatternFill> setPattern = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.PatternFill}.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.<br/>
Read more at: {@link anychart.graphics.vector.PatternFill}
     */
    public PatternFill pattern(GraphicsMathRect bounds) {
        if (jsBase == null) {
            this.bounds = bounds;
        } else {
            this.bounds = bounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(bounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".pattern(%s);",  ((bounds != null) ? bounds.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pattern(%s);", ((bounds != null) ? bounds.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        PatternFill item = new PatternFill("setPattern" + variableIndex);
        setPattern.add(item);
        return item;
    }
    private String generateJSsetPattern() {
        if (!setPattern.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PatternFill item : setPattern) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String paperSizeOrWidth4;
    private Double paperSizeOrWidth5;
    private Boolean landscapeOrHeight2;
    private String landscapeOrHeight3;

    /**
     * Print stage.
     */
    public void print(String paperSizeOrWidth4, Boolean landscapeOrHeight2) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".print(%s, %b);", wrapQuotes(paperSizeOrWidth4), landscapeOrHeight2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", wrapQuotes(paperSizeOrWidth4), landscapeOrHeight2));
                js.setLength(0);
            }
        }
    }


    /**
     * Print stage.
     */
    public void print(String paperSizeOrWidth4, String landscapeOrHeight3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrWidth4), wrapQuotes(landscapeOrHeight3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrWidth4), wrapQuotes(landscapeOrHeight3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Print stage.
     */
    public void print(Double paperSizeOrWidth5, Boolean landscapeOrHeight2) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".print(%f, %b);", paperSizeOrWidth5, landscapeOrHeight2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%f, %b);", paperSizeOrWidth5, landscapeOrHeight2));
                js.setLength(0);
            }
        }
    }


    /**
     * Print stage.
     */
    public void print(Double paperSizeOrWidth5, String landscapeOrHeight3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".print(%f, %s);", paperSizeOrWidth5, wrapQuotes(landscapeOrHeight3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%f, %s);", paperSizeOrWidth5, wrapQuotes(landscapeOrHeight3)));
                js.setLength(0);
            }
        }
    }

    private Double x3;
    private Double y3;
    private Double width4;
    private Double height6;
    private List<VectorRect> setRect = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Rect} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public VectorRect rect(Double x3, Double y3, Double width4, Double height6) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            
            this.x3 = x3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            
            this.y3 = y3;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            
            this.width4 = width4;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
        } else {
            this.x3 = x3;
            this.y3 = y3;
            this.width4 = width4;
            this.height6 = height6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRect" + ++variableIndex + " = " + jsBase + ".rect(%f, %f, %f, %f);", x3, y3, width4, height6));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f);", x3, y3, width4, height6));
                js.setLength(0);
            }
        }
        VectorRect item = new VectorRect("setRect" + variableIndex);
        setRect.add(item);
        return item;
    }
    private String generateJSsetRect() {
        if (!setRect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Element element4;
    private List<Element> setRemoveChild = new ArrayList<>();

    /**
     * Removes an element.<br/>
Similar to {@link anychart.graphics.vector.Layer#removeChild}
     */
    public Element removeChild(Element element4) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            
            this.element4 = element4;
        } else {
            this.element4 = element4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element4.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((element4 != null) ? element4.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((element4 != null) ? element4.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        Element item = new Element("setRemoveChild" + variableIndex);
        setRemoveChild.add(item);
        return item;
    }
    private String generateJSsetRemoveChild() {
        if (!setRemoveChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Element item : setRemoveChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private List<Element> setRemoveChildAt = new ArrayList<>();

    /**
     * Removes an element by index.<br/>
Similar to {@link anychart.graphics.vector.Layer#removeChildAt}
     */
    public Element removeChildAt(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRemoveChildAt" + ++variableIndex + " = " + jsBase + ".removeChildAt(%f);", index2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));
                js.setLength(0);
            }
        }
        Element item = new Element("setRemoveChildAt" + variableIndex);
        setRemoveChildAt.add(item);
        return item;
    }
    private String generateJSsetRemoveChildAt() {
        if (!setRemoveChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Element item : setRemoveChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width5;
    private String width6;
    private Double height7;
    private String height8;

    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(Double width5, Double height7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width5 = width5;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            
            this.height7 = height7;
        } else {
            this.width5 = width5;
            this.height7 = height7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".resize(%f, %f);", width5, height7));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".resize(%f, %f);", width5, height7));
                js.setLength(0);
            }
        }
    }


    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(Double width5, String height8) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width5 = width5;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            
            this.height8 = height8;
        } else {
            this.width5 = width5;
            this.height8 = height8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".resize(%f, %s);", width5, wrapQuotes(height8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".resize(%f, %s);", width5, wrapQuotes(height8)));
                js.setLength(0);
            }
        }
    }


    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(String width6, Double height7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width6 = width6;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            
            this.height7 = height7;
        } else {
            this.width6 = width6;
            this.height7 = height7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".resize(%s, %f);", wrapQuotes(width6), height7));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".resize(%s, %f);", wrapQuotes(width6), height7));
                js.setLength(0);
            }
        }
    }


    /**
     * Stage resize. Anything drawn on stage must fit in it.
So any part that doesn't fit will be clipped.
     */
    public void resize(String width6, String height8) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width6 = width6;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            
            this.height8 = height8;
        } else {
            this.width6 = width6;
            this.height8 = height8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".resize(%s, %s);", wrapQuotes(width6), wrapQuotes(height8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".resize(%s, %s);", wrapQuotes(width6), wrapQuotes(height8)));
                js.setLength(0);
            }
        }
    }

    private Boolean force;

    /**
     * Removes suspend state and applies all changes in sync (if any).<br/>
Read more at {@link anychart.graphics.vector.Stage#suspend}.
     */
    public Stage resume(Boolean force) {
        if (jsBase == null) {
            this.force = force;
        } else {
            this.force = force;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".resume(%b)", force));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".resume(%b);", force));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees;
    private Double cx2;
    private Double cy2;

    /**
     * Rotates root layer.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotate}.
     */
    public Stage rotate(Double degrees, Double cx2, Double cy2) {
        if (jsBase == null) {
            this.degrees = degrees;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
        } else {
            this.degrees = degrees;
            this.cx2 = cx2;
            this.cy2 = cy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotate(%f, %f, %f)", degrees, cx2, cy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx2, cy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees1;
    private VectorAnchor anchor;
    private String anchor1;

    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotateByAnchor}.
     */
    public Stage rotateByAnchor(Double degrees1, VectorAnchor anchor) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.degrees1 = degrees1;
            this.anchor = anchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotateByAnchor(%f, %s)", degrees1, ((anchor != null) ? anchor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%f, %s);", degrees1, ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#rotateByAnchor}.
     */
    public Stage rotateByAnchor(Double degrees1, String anchor1) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.degrees1 = degrees1;
            this.anchor1 = anchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotateByAnchor(%f, %s)", degrees1, wrapQuotes(anchor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%f, %s);", degrees1, wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width7;
    private Double height9;
    private Double quality2;
    private Boolean forceTransparentWhite1;
    private String filename;

    /**
     * Saves the current stage as JPG Image.<br/>
For export to image JPG use {@link anychart#server}.
     */
    public void saveAsJpg(Double width7, Double height9, Double quality2, Boolean forceTransparentWhite1, String filename) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width7 = width7;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            
            this.height9 = height9;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            
            this.quality2 = quality2;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename = filename;
        } else {
            this.width7 = width7;
            this.height9 = height9;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsJpg(%f, %f, %f, %b, %s);", width7, height9, quality2, forceTransparentWhite1, wrapQuotes(filename)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s);", width7, height9, quality2, forceTransparentWhite1, wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private Boolean landscape;
    private Double x4;
    private Double y4;
    private String filename1;

    /**
     * Saves the current stage as PDF Document.<br/>
For export to PDF file use {@link anychart#server}.
     */
    public void saveAsPdf(String paperSize, Boolean landscape, Double x4, Double y4, String filename1) {
        if (jsBase == null) {
            this.paperSize = paperSize;
            this.landscape = landscape;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            
            this.x4 = x4;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            
            this.y4 = y4;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.paperSize = paperSize;
            this.landscape = landscape;
            this.x4 = x4;
            this.y4 = y4;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPdf(%s, %b, %f, %f, %s);", wrapQuotes(paperSize), landscape, x4, y4, wrapQuotes(filename1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s);", wrapQuotes(paperSize), landscape, x4, y4, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }

    private Double width8;
    private Double height10;
    private Double quality3;
    private String filename2;

    /**
     * Saves the current stage as PNG Image.<br/>
For export to image PNG use {@link anychart#server}.
     */
    public void saveAsPng(Double width8, Double height10, Double quality3, String filename2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            
            this.width8 = width8;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            
            this.height10 = height10;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            
            this.quality3 = quality3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            
            this.filename2 = filename2;
        } else {
            this.width8 = width8;
            this.height10 = height10;
            this.quality3 = quality3;
            this.filename2 = filename2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPng(%f, %f, %f, %s);", width8, height10, quality3, wrapQuotes(filename2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s);", width8, height10, quality3, wrapQuotes(filename2)));
                js.setLength(0);
            }
        }
    }

    private String paperSize1;
    private Boolean landscape1;
    private String filename3;

    /**
     * Saves the stage as SVG Image.<br/>
For export to SVG use {@link anychart#server}.
     */
    public void saveAsSvg(String paperSize1, Boolean landscape1, String filename3) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            
            this.paperSize1 = paperSize1;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSize1 = paperSize1;
            this.landscape1 = landscape1;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsSvg(%s, %b, %s);", wrapQuotes(paperSize1), landscape1, wrapQuotes(filename3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s);", wrapQuotes(paperSize1), landscape1, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }

    private Double width9;
    private Double height11;

    /**
     * Saves the stage as SVG Image using width and height.<br/>
For export to SVG use {@link anychart#server}.
     */
    public void saveAsSvg(Double width9, Double height11) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            
            this.width9 = width9;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            this.height11 = null;
            
            this.height11 = height11;
        } else {
            this.width9 = width9;
            this.height11 = height11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsSvg(%f, %f);", width9, height11));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width9, height11));
                js.setLength(0);
            }
        }
    }

    private Double sx;
    private Double sy;
    private Double cx3;
    private Double cy3;

    /**
     * Scales root layer in parent coordinates system. Scaling center is set in the parent system too.<br/>
Read more at: {@link anychart.graphics.vector.Element#scale}.
     */
    public Stage scale(Double sx, Double sy, Double cx3, Double cy3) {
        if (jsBase == null) {
            this.sx = sx;
            this.sy = sy;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
        } else {
            this.sx = sx;
            this.sy = sy;
            this.cx3 = cx3;
            this.cy3 = cy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scale(%f, %f, %f, %f)", sx, sy, cx3, cy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx3, cy3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double sx1;
    private Double sy1;
    private VectorAnchor anchor2;
    private String anchor3;

    /**
     * Scales root layer in parent coordinates system. Scaling center is set by root layer anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#scaleByAnchor}.
     */
    public Stage scaleByAnchor(Double sx1, Double sy1, VectorAnchor anchor2) {
        if (jsBase == null) {
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor2 = anchor2;
        } else {
            this.sx1 = sx1;
            this.sy1 = sy1;
            this.anchor2 = anchor2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scaleByAnchor(%f, %f, %s)", sx1, sy1, ((anchor2 != null) ? anchor2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%f, %f, %s);", sx1, sy1, ((anchor2 != null) ? anchor2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Scales root layer in parent coordinates system. Scaling center is set by root layer anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#scaleByAnchor}.
     */
    public Stage scaleByAnchor(Double sx1, Double sy1, String anchor3) {
        if (jsBase == null) {
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor3 = anchor3;
        } else {
            this.sx1 = sx1;
            this.sy1 = sy1;
            this.anchor3 = anchor3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scaleByAnchor(%f, %f, %s)", sx1, sy1, wrapQuotes(anchor3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%f, %f, %s);", sx1, sy1, wrapQuotes(anchor3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x5;
    private Double y5;

    /**
     * Sets top left corner coordinates of root layer (with transformation,in parent coordinate system).<br/>
Read more at: {@link anychart.graphics.vector.Element#setPosition}.
     */
    public Stage setSetPosition(Double x5, Double y5) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            
            this.x5 = x5;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            
            this.y5 = y5;
        } else {
            this.x5 = x5;
            this.y5 = y5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setPosition(%f, %f)", x5, y5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x5, y5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees2;
    private Double cx4;
    private Double cy4;

    /**
     * Rotates root layer around a point.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotation}.
     */
    public Stage setRotation(Double degrees2, Double cx4, Double cy4) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            
            this.degrees2 = degrees2;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
        } else {
            this.degrees2 = degrees2;
            this.cx4 = cx4;
            this.cy4 = cy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotation(%f, %f, %f)", degrees2, cx4, cy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx4, cy4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees3;
    private VectorAnchor anchor4;
    private String anchor5;

    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotationByAnchor}.
     */
    public Stage setRotationByAnchor(Double degrees3, VectorAnchor anchor4) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor4 = anchor4;
        } else {
            this.degrees3 = degrees3;
            this.anchor4 = anchor4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotationByAnchor(%f, %s)", degrees3, ((anchor4 != null) ? anchor4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%f, %s);", degrees3, ((anchor4 != null) ? anchor4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Rotates root layer around an anchor.<br/>
Read more at: {@link anychart.graphics.vector.Element#setRotationByAnchor}.
     */
    public Stage setRotationByAnchor(Double degrees3, String anchor5) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor5 = anchor5;
        } else {
            this.degrees3 = degrees3;
            this.anchor5 = anchor5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotationByAnchor(%f, %s)", degrees3, wrapQuotes(anchor5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%f, %s);", degrees3, wrapQuotes(anchor5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;

    /**
     * Sets transformation matrix.<br/>
Read more at: {@link anychart.graphics.vector.Element#setTransformationMatrix}.
     */
    public Stage setSetTransformationMatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
        if (jsBase == null) {
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m6 = m6;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m7 = m7;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m8 = m8;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m9 = m9;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m10 = m10;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m11 = m11;
        } else {
            this.m6 = m6;
            this.m7 = m7;
            this.m8 = m8;
            this.m9 = m9;
            this.m10 = m10;
            this.m11 = m11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setTransformationMatrix(%f, %f, %f, %f, %f, %f)", m6, m7, m8, m9, m10, m11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setTransformationMatrix(%f, %f, %f, %f, %f, %f);", m6, m7, m8, m9, m10, m11));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean asBase;
    private Double width10;
    private Double height12;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename4;

    /**
     * Share a stage as a JPG and return link to shared image.
     */
    public void shareAsJpg(Boolean asBase, Double width10, Double height12, Double quality4, Boolean forceTransparentWhite2, String filename4) {
        if (jsBase == null) {
            this.asBase = asBase;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            this.width10 = null;
            
            this.width10 = width10;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            this.height11 = null;
            this.height12 = null;
            
            this.height12 = height12;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            
            this.quality4 = quality4;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            this.forceTransparentWhite2 = null;
            
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            
            this.filename4 = filename4;
        } else {
            this.asBase = asBase;
            this.width10 = width10;
            this.height12 = height12;
            this.quality4 = quality4;
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename4 = filename4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsJpg(%b, %f, %f, %f, %b, %s);", asBase, width10, height12, quality4, forceTransparentWhite2, wrapQuotes(filename4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%b, %f, %f, %f, %b, %s);", asBase, width10, height12, quality4, forceTransparentWhite2, wrapQuotes(filename4)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase1;
    private Double paperSizeOrWidth6;
    private String paperSizeOrWidth7;
    private Double landscapeOrWidth2;
    private Boolean landscapeOrWidth3;
    private Double x6;
    private Double y6;
    private String filename5;

    /**
     * Share a stage as a PDF and return link to shared image.
     */
    public void shareAsPdf(Boolean asBase1, Double paperSizeOrWidth6, Double x6, Double landscapeOrWidth2, Double y6, String filename5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            this.x6 = null;
            
            this.x6 = x6;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            this.y6 = null;
            
            this.y6 = y6;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.asBase1 = asBase1;
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.x6 = x6;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y6 = y6;
            this.filename5 = filename5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%b, %f, %f, %f, %f, %s);", asBase1, paperSizeOrWidth6, x6, landscapeOrWidth2, y6, wrapQuotes(filename5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%b, %f, %f, %f, %f, %s);", asBase1, paperSizeOrWidth6, x6, landscapeOrWidth2, y6, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a PDF and return link to shared image.
     */
    public void shareAsPdf(Boolean asBase1, Double paperSizeOrWidth6, Double x6, Boolean landscapeOrWidth3, Double y6, String filename5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            this.x6 = null;
            
            this.x6 = x6;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            this.y6 = null;
            
            this.y6 = y6;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.asBase1 = asBase1;
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.x6 = x6;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y6 = y6;
            this.filename5 = filename5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%b, %f, %f, %b, %f, %s);", asBase1, paperSizeOrWidth6, x6, landscapeOrWidth3, y6, wrapQuotes(filename5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%b, %f, %f, %b, %f, %s);", asBase1, paperSizeOrWidth6, x6, landscapeOrWidth3, y6, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a PDF and return link to shared image.
     */
    public void shareAsPdf(Boolean asBase1, String paperSizeOrWidth7, Double x6, Double landscapeOrWidth2, Double y6, String filename5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            this.x6 = null;
            
            this.x6 = x6;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            this.y6 = null;
            
            this.y6 = y6;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.asBase1 = asBase1;
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.x6 = x6;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y6 = y6;
            this.filename5 = filename5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%b, %s, %f, %f, %f, %s);", asBase1, wrapQuotes(paperSizeOrWidth7), x6, landscapeOrWidth2, y6, wrapQuotes(filename5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%b, %s, %f, %f, %f, %s);", asBase1, wrapQuotes(paperSizeOrWidth7), x6, landscapeOrWidth2, y6, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a PDF and return link to shared image.
     */
    public void shareAsPdf(Boolean asBase1, String paperSizeOrWidth7, Double x6, Boolean landscapeOrWidth3, Double y6, String filename5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            this.x6 = null;
            
            this.x6 = x6;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            this.y6 = null;
            
            this.y6 = y6;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.asBase1 = asBase1;
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.x6 = x6;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y6 = y6;
            this.filename5 = filename5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%b, %s, %f, %b, %f, %s);", asBase1, wrapQuotes(paperSizeOrWidth7), x6, landscapeOrWidth3, y6, wrapQuotes(filename5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%b, %s, %f, %b, %f, %s);", asBase1, wrapQuotes(paperSizeOrWidth7), x6, landscapeOrWidth3, y6, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase2;
    private Double width11;
    private Double height13;
    private Double quality5;
    private String filename6;

    /**
     * Shares a stage as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(Boolean asBase2, Double width11, Double height13, Double quality5, String filename6) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            
            this.asBase2 = asBase2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            this.width10 = null;
            this.width11 = null;
            
            this.width11 = width11;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            this.height11 = null;
            this.height12 = null;
            this.height13 = null;
            
            this.height13 = height13;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            this.quality5 = null;
            
            this.quality5 = quality5;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            
            this.filename6 = filename6;
        } else {
            this.asBase2 = asBase2;
            this.width11 = width11;
            this.height13 = height13;
            this.quality5 = quality5;
            this.filename6 = filename6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPng(%b, %f, %f, %f, %s);", asBase2, width11, height13, quality5, wrapQuotes(filename6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%b, %f, %f, %f, %s);", asBase2, width11, height13, quality5, wrapQuotes(filename6)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase3;
    private String paperSizeOrWidth8;
    private Double paperSizeOrWidth9;
    private Boolean landscapeOrHeight4;
    private String landscapeOrHeight5;
    private String filename7;

    /**
     * Share a stage as a SVG and return link to shared image.
     */
    public void shareAsSvg(Boolean asBase3, String paperSizeOrWidth8, String filename7, Boolean landscapeOrHeight4) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            this.paperSizeOrWidth8 = null;
            this.paperSizeOrWidth9 = null;
            
            this.paperSizeOrWidth8 = paperSizeOrWidth8;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            
            this.filename7 = filename7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            this.landscapeOrHeight4 = null;
            this.landscapeOrHeight5 = null;
            
            this.landscapeOrHeight4 = landscapeOrHeight4;
        } else {
            this.asBase3 = asBase3;
            this.paperSizeOrWidth8 = paperSizeOrWidth8;
            this.filename7 = filename7;
            this.landscapeOrHeight4 = landscapeOrHeight4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%b, %s, %s, %b);", asBase3, wrapQuotes(paperSizeOrWidth8), wrapQuotes(filename7), landscapeOrHeight4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%b, %s, %s, %b);", asBase3, wrapQuotes(paperSizeOrWidth8), wrapQuotes(filename7), landscapeOrHeight4));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a SVG and return link to shared image.
     */
    public void shareAsSvg(Boolean asBase3, String paperSizeOrWidth8, String filename7, String landscapeOrHeight5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            this.paperSizeOrWidth8 = null;
            this.paperSizeOrWidth9 = null;
            
            this.paperSizeOrWidth8 = paperSizeOrWidth8;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            
            this.filename7 = filename7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            this.landscapeOrHeight4 = null;
            this.landscapeOrHeight5 = null;
            
            this.landscapeOrHeight5 = landscapeOrHeight5;
        } else {
            this.asBase3 = asBase3;
            this.paperSizeOrWidth8 = paperSizeOrWidth8;
            this.filename7 = filename7;
            this.landscapeOrHeight5 = landscapeOrHeight5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%b, %s, %s, %s);", asBase3, wrapQuotes(paperSizeOrWidth8), wrapQuotes(filename7), wrapQuotes(landscapeOrHeight5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%b, %s, %s, %s);", asBase3, wrapQuotes(paperSizeOrWidth8), wrapQuotes(filename7), wrapQuotes(landscapeOrHeight5)));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a SVG and return link to shared image.
     */
    public void shareAsSvg(Boolean asBase3, Double paperSizeOrWidth9, String filename7, Boolean landscapeOrHeight4) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            this.paperSizeOrWidth8 = null;
            this.paperSizeOrWidth9 = null;
            
            this.paperSizeOrWidth9 = paperSizeOrWidth9;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            
            this.filename7 = filename7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            this.landscapeOrHeight4 = null;
            this.landscapeOrHeight5 = null;
            
            this.landscapeOrHeight4 = landscapeOrHeight4;
        } else {
            this.asBase3 = asBase3;
            this.paperSizeOrWidth9 = paperSizeOrWidth9;
            this.filename7 = filename7;
            this.landscapeOrHeight4 = landscapeOrHeight4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%b, %f, %s, %b);", asBase3, paperSizeOrWidth9, wrapQuotes(filename7), landscapeOrHeight4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%b, %f, %s, %b);", asBase3, paperSizeOrWidth9, wrapQuotes(filename7), landscapeOrHeight4));
                js.setLength(0);
            }
        }
    }


    /**
     * Share a stage as a SVG and return link to shared image.
     */
    public void shareAsSvg(Boolean asBase3, Double paperSizeOrWidth9, String filename7, String landscapeOrHeight5) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            this.paperSizeOrWidth8 = null;
            this.paperSizeOrWidth9 = null;
            
            this.paperSizeOrWidth9 = paperSizeOrWidth9;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            
            this.filename7 = filename7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            this.landscapeOrHeight4 = null;
            this.landscapeOrHeight5 = null;
            
            this.landscapeOrHeight5 = landscapeOrHeight5;
        } else {
            this.asBase3 = asBase3;
            this.paperSizeOrWidth9 = paperSizeOrWidth9;
            this.filename7 = filename7;
            this.landscapeOrHeight5 = landscapeOrHeight5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%b, %f, %s, %s);", asBase3, paperSizeOrWidth9, wrapQuotes(filename7), wrapQuotes(landscapeOrHeight5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%b, %f, %s, %s);", asBase3, paperSizeOrWidth9, wrapQuotes(filename7), wrapQuotes(landscapeOrHeight5)));
                js.setLength(0);
            }
        }
    }

    private Element element5;
    private Element element6;

    /**
     * Swaps two children.<br/>
Similar to {@link anychart.graphics.vector.Layer#swapChildren}
     */
    public Stage swapChildren(Element element5, Element element6) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            this.element5 = null;
            this.element6 = null;
            
            this.element5 = element5;
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            this.element5 = null;
            this.element6 = null;
            
            this.element6 = element6;
        } else {
            this.element5 = element5;
            this.element6 = element6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element5.generateJs());js.append(element6.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".swapChildren(%s, %s);",  ((element5 != null) ? element5.getJsBase() : "null"), ((element6 != null) ? element6.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".swapChildren(%s, %s);", ((element5 != null) ? element5.getJsBase() : "null"), ((element6 != null) ? element6.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index3;
    private Double index4;

    /**
     * Swaps two children by id.<br/>
Similar to {@link anychart.graphics.vector.Layer#swapChildrenAt}
     */
    public Stage swapChildrenAt(Double index3, Double index4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index3 = index3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
        } else {
            this.index3 = index3;
            this.index4 = index4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".swapChildrenAt(%f, %f)", index3, index4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".swapChildrenAt(%f, %f);", index3, index4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x7;
    private Double y7;
    private String text1;
    private List<VectorText> setText = new ArrayList<>();

    /**
     * Invokes {@link anychart.graphics.vector.Text} constructor.<br/>
<strong>Note:</strong><br>anychart.graphics.vector.Stage doesn't delete objects you create.
You must delete them yourself after you finish using them.
     */
    public VectorText text(Double x7, Double y7, String text1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            this.x4 = null;
            this.x5 = null;
            this.x6 = null;
            this.x7 = null;
            
            this.x7 = x7;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            this.y5 = null;
            this.y6 = null;
            this.y7 = null;
            
            this.y7 = y7;
            this.text = null;
            this.text1 = null;
            
            this.text1 = text1;
        } else {
            this.x7 = x7;
            this.y7 = y7;
            this.text1 = text1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setText" + ++variableIndex + " = " + jsBase + ".text(%f, %f, %s);", x7, y7, wrapQuotes(text1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%f, %f, %s);", x7, y7, wrapQuotes(text1)));
                js.setLength(0);
            }
        }
        VectorText item = new VectorText("setText" + variableIndex);
        setText.add(item);
        return item;
    }
    private String generateJSsetText() {
        if (!setText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String title;

    /**
     * Setter for the element title value.
     */
    public Stage setTitle(String title) {
        if (jsBase == null) {
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String paperSize2;
    private Boolean landscape2;

    /**
     * Returns SVG string if type of content is SVG with parameters otherwise returns empty string.
     */
    public void toSvg(String paperSize2, Boolean landscape2) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            this.paperSize2 = null;
            
            this.paperSize2 = paperSize2;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            
            this.landscape2 = landscape2;
        } else {
            this.paperSize2 = paperSize2;
            this.landscape2 = landscape2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toSvg(%s, %b);", wrapQuotes(paperSize2), landscape2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", wrapQuotes(paperSize2), landscape2));
                js.setLength(0);
            }
        }
    }

    private Double width12;
    private Double height14;

    /**
     * Returns SVG string if type of content is SVG with determined the width and height otherwise returns empty string.
     */
    public void toSvg(Double width12, Double height14) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            this.width10 = null;
            this.width11 = null;
            this.width12 = null;
            
            this.width12 = width12;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            this.height11 = null;
            this.height12 = null;
            this.height13 = null;
            this.height14 = null;
            
            this.height14 = height14;
        } else {
            this.width12 = width12;
            this.height14 = height14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toSvg(%f, %f);", width12, height14));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width12, height14));
                js.setLength(0);
            }
        }
    }

    private Double tx;
    private Double ty;

    /**
     * Moves root layer taking transformation into account.<br/>
Movement happens in root layer coordinates.<br/>
Read more at: {@link anychart.graphics.vector.Element#translate}.
     */
    public Stage translate(Double tx, Double ty) {
        if (jsBase == null) {
            this.tx = tx;
            this.ty = ty;
        } else {
            this.tx = tx;
            this.ty = ty;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".translate(%f, %f)", tx, ty));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translate(%f, %f);", tx, ty));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean isVisible;

    /**
     * Shows or hides a stage.
     */
    public Stage visible(Boolean isVisible) {
        if (jsBase == null) {
            this.isVisible = isVisible;
        } else {
            this.isVisible = isVisible;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".visible(%b)", isVisible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".visible(%b);", isVisible));
                js.setLength(0);
            }
        }
        return this;
    }

    private String width13;
    private Double width14;

    /**
     * Sets a stage width.
     */
    public Stage setWidth(String width13) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            this.width10 = null;
            this.width11 = null;
            this.width12 = null;
            this.width13 = null;
            this.width14 = null;
            
            this.width13 = width13;
        } else {
            this.width13 = width13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width13)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width13)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets a stage width.
     */
    public Stage setWidth(Double width14) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            this.width10 = null;
            this.width11 = null;
            this.width12 = null;
            this.width13 = null;
            this.width14 = null;
            
            this.width14 = width14;
        } else {
            this.width14 = width14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%f)", width14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width14));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetCredits() {
        if (getCredits != null) {
            return getCredits.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetCredits());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetCircle());
        js.append(generateJSsetCreateClip());
        js.append(generateJSsetCreateClip1());
        js.append(generateJSsetCreateClip2());
        js.append(generateJSsetCreateClip3());
        js.append(generateJSsetEllipse());
        js.append(generateJSsetGetChildAt());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHtml());
        js.append(generateJSsetImage());
        js.append(generateJSsetPattern());
        js.append(generateJSsetRect());
        js.append(generateJSsetRemoveChild());
        js.append(generateJSsetRemoveChildAt());
        js.append(generateJSsetText());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
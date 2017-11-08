package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Layer class. Used to group elements.<br/>
Elements must be grouped if you want to apply similar changes to them,
for example transformation.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#layer}
to create stage bound layer.<br/> If you want to create an unbound
layer – use {@link anychart.graphics#layer}<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#layer},<br/>
{@link anychart.graphics#layer}<br/>
Elements indices (and layers indices within a stage) set Z-order.<br/>
The "higher" an element is, the greater its index.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.graphics.vector.Layer.png' width='229' height='138'/>
 */
public class Layer extends Element {

    public Layer() {
        js.setLength(0);
        js.append("var layer").append(++variableIndex).append(" = anychart.graphics.vector.layer();");
        jsBase = "layer" + variableIndex;
    }

    protected Layer(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Layer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element element;

    /**
     * Add element to a layer, to the top (maximal index).<br/>
All DOM changes will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}. <br/>
<i>Simplified version of {@link anychart.graphics.vector.Layer#addChildAt} where element is added to the end.</i>
     */
    public Layer addChild(Element element) {
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
        }
        return this;
    }

    private Element element1;
    private Double index;

    /**
     * Adds an element to a layer by index. <br/>
<b>Note:</b> the greater index is - the 'higher' element is in a layer top element overlaps bottom elements.<br/>
All DOM changes will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}.<br/>
Left image shows sequential calls of {@link anychart.graphics.vector.Layer#addChild}<br/>
Right image does the same, but star is added to 0 index.<br/>
<code>.addChildAt(star5, 0);</code> (see code of this image in samples).<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.graphics.vector.Layer.addChildAt.png' width='276' height='130'/>
     */
    public Layer addChildAt(Element element1, Double index) {
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
            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((element1 != null) ? element1.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((element1 != null) ? element1.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cx;
    private Double cy;
    private Double radius;

    /**
     * Invokes {@link anychart.graphics.vector.Circle} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.<br/>
Read more at {@link anychart.graphics.vector.Circle}
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

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".circle(%f, %f, %f)", cx, cy, radius));
                js.setLength(0);
            }
        }
        return new Circle(jsBase);
    }

    private Double cx1;
    private Double cy1;
    private Double rx;
    private Double ry;

    /**
     * Invokes {@link anychart.graphics.vector.Ellipse} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.<br/>
Read more at {@link anychart.graphics.vector.Ellipse}
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

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f)", cx1, cy1, rx, ry));
                js.setLength(0);
            }
        }
        return new VectorEllipse(jsBase);
    }

    private Double index1;

    /**
     * Returns element by index.
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

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element2;

    /**
     * Checks if there is such element in children set.
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
        }
    }

    private Double x;
    private Double y;
    private String text;

    /**
     * Invokes {@link anychart.graphics.vector.Text} class constructor and applies {@link anychart.graphics.vector.Text#htmlText} method
to handle HTML formatting.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.
     */
    public VectorText html(Double x, Double y, String text) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
            this.text = text;
        } else {
            this.x = x;
            this.y = y;
            this.text = text;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".html(%f, %f, %s)", x, y, wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return new VectorText(jsBase);
    }

    private String src;
    private Double x1;
    private Double y1;
    private Double width;
    private Double height;

    /**
     * Invokes {@link anychart.graphics.vector.Image} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You need to take care of used objects yourself.
     */
    public Image image(String src, Double x1, Double y1, Double width, Double height) {
        if (jsBase == null) {
            this.src = src;
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = width;
            this.height = height;
        } else {
            this.src = src;
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height = height;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f)", wrapQuotes(src), x1, y1, width, height));
                js.setLength(0);
            }
        }
        return new Image(jsBase);
    }

    private Element element3;

    /**
     * Looks for an element in a layer and returns index or -1, if not found.
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
        }
    }

    private Double x2;
    private Double y2;
    private Double width1;
    private Double height1;

    /**
     * Invokes {@link anychart.graphics.vector.Rect} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.
     */
    public VectorRect rect(Double x2, Double y2, Double width1, Double height1) {
        if (jsBase == null) {
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
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x2 = x2;
            this.y2 = y2;
            this.width1 = width1;
            this.height1 = height1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f)", x2, y2, width1, height1));
                js.setLength(0);
            }
        }
        return new VectorRect(jsBase);
    }

    private Element element4;

    /**
     * Removes element from a layer.<br/>
All changes in DOM will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}. <br/>
<b>Note:</b> this method doesn't remove element, it just breaks the link between the element and the layer.<br/>
<i>This is an extension of {@link anychart.graphics.vector.Layer#removeChildAt} method.</i>
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
        }
        return new Element(jsBase);
    }

    private Double index2;

    /**
     * Removes element from a layer by index.<br/>
All changes in DOM will happen instantly, except {@link anychart.graphics.vector.Stage#suspend}.<br/>
<b>Note:</b> this method doesn't remove element, it just breaks the link between the element and the layer.<br/>
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

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f)", index2));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element5;
    private Element element6;

    /**
     * Swaps children.
     */
    public Layer swapChildren(Element element5, Element element6) {
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
        }
        return this;
    }

    private Double index3;
    private Double index4;

    /**
     * Swaps children by indexes.
     */
    public Layer swapChildrenAt(Double index3, Double index4) {
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
                onChangeListener.onChange(String.format(Locale.US, ".swapChildrenAt(%f, %f)", index3, index4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x3;
    private Double y3;
    private String text1;

    /**
     * Invokes {@link anychart.graphics.vector.Text} class constructor.<br/>
<strong>Note:</strong><br>{@link anychart.graphics.vector.Layer} does nothing to delete an object after it is used.
You have to take care of used objects yourself.
     */
    public VectorText text(Double x3, Double y3, String text1) {
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
            this.text = null;
            this.text1 = null;
            
            this.text1 = text1;
        } else {
            this.x3 = x3;
            this.y3 = y3;
            this.text1 = text1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%f, %f, %s)", x3, y3, wrapQuotes(text1)));
                js.setLength(0);
            }
        }
        return new VectorText(jsBase);
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
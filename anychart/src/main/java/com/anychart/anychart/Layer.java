package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Layer extends Element {

    public Layer() {

    }

    protected Layer(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Layer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element element;

    public Layer addChild(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", ((element != null) ? element.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", ((element != null) ? element.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element element1;
    private Double index;

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

            js.append(String.format(Locale.US, jsBase + ".circle(%f, %f, %f);", cx, cy, radius));

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

            js.append(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f)", cx1, cy1, rx, ry));
                js.setLength(0);
            }
        }
        return new VectorEllipse(jsBase);
    }

    private Double index1;

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

            js.append(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element2;

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

            js.append(String.format(Locale.US, jsBase + ".hasChild(%s);", ((element2 != null) ? element2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hasChild(%s)", ((element2 != null) ? element2.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private Double y;
    private String text;

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

            js.append(String.format(Locale.US, jsBase + ".html(%f, %f, %s);", x, y, wrapQuotes(text)));

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

            js.append(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f);", wrapQuotes(src), x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f)", wrapQuotes(src), x1, y1, width, height));
                js.setLength(0);
            }
        }
        return new Image(jsBase);
    }

    private Element element3;

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

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", ((element3 != null) ? element3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s)", ((element3 != null) ? element3.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private Double x2;
    private Double y2;
    private Double width1;
    private Double height1;

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

            js.append(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f);", x2, y2, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f)", x2, y2, width1, height1));
                js.setLength(0);
            }
        }
        return new VectorRect(jsBase);
    }

    private Element element4;

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

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", ((element4 != null) ? element4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", ((element4 != null) ? element4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Double index2;

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

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f)", index2));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element5;
    private Element element6;

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".swapChildren(%s, %s)", ((element5 != null) ? element5.generateJs() : "null"), ((element6 != null) ? element6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".swapChildren(%s, %s)", ((element5 != null) ? element5.generateJs() : "null"), ((element6 != null) ? element6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index3;
    private Double index4;

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

            js.append(String.format(Locale.US, jsBase + ".text(%f, %f, %s);", x3, y3, wrapQuotes(text1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%f, %f, %s)", x3, y3, wrapQuotes(text1)));
                js.setLength(0);
            }
        }
        return new VectorText(jsBase);
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSelement());
////        
//            js.append(generateJSelement1());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJScx());
////        
//            js.append(generateJScy());
////        
//            js.append(generateJSradius());
////        
//            js.append(generateJScx1());
////        
//            js.append(generateJScy1());
////        
//            js.append(generateJSrx());
////        
//            js.append(generateJSry());
////        
//            js.append(generateJSindex1());
////        
//            js.append(generateJSelement2());
////        
//            js.append(generateJSx());
////        
//            js.append(generateJSy());
////        
//            js.append(generateJStext());
////        
//            js.append(generateJSsrc());
////        
//            js.append(generateJSx1());
////        
//            js.append(generateJSy1());
////        
//            js.append(generateJSwidth());
////        
//            js.append(generateJSheight());
////        
//            js.append(generateJSelement3());
////        
//            js.append(generateJSx2());
////        
//            js.append(generateJSy2());
////        
//            js.append(generateJSwidth1());
////        
//            js.append(generateJSheight1());
////        
//            js.append(generateJSelement4());
////        
//            js.append(generateJSindex2());
////        
//            js.append(generateJSelement5());
////        
//            js.append(generateJSelement6());
////        
//            js.append(generateJSindex3());
////        
//            js.append(generateJSindex4());
////        
//            js.append(generateJSx3());
////        
//            js.append(generateJSy3());
////        
//            js.append(generateJStext1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
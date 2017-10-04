package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class PatternFill extends Layer {

    private String jsBase;

    public PatternFill() {

    }

    protected PatternFill(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Element element;

    public void setAddchild(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", (element != null) ? element.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", (element != null) ? element.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Element element1;
    private Double index;

    public void setAddchildat(Element element1, Double index) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element1 = element1;
            this.index = index;
        } else {
            this.element1 = element1;
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (element1 != null) ? element1.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (element1 != null) ? element1.generateJs() : "null", index));
                js.setLength(0);
            }
        }
    }

    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    public void setAppendtransformationmatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
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

            js.append(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f);", m, m1, m2, m3, m4, m5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f);", m, m1, m2, m3, m4, m5));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setAttr(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".attr(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".attr(%s);", key));
                js.setLength(0);
            }
        }
    }

    private String key1;
    private Double cx;
    private Double cy;
    private Double radius;

    public void setCircle(Double cx, Double cy, Double radius) {
        if (jsBase == null) {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;
        } else {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;

            js.append(String.format(Locale.US, jsBase + ".circle(%f, %f, %f);", cx, cy, radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".circle(%f, %f, %f);", cx, cy, radius));
                js.setLength(0);
            }
        }
    }

    private GraphicsMathRect getClip;

    public GraphicsMathRect getClip() {
        if (getClip == null)
            getClip = new GraphicsMathRect(jsBase + ".clip()");

        return getClip;
    }

    private GraphicsMathRect clip;
    private String clip1;

    public void setClip(GraphicsMathRect clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;

            js.append(String.format(Locale.US, jsBase + ".clip(%s);", (clip != null) ? clip.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", (clip != null) ? clip.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setClip(String clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;

            js.append(String.format(Locale.US, jsBase + ".clip(%s);", clip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", clip1));
                js.setLength(0);
            }
        }
    }

    private VectorCursor cursor;

    public void setCursor(VectorCursor cursor) {
        if (jsBase == null) {
            this.cursor = cursor;
        } else {
            this.cursor = cursor;

            js.append(String.format(Locale.US, jsBase + ".cursor(%s);", (cursor != null) ? cursor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cursor(%s);", (cursor != null) ? cursor.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String desc;

    public void setDesc(String desc) {
        if (jsBase == null) {
            this.desc = desc;
        } else {
            this.desc = desc;

            js.append(String.format(Locale.US, jsBase + ".desc(%s);", desc));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".desc(%s);", desc));
                js.setLength(0);
            }
        }
    }

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;

            js.append(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
    }

    private Boolean disableStrokeScaling;

    public void setDisablestrokescaling(Boolean disableStrokeScaling) {
        if (jsBase == null) {
            this.disableStrokeScaling = disableStrokeScaling;
        } else {
            this.disableStrokeScaling = disableStrokeScaling;

            js.append(String.format(Locale.US, jsBase + ".disableStrokeScaling(%b);", disableStrokeScaling));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disableStrokeScaling(%b);", disableStrokeScaling));
                js.setLength(0);
            }
        }
    }

    private Boolean drag;
    private GraphicsMathRect drag1;

    public void setDrag(Boolean drag) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag = drag;
        } else {
            this.drag = drag;

            js.append(String.format(Locale.US, jsBase + ".drag(%b);", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%b);", drag));
                js.setLength(0);
            }
        }
    }


    public void setDrag(GraphicsMathRect drag1) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag1 = drag1;
        } else {
            this.drag1 = drag1;

            js.append(String.format(Locale.US, jsBase + ".drag(%s);", (drag1 != null) ? drag1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%s);", (drag1 != null) ? drag1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double cx1;
    private Double cy1;
    private Double rx;
    private Double ry;

    public void setEllipse(Double cx1, Double cy1, Double rx, Double ry) {
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

            js.append(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));
                js.setLength(0);
            }
        }
    }

    private GraphicsMathRect getGetAbsoluteBounds;

    public GraphicsMathRect getGetAbsoluteBounds() {
        if (getGetAbsoluteBounds == null)
            getGetAbsoluteBounds = new GraphicsMathRect(jsBase + ".getAbsoluteBounds()");

        return getGetAbsoluteBounds;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private Element element2;

    public void setHaschild(Element element2) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            
            this.element2 = element2;
        } else {
            this.element2 = element2;

            js.append(String.format(Locale.US, jsBase + ".hasChild(%s);", (element2 != null) ? element2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hasChild(%s);", (element2 != null) ? element2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private Double y;
    private String text;

    public void setHtml(Double x, Double y, String text) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
            this.text = text;
        } else {
            this.x = x;
            this.y = y;
            this.text = text;

            js.append(String.format(Locale.US, jsBase + ".html(%f, %f, %s);", x, y, text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".html(%f, %f, %s);", x, y, text));
                js.setLength(0);
            }
        }
    }

    private String id;

    public void setId(String id) {
        if (jsBase == null) {
            this.id = id;
        } else {
            this.id = id;

            js.append(String.format(Locale.US, jsBase + ".id(%s);", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", id));
                js.setLength(0);
            }
        }
    }

    private String src;
    private Double x1;
    private Double y1;
    private Double width;
    private Double height;

    public void setImage(String src, Double x1, Double y1, Double width, Double height) {
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

            js.append(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f);", src, x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f);", src, x1, y1, width, height));
                js.setLength(0);
            }
        }
    }

    private Element element3;

    public void setIndexofchild(Element element3) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            
            this.element3 = element3;
        } else {
            this.element3 = element3;

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (element3 != null) ? element3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (element3 != null) ? element3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Layer parent;
    private Stage parent1;

    public void setParent(Layer parent) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent = parent;
        } else {
            this.parent = parent;

            js.append(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parent(%s);", (parent != null) ? parent.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setParent(Stage parent1) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent1 = parent1;
        } else {
            this.parent1 = parent1;

            js.append(String.format(Locale.US, jsBase + ".parent(%s);", (parent1 != null) ? parent1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parent(%s);", (parent1 != null) ? parent1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x2;
    private Double y2;
    private Double width1;
    private Double height1;

    public void setRect(Double x2, Double y2, Double width1, Double height1) {
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

            js.append(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f);", x2, y2, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f);", x2, y2, width1, height1));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Element element4;

    public void setRemovechild(Element element4) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            
            this.element4 = element4;
        } else {
            this.element4 = element4;

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (element4 != null) ? element4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", (element4 != null) ? element4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));
                js.setLength(0);
            }
        }
    }

    private Double degrees;
    private Double cx2;
    private Double cy2;

    public void setRotate(Double degrees, Double cx2, Double cy2) {
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

            js.append(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx2, cy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx2, cy2));
                js.setLength(0);
            }
        }
    }

    private Double degrees1;
    private VectorAnchor anchor;
    private String anchor1;

    public void setRotatebyanchor(VectorAnchor anchor, Double degrees1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
        } else {
            this.anchor = anchor;
            this.degrees1 = degrees1;

            js.append(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %f);", (anchor != null) ? anchor.generateJs() : "null", degrees1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %f);", (anchor != null) ? anchor.generateJs() : "null", degrees1));
                js.setLength(0);
            }
        }
    }


    public void setRotatebyanchor(String anchor1, Double degrees1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
        } else {
            this.anchor1 = anchor1;
            this.degrees1 = degrees1;

            js.append(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %f);", anchor1, degrees1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%s, %f);", anchor1, degrees1));
                js.setLength(0);
            }
        }
    }

    private Double sx;
    private Double sy;
    private Double cx3;
    private Double cy3;

    public void setScale(Double sx, Double sy, Double cx3, Double cy3) {
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

            js.append(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx3, cy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx3, cy3));
                js.setLength(0);
            }
        }
    }

    private Double sx1;
    private Double sy1;
    private VectorAnchor anchor2;
    private String anchor3;

    public void setScalebyanchor(VectorAnchor anchor2, Double sx1, Double sy1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor2 = anchor2;
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
        } else {
            this.anchor2 = anchor2;
            this.sx1 = sx1;
            this.sy1 = sy1;

            js.append(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %f, %f);", (anchor2 != null) ? anchor2.generateJs() : "null", sx1, sy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %f, %f);", (anchor2 != null) ? anchor2.generateJs() : "null", sx1, sy1));
                js.setLength(0);
            }
        }
    }


    public void setScalebyanchor(String anchor3, Double sx1, Double sy1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor3 = anchor3;
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
        } else {
            this.anchor3 = anchor3;
            this.sx1 = sx1;
            this.sy1 = sy1;

            js.append(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %f, %f);", anchor3, sx1, sy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%s, %f, %f);", anchor3, sx1, sy1));
                js.setLength(0);
            }
        }
    }

    private Double x3;
    private Double y3;

    public void setSetposition(Double x3, Double y3) {
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
        } else {
            this.x3 = x3;
            this.y3 = y3;

            js.append(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x3, y3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x3, y3));
                js.setLength(0);
            }
        }
    }

    private Double degrees2;
    private Double cx4;
    private Double cy4;

    public void setSetrotation(Double degrees2, Double cx4, Double cy4) {
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

            js.append(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx4, cy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx4, cy4));
                js.setLength(0);
            }
        }
    }

    private Double degrees3;
    private VectorAnchor anchor4;
    private String anchor5;

    public void setSetrotationbyanchor(VectorAnchor anchor4, Double degrees3) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor4 = anchor4;
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
        } else {
            this.anchor4 = anchor4;
            this.degrees3 = degrees3;

            js.append(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %f);", (anchor4 != null) ? anchor4.generateJs() : "null", degrees3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %f);", (anchor4 != null) ? anchor4.generateJs() : "null", degrees3));
                js.setLength(0);
            }
        }
    }


    public void setSetrotationbyanchor(String anchor5, Double degrees3) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor5 = anchor5;
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
        } else {
            this.anchor5 = anchor5;
            this.degrees3 = degrees3;

            js.append(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %f);", anchor5, degrees3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%s, %f);", anchor5, degrees3));
                js.setLength(0);
            }
        }
    }

    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;

    public void setSettransformationmatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
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

            js.append(String.format(Locale.US, jsBase + ".setTransformationMatrix(%f, %f, %f, %f, %f, %f);", m6, m7, m8, m9, m10, m11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setTransformationMatrix(%f, %f, %f, %f, %f, %f);", m6, m7, m8, m9, m10, m11));
                js.setLength(0);
            }
        }
    }

    private Element element5;
    private Element element6;

    public void setSwapchildren(Element element5, Element element6) {
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

            js.append(String.format(Locale.US, jsBase + ".swapChildren(%s, %s);", (element5 != null) ? element5.generateJs() : "null", (element6 != null) ? element6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".swapChildren(%s, %s);", (element5 != null) ? element5.generateJs() : "null", (element6 != null) ? element6.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index3;
    private Double index4;

    public void setSwapchildrenat(Double index3, Double index4) {
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

            js.append(String.format(Locale.US, jsBase + ".swapChildrenAt(%f, %f);", index3, index4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".swapChildrenAt(%f, %f);", index3, index4));
                js.setLength(0);
            }
        }
    }

    private Double x4;
    private Double y4;
    private String text1;

    public void setText(Double x4, Double y4, String text1) {
        if (jsBase == null) {
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
            this.text = null;
            this.text1 = null;
            
            this.text1 = text1;
        } else {
            this.x4 = x4;
            this.y4 = y4;
            this.text1 = text1;

            js.append(String.format(Locale.US, jsBase + ".text(%f, %f, %s);", x4, y4, text1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%f, %f, %s);", x4, y4, text1));
                js.setLength(0);
            }
        }
    }

    private String title;

    public void setTitle(String title) {
        if (jsBase == null) {
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title));
                js.setLength(0);
            }
        }
    }

    private Double tx;
    private Double ty;

    public void setTranslate(Double tx, Double ty) {
        if (jsBase == null) {
            this.tx = tx;
            this.ty = ty;
        } else {
            this.tx = tx;
            this.ty = ty;

            js.append(String.format(Locale.US, jsBase + ".translate(%f, %f);", tx, ty));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translate(%f, %f);", tx, ty));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private Boolean isVisible;

    public void setVisible(Boolean isVisible) {
        if (jsBase == null) {
            this.isVisible = isVisible;
        } else {
            this.isVisible = isVisible;

            js.append(String.format(Locale.US, jsBase + ".visible(%b);", isVisible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".visible(%b);", isVisible));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetGetAbsoluteBounds() {
        if (getGetAbsoluteBounds != null) {
            return getGetAbsoluteBounds.generateJs();
        }
        return "";
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: %s,", (element != null) ? element.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement1() {
        if (element1 != null) {
            return String.format(Locale.US, "element: %s,", (element1 != null) ? element1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSm() {
        if (m != null) {
            return String.format(Locale.US, "m: %f,", m);
        }
        return "";
    }

    private String generateJSm1() {
        if (m1 != null) {
            return String.format(Locale.US, "m: %f,", m1);
        }
        return "";
    }

    private String generateJSm2() {
        if (m2 != null) {
            return String.format(Locale.US, "m: %f,", m2);
        }
        return "";
    }

    private String generateJSm3() {
        if (m3 != null) {
            return String.format(Locale.US, "m: %f,", m3);
        }
        return "";
    }

    private String generateJSm4() {
        if (m4 != null) {
            return String.format(Locale.US, "m: %f,", m4);
        }
        return "";
    }

    private String generateJSm5() {
        if (m5 != null) {
            return String.format(Locale.US, "m: %f,", m5);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", key1);
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSclip() {
        if (clip != null) {
            return String.format(Locale.US, "clip: %s,", (clip != null) ? clip.generateJs() : "null");
        }
        return "";
    }

    private String generateJSclip1() {
        if (clip1 != null) {
            return String.format(Locale.US, "clip: %s,", clip1);
        }
        return "";
    }

    private String generateJScursor() {
        if (cursor != null) {
            return String.format(Locale.US, "cursor: %s,", (cursor != null) ? cursor.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdesc() {
        if (desc != null) {
            return String.format(Locale.US, "desc: %s,", desc);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdisableStrokeScaling() {
        if (disableStrokeScaling != null) {
            return String.format(Locale.US, "disableStrokeScaling: %b,", disableStrokeScaling);
        }
        return "";
    }

    private String generateJSdrag() {
        if (drag != null) {
            return String.format(Locale.US, "drag: %b,", drag);
        }
        return "";
    }

    private String generateJSdrag1() {
        if (drag1 != null) {
            return String.format(Locale.US, "drag: %s,", (drag1 != null) ? drag1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSrx() {
        if (rx != null) {
            return String.format(Locale.US, "rx: %f,", rx);
        }
        return "";
    }

    private String generateJSry() {
        if (ry != null) {
            return String.format(Locale.US, "ry: %f,", ry);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSelement2() {
        if (element2 != null) {
            return String.format(Locale.US, "element: %s,", (element2 != null) ? element2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %s,", id);
        }
        return "";
    }

    private String generateJSsrc() {
        if (src != null) {
            return String.format(Locale.US, "src: %s,", src);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %f,", x1);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %f,", y1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSelement3() {
        if (element3 != null) {
            return String.format(Locale.US, "element: %s,", (element3 != null) ? element3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSparent() {
        if (parent != null) {
            return String.format(Locale.US, "parent: %s,", (parent != null) ? parent.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparent1() {
        if (parent1 != null) {
            return String.format(Locale.US, "parent: %s,", (parent1 != null) ? parent1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSelement4() {
        if (element4 != null) {
            return String.format(Locale.US, "element: %s,", (element4 != null) ? element4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSdegrees() {
        if (degrees != null) {
            return String.format(Locale.US, "degrees: %f,", degrees);
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSdegrees1() {
        if (degrees1 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees1);
        }
        return "";
    }

    private String generateJSanchor() {
        if (anchor != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor != null) ? anchor.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor1() {
        if (anchor1 != null) {
            return String.format(Locale.US, "anchor: %s,", anchor1);
        }
        return "";
    }

    private String generateJSsx() {
        if (sx != null) {
            return String.format(Locale.US, "sx: %f,", sx);
        }
        return "";
    }

    private String generateJSsy() {
        if (sy != null) {
            return String.format(Locale.US, "sy: %f,", sy);
        }
        return "";
    }

    private String generateJScx3() {
        if (cx3 != null) {
            return String.format(Locale.US, "cx: %f,", cx3);
        }
        return "";
    }

    private String generateJScy3() {
        if (cy3 != null) {
            return String.format(Locale.US, "cy: %f,", cy3);
        }
        return "";
    }

    private String generateJSsx1() {
        if (sx1 != null) {
            return String.format(Locale.US, "sx: %f,", sx1);
        }
        return "";
    }

    private String generateJSsy1() {
        if (sy1 != null) {
            return String.format(Locale.US, "sy: %f,", sy1);
        }
        return "";
    }

    private String generateJSanchor2() {
        if (anchor2 != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor2 != null) ? anchor2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor3() {
        if (anchor3 != null) {
            return String.format(Locale.US, "anchor: %s,", anchor3);
        }
        return "";
    }

    private String generateJSx3() {
        if (x3 != null) {
            return String.format(Locale.US, "x: %f,", x3);
        }
        return "";
    }

    private String generateJSy3() {
        if (y3 != null) {
            return String.format(Locale.US, "y: %f,", y3);
        }
        return "";
    }

    private String generateJSdegrees2() {
        if (degrees2 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees2);
        }
        return "";
    }

    private String generateJScx4() {
        if (cx4 != null) {
            return String.format(Locale.US, "cx: %f,", cx4);
        }
        return "";
    }

    private String generateJScy4() {
        if (cy4 != null) {
            return String.format(Locale.US, "cy: %f,", cy4);
        }
        return "";
    }

    private String generateJSdegrees3() {
        if (degrees3 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees3);
        }
        return "";
    }

    private String generateJSanchor4() {
        if (anchor4 != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor4 != null) ? anchor4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor5() {
        if (anchor5 != null) {
            return String.format(Locale.US, "anchor: %s,", anchor5);
        }
        return "";
    }

    private String generateJSm6() {
        if (m6 != null) {
            return String.format(Locale.US, "m: %f,", m6);
        }
        return "";
    }

    private String generateJSm7() {
        if (m7 != null) {
            return String.format(Locale.US, "m: %f,", m7);
        }
        return "";
    }

    private String generateJSm8() {
        if (m8 != null) {
            return String.format(Locale.US, "m: %f,", m8);
        }
        return "";
    }

    private String generateJSm9() {
        if (m9 != null) {
            return String.format(Locale.US, "m: %f,", m9);
        }
        return "";
    }

    private String generateJSm10() {
        if (m10 != null) {
            return String.format(Locale.US, "m: %f,", m10);
        }
        return "";
    }

    private String generateJSm11() {
        if (m11 != null) {
            return String.format(Locale.US, "m: %f,", m11);
        }
        return "";
    }

    private String generateJSelement5() {
        if (element5 != null) {
            return String.format(Locale.US, "element: %s,", (element5 != null) ? element5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement6() {
        if (element6 != null) {
            return String.format(Locale.US, "element: %s,", (element6 != null) ? element6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJSx4() {
        if (x4 != null) {
            return String.format(Locale.US, "x: %f,", x4);
        }
        return "";
    }

    private String generateJSy4() {
        if (y4 != null) {
            return String.format(Locale.US, "y: %f,", y4);
        }
        return "";
    }

    private String generateJStext1() {
        if (text1 != null) {
            return String.format(Locale.US, "text: %s,", text1);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %s,", title);
        }
        return "";
    }

    private String generateJStx() {
        if (tx != null) {
            return String.format(Locale.US, "tx: %f,", tx);
        }
        return "";
    }

    private String generateJSty() {
        if (ty != null) {
            return String.format(Locale.US, "ty: %f,", ty);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSisVisible() {
        if (isVisible != null) {
            return String.format(Locale.US, "isVisible: %b,", isVisible);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSelement());
            js.append(generateJSelement1());
            js.append(generateJSindex());
            js.append(generateJSm());
            js.append(generateJSm1());
            js.append(generateJSm2());
            js.append(generateJSm3());
            js.append(generateJSm4());
            js.append(generateJSm5());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSradius());
            js.append(generateJSclip());
            js.append(generateJSclip1());
            js.append(generateJScursor());
            js.append(generateJSdesc());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdisableStrokeScaling());
            js.append(generateJSdrag());
            js.append(generateJSdrag1());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSrx());
            js.append(generateJSry());
            js.append(generateJSindex1());
            js.append(generateJSelement2());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJStext());
            js.append(generateJSid());
            js.append(generateJSsrc());
            js.append(generateJSx1());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append(generateJSelement3());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSparent());
            js.append(generateJSparent1());
            js.append(generateJSx2());
            js.append(generateJSy2());
            js.append(generateJSwidth1());
            js.append(generateJSheight1());
            js.append(generateJStype2());
            js.append(generateJSelement4());
            js.append(generateJSindex2());
            js.append(generateJSdegrees());
            js.append(generateJScx2());
            js.append(generateJScy2());
            js.append(generateJSdegrees1());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSsx());
            js.append(generateJSsy());
            js.append(generateJScx3());
            js.append(generateJScy3());
            js.append(generateJSsx1());
            js.append(generateJSsy1());
            js.append(generateJSanchor2());
            js.append(generateJSanchor3());
            js.append(generateJSx3());
            js.append(generateJSy3());
            js.append(generateJSdegrees2());
            js.append(generateJScx4());
            js.append(generateJScy4());
            js.append(generateJSdegrees3());
            js.append(generateJSanchor4());
            js.append(generateJSanchor5());
            js.append(generateJSm6());
            js.append(generateJSm7());
            js.append(generateJSm8());
            js.append(generateJSm9());
            js.append(generateJSm10());
            js.append(generateJSm11());
            js.append(generateJSelement5());
            js.append(generateJSelement6());
            js.append(generateJSindex3());
            js.append(generateJSindex4());
            js.append(generateJSx4());
            js.append(generateJSy4());
            js.append(generateJStext1());
            js.append(generateJStitle());
            js.append(generateJStx());
            js.append(generateJSty());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSisVisible());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetClip());
            js.append(generateJSgetGetAbsoluteBounds());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
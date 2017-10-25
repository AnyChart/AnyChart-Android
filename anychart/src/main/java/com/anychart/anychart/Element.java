package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Element extends JsObject {

    public Element() {

    }

    protected Element(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Element(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    public Element appendTransformationMatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
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
                onChangeListener.onChange(String.format(Locale.US, ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f)", m, m1, m2, m3, m4, m5));
                js.setLength(0);
            }
        }
        return this;
    }

    private String key;

    public Element setAttr(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".attr(%s)", wrapQuotes(key)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".attr(%s)", wrapQuotes(key)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect getClip;

    public GraphicsMathRect getClip() {
        if (getClip == null)
            getClip = new GraphicsMathRect(jsBase + ".clip()");

        return getClip;
    }

    private GraphicsMathRect clip;
    private String clip1;

    public Element setClip(GraphicsMathRect clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".clip(%s)", ((clip != null) ? clip.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".clip(%s)", ((clip != null) ? clip.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element setClip(String clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".clip(%s)", wrapQuotes(clip1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".clip(%s)", wrapQuotes(clip1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private VectorCursor cursor;

    public Element setCursor(VectorCursor cursor) {
        if (jsBase == null) {
            this.cursor = cursor;
        } else {
            this.cursor = cursor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cursor(%s)", ((cursor != null) ? cursor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cursor(%s)", ((cursor != null) ? cursor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String desc;

    public Element setDesc(String desc) {
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
                onChangeListener.onChange(String.format(Locale.US, ".desc(%s)", wrapQuotes(desc)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    public Element disablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disableStrokeScaling;

    public Element setDisableStrokeScaling(Boolean disableStrokeScaling) {
        if (jsBase == null) {
            this.disableStrokeScaling = disableStrokeScaling;
        } else {
            this.disableStrokeScaling = disableStrokeScaling;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".disableStrokeScaling(%b)", disableStrokeScaling));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".disableStrokeScaling(%b)", disableStrokeScaling));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean drag;
    private GraphicsMathRect drag1;

    public Element drag(Boolean drag) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag = drag;
        } else {
            this.drag = drag;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".drag(%b)", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drag(%b)", drag));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element drag(GraphicsMathRect drag1) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag1 = drag1;
        } else {
            this.drag1 = drag1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".drag(%s)", ((drag1 != null) ? drag1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drag(%s)", ((drag1 != null) ? drag1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect getGetAbsoluteBounds;

    public GraphicsMathRect getGetAbsoluteBounds() {
        if (getGetAbsoluteBounds == null)
            getGetAbsoluteBounds = new GraphicsMathRect(jsBase + ".getAbsoluteBounds()");

        return getGetAbsoluteBounds;
    }

    private String id;

    public Element setId(String id) {
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
                onChangeListener.onChange(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void listen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", wrapQuotes(type), useCapture, wrapQuotes(listenerScope)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s)", wrapQuotes(type), useCapture, wrapQuotes(listenerScope)));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void listenOnce(String type1, Boolean useCapture1, String listenerScope1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", wrapQuotes(type1), useCapture1, wrapQuotes(listenerScope1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s)", wrapQuotes(type1), useCapture1, wrapQuotes(listenerScope1)));
                js.setLength(0);
            }
        }
    }

    private Layer parent;
    private Stage parent1;

    public Element parent(Layer parent) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent = parent;
        } else {
            this.parent = parent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parent(%s)", ((parent != null) ? parent.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parent(%s)", ((parent != null) ? parent.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element parent(Stage parent1) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent1 = parent1;
        } else {
            this.parent1 = parent1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parent(%s)", ((parent1 != null) ? parent1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parent(%s)", ((parent1 != null) ? parent1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String type2;

    public void removeAllListeners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s)", wrapQuotes(type2)));
                js.setLength(0);
            }
        }
    }

    private Double degrees;
    private Double cx;
    private Double cy;

    public Element rotate(Double degrees, Double cx, Double cy) {
        if (jsBase == null) {
            this.degrees = degrees;
            this.cx = cx;
            this.cy = cy;
        } else {
            this.degrees = degrees;
            this.cx = cx;
            this.cy = cy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rotate(%f, %f, %f)", degrees, cx, cy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rotate(%f, %f, %f)", degrees, cx, cy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees1;
    private VectorAnchor anchor;
    private String anchor1;

    public Element rotateByAnchor(VectorAnchor anchor, Double degrees1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rotateByAnchor(%s, %f)", ((anchor != null) ? anchor.generateJs() : "null"), degrees1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rotateByAnchor(%s, %f)", ((anchor != null) ? anchor.generateJs() : "null"), degrees1));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element rotateByAnchor(String anchor1, Double degrees1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rotateByAnchor(%s, %f)", wrapQuotes(anchor1), degrees1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rotateByAnchor(%s, %f)", wrapQuotes(anchor1), degrees1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double sx;
    private Double sy;
    private Double cx1;
    private Double cy1;

    public Element scale(Double sx, Double sy, Double cx1, Double cy1) {
        if (jsBase == null) {
            this.sx = sx;
            this.sy = sy;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
        } else {
            this.sx = sx;
            this.sy = sy;
            this.cx1 = cx1;
            this.cy1 = cy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scale(%f, %f, %f, %f)", sx, sy, cx1, cy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%f, %f, %f, %f)", sx, sy, cx1, cy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double sx1;
    private Double sy1;
    private VectorAnchor anchor2;
    private String anchor3;

    public Element scaleByAnchor(VectorAnchor anchor2, Double sx1, Double sy1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scaleByAnchor(%s, %f, %f)", ((anchor2 != null) ? anchor2.generateJs() : "null"), sx1, sy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scaleByAnchor(%s, %f, %f)", ((anchor2 != null) ? anchor2.generateJs() : "null"), sx1, sy1));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element scaleByAnchor(String anchor3, Double sx1, Double sy1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scaleByAnchor(%s, %f, %f)", wrapQuotes(anchor3), sx1, sy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scaleByAnchor(%s, %f, %f)", wrapQuotes(anchor3), sx1, sy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x;
    private Double y;

    public Element setSetPosition(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setPosition(%f, %f)", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setPosition(%f, %f)", x, y));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees2;
    private Double cx2;
    private Double cy2;

    public Element setRotation(Double degrees2, Double cx2, Double cy2) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            
            this.degrees2 = degrees2;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
        } else {
            this.degrees2 = degrees2;
            this.cx2 = cx2;
            this.cy2 = cy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setRotation(%f, %f, %f)", degrees2, cx2, cy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setRotation(%f, %f, %f)", degrees2, cx2, cy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees3;
    private VectorAnchor anchor4;
    private String anchor5;

    public Element setRotationByAnchor(VectorAnchor anchor4, Double degrees3) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setRotationByAnchor(%s, %f)", ((anchor4 != null) ? anchor4.generateJs() : "null"), degrees3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setRotationByAnchor(%s, %f)", ((anchor4 != null) ? anchor4.generateJs() : "null"), degrees3));
                js.setLength(0);
            }
        }
        return this;
    }


    public Element setRotationByAnchor(String anchor5, Double degrees3) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setRotationByAnchor(%s, %f)", wrapQuotes(anchor5), degrees3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setRotationByAnchor(%s, %f)", wrapQuotes(anchor5), degrees3));
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

    public Element setSetTransformationMatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
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
                onChangeListener.onChange(String.format(Locale.US, ".setTransformationMatrix(%f, %f, %f, %f, %f, %f)", m6, m7, m8, m9, m10, m11));
                js.setLength(0);
            }
        }
        return this;
    }

    private String title;

    public Element setTitle(String title) {
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
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double tx;
    private Double ty;

    public Element translate(Double tx, Double ty) {
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
                onChangeListener.onChange(String.format(Locale.US, ".translate(%f, %f)", tx, ty));
                js.setLength(0);
            }
        }
        return this;
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void unlisten(String type3, Boolean useCapture2, String listenerScope2) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", wrapQuotes(type3), useCapture2, wrapQuotes(listenerScope2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s)", wrapQuotes(type3), useCapture2, wrapQuotes(listenerScope2)));
                js.setLength(0);
            }
        }
    }

    private String key1;

    public void unlistenByKey(String key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s)", wrapQuotes(key1)));
                js.setLength(0);
            }
        }
    }

    private Boolean isVisible;

    public Element visible(Boolean isVisible) {
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
                onChangeListener.onChange(String.format(Locale.US, ".visible(%b)", isVisible));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double zIndex;

    public Element setZIndex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".zIndex(%f)", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zIndex(%f)", zIndex));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSGraphicsMathRect getClip() {
//        if (GraphicsMathRect getClip != null) {
//            return GraphicsMathRect getClip.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSGraphicsMathRect getGetAbsoluteBounds() {
//        if (GraphicsMathRect getGetAbsoluteBounds != null) {
//            return GraphicsMathRect getGetAbsoluteBounds.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
            //return String.format(Locale.US, "getClip: %s,", ((getClip != null) ? getClip.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetGetAbsoluteBounds() {
        if (getGetAbsoluteBounds != null) {
            return getGetAbsoluteBounds.generateJs();
            //return String.format(Locale.US, "getGetAbsoluteBounds: %s,", ((getGetAbsoluteBounds != null) ? getGetAbsoluteBounds.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetGetAbsoluteBounds());

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
//            js.append(generateJSm());
////        
//            js.append(generateJSm1());
////        
//            js.append(generateJSm2());
////        
//            js.append(generateJSm3());
////        
//            js.append(generateJSm4());
////        
//            js.append(generateJSm5());
////        
//            js.append(generateJSkey());
////        
//            js.append(generateJSclip());
////        
//            js.append(generateJSclip1());
////        
//            js.append(generateJScursor());
////        
//            js.append(generateJSdesc());
////        
//            js.append(generateJSdisablePointerEvents());
////        
//            js.append(generateJSdisableStrokeScaling());
////        
//            js.append(generateJSdrag());
////        
//            js.append(generateJSdrag1());
////        
//            js.append(generateJSid());
////        
//            js.append(generateJStype());
////        
//            js.append(generateJSuseCapture());
////        
//            js.append(generateJSlistenerScope());
////        
//            js.append(generateJStype1());
////        
//            js.append(generateJSuseCapture1());
////        
//            js.append(generateJSlistenerScope1());
////        
//            js.append(generateJSparent());
////        
//            js.append(generateJSparent1());
////        
//            js.append(generateJStype2());
////        
//            js.append(generateJSdegrees());
////        
//            js.append(generateJScx());
////        
//            js.append(generateJScy());
////        
//            js.append(generateJSdegrees1());
////        
//            js.append(generateJSanchor());
////        
//            js.append(generateJSanchor1());
////        
//            js.append(generateJSsx());
////        
//            js.append(generateJSsy());
////        
//            js.append(generateJScx1());
////        
//            js.append(generateJScy1());
////        
//            js.append(generateJSsx1());
////        
//            js.append(generateJSsy1());
////        
//            js.append(generateJSanchor2());
////        
//            js.append(generateJSanchor3());
////        
//            js.append(generateJSx());
////        
//            js.append(generateJSy());
////        
//            js.append(generateJSdegrees2());
////        
//            js.append(generateJScx2());
////        
//            js.append(generateJScy2());
////        
//            js.append(generateJSdegrees3());
////        
//            js.append(generateJSanchor4());
////        
//            js.append(generateJSanchor5());
////        
//            js.append(generateJSm6());
////        
//            js.append(generateJSm7());
////        
//            js.append(generateJSm8());
////        
//            js.append(generateJSm9());
////        
//            js.append(generateJSm10());
////        
//            js.append(generateJSm11());
////        
//            js.append(generateJStitle());
////        
//            js.append(generateJStx());
////        
//            js.append(generateJSty());
////        
//            js.append(generateJStype3());
////        
//            js.append(generateJSuseCapture2());
////        
//            js.append(generateJSlistenerScope2());
////        
//            js.append(generateJSkey1());
////        
//            js.append(generateJSisVisible());
////        
//            js.append(generateJSzIndex());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
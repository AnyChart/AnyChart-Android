package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class VectorRect extends Shape {

    private String jsBase;

    public VectorRect() {

    }

    protected VectorRect(String jsBase) {
        this.jsBase = jsBase;
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

    private String radiusAll;
    private Double radiusAll1;

    public void setCut(String radiusAll) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll = radiusAll;
        } else {
            this.radiusAll = radiusAll;

            js.append(String.format(Locale.US, jsBase + ".cut(%s);", radiusAll));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%s);", radiusAll));
                js.setLength(0);
            }
        }
    }


    public void setCut(Double radiusAll1) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll1 = radiusAll1;
        } else {
            this.radiusAll1 = radiusAll1;

            js.append(String.format(Locale.US, jsBase + ".cut(%f);", radiusAll1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%f);", radiusAll1));
                js.setLength(0);
            }
        }
    }

    private Double radiusLeftTop;
    private Double radiusRightTop;
    private Double radiusRightBottom;
    private Double radiusLeftBottom;

    public void setCut(Double radiusLeftTop, Double radiusRightTop, Double radiusRightBottom, Double radiusLeftBottom) {
        if (jsBase == null) {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;
        } else {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;

            js.append(String.format(Locale.US, jsBase + ".cut(%f, %f, %f, %f);", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%f, %f, %f, %f);", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));
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

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
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

    private Double degrees;
    private Double cx1;
    private Double cy1;

    public void setRotate(Double degrees, Double cx1, Double cy1) {
        if (jsBase == null) {
            this.degrees = degrees;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
        } else {
            this.degrees = degrees;
            this.cx1 = cx1;
            this.cy1 = cy1;

            js.append(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx1, cy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx1, cy1));
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

    private String radiusAll2;
    private Double radiusAll3;

    public void setRound(String radiusAll2) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll2 = radiusAll2;
        } else {
            this.radiusAll2 = radiusAll2;

            js.append(String.format(Locale.US, jsBase + ".round(%s);", radiusAll2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%s);", radiusAll2));
                js.setLength(0);
            }
        }
    }


    public void setRound(Double radiusAll3) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll3 = radiusAll3;
        } else {
            this.radiusAll3 = radiusAll3;

            js.append(String.format(Locale.US, jsBase + ".round(%f);", radiusAll3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%f);", radiusAll3));
                js.setLength(0);
            }
        }
    }

    private Double radiusLeftTop1;
    private Double radiusRightTop1;
    private Double radiusRightBottom1;
    private Double radiusLeftBottom1;

    public void setRound(Double radiusLeftTop1, Double radiusRightTop1, Double radiusRightBottom1, Double radiusLeftBottom1) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            
            this.radiusLeftBottom1 = radiusLeftBottom1;
        } else {
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom1 = radiusLeftBottom1;

            js.append(String.format(Locale.US, jsBase + ".round(%f, %f, %f, %f);", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%f, %f, %f, %f);", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));
                js.setLength(0);
            }
        }
    }

    private String radiusAll4;
    private Double radiusAll5;

    public void setRoundinner(String radiusAll4) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll4 = radiusAll4;
        } else {
            this.radiusAll4 = radiusAll4;

            js.append(String.format(Locale.US, jsBase + ".roundInner(%s);", radiusAll4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%s);", radiusAll4));
                js.setLength(0);
            }
        }
    }


    public void setRoundinner(Double radiusAll5) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll5 = radiusAll5;
        } else {
            this.radiusAll5 = radiusAll5;

            js.append(String.format(Locale.US, jsBase + ".roundInner(%f);", radiusAll5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%f);", radiusAll5));
                js.setLength(0);
            }
        }
    }

    private Double radiusLeftTop2;
    private Double radiusRightTop2;
    private Double radiusRightBottom2;
    private Double radiusLeftBottom2;

    public void setRoundinner(Double radiusLeftTop2, Double radiusRightTop2, Double radiusRightBottom2, Double radiusLeftBottom2) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            this.radiusLeftTop2 = null;
            
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            this.radiusRightTop2 = null;
            
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            this.radiusRightBottom2 = null;
            
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            this.radiusLeftBottom2 = null;
            
            this.radiusLeftBottom2 = radiusLeftBottom2;
        } else {
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom2 = radiusLeftBottom2;

            js.append(String.format(Locale.US, jsBase + ".roundInner(%f, %f, %f, %f);", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%f, %f, %f, %f);", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));
                js.setLength(0);
            }
        }
    }

    private Double sx;
    private Double sy;
    private Double cx2;
    private Double cy2;

    public void setScale(Double sx, Double sy, Double cx2, Double cy2) {
        if (jsBase == null) {
            this.sx = sx;
            this.sy = sy;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
        } else {
            this.sx = sx;
            this.sy = sy;
            this.cx2 = cx2;
            this.cy2 = cy2;

            js.append(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx2, cy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx2, cy2));
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

    private GraphicsMathRect setBounds;

    public void setSetbounds(GraphicsMathRect setBounds) {
        if (jsBase == null) {
            this.setBounds = setBounds;
        } else {
            this.setBounds = setBounds;

            js.append(String.format(Locale.US, jsBase + ".setBounds(%s);", (setBounds != null) ? setBounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setBounds(%s);", (setBounds != null) ? setBounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double setHeight;

    public void setSetheight(Double setHeight) {
        if (jsBase == null) {
            this.setHeight = setHeight;
        } else {
            this.setHeight = setHeight;

            js.append(String.format(Locale.US, jsBase + ".setHeight(%f);", setHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setHeight(%f);", setHeight));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private Double y;

    public void setSetposition(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;

            js.append(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x, y));
                js.setLength(0);
            }
        }
    }

    private Double degrees2;
    private Double cx3;
    private Double cy3;

    public void setSetrotation(Double degrees2, Double cx3, Double cy3) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            
            this.degrees2 = degrees2;
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
            this.degrees2 = degrees2;
            this.cx3 = cx3;
            this.cy3 = cy3;

            js.append(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx3, cy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx3, cy3));
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

    private Double setWidth;

    public void setSetwidth(Double setWidth) {
        if (jsBase == null) {
            this.setWidth = setWidth;
        } else {
            this.setWidth = setWidth;

            js.append(String.format(Locale.US, jsBase + ".setWidth(%f);", setWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setWidth(%f);", setWidth));
                js.setLength(0);
            }
        }
    }

    private Double setX;

    public void setSetx(Double setX) {
        if (jsBase == null) {
            this.setX = setX;
        } else {
            this.setX = setX;

            js.append(String.format(Locale.US, jsBase + ".setX(%f);", setX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setX(%f);", setX));
                js.setLength(0);
            }
        }
    }

    private Double setY;

    public void setSety(Double setY) {
        if (jsBase == null) {
            this.setY = setY;
        } else {
            this.setY = setY;

            js.append(String.format(Locale.US, jsBase + ".setY(%f);", setY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setY(%f);", setY));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;

    public void setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
        } else {
            this.stroke = stroke;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill stroke1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
        } else {
            this.stroke1 = stroke1;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke1 != null) ? stroke1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke1 != null) ? stroke1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String stroke2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
        } else {
            this.stroke2 = stroke2;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", stroke2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", stroke2));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke3;
    private ColoredFill stroke4;
    private String stroke5;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke stroke3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke3 = stroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke3 = stroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill stroke4, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke4 = stroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke4 = stroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke4 != null) ? stroke4.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke4 != null) ? stroke4.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String stroke5, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke5 = stroke5;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke5 = stroke5;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke5, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke5, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double strokeThickness;

    public void setStrokethickness(Double strokeThickness) {
        if (jsBase == null) {
            this.strokeThickness = strokeThickness;
        } else {
            this.strokeThickness = strokeThickness;

            js.append(String.format(Locale.US, jsBase + ".strokeThickness(%f);", strokeThickness));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".strokeThickness(%f);", strokeThickness));
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

    private String generateJSradiusAll() {
        if (radiusAll != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll);
        }
        return "";
    }

    private String generateJSradiusAll1() {
        if (radiusAll1 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll1);
        }
        return "";
    }

    private String generateJSradiusLeftTop() {
        if (radiusLeftTop != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop);
        }
        return "";
    }

    private String generateJSradiusRightTop() {
        if (radiusRightTop != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop);
        }
        return "";
    }

    private String generateJSradiusRightBottom() {
        if (radiusRightBottom != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom);
        }
        return "";
    }

    private String generateJSradiusLeftBottom() {
        if (radiusLeftBottom != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom);
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

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
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

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %s,", id);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSdegrees() {
        if (degrees != null) {
            return String.format(Locale.US, "degrees: %f,", degrees);
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

    private String generateJSradiusAll2() {
        if (radiusAll2 != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll2);
        }
        return "";
    }

    private String generateJSradiusAll3() {
        if (radiusAll3 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll3);
        }
        return "";
    }

    private String generateJSradiusLeftTop1() {
        if (radiusLeftTop1 != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop1);
        }
        return "";
    }

    private String generateJSradiusRightTop1() {
        if (radiusRightTop1 != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop1);
        }
        return "";
    }

    private String generateJSradiusRightBottom1() {
        if (radiusRightBottom1 != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom1);
        }
        return "";
    }

    private String generateJSradiusLeftBottom1() {
        if (radiusLeftBottom1 != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom1);
        }
        return "";
    }

    private String generateJSradiusAll4() {
        if (radiusAll4 != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll4);
        }
        return "";
    }

    private String generateJSradiusAll5() {
        if (radiusAll5 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll5);
        }
        return "";
    }

    private String generateJSradiusLeftTop2() {
        if (radiusLeftTop2 != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop2);
        }
        return "";
    }

    private String generateJSradiusRightTop2() {
        if (radiusRightTop2 != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop2);
        }
        return "";
    }

    private String generateJSradiusRightBottom2() {
        if (radiusRightBottom2 != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom2);
        }
        return "";
    }

    private String generateJSradiusLeftBottom2() {
        if (radiusLeftBottom2 != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom2);
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

    private String generateJSsetBounds() {
        if (setBounds != null) {
            return String.format(Locale.US, "setBounds: %s,", (setBounds != null) ? setBounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsetHeight() {
        if (setHeight != null) {
            return String.format(Locale.US, "setHeight: %f,", setHeight);
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

    private String generateJSdegrees2() {
        if (degrees2 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees2);
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

    private String generateJSsetWidth() {
        if (setWidth != null) {
            return String.format(Locale.US, "setWidth: %f,", setWidth);
        }
        return "";
    }

    private String generateJSsetX() {
        if (setX != null) {
            return String.format(Locale.US, "setX: %f,", setX);
        }
        return "";
    }

    private String generateJSsetY() {
        if (setY != null) {
            return String.format(Locale.US, "setY: %f,", setY);
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
        }
        return "";
    }

    private String generateJSstroke3() {
        if (stroke3 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke3 != null) ? stroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke4() {
        if (stroke4 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke4 != null) ? stroke4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke5() {
        if (stroke5 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke5);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeThickness() {
        if (strokeThickness != null) {
            return String.format(Locale.US, "strokeThickness: %f,", strokeThickness);
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
            js.append(generateJSm());
            js.append(generateJSm1());
            js.append(generateJSm2());
            js.append(generateJSm3());
            js.append(generateJSm4());
            js.append(generateJSm5());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJSclip());
            js.append(generateJSclip1());
            js.append(generateJScursor());
            js.append(generateJSradiusAll());
            js.append(generateJSradiusAll1());
            js.append(generateJSradiusLeftTop());
            js.append(generateJSradiusRightTop());
            js.append(generateJSradiusRightBottom());
            js.append(generateJSradiusLeftBottom());
            js.append(generateJSdesc());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdisableStrokeScaling());
            js.append(generateJSdrag());
            js.append(generateJSdrag1());
            js.append(generateJSfill());
            js.append(generateJScolor());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSid());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSparent());
            js.append(generateJSparent1());
            js.append(generateJStype2());
            js.append(generateJSdegrees());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSdegrees1());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSradiusAll2());
            js.append(generateJSradiusAll3());
            js.append(generateJSradiusLeftTop1());
            js.append(generateJSradiusRightTop1());
            js.append(generateJSradiusRightBottom1());
            js.append(generateJSradiusLeftBottom1());
            js.append(generateJSradiusAll4());
            js.append(generateJSradiusAll5());
            js.append(generateJSradiusLeftTop2());
            js.append(generateJSradiusRightTop2());
            js.append(generateJSradiusRightBottom2());
            js.append(generateJSradiusLeftBottom2());
            js.append(generateJSsx());
            js.append(generateJSsy());
            js.append(generateJScx2());
            js.append(generateJScy2());
            js.append(generateJSsx1());
            js.append(generateJSsy1());
            js.append(generateJSanchor2());
            js.append(generateJSanchor3());
            js.append(generateJSsetBounds());
            js.append(generateJSsetHeight());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJSdegrees2());
            js.append(generateJScx3());
            js.append(generateJScy3());
            js.append(generateJSdegrees3());
            js.append(generateJSanchor4());
            js.append(generateJSanchor5());
            js.append(generateJSm6());
            js.append(generateJSm7());
            js.append(generateJSm8());
            js.append(generateJSm9());
            js.append(generateJSm10());
            js.append(generateJSm11());
            js.append(generateJSsetWidth());
            js.append(generateJSsetX());
            js.append(generateJSsetY());
            js.append(generateJSstroke());
            js.append(generateJSstroke1());
            js.append(generateJSstroke2());
            js.append(generateJSstroke3());
            js.append(generateJSstroke4());
            js.append(generateJSstroke5());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSstrokeThickness());
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
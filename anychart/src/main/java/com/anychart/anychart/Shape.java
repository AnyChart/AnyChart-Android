package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Shape extends JsObject {

    
    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    public void setAppendtransformationmatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
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
    }

    private String key;

    public void setAttr(String key) {
        this.key = key;
    }

    private String key1;
    private Rect clip;
    private String clip1;

    public void setClip(Rect clip) {
        this.clip = null;
        this.clip1 = null;
        
        this.clip = clip;
    }


    public void setClip(String clip1) {
        this.clip = null;
        this.clip1 = null;
        
        this.clip1 = clip1;
    }

    private Cursor cursor;

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        this.disablePointerEvents = disablePointerEvents;
    }

    private Boolean disableStrokeScaling;

    public void setDisablestrokescaling(Boolean disableStrokeScaling) {
        this.disableStrokeScaling = disableStrokeScaling;
    }

    private Boolean drag;
    private Rect drag1;

    public void setDrag(Boolean drag) {
        this.drag = null;
        this.drag1 = null;
        
        this.drag = drag;
    }


    public void setDrag(Rect drag1) {
        this.drag = null;
        this.drag1 = null;
        
        this.drag1 = drag1;
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }


    public void setFill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Layer parent;
    private Stage parent1;

    public void setParent(Layer parent) {
        this.parent = null;
        this.parent1 = null;
        
        this.parent = parent;
    }


    public void setParent(Stage parent1) {
        this.parent = null;
        this.parent1 = null;
        
        this.parent1 = parent1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double degrees;
    private Double cx1;
    private Double cy1;

    public void setRotate(Double degrees, Double cx1, Double cy1) {
        this.degrees = degrees;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
    }

    private Double degrees1;
    private Anchor anchor;
    private String anchor1;

    public void setRotatebyanchor(Anchor anchor, Double degrees1) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor = anchor;
        this.degrees = null;
        this.degrees1 = null;
        
        this.degrees1 = degrees1;
    }


    public void setRotatebyanchor(String anchor1, Double degrees1) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor1 = anchor1;
        this.degrees = null;
        this.degrees1 = null;
        
        this.degrees1 = degrees1;
    }

    private Double sx;
    private Double sy;
    private Double cx2;
    private Double cy2;

    public void setScale(Double sx, Double sy, Double cx2, Double cy2) {
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
    }

    private Double sx1;
    private Double sy1;
    private Anchor anchor2;
    private String anchor3;

    public void setScalebyanchor(Anchor anchor2, Double sx1, Double sy1) {
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
    }


    public void setScalebyanchor(String anchor3, Double sx1, Double sy1) {
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
    }

    private Double x;
    private Double y;

    public void setSetposition(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    private Double degrees2;
    private Double cx3;
    private Double cy3;

    public void setSetrotation(Double degrees2, Double cx3, Double cy3) {
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
    }

    private Double degrees3;
    private Anchor anchor4;
    private String anchor5;

    public void setSetrotationbyanchor(Anchor anchor4, Double degrees3) {
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
    }


    public void setSetrotationbyanchor(String anchor5, Double degrees3) {
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
    }

    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;

    public void setSettransformationmatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
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
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;

    public void setStroke(Stroke stroke) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke = stroke;
    }


    public void setStroke(ColoredFill stroke1) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke1 = stroke1;
    }


    public void setStroke(String stroke2) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke2 = stroke2;
    }

    private Stroke stroke3;
    private ColoredFill stroke4;
    private String stroke5;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke stroke3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    }


    public void setStroke(ColoredFill stroke4, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    }


    public void setStroke(String stroke5, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
    }

    private Double strokeThickness;

    public void setStrokethickness(Double strokeThickness) {
        this.strokeThickness = strokeThickness;
    }

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    private Double tx;
    private Double ty;

    public void setTranslate(Double tx, Double ty) {
        this.tx = tx;
        this.ty = ty;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Boolean isVisible;

    public void setVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
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
            return String.format(Locale.US, "key: \"%s\",", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: \"%s\",", key1);
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
            return String.format(Locale.US, "clip: \"%s\",", clip1);
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
            return String.format(Locale.US, "desc: \"%s\",", desc);
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
            return String.format(Locale.US, "color: \"%s\",", color);
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

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", (mode2 != null) ? mode2.generateJs() : "null");
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
            return String.format(Locale.US, "id: \"%s\",", id);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
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
            return String.format(Locale.US, "type: \"%s\",", type2);
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
            return String.format(Locale.US, "anchor: \"%s\",", anchor1);
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
            return String.format(Locale.US, "anchor: \"%s\",", anchor3);
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
            return String.format(Locale.US, "anchor: \"%s\",", anchor5);
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
            return String.format(Locale.US, "stroke: \"%s\",", stroke2);
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
            return String.format(Locale.US, "stroke: \"%s\",", stroke5);
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
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern);
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
            return String.format(Locale.US, "title: \"%s\",", title);
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
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
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
        js.append(generateJSopacity1());
        js.append(generateJSkeys2());
        js.append(generateJSkeys3());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSmode2());
        js.append(generateJSopacity2());
        js.append(generateJSfx());
        js.append(generateJSfy());
        js.append(generateJSid());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSparent());
        js.append(generateJSparent1());
        js.append(generateJStype2());
        js.append(generateJSdegrees());
        js.append(generateJScx1());
        js.append(generateJScy1());
        js.append(generateJSdegrees1());
        js.append(generateJSanchor());
        js.append(generateJSanchor1());
        js.append(generateJSsx());
        js.append(generateJSsy());
        js.append(generateJScx2());
        js.append(generateJScy2());
        js.append(generateJSsx1());
        js.append(generateJSsy1());
        js.append(generateJSanchor2());
        js.append(generateJSanchor3());
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
        js.append(generateJSisVisible());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
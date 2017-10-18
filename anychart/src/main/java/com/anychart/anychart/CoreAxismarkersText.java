package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CoreAxismarkersText extends CoreText {

    public CoreAxismarkersText() {

    }

    protected CoreAxismarkersText(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CoreAxismarkersText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private EnumsAlign align;
    private String align1;

    public CoreAxismarkersText setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".align(%s)", (align != null) ? align.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", (align != null) ? align.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".align(%s)", align1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", align1));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsAnchor anchor;
    private String anchor1;

    public CoreAxismarkersText setAnchor(EnumsAnchor anchor) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.anchor = anchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".anchor(%s)", (anchor != null) ? anchor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", (anchor != null) ? anchor.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setAnchor(String anchor1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.anchor1 = anchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".anchor(%s)", anchor1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", anchor1));
                js.setLength(0);
            }
        }
        return this;
    }

    private CoreAxesLinear getAxis;

    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }

    private CoreAxesLinear axis;

    public CoreAxismarkersLine setAxis(CoreAxesLinear axis) {
        if (jsBase == null) {
            this.axis = axis;
        } else {
            this.axis = axis;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".axis(%s);", (axis != null) ? axis.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%s)", (axis != null) ? axis.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new CoreAxismarkersLine(jsBase);
    }

    private Double height;
    private String height1;

    public CoreAxismarkersText setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".height(%f)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".height(%s)", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", height1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Layout layout;
    private String layout1;

    public CoreAxismarkersText setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".layout(%s)", layout1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", layout1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double offsetX;
    private String offsetX1;

    public CoreAxismarkersText setOffsetX(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX = offsetX;
        } else {
            this.offsetX = offsetX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".offsetX(%f)", offsetX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%f)", offsetX));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setOffsetX(String offsetX1) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX1 = offsetX1;
        } else {
            this.offsetX1 = offsetX1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".offsetX(%s)", offsetX1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%s)", offsetX1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double offsetY;
    private String offsetY1;

    public CoreAxismarkersText setOffsetY(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY = offsetY;
        } else {
            this.offsetY = offsetY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".offsetY(%f)", offsetY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%f)", offsetY));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setOffsetY(String offsetY1) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY1 = offsetY1;
        } else {
            this.offsetY1 = offsetY1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".offsetY(%s)", offsetY1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%s)", offsetY1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rotation;

    public CoreAxismarkersText setRotation(Double rotation) {
        if (jsBase == null) {
            this.rotation = rotation;
        } else {
            this.rotation = rotation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rotation(%f)", rotation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rotation(%f)", rotation));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScalesBase getScale;

    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }

    private ScalesBase scale;
    private String scale1;
    private ScaleTypes scale2;
    private String scale3;

    public CoreAxismarkersText setScale(ScalesBase scale) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setScale(String scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scale(%s)", scale1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", scale1));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setScale(ScaleTypes scale2) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            this.scale2 = null;
            this.scale3 = null;
            
            this.scale2 = scale2;
        } else {
            this.scale2 = scale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String text;

    public CoreAxismarkersText setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".text(%s)", text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", text));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double value;

    public CoreAxismarkersText setValue(Double value) {
        if (jsBase == null) {
            this.value = value;
        } else {
            this.value = value;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".value(%f)", value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%f)", value));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    public CoreAxismarkersText setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }


    public CoreAxismarkersText setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", width1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", (align != null) ? align.generateJs() : "null");
        }
        return "";
    }

    private String generateJSalign1() {
        if (align1 != null) {
            return String.format(Locale.US, "align: %s,", align1);
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

    private String generateJSaxis() {
        if (axis != null) {
            return String.format(Locale.US, "axis: %s,", (axis != null) ? axis.generateJs() : "null");
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
        }
        return "";
    }

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", (layout != null) ? layout.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", layout1);
        }
        return "";
    }

    private String generateJSoffsetX() {
        if (offsetX != null) {
            return String.format(Locale.US, "offsetX: %f,", offsetX);
        }
        return "";
    }

    private String generateJSoffsetX1() {
        if (offsetX1 != null) {
            return String.format(Locale.US, "offsetX: %s,", offsetX1);
        }
        return "";
    }

    private String generateJSoffsetY() {
        if (offsetY != null) {
            return String.format(Locale.US, "offsetY: %f,", offsetY);
        }
        return "";
    }

    private String generateJSoffsetY1() {
        if (offsetY1 != null) {
            return String.format(Locale.US, "offsetY: %s,", offsetY1);
        }
        return "";
    }

    private String generateJSrotation() {
        if (rotation != null) {
            return String.format(Locale.US, "rotation: %f,", rotation);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale1() {
        if (scale1 != null) {
            return String.format(Locale.US, "scale: %s,", scale1);
        }
        return "";
    }

    private String generateJSscale2() {
        if (scale2 != null) {
            return String.format(Locale.US, "scale: %s,", (scale2 != null) ? scale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale3() {
        if (scale3 != null) {
            return String.format(Locale.US, "scale: %s,", scale3);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %f,", value);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAxis());
        jsGetters.append(generateJSgetScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSalign());
            js.append(generateJSalign1());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSaxis());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSlayout());
            js.append(generateJSlayout1());
            js.append(generateJSoffsetX());
            js.append(generateJSoffsetX1());
            js.append(generateJSoffsetY());
            js.append(generateJSoffsetY1());
            js.append(generateJSrotation());
            js.append(generateJSscale());
            js.append(generateJSscale1());
            js.append(generateJSscale2());
            js.append(generateJSscale3());
            js.append(generateJStext());
            js.append(generateJSvalue());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
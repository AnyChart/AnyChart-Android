package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class CoreAxismarkersText extends JsObject {

    private String jsBase;

    public CoreAxismarkersText() {

    }

    protected CoreAxismarkersText(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private EnumsAlign align;
    private String align1;

    public void setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", (align != null) ? align.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", (align != null) ? align.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", align1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", align1));
                js.setLength(0);
            }
        }
    }

    private EnumsAnchor anchor;
    private String anchor1;

    public void setAnchor(EnumsAnchor anchor) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.anchor = anchor;

            js.append(String.format(Locale.US, jsBase + ".anchor(%s);", (anchor != null) ? anchor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".anchor(%s);", (anchor != null) ? anchor.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setAnchor(String anchor1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.anchor1 = anchor1;

            js.append(String.format(Locale.US, jsBase + ".anchor(%s);", anchor1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".anchor(%s);", anchor1));
                js.setLength(0);
            }
        }
    }

    private CoreAxesLinear getAxis;

    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }

    private CoreAxesLinear axis;

    public void setAxis(CoreAxesLinear axis) {
        if (jsBase == null) {
            this.axis = axis;
        } else {
            this.axis = axis;

            js.append(String.format(Locale.US, jsBase + ".axis(%s);", (axis != null) ? axis.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%s);", (axis != null) ? axis.generateJs() : "null"));
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

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;

            js.append(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));
                js.setLength(0);
            }
        }
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontdecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));
                js.setLength(0);
            }
        }
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;

            js.append(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));
                js.setLength(0);
            }
        }
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;

            js.append(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));
                js.setLength(0);
            }
        }
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));
                js.setLength(0);
            }
        }
    }


    public void setFontsize(Double fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));
                js.setLength(0);
            }
        }
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontstyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));
                js.setLength(0);
            }
        }
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontvariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));
                js.setLength(0);
            }
        }
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));
                js.setLength(0);
            }
        }
    }


    public void setFontweight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));
                js.setLength(0);
            }
        }
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public void setHalign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHalign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));
                js.setLength(0);
            }
        }
    }

    private Double height;
    private String height1;

    public void setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height1));
                js.setLength(0);
            }
        }
    }

    private Layout layout;
    private String layout1;

    public void setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", (layout != null) ? layout.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", (layout != null) ? layout.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", layout1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", layout1));
                js.setLength(0);
            }
        }
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));
                js.setLength(0);
            }
        }
    }


    public void setLetterspacing(Double letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));
                js.setLength(0);
            }
        }
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));
                js.setLength(0);
            }
        }
    }


    public void setLineheight(Double lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));
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

    private Double offsetX;
    private String offsetX1;

    public void setOffsetx(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX = offsetX;
        } else {
            this.offsetX = offsetX;

            js.append(String.format(Locale.US, jsBase + ".offsetX(%f);", offsetX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetX(%f);", offsetX));
                js.setLength(0);
            }
        }
    }


    public void setOffsetx(String offsetX1) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX1 = offsetX1;
        } else {
            this.offsetX1 = offsetX1;

            js.append(String.format(Locale.US, jsBase + ".offsetX(%s);", offsetX1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetX(%s);", offsetX1));
                js.setLength(0);
            }
        }
    }

    private Double offsetY;
    private String offsetY1;

    public void setOffsety(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY = offsetY;
        } else {
            this.offsetY = offsetY;

            js.append(String.format(Locale.US, jsBase + ".offsetY(%f);", offsetY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetY(%f);", offsetY));
                js.setLength(0);
            }
        }
    }


    public void setOffsety(String offsetY1) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY1 = offsetY1;
        } else {
            this.offsetY1 = offsetY1;

            js.append(String.format(Locale.US, jsBase + ".offsetY(%s);", offsetY1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetY(%s);", offsetY1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
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

    private Double rotation;

    public void setRotation(Double rotation) {
        if (jsBase == null) {
            this.rotation = rotation;
        } else {
            this.rotation = rotation;

            js.append(String.format(Locale.US, jsBase + ".rotation(%f);", rotation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotation(%f);", rotation));
                js.setLength(0);
            }
        }
    }

    private ScalesBase getScale;

    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }

    private ScalesBase scale;

    public void setScale(ScalesBase scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;

            js.append(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
    }

    private String text;

    public void setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;

            js.append(String.format(Locale.US, jsBase + ".text(%s);", text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%s);", text));
                js.setLength(0);
            }
        }
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextdirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));
                js.setLength(0);
            }
        }
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;

            js.append(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));
                js.setLength(0);
            }
        }
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextoverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));
                js.setLength(0);
            }
        }
    }

    private String name;

    public void setTextsettings(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String objectWithSettings;
    private String name1;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings = textSettings;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings = textSettings;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Double textSettings1, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings1 = textSettings1;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings1 = textSettings1;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Boolean textSettings2, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings2 = textSettings2;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings2 = textSettings2;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));
                js.setLength(0);
            }
        }
    }

    private TextTextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextTextWrap textWrap) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap = textWrap;
        } else {
            this.textWrap = textWrap;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextwrap(String textWrap1) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap1 = textWrap1;
        } else {
            this.textWrap1 = textWrap1;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));
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

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;

            js.append(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public void setValign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));
                js.setLength(0);
            }
        }
    }

    private Double value;

    public void setValue(Double value) {
        if (jsBase == null) {
            this.value = value;
        } else {
            this.value = value;

            js.append(String.format(Locale.US, jsBase + ".value(%f);", value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".value(%f);", value));
                js.setLength(0);
            }
        }
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
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

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
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

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
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

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSobjectWithSettings() {
        if (objectWithSettings != null) {
            return String.format(Locale.US, "objectWithSettings: %s,", objectWithSettings);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
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

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
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
            js.append(generateJSalign());
            js.append(generateJSalign1());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSaxis());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSenabled());
            js.append(generateJSfontColor());
            js.append(generateJSfontDecoration());
            js.append(generateJSfontDecoration1());
            js.append(generateJSfontFamily());
            js.append(generateJSfontOpacity());
            js.append(generateJSfontSize());
            js.append(generateJSfontSize1());
            js.append(generateJSfontStyle());
            js.append(generateJSfontStyle1());
            js.append(generateJSfontVariant());
            js.append(generateJSfontVariant1());
            js.append(generateJSfontWeight());
            js.append(generateJSfontWeight1());
            js.append(generateJShAlign());
            js.append(generateJShAlign1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSlayout());
            js.append(generateJSlayout1());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSoffsetX());
            js.append(generateJSoffsetX1());
            js.append(generateJSoffsetY());
            js.append(generateJSoffsetY1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSrotation());
            js.append(generateJSscale());
            js.append(generateJSselectable());
            js.append(generateJStext());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJSname());
            js.append(generateJSobjectWithSettings());
            js.append(generateJSname1());
            js.append(generateJStextSettings());
            js.append(generateJStextSettings1());
            js.append(generateJStextSettings2());
            js.append(generateJStextWrap());
            js.append(generateJStextWrap1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSvalue());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetAxis());
            js.append(generateJSgetScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
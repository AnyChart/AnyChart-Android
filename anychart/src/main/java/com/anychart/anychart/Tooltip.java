package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Tooltip extends VisualBase {

    private String jsBase;

    public Tooltip() {

    }

    protected Tooltip(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private String adjustOrAdjustByWidth2;
    private Boolean adjustByHeight;

    public void setAdjustfontsize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", adjustOrAdjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", adjustOrAdjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
    }


    public void setAdjustfontsize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));
                js.setLength(0);
            }
        }
    }


    public void setAdjustfontsize(String adjustOrAdjustByWidth2, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", adjustOrAdjustByWidth2, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", adjustOrAdjustByWidth2, adjustByHeight));
                js.setLength(0);
            }
        }
    }

    private Boolean allowLeaveChart;

    public void setAllowleavechart(Boolean allowLeaveChart) {
        if (jsBase == null) {
            this.allowLeaveChart = allowLeaveChart;
        } else {
            this.allowLeaveChart = allowLeaveChart;

            js.append(String.format(Locale.US, jsBase + ".allowLeaveChart(%b);", allowLeaveChart));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".allowLeaveChart(%b);", allowLeaveChart));
                js.setLength(0);
            }
        }
    }

    private Boolean allowLeaveScreen;

    public void setAllowleavescreen(Boolean allowLeaveScreen) {
        if (jsBase == null) {
            this.allowLeaveScreen = allowLeaveScreen;
        } else {
            this.allowLeaveScreen = allowLeaveScreen;

            js.append(String.format(Locale.US, jsBase + ".allowLeaveScreen(%b);", allowLeaveScreen));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".allowLeaveScreen(%b);", allowLeaveScreen));
                js.setLength(0);
            }
        }
    }

    private Boolean allowLeaveStage;

    public void setAllowleavestage(Boolean allowLeaveStage) {
        if (jsBase == null) {
            this.allowLeaveStage = allowLeaveStage;
        } else {
            this.allowLeaveStage = allowLeaveStage;

            js.append(String.format(Locale.US, jsBase + ".allowLeaveStage(%b);", allowLeaveStage));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".allowLeaveStage(%b);", allowLeaveStage));
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

    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private Boolean background;
    private String background1;
    private String background2;

    public void setBackground(Boolean background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;

            js.append(String.format(Locale.US, jsBase + ".background(%b);", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background));
                js.setLength(0);
            }
        }
    }


    public void setBackground(String background1) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background1 = background1;
        } else {
            this.background1 = background1;

            js.append(String.format(Locale.US, jsBase + ".background(%s);", background1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", background1));
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

    private TooltipDisplayMode displayMode;
    private String displayMode1;

    public void setDisplaymode(TooltipDisplayMode displayMode) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode = displayMode;
        } else {
            this.displayMode = displayMode;

            js.append(String.format(Locale.US, jsBase + ".displayMode(%s);", (displayMode != null) ? displayMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".displayMode(%s);", (displayMode != null) ? displayMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setDisplaymode(String displayMode1) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode1 = displayMode1;
        } else {
            this.displayMode1 = displayMode1;

            js.append(String.format(Locale.US, jsBase + ".displayMode(%s);", displayMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".displayMode(%s);", displayMode1));
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

    private Double fontSize;
    private String fontSize1;

    public void setFontsize(Double fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize));
                js.setLength(0);
            }
        }
    }


    public void setFontsize(String fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize1));
                js.setLength(0);
            }
        }
    }

    private String fontStyle;
    private TextFontStyle fontStyle1;

    public void setFontstyle(String fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle));
                js.setLength(0);
            }
        }
    }


    public void setFontstyle(TextFontStyle fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle1 != null) ? fontStyle1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle1 != null) ? fontStyle1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String fontVariant;
    private TextFontVariant fontVariant1;

    public void setFontvariant(String fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant));
                js.setLength(0);
            }
        }
    }


    public void setFontvariant(TextFontVariant fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant1 != null) ? fontVariant1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant1 != null) ? fontVariant1.generateJs() : "null"));
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

    private String format;

    public void setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;

            js.append(String.format(Locale.US, jsBase + ".format(%s);", format));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s);", format));
                js.setLength(0);
            }
        }
    }

    private String hAlign;
    private TextHAlign hAlign1;

    public void setHalign(String hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign));
                js.setLength(0);
            }
        }
    }


    public void setHalign(TextHAlign hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign1 != null) ? hAlign1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign1 != null) ? hAlign1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String height;
    private Double height1;

    public void setHeight(String height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height));
                js.setLength(0);
            }
        }
    }


    public void setHeight(Double height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height1));
                js.setLength(0);
            }
        }
    }

    private Boolean force;

    public void setHide(Boolean force) {
        if (jsBase == null) {
            this.force = force;
        } else {
            this.force = force;

            js.append(String.format(Locale.US, jsBase + ".hide(%b);", force));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hide(%b);", force));
                js.setLength(0);
            }
        }
    }

    private Double hideDelay;

    public void setHidedelay(Double hideDelay) {
        if (jsBase == null) {
            this.hideDelay = hideDelay;
        } else {
            this.hideDelay = hideDelay;

            js.append(String.format(Locale.US, jsBase + ".hideDelay(%f);", hideDelay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hideDelay(%f);", hideDelay));
                js.setLength(0);
            }
        }
    }

    private Double letterSpacing;

    public void setLetterspacing(Double letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing));
                js.setLength(0);
            }
        }
    }

    private Double lineHeight;
    private String lineHeight1;

    public void setLineheight(Double lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight));
                js.setLength(0);
            }
        }
    }


    public void setLineheight(String lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight1));
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

    private Double maxFontSize;
    private String maxFontSize1;

    public void setMaxfontsize(Double maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;

            js.append(String.format(Locale.US, jsBase + ".maxFontSize(%f);", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%f);", maxFontSize));
                js.setLength(0);
            }
        }
    }


    public void setMaxfontsize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;

            js.append(String.format(Locale.US, jsBase + ".maxFontSize(%s);", maxFontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%s);", maxFontSize1));
                js.setLength(0);
            }
        }
    }

    private Double minFontSize;
    private String minFontSize1;

    public void setMinfontsize(Double minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;

            js.append(String.format(Locale.US, jsBase + ".minFontSize(%f);", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%f);", minFontSize));
                js.setLength(0);
            }
        }
    }


    public void setMinfontsize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;

            js.append(String.format(Locale.US, jsBase + ".minFontSize(%s);", minFontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%s);", minFontSize1));
                js.setLength(0);
            }
        }
    }

    private Double offsetX;

    public void setOffsetx(Double offsetX) {
        if (jsBase == null) {
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

    private Double offsetY;

    public void setOffsety(Double offsetY) {
        if (jsBase == null) {
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

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public void setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", padding2));
                js.setLength(0);
            }
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value, value2, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, String value2, String value4, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", value, value2, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", value, value2, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, String value2, Double value5, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", value, value2, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", value, value2, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, String value2, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", value, value2, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", value, value2, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, Double value3, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", value, value3, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", value, value3, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, Double value3, String value4, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", value, value3, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", value, value3, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, Double value3, Double value5, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", value, value3, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", value, value3, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", value, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", value, value3, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", value1, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", value1, value2, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, String value2, String value4, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", value1, value2, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", value1, value2, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, String value2, Double value5, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", value1, value2, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", value1, value2, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, String value2, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", value1, value2, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", value1, value2, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, Double value3, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", value1, value3, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", value1, value3, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, Double value3, String value4, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", value1, value3, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", value1, value3, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, Double value3, Double value5, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", value1, value3, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", value1, value3, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
    }

    private Position position;
    private String position1;

    public void setPosition(Position position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", position1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", position1));
                js.setLength(0);
            }
        }
    }

    private String positionMode;
    private TooltipPositionMode positionMode1;

    public void setPositionmode(String positionMode) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode = positionMode;
        } else {
            this.positionMode = positionMode;

            js.append(String.format(Locale.US, jsBase + ".positionMode(%s);", positionMode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", positionMode));
                js.setLength(0);
            }
        }
    }


    public void setPositionmode(TooltipPositionMode positionMode1) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode1 = positionMode1;
        } else {
            this.positionMode1 = positionMode1;

            js.append(String.format(Locale.US, jsBase + ".positionMode(%s);", (positionMode1 != null) ? positionMode1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", (positionMode1 != null) ? positionMode1.generateJs() : "null"));
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

    private Separator getSeparator;

    public Separator getSeparator() {
        if (getSeparator == null)
            getSeparator = new Separator(jsBase + ".separator()");

        return getSeparator;
    }

    private Boolean separator;
    private String separator1;

    public void setSeparator(Boolean separator) {
        if (jsBase == null) {
            this.separator = null;
            this.separator1 = null;
            
            this.separator = separator;
        } else {
            this.separator = separator;

            js.append(String.format(Locale.US, jsBase + ".separator(%b);", separator));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".separator(%b);", separator));
                js.setLength(0);
            }
        }
    }


    public void setSeparator(String separator1) {
        if (jsBase == null) {
            this.separator = null;
            this.separator1 = null;
            
            this.separator1 = separator1;
        } else {
            this.separator1 = separator1;

            js.append(String.format(Locale.US, jsBase + ".separator(%s);", separator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".separator(%s);", separator1));
                js.setLength(0);
            }
        }
    }

    private String textDirection;
    private Direction textDirection1;

    public void setTextdirection(String textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection));
                js.setLength(0);
            }
        }
    }


    public void setTextdirection(Direction textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection1 != null) ? textDirection1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection1 != null) ? textDirection1.generateJs() : "null"));
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

    private String textSettings;

    public void setTextsettings(String textSettings) {
        if (jsBase == null) {
            this.textSettings = textSettings;
        } else {
            this.textSettings = textSettings;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s);", textSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s);", textSettings));
                js.setLength(0);
            }
        }
    }

    private String name;
    private String textSettings1;
    private Double textSettings2;
    private Boolean textSettings3;

    public void setTextsettings(String textSettings1, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings1 = textSettings1;
            this.name = name;
        } else {
            this.textSettings1 = textSettings1;
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings1, name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings1, name));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Double textSettings2, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings2 = textSettings2;
            this.name = name;
        } else {
            this.textSettings2 = textSettings2;
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings2, name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings2, name));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Boolean textSettings3, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings3 = textSettings3;
            this.name = name;
        } else {
            this.textSettings3 = textSettings3;
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings3, name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings3, name));
                js.setLength(0);
            }
        }
    }

    private String textWrap;
    private TextTextWrap textWrap1;

    public void setTextwrap(String textWrap) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap = textWrap;
        } else {
            this.textWrap = textWrap;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap));
                js.setLength(0);
            }
        }
    }


    public void setTextwrap(TextTextWrap textWrap1) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap1 = textWrap1;
        } else {
            this.textWrap1 = textWrap1;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap1 != null) ? textWrap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap1 != null) ? textWrap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%b);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
    }


    public void setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title1));
                js.setLength(0);
            }
        }
    }

    private String titleFormat;

    public void setTitleformat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;

            js.append(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));
                js.setLength(0);
            }
        }
    }

    private String unionFormat;

    public void setUnionformat(String unionFormat) {
        if (jsBase == null) {
            this.unionFormat = unionFormat;
        } else {
            this.unionFormat = unionFormat;

            js.append(String.format(Locale.US, jsBase + ".unionFormat(%s);", unionFormat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unionFormat(%s);", unionFormat));
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

    private String vAlign;
    private TextVAlign vAlign1;

    public void setValign(String vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign));
                js.setLength(0);
            }
        }
    }


    public void setValign(TextVAlign vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign1 != null) ? vAlign1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign1 != null) ? vAlign1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String valuePostfix;

    public void setValuepostfix(String valuePostfix) {
        if (jsBase == null) {
            this.valuePostfix = valuePostfix;
        } else {
            this.valuePostfix = valuePostfix;

            js.append(String.format(Locale.US, jsBase + ".valuePostfix(%s);", valuePostfix));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valuePostfix(%s);", valuePostfix));
                js.setLength(0);
            }
        }
    }

    private String valuePrefix;

    public void setValueprefix(String valuePrefix) {
        if (jsBase == null) {
            this.valuePrefix = valuePrefix;
        } else {
            this.valuePrefix = valuePrefix;

            js.append(String.format(Locale.US, jsBase + ".valuePrefix(%s);", valuePrefix));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valuePrefix(%s);", valuePrefix));
                js.setLength(0);
            }
        }
    }

    private String width;
    private Double width1;

    public void setWidth(String width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(Double width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width1));
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

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetSeparator() {
        if (getSeparator != null) {
            return getSeparator.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth() {
        if (adjustOrAdjustByWidth != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %b,", adjustOrAdjustByWidth);
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth1() {
        if (adjustOrAdjustByWidth1 != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %s,", Arrays.toString(adjustOrAdjustByWidth1));
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth2() {
        if (adjustOrAdjustByWidth2 != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %s,", adjustOrAdjustByWidth2);
        }
        return "";
    }

    private String generateJSadjustByHeight() {
        if (adjustByHeight != null) {
            return String.format(Locale.US, "adjustByHeight: %b,", adjustByHeight);
        }
        return "";
    }

    private String generateJSallowLeaveChart() {
        if (allowLeaveChart != null) {
            return String.format(Locale.US, "allowLeaveChart: %b,", allowLeaveChart);
        }
        return "";
    }

    private String generateJSallowLeaveScreen() {
        if (allowLeaveScreen != null) {
            return String.format(Locale.US, "allowLeaveScreen: %b,", allowLeaveScreen);
        }
        return "";
    }

    private String generateJSallowLeaveStage() {
        if (allowLeaveStage != null) {
            return String.format(Locale.US, "allowLeaveStage: %b,", allowLeaveStage);
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

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %b,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %s,", background1);
        }
        return "";
    }

    private String generateJSbackground2() {
        if (background2 != null) {
            return String.format(Locale.US, "background: %s,", background2);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdisplayMode() {
        if (displayMode != null) {
            return String.format(Locale.US, "displayMode: %s,", (displayMode != null) ? displayMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdisplayMode1() {
        if (displayMode1 != null) {
            return String.format(Locale.US, "displayMode: %s,", displayMode1);
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
            return String.format(Locale.US, "fontSize: %f,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle);
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle1 != null) ? fontStyle1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant);
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant1 != null) ? fontVariant1.generateJs() : "null");
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

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: %s,", format);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign);
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign1 != null) ? hAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %s,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJSforce() {
        if (force != null) {
            return String.format(Locale.US, "force: %b,", force);
        }
        return "";
    }

    private String generateJShideDelay() {
        if (hideDelay != null) {
            return String.format(Locale.US, "hideDelay: %f,", hideDelay);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight1);
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

    private String generateJSmaxFontSize() {
        if (maxFontSize != null) {
            return String.format(Locale.US, "maxFontSize: %f,", maxFontSize);
        }
        return "";
    }

    private String generateJSmaxFontSize1() {
        if (maxFontSize1 != null) {
            return String.format(Locale.US, "maxFontSize: %s,", maxFontSize1);
        }
        return "";
    }

    private String generateJSminFontSize() {
        if (minFontSize != null) {
            return String.format(Locale.US, "minFontSize: %f,", minFontSize);
        }
        return "";
    }

    private String generateJSminFontSize1() {
        if (minFontSize1 != null) {
            return String.format(Locale.US, "minFontSize: %s,", minFontSize1);
        }
        return "";
    }

    private String generateJSoffsetX() {
        if (offsetX != null) {
            return String.format(Locale.US, "offsetX: %f,", offsetX);
        }
        return "";
    }

    private String generateJSoffsetY() {
        if (offsetY != null) {
            return String.format(Locale.US, "offsetY: %f,", offsetY);
        }
        return "";
    }

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSpadding2() {
        if (padding2 != null) {
            return String.format(Locale.US, "padding: %s,", padding2);
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
        }
        return "";
    }

    private String generateJSpositionMode() {
        if (positionMode != null) {
            return String.format(Locale.US, "positionMode: %s,", positionMode);
        }
        return "";
    }

    private String generateJSpositionMode1() {
        if (positionMode1 != null) {
            return String.format(Locale.US, "positionMode: %s,", (positionMode1 != null) ? positionMode1.generateJs() : "null");
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

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJSseparator() {
        if (separator != null) {
            return String.format(Locale.US, "separator: %b,", separator);
        }
        return "";
    }

    private String generateJSseparator1() {
        if (separator1 != null) {
            return String.format(Locale.US, "separator: %s,", separator1);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection);
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection1 != null) ? textDirection1.generateJs() : "null");
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

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings2);
        }
        return "";
    }

    private String generateJStextSettings3() {
        if (textSettings3 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings3);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap);
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap1 != null) ? textWrap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: %s,", titleFormat);
        }
        return "";
    }

    private String generateJSunionFormat() {
        if (unionFormat != null) {
            return String.format(Locale.US, "unionFormat: %s,", unionFormat);
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
            return String.format(Locale.US, "vAlign: %s,", vAlign);
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign1 != null) ? vAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvaluePostfix() {
        if (valuePostfix != null) {
            return String.format(Locale.US, "valuePostfix: %s,", valuePostfix);
        }
        return "";
    }

    private String generateJSvaluePrefix() {
        if (valuePrefix != null) {
            return String.format(Locale.US, "valuePrefix: %s,", valuePrefix);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %s,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
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
            js.append(generateJSadjustOrAdjustByWidth());
            js.append(generateJSadjustOrAdjustByWidth1());
            js.append(generateJSadjustOrAdjustByWidth2());
            js.append(generateJSadjustByHeight());
            js.append(generateJSallowLeaveChart());
            js.append(generateJSallowLeaveScreen());
            js.append(generateJSallowLeaveStage());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdisplayMode());
            js.append(generateJSdisplayMode1());
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
            js.append(generateJSformat());
            js.append(generateJShAlign());
            js.append(generateJShAlign1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSforce());
            js.append(generateJShideDelay());
            js.append(generateJSletterSpacing());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaxFontSize());
            js.append(generateJSmaxFontSize1());
            js.append(generateJSminFontSize());
            js.append(generateJSminFontSize1());
            js.append(generateJSoffsetX());
            js.append(generateJSoffsetY());
            js.append(generateJSpadding());
            js.append(generateJSpadding1());
            js.append(generateJSpadding2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJSposition());
            js.append(generateJSposition1());
            js.append(generateJSpositionMode());
            js.append(generateJSpositionMode1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSselectable());
            js.append(generateJSseparator());
            js.append(generateJSseparator1());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJStextSettings());
            js.append(generateJSname());
            js.append(generateJStextSettings1());
            js.append(generateJStextSettings2());
            js.append(generateJStextSettings3());
            js.append(generateJStextWrap());
            js.append(generateJStextWrap1());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitleFormat());
            js.append(generateJSunionFormat());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSvaluePostfix());
            js.append(generateJSvaluePrefix());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetBackground());
            js.append(generateJSgetPadding());
            js.append(generateJSgetSeparator());
            js.append(generateJSgetTitle());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
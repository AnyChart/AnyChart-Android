package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Paginator extends CoreText {

    private String jsBase;

    public Paginator() {

    }

    protected Paginator(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String background;
    private String background1;
    private Boolean background2;

    public void setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;

            js.append(String.format(Locale.US, jsBase + ".background(%s);", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", background));
                js.setLength(0);
            }
        }
    }


    public void setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;

            js.append(String.format(Locale.US, jsBase + ".background(%b);", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background2));
                js.setLength(0);
            }
        }
    }

    private Double currentPage;
    private String currentPage1;

    public void setCurrentpage(Double currentPage) {
        if (jsBase == null) {
            this.currentPage = null;
            this.currentPage1 = null;
            
            this.currentPage = currentPage;
        } else {
            this.currentPage = currentPage;

            js.append(String.format(Locale.US, jsBase + ".currentPage(%f);", currentPage));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".currentPage(%f);", currentPage));
                js.setLength(0);
            }
        }
    }


    public void setCurrentpage(String currentPage1) {
        if (jsBase == null) {
            this.currentPage = null;
            this.currentPage1 = null;
            
            this.currentPage1 = currentPage1;
        } else {
            this.currentPage1 = currentPage1;

            js.append(String.format(Locale.US, jsBase + ".currentPage(%s);", currentPage1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".currentPage(%s);", currentPage1));
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

    private String layout;
    private Layout layout1;

    public void setLayout(String layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", layout));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", layout));
                js.setLength(0);
            }
        }
    }


    public void setLayout(Layout layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;

            js.append(String.format(Locale.US, jsBase + ".layout(%s);", (layout1 != null) ? layout1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s);", (layout1 != null) ? layout1.generateJs() : "null"));
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

    private String spaceOrTopOrTopAndBottom;
    private Double spaceOrTopOrTopAndBottom1;
    private Double[] spaceOrTopOrTopAndBottom2;
    private String[] spaceOrTopOrTopAndBottom3;
    private String spaceOrTopOrTopAndBottom4;
    private String rightOrRightAndLeft;
    private Double rightOrRightAndLeft1;
    private String bottom;
    private Double bottom1;
    private String left;
    private Double left1;

    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }

    private Orientation orientation;
    private String orientation1;

    public void setOrientation(Orientation orientation) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation = orientation;
        } else {
            this.orientation = orientation;

            js.append(String.format(Locale.US, jsBase + ".orientation(%s);", (orientation != null) ? orientation.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".orientation(%s);", (orientation != null) ? orientation.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setOrientation(String orientation1) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation1 = orientation1;
        } else {
            this.orientation1 = orientation1;

            js.append(String.format(Locale.US, jsBase + ".orientation(%s);", orientation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".orientation(%s);", orientation1));
                js.setLength(0);
            }
        }
    }

    private String spaceOrTopOrTopAndBottom5;
    private Double spaceOrTopOrTopAndBottom6;
    private Double[] spaceOrTopOrTopAndBottom7;
    private String[] spaceOrTopOrTopAndBottom8;
    private String spaceOrTopOrTopAndBottom9;
    private String rightOrRightAndLeft2;
    private Double rightOrRightAndLeft3;
    private String bottom2;
    private Double bottom3;
    private String left2;
    private Double left3;

    public void setPadding(String spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft2, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom5, rightOrRightAndLeft3, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft2, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft2, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom7), rightOrRightAndLeft3, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, String rightOrRightAndLeft2, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, String rightOrRightAndLeft2, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, String rightOrRightAndLeft2, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft2, bottom3, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, Double rightOrRightAndLeft3, String bottom2, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom2, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom2, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom2 = bottom2;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom2 = bottom2;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom2, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom2, left3));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left2 = left2;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left2 = left2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom3, left2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom3, left2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom8, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            this.rightOrRightAndLeft2 = null;
            this.rightOrRightAndLeft3 = null;
            
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom = null;
            this.bottom1 = null;
            this.bottom2 = null;
            this.bottom3 = null;
            
            this.bottom3 = bottom3;
            this.left = null;
            this.left1 = null;
            this.left2 = null;
            this.left3 = null;
            
            this.left3 = left3;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left3 = left3;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom8), rightOrRightAndLeft3, bottom3, left3));
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

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
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
            return String.format(Locale.US, "background: %b,", background2);
        }
        return "";
    }

    private String generateJScurrentPage() {
        if (currentPage != null) {
            return String.format(Locale.US, "currentPage: %f,", currentPage);
        }
        return "";
    }

    private String generateJScurrentPage1() {
        if (currentPage1 != null) {
            return String.format(Locale.US, "currentPage: %s,", currentPage1);
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

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", layout);
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", (layout1 != null) ? layout1.generateJs() : "null");
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

    private String generateJSspaceOrTopOrTopAndBottom() {
        if (spaceOrTopOrTopAndBottom != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom1() {
        if (spaceOrTopOrTopAndBottom1 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom1);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom2() {
        if (spaceOrTopOrTopAndBottom2 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom2));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom3() {
        if (spaceOrTopOrTopAndBottom3 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom3));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom4() {
        if (spaceOrTopOrTopAndBottom4 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom4);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft() {
        if (rightOrRightAndLeft != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %s,", rightOrRightAndLeft);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft1() {
        if (rightOrRightAndLeft1 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %f,", rightOrRightAndLeft1);
        }
        return "";
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %s,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %f,", bottom1);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %s,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %f,", left1);
        }
        return "";
    }

    private String generateJSorientation() {
        if (orientation != null) {
            return String.format(Locale.US, "orientation: %s,", (orientation != null) ? orientation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSorientation1() {
        if (orientation1 != null) {
            return String.format(Locale.US, "orientation: %s,", orientation1);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom5() {
        if (spaceOrTopOrTopAndBottom5 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom5);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom6() {
        if (spaceOrTopOrTopAndBottom6 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom6);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom7() {
        if (spaceOrTopOrTopAndBottom7 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom7));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom8() {
        if (spaceOrTopOrTopAndBottom8 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom8));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom9() {
        if (spaceOrTopOrTopAndBottom9 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom9);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft2() {
        if (rightOrRightAndLeft2 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %s,", rightOrRightAndLeft2);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft3() {
        if (rightOrRightAndLeft3 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %f,", rightOrRightAndLeft3);
        }
        return "";
    }

    private String generateJSbottom2() {
        if (bottom2 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom2);
        }
        return "";
    }

    private String generateJSbottom3() {
        if (bottom3 != null) {
            return String.format(Locale.US, "bottom: %f,", bottom3);
        }
        return "";
    }

    private String generateJSleft2() {
        if (left2 != null) {
            return String.format(Locale.US, "left: %s,", left2);
        }
        return "";
    }

    private String generateJSleft3() {
        if (left3 != null) {
            return String.format(Locale.US, "left: %f,", left3);
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
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJScurrentPage());
            js.append(generateJScurrentPage1());
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
            js.append(generateJSspaceOrTopOrTopAndBottom());
            js.append(generateJSspaceOrTopOrTopAndBottom1());
            js.append(generateJSspaceOrTopOrTopAndBottom2());
            js.append(generateJSspaceOrTopOrTopAndBottom3());
            js.append(generateJSspaceOrTopOrTopAndBottom4());
            js.append(generateJSrightOrRightAndLeft());
            js.append(generateJSrightOrRightAndLeft1());
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSorientation());
            js.append(generateJSorientation1());
            js.append(generateJSspaceOrTopOrTopAndBottom5());
            js.append(generateJSspaceOrTopOrTopAndBottom6());
            js.append(generateJSspaceOrTopOrTopAndBottom7());
            js.append(generateJSspaceOrTopOrTopAndBottom8());
            js.append(generateJSspaceOrTopOrTopAndBottom9());
            js.append(generateJSrightOrRightAndLeft2());
            js.append(generateJSrightOrRightAndLeft3());
            js.append(generateJSbottom2());
            js.append(generateJSbottom3());
            js.append(generateJSleft2());
            js.append(generateJSleft3());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSselectable());
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
            js.append(generateJSzIndex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
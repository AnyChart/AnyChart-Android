package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class VectorText extends Element {

    public VectorText() {

    }

    protected VectorText(String jsBase) {
        this.jsBase = jsBase;
    }

    protected VectorText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String color;

    public VectorText setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".color(%s)", color));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".color(%s)", color));
                js.setLength(0);
            }
        }
        return this;
    }

    private Decoration decoration;
    private String decoration1;

    public VectorText setDecoration(Decoration decoration) {
        if (jsBase == null) {
            this.decoration = null;
            this.decoration1 = null;
            
            this.decoration = decoration;
        } else {
            this.decoration = decoration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".decoration(%s)", (decoration != null) ? decoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".decoration(%s)", (decoration != null) ? decoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setDecoration(String decoration1) {
        if (jsBase == null) {
            this.decoration = null;
            this.decoration1 = null;
            
            this.decoration1 = decoration1;
        } else {
            this.decoration1 = decoration1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".decoration(%s)", decoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".decoration(%s)", decoration1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Direction direction;
    private String direction1;

    public VectorText setDirection(Direction direction) {
        if (jsBase == null) {
            this.direction = null;
            this.direction1 = null;
            
            this.direction = direction;
        } else {
            this.direction = direction;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".direction(%s)", (direction != null) ? direction.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".direction(%s)", (direction != null) ? direction.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setDirection(String direction1) {
        if (jsBase == null) {
            this.direction = null;
            this.direction1 = null;
            
            this.direction1 = direction1;
        } else {
            this.direction1 = direction1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".direction(%s)", direction1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".direction(%s)", direction1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontFamily;

    public VectorText setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontFamily(%s)", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", fontFamily));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontSize;
    private Double fontSize1;

    public VectorText setFontSize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontSize(%s)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setFontSize(Double fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public VectorText setFontStyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontStyle(%s)", (fontStyle != null) ? fontStyle.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", (fontStyle != null) ? fontStyle.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setFontStyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontStyle(%s)", fontStyle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", fontStyle1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public VectorText setFontVariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontVariant(%s)", (fontVariant != null) ? fontVariant.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", (fontVariant != null) ? fontVariant.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setFontVariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontVariant(%s)", fontVariant1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", fontVariant1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontWeight;
    private Double fontWeight1;

    public VectorText setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontWeight(%s)", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", fontWeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setFontWeight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public VectorText setHAlign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hAlign(%s)", (hAlign != null) ? hAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", (hAlign != null) ? hAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setHAlign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hAlign(%s)", hAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", hAlign1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double height;
    private String height1;

    public VectorText setHeight(Double height) {
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


    public VectorText setHeight(String height1) {
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

    private String htmlText;

    public VectorText setHtmlText(String htmlText) {
        if (jsBase == null) {
            this.htmlText = htmlText;
        } else {
            this.htmlText = htmlText;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".htmlText(%s)", htmlText));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".htmlText(%s)", htmlText));
                js.setLength(0);
            }
        }
        return this;
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public VectorText setLetterSpacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".letterSpacing(%s)", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%s)", letterSpacing));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setLetterSpacing(Double letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String lineHeight;
    private Double lineHeight1;

    public VectorText setLineHeight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".lineHeight(%s)", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", lineHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setLineHeight(Double lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".lineHeight(%f)", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%f)", lineHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double opacity;

    public VectorText setOpacity(Double opacity) {
        if (jsBase == null) {
            this.opacity = opacity;
        } else {
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".opacity(%f)", opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".opacity(%f)", opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private Path getPath;

    public Path getPath() {
        if (getPath == null)
            getPath = new Path(jsBase + ".path()");

        return getPath;
    }

    private Path path;

    public VectorText setPath(Path path) {
        if (jsBase == null) {
            this.path = path;
        } else {
            this.path = path;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".path(%s)", (path != null) ? path.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".path(%s)", (path != null) ? path.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean selectable;

    public VectorText setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectable(%b)", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectable(%b)", selectable));
                js.setLength(0);
            }
        }
        return this;
    }

    private String text;

    public VectorText setText(String text) {
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

    private Double textIndent;

    public VectorText setTextIndent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".textIndent(%f)", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textIndent(%f)", textIndent));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public VectorText setTextOverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".textOverflow(%s)", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setTextOverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".textOverflow(%s)", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", textOverflow1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public VectorText setVAlign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".vAlign(%s)", (vAlign != null) ? vAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", (vAlign != null) ? vAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setVAlign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".vAlign(%s)", vAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", vAlign1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    public VectorText setWidth(Double width) {
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


    public VectorText setWidth(String width1) {
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

    private String wordBreak;
    private TextWordBreak wordBreak1;

    public VectorText setWordBreak(String wordBreak) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak = wordBreak;
        } else {
            this.wordBreak = wordBreak;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".wordBreak(%s)", wordBreak));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wordBreak));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setWordBreak(TextWordBreak wordBreak1) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak1 = wordBreak1;
        } else {
            this.wordBreak1 = wordBreak1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".wordBreak(%s)", (wordBreak1 != null) ? wordBreak1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", (wordBreak1 != null) ? wordBreak1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String wordWrap;
    private TextWordWrap wordWrap1;

    public VectorText setWordWrap(String wordWrap) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap = wordWrap;
        } else {
            this.wordWrap = wordWrap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".wordWrap(%s)", wordWrap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wordWrap));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorText setWordWrap(TextWordWrap wordWrap1) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap1 = wordWrap1;
        } else {
            this.wordWrap1 = wordWrap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".wordWrap(%s)", (wordWrap1 != null) ? wordWrap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", (wordWrap1 != null) ? wordWrap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x;

    public VectorText setX(Double x) {
        if (jsBase == null) {
            this.x = x;
        } else {
            this.x = x;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".x(%f)", x));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".x(%f)", x));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double y;

    public VectorText setY(Double y) {
        if (jsBase == null) {
            this.y = y;
        } else {
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".y(%f)", y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".y(%f)", y));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetPath() {
        if (getPath != null) {
            return getPath.generateJs();
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSdecoration() {
        if (decoration != null) {
            return String.format(Locale.US, "decoration: %s,", (decoration != null) ? decoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdecoration1() {
        if (decoration1 != null) {
            return String.format(Locale.US, "decoration: %s,", decoration1);
        }
        return "";
    }

    private String generateJSdirection() {
        if (direction != null) {
            return String.format(Locale.US, "direction: %s,", (direction != null) ? direction.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdirection1() {
        if (direction1 != null) {
            return String.format(Locale.US, "direction: %s,", direction1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
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

    private String generateJShtmlText() {
        if (htmlText != null) {
            return String.format(Locale.US, "htmlText: %s,", htmlText);
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

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSpath() {
        if (path != null) {
            return String.format(Locale.US, "path: %s,", (path != null) ? path.generateJs() : "null");
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

    private String generateJSwordBreak() {
        if (wordBreak != null) {
            return String.format(Locale.US, "wordBreak: %s,", wordBreak);
        }
        return "";
    }

    private String generateJSwordBreak1() {
        if (wordBreak1 != null) {
            return String.format(Locale.US, "wordBreak: %s,", (wordBreak1 != null) ? wordBreak1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSwordWrap() {
        if (wordWrap != null) {
            return String.format(Locale.US, "wordWrap: %s,", wordWrap);
        }
        return "";
    }

    private String generateJSwordWrap1() {
        if (wordWrap1 != null) {
            return String.format(Locale.US, "wordWrap: %s,", (wordWrap1 != null) ? wordWrap1.generateJs() : "null");
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetPath());

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
            js.append(generateJScolor());
            js.append(generateJSdecoration());
            js.append(generateJSdecoration1());
            js.append(generateJSdirection());
            js.append(generateJSdirection1());
            js.append(generateJSfontFamily());
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
            js.append(generateJShtmlText());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJSopacity());
            js.append(generateJSpath());
            js.append(generateJSselectable());
            js.append(generateJStext());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSwordBreak());
            js.append(generateJSwordBreak1());
            js.append(generateJSwordWrap());
            js.append(generateJSwordWrap1());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
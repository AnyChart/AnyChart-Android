package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Text class.<br>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#text} or
{@link anychart.graphics.vector.Layer#text} to create layer or stage bound text.
<br/> Use {@link anychart.graphics#text} to create unbound text.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#text},<br/>
{@link anychart.graphics.vector.Layer#text},<br/>
{@link anychart.graphics#text}
 */
public class VectorText extends Element {

    public VectorText() {
        js.setLength(0);
        js.append("var vectorText").append(++variableIndex).append(" = anychart.graphics.vector.text();");
        jsBase = "vectorText" + variableIndex;
    }

    protected VectorText(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VectorText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String color;
    private List<VectorText> setColor = new ArrayList<>();

    /**
     * Setter for the text color.
     */
    public VectorText setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".color(%s)", wrapQuotes(color)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".color(%s)", wrapQuotes(color)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetColor() {
        if (!setColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Decoration decoration;
    private String decoration1;
    private List<VectorText> setDecoration = new ArrayList<>();

    /**
     * Setter for text decoration.
     */
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
            js.append(String.format(Locale.US, ".decoration(%s)", ((decoration != null) ? decoration.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".decoration(%s)", ((decoration != null) ? decoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDecoration() {
        if (!setDecoration.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setDecoration) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setDecoration1 = new ArrayList<>();

    /**
     * Setter for text decoration.
     */
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
            js.append(String.format(Locale.US, ".decoration(%s)", wrapQuotes(decoration1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".decoration(%s)", wrapQuotes(decoration1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDecoration1() {
        if (!setDecoration1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setDecoration1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Direction direction;
    private String direction1;
    private List<VectorText> setDirection = new ArrayList<>();

    /**
     * Setter for text direction.
     */
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
            js.append(String.format(Locale.US, ".direction(%s)", ((direction != null) ? direction.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".direction(%s)", ((direction != null) ? direction.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDirection() {
        if (!setDirection.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setDirection) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setDirection1 = new ArrayList<>();

    /**
     * Setter for text direction.
     */
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
            js.append(String.format(Locale.US, ".direction(%s)", wrapQuotes(direction1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".direction(%s)", wrapQuotes(direction1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDirection1() {
        if (!setDirection1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setDirection1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontFamily;
    private List<VectorText> setFontFamily = new ArrayList<>();

    /**
     * Setter for font family of text.
     */
    public VectorText setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontFamily() {
        if (!setFontFamily.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontSize;
    private Double fontSize1;
    private List<VectorText> setFontSize = new ArrayList<>();

    /**
     * Setter for font size of text.
     */
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
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontSize() {
        if (!setFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setFontSize1 = new ArrayList<>();

    /**
     * Setter for font size of text.
     */
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
    private String generateJSsetFontSize1() {
        if (!setFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;
    private List<VectorText> setFontStyle = new ArrayList<>();

    /**
     * Setter for font style of text.
     */
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle() {
        if (!setFontStyle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for font style of text.
     */
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle1() {
        if (!setFontStyle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;
    private List<VectorText> setFontVariant = new ArrayList<>();

    /**
     * Setter for font variant of text.
     */
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant() {
        if (!setFontVariant.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for font variant of text.
     */
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant1() {
        if (!setFontVariant1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Double fontWeight1;
    private List<VectorText> setFontWeight = new ArrayList<>();

    /**
     * Setter for font weight of text.
     */
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
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontWeight() {
        if (!setFontWeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for font weight of text.
     */
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
    private String generateJSsetFontWeight1() {
        if (!setFontWeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextHAlign hAlign;
    private String hAlign1;
    private List<VectorText> setHAlign = new ArrayList<>();

    /**
     * Setter for horizontal align of text.
     */
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
            js.append(String.format(Locale.US, ".hAlign(%s)", ((hAlign != null) ? hAlign.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", ((hAlign != null) ? hAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign() {
        if (!setHAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setHAlign1 = new ArrayList<>();

    /**
     * Setter for horizontal align of text.
     */
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
            js.append(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign1() {
        if (!setHAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double height;
    private String height1;
    private List<VectorText> setHeight = new ArrayList<>();

    /**
     * Sets a height.
     */
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
    private String generateJSsetHeight() {
        if (!setHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setHeight1 = new ArrayList<>();

    /**
     * Sets a height.
     */
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
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight1() {
        if (!setHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String htmlText;
    private List<VectorText> setHtmlText = new ArrayList<>();

    /**
     * Setter for the HTML format.
     */
    public VectorText setHtmlText(String htmlText) {
        if (jsBase == null) {
            this.htmlText = htmlText;
        } else {
            this.htmlText = htmlText;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".htmlText(%s)", wrapQuotes(htmlText)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".htmlText(%s)", wrapQuotes(htmlText)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHtmlText() {
        if (!setHtmlText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setHtmlText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String letterSpacing;
    private Double letterSpacing1;
    private List<VectorText> setLetterSpacing = new ArrayList<>();

    /**
     * Setter for letter spacing of text.
     */
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
            js.append(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLetterSpacing() {
        if (!setLetterSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setLetterSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setLetterSpacing1 = new ArrayList<>();

    /**
     * Setter for letter spacing of text.
     */
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
    private String generateJSsetLetterSpacing1() {
        if (!setLetterSpacing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setLetterSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String lineHeight;
    private Double lineHeight1;
    private List<VectorText> setLineHeight = new ArrayList<>();

    /**
     * Sets line height, either as ratio or in pixels.
     */
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
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLineHeight() {
        if (!setLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setLineHeight1 = new ArrayList<>();

    /**
     * Sets line height, either as ratio or in pixels.
     */
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
    private String generateJSsetLineHeight1() {
        if (!setLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double opacity;
    private List<VectorText> setOpacity = new ArrayList<>();

    /**
     * Setter for text opacity.
     */
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
    private String generateJSsetOpacity() {
        if (!setOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Path getPath;

    /**
     * Getter for the path element.
     */
    public Path getPath() {
        if (getPath == null)
            getPath = new Path(jsBase + ".path()");

        return getPath;
    }

    private Path path;
    private List<VectorText> setPath = new ArrayList<>();

    /**
     * Setter for the path element.
     */
    public VectorText setPath(Path path) {
        if (jsBase == null) {
            this.path = path;
        } else {
            this.path = path;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(path.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".path(%s);",  ((path != null) ? path.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetPath() {
        if (!setPath.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setPath) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selectable;
    private List<VectorText> setSelectable = new ArrayList<>();

    /**
     * Setter for the text selectable property.<br/>
Defines whether text can be selected. If <b>false</b> - no selection.
     */
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
    private String generateJSsetSelectable() {
        if (!setSelectable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setSelectable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String text;
    private List<VectorText> setText = new ArrayList<>();

    /**
     * Setter for the text.
     */
    public VectorText setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetText() {
        if (!setText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double textIndent;
    private List<VectorText> setTextIndent = new ArrayList<>();

    /**
     * Setter for text indent.<br/>
The text-indent property specifies the indentation of the first line in a text-block.
     */
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
    private String generateJSsetTextIndent() {
        if (!setTextIndent.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setTextIndent) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextOverflow textOverflow;
    private String textOverflow1;
    private List<VectorText> setTextOverflow = new ArrayList<>();

    /**
     * Setter for the text overflow mode.
     */
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
            js.append(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow() {
        if (!setTextOverflow.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setTextOverflow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setTextOverflow1 = new ArrayList<>();

    /**
     * Setter for the text overflow mode.
     */
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
            js.append(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow1() {
        if (!setTextOverflow1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setTextOverflow1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextVAlign vAlign;
    private String vAlign1;
    private List<VectorText> setVAlign = new ArrayList<>();

    /**
     * Setter for vertical align of text.
     */
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
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign != null) ? vAlign.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", ((vAlign != null) ? vAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign() {
        if (!setVAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setVAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setVAlign1 = new ArrayList<>();

    /**
     * Setter for vertical align of text.
     */
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
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign1() {
        if (!setVAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setVAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<VectorText> setWidth = new ArrayList<>();

    /**
     * Sets a width.
     */
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
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setWidth1 = new ArrayList<>();

    /**
     * Sets a width.
     */
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
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth1() {
        if (!setWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String wordBreak;
    private TextWordBreak wordBreak1;
    private List<VectorText> setWordBreak = new ArrayList<>();

    /**
     * Setter for word break of text.
     */
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
            js.append(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak() {
        if (!setWordBreak.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWordBreak) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setWordBreak1 = new ArrayList<>();

    /**
     * Setter for word break of text.
     */
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
            js.append(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak1 != null) ? wordBreak1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak1 != null) ? wordBreak1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak1() {
        if (!setWordBreak1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWordBreak1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String wordWrap;
    private TextWordWrap wordWrap1;
    private List<VectorText> setWordWrap = new ArrayList<>();

    /**
     * Setter for word-wrap of text.
More at: <a href='https://www.w3schools.com/cssref/css3_pr_word-wrap.asp'>Word-wrap Property</a>
     */
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
            js.append(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap() {
        if (!setWordWrap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWordWrap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorText> setWordWrap1 = new ArrayList<>();

    /**
     * Setter for word-wrap of text.
More at: <a href='https://www.w3schools.com/cssref/css3_pr_word-wrap.asp'>Word-wrap Property</a>
     */
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
            js.append(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap1 != null) ? wordWrap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap1 != null) ? wordWrap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap1() {
        if (!setWordWrap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setWordWrap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double x;
    private List<VectorText> setX = new ArrayList<>();

    /**
     * Setter for X coordinate of text.
     */
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
    private String generateJSsetX() {
        if (!setX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double y;
    private List<VectorText> setY = new ArrayList<>();

    /**
     * Setter for Y coordinate of text.
     */
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
    private String generateJSsetY() {
        if (!setY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorText item : setY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetPath() {
        if (getPath != null) {
            return getPath.generateJs();
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

        js.append(generateJsGetters());

        js.append(generateJSsetColor());
        js.append(generateJSsetDecoration());
        js.append(generateJSsetDecoration1());
        js.append(generateJSsetDirection());
        js.append(generateJSsetDirection1());
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontSize());
        js.append(generateJSsetFontSize1());
        js.append(generateJSsetFontStyle());
        js.append(generateJSsetFontStyle1());
        js.append(generateJSsetFontVariant());
        js.append(generateJSsetFontVariant1());
        js.append(generateJSsetFontWeight());
        js.append(generateJSsetFontWeight1());
        js.append(generateJSsetHAlign());
        js.append(generateJSsetHAlign1());
        js.append(generateJSsetHeight());
        js.append(generateJSsetHeight1());
        js.append(generateJSsetHtmlText());
        js.append(generateJSsetLetterSpacing());
        js.append(generateJSsetLetterSpacing1());
        js.append(generateJSsetLineHeight());
        js.append(generateJSsetLineHeight1());
        js.append(generateJSsetOpacity());
        js.append(generateJSsetPath());
        js.append(generateJSsetSelectable());
        js.append(generateJSsetText());
        js.append(generateJSsetTextIndent());
        js.append(generateJSsetTextOverflow());
        js.append(generateJSsetTextOverflow1());
        js.append(generateJSsetVAlign());
        js.append(generateJSsetVAlign1());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        js.append(generateJSsetWordBreak());
        js.append(generateJSsetWordBreak1());
        js.append(generateJSsetWordWrap());
        js.append(generateJSsetWordWrap1());
        js.append(generateJSsetX());
        js.append(generateJSsetY());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * This class is responsible of the text formatting, it processes the plain text and the text in HTML format.
 */
public class CoreText extends VisualBase {

    public CoreText() {
        js.setLength(0);
        js.append("var coreText").append(++variableIndex).append(" = anychart.core.text();");
        jsBase = "coreText" + variableIndex;
    }

    protected CoreText(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CoreText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean disablePointerEvents;
    private List<CoreText> setDisablePointerEvents = new ArrayList<>();

    /**
     * Setter for the pointer events.
     */
    public CoreText setDisablePointerEvents(Boolean disablePointerEvents) {
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
    private String generateJSsetDisablePointerEvents() {
        if (!setDisablePointerEvents.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setDisablePointerEvents) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontColor;
    private List<CoreText> setFontColor = new ArrayList<>();

    /**
     * Setter for the text font color.<br/>
{@link https://www.w3schools.com/html/html_colors.asp}
     */
    public CoreText setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontColor() {
        if (!setFontColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setFontColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Decoration fontDecoration;
    private String fontDecoration1;
    private List<CoreText> setFontDecoration = new ArrayList<>();

    /**
     * Setter for the text font decoration.
     */
    public CoreText setFontDecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration() {
        if (!setFontDecoration.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setFontDecoration) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setFontDecoration1 = new ArrayList<>();

    /**
     * Setter for the text font decoration.
     */
    public CoreText setFontDecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration1() {
        if (!setFontDecoration1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setFontDecoration1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontFamily;
    private List<CoreText> setFontFamily = new ArrayList<>();

    /**
     * Setter for font family.
     */
    public CoreText setFontFamily(String fontFamily) {
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
            for (CoreText item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontOpacity;
    private List<CoreText> setFontOpacity = new ArrayList<>();

    /**
     * Setter for the text font opacity. Double value from 0 to 1.
     */
    public CoreText setFontOpacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontOpacity() {
        if (!setFontOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setFontOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontSize;
    private Double fontSize1;
    private List<CoreText> setFontSize = new ArrayList<>();

    /**
     * Setter for text font size.
     */
    public CoreText setFontSize(String fontSize) {
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
            for (CoreText item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setFontSize1 = new ArrayList<>();

    /**
     * Setter for text font size.
     */
    public CoreText setFontSize(Double fontSize1) {
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
            for (CoreText item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;
    private List<CoreText> setFontStyle = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public CoreText setFontStyle(TextFontStyle fontStyle) {
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
            for (CoreText item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public CoreText setFontStyle(String fontStyle1) {
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
            for (CoreText item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;
    private List<CoreText> setFontVariant = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public CoreText setFontVariant(TextFontVariant fontVariant) {
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
            for (CoreText item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public CoreText setFontVariant(String fontVariant1) {
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
            for (CoreText item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Double fontWeight1;
    private List<CoreText> setFontWeight = new ArrayList<>();

    /**
     * Setter for the text font weight.<br/>
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public CoreText setFontWeight(String fontWeight) {
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
            for (CoreText item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for the text font weight.<br/>
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public CoreText setFontWeight(Double fontWeight1) {
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
            for (CoreText item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextHAlign hAlign;
    private String hAlign1;
    private List<CoreText> setHAlign = new ArrayList<>();

    /**
     * Setter for the text horizontal align.
     */
    public CoreText setHAlign(TextHAlign hAlign) {
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
            for (CoreText item : setHAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setHAlign1 = new ArrayList<>();

    /**
     * Setter for the text horizontal align.
     */
    public CoreText setHAlign(String hAlign1) {
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
            for (CoreText item : setHAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String letterSpacing;
    private Double letterSpacing1;
    private List<CoreText> setLetterSpacing = new ArrayList<>();

    /**
     * Setter for the text letter spacing.<br/>
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public CoreText setLetterSpacing(String letterSpacing) {
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
            for (CoreText item : setLetterSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setLetterSpacing1 = new ArrayList<>();

    /**
     * Setter for the text letter spacing.<br/>
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public CoreText setLetterSpacing(Double letterSpacing1) {
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
            for (CoreText item : setLetterSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String lineHeight;
    private Double lineHeight1;
    private List<CoreText> setLineHeight = new ArrayList<>();

    /**
     * Setter for the text line height.<br/>
{@link https://www.w3schools.com/cssref/pr_dim_line-height.asp}
     */
    public CoreText setLineHeight(String lineHeight) {
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
            for (CoreText item : setLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setLineHeight1 = new ArrayList<>();

    /**
     * Setter for the text line height.<br/>
{@link https://www.w3schools.com/cssref/pr_dim_line-height.asp}
     */
    public CoreText setLineHeight(Double lineHeight1) {
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
            for (CoreText item : setLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selectable;
    private List<CoreText> setSelectable = new ArrayList<>();

    /**
     * Setter for the text selectable.
     */
    public CoreText setSelectable(Boolean selectable) {
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
            for (CoreText item : setSelectable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Direction textDirection;
    private String textDirection1;
    private List<CoreText> setTextDirection = new ArrayList<>();

    /**
     * Setter for the text direction.
     */
    public CoreText setTextDirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection != null) ? textDirection.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", ((textDirection != null) ? textDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection() {
        if (!setTextDirection.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextDirection) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setTextDirection1 = new ArrayList<>();

    /**
     * Setter for the text direction.
     */
    public CoreText setTextDirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection1() {
        if (!setTextDirection1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextDirection1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double textIndent;
    private List<CoreText> setTextIndent = new ArrayList<>();

    /**
     * Setter for the text indent.
     */
    public CoreText setTextIndent(Double textIndent) {
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
            for (CoreText item : setTextIndent) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextOverflow textOverflow;
    private String textOverflow1;
    private List<CoreText> setTextOverflow = new ArrayList<>();

    /**
     * Setter for the text overflow settings.
     */
    public CoreText setTextOverflow(TextOverflow textOverflow) {
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
            for (CoreText item : setTextOverflow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setTextOverflow1 = new ArrayList<>();

    /**
     * Setter for the text overflow settings.
     */
    public CoreText setTextOverflow(String textOverflow1) {
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
            for (CoreText item : setTextOverflow1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String objectWithSettings;
    private List<CoreText> setTextSettings = new ArrayList<>();

    /**
     * Setter for text appearance settings.
     */
    public CoreText setTextSettings(String objectWithSettings) {
        if (jsBase == null) {
            this.objectWithSettings = objectWithSettings;
        } else {
            this.objectWithSettings = objectWithSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textSettings(%s)", wrapQuotes(objectWithSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s)", wrapQuotes(objectWithSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings() {
        if (!setTextSettings.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextSettings) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;
    private List<CoreText> setTextSettings1 = new ArrayList<>();

    /**
     * Setter for the text appearance settings.
     */
    public CoreText setTextSettings(String name, String textSettings) {
        if (jsBase == null) {
            this.name = name;
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings = textSettings;
        } else {
            this.name = name;
            this.textSettings = textSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textSettings(%s, %s)", wrapQuotes(name), wrapQuotes(textSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s, %s)", wrapQuotes(name), wrapQuotes(textSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings1() {
        if (!setTextSettings1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextSettings1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setTextSettings2 = new ArrayList<>();

    /**
     * Setter for the text appearance settings.
     */
    public CoreText setTextSettings(String name, Double textSettings1) {
        if (jsBase == null) {
            this.name = name;
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings1 = textSettings1;
        } else {
            this.name = name;
            this.textSettings1 = textSettings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textSettings(%s, %f)", wrapQuotes(name), textSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s, %f)", wrapQuotes(name), textSettings1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings2() {
        if (!setTextSettings2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextSettings2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setTextSettings3 = new ArrayList<>();

    /**
     * Setter for the text appearance settings.
     */
    public CoreText setTextSettings(String name, Boolean textSettings2) {
        if (jsBase == null) {
            this.name = name;
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings2 = textSettings2;
        } else {
            this.name = name;
            this.textSettings2 = textSettings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".textSettings(%s, %b)", wrapQuotes(name), textSettings2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s, %b)", wrapQuotes(name), textSettings2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings3() {
        if (!setTextSettings3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setTextSettings3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean useHtml;
    private List<CoreText> setUseHtml = new ArrayList<>();

    /**
     * Setter for flag useHTML.
     */
    public CoreText setUseHtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".useHtml(%b)", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".useHtml(%b)", useHtml));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUseHtml() {
        if (!setUseHtml.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setUseHtml) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextVAlign vAlign;
    private String vAlign1;
    private List<CoreText> setVAlign = new ArrayList<>();

    /**
     * Setter for the text vertical align.
     */
    public CoreText setVAlign(TextVAlign vAlign) {
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
            for (CoreText item : setVAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setVAlign1 = new ArrayList<>();

    /**
     * Setter for the text vertical align.
     */
    public CoreText setVAlign(String vAlign1) {
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
            for (CoreText item : setVAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;
    private List<CoreText> setWordBreak = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public CoreText setWordBreak(EnumsWordBreak wordBreak) {
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
            
            js.append(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak() {
        if (!setWordBreak.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setWordBreak) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setWordBreak1 = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public CoreText setWordBreak(String wordBreak1) {
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
            
            js.append(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak1() {
        if (!setWordBreak1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setWordBreak1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;
    private List<CoreText> setWordWrap = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public CoreText setWordWrap(EnumsWordWrap wordWrap) {
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
            
            js.append(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap() {
        if (!setWordWrap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setWordWrap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreText> setWordWrap1 = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public CoreText setWordWrap(String wordWrap1) {
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
            
            js.append(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap1() {
        if (!setWordWrap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreText item : setWordWrap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDisablePointerEvents());
        js.append(generateJSsetFontColor());
        js.append(generateJSsetFontDecoration());
        js.append(generateJSsetFontDecoration1());
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontOpacity());
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
        js.append(generateJSsetLetterSpacing());
        js.append(generateJSsetLetterSpacing1());
        js.append(generateJSsetLineHeight());
        js.append(generateJSsetLineHeight1());
        js.append(generateJSsetSelectable());
        js.append(generateJSsetTextDirection());
        js.append(generateJSsetTextDirection1());
        js.append(generateJSsetTextIndent());
        js.append(generateJSsetTextOverflow());
        js.append(generateJSsetTextOverflow1());
        js.append(generateJSsetTextSettings());
        js.append(generateJSsetTextSettings1());
        js.append(generateJSsetTextSettings2());
        js.append(generateJSsetTextSettings3());
        js.append(generateJSsetUseHtml());
        js.append(generateJSsetVAlign());
        js.append(generateJSsetVAlign1());
        js.append(generateJSsetWordBreak());
        js.append(generateJSsetWordBreak1());
        js.append(generateJSsetWordWrap());
        js.append(generateJSsetWordWrap1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
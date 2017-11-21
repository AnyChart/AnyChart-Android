package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class for creation of sets of similar labels and management of such sets.
Any individual label can be changed after all labels are displayed.
 */
public class UiLabelsFactory extends CoreText {

    public UiLabelsFactory() {
        js.setLength(0);
        js.append("var uiLabelsFactory").append(++variableIndex).append(" = anychart.core.ui.labelsFactory();");
        jsBase = "uiLabelsFactory" + variableIndex;
    }

    protected UiLabelsFactory(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiLabelsFactory(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean adjustByWidth;
    private Boolean adjustByHeight;
    private List<UiLabelsFactory> setAdjustFontSize = new ArrayList<>();

    /**
     * Setter for the adjusting font size by two parameters width and height.
     */
    public UiLabelsFactory setAdjustFontSize(Boolean adjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustByWidth = adjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustByWidth = adjustByWidth;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize() {
        if (!setAdjustFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAdjustFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String adjustFontSize;
    private Boolean[] adjustFontSize1;
    private Boolean adjustFontSize2;
    private List<UiLabelsFactory> setAdjustFontSize1 = new ArrayList<>();

    /**
     * Setter for the adjusting font size by one parameter.
     */
    public UiLabelsFactory setAdjustFontSize(String adjustFontSize) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize = adjustFontSize;
        } else {
            this.adjustFontSize = adjustFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s)", wrapQuotes(adjustFontSize)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s)", wrapQuotes(adjustFontSize)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize1() {
        if (!setAdjustFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAdjustFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setAdjustFontSize2 = new ArrayList<>();

    /**
     * Setter for the adjusting font size by one parameter.
     */
    public UiLabelsFactory setAdjustFontSize(Boolean[] adjustFontSize1) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize1 = adjustFontSize1;
        } else {
            this.adjustFontSize1 = adjustFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s)", Arrays.toString(adjustFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s)", Arrays.toString(adjustFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize2() {
        if (!setAdjustFontSize2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAdjustFontSize2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setAdjustFontSize3 = new ArrayList<>();

    /**
     * Setter for the adjusting font size by one parameter.
     */
    public UiLabelsFactory setAdjustFontSize(Boolean adjustFontSize2) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize2 = adjustFontSize2;
        } else {
            this.adjustFontSize2 = adjustFontSize2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b)", adjustFontSize2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b)", adjustFontSize2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize3() {
        if (!setAdjustFontSize3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAdjustFontSize3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsAnchor anchor;
    private String anchor1;
    private List<UiLabelsFactory> setAnchor = new ArrayList<>();

    /**
     * Setter for the labels anchor settings.
     */
    public UiLabelsFactory setAnchor(EnumsAnchor anchor) {
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
            
            js.append(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor() {
        if (!setAnchor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAnchor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setAnchor1 = new ArrayList<>();

    /**
     * Setter for the labels anchor settings.
     */
    public UiLabelsFactory setAnchor(String anchor1) {
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
            
            js.append(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor1() {
        if (!setAnchor1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setAnchor1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for the labels background settings.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;
    private List<UiLabelsFactory> setBackground = new ArrayList<>();

    /**
     * Setter for the labels background settings.
     */
    public UiLabelsFactory setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setBackground1 = new ArrayList<>();

    /**
     * Setter for the labels background settings.
     */
    public UiLabelsFactory setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground1() {
        if (!setBackground1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> getConnectorStroke = new ArrayList<>();

    /**
     * Getter for connector stroke settings.
     */
    public UiLabelsFactory getConnectorStroke(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        UiLabelsFactory item = new UiLabelsFactory(jsBase + ".connectorStroke(" + ((color != null) ? color.generateJs() : "null") + thickness + wrapQuotes(dashpattern) + ((lineJoin != null) ? lineJoin.generateJs() : "null") + ((lineCap != null) ? lineCap.generateJs() : "null") + ")");
        getConnectorStroke.add(item);
        return item;
    }

    private List<UiLabelsFactory> getConnectorStroke1 = new ArrayList<>();

    /**
     * Getter for connector stroke settings.
     */
    public UiLabelsFactory getConnectorStroke(String color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        UiLabelsFactory item = new UiLabelsFactory(jsBase + ".connectorStroke(" + wrapQuotes(color) + thickness + wrapQuotes(dashpattern) + ((lineJoin != null) ? lineJoin.generateJs() : "null") + ((lineCap != null) ? lineCap.generateJs() : "null") + ")");
        getConnectorStroke1.add(item);
        return item;
    }

    private String token;
    private List<UiLabelsFactory> setFormat = new ArrayList<>();

    /**
     * Setter for the labels text formatter.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using format() method.{docs}
     */
    public UiLabelsFactory setFormat(String token) {
        if (jsBase == null) {
            this.token = token;
        } else {
            this.token = token;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".format(%s)", wrapQuotes(token)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".format(%s)", wrapQuotes(token)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFormat() {
        if (!setFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private List<LabelsfactoryLabel> setGetLabel = new ArrayList<>();

    /**
     * Returns label by index.
     */
    public LabelsfactoryLabel getLabel(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setGetLabel" + ++variableIndex + " = " + jsBase + ".getLabel(%f);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getLabel(%f)", index));
                js.setLength(0);
            }
        }
        LabelsfactoryLabel item = new LabelsfactoryLabel("setGetLabel" + variableIndex);
        setGetLabel.add(item);
        return item;
    }
    private String generateJSsetGetLabel() {
        if (!setGetLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LabelsfactoryLabel item : setGetLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double height;
    private String height1;
    private List<UiLabelsFactory> setHeight = new ArrayList<>();

    /**
     * Setter for labels height settings.
     */
    public UiLabelsFactory setHeight(Double height) {
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
            for (UiLabelsFactory item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setHeight1 = new ArrayList<>();

    /**
     * Setter for labels height settings.
     */
    public UiLabelsFactory setHeight(String height1) {
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
            for (UiLabelsFactory item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxFontSize;
    private String maxFontSize1;
    private List<UiLabelsFactory> setMaxFontSize = new ArrayList<>();

    /**
     * Setter for maximum font size settings for adjust text to.
     */
    public UiLabelsFactory setMaxFontSize(Double maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize() {
        if (!setMaxFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setMaxFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setMaxFontSize1 = new ArrayList<>();

    /**
     * Setter for maximum font size settings for adjust text to.
     */
    public UiLabelsFactory setMaxFontSize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize1() {
        if (!setMaxFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setMaxFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minFontSize;
    private String minFontSize1;
    private List<UiLabelsFactory> setMinFontSize = new ArrayList<>();

    /**
     * Setter for the minimum font size settings for adjust text from.
     */
    public UiLabelsFactory setMinFontSize(Double minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%f)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%f)", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize() {
        if (!setMinFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setMinFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setMinFontSize1 = new ArrayList<>();

    /**
     * Setter for the minimum font size settings for adjust text from.
     */
    public UiLabelsFactory setMinFontSize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize1() {
        if (!setMinFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setMinFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetX;
    private String offsetX1;
    private List<UiLabelsFactory> setOffsetX = new ArrayList<>();

    /**
     * Setter for the labels offsetX settings.
     */
    public UiLabelsFactory setOffsetX(Double offsetX) {
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
    private String generateJSsetOffsetX() {
        if (!setOffsetX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setOffsetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setOffsetX1 = new ArrayList<>();

    /**
     * Setter for the labels offsetX settings.
     */
    public UiLabelsFactory setOffsetX(String offsetX1) {
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
            
            js.append(String.format(Locale.US, ".offsetX(%s)", wrapQuotes(offsetX1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%s)", wrapQuotes(offsetX1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetX1() {
        if (!setOffsetX1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setOffsetX1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetY;
    private String offsetY1;
    private List<UiLabelsFactory> setOffsetY = new ArrayList<>();

    /**
     * Setter for the labels offsetY settings.
     */
    public UiLabelsFactory setOffsetY(Double offsetY) {
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
    private String generateJSsetOffsetY() {
        if (!setOffsetY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setOffsetY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setOffsetY1 = new ArrayList<>();

    /**
     * Setter for the labels offsetY settings.
     */
    public UiLabelsFactory setOffsetY(String offsetY1) {
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
            
            js.append(String.format(Locale.US, ".offsetY(%s)", wrapQuotes(offsetY1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%s)", wrapQuotes(offsetY1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetY1() {
        if (!setOffsetY1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setOffsetY1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getPadding;

    /**
     * Getter for labels padding settings.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private Double padding3;
    private String padding4;
    private List<UiLabelsFactory> setPadding = new ArrayList<>();

    /**
     * Setter for labels padding in pixels using a single value.
     */
    public UiLabelsFactory setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setPadding1 = new ArrayList<>();

    /**
     * Setter for labels padding in pixels using a single value.
     */
    public UiLabelsFactory setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<UiLabelsFactory> setPadding2 = new ArrayList<>();

    /**
     * Setter for labels padding settings in pixels using several value.
     */
    public UiLabelsFactory setPadding(String value, String value2, String value4, String value6) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setPadding3 = new ArrayList<>();

    /**
     * Setter for labels padding settings in pixels using several value.
     */
    public UiLabelsFactory setPadding(Double value1, Double value3, Double value5, Double value7) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String position;
    private List<UiLabelsFactory> setPosition = new ArrayList<>();

    /**
     * Setter for the labels position settings.<br>
The default value and the list of available values can be different depending on where the labels are used, e.g. with axes of different types or with different charts.
Find more information in the detailed description.
     */
    public UiLabelsFactory setPosition(String position) {
        if (jsBase == null) {
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rotation;
    private List<UiLabelsFactory> setRotation = new ArrayList<>();

    /**
     * Setter for the rotation angle around an anchor.
     */
    public UiLabelsFactory setRotation(Double rotation) {
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
    private String generateJSsetRotation() {
        if (!setRotation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : setRotation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<UiLabelsFactory> setWidth = new ArrayList<>();

    /**
     * Setter for labels width settings.
     */
    public UiLabelsFactory setWidth(Double width) {
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
            for (UiLabelsFactory item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiLabelsFactory> setWidth1 = new ArrayList<>();

    /**
     * Setter for labels width settings.
     */
    public UiLabelsFactory setWidth(String width1) {
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
            for (UiLabelsFactory item : setWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetConnectorStroke() {
        if (!getConnectorStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : getConnectorStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetConnectorStroke1() {
        if (!getConnectorStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabelsFactory item : getConnectorStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetConnectorStroke());
        jsGetters.append(generateJSgetConnectorStroke1());
        jsGetters.append(generateJSgetPadding());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAdjustFontSize());
        js.append(generateJSsetAdjustFontSize1());
        js.append(generateJSsetAdjustFontSize2());
        js.append(generateJSsetAdjustFontSize3());
        js.append(generateJSsetAnchor());
        js.append(generateJSsetAnchor1());
        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
        js.append(generateJSsetFormat());
        js.append(generateJSsetGetLabel());
        js.append(generateJSsetHeight());
        js.append(generateJSsetHeight1());
        js.append(generateJSsetMaxFontSize());
        js.append(generateJSsetMaxFontSize1());
        js.append(generateJSsetMinFontSize());
        js.append(generateJSsetMinFontSize1());
        js.append(generateJSsetOffsetX());
        js.append(generateJSsetOffsetX1());
        js.append(generateJSsetOffsetY());
        js.append(generateJSsetOffsetY1());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPosition());
        js.append(generateJSsetRotation());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
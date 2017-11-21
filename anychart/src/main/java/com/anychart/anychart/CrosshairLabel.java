package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * The CrosshairLabel class contains methods for configuring the label of the crosshair.<br/>
Crosshair label is used text and position settings, the coloring, interactivity states and other settings.
 */
public class CrosshairLabel extends CoreText {

    public CrosshairLabel() {
        js.setLength(0);
        js.append("var crosshairLabel").append(++variableIndex).append(" = anychart.core.ui.crosshairLabel();");
        jsBase = "crosshairLabel" + variableIndex;
    }

    protected CrosshairLabel(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CrosshairLabel(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String bothOrByWidth;
    private Boolean[] bothOrByWidth1;
    private Boolean bothOrByWidth2;
    private Boolean byHeight;
    private List<CrosshairLabel> setAdjustFontSize = new ArrayList<>();

    /**
     * Setter for adjust font settings.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.ui.CrosshairLabel.adjustFontSize.png' height='97' width='399'/>
     */
    public CrosshairLabel setAdjustFontSize(String bothOrByWidth, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(bothOrByWidth), byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(bothOrByWidth), byHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize() {
        if (!setAdjustFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setAdjustFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setAdjustFontSize1 = new ArrayList<>();

    /**
     * Setter for adjust font settings.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.ui.CrosshairLabel.adjustFontSize.png' height='97' width='399'/>
     */
    public CrosshairLabel setAdjustFontSize(Boolean[] bothOrByWidth1, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(bothOrByWidth1), byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(bothOrByWidth1), byHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize1() {
        if (!setAdjustFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setAdjustFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setAdjustFontSize2 = new ArrayList<>();

    /**
     * Setter for adjust font settings.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.ui.CrosshairLabel.adjustFontSize.png' height='97' width='399'/>
     */
    public CrosshairLabel setAdjustFontSize(Boolean bothOrByWidth2, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", bothOrByWidth2, byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b, %b)", bothOrByWidth2, byHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize2() {
        if (!setAdjustFontSize2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setAdjustFontSize2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsAnchor anchor;
    private String anchor1;
    private List<CrosshairLabel> setAnchor = new ArrayList<>();

    /**
     * Setter for the crosshair label anchor settings.
     */
    public CrosshairLabel setAnchor(EnumsAnchor anchor) {
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
            for (CrosshairLabel item : setAnchor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setAnchor1 = new ArrayList<>();

    /**
     * Setter for the crosshair label anchor settings.
     */
    public CrosshairLabel setAnchor(String anchor1) {
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
            for (CrosshairLabel item : setAnchor1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double axisIndex;
    private List<CrosshairLabel> setAxisIndex = new ArrayList<>();

    /**
     * Setter for the axis index.
     */
    public CrosshairLabel setAxisIndex(Double axisIndex) {
        if (jsBase == null) {
            this.axisIndex = axisIndex;
        } else {
            this.axisIndex = axisIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".axisIndex(%f)", axisIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axisIndex(%f)", axisIndex));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAxisIndex() {
        if (!setAxisIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setAxisIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for crosshair label background settings.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;
    private List<CrosshairLabel> setBackground = new ArrayList<>();

    /**
     * Setter for crosshair label background settings.
     */
    public CrosshairLabel setBackground(String background) {
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
            for (CrosshairLabel item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setBackground1 = new ArrayList<>();

    /**
     * Setter for crosshair label background settings.
     */
    public CrosshairLabel setBackground(Boolean background2) {
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
            for (CrosshairLabel item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double height;
    private String height1;
    private List<CrosshairLabel> setHeight = new ArrayList<>();

    /**
     * Setter for the crosshair label height.
     */
    public CrosshairLabel setHeight(Double height) {
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
            for (CrosshairLabel item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setHeight1 = new ArrayList<>();

    /**
     * Setter for the crosshair label height.
     */
    public CrosshairLabel setHeight(String height1) {
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
            for (CrosshairLabel item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxFontSize;
    private String maxFontSize1;
    private List<CrosshairLabel> setMaxFontSize = new ArrayList<>();

    /**
     * Setter for the font size for adjust text to.
     */
    public CrosshairLabel setMaxFontSize(Double maxFontSize) {
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
            for (CrosshairLabel item : setMaxFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setMaxFontSize1 = new ArrayList<>();

    /**
     * Setter for the font size for adjust text to.
     */
    public CrosshairLabel setMaxFontSize(String maxFontSize1) {
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
            for (CrosshairLabel item : setMaxFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minFontSize;
    private String minFontSize1;
    private List<CrosshairLabel> setMinFontSize = new ArrayList<>();

    /**
     * Setter for the minimum font size for adjust text from.
     */
    public CrosshairLabel setMinFontSize(Double minFontSize) {
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
            for (CrosshairLabel item : setMinFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setMinFontSize1 = new ArrayList<>();

    /**
     * Setter for the minimum font size for adjust text from.
     */
    public CrosshairLabel setMinFontSize(String minFontSize1) {
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
            for (CrosshairLabel item : setMinFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetX;
    private String offsetX1;
    private List<CrosshairLabel> setOffsetX = new ArrayList<>();

    /**
     * Setter for crosshair label offsetX settings.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.ui.CrosshairLabel.offsetX.png' height='436' width='577'/><br/>
Arrows show offsets layout.
     */
    public CrosshairLabel setOffsetX(Double offsetX) {
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
            for (CrosshairLabel item : setOffsetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setOffsetX1 = new ArrayList<>();

    /**
     * Setter for crosshair label offsetX settings.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.ui.CrosshairLabel.offsetX.png' height='436' width='577'/><br/>
Arrows show offsets layout.
     */
    public CrosshairLabel setOffsetX(String offsetX1) {
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
            for (CrosshairLabel item : setOffsetX1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetY;
    private String offsetY1;
    private List<CrosshairLabel> setOffsetY = new ArrayList<>();

    /**
     * Setter for crosshair label offsetY settings.
See illustration in {@link anychart.core.ui.CrosshairLabel#offsetX}.
     */
    public CrosshairLabel setOffsetY(Double offsetY) {
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
            for (CrosshairLabel item : setOffsetY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setOffsetY1 = new ArrayList<>();

    /**
     * Setter for crosshair label offsetY settings.
See illustration in {@link anychart.core.ui.CrosshairLabel#offsetX}.
     */
    public CrosshairLabel setOffsetY(String offsetY1) {
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
            for (CrosshairLabel item : setOffsetY1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the crosshair label padding.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private List<CrosshairLabel> setPadding = new ArrayList<>();

    /**
     * Setter for crosshair label padding in pixels by one value.
     */
    public CrosshairLabel setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
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
            for (CrosshairLabel item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setPadding1 = new ArrayList<>();

    /**
     * Setter for crosshair label padding in pixels by one value.
     */
    public CrosshairLabel setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
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
            for (CrosshairLabel item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setPadding2 = new ArrayList<>();

    /**
     * Setter for crosshair label padding in pixels by one value.
     */
    public CrosshairLabel setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setPadding2) {
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
    private List<CrosshairLabel> setPadding3 = new ArrayList<>();

    /**
     * Setter for crosshair label padding in pixels.
     */
    public CrosshairLabel setPadding(String value, String value2, String value4, String value6) {
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
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setPadding4 = new ArrayList<>();

    /**
     * Setter for crosshair label padding in pixels.
     */
    public CrosshairLabel setPadding(Double value1, Double value3, Double value5, Double value7) {
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
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CrosshairLabel item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<CrosshairLabel> setWidth = new ArrayList<>();

    /**
     * Setter for the crosshair label width.
     */
    public CrosshairLabel setWidth(Double width) {
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
            for (CrosshairLabel item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CrosshairLabel> setWidth1 = new ArrayList<>();

    /**
     * Setter for the crosshair label width.
     */
    public CrosshairLabel setWidth(String width1) {
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
            for (CrosshairLabel item : setWidth1) {
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
        js.append(generateJSsetAnchor());
        js.append(generateJSsetAnchor1());
        js.append(generateJSsetAxisIndex());
        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
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
        js.append(generateJSsetPadding4());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
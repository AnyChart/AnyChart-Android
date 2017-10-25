package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class UiLegend extends CoreText {

    public UiLegend() {

    }

    protected UiLegend(String jsBase) {
        this.jsBase = jsBase;
    }

    protected UiLegend(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private EnumsAlign align;
    private String align1;

    public UiLegend setAlign(EnumsAlign align) {
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

            js.append(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setAlign(String align1) {
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

            js.append(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    public UiLegend setBackground(String background) {
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


    public UiLegend setBackground(Boolean background2) {
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

    private Boolean drag;

    public UiLegend drag(Boolean drag) {
        if (jsBase == null) {
            this.drag = drag;
        } else {
            this.drag = drag;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".drag(%b)", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drag(%b)", drag));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getGetRemainingBounds;

    public AnychartMathRect getGetRemainingBounds() {
        if (getGetRemainingBounds == null)
            getGetRemainingBounds = new AnychartMathRect(jsBase + ".getRemainingBounds()");

        return getGetRemainingBounds;
    }

    private Double height;
    private String height1;

    public UiLegend setHeight(Double height) {
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


    public UiLegend setHeight(String height1) {
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

    private EnumsCursor hoverCursor;
    private String hoverCursor1;

    public UiLegend setHoverCursor(EnumsCursor hoverCursor) {
        if (jsBase == null) {
            this.hoverCursor = null;
            this.hoverCursor1 = null;
            
            this.hoverCursor = hoverCursor;
        } else {
            this.hoverCursor = hoverCursor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hoverCursor(%s)", ((hoverCursor != null) ? hoverCursor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hoverCursor(%s)", ((hoverCursor != null) ? hoverCursor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setHoverCursor(String hoverCursor1) {
        if (jsBase == null) {
            this.hoverCursor = null;
            this.hoverCursor1 = null;
            
            this.hoverCursor1 = hoverCursor1;
        } else {
            this.hoverCursor1 = hoverCursor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hoverCursor(%s)", wrapQuotes(hoverCursor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hoverCursor(%s)", wrapQuotes(hoverCursor1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double iconSize;
    private String iconSize1;

    public UiLegend setIconSize(Double iconSize) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize = iconSize;
        } else {
            this.iconSize = iconSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconSize(%f)", iconSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconSize(%f)", iconSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setIconSize(String iconSize1) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize1 = iconSize1;
        } else {
            this.iconSize1 = iconSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconSize(%s)", wrapQuotes(iconSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconSize(%s)", wrapQuotes(iconSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String iconTextSpacing;
    private Double iconTextSpacing1;

    public UiLegend setIconTextSpacing(String iconTextSpacing) {
        if (jsBase == null) {
            this.iconTextSpacing = null;
            this.iconTextSpacing1 = null;
            
            this.iconTextSpacing = iconTextSpacing;
        } else {
            this.iconTextSpacing = iconTextSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconTextSpacing(%s)", wrapQuotes(iconTextSpacing)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconTextSpacing(%s)", wrapQuotes(iconTextSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setIconTextSpacing(Double iconTextSpacing1) {
        if (jsBase == null) {
            this.iconTextSpacing = null;
            this.iconTextSpacing1 = null;
            
            this.iconTextSpacing1 = iconTextSpacing1;
        } else {
            this.iconTextSpacing1 = iconTextSpacing1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconTextSpacing(%f)", iconTextSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconTextSpacing(%f)", iconTextSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean inverted;

    public UiLegend setInverted(Boolean inverted) {
        if (jsBase == null) {
            this.inverted = inverted;
        } else {
            this.inverted = inverted;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".inverted(%b)", inverted));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".inverted(%b)", inverted));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItemProvider[] items;

    public UiLegend setItems(LegendItemProvider[] items) {
        if (jsBase == null) {
            this.items = items;
        } else {
            this.items = items;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s)", arrayToString(items)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s)", arrayToString(items)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendLayout itemsLayout;
    private String itemsLayout1;

    public UiLegend setItemsLayout(LegendLayout itemsLayout) {
        if (jsBase == null) {
            this.itemsLayout = null;
            this.itemsLayout1 = null;
            
            this.itemsLayout = itemsLayout;
        } else {
            this.itemsLayout = itemsLayout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsLayout(%s)", ((itemsLayout != null) ? itemsLayout.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsLayout(%s)", ((itemsLayout != null) ? itemsLayout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setItemsLayout(String itemsLayout1) {
        if (jsBase == null) {
            this.itemsLayout = null;
            this.itemsLayout1 = null;
            
            this.itemsLayout1 = itemsLayout1;
        } else {
            this.itemsLayout1 = itemsLayout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsLayout(%s)", wrapQuotes(itemsLayout1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsLayout(%s)", wrapQuotes(itemsLayout1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItemsSourceMode itemsSourceMode;
    private String itemsSourceMode1;

    public UiLegend setItemsSourceMode(LegendItemsSourceMode itemsSourceMode) {
        if (jsBase == null) {
            this.itemsSourceMode = null;
            this.itemsSourceMode1 = null;
            
            this.itemsSourceMode = itemsSourceMode;
        } else {
            this.itemsSourceMode = itemsSourceMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSourceMode(%s)", ((itemsSourceMode != null) ? itemsSourceMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSourceMode(%s)", ((itemsSourceMode != null) ? itemsSourceMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setItemsSourceMode(String itemsSourceMode1) {
        if (jsBase == null) {
            this.itemsSourceMode = null;
            this.itemsSourceMode1 = null;
            
            this.itemsSourceMode1 = itemsSourceMode1;
        } else {
            this.itemsSourceMode1 = itemsSourceMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSourceMode(%s)", wrapQuotes(itemsSourceMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSourceMode(%s)", wrapQuotes(itemsSourceMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String itemsSpacing;
    private Double itemsSpacing1;

    public UiLegend setItemsSpacing(String itemsSpacing) {
        if (jsBase == null) {
            this.itemsSpacing = null;
            this.itemsSpacing1 = null;
            
            this.itemsSpacing = itemsSpacing;
        } else {
            this.itemsSpacing = itemsSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSpacing(%s)", wrapQuotes(itemsSpacing)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSpacing(%s)", wrapQuotes(itemsSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setItemsSpacing(Double itemsSpacing1) {
        if (jsBase == null) {
            this.itemsSpacing = null;
            this.itemsSpacing1 = null;
            
            this.itemsSpacing1 = itemsSpacing1;
        } else {
            this.itemsSpacing1 = itemsSpacing1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSpacing(%f)", itemsSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSpacing(%f)", itemsSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;
    private Double margin3;
    private String margin4;

    public UiLegend setMargin(Double[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public UiLegend setMargin(String value, String value2, String value4, String value6) {
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

            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setMargin(Double value1, Double value3, Double value5, Double value7) {
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

            js.append(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxHeight;
    private String maxHeight1;

    public UiLegend setMaxHeight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxHeight(%f)", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%f)", maxHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxWidth;
    private String maxWidth1;

    public UiLegend setMaxWidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxWidth(%f)", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxWidth(%f)", maxWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setMaxWidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxWidth(%s)", wrapQuotes(maxWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxWidth(%s)", wrapQuotes(maxWidth1)));
                js.setLength(0);
            }
        }
        return this;
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
    private Double padding3;
    private String padding4;

    public UiLegend setPadding(Double[] padding) {
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


    public UiLegend setPadding(String[] padding1) {
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

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public UiLegend setPadding(String value8, String value10, String value12, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value12 = value12;
            this.value14 = value14;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setPadding(Double value9, Double value11, Double value13, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value13 = value13;
            this.value15 = value15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value9, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
        return this;
    }

    private Paginator getPaginator;

    public Paginator getPaginator() {
        if (getPaginator == null)
            getPaginator = new Paginator(jsBase + ".paginator()");

        return getPaginator;
    }

    private String paginator;
    private Boolean paginator1;

    public UiLegend setPaginator(String paginator) {
        if (jsBase == null) {
            this.paginator = null;
            this.paginator1 = null;
            
            this.paginator = paginator;
        } else {
            this.paginator = paginator;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".paginator(%s)", wrapQuotes(paginator)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".paginator(%s)", wrapQuotes(paginator)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setPaginator(Boolean paginator1) {
        if (jsBase == null) {
            this.paginator = null;
            this.paginator1 = null;
            
            this.paginator1 = paginator1;
        } else {
            this.paginator1 = paginator1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".paginator(%b)", paginator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".paginator(%b)", paginator1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Orientation position;
    private String position1;

    public UiLegend setPosition(Orientation position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendPositionMode positionMode;
    private String positionMode1;

    public UiLegend setPositionMode(LegendPositionMode positionMode) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode = positionMode;
        } else {
            this.positionMode = positionMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".positionMode(%s)", ((positionMode != null) ? positionMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".positionMode(%s)", ((positionMode != null) ? positionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setPositionMode(String positionMode1) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode1 = positionMode1;
        } else {
            this.positionMode1 = positionMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".positionMode(%s)", wrapQuotes(positionMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".positionMode(%s)", wrapQuotes(positionMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public UiLegend setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%b)", title));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String titleFormat;

    public UiLegend setTitleFormat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Separator getTitleSeparator;

    public Separator getTitleSeparator() {
        if (getTitleSeparator == null)
            getTitleSeparator = new Separator(jsBase + ".titleSeparator()");

        return getTitleSeparator;
    }

    private String titleSeparator;
    private Boolean titleSeparator1;

    public UiLegend setTitleSeparator(String titleSeparator) {
        if (jsBase == null) {
            this.titleSeparator = null;
            this.titleSeparator1 = null;
            
            this.titleSeparator = titleSeparator;
        } else {
            this.titleSeparator = titleSeparator;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".titleSeparator(%s)", wrapQuotes(titleSeparator)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleSeparator(%s)", wrapQuotes(titleSeparator)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setTitleSeparator(Boolean titleSeparator1) {
        if (jsBase == null) {
            this.titleSeparator = null;
            this.titleSeparator1 = null;
            
            this.titleSeparator1 = titleSeparator1;
        } else {
            this.titleSeparator1 = titleSeparator1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".titleSeparator(%b)", titleSeparator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleSeparator(%b)", titleSeparator1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public UiLegend setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiLegend setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".tooltip(%b)", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    public UiLegend setWidth(Double width) {
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


    public UiLegend setWidth(String width1) {
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


//
//    private String generateJSUiBackground getBackground() {
//        if (UiBackground getBackground != null) {
//            return UiBackground getBackground.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSAnychartMathRect getGetRemainingBounds() {
//        if (AnychartMathRect getGetRemainingBounds != null) {
//            return AnychartMathRect getGetRemainingBounds.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSMargin getMargin() {
//        if (Margin getMargin != null) {
//            return Margin getMargin.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUtilsPadding getPadding() {
//        if (UtilsPadding getPadding != null) {
//            return UtilsPadding getPadding.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSPaginator getPaginator() {
//        if (Paginator getPaginator != null) {
//            return Paginator getPaginator.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiTitle getTitle() {
//        if (UiTitle getTitle != null) {
//            return UiTitle getTitle.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSSeparator getTitleSeparator() {
//        if (Separator getTitleSeparator != null) {
//            return Separator getTitleSeparator.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSTooltip getTooltip() {
//        if (Tooltip getTooltip != null) {
//            return Tooltip getTooltip.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
            //return String.format(Locale.US, "getBackground: %s,", ((getBackground != null) ? getBackground.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetGetRemainingBounds() {
        if (getGetRemainingBounds != null) {
            return getGetRemainingBounds.generateJs();
            //return String.format(Locale.US, "getGetRemainingBounds: %s,", ((getGetRemainingBounds != null) ? getGetRemainingBounds.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
            //return String.format(Locale.US, "getMargin: %s,", ((getMargin != null) ? getMargin.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
            //return String.format(Locale.US, "getPadding: %s,", ((getPadding != null) ? getPadding.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetPaginator() {
        if (getPaginator != null) {
            return getPaginator.generateJs();
            //return String.format(Locale.US, "getPaginator: %s,", ((getPaginator != null) ? getPaginator.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
            //return String.format(Locale.US, "getTitle: %s,", ((getTitle != null) ? getTitle.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetTitleSeparator() {
        if (getTitleSeparator != null) {
            return getTitleSeparator.generateJs();
            //return String.format(Locale.US, "getTitleSeparator: %s,", ((getTitleSeparator != null) ? getTitleSeparator.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
            //return String.format(Locale.US, "getTooltip: %s,", ((getTooltip != null) ? getTooltip.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetGetRemainingBounds());
        jsGetters.append(generateJSgetMargin());
        jsGetters.append(generateJSgetPadding());
        jsGetters.append(generateJSgetPaginator());
        jsGetters.append(generateJSgetTitle());
        jsGetters.append(generateJSgetTitleSeparator());
        jsGetters.append(generateJSgetTooltip());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSalign());
////        
//            js.append(generateJSalign1());
////        
//            js.append(generateJSbackground());
////        
//            js.append(generateJSbackground1());
////        
//            js.append(generateJSbackground2());
////        
//            js.append(generateJSdrag());
////        
//            js.append(generateJSheight());
////        
//            js.append(generateJSheight1());
////        
//            js.append(generateJShoverCursor());
////        
//            js.append(generateJShoverCursor1());
////        
//            js.append(generateJSiconSize());
////        
//            js.append(generateJSiconSize1());
////        
//            js.append(generateJSiconTextSpacing());
////        
//            js.append(generateJSiconTextSpacing1());
////        
//            js.append(generateJSinverted());
////        
//            js.append(generateJSitems());
////        
//            js.append(generateJSitemsLayout());
////        
//            js.append(generateJSitemsLayout1());
////        
//            js.append(generateJSitemsSourceMode());
////        
//            js.append(generateJSitemsSourceMode1());
////        
//            js.append(generateJSitemsSpacing());
////        
//            js.append(generateJSitemsSpacing1());
////        
//            js.append(generateJSmargin());
////        
//            js.append(generateJSmargin1());
////        
//            js.append(generateJSmargin2());
////        
//            js.append(generateJSmargin3());
////        
//            js.append(generateJSmargin4());
////        
//            js.append(generateJSvalue());
////        
//            js.append(generateJSvalue1());
////        
//            js.append(generateJSvalue2());
////        
//            js.append(generateJSvalue3());
////        
//            js.append(generateJSvalue4());
////        
//            js.append(generateJSvalue5());
////        
//            js.append(generateJSvalue6());
////        
//            js.append(generateJSvalue7());
////        
//            js.append(generateJSmaxHeight());
////        
//            js.append(generateJSmaxHeight1());
////        
//            js.append(generateJSmaxWidth());
////        
//            js.append(generateJSmaxWidth1());
////        
//            js.append(generateJSpadding());
////        
//            js.append(generateJSpadding1());
////        
//            js.append(generateJSpadding2());
////        
//            js.append(generateJSpadding3());
////        
//            js.append(generateJSpadding4());
////        
//            js.append(generateJSvalue8());
////        
//            js.append(generateJSvalue9());
////        
//            js.append(generateJSvalue10());
////        
//            js.append(generateJSvalue11());
////        
//            js.append(generateJSvalue12());
////        
//            js.append(generateJSvalue13());
////        
//            js.append(generateJSvalue14());
////        
//            js.append(generateJSvalue15());
////        
//            js.append(generateJSpaginator());
////        
//            js.append(generateJSpaginator1());
////        
//            js.append(generateJSposition());
////        
//            js.append(generateJSposition1());
////        
//            js.append(generateJSpositionMode());
////        
//            js.append(generateJSpositionMode1());
////        
//            js.append(generateJStitle());
////        
//            js.append(generateJStitle1());
////        
//            js.append(generateJStitle2());
////        
//            js.append(generateJStitleFormat());
////        
//            js.append(generateJStitleSeparator());
////        
//            js.append(generateJStitleSeparator1());
////        
//            js.append(generateJStooltip());
////        
//            js.append(generateJStooltip1());
////        
//            js.append(generateJSwidth());
////        
//            js.append(generateJSwidth1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
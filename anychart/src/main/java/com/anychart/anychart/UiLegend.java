package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Legend element.
 */
public class UiLegend extends CoreText {

    public UiLegend() {
        js.setLength(0);
        js.append("var uiLegend").append(++variableIndex).append(" = anychart.core.ui.legend();");
        jsBase = "uiLegend" + variableIndex;
    }

    protected UiLegend(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiLegend(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private EnumsAlign align;
    private String align1;

    /**
     * Setter for legend align settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", ((align != null) ? align.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for legend align settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", wrapQuotes(align1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiBackground getBackground;

    /**
     * Getter for the legend background.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    /**
     * Setter for the legend background.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend background.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean drag;

    /**
     * Allows to use drag for legend.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%b);", drag));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getGetRemainingBounds;

    /**
     * Getter for remain bounds after legend.
     */
    public AnychartMathRect getGetRemainingBounds() {
        if (getGetRemainingBounds == null)
            getGetRemainingBounds = new AnychartMathRect(jsBase + ".getRemainingBounds()");

        return getGetRemainingBounds;
    }

    private Number height;
    private String height1;

    /**
     * Setter for the legend height.
     */
    public UiLegend setHeight(Number height) {
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
            
            js.append(String.format(Locale.US, ".height(%s)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend height.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsCursor hoverCursor;
    private String hoverCursor1;

    /**
     * Setter for hover cursor settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverCursor(%s);", ((hoverCursor != null) ? hoverCursor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hover cursor settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverCursor(%s);", wrapQuotes(hoverCursor1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number iconSize;
    private String iconSize1;

    /**
     * Setter for the icon size.
     */
    public UiLegend setIconSize(Number iconSize) {
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
            
            js.append(String.format(Locale.US, ".iconSize(%s)", iconSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%s);", iconSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the icon size.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%s);", wrapQuotes(iconSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String iconTextSpacing;
    private Number iconTextSpacing1;

    /**
     * Setter for spacing between icon and text in a legend item.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", wrapQuotes(iconTextSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for spacing between icon and text in a legend item.
     */
    public UiLegend setIconTextSpacing(Number iconTextSpacing1) {
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
            
            js.append(String.format(Locale.US, ".iconTextSpacing(%s)", iconTextSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", iconTextSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean inverted;

    /**
     * Setter for inverted settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItemProvider[] items;

    /**
     * Setter for custom items.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(items)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendLayout itemsLayout;
    private String itemsLayout1;

    /**
     * Setter for items layout.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsLayout(%s);", ((itemsLayout != null) ? itemsLayout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for items layout.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsLayout(%s);", wrapQuotes(itemsLayout1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItemsSourceMode itemsSourceMode;
    private String itemsSourceMode1;

    /**
     * Setter for items source mode.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", ((itemsSourceMode != null) ? itemsSourceMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for items source mode.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", wrapQuotes(itemsSourceMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String itemsSpacing;
    private Number itemsSpacing1;

    /**
     * Setter for items spacing settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", wrapQuotes(itemsSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for items spacing settings.
     */
    public UiLegend setItemsSpacing(Number itemsSpacing1) {
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
            
            js.append(String.format(Locale.US, ".itemsSpacing(%s)", itemsSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", itemsSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Margin getMargin;

    /**
     * Getter for margin settings.
     */
    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Number[] margin;
    private String[] margin1;
    private String margin2;
    private Number margin3;
    private String margin4;

    /**
     * Setter for the legend margin in pixels using a single value.
     */
    public UiLegend setMargin(Number[] margin) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend margin in pixels using a single value.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;

    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public UiLegend setMargin(Number value1, Number value3, Number value5, Number value7) {
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
            
            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxHeight;
    private String maxHeight1;

    /**
     * Setter for the maximum height.
     */
    public UiLegend setMaxHeight(Number maxHeight) {
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
            
            js.append(String.format(Locale.US, ".maxHeight(%s)", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum height.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxWidth;
    private String maxWidth1;

    /**
     * Setter for the maximum width.
     */
    public UiLegend setMaxWidth(Number maxWidth) {
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
            
            js.append(String.format(Locale.US, ".maxWidth(%s)", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum width.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(maxWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    /**
     * Getter for legend padding settings.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Number[] padding;
    private String[] padding1;
    private String padding2;
    private Number padding3;
    private String padding4;

    /**
     * Setter for the legend padding in pixels using a single value.
     */
    public UiLegend setPadding(Number[] padding) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend padding in pixels using a single value.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value8;
    private Number value9;
    private String value10;
    private Number value11;
    private String value12;
    private Number value13;
    private String value14;
    private Number value15;

    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public UiLegend setPadding(Number value9, Number value11, Number value13, Number value15) {
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
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value9, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
        return this;
    }

    private Paginator getPaginator;

    /**
     * Getter for paginator settings.
     */
    public Paginator getPaginator() {
        if (getPaginator == null)
            getPaginator = new Paginator(jsBase + ".paginator()");

        return getPaginator;
    }

    private String paginator;
    private Boolean paginator1;

    /**
     * Setter for paginator settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".paginator(%s);", wrapQuotes(paginator)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for paginator settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".paginator(%b);", paginator1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Orientation position;
    private String position1;

    /**
     * Setter for legend position setting.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for legend position setting.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendPositionMode positionMode;
    private String positionMode1;

    /**
     * Setter for the position mode.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", ((positionMode != null) ? positionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the position mode.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", wrapQuotes(positionMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiTitle getTitle;

    /**
     * Getter for the legend title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    /**
     * Setter for the legend title.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend title.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String titleFormat;

    /**
     * Setter for the legend title format function.
If set, formats title. Currently supported in Stock only.
{docs:Common_Settings/Text_Formatters}Learn more about using titleFormat() method.{docs}
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleFormat(%s);", wrapQuotes(titleFormat)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Separator getTitleSeparator;

    /**
     * Getter for title separator settings.
     */
    public Separator getTitleSeparator() {
        if (getTitleSeparator == null)
            getTitleSeparator = new Separator(jsBase + ".titleSeparator()");

        return getTitleSeparator;
    }

    private String titleSeparator;
    private Boolean titleSeparator1;

    /**
     * Setter for title separator settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleSeparator(%s);", wrapQuotes(titleSeparator)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for title separator settings.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleSeparator(%b);", titleSeparator1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tooltip getTooltip;

    /**
     * Getter for the legend tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    /**
     * Setter for legend tooltip.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for legend tooltip.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number width;
    private String width1;

    /**
     * Setter for the legend width.
     */
    public UiLegend setWidth(Number width) {
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
            
            js.append(String.format(Locale.US, ".width(%s)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend width.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetGetRemainingBounds() {
        if (getGetRemainingBounds != null) {
            return getGetRemainingBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetPaginator() {
        if (getPaginator != null) {
            return getPaginator.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSgetTitleSeparator() {
        if (getTitleSeparator != null) {
            return getTitleSeparator.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
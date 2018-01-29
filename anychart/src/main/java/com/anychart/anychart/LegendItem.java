package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Inner class for representing legend item.
 */
public class LegendItem extends CoreText {

    public LegendItem() {
        js.setLength(0);
        js.append("var legendItem").append(++variableIndex).append(" = anychart.core.ui.legendItem();");
        jsBase = "legendItem" + variableIndex;
    }

    protected LegendItem(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LegendItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private List<LegendItem> getIconFill = new ArrayList<>();

    /**
     * Getter/setter for icon fill setting.
     */
    public LegendItem getIconFill(Fill iconFill) {
        LegendItem item = new LegendItem(jsBase + ".iconFill(" + ((iconFill != null) ? iconFill.generateJs() : "null") + ")");
        getIconFill.add(item);
        return item;
    }

    private PatternFill getIconHatchFill;

    /**
     * Getter for icon hatch fill settings.
     */
    public PatternFill getIconHatchFill() {
        if (getIconHatchFill == null)
            getIconHatchFill = new PatternFill(jsBase + ".iconHatchFill()");

        return getIconHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color;
    private Number thickness;
    private Number size;

    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItem setIconHatchFill(PatternFill patternFillOrType, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType.generateJs());
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %s, %s)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %s, %s);", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItem setIconHatchFill(HatchFill patternFillOrType1, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType1.generateJs());
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %s, %s)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %s, %s);", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItem setIconHatchFill(HatchFillType patternFillOrType2, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %s, %s)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %s, %s);", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItem setIconHatchFill(String patternFillOrType3, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %s, %s)", wrapQuotes(patternFillOrType3), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconHatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrType3), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<LegendItem> getIconStroke = new ArrayList<>();

    /**
     * Getter/setter for icon stroke setting.
     */
    public LegendItem getIconStroke(Stroke iconStroke) {
        LegendItem item = new LegendItem(jsBase + ".iconStroke(" + ((iconStroke != null) ? iconStroke.generateJs() : "null") + ")");
        getIconStroke.add(item);
        return item;
    }

    private List<LegendItem> getIconTextSpacing = new ArrayList<>();

    /**
     * Getter/setter for iconTextSpacing setting.
     */
    public LegendItem getIconTextSpacing(Number iconTextSpacing) {
        LegendItem item = new LegendItem(jsBase + ".iconTextSpacing(" + iconTextSpacing + ")");
        getIconTextSpacing.add(item);
        return item;
    }

    private List<LegendItem> getIconType = new ArrayList<>();

    /**
     * Getter/setter for icon type.
     */
    public LegendItem getIconType(String iconType) {
        LegendItem item = new LegendItem(jsBase + ".iconType(" + wrapQuotes(iconType) + ")");
        getIconType.add(item);
        return item;
    }

    private Number maxHeight;
    private String maxHeight1;

    /**
     * Setter for the maximal height of a legend item.
     */
    public LegendItem setMaxHeight(Number maxHeight) {
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
     * Setter for the maximal height of a legend item.
     */
    public LegendItem setMaxHeight(String maxHeight1) {
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
     * Setter for the maximal width of a legend item.
     */
    public LegendItem setMaxWidth(Number maxWidth) {
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
     * Setter for the maximal width of a legend item.
     */
    public LegendItem setMaxWidth(String maxWidth1) {
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

    private List<LegendItem> getText = new ArrayList<>();

    /**
     * Getter/setter for legend item text.
     */
    public LegendItem getText(String text) {
        LegendItem item = new LegendItem(jsBase + ".text(" + wrapQuotes(text) + ")");
        getText.add(item);
        return item;
    }

    private List<LegendItem> getX = new ArrayList<>();

    /**
     * Getter/setter for X coordinate of legend item.
     */
    public LegendItem getX(Number x) {
        LegendItem item = new LegendItem(jsBase + ".x(" + x + ")");
        getX.add(item);
        return item;
    }

    private List<LegendItem> getX1 = new ArrayList<>();

    /**
     * Getter/setter for X coordinate of legend item.
     */
    public LegendItem getX(String x) {
        LegendItem item = new LegendItem(jsBase + ".x(" + wrapQuotes(x) + ")");
        getX1.add(item);
        return item;
    }

    private List<LegendItem> getY = new ArrayList<>();

    /**
     * Getter/setter for Y coordinate of legend item.
     */
    public LegendItem getY(Number y) {
        LegendItem item = new LegendItem(jsBase + ".y(" + y + ")");
        getY.add(item);
        return item;
    }

    private List<LegendItem> getY1 = new ArrayList<>();

    /**
     * Getter/setter for Y coordinate of legend item.
     */
    public LegendItem getY(String y) {
        LegendItem item = new LegendItem(jsBase + ".y(" + wrapQuotes(y) + ")");
        getY1.add(item);
        return item;
    }

    private String generateJSgetIconFill() {
        if (!getIconFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getIconFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetIconHatchFill() {
        if (getIconHatchFill != null) {
            return getIconHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetIconStroke() {
        if (!getIconStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getIconStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetIconTextSpacing() {
        if (!getIconTextSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getIconTextSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetIconType() {
        if (!getIconType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getIconType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetText() {
        if (!getText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetX() {
        if (!getX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetX1() {
        if (!getX1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getX1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetY() {
        if (!getY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetY1() {
        if (!getY1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItem item : getY1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetIconFill());
        jsGetters.append(generateJSgetIconHatchFill());
        jsGetters.append(generateJSgetIconStroke());
        jsGetters.append(generateJSgetIconTextSpacing());
        jsGetters.append(generateJSgetIconType());
        jsGetters.append(generateJSgetText());
        jsGetters.append(generateJSgetX());
        jsGetters.append(generateJSgetX1());
        jsGetters.append(generateJSgetY());
        jsGetters.append(generateJSgetY1());

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
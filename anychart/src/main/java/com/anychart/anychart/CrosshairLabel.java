package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class CrosshairLabel extends JsObject {

    private String jsBase;

    public CrosshairLabel() {

    }

    protected CrosshairLabel(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String bothOrByWidth;
    private Boolean[] bothOrByWidth1;
    private Boolean bothOrByWidth2;
    private Boolean byHeight;

    public void setAdjustfontsize(String bothOrByWidth, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth = bothOrByWidth;
            this.byHeight = byHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", bothOrByWidth, byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", bothOrByWidth, byHeight));
                js.setLength(0);
            }
        }
    }


    public void setAdjustfontsize(Boolean[] bothOrByWidth1, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth1 = bothOrByWidth1;
            this.byHeight = byHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(bothOrByWidth1), byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %b);", Arrays.toString(bothOrByWidth1), byHeight));
                js.setLength(0);
            }
        }
    }


    public void setAdjustfontsize(Boolean bothOrByWidth2, Boolean byHeight) {
        if (jsBase == null) {
            this.bothOrByWidth = null;
            this.bothOrByWidth1 = null;
            this.bothOrByWidth2 = null;
            
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;
        } else {
            this.bothOrByWidth2 = bothOrByWidth2;
            this.byHeight = byHeight;

            js.append(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", bothOrByWidth2, byHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", bothOrByWidth2, byHeight));
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

    private Double axisIndex;

    public void setAxisindex(Double axisIndex) {
        if (jsBase == null) {
            this.axisIndex = axisIndex;
        } else {
            this.axisIndex = axisIndex;

            js.append(String.format(Locale.US, jsBase + ".axisIndex(%f);", axisIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".axisIndex(%f);", axisIndex));
                js.setLength(0);
            }
        }
    }

    private UiBackground getbackground;

    public UiBackground getBackground() {
        if (getbackground == null)
            getbackground = new UiBackground(jsBase + ".background()");

        return getbackground;
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

    private Double height;
    private String height1;

    public void setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height1));
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
    private String offsetX1;

    public void setOffsetx(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
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


    public void setOffsetx(String offsetX1) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX1 = offsetX1;
        } else {
            this.offsetX1 = offsetX1;

            js.append(String.format(Locale.US, jsBase + ".offsetX(%s);", offsetX1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetX(%s);", offsetX1));
                js.setLength(0);
            }
        }
    }

    private Double offsetY;
    private String offsetY1;

    public void setOffsety(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
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


    public void setOffsety(String offsetY1) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY1 = offsetY1;
        } else {
            this.offsetY1 = offsetY1;

            js.append(String.format(Locale.US, jsBase + ".offsetY(%s);", offsetY1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetY(%s);", offsetY1));
                js.setLength(0);
            }
        }
    }

    private UtilsPadding getpadding;

    public UtilsPadding getPadding() {
        if (getpadding == null)
            getpadding = new UtilsPadding(jsBase + ".padding()");

        return getpadding;
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

    public void setPadding(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
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
            
            this.value5 = value5;
        } else {
            this.value6 = value6;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
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
            
            this.value5 = value5;
        } else {
            this.value7 = value7;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetbackground() {
        if (getbackground != null) {
            return getbackground.generateJs();
        }
        return "";
    }

    private String generateJSgetpadding() {
        if (getpadding != null) {
            return getpadding.generateJs();
        }
        return "";
    }

    private String generateJSbothOrByWidth() {
        if (bothOrByWidth != null) {
            return String.format(Locale.US, "bothOrByWidth: %s,", bothOrByWidth);
        }
        return "";
    }

    private String generateJSbothOrByWidth1() {
        if (bothOrByWidth1 != null) {
            return String.format(Locale.US, "bothOrByWidth: %s,", Arrays.toString(bothOrByWidth1));
        }
        return "";
    }

    private String generateJSbothOrByWidth2() {
        if (bothOrByWidth2 != null) {
            return String.format(Locale.US, "bothOrByWidth: %b,", bothOrByWidth2);
        }
        return "";
    }

    private String generateJSbyHeight() {
        if (byHeight != null) {
            return String.format(Locale.US, "byHeight: %b,", byHeight);
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

    private String generateJSaxisIndex() {
        if (axisIndex != null) {
            return String.format(Locale.US, "axisIndex: %f,", axisIndex);
        }
        return "";
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

    private String generateJSoffsetX1() {
        if (offsetX1 != null) {
            return String.format(Locale.US, "offsetX: %s,", offsetX1);
        }
        return "";
    }

    private String generateJSoffsetY() {
        if (offsetY != null) {
            return String.format(Locale.US, "offsetY: %f,", offsetY);
        }
        return "";
    }

    private String generateJSoffsetY1() {
        if (offsetY1 != null) {
            return String.format(Locale.US, "offsetY: %s,", offsetY1);
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSbothOrByWidth());
            js.append(generateJSbothOrByWidth1());
            js.append(generateJSbothOrByWidth2());
            js.append(generateJSbyHeight());
            js.append(generateJSanchor());
            js.append(generateJSanchor1());
            js.append(generateJSaxisIndex());
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSmaxFontSize());
            js.append(generateJSmaxFontSize1());
            js.append(generateJSminFontSize());
            js.append(generateJSminFontSize1());
            js.append(generateJSoffsetX());
            js.append(generateJSoffsetX1());
            js.append(generateJSoffsetY());
            js.append(generateJSoffsetY1());
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
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append("}");
        }
            js.append(generateJSgetbackground());
            js.append(generateJSgetpadding());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
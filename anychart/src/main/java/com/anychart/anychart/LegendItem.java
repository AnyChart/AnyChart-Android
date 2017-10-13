package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class LegendItem extends CoreText {

    public LegendItem() {

    }

    protected LegendItem(String jsBase) {
        this.jsBase = jsBase;
    }

    protected LegendItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private LegendItem getIconFill;

    public LegendItem getIconFill() {
        if (getIconFill == null)
            getIconFill = new LegendItem(jsBase + ".iconFill()");

        return getIconFill;
    }

    private PatternFill getIconHatchFill;

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
    private Double thickness;
    private Double size;

    public LegendItem setIconHatchFill(PatternFill patternFillOrType, String color, Double thickness, Double size) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    public LegendItem setIconHatchFill(HatchFill patternFillOrType1, String color, Double thickness, Double size) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    public LegendItem setIconHatchFill(HatchFillType patternFillOrType2, String color, Double thickness, Double size) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    public LegendItem setIconHatchFill(String patternFillOrType3, String color, Double thickness, Double size) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", patternFillOrType3, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", patternFillOrType3, color, thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItem getIconStroke;

    public LegendItem getIconStroke() {
        if (getIconStroke == null)
            getIconStroke = new LegendItem(jsBase + ".iconStroke()");

        return getIconStroke;
    }

    private LegendItem getIconTextSpacing;

    public LegendItem getIconTextSpacing() {
        if (getIconTextSpacing == null)
            getIconTextSpacing = new LegendItem(jsBase + ".iconTextSpacing()");

        return getIconTextSpacing;
    }

    private LegendItem getIconType;

    public LegendItem getIconType() {
        if (getIconType == null)
            getIconType = new LegendItem(jsBase + ".iconType()");

        return getIconType;
    }

    private Double maxHeight;
    private String maxHeight1;

    public LegendItem setMaxHeight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public LegendItem setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxHeight(%s)", maxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%s)", maxHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxWidth;
    private String maxWidth1;

    public LegendItem setMaxWidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public LegendItem setMaxWidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxWidth(%s)", maxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxWidth(%s)", maxWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private LegendItem getText;

    public LegendItem getText() {
        if (getText == null)
            getText = new LegendItem(jsBase + ".text()");

        return getText;
    }

    private LegendItem getX;

    public LegendItem getX() {
        if (getX == null)
            getX = new LegendItem(jsBase + ".x()");

        return getX;
    }

    private LegendItem getY;

    public LegendItem getY() {
        if (getY == null)
            getY = new LegendItem(jsBase + ".y()");

        return getY;
    }

    private String generateJSgetIconFill() {
        if (getIconFill != null) {
            return getIconFill.generateJs();
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
        if (getIconStroke != null) {
            return getIconStroke.generateJs();
        }
        return "";
    }

    private String generateJSgetIconTextSpacing() {
        if (getIconTextSpacing != null) {
            return getIconTextSpacing.generateJs();
        }
        return "";
    }

    private String generateJSgetIconType() {
        if (getIconType != null) {
            return getIconType.generateJs();
        }
        return "";
    }

    private String generateJSgetText() {
        if (getText != null) {
            return getText.generateJs();
        }
        return "";
    }

    private String generateJSgetX() {
        if (getX != null) {
            return getX.generateJs();
        }
        return "";
    }

    private String generateJSgetY() {
        if (getY != null) {
            return getY.generateJs();
        }
        return "";
    }

    private String generateJSpatternFillOrType() {
        if (patternFillOrType != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType1() {
        if (patternFillOrType1 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType2() {
        if (patternFillOrType2 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType3() {
        if (patternFillOrType3 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType3);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: %s,", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: %s,", maxWidth1);
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
        jsGetters.append(generateJSgetY());

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
            js.append(generateJSpatternFillOrType());
            js.append(generateJSpatternFillOrType1());
            js.append(generateJSpatternFillOrType2());
            js.append(generateJSpatternFillOrType3());
            js.append(generateJScolor());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
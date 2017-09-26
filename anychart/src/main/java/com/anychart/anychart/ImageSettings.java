package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ImageSettings extends JsObject {

    private String jsBase;

    public ImageSettings() {

    }

    protected ImageSettings(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String align;
    private ImageAlign align1;

    public void setAlign(String align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", align));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", align));
                js.setLength(0);
            }
        }
    }


    public void setAlign(ImageAlign align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", (align1 != null) ? align1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", (align1 != null) ? align1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double borderRadius;
    private Double[] borderRadius1;

    public void setBorderradius(Double borderRadius) {
        if (jsBase == null) {
            this.borderRadius = null;
            this.borderRadius1 = null;
            
            this.borderRadius = borderRadius;
        } else {
            this.borderRadius = borderRadius;

            js.append(String.format(Locale.US, jsBase + ".borderRadius(%f);", borderRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".borderRadius(%f);", borderRadius));
                js.setLength(0);
            }
        }
    }


    public void setBorderradius(Double[] borderRadius1) {
        if (jsBase == null) {
            this.borderRadius = null;
            this.borderRadius1 = null;
            
            this.borderRadius1 = borderRadius1;
        } else {
            this.borderRadius1 = borderRadius1;

            js.append(String.format(Locale.US, jsBase + ".borderRadius(%s);", Arrays.toString(borderRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".borderRadius(%s);", Arrays.toString(borderRadius1)));
                js.setLength(0);
            }
        }
    }

    private String fittingMode;
    private Fitting fittingMode1;

    public void setFittingmode(String fittingMode) {
        if (jsBase == null) {
            this.fittingMode = null;
            this.fittingMode1 = null;
            
            this.fittingMode = fittingMode;
        } else {
            this.fittingMode = fittingMode;

            js.append(String.format(Locale.US, jsBase + ".fittingMode(%s);", fittingMode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fittingMode(%s);", fittingMode));
                js.setLength(0);
            }
        }
    }


    public void setFittingmode(Fitting fittingMode1) {
        if (jsBase == null) {
            this.fittingMode = null;
            this.fittingMode1 = null;
            
            this.fittingMode1 = fittingMode1;
        } else {
            this.fittingMode1 = fittingMode1;

            js.append(String.format(Locale.US, jsBase + ".fittingMode(%s);", (fittingMode1 != null) ? fittingMode1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fittingMode(%s);", (fittingMode1 != null) ? fittingMode1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Margin getmargin;

    public Margin getMargin() {
        if (getmargin == null)
            getmargin = new Margin(jsBase + ".margin()");

        return getmargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

    public void setMargin(Double[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String margin2) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin2 = margin2;
        } else {
            this.margin2 = margin2;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", margin2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", margin2));
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

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
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

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
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

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }

    private Double opacity;

    public void setOpacity(Double opacity) {
        if (jsBase == null) {
            this.opacity = opacity;
        } else {
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".opacity(%f);", opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".opacity(%f);", opacity));
                js.setLength(0);
            }
        }
    }

    private String size;
    private Double size1;

    public void setSize(String size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".size(%s);", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".size(%s);", size));
                js.setLength(0);
            }
        }
    }


    public void setSize(Double size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".size(%f);", size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".size(%f);", size1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetmargin() {
        if (getmargin != null) {
            return getmargin.generateJs();
        }
        return "";
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", align);
        }
        return "";
    }

    private String generateJSalign1() {
        if (align1 != null) {
            return String.format(Locale.US, "align: %s,", (align1 != null) ? align1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSborderRadius() {
        if (borderRadius != null) {
            return String.format(Locale.US, "borderRadius: %f,", borderRadius);
        }
        return "";
    }

    private String generateJSborderRadius1() {
        if (borderRadius1 != null) {
            return String.format(Locale.US, "borderRadius: %s,", Arrays.toString(borderRadius1));
        }
        return "";
    }

    private String generateJSfittingMode() {
        if (fittingMode != null) {
            return String.format(Locale.US, "fittingMode: %s,", fittingMode);
        }
        return "";
    }

    private String generateJSfittingMode1() {
        if (fittingMode1 != null) {
            return String.format(Locale.US, "fittingMode: %s,", (fittingMode1 != null) ? fittingMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmargin() {
        if (margin != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin));
        }
        return "";
    }

    private String generateJSmargin1() {
        if (margin1 != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin1));
        }
        return "";
    }

    private String generateJSmargin2() {
        if (margin2 != null) {
            return String.format(Locale.US, "margin: %s,", margin2);
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

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %s,", size);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSalign());
            js.append(generateJSalign1());
            js.append(generateJSborderRadius());
            js.append(generateJSborderRadius1());
            js.append(generateJSfittingMode());
            js.append(generateJSfittingMode1());
            js.append(generateJSmargin());
            js.append(generateJSmargin1());
            js.append(generateJSmargin2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJSopacity());
            js.append(generateJSsize());
            js.append(generateJSsize1());
            js.append("}");
        }
            js.append(generateJSgetmargin());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
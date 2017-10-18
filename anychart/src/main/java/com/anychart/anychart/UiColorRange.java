package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class UiColorRange extends CoreAxesLinear {

    public UiColorRange() {

    }

    protected UiColorRange(String jsBase) {
        this.jsBase = jsBase;
    }

    protected UiColorRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private EnumsAlign align;
    private String align1;

    public UiColorRange setAlign(EnumsAlign align) {
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

            js.append(String.format(Locale.US, ".align(%s)", (align != null) ? align.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", (align != null) ? align.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiColorRange setAlign(String align1) {
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

            js.append(String.format(Locale.US, ".align(%s)", align1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", align1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double colorLineSize;

    public UiColorRange setColorLineSize(Double colorLineSize) {
        if (jsBase == null) {
            this.colorLineSize = colorLineSize;
        } else {
            this.colorLineSize = colorLineSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorLineSize(%f)", colorLineSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorLineSize(%f)", colorLineSize));
                js.setLength(0);
            }
        }
        return this;
    }

    private String length;
    private Double length1;

    public UiColorRange setLength(String length) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length = length;
        } else {
            this.length = length;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".length(%s)", length));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%s)", length));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiColorRange setLength(Double length1) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length1 = length1;
        } else {
            this.length1 = length1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".length(%f)", length1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%f)", length1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersfactoryMarker getMarker;

    public UiMarkersfactoryMarker getMarker() {
        if (getMarker == null)
            getMarker = new UiMarkersfactoryMarker(jsBase + ".marker()");

        return getMarker;
    }

    private UiColorRange getMarker1;

    public UiColorRange getMarker1() {
        if (getMarker1 == null)
            getMarker1 = new UiColorRange(jsBase + ".marker()");

        return getMarker1;
    }

    private String generateJSgetMarker() {
        if (getMarker != null) {
            return getMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetMarker1() {
        if (getMarker1 != null) {
            return getMarker1.generateJs();
        }
        return "";
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", (align != null) ? align.generateJs() : "null");
        }
        return "";
    }

    private String generateJSalign1() {
        if (align1 != null) {
            return String.format(Locale.US, "align: %s,", align1);
        }
        return "";
    }

    private String generateJScolorLineSize() {
        if (colorLineSize != null) {
            return String.format(Locale.US, "colorLineSize: %f,", colorLineSize);
        }
        return "";
    }

    private String generateJSlength() {
        if (length != null) {
            return String.format(Locale.US, "length: %s,", length);
        }
        return "";
    }

    private String generateJSlength1() {
        if (length1 != null) {
            return String.format(Locale.US, "length: %f,", length1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarker());
        jsGetters.append(generateJSgetMarker1());

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
            js.append(generateJSalign());
            js.append(generateJSalign1());
            js.append(generateJScolorLineSize());
            js.append(generateJSlength());
            js.append(generateJSlength1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
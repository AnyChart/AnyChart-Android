package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Image extends Element {

    public Image() {

    }

    protected Image(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Image(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private ImageAlign align;

    public Image setAlign(ImageAlign align) {
        if (jsBase == null) {
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

    private Fitting fittingMode;
    private String fittingMode1;

    public Image setFittingMode(Fitting fittingMode) {
        if (jsBase == null) {
            this.fittingMode = null;
            this.fittingMode1 = null;
            
            this.fittingMode = fittingMode;
        } else {
            this.fittingMode = fittingMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fittingMode(%s)", (fittingMode != null) ? fittingMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fittingMode(%s)", (fittingMode != null) ? fittingMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Image setFittingMode(String fittingMode1) {
        if (jsBase == null) {
            this.fittingMode = null;
            this.fittingMode1 = null;
            
            this.fittingMode1 = fittingMode1;
        } else {
            this.fittingMode1 = fittingMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fittingMode(%s)", fittingMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fittingMode(%s)", fittingMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double height;

    public Image setHeight(Double height) {
        if (jsBase == null) {
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

    private String src;

    public Image setSrc(String src) {
        if (jsBase == null) {
            this.src = src;
        } else {
            this.src = src;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".src(%s)", src));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".src(%s)", src));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;

    public Image setWidth(Double width) {
        if (jsBase == null) {
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

    private Double x;

    public Image setX(Double x) {
        if (jsBase == null) {
            this.x = x;
        } else {
            this.x = x;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".x(%f)", x));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".x(%f)", x));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double y;

    public Image setY(Double y) {
        if (jsBase == null) {
            this.y = y;
        } else {
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".y(%f)", y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".y(%f)", y));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", (align != null) ? align.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfittingMode() {
        if (fittingMode != null) {
            return String.format(Locale.US, "fittingMode: %s,", (fittingMode != null) ? fittingMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfittingMode1() {
        if (fittingMode1 != null) {
            return String.format(Locale.US, "fittingMode: %s,", fittingMode1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSsrc() {
        if (src != null) {
            return String.format(Locale.US, "src: %s,", src);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSalign());
            js.append(generateJSfittingMode());
            js.append(generateJSfittingMode1());
            js.append(generateJSheight());
            js.append(generateJSsrc());
            js.append(generateJSwidth());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
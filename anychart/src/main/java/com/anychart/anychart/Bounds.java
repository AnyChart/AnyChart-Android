package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Bounds extends CoreBase {

    public Bounds() {

    }

    protected Bounds(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Bounds(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double bottom;
    private String bottom1;

    public Bounds setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%f)", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%f)", bottom));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%s)", bottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", bottom1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double height;
    private String height1;

    public Bounds setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public Bounds setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".height(%s)", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", height1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private String left1;

    public Bounds setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%f)", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%f)", left));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%s)", left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", left1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxHeight;
    private String maxHeight1;

    public Bounds setMaxHeight(Double maxHeight) {
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


    public Bounds setMaxHeight(String maxHeight1) {
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

    public Bounds setMaxWidth(Double maxWidth) {
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


    public Bounds setMaxWidth(String maxWidth1) {
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

    private Double minHeight;
    private String minHeight1;

    public Bounds setMinHeight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minHeight(%f)", minHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%f)", minHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setMinHeight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minHeight(%s)", minHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%s)", minHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minWidth;
    private String minWidth1;

    public Bounds setMinWidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minWidth(%f)", minWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minWidth(%f)", minWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setMinWidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minWidth(%s)", minWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minWidth(%s)", minWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double right;
    private String right1;

    public Bounds setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%f)", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%f)", right));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%s)", right1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", right1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double xOrRect;
    private String xOrRect1;
    private Double[] xOrRect2;
    private String[] xOrRect3;
    private RectObj xOrRect4;
    private AnychartMathRect xOrRect5;
    private Bounds xOrRect6;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height2;
    private String height3;

    public Bounds set(Double[] xOrRect2) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            this.xOrRect6 = null;
            
            this.xOrRect2 = xOrRect2;
        } else {
            this.xOrRect2 = xOrRect2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect2)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds set(String[] xOrRect3) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            this.xOrRect6 = null;
            
            this.xOrRect3 = xOrRect3;
        } else {
            this.xOrRect3 = xOrRect3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect3)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds set(RectObj xOrRect4) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            this.xOrRect6 = null;
            
            this.xOrRect4 = xOrRect4;
        } else {
            this.xOrRect4 = xOrRect4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", (xOrRect4 != null) ? xOrRect4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", (xOrRect4 != null) ? xOrRect4.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds set(AnychartMathRect xOrRect5) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            this.xOrRect6 = null;
            
            this.xOrRect5 = xOrRect5;
        } else {
            this.xOrRect5 = xOrRect5;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", (xOrRect5 != null) ? xOrRect5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", (xOrRect5 != null) ? xOrRect5.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds set(Bounds xOrRect6) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            this.xOrRect6 = null;
            
            this.xOrRect6 = xOrRect6;
        } else {
            this.xOrRect6 = xOrRect6;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", (xOrRect6 != null) ? xOrRect6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", (xOrRect6 != null) ? xOrRect6.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double parentLeftOrRect;
    private AnychartMathRect parentLeftOrRect1;
    private String parentLeftOrRect2;
    private Double parentTop;
    private Double parentWidth;
    private Double parentHeight;

    public AnychartMathRect toRect(Double parentLeftOrRect, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect = parentLeftOrRect;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect = parentLeftOrRect;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%f, %f, %f, %f);", parentLeftOrRect, parentTop, parentWidth, parentHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%f, %f, %f, %f)", parentLeftOrRect, parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }


    public AnychartMathRect toRect(AnychartMathRect parentLeftOrRect1, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect1 = parentLeftOrRect1;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect1 = parentLeftOrRect1;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f);", (parentLeftOrRect1 != null) ? parentLeftOrRect1.generateJs() : "null", parentTop, parentWidth, parentHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f)", (parentLeftOrRect1 != null) ? parentLeftOrRect1.generateJs() : "null", parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }


    public AnychartMathRect toRect(String parentLeftOrRect2, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect2 = parentLeftOrRect2;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect2 = parentLeftOrRect2;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f);", parentLeftOrRect2, parentTop, parentWidth, parentHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f)", parentLeftOrRect2, parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }

    private Double top;
    private String top1;

    public Bounds setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%f)", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%f)", top));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%s)", top1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", top1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width2;
    private String width3;

    public Bounds setWidth(Double width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%f)", width2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width2));
                js.setLength(0);
            }
        }
        return this;
    }


    public Bounds setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", width3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", width3));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom1);
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

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %s,", left1);
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

    private String generateJSminHeight() {
        if (minHeight != null) {
            return String.format(Locale.US, "minHeight: %f,", minHeight);
        }
        return "";
    }

    private String generateJSminHeight1() {
        if (minHeight1 != null) {
            return String.format(Locale.US, "minHeight: %s,", minHeight1);
        }
        return "";
    }

    private String generateJSminWidth() {
        if (minWidth != null) {
            return String.format(Locale.US, "minWidth: %f,", minWidth);
        }
        return "";
    }

    private String generateJSminWidth1() {
        if (minWidth1 != null) {
            return String.format(Locale.US, "minWidth: %s,", minWidth1);
        }
        return "";
    }

    private String generateJSright() {
        if (right != null) {
            return String.format(Locale.US, "right: %f,", right);
        }
        return "";
    }

    private String generateJSright1() {
        if (right1 != null) {
            return String.format(Locale.US, "right: %s,", right1);
        }
        return "";
    }

    private String generateJSxOrRect() {
        if (xOrRect != null) {
            return String.format(Locale.US, "xOrRect: %f,", xOrRect);
        }
        return "";
    }

    private String generateJSxOrRect1() {
        if (xOrRect1 != null) {
            return String.format(Locale.US, "xOrRect: %s,", xOrRect1);
        }
        return "";
    }

    private String generateJSxOrRect2() {
        if (xOrRect2 != null) {
            return String.format(Locale.US, "xOrRect: %s,", Arrays.toString(xOrRect2));
        }
        return "";
    }

    private String generateJSxOrRect3() {
        if (xOrRect3 != null) {
            return String.format(Locale.US, "xOrRect: %s,", Arrays.toString(xOrRect3));
        }
        return "";
    }

    private String generateJSxOrRect4() {
        if (xOrRect4 != null) {
            return String.format(Locale.US, "xOrRect: %s,", (xOrRect4 != null) ? xOrRect4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxOrRect5() {
        if (xOrRect5 != null) {
            return String.format(Locale.US, "xOrRect: %s,", (xOrRect5 != null) ? xOrRect5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxOrRect6() {
        if (xOrRect6 != null) {
            return String.format(Locale.US, "xOrRect: %s,", (xOrRect6 != null) ? xOrRect6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %s,", y1);
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

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %s,", height3);
        }
        return "";
    }

    private String generateJSparentLeftOrRect() {
        if (parentLeftOrRect != null) {
            return String.format(Locale.US, "parentLeftOrRect: %f,", parentLeftOrRect);
        }
        return "";
    }

    private String generateJSparentLeftOrRect1() {
        if (parentLeftOrRect1 != null) {
            return String.format(Locale.US, "parentLeftOrRect: %s,", (parentLeftOrRect1 != null) ? parentLeftOrRect1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentLeftOrRect2() {
        if (parentLeftOrRect2 != null) {
            return String.format(Locale.US, "parentLeftOrRect: %s,", parentLeftOrRect2);
        }
        return "";
    }

    private String generateJSparentTop() {
        if (parentTop != null) {
            return String.format(Locale.US, "parentTop: %f,", parentTop);
        }
        return "";
    }

    private String generateJSparentWidth() {
        if (parentWidth != null) {
            return String.format(Locale.US, "parentWidth: %f,", parentWidth);
        }
        return "";
    }

    private String generateJSparentHeight() {
        if (parentHeight != null) {
            return String.format(Locale.US, "parentHeight: %f,", parentHeight);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJStop1() {
        if (top1 != null) {
            return String.format(Locale.US, "top: %s,", top1);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %s,", width3);
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
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSminHeight());
            js.append(generateJSminHeight1());
            js.append(generateJSminWidth());
            js.append(generateJSminWidth1());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSxOrRect());
            js.append(generateJSxOrRect1());
            js.append(generateJSxOrRect2());
            js.append(generateJSxOrRect3());
            js.append(generateJSxOrRect4());
            js.append(generateJSxOrRect5());
            js.append(generateJSxOrRect6());
            js.append(generateJSy());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSheight2());
            js.append(generateJSheight3());
            js.append(generateJSparentLeftOrRect());
            js.append(generateJSparentLeftOrRect1());
            js.append(generateJSparentLeftOrRect2());
            js.append(generateJSparentTop());
            js.append(generateJSparentWidth());
            js.append(generateJSparentHeight());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJSwidth2());
            js.append(generateJSwidth3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
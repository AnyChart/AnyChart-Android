package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Image primitive.
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#image} or
{@link anychart.graphics.vector.Layer#image} to make stage or layer bound image.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#image},<br/>
{@link anychart.graphics.vector.Layer#image}
 */
public class Image extends Element {

    public Image() {
        js.setLength(0);
        js.append("var image").append(++variableIndex).append(" = anychart.graphics.vector.image();");
        jsBase = "image" + variableIndex;
    }

    protected Image(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Image(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ImageAlign align;

    /**
     * Setter for the align.
     */
    public Image setAlign(ImageAlign align) {
        if (jsBase == null) {
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

    private Fitting fittingMode;
    private String fittingMode1;

    /**
     * Setter for the fitting mode.
     */
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
            
            js.append(String.format(Locale.US, ".fittingMode(%s)", ((fittingMode != null) ? fittingMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fittingMode(%s);", ((fittingMode != null) ? fittingMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the fitting mode.
     */
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
            
            js.append(String.format(Locale.US, ".fittingMode(%s)", wrapQuotes(fittingMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fittingMode(%s);", wrapQuotes(fittingMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number height;

    /**
     * Setter for the image height.
     */
    public Image setHeight(Number height) {
        if (jsBase == null) {
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

    private String src;

    /**
     * Setter for the image source.<br/>
Set null value for non-display image.
     */
    public Image setSrc(String src) {
        if (jsBase == null) {
            this.src = src;
        } else {
            this.src = src;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".src(%s)", wrapQuotes(src)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".src(%s);", wrapQuotes(src)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number width;

    /**
     * Setter for the image width.
     */
    public Image setWidth(Number width) {
        if (jsBase == null) {
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

    private Number x;

    /**
     * Setter for X coordinate.
     */
    public Image setX(Number x) {
        if (jsBase == null) {
            this.x = x;
        } else {
            this.x = x;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".x(%s)", x));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".x(%s);", x));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number y;

    /**
     * Setter for the Y coordinate.
     */
    public Image setY(Number y) {
        if (jsBase == null) {
            this.y = y;
        } else {
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".y(%s)", y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".y(%s);", y));
                js.setLength(0);
            }
        }
        return this;
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
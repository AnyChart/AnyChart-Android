package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class representing text settings for resource list items.
 */
public class ImageSettings extends SettingsWithMargin {

    public ImageSettings() {
        js.setLength(0);
        js.append("var imageSettings").append(++variableIndex).append(" = anychart.core.resource.resourceList.imageSettings();");
        jsBase = "imageSettings" + variableIndex;
    }

    protected ImageSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ImageSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String align;
    private ImageAlign align1;
    private List<ImageSettings> setAlign = new ArrayList<>();

    /**
     * Setter for the image align.
     */
    public ImageSettings setAlign(String align) {
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
            
            js.append(String.format(Locale.US, ".align(%s)", wrapQuotes(align)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", wrapQuotes(align)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAlign() {
        if (!setAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ImageSettings> setAlign1 = new ArrayList<>();

    /**
     * Setter for the image align.
     */
    public ImageSettings setAlign(ImageAlign align1) {
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
            
            js.append(String.format(Locale.US, ".align(%s)", ((align1 != null) ? align1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", ((align1 != null) ? align1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAlign1() {
        if (!setAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double borderRadius;
    private Double[] borderRadius1;
    private List<ImageSettings> setBorderRadius = new ArrayList<>();

    /**
     * Setter for the border radius of an image in item.
Learn more about border radius {@link https://www.w3schools.com/cssref/css3_pr_border-radius.asp}
     */
    public ImageSettings setBorderRadius(Double borderRadius) {
        if (jsBase == null) {
            this.borderRadius = null;
            this.borderRadius1 = null;
            
            this.borderRadius = borderRadius;
        } else {
            this.borderRadius = borderRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".borderRadius(%f)", borderRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".borderRadius(%f)", borderRadius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBorderRadius() {
        if (!setBorderRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setBorderRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ImageSettings> setBorderRadius1 = new ArrayList<>();

    /**
     * Setter for the border radius of an image in item.
Learn more about border radius {@link https://www.w3schools.com/cssref/css3_pr_border-radius.asp}
     */
    public ImageSettings setBorderRadius(Double[] borderRadius1) {
        if (jsBase == null) {
            this.borderRadius = null;
            this.borderRadius1 = null;
            
            this.borderRadius1 = borderRadius1;
        } else {
            this.borderRadius1 = borderRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".borderRadius(%s)", Arrays.toString(borderRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".borderRadius(%s)", Arrays.toString(borderRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBorderRadius1() {
        if (!setBorderRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setBorderRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fittingMode;
    private Fitting fittingMode1;
    private List<ImageSettings> setFittingMode = new ArrayList<>();

    /**
     * Setter for the fitting mode.
     */
    public ImageSettings setFittingMode(String fittingMode) {
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
            
            js.append(String.format(Locale.US, ".fittingMode(%s)", wrapQuotes(fittingMode)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fittingMode(%s)", wrapQuotes(fittingMode)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFittingMode() {
        if (!setFittingMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setFittingMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ImageSettings> setFittingMode1 = new ArrayList<>();

    /**
     * Setter for the fitting mode.
     */
    public ImageSettings setFittingMode(Fitting fittingMode1) {
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
            
            js.append(String.format(Locale.US, ".fittingMode(%s)", ((fittingMode1 != null) ? fittingMode1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fittingMode(%s)", ((fittingMode1 != null) ? fittingMode1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFittingMode1() {
        if (!setFittingMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setFittingMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double opacity;
    private List<ImageSettings> setOpacity = new ArrayList<>();

    /**
     * Setter for the image opacity.
     */
    public ImageSettings setOpacity(Double opacity) {
        if (jsBase == null) {
            this.opacity = opacity;
        } else {
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".opacity(%f)", opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".opacity(%f)", opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOpacity() {
        if (!setOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String size;
    private Double size1;
    private List<ImageSettings> setSize = new ArrayList<>();

    /**
     * Setter for the image size in item.
     */
    public ImageSettings setSize(String size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%s)", wrapQuotes(size)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%s)", wrapQuotes(size)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize() {
        if (!setSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ImageSettings> setSize1 = new ArrayList<>();

    /**
     * Setter for the image size in item.
     */
    public ImageSettings setSize(Double size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%f)", size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize1() {
        if (!setSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ImageSettings item : setSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetAlign());
        js.append(generateJSsetAlign1());
        js.append(generateJSsetBorderRadius());
        js.append(generateJSsetBorderRadius1());
        js.append(generateJSsetFittingMode());
        js.append(generateJSsetFittingMode1());
        js.append(generateJSsetOpacity());
        js.append(generateJSsetSize());
        js.append(generateJSsetSize1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
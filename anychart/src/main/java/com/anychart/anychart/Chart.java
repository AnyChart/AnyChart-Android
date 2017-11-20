package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Base class for all charts, contains the margins, the background and the title.
 */
public class Chart extends VisualBaseWithBounds {

    public Chart() {
        js.setLength(0);
        js.append("var chart").append(++variableIndex).append(" = anychart.core.chart();");
        jsBase = "chart" + variableIndex;
    }

    protected Chart(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Chart(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ChartA11y getA11y;

    /**
     * Getter for the accessibility setting.
     */
    public ChartA11y getAy() {
        if (getA11y == null)
            getA11y = new ChartA11y(jsBase + ".ay()");

        return getA11y;
    }

    private Boolean ay;
    private String ay1;
    private List<Chart> setA11y = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public Chart setA11y(Boolean ay) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay = ay;
        } else {
            this.ay = ay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".a11y(%b)", ay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%b)", ay));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetA11y() {
        if (!setA11y.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setA11y) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setA11y1 = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public Chart setA11y(String ay1) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay1 = ay1;
        } else {
            this.ay1 = ay1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".a11y(%s)", wrapQuotes(ay1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%s)", wrapQuotes(ay1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetA11y1() {
        if (!setA11y1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setA11y1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Animation getAnimation;

    /**
     * Getter for the current animation setting.
     */
    public Animation getAnimation() {
        if (getAnimation == null)
            getAnimation = new Animation(jsBase + ".animation()");

        return getAnimation;
    }

    private Boolean animation;
    private String animation1;
    private List<Chart> setAnimation = new ArrayList<>();

    /**
     * Setter for the animation setting by one value.
     */
    public Chart setAnimation(Boolean animation) {
        if (jsBase == null) {
            this.animation = null;
            this.animation1 = null;
            
            this.animation = animation;
        } else {
            this.animation = animation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".animation(%b)", animation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".animation(%b)", animation));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnimation() {
        if (!setAnimation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setAnimation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setAnimation1 = new ArrayList<>();

    /**
     * Setter for the animation setting by one value.
     */
    public Chart setAnimation(String animation1) {
        if (jsBase == null) {
            this.animation = null;
            this.animation1 = null;
            
            this.animation1 = animation1;
        } else {
            this.animation1 = animation1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".animation(%s)", wrapQuotes(animation1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".animation(%s)", wrapQuotes(animation1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnimation1() {
        if (!setAnimation1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setAnimation1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean enabled;
    private Double duration;
    private List<Chart> setAnimation2 = new ArrayList<>();

    /**
     * Setter for the animation settings using several parameters.
     */
    public Chart setAnimation(Boolean enabled, Double duration) {
        if (jsBase == null) {
            this.enabled = enabled;
            this.duration = duration;
        } else {
            this.enabled = enabled;
            this.duration = duration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".animation(%b, %f)", enabled, duration));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".animation(%b, %f)", enabled, duration));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnimation2() {
        if (!setAnimation2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setAnimation2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for the current chart background.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private List<Chart> setBackground = new ArrayList<>();

    /**
     * Setter for the chart background.
     */
    public Chart setBackground(String background) {
        if (jsBase == null) {
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Layer getContainer;

    /**
     * Getter for the element's container.
     */
    public Layer getContainer() {
        if (getContainer == null)
            getContainer = new Layer(jsBase + ".container()");

        return getContainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;
    private List<Chart> setContainer = new ArrayList<>();

    /**
     * Setter for the element's container.
     */
    public Chart setContainer(Layer container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container != null) ? container.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer() {
        if (!setContainer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContainer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setContainer1 = new ArrayList<>();

    /**
     * Setter for the element's container.
     */
    public Chart setContainer(Stage container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container1 != null) ? container1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer1() {
        if (!setContainer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContainer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setContainer2 = new ArrayList<>();

    /**
     * Setter for the element's container.
     */
    public Chart setContainer(String container2) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container2 = container2;
        } else {
            this.container2 = container2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContainer2() {
        if (!setContainer2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContainer2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setContainer3 = new ArrayList<>();

    /**
     * Setter for the element's container.
     */
    public Chart setContainer(Element container3) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container3 = container3;
        } else {
            this.container3 = container3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container3.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container3 != null) ? container3.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer3() {
        if (!setContainer3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContainer3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ContextMenu getContextMenu;

    /**
     * Getter for the current context menu.
     */
    public ContextMenu getContextMenu() {
        if (getContextMenu == null)
            getContextMenu = new ContextMenu(jsBase + ".contextMenu()");

        return getContextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;
    private List<Chart> setContextMenu = new ArrayList<>();

    /**
     * Setter for the context menu.
     */
    public Chart setContextMenu(String contextMenu) {
        if (jsBase == null) {
            this.contextMenu = null;
            this.contextMenu1 = null;
            
            this.contextMenu = contextMenu;
        } else {
            this.contextMenu = contextMenu;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".contextMenu(%s)", wrapQuotes(contextMenu)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".contextMenu(%s)", wrapQuotes(contextMenu)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContextMenu() {
        if (!setContextMenu.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContextMenu) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setContextMenu1 = new ArrayList<>();

    /**
     * Setter for the context menu.
     */
    public Chart setContextMenu(Boolean contextMenu1) {
        if (jsBase == null) {
            this.contextMenu = null;
            this.contextMenu1 = null;
            
            this.contextMenu1 = contextMenu1;
        } else {
            this.contextMenu1 = contextMenu1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".contextMenu(%b)", contextMenu1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".contextMenu(%b)", contextMenu1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContextMenu1() {
        if (!setContextMenu1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setContextMenu1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean async;
    private List<Chart> setDraw = new ArrayList<>();

    /**
     * Starts the rendering of the chart into the container.
     */
    public Chart draw(Boolean async) {
        if (jsBase == null) {
            this.async = async;
        } else {
            this.async = async;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".draw(%b)", async));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".draw(%b)", async));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDraw() {
        if (!setDraw.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setDraw) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Exports getExports;

    /**
     * Getter for the export charts.
     */
    public Exports getExports() {
        if (getExports == null)
            getExports = new Exports(jsBase + ".exports()");

        return getExports;
    }

    private String exports;
    private List<Chart> setExports = new ArrayList<>();

    /**
     * Setter for the export charts.
     */
    public Chart setExports(String exports) {
        if (jsBase == null) {
            this.exports = exports;
        } else {
            this.exports = exports;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".exports(%s)", wrapQuotes(exports)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".exports(%s)", wrapQuotes(exports)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetExports() {
        if (!setExports.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setExports) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String onSuccessOrOptions;
    private Double width;
    private Double height;
    private Double quality;
    private Boolean forceTransparentWhite;

    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(String onSuccessOrOptions, Double width, Double height, Double quality, Boolean forceTransparentWhite) {
        if (jsBase == null) {
            this.onSuccessOrOptions = onSuccessOrOptions;
            this.width = width;
            this.height = height;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
        } else {
            this.onSuccessOrOptions = onSuccessOrOptions;
            this.width = width;
            this.height = height;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %f, %f, %f, %b)", wrapQuotes(onSuccessOrOptions), width, height, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions1;
    private Double paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Double landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Double x;
    private Double y;

    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Double landscapeOrWidth, String onSuccessOrOptions1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %s, %f, %f)", paperSizeOrWidth, landscapeOrWidth, wrapQuotes(onSuccessOrOptions1), x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Boolean landscapeOrWidth1, String onSuccessOrOptions1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %s, %f, %f)", paperSizeOrWidth, landscapeOrWidth1, wrapQuotes(onSuccessOrOptions1), x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Double landscapeOrWidth, String onSuccessOrOptions1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %s, %f, %f)", wrapQuotes(paperSizeOrWidth1), landscapeOrWidth, wrapQuotes(onSuccessOrOptions1), x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Boolean landscapeOrWidth1, String onSuccessOrOptions1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %s, %f, %f)", wrapQuotes(paperSizeOrWidth1), landscapeOrWidth1, wrapQuotes(onSuccessOrOptions1), x, y));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions2;
    private Double width1;
    private Double height1;
    private Double quality1;

    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(String onSuccessOrOptions2, Double width1, Double height1, Double quality1) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            
            this.onSuccessOrOptions2 = onSuccessOrOptions2;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
            this.quality = null;
            this.quality1 = null;
            
            this.quality1 = quality1;
        } else {
            this.onSuccessOrOptions2 = onSuccessOrOptions2;
            this.width1 = width1;
            this.height1 = height1;
            this.quality1 = quality1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %f, %f, %f)", wrapQuotes(onSuccessOrOptions2), width1, height1, quality1));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions3;
    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, Boolean landscapeOrHeight, String onSuccessOrOptions3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = landscapeOrHeight;
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b, %s)", wrapQuotes(paperSizeOrWidth2), landscapeOrHeight, wrapQuotes(onSuccessOrOptions3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, String landscapeOrHeight1, String onSuccessOrOptions3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s)", wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1), wrapQuotes(onSuccessOrOptions3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, Boolean landscapeOrHeight, String onSuccessOrOptions3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = landscapeOrHeight;
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b, %s)", paperSizeOrWidth3, landscapeOrHeight, wrapQuotes(onSuccessOrOptions3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, String landscapeOrHeight1, String onSuccessOrOptions3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s, %s)", paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1), wrapQuotes(onSuccessOrOptions3)));
                js.setLength(0);
            }
        }
    }

    private Double xCoord;
    private Double yCoord;

    /**
     * Converts the global coordinates to local coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void globalToLocal(Double xCoord, Double yCoord) {
        if (jsBase == null) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        } else {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalToLocal(%f, %f)", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private List<UiLabel> getLabel = new ArrayList<>();

    /**
     * Getter for chart label.
     */
    public UiLabel getLabel(String index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + wrapQuotes(index) + ")");
        getLabel.add(item);
        return item;
    }

    private List<UiLabel> getLabel1 = new ArrayList<>();

    /**
     * Getter for chart label.
     */
    public UiLabel getLabel(Double index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + index + ")");
        getLabel1.add(item);
        return item;
    }

    private Boolean label;
    private String label1;
    private String label2;
    private List<Chart> setLabel = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(Boolean label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%b)", label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%b)", label));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel() {
        if (!setLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel1 = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(String label1) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label1 = label1;
        } else {
            this.label1 = label1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%s)", wrapQuotes(label1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s)", wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel1() {
        if (!setLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String index;
    private Double index1;
    private Boolean label3;
    private String label4;
    private String label5;
    private List<Chart> setLabel2 = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(String index, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index = index;
            this.label3 = label3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%s, %b)", wrapQuotes(index), label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %b)", wrapQuotes(index), label3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel2() {
        if (!setLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel3 = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(String index, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index = index;
            this.label4 = label4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%s, %s)", wrapQuotes(index), wrapQuotes(label4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %s)", wrapQuotes(index), wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel3() {
        if (!setLabel3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel4 = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(Double index1, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index1 = index1;
            this.label3 = label3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%f, %b)", index1, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %b)", index1, label3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel4() {
        if (!setLabel4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel5 = new ArrayList<>();

    /**
     * Setter for chart label.
     */
    public Chart setLabel(Double index1, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index1 = index1;
            this.label4 = label4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".label(%f, %s)", index1, wrapQuotes(label4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %s)", index1, wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabel5() {
        if (!setLabel5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double xCoord1;
    private Double yCoord1;

    /**
     * Converts the local coordinates to global coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void localToGlobal(Double xCoord1, Double yCoord1) {
        if (jsBase == null) {
            this.xCoord = null;
            this.xCoord1 = null;
            
            this.xCoord1 = xCoord1;
            this.yCoord = null;
            this.yCoord1 = null;
            
            this.yCoord1 = yCoord1;
        } else {
            this.xCoord1 = xCoord1;
            this.yCoord1 = yCoord1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".localToGlobal(%f, %f)", xCoord1, yCoord1));
                js.setLength(0);
            }
        }
    }

    private Margin getMargin;

    /**
     * Getter for current chart margin.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;
    private List<Chart> setMargin = new ArrayList<>();

    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public Chart setMargin(Double[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin() {
        if (!setMargin.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setMargin) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setMargin1 = new ArrayList<>();

    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public Chart setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin1() {
        if (!setMargin1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setMargin1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setMargin2 = new ArrayList<>();

    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public Chart setMargin(String margin2) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin2 = margin2;
        } else {
            this.margin2 = margin2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".margin(%s)", wrapQuotes(margin2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", wrapQuotes(margin2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin2() {
        if (!setMargin2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setMargin2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<Chart> setMargin3 = new ArrayList<>();

    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public Chart setMargin(String value, String value2, String value4, String value6) {
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
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin3() {
        if (!setMargin3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setMargin3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setMargin4 = new ArrayList<>();

    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public Chart setMargin(Double value1, Double value3, Double value5, Double value7) {
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
            js.append(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin4() {
        if (!setMargin4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setMargin4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private NoDataSettings getNoData;

    /**
     * Getter for noData settings.
     */
    public NoDataSettings getNoData() {
        if (getNoData == null)
            getNoData = new NoDataSettings(jsBase + ".noData()");

        return getNoData;
    }

    private String noData;
    private List<Chart> setNoData = new ArrayList<>();

    /**
     * Setter for noData settings.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
     */
    public Chart setNoData(String noData) {
        if (jsBase == null) {
            this.noData = noData;
        } else {
            this.noData = noData;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".noData(%s)", wrapQuotes(noData)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".noData(%s)", wrapQuotes(noData)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNoData() {
        if (!setNoData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setNoData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the chart padding.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private List<Chart> setPadding = new ArrayList<>();

    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public Chart setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding1 = new ArrayList<>();

    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public Chart setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding2 = new ArrayList<>();

    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public Chart setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;
    private List<Chart> setPadding3 = new ArrayList<>();

    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public Chart setPadding(String value8, String value10, String value12, String value14) {
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
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding4 = new ArrayList<>();

    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public Chart setPadding(Double value9, Double value11, Double value13, Double value15) {
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
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value9, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ChartDataExportMode chartDataExportMode;
    private String chartDataExportMode1;
    private String csvSettings;
    private String filename;

    /**
     * Saves chart data as a CSV file.
     */
    public void saveAsCsv(ChartDataExportMode chartDataExportMode, String csvSettings, String filename) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            
            this.chartDataExportMode = chartDataExportMode;
            this.csvSettings = csvSettings;
            this.filename = filename;
        } else {
            this.chartDataExportMode = chartDataExportMode;
            this.csvSettings = csvSettings;
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s)", ((chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null"), wrapQuotes(csvSettings), wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves chart data as a CSV file.
     */
    public void saveAsCsv(String chartDataExportMode1, String csvSettings, String filename) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            
            this.chartDataExportMode1 = chartDataExportMode1;
            this.csvSettings = csvSettings;
            this.filename = filename;
        } else {
            this.chartDataExportMode1 = chartDataExportMode1;
            this.csvSettings = csvSettings;
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s)", wrapQuotes(chartDataExportMode1), wrapQuotes(csvSettings), wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private Double width2;
    private String width3;
    private Double height2;
    private Double quality2;
    private Boolean forceTransparentWhite1;
    private String filename1;

    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(Double width2, Double height2, Double quality2, Boolean forceTransparentWhite1, String filename1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            
            this.quality2 = quality2;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.width2 = width2;
            this.height2 = height2;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s)", width2, height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(String width3, Double height2, Double quality2, Boolean forceTransparentWhite1, String filename1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            
            this.quality2 = quality2;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.width3 = width3;
            this.height2 = height2;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %f, %f, %b, %s)", wrapQuotes(width3), height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }

    private String filename2;

    /**
     * Saves chart config as JSON document.
     */
    public void saveAsJson(String filename2) {
        if (jsBase == null) {
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            
            this.filename2 = filename2;
        } else {
            this.filename2 = filename2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJson(%s)", wrapQuotes(filename2)));
                js.setLength(0);
            }
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private String paperSizeOrWidthOrOptions2;
    private Boolean landscape;
    private Double x1;
    private Double y1;
    private String filename3;

    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(Double paperSizeOrWidthOrOptions, Boolean landscape, Double x1, Double y1, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidthOrOptions = null;
            this.paperSizeOrWidthOrOptions1 = null;
            this.paperSizeOrWidthOrOptions2 = null;
            
            this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
            this.landscape = landscape;
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
            this.landscape = landscape;
            this.x1 = x1;
            this.y1 = y1;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%f, %b, %f, %f, %s)", paperSizeOrWidthOrOptions, landscape, x1, y1, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(String paperSizeOrWidthOrOptions1, Boolean landscape, Double x1, Double y1, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidthOrOptions = null;
            this.paperSizeOrWidthOrOptions1 = null;
            this.paperSizeOrWidthOrOptions2 = null;
            
            this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
            this.landscape = landscape;
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
            this.landscape = landscape;
            this.x1 = x1;
            this.y1 = y1;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s)", wrapQuotes(paperSizeOrWidthOrOptions1), landscape, x1, y1, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }

    private Double width4;
    private String width5;
    private Double height3;
    private Double quality3;
    private String filename4;

    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(Double width4, Double height3, Double quality3, String filename4) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            
            this.width4 = width4;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            
            this.quality3 = quality3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            
            this.filename4 = filename4;
        } else {
            this.width4 = width4;
            this.height3 = height3;
            this.quality3 = quality3;
            this.filename4 = filename4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s)", width4, height3, quality3, wrapQuotes(filename4)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(String width5, Double height3, Double quality3, String filename4) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            
            this.width5 = width5;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            
            this.quality3 = quality3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            
            this.filename4 = filename4;
        } else {
            this.width5 = width5;
            this.height3 = height3;
            this.quality3 = quality3;
            this.filename4 = filename4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%s, %f, %f, %s)", wrapQuotes(width5), height3, quality3, wrapQuotes(filename4)));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private String paperSize1;
    private Boolean landscape1;
    private String filename5;

    /**
     * Saves the current chart as SVG image.
     */
    public void saveAsSvg(String paperSize, Boolean landscape1, String filename5) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            
            this.paperSize = paperSize;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.paperSize = paperSize;
            this.landscape1 = landscape1;
            this.filename5 = filename5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s)", wrapQuotes(paperSize), landscape1, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }

    private Double width6;
    private Double height4;

    /**
     * Saves the stage as SVG image using width and height.
     */
    public void saveAsSvg(Double width6, Double height4) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width6 = width6;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height4 = height4;
        } else {
            this.width6 = width6;
            this.height4 = height4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f)", width6, height4));
                js.setLength(0);
            }
        }
    }

    private ChartDataExportMode chartDataExportMode2;
    private String chartDataExportMode3;
    private String filename6;

    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(ChartDataExportMode chartDataExportMode2, String filename6) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            this.chartDataExportMode2 = null;
            this.chartDataExportMode3 = null;
            
            this.chartDataExportMode2 = chartDataExportMode2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            
            this.filename6 = filename6;
        } else {
            this.chartDataExportMode2 = chartDataExportMode2;
            this.filename6 = filename6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s)", ((chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null"), wrapQuotes(filename6)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(String chartDataExportMode3, String filename6) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            this.chartDataExportMode2 = null;
            this.chartDataExportMode3 = null;
            
            this.chartDataExportMode3 = chartDataExportMode3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            
            this.filename6 = filename6;
        } else {
            this.chartDataExportMode3 = chartDataExportMode3;
            this.filename6 = filename6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s)", wrapQuotes(chartDataExportMode3), wrapQuotes(filename6)));
                js.setLength(0);
            }
        }
    }

    private String filename7;

    /**
     * Saves chart config as XML document.
     */
    public void saveAsXml(String filename7) {
        if (jsBase == null) {
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            
            this.filename7 = filename7;
        } else {
            this.filename7 = filename7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXml(%s)", wrapQuotes(filename7)));
                js.setLength(0);
            }
        }
    }

    private Fill selectMarqueeFill;
    private List<Chart> setSelectMarqueeFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart setSelectMarqueeFill(Fill selectMarqueeFill) {
        if (jsBase == null) {
            this.selectMarqueeFill = selectMarqueeFill;
        } else {
            this.selectMarqueeFill = selectMarqueeFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s)", ((selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s)", ((selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill() {
        if (!setSelectMarqueeFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<Chart> setSelectMarqueeFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Chart selectMarqueeFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill1() {
        if (!setSelectMarqueeFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<Chart> setSelectMarqueeFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill2() {
        if (!setSelectMarqueeFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill3() {
        if (!setSelectMarqueeFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill4() {
        if (!setSelectMarqueeFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill5() {
        if (!setSelectMarqueeFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill6() {
        if (!setSelectMarqueeFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill7() {
        if (!setSelectMarqueeFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<Chart> setSelectMarqueeFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill8() {
        if (!setSelectMarqueeFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeFill9() {
        if (!setSelectMarqueeFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Chart> setSelectMarqueeStroke = new ArrayList<>();

    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeStroke() {
        if (!setSelectMarqueeStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeStroke1 = new ArrayList<>();

    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeStroke1() {
        if (!setSelectMarqueeStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setSelectMarqueeStroke2 = new ArrayList<>();

    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectMarqueeStroke2() {
        if (!setSelectMarqueeStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setSelectMarqueeStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String onSuccessOrOptions4;
    private Boolean asBase;
    private Double width7;
    private Double height5;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename8;

    /**
     * Shares a chart as a JPG file and returns a link to the shared image.
     */
    public void shareAsJpg(String onSuccessOrOptions4, Boolean asBase, Double width7, Double height5, Double quality4, Boolean forceTransparentWhite2, String filename8) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            
            this.onSuccessOrOptions4 = onSuccessOrOptions4;
            this.asBase = asBase;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width7 = width7;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height5 = height5;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            
            this.quality4 = quality4;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            this.forceTransparentWhite2 = null;
            
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            
            this.filename8 = filename8;
        } else {
            this.onSuccessOrOptions4 = onSuccessOrOptions4;
            this.asBase = asBase;
            this.width7 = width7;
            this.height5 = height5;
            this.quality4 = quality4;
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename8 = filename8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %f, %f, %f, %b, %s)", wrapQuotes(onSuccessOrOptions4), asBase, width7, height5, quality4, forceTransparentWhite2, wrapQuotes(filename8)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions5;
    private Boolean asBase1;
    private Double paperSizeOrWidth4;
    private String paperSizeOrWidth5;
    private Double landscapeOrWidth2;
    private Boolean landscapeOrWidth3;
    private Double x2;
    private Double y2;
    private String filename9;

    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(Double paperSizeOrWidth4, Double landscapeOrWidth2, String onSuccessOrOptions5, Boolean asBase1, Double x2, Double y2, String filename9) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            
            this.filename9 = filename9;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %s, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth2, wrapQuotes(onSuccessOrOptions5), asBase1, x2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(Double paperSizeOrWidth4, Boolean landscapeOrWidth3, String onSuccessOrOptions5, Boolean asBase1, Double x2, Double y2, String filename9) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            
            this.filename9 = filename9;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %s, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth3, wrapQuotes(onSuccessOrOptions5), asBase1, x2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String paperSizeOrWidth5, Double landscapeOrWidth2, String onSuccessOrOptions5, Boolean asBase1, Double x2, Double y2, String filename9) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            
            this.filename9 = filename9;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %s, %b, %f, %f, %s)", wrapQuotes(paperSizeOrWidth5), landscapeOrWidth2, wrapQuotes(onSuccessOrOptions5), asBase1, x2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String paperSizeOrWidth5, Boolean landscapeOrWidth3, String onSuccessOrOptions5, Boolean asBase1, Double x2, Double y2, String filename9) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            
            this.filename9 = filename9;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %b, %f, %f, %s)", wrapQuotes(paperSizeOrWidth5), landscapeOrWidth3, wrapQuotes(onSuccessOrOptions5), asBase1, x2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions6;
    private Boolean asBase2;
    private Double width8;
    private Double height6;
    private Double quality5;
    private String filename10;

    /**
     * Shares a chart as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(String onSuccessOrOptions6, Boolean asBase2, Double width8, Double height6, Double quality5, String filename10) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            this.onSuccessOrOptions6 = null;
            
            this.onSuccessOrOptions6 = onSuccessOrOptions6;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            
            this.asBase2 = asBase2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            
            this.width8 = width8;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            this.quality5 = null;
            
            this.quality5 = quality5;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            this.filename10 = null;
            
            this.filename10 = filename10;
        } else {
            this.onSuccessOrOptions6 = onSuccessOrOptions6;
            this.asBase2 = asBase2;
            this.width8 = width8;
            this.height6 = height6;
            this.quality5 = quality5;
            this.filename10 = filename10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %f, %f, %f, %s)", wrapQuotes(onSuccessOrOptions6), asBase2, width8, height6, quality5, wrapQuotes(filename10)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions7;
    private Boolean asBase3;
    private String paperSizeOrWidth6;
    private Double paperSizeOrWidth7;
    private Boolean landscapeOrHeight2;
    private String landscapeOrHeight3;
    private String filename11;

    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String paperSizeOrWidth6, Boolean landscapeOrHeight2, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            this.onSuccessOrOptions6 = null;
            this.onSuccessOrOptions7 = null;
            
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            this.filename10 = null;
            this.filename11 = null;
            
            this.filename11 = filename11;
        } else {
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.filename11 = filename11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %b, %s)", wrapQuotes(paperSizeOrWidth6), landscapeOrHeight2, wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(filename11)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String paperSizeOrWidth6, String landscapeOrHeight3, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            this.onSuccessOrOptions6 = null;
            this.onSuccessOrOptions7 = null;
            
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            this.filename10 = null;
            this.filename11 = null;
            
            this.filename11 = filename11;
        } else {
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.filename11 = filename11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %b, %s)", wrapQuotes(paperSizeOrWidth6), wrapQuotes(landscapeOrHeight3), wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(filename11)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(Double paperSizeOrWidth7, Boolean landscapeOrHeight2, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            this.onSuccessOrOptions6 = null;
            this.onSuccessOrOptions7 = null;
            
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            this.filename10 = null;
            this.filename11 = null;
            
            this.filename11 = filename11;
        } else {
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.filename11 = filename11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %s, %b, %s)", paperSizeOrWidth7, landscapeOrHeight2, wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(filename11)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(Double paperSizeOrWidth7, String landscapeOrHeight3, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            this.onSuccessOrOptions4 = null;
            this.onSuccessOrOptions5 = null;
            this.onSuccessOrOptions6 = null;
            this.onSuccessOrOptions7 = null;
            
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            this.filename6 = null;
            this.filename7 = null;
            this.filename8 = null;
            this.filename9 = null;
            this.filename10 = null;
            this.filename11 = null;
            
            this.filename11 = filename11;
        } else {
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.filename11 = filename11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %s, %b, %s)", paperSizeOrWidth7, wrapQuotes(landscapeOrHeight3), wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(filename11)));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions;
    private String captionOrOptions1;
    private String link;
    private String name;
    private String description;

    /**
     * Opens Facebook sharing dialog.
     */
    public void shareWithFacebook(String captionOrOptions, String link, String name, String description) {
        if (jsBase == null) {
            this.captionOrOptions = null;
            this.captionOrOptions1 = null;
            
            this.captionOrOptions = captionOrOptions;
            this.link = link;
            this.name = name;
            this.description = description;
        } else {
            this.captionOrOptions = captionOrOptions;
            this.link = link;
            this.name = name;
            this.description = description;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s)", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description)));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions2;
    private String captionOrOptions3;
    private String description1;

    /**
     * Opens LinkedIn sharing dialog.
     */
    public void shareWithLinkedIn(String captionOrOptions2, String description1) {
        if (jsBase == null) {
            this.captionOrOptions = null;
            this.captionOrOptions1 = null;
            this.captionOrOptions2 = null;
            this.captionOrOptions3 = null;
            
            this.captionOrOptions2 = captionOrOptions2;
            this.description = null;
            this.description1 = null;
            
            this.description1 = description1;
        } else {
            this.captionOrOptions2 = captionOrOptions2;
            this.description1 = description1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s)", wrapQuotes(captionOrOptions2), wrapQuotes(description1)));
                js.setLength(0);
            }
        }
    }

    private String linkOrOptions;
    private String linkOrOptions1;
    private String description2;

    /**
     * Opens Pinterest sharing dialog.
     */
    public void shareWithPinterest(String linkOrOptions, String description2) {
        if (jsBase == null) {
            this.linkOrOptions = null;
            this.linkOrOptions1 = null;
            
            this.linkOrOptions = linkOrOptions;
            this.description = null;
            this.description1 = null;
            this.description2 = null;
            
            this.description2 = description2;
        } else {
            this.linkOrOptions = linkOrOptions;
            this.description2 = description2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s)", wrapQuotes(linkOrOptions), wrapQuotes(description2)));
                js.setLength(0);
            }
        }
    }

    private Boolean repeat;
    private List<Chart> setStartSelectMarquee = new ArrayList<>();

    /**
     * Starts select marquee drawing.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public Chart startSelectMarquee(Boolean repeat) {
        if (jsBase == null) {
            this.repeat = repeat;
        } else {
            this.repeat = repeat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".startSelectMarquee(%b)", repeat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSelectMarquee(%b)", repeat));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartSelectMarquee() {
        if (!setStartSelectMarquee.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setStartSelectMarquee) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiTitle getTitle;

    /**
     * Getter for chart title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;
    private List<Chart> setTitle = new ArrayList<>();

    /**
     * Setter for the chart title.
     */
    public Chart setTitle(Boolean title) {
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
                onChangeListener.onChange(String.format(Locale.US, ".title(%b)", title));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle() {
        if (!setTitle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setTitle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setTitle1 = new ArrayList<>();

    /**
     * Setter for the chart title.
     */
    public Chart setTitle(String title1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle1() {
        if (!setTitle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setTitle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String title3;
    private Boolean asString;
    private List<Element> setToA11yTable = new ArrayList<>();

    /**
     * Creates and returns the chart represented as an invisible HTML table.
     */
    public Element toA11yTable(String title3, Boolean asString) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            this.title3 = null;
            
            this.title3 = title3;
            this.asString = asString;
        } else {
            this.title3 = title3;
            this.asString = asString;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b)", wrapQuotes(title3), asString));
                js.setLength(0);
            }
        }
        Element item = new Element("setToA11yTable" + variableIndex);
        setToA11yTable.add(item);
        return item;
    }
    private String generateJSsetToA11yTable() {
        if (!setToA11yTable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Element item : setToA11yTable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ChartDataExportMode chartDataExportMode4;
    private String chartDataExportMode5;
    private String csvSettings1;

    /**
     * Returns CSV string with the chart data.
     */
    public void toCsv(ChartDataExportMode chartDataExportMode4, String csvSettings1) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            this.chartDataExportMode2 = null;
            this.chartDataExportMode3 = null;
            this.chartDataExportMode4 = null;
            this.chartDataExportMode5 = null;
            
            this.chartDataExportMode4 = chartDataExportMode4;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.chartDataExportMode4 = chartDataExportMode4;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s)", ((chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns CSV string with the chart data.
     */
    public void toCsv(String chartDataExportMode5, String csvSettings1) {
        if (jsBase == null) {
            this.chartDataExportMode = null;
            this.chartDataExportMode1 = null;
            this.chartDataExportMode2 = null;
            this.chartDataExportMode3 = null;
            this.chartDataExportMode4 = null;
            this.chartDataExportMode5 = null;
            
            this.chartDataExportMode5 = chartDataExportMode5;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.chartDataExportMode5 = chartDataExportMode5;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s)", wrapQuotes(chartDataExportMode5), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
    }

    private String title4;
    private Boolean asString1;
    private List<Element> setToHtmlTable = new ArrayList<>();

    /**
     * Creates and returns a chart as HTML table.
     */
    public Element toHtmlTable(String title4, Boolean asString1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            this.title3 = null;
            this.title4 = null;
            
            this.title4 = title4;
            this.asString = null;
            this.asString1 = null;
            
            this.asString1 = asString1;
        } else {
            this.title4 = title4;
            this.asString1 = asString1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b)", wrapQuotes(title4), asString1));
                js.setLength(0);
            }
        }
        Element item = new Element("setToHtmlTable" + variableIndex);
        setToHtmlTable.add(item);
        return item;
    }
    private String generateJSsetToHtmlTable() {
        if (!setToHtmlTable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Element item : setToHtmlTable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean stringify;

    /**
     * Return chart configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        if (jsBase == null) {
            this.stringify = stringify;
        } else {
            this.stringify = stringify;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b)", stringify));
                js.setLength(0);
            }
        }
    }

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape2;

    /**
     * Returns SVG string with paper size and landscape.
     */
    public void toSvg(String paperSize2, Boolean landscape2) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            this.paperSize2 = null;
            this.paperSize3 = null;
            
            this.paperSize2 = paperSize2;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            
            this.landscape2 = landscape2;
        } else {
            this.paperSize2 = paperSize2;
            this.landscape2 = landscape2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b)", wrapQuotes(paperSize2), landscape2));
                js.setLength(0);
            }
        }
    }

    private Double width9;
    private Double height7;

    /**
     * Returns SVG string with with determined the width and height.
     */
    public void toSvg(Double width9, Double height7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            this.width8 = null;
            this.width9 = null;
            
            this.width9 = width9;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            
            this.height7 = height7;
        } else {
            this.width9 = width9;
            this.height7 = height7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f)", width9, height7));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;

    /**
     * Return chart configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
        } else {
            this.asXmlNode = asXmlNode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b)", asXmlNode));
                js.setLength(0);
            }
        }
    }

    private Tooltip getTooltip;

    /**
     * Getter for current chart tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<Chart> setTooltip = new ArrayList<>();

    /**
     * Setter for chart tooltip.
     */
    public Chart setTooltip(String tooltip) {
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
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setTooltip1 = new ArrayList<>();

    /**
     * Setter for chart tooltip.
     */
    public Chart setTooltip(Boolean tooltip1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetA11y() {
        if (getA11y != null) {
            return getA11y.generateJs();
        }
        return "";
    }

    private String generateJSgetAnimation() {
        if (getAnimation != null) {
            return getAnimation.generateJs();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetContextMenu() {
        if (getContextMenu != null) {
            return getContextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetExports() {
        if (getExports != null) {
            return getExports.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (!getLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabel item : getLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetLabel1() {
        if (!getLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabel item : getLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetNoData() {
        if (getNoData != null) {
            return getNoData.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
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

    
        jsGetters.append(generateJSgetA11y());
        jsGetters.append(generateJSgetAnimation());
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetContextMenu());
        jsGetters.append(generateJSgetExports());
        jsGetters.append(generateJSgetLabel());
        jsGetters.append(generateJSgetLabel1());
        jsGetters.append(generateJSgetMargin());
        jsGetters.append(generateJSgetNoData());
        jsGetters.append(generateJSgetPadding());
        jsGetters.append(generateJSgetTitle());
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

        js.append(generateJSsetA11y());
        js.append(generateJSsetA11y1());
        js.append(generateJSsetAnimation());
        js.append(generateJSsetAnimation1());
        js.append(generateJSsetAnimation2());
        js.append(generateJSsetBackground());
        js.append(generateJSsetContainer());
        js.append(generateJSsetContainer1());
        js.append(generateJSsetContainer2());
        js.append(generateJSsetContainer3());
        js.append(generateJSsetContextMenu());
        js.append(generateJSsetContextMenu1());
        js.append(generateJSsetDraw());
        js.append(generateJSsetExports());
        js.append(generateJSsetLabel());
        js.append(generateJSsetLabel1());
        js.append(generateJSsetLabel2());
        js.append(generateJSsetLabel3());
        js.append(generateJSsetLabel4());
        js.append(generateJSsetLabel5());
        js.append(generateJSsetMargin());
        js.append(generateJSsetMargin1());
        js.append(generateJSsetMargin2());
        js.append(generateJSsetMargin3());
        js.append(generateJSsetMargin4());
        js.append(generateJSsetNoData());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPadding4());
        js.append(generateJSsetSelectMarqueeFill());
        js.append(generateJSsetSelectMarqueeFill1());
        js.append(generateJSsetSelectMarqueeFill2());
        js.append(generateJSsetSelectMarqueeFill3());
        js.append(generateJSsetSelectMarqueeFill4());
        js.append(generateJSsetSelectMarqueeFill5());
        js.append(generateJSsetSelectMarqueeFill6());
        js.append(generateJSsetSelectMarqueeFill7());
        js.append(generateJSsetSelectMarqueeFill8());
        js.append(generateJSsetSelectMarqueeFill9());
        js.append(generateJSsetSelectMarqueeStroke());
        js.append(generateJSsetSelectMarqueeStroke1());
        js.append(generateJSsetSelectMarqueeStroke2());
        js.append(generateJSsetStartSelectMarquee());
        js.append(generateJSsetTitle());
        js.append(generateJSsetTitle1());
        js.append(generateJSsetToA11yTable());
        js.append(generateJSsetToHtmlTable());
        js.append(generateJSsetTooltip());
        js.append(generateJSsetTooltip1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
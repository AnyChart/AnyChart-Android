package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%b);", ay));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%s);", wrapQuotes(ay1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Animation getAnimation;

    /**
     * Getter for animation settings.
     */
    public Animation getAnimation() {
        if (getAnimation == null)
            getAnimation = new Animation(jsBase + ".animation()");

        return getAnimation;
    }

    private Boolean animation;
    private String animation1;

    /**
     * Setter for animation settings by one value.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%b);", animation));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for animation settings by one value.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%s);", wrapQuotes(animation1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;
    private Number duration;

    /**
     * Setter for animation settings using several parameters.
     */
    public Chart setAnimation(Boolean enabled, Number duration) {
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
            
            js.append(String.format(Locale.US, ".animation(%b, %s)", enabled, duration));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%b, %s);", enabled, duration));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean autoRedraw;

    /**
     * Setter for the autoRedraw flag.<br/>
Flag whether to automatically call chart.draw() on any changes or not.
     */
    public Chart setAutoRedraw(Boolean autoRedraw) {
        if (jsBase == null) {
            this.autoRedraw = autoRedraw;
        } else {
            this.autoRedraw = autoRedraw;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".autoRedraw(%b)", autoRedraw));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".autoRedraw(%b);", autoRedraw));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiBackground getBackground;

    /**
     * Getter for the chart background.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container != null) ? container.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container1 != null) ? container1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(container2)));
                js.setLength(0);
            }
        }
        return this;
    }


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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container3 != null) ? container3.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private ContextMenu getContextMenu;

    /**
     * Getter for the context menu.
     */
    public ContextMenu getContextMenu() {
        if (getContextMenu == null)
            getContextMenu = new ContextMenu(jsBase + ".contextMenu()");

        return getContextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".contextMenu(%s);", wrapQuotes(contextMenu)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".contextMenu(%b);", contextMenu1));
                js.setLength(0);
            }
        }
        return this;
    }

    private ChartCredits getCredits;

    /**
     * Getter for the credits.
     */
    public ChartCredits getCredits() {
        if (getCredits == null)
            getCredits = new ChartCredits(jsBase + ".credits()");

        return getCredits;
    }

    private String credits;
    private Boolean credits1;

    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Chart setCredits(String credits) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits = credits;
        } else {
            this.credits = credits;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".credits(%s)", wrapQuotes(credits)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%s);", wrapQuotes(credits)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Chart setCredits(Boolean credits1) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits1 = credits1;
        } else {
            this.credits1 = credits1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".credits(%b)", credits1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%b);", credits1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean async;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".draw(%b);", async));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".exports(%s);", wrapQuotes(exports)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String onSuccessOrOptions;
    private Number width;
    private Number height;
    private Number quality;
    private Boolean forceTransparentWhite;

    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(String onSuccessOrOptions, Number width, Number height, Number quality, Boolean forceTransparentWhite) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getJpgBase64String(%s, %s, %s, %s, %b);", wrapQuotes(onSuccessOrOptions), width, height, quality, forceTransparentWhite));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %s, %s, %s, %b);", wrapQuotes(onSuccessOrOptions), width, height, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions1;
    private Number paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Number landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Number x;
    private Number y;

    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions1, Number paperSizeOrWidth, Number x, Number landscapeOrWidth, Number y) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
        } else {
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions1), paperSizeOrWidth, x, landscapeOrWidth, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions1), paperSizeOrWidth, x, landscapeOrWidth, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions1, Number paperSizeOrWidth, Number x, Boolean landscapeOrWidth1, Number y) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
        } else {
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.x = x;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions1), paperSizeOrWidth, x, landscapeOrWidth1, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions1), paperSizeOrWidth, x, landscapeOrWidth1, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions1, String paperSizeOrWidth1, Number x, Number landscapeOrWidth, Number y) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
        } else {
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = landscapeOrWidth;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions1), wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions1), wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions1, String paperSizeOrWidth1, Number x, Boolean landscapeOrWidth1, Number y) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
        } else {
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.x = x;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPdfBase64String(%s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions1), wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth1, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions1), wrapQuotes(paperSizeOrWidth1), x, landscapeOrWidth1, y));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions2;
    private Number width1;
    private Number height1;
    private Number quality1;

    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(String onSuccessOrOptions2, Number width1, Number height1, Number quality1) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getPngBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions2), width1, height1, quality1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions2), width1, height1, quality1));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions3;
    private String paperSizeOrWidth2;
    private Number paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions3, String paperSizeOrWidth2, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %s, %b);", wrapQuotes(onSuccessOrOptions3), wrapQuotes(paperSizeOrWidth2), landscapeOrHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %b);", wrapQuotes(onSuccessOrOptions3), wrapQuotes(paperSizeOrWidth2), landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions3, String paperSizeOrWidth2, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %s, %s);", wrapQuotes(onSuccessOrOptions3), wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s);", wrapQuotes(onSuccessOrOptions3), wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions3, Number paperSizeOrWidth3, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %s, %b);", wrapQuotes(onSuccessOrOptions3), paperSizeOrWidth3, landscapeOrHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %b);", wrapQuotes(onSuccessOrOptions3), paperSizeOrWidth3, landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions3, Number paperSizeOrWidth3, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            this.onSuccessOrOptions3 = null;
            
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.onSuccessOrOptions3 = onSuccessOrOptions3;
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getSvgBase64String(%s, %s, %s);", wrapQuotes(onSuccessOrOptions3), paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s);", wrapQuotes(onSuccessOrOptions3), paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }

    private Number xCoord;
    private Number yCoord;

    /**
     * Converts the global coordinates to local coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void globalToLocal(Number xCoord, Number yCoord) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".globalToLocal(%s, %s);", xCoord, yCoord));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalToLocal(%s, %s);", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private List<UiLabel> getLabel = new ArrayList<>();

    /**
     * Getter for the chart label.
     */
    public UiLabel getLabel(String index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + wrapQuotes(index) + ")");
        getLabel.add(item);
        return item;
    }

    private List<UiLabel> getLabel1 = new ArrayList<>();

    /**
     * Getter for the chart label.
     */
    public UiLabel getLabel(Number index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + index + ")");
        getLabel1.add(item);
        return item;
    }

    private Boolean label;
    private String label1;
    private String label2;

    /**
     * Setter for the chart label.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart label.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String index;
    private Number index1;
    private Boolean label3;
    private String label4;
    private String label5;

    /**
     * Setter for the chart label.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", wrapQuotes(index), label3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart label.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart label.
     */
    public Chart setLabel(Number index1, Boolean label3) {
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
            
            js.append(String.format(Locale.US, ".label(%s, %b)", index1, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", index1, label3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart label.
     */
    public Chart setLabel(Number index1, String label4) {
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
            
            js.append(String.format(Locale.US, ".label(%s, %s)", index1, wrapQuotes(label4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", index1, wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number xCoord1;
    private Number yCoord1;

    /**
     * Converts the local coordinates to global coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void localToGlobal(Number xCoord1, Number yCoord1) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".localToGlobal(%s, %s);", xCoord1, yCoord1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".localToGlobal(%s, %s);", xCoord1, yCoord1));
                js.setLength(0);
            }
        }
    }

    private Margin getMargin;

    /**
     * Getter for the chart margin.<br/>
<img src='https://api.anychart.com/si/8.1.0/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Number[] margin;
    private String[] margin1;
    private String margin2;

    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public Chart setMargin(Number[] margin) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(margin2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public Chart setMargin(Number value1, Number value3, Number value5, Number value7) {
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
            
            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".noData(%s);", wrapQuotes(noData)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the chart padding.<br/>
<img src='https://api.anychart.com/si/8.1.0/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Number[] padding;
    private String[] padding1;
    private String padding2;

    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public Chart setPadding(Number[] padding) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value8;
    private Number value9;
    private String value10;
    private Number value11;
    private String value12;
    private Number value13;
    private String value14;
    private Number value15;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public Chart setPadding(Number value9, Number value11, Number value13, Number value15) {
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
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value9, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
        return this;
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsCsv(%s, %s, %s);", ((chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null"), wrapQuotes(csvSettings), wrapQuotes(filename)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", ((chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null"), wrapQuotes(csvSettings), wrapQuotes(filename)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsCsv(%s, %s, %s);", wrapQuotes(chartDataExportMode1), wrapQuotes(csvSettings), wrapQuotes(filename)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", wrapQuotes(chartDataExportMode1), wrapQuotes(csvSettings), wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private Number width2;
    private String width3;
    private Number height2;
    private Number quality2;
    private Boolean forceTransparentWhite1;
    private String filename1;

    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(Number width2, Number height2, Number quality2, Boolean forceTransparentWhite1, String filename1) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsJpg(%s, %s, %s, %b, %s);", width2, height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %b, %s);", width2, height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(String width3, Number height2, Number quality2, Boolean forceTransparentWhite1, String filename1) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsJpg(%s, %s, %s, %b, %s);", wrapQuotes(width3), height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %b, %s);", wrapQuotes(width3), height2, quality2, forceTransparentWhite1, wrapQuotes(filename1)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsJson(%s);", wrapQuotes(filename2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJson(%s);", wrapQuotes(filename2)));
                js.setLength(0);
            }
        }
    }

    private Number paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private String paperSizeOrWidthOrOptions2;
    private Boolean landscape;
    private Number x1;
    private Number y1;
    private String filename3;

    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(Number paperSizeOrWidthOrOptions, Boolean landscape, Number x1, Number y1, String filename3) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPdf(%s, %b, %s, %s, %s);", paperSizeOrWidthOrOptions, landscape, x1, y1, wrapQuotes(filename3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %s, %s, %s);", paperSizeOrWidthOrOptions, landscape, x1, y1, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(String paperSizeOrWidthOrOptions1, Boolean landscape, Number x1, Number y1, String filename3) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPdf(%s, %b, %s, %s, %s);", wrapQuotes(paperSizeOrWidthOrOptions1), landscape, x1, y1, wrapQuotes(filename3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %s, %s, %s);", wrapQuotes(paperSizeOrWidthOrOptions1), landscape, x1, y1, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }

    private Number width4;
    private String width5;
    private Number height3;
    private Number quality3;
    private String filename4;

    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(Number width4, Number height3, Number quality3, String filename4) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPng(%s, %s, %s, %s);", width4, height3, quality3, wrapQuotes(filename4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s, %s);", width4, height3, quality3, wrapQuotes(filename4)));
                js.setLength(0);
            }
        }
    }


    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(String width5, Number height3, Number quality3, String filename4) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsPng(%s, %s, %s, %s);", wrapQuotes(width5), height3, quality3, wrapQuotes(filename4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s, %s);", wrapQuotes(width5), height3, quality3, wrapQuotes(filename4)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsSvg(%s, %b, %s);", wrapQuotes(paperSize), landscape1, wrapQuotes(filename5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s);", wrapQuotes(paperSize), landscape1, wrapQuotes(filename5)));
                js.setLength(0);
            }
        }
    }

    private Number width6;
    private Number height4;

    /**
     * Saves the stage as SVG image using width and height.
     */
    public void saveAsSvg(Number width6, Number height4) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsSvg(%s, %s);", width6, height4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s);", width6, height4));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsXlsx(%s, %s);", ((chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null"), wrapQuotes(filename6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", ((chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null"), wrapQuotes(filename6)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsXlsx(%s, %s);", wrapQuotes(chartDataExportMode3), wrapQuotes(filename6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", wrapQuotes(chartDataExportMode3), wrapQuotes(filename6)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".saveAsXml(%s);", wrapQuotes(filename7)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXml(%s);", wrapQuotes(filename7)));
                js.setLength(0);
            }
        }
    }

    private Fill selectMarqueeFill;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s);", ((selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Number opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Chart selectMarqueeFill(String color, Number opacity) {
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
            
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s);", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys1, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Chart selectMarqueeFill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(Stroke color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %s, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(ColoredFill color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %s, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setSelectMarqueeStroke(String color3, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %s, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String onSuccessOrOptions4;
    private Boolean asBase;
    private Number width7;
    private Number height5;
    private Number quality4;
    private Boolean forceTransparentWhite2;
    private String filename8;

    /**
     * Shares a chart as a JPG file and returns a link to the shared image.
     */
    public void shareAsJpg(String onSuccessOrOptions4, Boolean asBase, Number width7, Number height5, Number quality4, Boolean forceTransparentWhite2, String filename8) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsJpg(%s, %b, %s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions4), asBase, width7, height5, quality4, forceTransparentWhite2, wrapQuotes(filename8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %s, %s, %s, %b, %s);", wrapQuotes(onSuccessOrOptions4), asBase, width7, height5, quality4, forceTransparentWhite2, wrapQuotes(filename8)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions5;
    private Boolean asBase1;
    private Number paperSizeOrWidth4;
    private String paperSizeOrWidth5;
    private Number landscapeOrWidth2;
    private Boolean landscapeOrWidth3;
    private Number x2;
    private Number y2;
    private String filename9;

    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions5, Boolean asBase1, Number paperSizeOrWidth4, Number x2, Number landscapeOrWidth2, Number y2, String filename9) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
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
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.x2 = x2;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%s, %b, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, paperSizeOrWidth4, x2, landscapeOrWidth2, y2, wrapQuotes(filename9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, paperSizeOrWidth4, x2, landscapeOrWidth2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions5, Boolean asBase1, Number paperSizeOrWidth4, Number x2, Boolean landscapeOrWidth3, Number y2, String filename9) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
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
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.x2 = x2;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%s, %b, %s, %s, %b, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, paperSizeOrWidth4, x2, landscapeOrWidth3, y2, wrapQuotes(filename9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %s, %b, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, paperSizeOrWidth4, x2, landscapeOrWidth3, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions5, Boolean asBase1, String paperSizeOrWidth5, Number x2, Number landscapeOrWidth2, Number y2, String filename9) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
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
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.x2 = x2;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%s, %b, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, wrapQuotes(paperSizeOrWidth5), x2, landscapeOrWidth2, y2, wrapQuotes(filename9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, wrapQuotes(paperSizeOrWidth5), x2, landscapeOrWidth2, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions5, Boolean asBase1, String paperSizeOrWidth5, Number x2, Boolean landscapeOrWidth3, Number y2, String filename9) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
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
            this.onSuccessOrOptions5 = onSuccessOrOptions5;
            this.asBase1 = asBase1;
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.x2 = x2;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.y2 = y2;
            this.filename9 = filename9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPdf(%s, %b, %s, %s, %b, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, wrapQuotes(paperSizeOrWidth5), x2, landscapeOrWidth3, y2, wrapQuotes(filename9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %s, %b, %s, %s);", wrapQuotes(onSuccessOrOptions5), asBase1, wrapQuotes(paperSizeOrWidth5), x2, landscapeOrWidth3, y2, wrapQuotes(filename9)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions6;
    private Boolean asBase2;
    private Number width8;
    private Number height6;
    private Number quality5;
    private String filename10;

    /**
     * Shares a chart as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(String onSuccessOrOptions6, Boolean asBase2, Number width8, Number height6, Number quality5, String filename10) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsPng(%s, %b, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions6), asBase2, width8, height6, quality5, wrapQuotes(filename10)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions6), asBase2, width8, height6, quality5, wrapQuotes(filename10)));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions7;
    private Boolean asBase3;
    private String paperSizeOrWidth6;
    private Number paperSizeOrWidth7;
    private Boolean landscapeOrHeight2;
    private String landscapeOrHeight3;
    private String filename11;

    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions7, Boolean asBase3, String paperSizeOrWidth6, String filename11, Boolean landscapeOrHeight2) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
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
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
        } else {
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.filename11 = filename11;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%s, %b, %s, %s, %b);", wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(paperSizeOrWidth6), wrapQuotes(filename11), landscapeOrHeight2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %s, %b);", wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(paperSizeOrWidth6), wrapQuotes(filename11), landscapeOrHeight2));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions7, Boolean asBase3, String paperSizeOrWidth6, String filename11, String landscapeOrHeight3) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
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
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
        } else {
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.filename11 = filename11;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%s, %b, %s, %s, %s);", wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(paperSizeOrWidth6), wrapQuotes(filename11), wrapQuotes(landscapeOrHeight3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %s, %s);", wrapQuotes(onSuccessOrOptions7), asBase3, wrapQuotes(paperSizeOrWidth6), wrapQuotes(filename11), wrapQuotes(landscapeOrHeight3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions7, Boolean asBase3, Number paperSizeOrWidth7, String filename11, Boolean landscapeOrHeight2) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
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
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
        } else {
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.filename11 = filename11;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%s, %b, %s, %s, %b);", wrapQuotes(onSuccessOrOptions7), asBase3, paperSizeOrWidth7, wrapQuotes(filename11), landscapeOrHeight2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %s, %b);", wrapQuotes(onSuccessOrOptions7), asBase3, paperSizeOrWidth7, wrapQuotes(filename11), landscapeOrHeight2));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions7, Boolean asBase3, Number paperSizeOrWidth7, String filename11, String landscapeOrHeight3) {
        if (jsBase == null) {
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
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
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
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
        } else {
            this.onSuccessOrOptions7 = onSuccessOrOptions7;
            this.asBase3 = asBase3;
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.filename11 = filename11;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareAsSvg(%s, %b, %s, %s, %s);", wrapQuotes(onSuccessOrOptions7), asBase3, paperSizeOrWidth7, wrapQuotes(filename11), wrapQuotes(landscapeOrHeight3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %s, %s);", wrapQuotes(onSuccessOrOptions7), asBase3, paperSizeOrWidth7, wrapQuotes(filename11), wrapQuotes(landscapeOrHeight3)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareWithFacebook(%s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareWithLinkedIn(%s, %s);", wrapQuotes(captionOrOptions2), wrapQuotes(description1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", wrapQuotes(captionOrOptions2), wrapQuotes(description1)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".shareWithPinterest(%s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description2)));
                js.setLength(0);
            }
        }
    }

    private Boolean repeat;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSelectMarquee(%b);", repeat));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiTitle getTitle;

    /**
     * Getter for the chart title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
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
            
            js.append(String.format(Locale.US, "var setToA11yTable" + ++variableIndex + " = " + jsBase + ".toA11yTable(%s, %b);", wrapQuotes(title3), asString));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b);", wrapQuotes(title3), asString));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toCsv(%s, %s);", ((chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null"), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", ((chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null"), wrapQuotes(csvSettings1)));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toCsv(%s, %s);", wrapQuotes(chartDataExportMode5), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", wrapQuotes(chartDataExportMode5), wrapQuotes(csvSettings1)));
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
            
            js.append(String.format(Locale.US, "var setToHtmlTable" + ++variableIndex + " = " + jsBase + ".toHtmlTable(%s, %b);", wrapQuotes(title4), asString1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b);", wrapQuotes(title4), asString1));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toJson(%b);", stringify));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b);", stringify));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toSvg(%s, %b);", wrapQuotes(paperSize2), landscape2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", wrapQuotes(paperSize2), landscape2));
                js.setLength(0);
            }
        }
    }

    private Number width9;
    private Number height7;

    /**
     * Returns SVG string with with determined the width and height.
     */
    public void toSvg(Number width9, Number height7) {
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toSvg(%s, %s);", width9, height7));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", width9, height7));
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
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".toXml(%b);", asXmlNode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b);", asXmlNode));
                js.setLength(0);
            }
        }
    }

    private Tooltip getTooltip;

    /**
     * Getter for the chart tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    /**
     * Setter for the chart tooltip.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart tooltip.
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJSgetCredits() {
        if (getCredits != null) {
            return getCredits.generateJs();
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
        jsGetters.append(generateJSgetCredits());
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

        js.append(generateJSsetToA11yTable());
        js.append(generateJSsetToHtmlTable());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Chart extends VisualBaseWithBounds {

    public Chart() {

    }

    protected Chart(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Chart(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private ChartA11y getA11y;

    public ChartA11y getA11y() {
        if (getA11y == null)
            getA11y = new ChartA11y(jsBase + ".ay()");

        return getA11y;
    }

    private Boolean ay;
    private String ay1;

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

            js.append(String.format(Locale.US, ".a11y(%s)", ay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%s)", ay1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Animation getAnimation;

    public Animation getAnimation() {
        if (getAnimation == null)
            getAnimation = new Animation(jsBase + ".animation()");

        return getAnimation;
    }

    private Boolean animation;
    private String animation1;

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

            js.append(String.format(Locale.US, ".animation(%s)", animation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".animation(%s)", animation1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;
    private Double duration;

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

    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;

    public Chart setBackground(String background) {
        if (jsBase == null) {
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".background(%s)", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", background));
                js.setLength(0);
            }
        }
        return this;
    }

    private Layer getContainer;

    public Layer getContainer() {
        if (getContainer == null)
            getContainer = new Layer(jsBase + ".container()");

        return getContainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public Chart setContainer(Layer container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", (container != null) ? container.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", (container != null) ? container.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Chart setContainer(Stage container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", (container1 != null) ? container1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", (container1 != null) ? container1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".container(%s)", container2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", container2));
                js.setLength(0);
            }
        }
        return this;
    }


    public Chart setContainer(Element container3) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container3 = container3;
        } else {
            this.container3 = container3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", (container3 != null) ? container3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", (container3 != null) ? container3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private ContextMenu getContextMenu;

    public ContextMenu getContextMenu() {
        if (getContextMenu == null)
            getContextMenu = new ContextMenu(jsBase + ".contextMenu()");

        return getContextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

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

            js.append(String.format(Locale.US, ".contextMenu(%s)", contextMenu));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".contextMenu(%s)", contextMenu));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private Boolean async;

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

    private Exports getExports;

    public Exports getExports() {
        if (getExports == null)
            getExports = new Exports(jsBase + ".exports()");

        return getExports;
    }

    private String exports;

    public Chart setExports(String exports) {
        if (jsBase == null) {
            this.exports = exports;
        } else {
            this.exports = exports;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".exports(%s)", exports));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".exports(%s)", exports));
                js.setLength(0);
            }
        }
        return this;
    }

    private String onSuccessOrOptions;
    private Double width;
    private Double height;
    private Double quality;
    private Boolean forceTransparentWhite;

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

            js.append(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %f, %f, %f, %b);", onSuccessOrOptions, width, height, quality, forceTransparentWhite));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %f, %f, %f, %b)", onSuccessOrOptions, width, height, quality, forceTransparentWhite));
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

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth, onSuccessOrOptions1, x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %s, %f, %f)", paperSizeOrWidth, landscapeOrWidth, onSuccessOrOptions1, x, y));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth1, onSuccessOrOptions1, x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %s, %f, %f)", paperSizeOrWidth, landscapeOrWidth1, onSuccessOrOptions1, x, y));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth, onSuccessOrOptions1, x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %s, %f, %f)", paperSizeOrWidth1, landscapeOrWidth, onSuccessOrOptions1, x, y));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth1, onSuccessOrOptions1, x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %s, %f, %f)", paperSizeOrWidth1, landscapeOrWidth1, onSuccessOrOptions1, x, y));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions2;
    private Double width1;
    private Double height1;
    private Double quality1;

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

            js.append(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %f, %f, %f);", onSuccessOrOptions2, width1, height1, quality1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %f, %f, %f)", onSuccessOrOptions2, width1, height1, quality1));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions3;
    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b, %s);", paperSizeOrWidth2, landscapeOrHeight, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b, %s)", paperSizeOrWidth2, landscapeOrHeight, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s);", paperSizeOrWidth2, landscapeOrHeight1, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s)", paperSizeOrWidth2, landscapeOrHeight1, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b, %s);", paperSizeOrWidth3, landscapeOrHeight, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b, %s)", paperSizeOrWidth3, landscapeOrHeight, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s, %s);", paperSizeOrWidth3, landscapeOrHeight1, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s, %s)", paperSizeOrWidth3, landscapeOrHeight1, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }

    private Double xCoord;
    private Double yCoord;

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

            js.append(String.format(Locale.US, jsBase + ".globalToLocal(%f, %f);", xCoord, yCoord));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalToLocal(%f, %f)", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private UiLabel getLabel;

    public UiLabel getLabel() {
        if (getLabel == null)
            getLabel = new UiLabel(jsBase + ".label()");

        return getLabel;
    }

    private Boolean label;
    private String label1;
    private String label2;

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

            js.append(String.format(Locale.US, ".label(%s)", label1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s)", label1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String index;
    private Double index1;
    private Boolean label3;
    private String label4;
    private String label5;

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

            js.append(String.format(Locale.US, ".label(%s, %b)", index, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %b)", index, label3));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".label(%s, %s)", index, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%s, %s)", index, label4));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".label(%f, %s)", index1, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".label(%f, %s)", index1, label4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double xCoord1;
    private Double yCoord1;

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

            js.append(String.format(Locale.US, jsBase + ".localToGlobal(%f, %f);", xCoord1, yCoord1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".localToGlobal(%f, %f)", xCoord1, yCoord1));
                js.setLength(0);
            }
        }
    }

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

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

            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".margin(%s)", margin2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", margin2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

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

            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", value, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s, %s, %s, %s)", value, value2, value4, value6));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private NoDataSettings getNoData;

    public NoDataSettings getNoData() {
        if (getNoData == null)
            getNoData = new NoDataSettings(jsBase + ".noData()");

        return getNoData;
    }

    private String noData;

    public Chart setNoData(String noData) {
        if (jsBase == null) {
            this.noData = noData;
        } else {
            this.noData = noData;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".noData(%s)", noData));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".noData(%s)", noData));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

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

            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".padding(%s)", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", padding2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

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

            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value8, value10, value12, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value8, value10, value12, value14));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private ChartDataExportMode chartDataExportMode;
    private String chartDataExportMode1;
    private String csvSettings;
    private String filename;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", (chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null", csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s)", (chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null", csvSettings, filename));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", chartDataExportMode1, csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s)", chartDataExportMode1, csvSettings, filename));
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

            js.append(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s);", width2, height2, quality2, forceTransparentWhite1, filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s)", width2, height2, quality2, forceTransparentWhite1, filename1));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %f, %f, %b, %s);", width3, height2, quality2, forceTransparentWhite1, filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %f, %f, %b, %s)", width3, height2, quality2, forceTransparentWhite1, filename1));
                js.setLength(0);
            }
        }
    }

    private String filename2;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsJson(%s);", filename2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJson(%s)", filename2));
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

            js.append(String.format(Locale.US, jsBase + ".saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape, x1, y1, filename3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%f, %b, %f, %f, %s)", paperSizeOrWidthOrOptions, landscape, x1, y1, filename3));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape, x1, y1, filename3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s)", paperSizeOrWidthOrOptions1, landscape, x1, y1, filename3));
                js.setLength(0);
            }
        }
    }

    private Double width4;
    private String width5;
    private Double height3;
    private Double quality3;
    private String filename4;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s);", width4, height3, quality3, filename4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s)", width4, height3, quality3, filename4));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".saveAsPng(%s, %f, %f, %s);", width5, height3, quality3, filename4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%s, %f, %f, %s)", width5, height3, quality3, filename4));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private String paperSize1;
    private Boolean landscape1;
    private String filename5;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s);", paperSize, landscape1, filename5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s)", paperSize, landscape1, filename5));
                js.setLength(0);
            }
        }
    }

    private Double width6;
    private Double height4;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width6, height4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f)", width6, height4));
                js.setLength(0);
            }
        }
    }

    private ChartDataExportMode chartDataExportMode2;
    private String chartDataExportMode3;
    private String filename6;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", (chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null", filename6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s)", (chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null", filename6));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", chartDataExportMode3, filename6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s)", chartDataExportMode3, filename6));
                js.setLength(0);
            }
        }
    }

    private String filename7;

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

            js.append(String.format(Locale.US, jsBase + ".saveAsXml(%s);", filename7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXml(%s)", filename7));
                js.setLength(0);
            }
        }
    }

    private Fill selectMarqueeFill;

    public Chart setSelectMarqueeFill(Fill selectMarqueeFill) {
        if (jsBase == null) {
            this.selectMarqueeFill = selectMarqueeFill;
        } else {
            this.selectMarqueeFill = selectMarqueeFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s)", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s)", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Double opacity;

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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f)", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f)", color, opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

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

            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectMarqueeStroke(%s, %f, %s, %s, %s)", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String onSuccessOrOptions4;
    private Boolean asBase;
    private Double width7;
    private Double height5;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename8;

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

            js.append(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %f, %f, %f, %b, %s);", onSuccessOrOptions4, asBase, width7, height5, quality4, forceTransparentWhite2, filename8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %f, %f, %f, %b, %s)", onSuccessOrOptions4, asBase, width7, height5, quality4, forceTransparentWhite2, filename8));
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

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x2, y2, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %s, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x2, y2, filename9));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x2, y2, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %s, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x2, y2, filename9));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x2, y2, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %s, %b, %f, %f, %s)", paperSizeOrWidth5, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x2, y2, filename9));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x2, y2, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %b, %f, %f, %s)", paperSizeOrWidth5, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x2, y2, filename9));
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

            js.append(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %f, %f, %f, %s);", onSuccessOrOptions6, asBase2, width8, height6, quality5, filename10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %f, %f, %f, %s)", onSuccessOrOptions6, asBase2, width8, height6, quality5, filename10));
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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %b, %s)", paperSizeOrWidth6, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %b, %s)", paperSizeOrWidth6, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %s, %b, %s)", paperSizeOrWidth7, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %s, %b, %s)", paperSizeOrWidth7, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions;
    private String captionOrOptions1;
    private String link;
    private String name;
    private String description;

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

            js.append(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", captionOrOptions, link, name, description));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s)", captionOrOptions, link, name, description));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions2;
    private String captionOrOptions3;
    private String description1;

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

            js.append(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", captionOrOptions2, description1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s)", captionOrOptions2, description1));
                js.setLength(0);
            }
        }
    }

    private String linkOrOptions;
    private String linkOrOptions1;
    private String description2;

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

            js.append(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", linkOrOptions, description2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s)", linkOrOptions, description2));
                js.setLength(0);
            }
        }
    }

    private Boolean repeat;

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

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

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

            js.append(String.format(Locale.US, ".title(%s)", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", title1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String title3;
    private Boolean asString;

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

            js.append(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b);", title3, asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b)", title3, asString));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private ChartDataExportMode chartDataExportMode4;
    private String chartDataExportMode5;
    private String csvSettings1;

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

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", (chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null", csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s)", (chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null", csvSettings1));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", chartDataExportMode5, csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s)", chartDataExportMode5, csvSettings1));
                js.setLength(0);
            }
        }
    }

    private String title4;
    private Boolean asString1;

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

            js.append(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b);", title4, asString1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b)", title4, asString1));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Boolean stringify;

    public void toJson(Boolean stringify) {
        if (jsBase == null) {
            this.stringify = stringify;
        } else {
            this.stringify = stringify;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toJson(%b);", stringify));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b)", stringify));
                js.setLength(0);
            }
        }
    }

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape2;

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

            js.append(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", paperSize2, landscape2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b)", paperSize2, landscape2));
                js.setLength(0);
            }
        }
    }

    private Double width9;
    private Double height7;

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

            js.append(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width9, height7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f)", width9, height7));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;

    public void toXml(Boolean asXmlNode) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
        } else {
            this.asXmlNode = asXmlNode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toXml(%b);", asXmlNode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b)", asXmlNode));
                js.setLength(0);
            }
        }
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

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

            js.append(String.format(Locale.US, ".tooltip(%s)", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", tooltip));
                js.setLength(0);
            }
        }
        return this;
    }


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
        if (getLabel != null) {
            return getLabel.generateJs();
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

    private String generateJSay() {
        if (ay != null) {
            return String.format(Locale.US, "ay: %b,", ay);
        }
        return "";
    }

    private String generateJSay1() {
        if (ay1 != null) {
            return String.format(Locale.US, "ay: %s,", ay1);
        }
        return "";
    }

    private String generateJSanimation() {
        if (animation != null) {
            return String.format(Locale.US, "animation: %b,", animation);
        }
        return "";
    }

    private String generateJSanimation1() {
        if (animation1 != null) {
            return String.format(Locale.US, "animation: %s,", animation1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSduration() {
        if (duration != null) {
            return String.format(Locale.US, "duration: %f,", duration);
        }
        return "";
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJScontainer() {
        if (container != null) {
            return String.format(Locale.US, "container: %s,", (container != null) ? container.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer1() {
        if (container1 != null) {
            return String.format(Locale.US, "container: %s,", (container1 != null) ? container1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer2() {
        if (container2 != null) {
            return String.format(Locale.US, "container: %s,", container2);
        }
        return "";
    }

    private String generateJScontainer3() {
        if (container3 != null) {
            return String.format(Locale.US, "container: %s,", (container3 != null) ? container3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontextMenu() {
        if (contextMenu != null) {
            return String.format(Locale.US, "contextMenu: %s,", contextMenu);
        }
        return "";
    }

    private String generateJScontextMenu1() {
        if (contextMenu1 != null) {
            return String.format(Locale.US, "contextMenu: %b,", contextMenu1);
        }
        return "";
    }

    private String generateJSasync() {
        if (async != null) {
            return String.format(Locale.US, "async: %b,", async);
        }
        return "";
    }

    private String generateJSexports() {
        if (exports != null) {
            return String.format(Locale.US, "exports: %s,", exports);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions() {
        if (onSuccessOrOptions != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSquality() {
        if (quality != null) {
            return String.format(Locale.US, "quality: %f,", quality);
        }
        return "";
    }

    private String generateJSforceTransparentWhite() {
        if (forceTransparentWhite != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions1() {
        if (onSuccessOrOptions1 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions1);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth() {
        if (paperSizeOrWidth != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth1() {
        if (paperSizeOrWidth1 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %s,", paperSizeOrWidth1);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth() {
        if (landscapeOrWidth != null) {
            return String.format(Locale.US, "landscapeOrWidth: %f,", landscapeOrWidth);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth1() {
        if (landscapeOrWidth1 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %b,", landscapeOrWidth1);
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

    private String generateJSonSuccessOrOptions2() {
        if (onSuccessOrOptions2 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions2);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJSquality1() {
        if (quality1 != null) {
            return String.format(Locale.US, "quality: %f,", quality1);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions3() {
        if (onSuccessOrOptions3 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions3);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth2() {
        if (paperSizeOrWidth2 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %s,", paperSizeOrWidth2);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth3() {
        if (paperSizeOrWidth3 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth3);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight() {
        if (landscapeOrHeight != null) {
            return String.format(Locale.US, "landscapeOrHeight: %b,", landscapeOrHeight);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight1() {
        if (landscapeOrHeight1 != null) {
            return String.format(Locale.US, "landscapeOrHeight: %s,", landscapeOrHeight1);
        }
        return "";
    }

    private String generateJSxCoord() {
        if (xCoord != null) {
            return String.format(Locale.US, "xCoord: %f,", xCoord);
        }
        return "";
    }

    private String generateJSyCoord() {
        if (yCoord != null) {
            return String.format(Locale.US, "yCoord: %f,", yCoord);
        }
        return "";
    }

    private String generateJSlabel() {
        if (label != null) {
            return String.format(Locale.US, "label: %b,", label);
        }
        return "";
    }

    private String generateJSlabel1() {
        if (label1 != null) {
            return String.format(Locale.US, "label: %s,", label1);
        }
        return "";
    }

    private String generateJSlabel2() {
        if (label2 != null) {
            return String.format(Locale.US, "label: %s,", label2);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %s,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSlabel3() {
        if (label3 != null) {
            return String.format(Locale.US, "label: %b,", label3);
        }
        return "";
    }

    private String generateJSlabel4() {
        if (label4 != null) {
            return String.format(Locale.US, "label: %s,", label4);
        }
        return "";
    }

    private String generateJSlabel5() {
        if (label5 != null) {
            return String.format(Locale.US, "label: %s,", label5);
        }
        return "";
    }

    private String generateJSxCoord1() {
        if (xCoord1 != null) {
            return String.format(Locale.US, "xCoord: %f,", xCoord1);
        }
        return "";
    }

    private String generateJSyCoord1() {
        if (yCoord1 != null) {
            return String.format(Locale.US, "yCoord: %f,", yCoord1);
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

    private String generateJSnoData() {
        if (noData != null) {
            return String.format(Locale.US, "noData: %s,", noData);
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

    private String generateJSvalue8() {
        if (value8 != null) {
            return String.format(Locale.US, "value: %s,", value8);
        }
        return "";
    }

    private String generateJSvalue9() {
        if (value9 != null) {
            return String.format(Locale.US, "value: %f,", value9);
        }
        return "";
    }

    private String generateJSvalue10() {
        if (value10 != null) {
            return String.format(Locale.US, "value: %s,", value10);
        }
        return "";
    }

    private String generateJSvalue11() {
        if (value11 != null) {
            return String.format(Locale.US, "value: %f,", value11);
        }
        return "";
    }

    private String generateJSvalue12() {
        if (value12 != null) {
            return String.format(Locale.US, "value: %s,", value12);
        }
        return "";
    }

    private String generateJSvalue13() {
        if (value13 != null) {
            return String.format(Locale.US, "value: %f,", value13);
        }
        return "";
    }

    private String generateJSvalue14() {
        if (value14 != null) {
            return String.format(Locale.US, "value: %s,", value14);
        }
        return "";
    }

    private String generateJSvalue15() {
        if (value15 != null) {
            return String.format(Locale.US, "value: %f,", value15);
        }
        return "";
    }

    private String generateJSchartDataExportMode() {
        if (chartDataExportMode != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode != null) ? chartDataExportMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchartDataExportMode1() {
        if (chartDataExportMode1 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode1);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: %s,", filename);
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

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSquality2() {
        if (quality2 != null) {
            return String.format(Locale.US, "quality: %f,", quality2);
        }
        return "";
    }

    private String generateJSforceTransparentWhite1() {
        if (forceTransparentWhite1 != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite1);
        }
        return "";
    }

    private String generateJSfilename1() {
        if (filename1 != null) {
            return String.format(Locale.US, "filename: %s,", filename1);
        }
        return "";
    }

    private String generateJSfilename2() {
        if (filename2 != null) {
            return String.format(Locale.US, "filename: %s,", filename2);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidthOrOptions() {
        if (paperSizeOrWidthOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrWidthOrOptions: %f,", paperSizeOrWidthOrOptions);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidthOrOptions1() {
        if (paperSizeOrWidthOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrWidthOrOptions: %s,", paperSizeOrWidthOrOptions1);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidthOrOptions2() {
        if (paperSizeOrWidthOrOptions2 != null) {
            return String.format(Locale.US, "paperSizeOrWidthOrOptions: %s,", paperSizeOrWidthOrOptions2);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %f,", x1);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %f,", y1);
        }
        return "";
    }

    private String generateJSfilename3() {
        if (filename3 != null) {
            return String.format(Locale.US, "filename: %s,", filename3);
        }
        return "";
    }

    private String generateJSwidth4() {
        if (width4 != null) {
            return String.format(Locale.US, "width: %f,", width4);
        }
        return "";
    }

    private String generateJSwidth5() {
        if (width5 != null) {
            return String.format(Locale.US, "width: %s,", width5);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %f,", height3);
        }
        return "";
    }

    private String generateJSquality3() {
        if (quality3 != null) {
            return String.format(Locale.US, "quality: %f,", quality3);
        }
        return "";
    }

    private String generateJSfilename4() {
        if (filename4 != null) {
            return String.format(Locale.US, "filename: %s,", filename4);
        }
        return "";
    }

    private String generateJSpaperSize() {
        if (paperSize != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize);
        }
        return "";
    }

    private String generateJSpaperSize1() {
        if (paperSize1 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize1);
        }
        return "";
    }

    private String generateJSlandscape1() {
        if (landscape1 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape1);
        }
        return "";
    }

    private String generateJSfilename5() {
        if (filename5 != null) {
            return String.format(Locale.US, "filename: %s,", filename5);
        }
        return "";
    }

    private String generateJSwidth6() {
        if (width6 != null) {
            return String.format(Locale.US, "width: %f,", width6);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
        }
        return "";
    }

    private String generateJSchartDataExportMode2() {
        if (chartDataExportMode2 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode2 != null) ? chartDataExportMode2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchartDataExportMode3() {
        if (chartDataExportMode3 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode3);
        }
        return "";
    }

    private String generateJSfilename6() {
        if (filename6 != null) {
            return String.format(Locale.US, "filename: %s,", filename6);
        }
        return "";
    }

    private String generateJSfilename7() {
        if (filename7 != null) {
            return String.format(Locale.US, "filename: %s,", filename7);
        }
        return "";
    }

    private String generateJSselectMarqueeFill() {
        if (selectMarqueeFill != null) {
            return String.format(Locale.US, "selectMarqueeFill: %s,", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", (color2 != null) ? color2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSonSuccessOrOptions4() {
        if (onSuccessOrOptions4 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions4);
        }
        return "";
    }

    private String generateJSasBase() {
        if (asBase != null) {
            return String.format(Locale.US, "asBase: %b,", asBase);
        }
        return "";
    }

    private String generateJSwidth7() {
        if (width7 != null) {
            return String.format(Locale.US, "width: %f,", width7);
        }
        return "";
    }

    private String generateJSheight5() {
        if (height5 != null) {
            return String.format(Locale.US, "height: %f,", height5);
        }
        return "";
    }

    private String generateJSquality4() {
        if (quality4 != null) {
            return String.format(Locale.US, "quality: %f,", quality4);
        }
        return "";
    }

    private String generateJSforceTransparentWhite2() {
        if (forceTransparentWhite2 != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite2);
        }
        return "";
    }

    private String generateJSfilename8() {
        if (filename8 != null) {
            return String.format(Locale.US, "filename: %s,", filename8);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions5() {
        if (onSuccessOrOptions5 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions5);
        }
        return "";
    }

    private String generateJSasBase1() {
        if (asBase1 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase1);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth4() {
        if (paperSizeOrWidth4 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth4);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth5() {
        if (paperSizeOrWidth5 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %s,", paperSizeOrWidth5);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth2() {
        if (landscapeOrWidth2 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %f,", landscapeOrWidth2);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth3() {
        if (landscapeOrWidth3 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %b,", landscapeOrWidth3);
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSfilename9() {
        if (filename9 != null) {
            return String.format(Locale.US, "filename: %s,", filename9);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions6() {
        if (onSuccessOrOptions6 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions6);
        }
        return "";
    }

    private String generateJSasBase2() {
        if (asBase2 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase2);
        }
        return "";
    }

    private String generateJSwidth8() {
        if (width8 != null) {
            return String.format(Locale.US, "width: %f,", width8);
        }
        return "";
    }

    private String generateJSheight6() {
        if (height6 != null) {
            return String.format(Locale.US, "height: %f,", height6);
        }
        return "";
    }

    private String generateJSquality5() {
        if (quality5 != null) {
            return String.format(Locale.US, "quality: %f,", quality5);
        }
        return "";
    }

    private String generateJSfilename10() {
        if (filename10 != null) {
            return String.format(Locale.US, "filename: %s,", filename10);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions7() {
        if (onSuccessOrOptions7 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions7);
        }
        return "";
    }

    private String generateJSasBase3() {
        if (asBase3 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase3);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth6() {
        if (paperSizeOrWidth6 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %s,", paperSizeOrWidth6);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth7() {
        if (paperSizeOrWidth7 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth7);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight2() {
        if (landscapeOrHeight2 != null) {
            return String.format(Locale.US, "landscapeOrHeight: %b,", landscapeOrHeight2);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight3() {
        if (landscapeOrHeight3 != null) {
            return String.format(Locale.US, "landscapeOrHeight: %s,", landscapeOrHeight3);
        }
        return "";
    }

    private String generateJSfilename11() {
        if (filename11 != null) {
            return String.format(Locale.US, "filename: %s,", filename11);
        }
        return "";
    }

    private String generateJScaptionOrOptions() {
        if (captionOrOptions != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions);
        }
        return "";
    }

    private String generateJScaptionOrOptions1() {
        if (captionOrOptions1 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions1);
        }
        return "";
    }

    private String generateJSlink() {
        if (link != null) {
            return String.format(Locale.US, "link: %s,", link);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSdescription() {
        if (description != null) {
            return String.format(Locale.US, "description: %s,", description);
        }
        return "";
    }

    private String generateJScaptionOrOptions2() {
        if (captionOrOptions2 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions2);
        }
        return "";
    }

    private String generateJScaptionOrOptions3() {
        if (captionOrOptions3 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions3);
        }
        return "";
    }

    private String generateJSdescription1() {
        if (description1 != null) {
            return String.format(Locale.US, "description: %s,", description1);
        }
        return "";
    }

    private String generateJSlinkOrOptions() {
        if (linkOrOptions != null) {
            return String.format(Locale.US, "linkOrOptions: %s,", linkOrOptions);
        }
        return "";
    }

    private String generateJSlinkOrOptions1() {
        if (linkOrOptions1 != null) {
            return String.format(Locale.US, "linkOrOptions: %s,", linkOrOptions1);
        }
        return "";
    }

    private String generateJSdescription2() {
        if (description2 != null) {
            return String.format(Locale.US, "description: %s,", description2);
        }
        return "";
    }

    private String generateJSrepeat() {
        if (repeat != null) {
            return String.format(Locale.US, "repeat: %b,", repeat);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStitle2() {
        if (title2 != null) {
            return String.format(Locale.US, "title: %s,", title2);
        }
        return "";
    }

    private String generateJStitle3() {
        if (title3 != null) {
            return String.format(Locale.US, "title: %s,", title3);
        }
        return "";
    }

    private String generateJSasString() {
        if (asString != null) {
            return String.format(Locale.US, "asString: %b,", asString);
        }
        return "";
    }

    private String generateJSchartDataExportMode4() {
        if (chartDataExportMode4 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode4 != null) ? chartDataExportMode4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchartDataExportMode5() {
        if (chartDataExportMode5 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode5);
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings1);
        }
        return "";
    }

    private String generateJStitle4() {
        if (title4 != null) {
            return String.format(Locale.US, "title: %s,", title4);
        }
        return "";
    }

    private String generateJSasString1() {
        if (asString1 != null) {
            return String.format(Locale.US, "asString: %b,", asString1);
        }
        return "";
    }

    private String generateJSstringify() {
        if (stringify != null) {
            return String.format(Locale.US, "stringify: %b,", stringify);
        }
        return "";
    }

    private String generateJSpaperSize2() {
        if (paperSize2 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize2);
        }
        return "";
    }

    private String generateJSpaperSize3() {
        if (paperSize3 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize3);
        }
        return "";
    }

    private String generateJSlandscape2() {
        if (landscape2 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape2);
        }
        return "";
    }

    private String generateJSwidth9() {
        if (width9 != null) {
            return String.format(Locale.US, "width: %f,", width9);
        }
        return "";
    }

    private String generateJSheight7() {
        if (height7 != null) {
            return String.format(Locale.US, "height: %f,", height7);
        }
        return "";
    }

    private String generateJSasXmlNode() {
        if (asXmlNode != null) {
            return String.format(Locale.US, "asXmlNode: %b,", asXmlNode);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %s,", tooltip);
        }
        return "";
    }

    private String generateJStooltip1() {
        if (tooltip1 != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip1);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSay());
            js.append(generateJSay1());
            js.append(generateJSanimation());
            js.append(generateJSanimation1());
            js.append(generateJSenabled());
            js.append(generateJSduration());
            js.append(generateJSbackground());
            js.append(generateJScontainer());
            js.append(generateJScontainer1());
            js.append(generateJScontainer2());
            js.append(generateJScontainer3());
            js.append(generateJScontextMenu());
            js.append(generateJScontextMenu1());
            js.append(generateJSasync());
            js.append(generateJSexports());
            js.append(generateJSonSuccessOrOptions());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append(generateJSquality());
            js.append(generateJSforceTransparentWhite());
            js.append(generateJSonSuccessOrOptions1());
            js.append(generateJSpaperSizeOrWidth());
            js.append(generateJSpaperSizeOrWidth1());
            js.append(generateJSlandscapeOrWidth());
            js.append(generateJSlandscapeOrWidth1());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJSonSuccessOrOptions2());
            js.append(generateJSwidth1());
            js.append(generateJSheight1());
            js.append(generateJSquality1());
            js.append(generateJSonSuccessOrOptions3());
            js.append(generateJSpaperSizeOrWidth2());
            js.append(generateJSpaperSizeOrWidth3());
            js.append(generateJSlandscapeOrHeight());
            js.append(generateJSlandscapeOrHeight1());
            js.append(generateJSxCoord());
            js.append(generateJSyCoord());
            js.append(generateJSlabel());
            js.append(generateJSlabel1());
            js.append(generateJSlabel2());
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJSlabel3());
            js.append(generateJSlabel4());
            js.append(generateJSlabel5());
            js.append(generateJSxCoord1());
            js.append(generateJSyCoord1());
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
            js.append(generateJSnoData());
            js.append(generateJSpadding());
            js.append(generateJSpadding1());
            js.append(generateJSpadding2());
            js.append(generateJSvalue8());
            js.append(generateJSvalue9());
            js.append(generateJSvalue10());
            js.append(generateJSvalue11());
            js.append(generateJSvalue12());
            js.append(generateJSvalue13());
            js.append(generateJSvalue14());
            js.append(generateJSvalue15());
            js.append(generateJSchartDataExportMode());
            js.append(generateJSchartDataExportMode1());
            js.append(generateJScsvSettings());
            js.append(generateJSfilename());
            js.append(generateJSwidth2());
            js.append(generateJSwidth3());
            js.append(generateJSheight2());
            js.append(generateJSquality2());
            js.append(generateJSforceTransparentWhite1());
            js.append(generateJSfilename1());
            js.append(generateJSfilename2());
            js.append(generateJSpaperSizeOrWidthOrOptions());
            js.append(generateJSpaperSizeOrWidthOrOptions1());
            js.append(generateJSpaperSizeOrWidthOrOptions2());
            js.append(generateJSlandscape());
            js.append(generateJSx1());
            js.append(generateJSy1());
            js.append(generateJSfilename3());
            js.append(generateJSwidth4());
            js.append(generateJSwidth5());
            js.append(generateJSheight3());
            js.append(generateJSquality3());
            js.append(generateJSfilename4());
            js.append(generateJSpaperSize());
            js.append(generateJSpaperSize1());
            js.append(generateJSlandscape1());
            js.append(generateJSfilename5());
            js.append(generateJSwidth6());
            js.append(generateJSheight4());
            js.append(generateJSchartDataExportMode2());
            js.append(generateJSchartDataExportMode3());
            js.append(generateJSfilename6());
            js.append(generateJSfilename7());
            js.append(generateJSselectMarqueeFill());
            js.append(generateJScolor());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJScolor1());
            js.append(generateJScolor2());
            js.append(generateJScolor3());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSonSuccessOrOptions4());
            js.append(generateJSasBase());
            js.append(generateJSwidth7());
            js.append(generateJSheight5());
            js.append(generateJSquality4());
            js.append(generateJSforceTransparentWhite2());
            js.append(generateJSfilename8());
            js.append(generateJSonSuccessOrOptions5());
            js.append(generateJSasBase1());
            js.append(generateJSpaperSizeOrWidth4());
            js.append(generateJSpaperSizeOrWidth5());
            js.append(generateJSlandscapeOrWidth2());
            js.append(generateJSlandscapeOrWidth3());
            js.append(generateJSx2());
            js.append(generateJSy2());
            js.append(generateJSfilename9());
            js.append(generateJSonSuccessOrOptions6());
            js.append(generateJSasBase2());
            js.append(generateJSwidth8());
            js.append(generateJSheight6());
            js.append(generateJSquality5());
            js.append(generateJSfilename10());
            js.append(generateJSonSuccessOrOptions7());
            js.append(generateJSasBase3());
            js.append(generateJSpaperSizeOrWidth6());
            js.append(generateJSpaperSizeOrWidth7());
            js.append(generateJSlandscapeOrHeight2());
            js.append(generateJSlandscapeOrHeight3());
            js.append(generateJSfilename11());
            js.append(generateJScaptionOrOptions());
            js.append(generateJScaptionOrOptions1());
            js.append(generateJSlink());
            js.append(generateJSname());
            js.append(generateJSdescription());
            js.append(generateJScaptionOrOptions2());
            js.append(generateJScaptionOrOptions3());
            js.append(generateJSdescription1());
            js.append(generateJSlinkOrOptions());
            js.append(generateJSlinkOrOptions1());
            js.append(generateJSdescription2());
            js.append(generateJSrepeat());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitle2());
            js.append(generateJStitle3());
            js.append(generateJSasString());
            js.append(generateJSchartDataExportMode4());
            js.append(generateJSchartDataExportMode5());
            js.append(generateJScsvSettings1());
            js.append(generateJStitle4());
            js.append(generateJSasString1());
            js.append(generateJSstringify());
            js.append(generateJSpaperSize2());
            js.append(generateJSpaperSize3());
            js.append(generateJSlandscape2());
            js.append(generateJSwidth9());
            js.append(generateJSheight7());
            js.append(generateJSasXmlNode());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
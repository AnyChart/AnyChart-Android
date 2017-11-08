package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * An extended base element that understands bounds settings and can handle percent values in it.
 */
public class VisualBaseWithBounds extends VisualBase {

    public VisualBaseWithBounds() {
        js.setLength(0);
        js.append("var visualBaseWithBounds").append(++variableIndex).append(" = anychart.core.visualBaseWithBounds();");
        jsBase = "visualBaseWithBounds" + variableIndex;
    }

    protected VisualBaseWithBounds(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VisualBaseWithBounds(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double bottom;
    private String bottom1;

    /**
     * Sets element bottom bound setting.
     */
    public VisualBaseWithBounds setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
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


    /**
     * Sets element bottom bound setting.
     */
    public VisualBaseWithBounds setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Bounds getBounds;

    /**
     * Getter for the element bounds settings.
     */
    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds(jsBase + ".bounds()");

        return getBounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    /**
     * Sets bounds of the element using one parameter.
     */
    public VisualBase setBounds(RectObj bounds) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds = bounds;
        } else {
            this.bounds = bounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s)", ((bounds != null) ? bounds.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Sets bounds of the element using one parameter.
     */
    public VisualBase setBounds(AnychartMathRect bounds1) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds1 = bounds1;
        } else {
            this.bounds1 = bounds1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(bounds1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".bounds(%s);",  ((bounds1 != null) ? bounds1.getJsBase() : "null")));
        }
        return new VisualBase(jsBase);
    }


    /**
     * Sets bounds of the element using one parameter.
     */
    public VisualBase setBounds(Bounds bounds2) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds2 = bounds2;
        } else {
            this.bounds2 = bounds2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(bounds2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".bounds(%s);",  ((bounds2 != null) ? bounds2.getJsBase() : "null")));
        }
        return new VisualBase(jsBase);
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    /**
     * Setter for the element bounds settings.
     */
    public VisualBase setBounds(String x1, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s)", wrapQuotes(x1), wrapQuotes(y1), wrapQuotes(width1), wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Setter for the element bounds settings.
     */
    public VisualBase setBounds(Double x, Double y, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f)", x, y, width, height));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }

    private Double height2;
    private String height3;

    /**
     * Sets element height setting.
     */
    public VisualBaseWithBounds setHeight(Double height2) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height2 = height2;
        } else {
            this.height2 = height2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%f)", height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets element height setting.
     */
    public VisualBaseWithBounds setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private String left1;

    /**
     * Sets element left bound setting.
     */
    public VisualBaseWithBounds setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
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


    /**
     * Sets element left bound setting.
     */
    public VisualBaseWithBounds setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxHeight;
    private String maxHeight1;

    /**
     * Setter for maximum height.
     */
    public VisualBase setMaxHeight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%f)", maxHeight));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Setter for maximum height.
     */
    public VisualBase setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s)", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }

    private Double maxWidth;
    private String maxWidth1;

    /**
     * Setter for maximum width.
     */
    public VisualBase setMaxWidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%f)", maxWidth));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Setter for maximum width.
     */
    public VisualBase setMaxWidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s)", wrapQuotes(maxWidth1)));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }

    private Double minHeight;
    private String minHeight1;

    /**
     * Setter for minimum height.
     */
    public VisualBase setMinHeight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%f)", minHeight));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Setter for minimum height.
     */
    public VisualBase setMinHeight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s)", wrapQuotes(minHeight1)));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }

    private Double minWidth;
    private String minWidth1;

    /**
     * Setter for minimum width.
     */
    public VisualBase setMinWidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%f)", minWidth));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }


    /**
     * Setter for minimum width.
     */
    public VisualBase setMinWidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s)", wrapQuotes(minWidth1)));
                js.setLength(0);
            }
        }
        return new VisualBase(jsBase);
    }

    private Double right;
    private String right1;

    /**
     * Sets element right bound setting.
     */
    public VisualBaseWithBounds setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
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


    /**
     * Sets element right bound setting.
     */
    public VisualBaseWithBounds setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double top;
    private String top1;

    /**
     * Sets element top bound setting.
     */
    public VisualBaseWithBounds setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
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


    /**
     * Sets element top bound setting.
     */
    public VisualBaseWithBounds setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width2;
    private String width3;

    /**
     * Sets element width setting.
     */
    public VisualBaseWithBounds setWidth(Double width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;
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


    /**
     * Sets element width setting.
     */
    public VisualBaseWithBounds setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBounds());

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
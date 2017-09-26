package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Chart extends JsObject {

    private String jsBase;

    public Chart() {

    }

    protected Chart(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private ChartA11y geta11y;

    public ChartA11y getA11Y() {
        if (geta11y == null)
            geta11y = new ChartA11y(jsBase + ".a11y()");

        return geta11y;
    }

    private Boolean ay;
    private String ay1;

    public void setA11Y(Boolean ay) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay = ay;
        } else {
            this.ay = ay;

            js.append(String.format(Locale.US, jsBase + ".a11y(%b);", ay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%b);", ay));
                js.setLength(0);
            }
        }
    }


    public void setA11Y(String ay1) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay1 = ay1;
        } else {
            this.ay1 = ay1;

            js.append(String.format(Locale.US, jsBase + ".a11y(%s);", ay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%s);", ay1));
                js.setLength(0);
            }
        }
    }

    private Animation getanimation;

    public Animation getAnimation() {
        if (getanimation == null)
            getanimation = new Animation(jsBase + ".animation()");

        return getanimation;
    }

    private Boolean animation;
    private String animation1;

    public void setAnimation(Boolean animation) {
        if (jsBase == null) {
            this.animation = null;
            this.animation1 = null;
            
            this.animation = animation;
        } else {
            this.animation = animation;

            js.append(String.format(Locale.US, jsBase + ".animation(%b);", animation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%b);", animation));
                js.setLength(0);
            }
        }
    }


    public void setAnimation(String animation1) {
        if (jsBase == null) {
            this.animation = null;
            this.animation1 = null;
            
            this.animation1 = animation1;
        } else {
            this.animation1 = animation1;

            js.append(String.format(Locale.US, jsBase + ".animation(%s);", animation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%s);", animation1));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        if (jsBase == null) {
            this.enabled = enabled;
            this.duration = duration;
        } else {
            this.enabled = enabled;
            this.duration = duration;

            js.append(String.format(Locale.US, jsBase + ".animation(%b, %f);", enabled, duration));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".animation(%b, %f);", enabled, duration));
                js.setLength(0);
            }
        }
    }

    private UiBackground getbackground;

    public UiBackground getBackground() {
        if (getbackground == null)
            getbackground = new UiBackground(jsBase + ".background()");

        return getbackground;
    }

    private String background;

    public void setBackground(String background) {
        if (jsBase == null) {
            this.background = background;
        } else {
            this.background = background;

            js.append(String.format(Locale.US, jsBase + ".background(%s);", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", background));
                js.setLength(0);
            }
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;

            js.append(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));
                js.setLength(0);
            }
        }
    }


    public void setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;

            js.append(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));
                js.setLength(0);
            }
        }
    }

    private Bounds getbounds;

    public Bounds getBounds() {
        if (getbounds == null)
            getbounds = new Bounds(jsBase + ".bounds()");

        return getbounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds = bounds;
        } else {
            this.bounds = bounds;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds1 = bounds1;
        } else {
            this.bounds1 = bounds1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Bounds bounds2) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds2 = bounds2;
        } else {
            this.bounds2 = bounds2;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
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

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
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
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
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
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
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
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
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
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
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

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
                js.setLength(0);
            }
        }
    }

    private Layer getcontainer;

    public Layer getContainer() {
        if (getcontainer == null)
            getcontainer = new Layer(jsBase + ".container()");

        return getcontainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container = container;
        } else {
            this.container = container;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container != null) ? container.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container != null) ? container.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setContainer(Stage container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container1 != null) ? container1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container1 != null) ? container1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setContainer(String container2) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container2 = container2;
        } else {
            this.container2 = container2;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", container2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", container2));
                js.setLength(0);
            }
        }
    }


    public void setContainer(Element container3) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container3 = container3;
        } else {
            this.container3 = container3;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container3 != null) ? container3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container3 != null) ? container3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private ContextMenu getcontextMenu;

    public ContextMenu getContextmenu() {
        if (getcontextMenu == null)
            getcontextMenu = new ContextMenu(jsBase + ".contextMenu()");

        return getcontextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

    public void setContextmenu(String contextMenu) {
        if (jsBase == null) {
            this.contextMenu = null;
            this.contextMenu1 = null;
            
            this.contextMenu = contextMenu;
        } else {
            this.contextMenu = contextMenu;

            js.append(String.format(Locale.US, jsBase + ".contextMenu(%s);", contextMenu));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".contextMenu(%s);", contextMenu));
                js.setLength(0);
            }
        }
    }


    public void setContextmenu(Boolean contextMenu1) {
        if (jsBase == null) {
            this.contextMenu = null;
            this.contextMenu1 = null;
            
            this.contextMenu1 = contextMenu1;
        } else {
            this.contextMenu1 = contextMenu1;

            js.append(String.format(Locale.US, jsBase + ".contextMenu(%b);", contextMenu1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".contextMenu(%b);", contextMenu1));
                js.setLength(0);
            }
        }
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        if (jsBase == null) {
            this.async = async;
        } else {
            this.async = async;

            js.append(String.format(Locale.US, jsBase + ".draw(%b);", async));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".draw(%b);", async));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled1;

    public void setEnabled(Boolean enabled1) {
        if (jsBase == null) {
            this.enabled = null;
            this.enabled1 = null;
            
            this.enabled1 = enabled1;
        } else {
            this.enabled1 = enabled1;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled1));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions;
    private Double width2;
    private Double height2;
    private Double quality;
    private Boolean forceTransparentWhite;

    public void setGetjpgbase64String(String onSuccessOrOptions, Double width2, Double height2, Double quality, Boolean forceTransparentWhite) {
        if (jsBase == null) {
            this.onSuccessOrOptions = onSuccessOrOptions;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
        } else {
            this.onSuccessOrOptions = onSuccessOrOptions;
            this.width2 = width2;
            this.height2 = height2;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;

            js.append(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %f, %f, %f, %b);", onSuccessOrOptions, width2, height2, quality, forceTransparentWhite));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %f, %f, %f, %b);", onSuccessOrOptions, width2, height2, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions1;
    private Double paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Double landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Double x2;
    private Double y2;

    public void setGetpdfbase64String(Double paperSizeOrWidth, Double landscapeOrWidth, String onSuccessOrOptions1, Double x2, Double y2) {
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
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x2 = x2;
            this.y2 = y2;

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth, onSuccessOrOptions1, x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth, onSuccessOrOptions1, x2, y2));
                js.setLength(0);
            }
        }
    }


    public void setGetpdfbase64String(Double paperSizeOrWidth, Boolean landscapeOrWidth1, String onSuccessOrOptions1, Double x2, Double y2) {
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
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x2 = x2;
            this.y2 = y2;

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth1, onSuccessOrOptions1, x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %s, %f, %f);", paperSizeOrWidth, landscapeOrWidth1, onSuccessOrOptions1, x2, y2));
                js.setLength(0);
            }
        }
    }


    public void setGetpdfbase64String(String paperSizeOrWidth1, Double landscapeOrWidth, String onSuccessOrOptions1, Double x2, Double y2) {
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
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = landscapeOrWidth;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x2 = x2;
            this.y2 = y2;

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth, onSuccessOrOptions1, x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth, onSuccessOrOptions1, x2, y2));
                js.setLength(0);
            }
        }
    }


    public void setGetpdfbase64String(String paperSizeOrWidth1, Boolean landscapeOrWidth1, String onSuccessOrOptions1, Double x2, Double y2) {
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
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.onSuccessOrOptions1 = onSuccessOrOptions1;
            this.x2 = x2;
            this.y2 = y2;

            js.append(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth1, onSuccessOrOptions1, x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %s, %f, %f);", paperSizeOrWidth1, landscapeOrWidth1, onSuccessOrOptions1, x2, y2));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions2;
    private Double width3;
    private Double height3;
    private Double quality1;

    public void setGetpngbase64String(String onSuccessOrOptions2, Double width3, Double height3, Double quality1) {
        if (jsBase == null) {
            this.onSuccessOrOptions = null;
            this.onSuccessOrOptions1 = null;
            this.onSuccessOrOptions2 = null;
            
            this.onSuccessOrOptions2 = onSuccessOrOptions2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
            this.quality = null;
            this.quality1 = null;
            
            this.quality1 = quality1;
        } else {
            this.onSuccessOrOptions2 = onSuccessOrOptions2;
            this.width3 = width3;
            this.height3 = height3;
            this.quality1 = quality1;

            js.append(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %f, %f, %f);", onSuccessOrOptions2, width3, height3, quality1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %f, %f, %f);", onSuccessOrOptions2, width3, height3, quality1));
                js.setLength(0);
            }
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
    }


    public void setGetstat(Statistics key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions3;
    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    public void setGetsvgbase64String(String paperSizeOrWidth2, Boolean landscapeOrHeight, String onSuccessOrOptions3) {
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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b, %s);", paperSizeOrWidth2, landscapeOrHeight, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b, %s);", paperSizeOrWidth2, landscapeOrHeight, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


    public void setGetsvgbase64String(String paperSizeOrWidth2, String landscapeOrHeight1, String onSuccessOrOptions3) {
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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s);", paperSizeOrWidth2, landscapeOrHeight1, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s);", paperSizeOrWidth2, landscapeOrHeight1, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


    public void setGetsvgbase64String(Double paperSizeOrWidth3, Boolean landscapeOrHeight, String onSuccessOrOptions3) {
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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b, %s);", paperSizeOrWidth3, landscapeOrHeight, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b, %s);", paperSizeOrWidth3, landscapeOrHeight, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }


    public void setGetsvgbase64String(Double paperSizeOrWidth3, String landscapeOrHeight1, String onSuccessOrOptions3) {
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

            js.append(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s, %s);", paperSizeOrWidth3, landscapeOrHeight1, onSuccessOrOptions3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s, %s);", paperSizeOrWidth3, landscapeOrHeight1, onSuccessOrOptions3));
                js.setLength(0);
            }
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        if (jsBase == null) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        } else {
            this.xCoord = xCoord;
            this.yCoord = yCoord;

            js.append(String.format(Locale.US, jsBase + ".globalToLocal(%f, %f);", xCoord, yCoord));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalToLocal(%f, %f);", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private Double height4;
    private String height5;

    public void setHeight(Double height4) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height4 = height4;
        } else {
            this.height4 = height4;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height4));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height5) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height5 = height5;
        } else {
            this.height5 = height5;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height5));
                js.setLength(0);
            }
        }
    }

    private String index;
    private Double index1;

    public void setLabel(String index) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".label(%s);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", index));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".label(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private Boolean label;
    private String label1;
    private String label2;

    public void setLabel(Boolean label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;

            js.append(String.format(Locale.US, jsBase + ".label(%b);", label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label));
                js.setLength(0);
            }
        }
    }

    private String index2;
    private Double index3;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index2, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index2 = index2;
            this.label3 = label3;

            js.append(String.format(Locale.US, jsBase + ".label(%s, %b);", index2, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", index2, label3));
                js.setLength(0);
            }
        }
    }


    public void setLabel(String index2, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index2 = index2;
            this.label4 = label4;

            js.append(String.format(Locale.US, jsBase + ".label(%s, %s);", index2, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", index2, label4));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index3, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index3 = index3;
            this.label3 = label3;

            js.append(String.format(Locale.US, jsBase + ".label(%f, %b);", index3, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f, %b);", index3, label3));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index3, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index3 = index3;
            this.label4 = label4;

            js.append(String.format(Locale.US, jsBase + ".label(%f, %s);", index3, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f, %s);", index3, label4));
                js.setLength(0);
            }
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".left(%f);", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%f);", left));
                js.setLength(0);
            }
        }
    }


    public void setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".left(%s);", left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%s);", left1));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
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

            js.append(String.format(Locale.US, jsBase + ".localToGlobal(%f, %f);", xCoord1, yCoord1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".localToGlobal(%f, %f);", xCoord1, yCoord1));
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

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));
                js.setLength(0);
            }
        }
    }


    public void setMaxheight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));
                js.setLength(0);
            }
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));
                js.setLength(0);
            }
        }
    }


    public void setMaxwidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));
                js.setLength(0);
            }
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));
                js.setLength(0);
            }
        }
    }


    public void setMinheight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));
                js.setLength(0);
            }
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));
                js.setLength(0);
            }
        }
    }


    public void setMinwidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));
                js.setLength(0);
            }
        }
    }

    private UtilsPadding getpadding;

    public UtilsPadding getPadding() {
        if (getpadding == null)
            getpadding = new UtilsPadding(jsBase + ".padding()");

        return getpadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public void setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", padding2));
                js.setLength(0);
            }
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
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
            
            this.value14 = value14;
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
            
            this.value13 = value13;
        } else {
            this.value14 = value14;
            this.value8 = value8;
            this.value9 = value9;
            this.value10 = value10;
            this.value11 = value11;
            this.value12 = value12;
            this.value13 = value13;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
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
            
            this.value15 = value15;
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
            
            this.value13 = value13;
        } else {
            this.value15 = value15;
            this.value8 = value8;
            this.value9 = value9;
            this.value10 = value10;
            this.value11 = value11;
            this.value12 = value12;
            this.value13 = value13;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;

            js.append(String.format(Locale.US, jsBase + ".right(%f);", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%f);", right));
                js.setLength(0);
            }
        }
    }


    public void setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;

            js.append(String.format(Locale.US, jsBase + ".right(%s);", right1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%s);", right1));
                js.setLength(0);
            }
        }
    }

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings, String filename) {
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

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings, filename));
                js.setLength(0);
            }
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings, String filename) {
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

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings, filename));
                js.setLength(0);
            }
        }
    }

    private Double width4;
    private String width5;
    private Double height6;
    private Double quality2;
    private Boolean forceTransparentWhite1;
    private String filename1;

    public void setSaveasjpg(Double width4, Double height6, Double quality2, Boolean forceTransparentWhite1, String filename1) {
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
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
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
            this.width4 = width4;
            this.height6 = height6;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename1 = filename1;

            js.append(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s);", width4, height6, quality2, forceTransparentWhite1, filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b, %s);", width4, height6, quality2, forceTransparentWhite1, filename1));
                js.setLength(0);
            }
        }
    }


    public void setSaveasjpg(String width5, Double height6, Double quality2, Boolean forceTransparentWhite1, String filename1) {
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
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
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
            this.width5 = width5;
            this.height6 = height6;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            this.filename1 = filename1;

            js.append(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %f, %f, %b, %s);", width5, height6, quality2, forceTransparentWhite1, filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %f, %f, %b, %s);", width5, height6, quality2, forceTransparentWhite1, filename1));
                js.setLength(0);
            }
        }
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        if (jsBase == null) {
            this.includeTheme = includeTheme;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            
            this.filename2 = filename2;
        } else {
            this.includeTheme = includeTheme;
            this.filename2 = filename2;

            js.append(String.format(Locale.US, jsBase + ".saveAsJson(%b, %s);", includeTheme, filename2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJson(%b, %s);", includeTheme, filename2));
                js.setLength(0);
            }
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private String paperSizeOrWidthOrOptions2;
    private Boolean landscape1;
    private Double x3;
    private Double y3;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x3, Double y3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidthOrOptions = null;
            this.paperSizeOrWidthOrOptions1 = null;
            this.paperSizeOrWidthOrOptions2 = null;
            
            this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            
            this.x3 = x3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            
            this.y3 = y3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
            this.landscape1 = landscape1;
            this.x3 = x3;
            this.y3 = y3;
            this.filename3 = filename3;

            js.append(String.format(Locale.US, jsBase + ".saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x3, y3, filename3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x3, y3, filename3));
                js.setLength(0);
            }
        }
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x3, Double y3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidthOrOptions = null;
            this.paperSizeOrWidthOrOptions1 = null;
            this.paperSizeOrWidthOrOptions2 = null;
            
            this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            
            this.x3 = x3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            
            this.y3 = y3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
            this.landscape1 = landscape1;
            this.x3 = x3;
            this.y3 = y3;
            this.filename3 = filename3;

            js.append(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x3, y3, filename3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x3, y3, filename3));
                js.setLength(0);
            }
        }
    }

    private Double width6;
    private String width7;
    private Double height7;
    private Double quality3;
    private String filename4;

    public void setSaveaspng(Double width6, Double height7, Double quality3, String filename4) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width6 = width6;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            
            this.height7 = height7;
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
            this.width6 = width6;
            this.height7 = height7;
            this.quality3 = quality3;
            this.filename4 = filename4;

            js.append(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s);", width6, height7, quality3, filename4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f, %s);", width6, height7, quality3, filename4));
                js.setLength(0);
            }
        }
    }


    public void setSaveaspng(String width7, Double height7, Double quality3, String filename4) {
        if (jsBase == null) {
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
            this.height6 = null;
            this.height7 = null;
            
            this.height7 = height7;
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
            this.width7 = width7;
            this.height7 = height7;
            this.quality3 = quality3;
            this.filename4 = filename4;

            js.append(String.format(Locale.US, jsBase + ".saveAsPng(%s, %f, %f, %s);", width7, height7, quality3, filename4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%s, %f, %f, %s);", width7, height7, quality3, filename4));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private String paperSize1;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            
            this.paperSize = paperSize;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            
            this.landscape2 = landscape2;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            this.filename4 = null;
            this.filename5 = null;
            
            this.filename5 = filename5;
        } else {
            this.paperSize = paperSize;
            this.landscape2 = landscape2;
            this.filename5 = filename5;

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));
                js.setLength(0);
            }
        }
    }

    private Double width8;
    private Double height8;

    public void setSaveassvg(Double width8, Double height8) {
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
            
            this.width8 = width8;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            
            this.height8 = height8;
        } else {
            this.width8 = width8;
            this.height8 = height8;

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width8, height8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width8, height8));
                js.setLength(0);
            }
        }
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
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

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));
                js.setLength(0);
            }
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
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

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));
                js.setLength(0);
            }
        }
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        if (jsBase == null) {
            this.includeTheme = null;
            this.includeTheme1 = null;
            
            this.includeTheme1 = includeTheme1;
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
            this.includeTheme1 = includeTheme1;
            this.filename7 = filename7;

            js.append(String.format(Locale.US, jsBase + ".saveAsXml(%b, %s);", includeTheme1, filename7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXml(%b, %s);", includeTheme1, filename7));
                js.setLength(0);
            }
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        if (jsBase == null) {
            this.selectMarqueeFill = selectMarqueeFill;
        } else {
            this.selectMarqueeFill = selectMarqueeFill;

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setSelectmarqueefill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f);", color, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setSelectmarqueefill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions4;
    private Boolean asBase;
    private Double width9;
    private Double height9;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename8;

    public void setShareasjpg(String onSuccessOrOptions4, Boolean asBase, Double width9, Double height9, Double quality4, Boolean forceTransparentWhite2, String filename8) {
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
            this.height8 = null;
            this.height9 = null;
            
            this.height9 = height9;
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
            this.width9 = width9;
            this.height9 = height9;
            this.quality4 = quality4;
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename8 = filename8;

            js.append(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %f, %f, %f, %b, %s);", onSuccessOrOptions4, asBase, width9, height9, quality4, forceTransparentWhite2, filename8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %b, %f, %f, %f, %b, %s);", onSuccessOrOptions4, asBase, width9, height9, quality4, forceTransparentWhite2, filename8));
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
    private Double x4;
    private Double y4;
    private String filename9;

    public void setShareaspdf(Double paperSizeOrWidth4, Double landscapeOrWidth2, String onSuccessOrOptions5, Boolean asBase1, Double x4, Double y4, String filename9) {
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
            this.x3 = null;
            this.x4 = null;
            
            this.x4 = x4;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            
            this.y4 = y4;
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
            this.x4 = x4;
            this.y4 = y4;
            this.filename9 = filename9;

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x4, y4, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x4, y4, filename9));
                js.setLength(0);
            }
        }
    }


    public void setShareaspdf(Double paperSizeOrWidth4, Boolean landscapeOrWidth3, String onSuccessOrOptions5, Boolean asBase1, Double x4, Double y4, String filename9) {
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
            this.x3 = null;
            this.x4 = null;
            
            this.x4 = x4;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            
            this.y4 = y4;
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
            this.x4 = x4;
            this.y4 = y4;
            this.filename9 = filename9;

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x4, y4, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth4, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x4, y4, filename9));
                js.setLength(0);
            }
        }
    }


    public void setShareaspdf(String paperSizeOrWidth5, Double landscapeOrWidth2, String onSuccessOrOptions5, Boolean asBase1, Double x4, Double y4, String filename9) {
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
            this.x3 = null;
            this.x4 = null;
            
            this.x4 = x4;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            
            this.y4 = y4;
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
            this.x4 = x4;
            this.y4 = y4;
            this.filename9 = filename9;

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x4, y4, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth2, onSuccessOrOptions5, asBase1, x4, y4, filename9));
                js.setLength(0);
            }
        }
    }


    public void setShareaspdf(String paperSizeOrWidth5, Boolean landscapeOrWidth3, String onSuccessOrOptions5, Boolean asBase1, Double x4, Double y4, String filename9) {
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
            this.x3 = null;
            this.x4 = null;
            
            this.x4 = x4;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            this.y4 = null;
            
            this.y4 = y4;
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
            this.x4 = x4;
            this.y4 = y4;
            this.filename9 = filename9;

            js.append(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x4, y4, filename9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %s, %b, %f, %f, %s);", paperSizeOrWidth5, landscapeOrWidth3, onSuccessOrOptions5, asBase1, x4, y4, filename9));
                js.setLength(0);
            }
        }
    }

    private String onSuccessOrOptions6;
    private Boolean asBase2;
    private Double width10;
    private Double height10;
    private Double quality5;
    private String filename10;

    public void setShareaspng(String onSuccessOrOptions6, Boolean asBase2, Double width10, Double height10, Double quality5, String filename10) {
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
            this.width9 = null;
            this.width10 = null;
            
            this.width10 = width10;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            
            this.height10 = height10;
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
            this.width10 = width10;
            this.height10 = height10;
            this.quality5 = quality5;
            this.filename10 = filename10;

            js.append(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %f, %f, %f, %s);", onSuccessOrOptions6, asBase2, width10, height10, quality5, filename10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%s, %b, %f, %f, %f, %s);", onSuccessOrOptions6, asBase2, width10, height10, quality5, filename10));
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

    public void setShareassvg(String paperSizeOrWidth6, Boolean landscapeOrHeight2, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


    public void setShareassvg(String paperSizeOrWidth6, String landscapeOrHeight3, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %b, %s);", paperSizeOrWidth6, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


    public void setShareassvg(Double paperSizeOrWidth7, Boolean landscapeOrHeight2, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight2, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }


    public void setShareassvg(Double paperSizeOrWidth7, String landscapeOrHeight3, String onSuccessOrOptions7, Boolean asBase3, String filename11) {
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

            js.append(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %s, %b, %s);", paperSizeOrWidth7, landscapeOrHeight3, onSuccessOrOptions7, asBase3, filename11));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions;
    private String captionOrOptions1;
    private String link;
    private String name;
    private String description;

    public void setSharewithfacebook(String captionOrOptions, String link, String name, String description) {
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

            js.append(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", captionOrOptions, link, name, description));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", captionOrOptions, link, name, description));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions2;
    private String captionOrOptions3;
    private String description1;

    public void setSharewithlinkedin(String captionOrOptions2, String description1) {
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

            js.append(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", captionOrOptions2, description1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", captionOrOptions2, description1));
                js.setLength(0);
            }
        }
    }

    private String linkOrOptions;
    private String linkOrOptions1;
    private String description2;

    public void setSharewithpinterest(String linkOrOptions, String description2) {
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

            js.append(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", linkOrOptions, description2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", linkOrOptions, description2));
                js.setLength(0);
            }
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        if (jsBase == null) {
            this.repeat = repeat;
        } else {
            this.repeat = repeat;

            js.append(String.format(Locale.US, jsBase + ".startSelectMarquee(%b);", repeat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSelectMarquee(%b);", repeat));
                js.setLength(0);
            }
        }
    }

    private UiTitle gettitle;

    public UiTitle getTitle() {
        if (gettitle == null)
            gettitle = new UiTitle(jsBase + ".title()");

        return gettitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%b);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
    }


    public void setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title1));
                js.setLength(0);
            }
        }
    }

    private String title3;
    private Boolean asString;

    public void setToa11Ytable(String title3, Boolean asString) {
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

            js.append(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b);", title3, asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toA11yTable(%s, %b);", title3, asString));
                js.setLength(0);
            }
        }
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings1;

    public void setTocsv(String chartDataExportMode4, String csvSettings1) {
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

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", chartDataExportMode4, csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", chartDataExportMode4, csvSettings1));
                js.setLength(0);
            }
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings1) {
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

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings1));
                js.setLength(0);
            }
        }
    }

    private String title4;
    private Boolean asString1;

    public void setTohtmltable(String title4, Boolean asString1) {
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

            js.append(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b);", title4, asString1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %b);", title4, asString1));
                js.setLength(0);
            }
        }
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        if (jsBase == null) {
            this.stringify = stringify;
            this.includeTheme = null;
            this.includeTheme1 = null;
            this.includeTheme2 = null;
            
            this.includeTheme2 = includeTheme2;
        } else {
            this.stringify = stringify;
            this.includeTheme2 = includeTheme2;

            js.append(String.format(Locale.US, jsBase + ".toJson(%b, %b);", stringify, includeTheme2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b, %b);", stringify, includeTheme2));
                js.setLength(0);
            }
        }
    }

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape3;

    public void setTosvg(String paperSize2, Boolean landscape3) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            this.paperSize2 = null;
            this.paperSize3 = null;
            
            this.paperSize2 = paperSize2;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            this.landscape3 = null;
            
            this.landscape3 = landscape3;
        } else {
            this.paperSize2 = paperSize2;
            this.landscape3 = landscape3;

            js.append(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", paperSize2, landscape3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", paperSize2, landscape3));
                js.setLength(0);
            }
        }
    }

    private Double width11;
    private Double height11;

    public void setTosvg(Double width11, Double height11) {
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
            this.width10 = null;
            this.width11 = null;
            
            this.width11 = width11;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            this.height8 = null;
            this.height9 = null;
            this.height10 = null;
            this.height11 = null;
            
            this.height11 = height11;
        } else {
            this.width11 = width11;
            this.height11 = height11;

            js.append(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width11, height11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width11, height11));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
            this.includeTheme = null;
            this.includeTheme1 = null;
            this.includeTheme2 = null;
            this.includeTheme3 = null;
            
            this.includeTheme3 = includeTheme3;
        } else {
            this.asXmlNode = asXmlNode;
            this.includeTheme3 = includeTheme3;

            js.append(String.format(Locale.US, jsBase + ".toXml(%b, %b);", asXmlNode, includeTheme3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b, %b);", asXmlNode, includeTheme3));
                js.setLength(0);
            }
        }
    }

    private Tooltip gettooltip;

    public Tooltip getTooltip() {
        if (gettooltip == null)
            gettooltip = new Tooltip(jsBase + ".tooltip()");

        return gettooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));
                js.setLength(0);
            }
        }
    }


    public void setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;

            js.append(String.format(Locale.US, jsBase + ".top(%f);", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%f);", top));
                js.setLength(0);
            }
        }
    }


    public void setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;

            js.append(String.format(Locale.US, jsBase + ".top(%s);", top1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%s);", top1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key2;

    public void setUnlistenbykey(String key2) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            this.key2 = null;
            
            this.key2 = key2;
        } else {
            this.key2 = key2;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key2));
                js.setLength(0);
            }
        }
    }

    private Double width12;
    private String width13;

    public void setWidth(Double width12) {
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
            this.width10 = null;
            this.width11 = null;
            this.width12 = null;
            this.width13 = null;
            
            this.width12 = width12;
        } else {
            this.width12 = width12;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width12));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width13) {
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
            this.width10 = null;
            this.width11 = null;
            this.width12 = null;
            this.width13 = null;
            
            this.width13 = width13;
        } else {
            this.width13 = width13;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width13));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgeta11y() {
        if (geta11y != null) {
            return geta11y.generateJs();
        }
        return "";
    }

    private String generateJSgetanimation() {
        if (getanimation != null) {
            return getanimation.generateJs();
        }
        return "";
    }

    private String generateJSgetbackground() {
        if (getbackground != null) {
            return getbackground.generateJs();
        }
        return "";
    }

    private String generateJSgetbounds() {
        if (getbounds != null) {
            return getbounds.generateJs();
        }
        return "";
    }

    private String generateJSgetcontainer() {
        if (getcontainer != null) {
            return getcontainer.generateJs();
        }
        return "";
    }

    private String generateJSgetcontextMenu() {
        if (getcontextMenu != null) {
            return getcontextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetmargin() {
        if (getmargin != null) {
            return getmargin.generateJs();
        }
        return "";
    }

    private String generateJSgetpadding() {
        if (getpadding != null) {
            return getpadding.generateJs();
        }
        return "";
    }

    private String generateJSgettitle() {
        if (gettitle != null) {
            return gettitle.generateJs();
        }
        return "";
    }

    private String generateJSgettooltip() {
        if (gettooltip != null) {
            return gettooltip.generateJs();
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

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds1() {
        if (bounds1 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds1 != null) ? bounds1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds2() {
        if (bounds2 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds2 != null) ? bounds2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %s,", x1);
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

    private String generateJSenabled1() {
        if (enabled1 != null) {
            return String.format(Locale.US, "enabled: %b,", enabled1);
        }
        return "";
    }

    private String generateJSonSuccessOrOptions() {
        if (onSuccessOrOptions != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
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

    private String generateJSonSuccessOrOptions2() {
        if (onSuccessOrOptions2 != null) {
            return String.format(Locale.US, "onSuccessOrOptions: %s,", onSuccessOrOptions2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %f,", width3);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %f,", height3);
        }
        return "";
    }

    private String generateJSquality1() {
        if (quality1 != null) {
            return String.format(Locale.US, "quality: %f,", quality1);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
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

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
        }
        return "";
    }

    private String generateJSheight5() {
        if (height5 != null) {
            return String.format(Locale.US, "height: %s,", height5);
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

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %s,", index2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
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

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
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

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJSchartDataExportMode() {
        if (chartDataExportMode != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode);
        }
        return "";
    }

    private String generateJSchartDataExportMode1() {
        if (chartDataExportMode1 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null");
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

    private String generateJSheight6() {
        if (height6 != null) {
            return String.format(Locale.US, "height: %f,", height6);
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

    private String generateJSincludeTheme() {
        if (includeTheme != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme);
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

    private String generateJSlandscape1() {
        if (landscape1 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape1);
        }
        return "";
    }

    private String generateJSx3() {
        if (x3 != null) {
            return String.format(Locale.US, "x: %f,", x3);
        }
        return "";
    }

    private String generateJSy3() {
        if (y3 != null) {
            return String.format(Locale.US, "y: %f,", y3);
        }
        return "";
    }

    private String generateJSfilename3() {
        if (filename3 != null) {
            return String.format(Locale.US, "filename: %s,", filename3);
        }
        return "";
    }

    private String generateJSwidth6() {
        if (width6 != null) {
            return String.format(Locale.US, "width: %f,", width6);
        }
        return "";
    }

    private String generateJSwidth7() {
        if (width7 != null) {
            return String.format(Locale.US, "width: %s,", width7);
        }
        return "";
    }

    private String generateJSheight7() {
        if (height7 != null) {
            return String.format(Locale.US, "height: %f,", height7);
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

    private String generateJSlandscape2() {
        if (landscape2 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape2);
        }
        return "";
    }

    private String generateJSfilename5() {
        if (filename5 != null) {
            return String.format(Locale.US, "filename: %s,", filename5);
        }
        return "";
    }

    private String generateJSwidth8() {
        if (width8 != null) {
            return String.format(Locale.US, "width: %f,", width8);
        }
        return "";
    }

    private String generateJSheight8() {
        if (height8 != null) {
            return String.format(Locale.US, "height: %f,", height8);
        }
        return "";
    }

    private String generateJSchartDataExportMode2() {
        if (chartDataExportMode2 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode2);
        }
        return "";
    }

    private String generateJSchartDataExportMode3() {
        if (chartDataExportMode3 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfilename6() {
        if (filename6 != null) {
            return String.format(Locale.US, "filename: %s,", filename6);
        }
        return "";
    }

    private String generateJSincludeTheme1() {
        if (includeTheme1 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme1);
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

    private String generateJSwidth9() {
        if (width9 != null) {
            return String.format(Locale.US, "width: %f,", width9);
        }
        return "";
    }

    private String generateJSheight9() {
        if (height9 != null) {
            return String.format(Locale.US, "height: %f,", height9);
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

    private String generateJSx4() {
        if (x4 != null) {
            return String.format(Locale.US, "x: %f,", x4);
        }
        return "";
    }

    private String generateJSy4() {
        if (y4 != null) {
            return String.format(Locale.US, "y: %f,", y4);
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

    private String generateJSwidth10() {
        if (width10 != null) {
            return String.format(Locale.US, "width: %f,", width10);
        }
        return "";
    }

    private String generateJSheight10() {
        if (height10 != null) {
            return String.format(Locale.US, "height: %f,", height10);
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
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode4);
        }
        return "";
    }

    private String generateJSchartDataExportMode5() {
        if (chartDataExportMode5 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null");
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

    private String generateJSincludeTheme2() {
        if (includeTheme2 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme2);
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

    private String generateJSlandscape3() {
        if (landscape3 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape3);
        }
        return "";
    }

    private String generateJSwidth11() {
        if (width11 != null) {
            return String.format(Locale.US, "width: %f,", width11);
        }
        return "";
    }

    private String generateJSheight11() {
        if (height11 != null) {
            return String.format(Locale.US, "height: %f,", height11);
        }
        return "";
    }

    private String generateJSasXmlNode() {
        if (asXmlNode != null) {
            return String.format(Locale.US, "asXmlNode: %b,", asXmlNode);
        }
        return "";
    }

    private String generateJSincludeTheme3() {
        if (includeTheme3 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme3);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey2() {
        if (key2 != null) {
            return String.format(Locale.US, "key: %s,", key2);
        }
        return "";
    }

    private String generateJSwidth12() {
        if (width12 != null) {
            return String.format(Locale.US, "width: %f,", width12);
        }
        return "";
    }

    private String generateJSwidth13() {
        if (width13 != null) {
            return String.format(Locale.US, "width: %s,", width13);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSay());
            js.append(generateJSay1());
            js.append(generateJSanimation());
            js.append(generateJSanimation1());
            js.append(generateJSenabled());
            js.append(generateJSduration());
            js.append(generateJSbackground());
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSbounds());
            js.append(generateJSbounds1());
            js.append(generateJSbounds2());
            js.append(generateJSx());
            js.append(generateJSx1());
            js.append(generateJSy());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJScontainer());
            js.append(generateJScontainer1());
            js.append(generateJScontainer2());
            js.append(generateJScontainer3());
            js.append(generateJScontextMenu());
            js.append(generateJScontextMenu1());
            js.append(generateJSasync());
            js.append(generateJSenabled1());
            js.append(generateJSonSuccessOrOptions());
            js.append(generateJSwidth2());
            js.append(generateJSheight2());
            js.append(generateJSquality());
            js.append(generateJSforceTransparentWhite());
            js.append(generateJSonSuccessOrOptions1());
            js.append(generateJSpaperSizeOrWidth());
            js.append(generateJSpaperSizeOrWidth1());
            js.append(generateJSlandscapeOrWidth());
            js.append(generateJSlandscapeOrWidth1());
            js.append(generateJSx2());
            js.append(generateJSy2());
            js.append(generateJSonSuccessOrOptions2());
            js.append(generateJSwidth3());
            js.append(generateJSheight3());
            js.append(generateJSquality1());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJSonSuccessOrOptions3());
            js.append(generateJSpaperSizeOrWidth2());
            js.append(generateJSpaperSizeOrWidth3());
            js.append(generateJSlandscapeOrHeight());
            js.append(generateJSlandscapeOrHeight1());
            js.append(generateJSxCoord());
            js.append(generateJSyCoord());
            js.append(generateJSheight4());
            js.append(generateJSheight5());
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJSlabel());
            js.append(generateJSlabel1());
            js.append(generateJSlabel2());
            js.append(generateJSindex2());
            js.append(generateJSindex3());
            js.append(generateJSlabel3());
            js.append(generateJSlabel4());
            js.append(generateJSlabel5());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
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
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSminHeight());
            js.append(generateJSminHeight1());
            js.append(generateJSminWidth());
            js.append(generateJSminWidth1());
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
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSchartDataExportMode());
            js.append(generateJSchartDataExportMode1());
            js.append(generateJScsvSettings());
            js.append(generateJSfilename());
            js.append(generateJSwidth4());
            js.append(generateJSwidth5());
            js.append(generateJSheight6());
            js.append(generateJSquality2());
            js.append(generateJSforceTransparentWhite1());
            js.append(generateJSfilename1());
            js.append(generateJSincludeTheme());
            js.append(generateJSfilename2());
            js.append(generateJSpaperSizeOrWidthOrOptions());
            js.append(generateJSpaperSizeOrWidthOrOptions1());
            js.append(generateJSpaperSizeOrWidthOrOptions2());
            js.append(generateJSlandscape1());
            js.append(generateJSx3());
            js.append(generateJSy3());
            js.append(generateJSfilename3());
            js.append(generateJSwidth6());
            js.append(generateJSwidth7());
            js.append(generateJSheight7());
            js.append(generateJSquality3());
            js.append(generateJSfilename4());
            js.append(generateJSpaperSize());
            js.append(generateJSpaperSize1());
            js.append(generateJSlandscape2());
            js.append(generateJSfilename5());
            js.append(generateJSwidth8());
            js.append(generateJSheight8());
            js.append(generateJSchartDataExportMode2());
            js.append(generateJSchartDataExportMode3());
            js.append(generateJSfilename6());
            js.append(generateJSincludeTheme1());
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
            js.append(generateJSwidth9());
            js.append(generateJSheight9());
            js.append(generateJSquality4());
            js.append(generateJSforceTransparentWhite2());
            js.append(generateJSfilename8());
            js.append(generateJSonSuccessOrOptions5());
            js.append(generateJSasBase1());
            js.append(generateJSpaperSizeOrWidth4());
            js.append(generateJSpaperSizeOrWidth5());
            js.append(generateJSlandscapeOrWidth2());
            js.append(generateJSlandscapeOrWidth3());
            js.append(generateJSx4());
            js.append(generateJSy4());
            js.append(generateJSfilename9());
            js.append(generateJSonSuccessOrOptions6());
            js.append(generateJSasBase2());
            js.append(generateJSwidth10());
            js.append(generateJSheight10());
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
            js.append(generateJSincludeTheme2());
            js.append(generateJSpaperSize2());
            js.append(generateJSpaperSize3());
            js.append(generateJSlandscape3());
            js.append(generateJSwidth11());
            js.append(generateJSheight11());
            js.append(generateJSasXmlNode());
            js.append(generateJSincludeTheme3());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey2());
            js.append(generateJSwidth12());
            js.append(generateJSwidth13());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgeta11y());
            js.append(generateJSgetanimation());
            js.append(generateJSgetbackground());
            js.append(generateJSgetbounds());
            js.append(generateJSgetcontainer());
            js.append(generateJSgetcontextMenu());
            js.append(generateJSgetmargin());
            js.append(generateJSgetpadding());
            js.append(generateJSgettitle());
            js.append(generateJSgettooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
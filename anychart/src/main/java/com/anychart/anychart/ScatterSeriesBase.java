package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ScatterSeriesBase extends JsObject {

    private String jsBase;

    public ScatterSeriesBase() {

    }

    protected ScatterSeriesBase(String jsBase) {
        this.jsBase = jsBase;
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

    private Bounds getBounds;

    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds(jsBase + ".bounds()");

        return getBounds;
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

    private AnychartMathRect getClip;

    public AnychartMathRect getClip() {
        if (getClip == null)
            getClip = new AnychartMathRect(jsBase + ".clip()");

        return getClip;
    }

    private Boolean clip;
    private AnychartMathRect clip1;

    public void setClip(Boolean clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;

            js.append(String.format(Locale.US, jsBase + ".clip(%b);", clip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%b);", clip));
                js.setLength(0);
            }
        }
    }


    public void setClip(AnychartMathRect clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;

            js.append(String.format(Locale.US, jsBase + ".clip(%s);", (clip1 != null) ? clip1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", (clip1 != null) ? clip1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private Error getError;

    public Error getError() {
        if (getError == null)
            getError = new Error(jsBase + ".error()");

        return getError;
    }

    private String error;
    private Boolean error1;
    private String error2;
    private Double error3;

    public void setError(String error) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error = error;
        } else {
            this.error = error;

            js.append(String.format(Locale.US, jsBase + ".error(%s);", error));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%s);", error));
                js.setLength(0);
            }
        }
    }


    public void setError(Boolean error1) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error1 = error1;
        } else {
            this.error1 = error1;

            js.append(String.format(Locale.US, jsBase + ".error(%b);", error1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%b);", error1));
                js.setLength(0);
            }
        }
    }


    public void setError(Double error3) {
        if (jsBase == null) {
            this.error = null;
            this.error1 = null;
            this.error2 = null;
            this.error3 = null;
            
            this.error3 = error3;
        } else {
            this.error3 = error3;

            js.append(String.format(Locale.US, jsBase + ".error(%f);", error3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".error(%f);", error3));
                js.setLength(0);
            }
        }
    }

    private Double indexes;
    private Double[] indexes1;

    public void setExcludepoint(Double indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));
                js.setLength(0);
            }
        }
    }


    public void setExcludepoint(Double[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setGetpoint(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".getPoint(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPoint(%f);", index));
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

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height2 = height2;
        } else {
            this.height2 = height2;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height2));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height3));
                js.setLength(0);
            }
        }
    }

    private String id;
    private Double id1;

    public void setId(String id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;

            js.append(String.format(Locale.US, jsBase + ".id(%s);", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", id));
                js.setLength(0);
            }
        }
    }


    public void setId(Double id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;

            js.append(String.format(Locale.US, jsBase + ".id(%f);", id1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%f);", id1));
                js.setLength(0);
            }
        }
    }

    private Double indexes2;
    private Double[] indexes3;

    public void setIncludepoint(Double indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;

            js.append(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));
                js.setLength(0);
            }
        }
    }


    public void setIncludepoint(Double[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;

            js.append(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Double indexes4;
    private Double[] indexes5;

    public void setKeeponlypoints(Double indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));
                js.setLength(0);
            }
        }
    }


    public void setKeeponlypoints(Double[] indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
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

    private Double index1;

    public void setSelect(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".select(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private Double indexes6;
    private Double[] indexes7;

    public void setSelect(Double[] indexes7) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            this.indexes7 = null;
            
            this.indexes7 = indexes7;
        } else {
            this.indexes7 = indexes7;

            js.append(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes7)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes7)));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getSelectLabels;

    public UiLabelsFactory getSelectLabels() {
        if (getSelectLabels == null)
            getSelectLabels = new UiLabelsFactory(jsBase + ".selectLabels()");

        return getSelectLabels;
    }

    private String selectLabels;
    private Boolean selectLabels1;

    public void setSelectlabels(String selectLabels) {
        if (jsBase == null) {
            this.selectLabels = null;
            this.selectLabels1 = null;
            
            this.selectLabels = selectLabels;
        } else {
            this.selectLabels = selectLabels;

            js.append(String.format(Locale.US, jsBase + ".selectLabels(%s);", selectLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabels(%s);", selectLabels));
                js.setLength(0);
            }
        }
    }


    public void setSelectlabels(Boolean selectLabels1) {
        if (jsBase == null) {
            this.selectLabels = null;
            this.selectLabels1 = null;
            
            this.selectLabels1 = selectLabels1;
        } else {
            this.selectLabels1 = selectLabels1;

            js.append(String.format(Locale.US, jsBase + ".selectLabels(%b);", selectLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabels(%b);", selectLabels1));
                js.setLength(0);
            }
        }
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public void setSelectionmode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;

            js.append(String.format(Locale.US, jsBase + ".selectionMode(%s);", (selectionMode != null) ? selectionMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", (selectionMode != null) ? selectionMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectionmode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;

            js.append(String.format(Locale.US, jsBase + ".selectionMode(%s);", selectionMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", selectionMode1));
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

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    public void setUnhover(Double indexOrIndexes) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes = indexOrIndexes;
        } else {
            this.indexOrIndexes = indexOrIndexes;

            js.append(String.format(Locale.US, jsBase + ".unhover(%f);", indexOrIndexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%f);", indexOrIndexes));
                js.setLength(0);
            }
        }
    }


    public void setUnhover(Double[] indexOrIndexes1) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes1 = indexOrIndexes1;
        } else {
            this.indexOrIndexes1 = indexOrIndexes1;

            js.append(String.format(Locale.US, jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));
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

    private Double index2;

    public void setUnselect(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

            js.append(String.format(Locale.US, jsBase + ".unselect(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f);", index2));
                js.setLength(0);
            }
        }
    }

    private Double[] indexes8;

    public void setUnselect(Double[] indexes8) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            this.indexes7 = null;
            this.indexes8 = null;
            
            this.indexes8 = indexes8;
        } else {
            this.indexes8 = indexes8;

            js.append(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes8)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes8)));
                js.setLength(0);
            }
        }
    }

    private Double width2;
    private String width3;

    public void setWidth(Double width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width2));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width3));
                js.setLength(0);
            }
        }
    }

    private ScatterBase getXScale;

    public ScatterBase getXScale() {
        if (getXScale == null)
            getXScale = new ScatterBase(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesBase xScale;

    public void setXscale(ScalesBase xScale) {
        if (jsBase == null) {
            this.xScale = xScale;
        } else {
            this.xScale = xScale;

            js.append(String.format(Locale.US, jsBase + ".xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private ScatterBase getYScale;

    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;

    public void setYscale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = yScale;
        } else {
            this.yScale = yScale;

            js.append(String.format(Locale.US, jsBase + ".yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));
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

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetError() {
        if (getError != null) {
            return getError.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLabels() {
        if (getSelectLabels != null) {
            return getSelectLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
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

    private String generateJSclip() {
        if (clip != null) {
            return String.format(Locale.US, "clip: %b,", clip);
        }
        return "";
    }

    private String generateJSclip1() {
        if (clip1 != null) {
            return String.format(Locale.US, "clip: %s,", (clip1 != null) ? clip1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSerror() {
        if (error != null) {
            return String.format(Locale.US, "error: %s,", error);
        }
        return "";
    }

    private String generateJSerror1() {
        if (error1 != null) {
            return String.format(Locale.US, "error: %b,", error1);
        }
        return "";
    }

    private String generateJSerror2() {
        if (error2 != null) {
            return String.format(Locale.US, "error: %s,", error2);
        }
        return "";
    }

    private String generateJSerror3() {
        if (error3 != null) {
            return String.format(Locale.US, "error: %f,", error3);
        }
        return "";
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %f,", indexes);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes1));
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %s,", id);
        }
        return "";
    }

    private String generateJSid1() {
        if (id1 != null) {
            return String.format(Locale.US, "id: %f,", id1);
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes2);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes3));
        }
        return "";
    }

    private String generateJSindexes4() {
        if (indexes4 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes4);
        }
        return "";
    }

    private String generateJSindexes5() {
        if (indexes5 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes5));
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

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSindexes6() {
        if (indexes6 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes6);
        }
        return "";
    }

    private String generateJSindexes7() {
        if (indexes7 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes7));
        }
        return "";
    }

    private String generateJSselectLabels() {
        if (selectLabels != null) {
            return String.format(Locale.US, "selectLabels: %s,", selectLabels);
        }
        return "";
    }

    private String generateJSselectLabels1() {
        if (selectLabels1 != null) {
            return String.format(Locale.US, "selectLabels: %b,", selectLabels1);
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: %s,", selectionMode1);
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

    private String generateJSindexOrIndexes() {
        if (indexOrIndexes != null) {
            return String.format(Locale.US, "indexOrIndexes: %f,", indexOrIndexes);
        }
        return "";
    }

    private String generateJSindexOrIndexes1() {
        if (indexOrIndexes1 != null) {
            return String.format(Locale.US, "indexOrIndexes: %s,", Arrays.toString(indexOrIndexes1));
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

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSindexes8() {
        if (indexes8 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes8));
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

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
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
            js.append(generateJSclip());
            js.append(generateJSclip1());
            js.append(generateJSenabled());
            js.append(generateJSerror());
            js.append(generateJSerror1());
            js.append(generateJSerror2());
            js.append(generateJSerror3());
            js.append(generateJSindexes());
            js.append(generateJSindexes1());
            js.append(generateJSindex());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJSheight2());
            js.append(generateJSheight3());
            js.append(generateJSid());
            js.append(generateJSid1());
            js.append(generateJSindexes2());
            js.append(generateJSindexes3());
            js.append(generateJSindexes4());
            js.append(generateJSindexes5());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSminHeight());
            js.append(generateJSminHeight1());
            js.append(generateJSminWidth());
            js.append(generateJSminWidth1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSindex1());
            js.append(generateJSindexes6());
            js.append(generateJSindexes7());
            js.append(generateJSselectLabels());
            js.append(generateJSselectLabels1());
            js.append(generateJSselectionMode());
            js.append(generateJSselectionMode1());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJSindexOrIndexes());
            js.append(generateJSindexOrIndexes1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey2());
            js.append(generateJSindex2());
            js.append(generateJSindexes8());
            js.append(generateJSwidth2());
            js.append(generateJSwidth3());
            js.append(generateJSxScale());
            js.append(generateJSyScale());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetBounds());
            js.append(generateJSgetClip());
            js.append(generateJSgetError());
            js.append(generateJSgetSelectLabels());
            js.append(generateJSgetXScale());
            js.append(generateJSgetYScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
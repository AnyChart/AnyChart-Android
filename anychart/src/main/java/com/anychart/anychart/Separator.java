package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Separator extends JsObject {

    private String jsBase;

    public Separator() {

    }

    protected Separator(String jsBase) {
        this.jsBase = jsBase;
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

    private Fill fillOrColorOrKeys;
    private GradientKey[] fillOrColorOrKeys1;
    private String[] fillOrColorOrKeys2;
    private Double opacityOrAngleOrCx;
    private Double modeOrCy;
    private Boolean modeOrCy1;
    private GraphicsMathRect modeOrCy2;
    private String modeOrCy3;
    private Double opacityOrMode;
    private GraphicsMathRect opacityOrMode1;
    private String opacityOrMode2;
    private Double opacity;
    private Double fx;
    private Double fy;

    public void setFill(Fill fillOrColorOrKeys, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys = fillOrColorOrKeys;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy = modeOrCy;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = modeOrCy;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy1 = modeOrCy1;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy2 = modeOrCy2;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = opacityOrMode;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, String modeOrCy3, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode1 = opacityOrMode1;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys2, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
            this.modeOrCy3 = modeOrCy3;
            this.opacityOrMode2 = opacityOrMode2;
            this.opacityOrAngleOrCx = opacityOrAngleOrCx;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Double height;
    private String height1;

    public void setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height1));
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

    private String spaceOrTopOrTopAndBottom;
    private Double spaceOrTopOrTopAndBottom1;
    private Double[] spaceOrTopOrTopAndBottom2;
    private String[] spaceOrTopOrTopAndBottom3;
    private String spaceOrTopOrTopAndBottom4;
    private String rightOrRightAndLeft;
    private Double rightOrRightAndLeft1;
    private String bottom;
    private Double bottom1;
    private String left;
    private Double left1;

    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom2), rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = rightOrRightAndLeft;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft, bottom1, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = bottom;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom, left1));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, String left) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft = null;
            this.rightOrRightAndLeft1 = null;
            
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", Arrays.toString(spaceOrTopOrTopAndBottom3), rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
    }

    private Orientation orientation;
    private String orientation1;

    public void setOrientation(Orientation orientation) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation = orientation;
        } else {
            this.orientation = orientation;

            js.append(String.format(Locale.US, jsBase + ".orientation(%s);", (orientation != null) ? orientation.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".orientation(%s);", (orientation != null) ? orientation.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setOrientation(String orientation1) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation1 = orientation1;
        } else {
            this.orientation1 = orientation1;

            js.append(String.format(Locale.US, jsBase + ".orientation(%s);", orientation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".orientation(%s);", orientation1));
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

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke strokeOrFill, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill strokeOrFill1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String strokeOrFill2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
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

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
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

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys() {
        if (fillOrColorOrKeys != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys1() {
        if (fillOrColorOrKeys1 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys1));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys2() {
        if (fillOrColorOrKeys2 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys2));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx() {
        if (opacityOrAngleOrCx != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx);
        }
        return "";
    }

    private String generateJSmodeOrCy() {
        if (modeOrCy != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy);
        }
        return "";
    }

    private String generateJSmodeOrCy1() {
        if (modeOrCy1 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy1);
        }
        return "";
    }

    private String generateJSmodeOrCy2() {
        if (modeOrCy2 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmodeOrCy3() {
        if (modeOrCy3 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", modeOrCy3);
        }
        return "";
    }

    private String generateJSopacityOrMode() {
        if (opacityOrMode != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode);
        }
        return "";
    }

    private String generateJSopacityOrMode1() {
        if (opacityOrMode1 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode2() {
        if (opacityOrMode2 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", opacityOrMode2);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
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

    private String generateJSspaceOrTopOrTopAndBottom() {
        if (spaceOrTopOrTopAndBottom != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom1() {
        if (spaceOrTopOrTopAndBottom1 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom1);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom2() {
        if (spaceOrTopOrTopAndBottom2 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom2));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom3() {
        if (spaceOrTopOrTopAndBottom3 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom3));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom4() {
        if (spaceOrTopOrTopAndBottom4 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom4);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft() {
        if (rightOrRightAndLeft != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %s,", rightOrRightAndLeft);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft1() {
        if (rightOrRightAndLeft1 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %f,", rightOrRightAndLeft1);
        }
        return "";
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %s,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %f,", bottom1);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %s,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %f,", left1);
        }
        return "";
    }

    private String generateJSorientation() {
        if (orientation != null) {
            return String.format(Locale.US, "orientation: %s,", (orientation != null) ? orientation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSorientation1() {
        if (orientation1 != null) {
            return String.format(Locale.US, "orientation: %s,", orientation1);
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

    private String generateJSstrokeOrFill() {
        if (strokeOrFill != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill1() {
        if (strokeOrFill1 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill2() {
        if (strokeOrFill2 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill2);
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

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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
            js.append(generateJSenabled());
            js.append(generateJSfillOrColorOrKeys());
            js.append(generateJSfillOrColorOrKeys1());
            js.append(generateJSfillOrColorOrKeys2());
            js.append(generateJSopacityOrAngleOrCx());
            js.append(generateJSmodeOrCy());
            js.append(generateJSmodeOrCy1());
            js.append(generateJSmodeOrCy2());
            js.append(generateJSmodeOrCy3());
            js.append(generateJSopacityOrMode());
            js.append(generateJSopacityOrMode1());
            js.append(generateJSopacityOrMode2());
            js.append(generateJSopacity());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSspaceOrTopOrTopAndBottom());
            js.append(generateJSspaceOrTopOrTopAndBottom1());
            js.append(generateJSspaceOrTopOrTopAndBottom2());
            js.append(generateJSspaceOrTopOrTopAndBottom3());
            js.append(generateJSspaceOrTopOrTopAndBottom4());
            js.append(generateJSrightOrRightAndLeft());
            js.append(generateJSrightOrRightAndLeft1());
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSorientation());
            js.append(generateJSorientation1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSstrokeOrFill());
            js.append(generateJSstrokeOrFill1());
            js.append(generateJSstrokeOrFill2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
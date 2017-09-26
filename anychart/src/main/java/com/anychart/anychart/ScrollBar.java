package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ScrollBar extends JsObject {

    private String jsBase;

    public ScrollBar() {

    }

    protected ScrollBar(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Fill fillOrColorOrKeys;
    private GradientKey[] fillOrColorOrKeys1;
    private String[] fillOrColorOrKeys2;
    private Double opacityOrAngleOrCx;
    private Double modeOrCy;
    private Boolean modeOrCy1;
    private AnychartMathRect modeOrCy2;
    private String modeOrCy3;
    private Double opacityOrMode;
    private AnychartMathRect opacityOrMode1;
    private String opacityOrMode2;
    private Double opacity;
    private Double fx;
    private Double fy;

    public void setBackgroundfill(Fill fillOrColorOrKeys, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(Fill fillOrColorOrKeys, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundfill(String[] fillOrColorOrKeys2, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setBackgroundstroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundstroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBackgroundstroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", stroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".backgroundStroke(%s, %f, %s, %s, %s);", stroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double barSize;

    public void setBarsize(Double barSize) {
        if (jsBase == null) {
            this.barSize = barSize;
        } else {
            this.barSize = barSize;

            js.append(String.format(Locale.US, jsBase + ".barSize(%f);", barSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".barSize(%f);", barSize));
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

    private Boolean buttonsVisible;

    public void setButtonsvisible(Boolean buttonsVisible) {
        if (jsBase == null) {
            this.buttonsVisible = buttonsVisible;
        } else {
            this.buttonsVisible = buttonsVisible;

            js.append(String.format(Locale.US, jsBase + ".buttonsVisible(%b);", buttonsVisible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".buttonsVisible(%b);", buttonsVisible));
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

    private Double mouseOutOpacity;

    public void setMouseoutopacity(Double mouseOutOpacity) {
        if (jsBase == null) {
            this.mouseOutOpacity = mouseOutOpacity;
        } else {
            this.mouseOutOpacity = mouseOutOpacity;

            js.append(String.format(Locale.US, jsBase + ".mouseOutOpacity(%f);", mouseOutOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mouseOutOpacity(%f);", mouseOutOpacity));
                js.setLength(0);
            }
        }
    }

    private Double mouseOverOpacity;

    public void setMouseoveropacity(Double mouseOverOpacity) {
        if (jsBase == null) {
            this.mouseOverOpacity = mouseOverOpacity;
        } else {
            this.mouseOverOpacity = mouseOverOpacity;

            js.append(String.format(Locale.US, jsBase + ".mouseOverOpacity(%f);", mouseOverOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mouseOverOpacity(%f);", mouseOverOpacity));
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

    private Fill fillOrColorOrKeys3;
    private GradientKey[] fillOrColorOrKeys4;
    private String[] fillOrColorOrKeys5;
    private Double opacityOrAngleOrCx1;
    private Double modeOrCy4;
    private Boolean modeOrCy5;
    private AnychartMathRect modeOrCy6;
    private String modeOrCy7;
    private Double opacityOrMode3;
    private AnychartMathRect opacityOrMode4;
    private String opacityOrMode5;
    private Double opacity1;
    private Double fx1;
    private Double fy1;

    public void setSliderfill(Fill fillOrColorOrKeys3, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(Fill fillOrColorOrKeys3, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys3 = fillOrColorOrKeys3;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys4 = fillOrColorOrKeys4;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy4 = modeOrCy4;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy5 = modeOrCy5;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy6 = modeOrCy6;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode3 = opacityOrMode3;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode4 = opacityOrMode4;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setSliderfill(String[] fillOrColorOrKeys5, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.fillOrColorOrKeys5 = fillOrColorOrKeys5;
            this.modeOrCy7 = modeOrCy7;
            this.opacityOrMode5 = opacityOrMode5;
            this.opacityOrAngleOrCx1 = opacityOrAngleOrCx1;
            this.opacity1 = opacity1;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke3;
    private ColoredFill stroke4;
    private String stroke5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setSliderstroke(Stroke stroke3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke3 = stroke3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke3 = stroke3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSliderstroke(ColoredFill stroke4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke4 = stroke4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke4 = stroke4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", (stroke4 != null) ? stroke4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", (stroke4 != null) ? stroke4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSliderstroke(String stroke5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            this.stroke5 = null;
            
            this.stroke5 = stroke5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke5 = stroke5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", stroke5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sliderStroke(%s, %f, %s, %s, %s);", stroke5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
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

    private String generateJSgetbounds() {
        if (getbounds != null) {
            return getbounds.generateJs();
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

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
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

    private String generateJSbarSize() {
        if (barSize != null) {
            return String.format(Locale.US, "barSize: %f,", barSize);
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

    private String generateJSbuttonsVisible() {
        if (buttonsVisible != null) {
            return String.format(Locale.US, "buttonsVisible: %b,", buttonsVisible);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
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

    private String generateJSmouseOutOpacity() {
        if (mouseOutOpacity != null) {
            return String.format(Locale.US, "mouseOutOpacity: %f,", mouseOutOpacity);
        }
        return "";
    }

    private String generateJSmouseOverOpacity() {
        if (mouseOverOpacity != null) {
            return String.format(Locale.US, "mouseOverOpacity: %f,", mouseOverOpacity);
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

    private String generateJSfillOrColorOrKeys3() {
        if (fillOrColorOrKeys3 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys4() {
        if (fillOrColorOrKeys4 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys4));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys5() {
        if (fillOrColorOrKeys5 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys5));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx1() {
        if (opacityOrAngleOrCx1 != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx1);
        }
        return "";
    }

    private String generateJSmodeOrCy4() {
        if (modeOrCy4 != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy4);
        }
        return "";
    }

    private String generateJSmodeOrCy5() {
        if (modeOrCy5 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy5);
        }
        return "";
    }

    private String generateJSmodeOrCy6() {
        if (modeOrCy6 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmodeOrCy7() {
        if (modeOrCy7 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", modeOrCy7);
        }
        return "";
    }

    private String generateJSopacityOrMode3() {
        if (opacityOrMode3 != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode3);
        }
        return "";
    }

    private String generateJSopacityOrMode4() {
        if (opacityOrMode4 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode5() {
        if (opacityOrMode5 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", opacityOrMode5);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSstroke3() {
        if (stroke3 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke3 != null) ? stroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke4() {
        if (stroke4 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke4 != null) ? stroke4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke5() {
        if (stroke5 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke5);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
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

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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
            js.append(generateJSstroke());
            js.append(generateJSstroke1());
            js.append(generateJSstroke2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSbarSize());
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
            js.append(generateJSbuttonsVisible());
            js.append(generateJSenabled());
            js.append(generateJSheight2());
            js.append(generateJSheight3());
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
            js.append(generateJSmouseOutOpacity());
            js.append(generateJSmouseOverOpacity());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSfillOrColorOrKeys3());
            js.append(generateJSfillOrColorOrKeys4());
            js.append(generateJSfillOrColorOrKeys5());
            js.append(generateJSopacityOrAngleOrCx1());
            js.append(generateJSmodeOrCy4());
            js.append(generateJSmodeOrCy5());
            js.append(generateJSmodeOrCy6());
            js.append(generateJSmodeOrCy7());
            js.append(generateJSopacityOrMode3());
            js.append(generateJSopacityOrMode4());
            js.append(generateJSopacityOrMode5());
            js.append(generateJSopacity1());
            js.append(generateJSfx1());
            js.append(generateJSfy1());
            js.append(generateJSstroke3());
            js.append(generateJSstroke4());
            js.append(generateJSstroke5());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSwidth2());
            js.append(generateJSwidth3());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetbounds());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
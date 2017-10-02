package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Tasks extends JsObject {

    private String jsBase;

    public Tasks() {

    }

    protected Tasks(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String color;

    public void setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;

            js.append(String.format(Locale.US, jsBase + ".color(%s);", color));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".color(%s);", color));
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
    private AnychartMathRect modeOrCy2;
    private String modeOrCy3;
    private Double opacityOrMode;
    private AnychartMathRect opacityOrMode1;
    private String opacityOrMode2;
    private Double opacity;
    private Double fx;
    private Double fy;

    public void setDummyfill(Fill fillOrColorOrKeys, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(Fill fillOrColorOrKeys, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null", modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(GradientKey[] fillOrColorOrKeys1, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys1), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Double modeOrCy, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Double modeOrCy, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy1, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, AnychartMathRect modeOrCy2, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null", opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, String modeOrCy3, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, String modeOrCy3, AnychartMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null", opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setDummyfill(String[] fillOrColorOrKeys2, String modeOrCy3, String opacityOrMode2, Double opacityOrAngleOrCx, Double opacity, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys2), modeOrCy3, opacityOrMode2, opacityOrAngleOrCx, opacity, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setDummystroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setDummystroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setDummystroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dummyStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
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

    public void setFill(Fill fillOrColorOrKeys3, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(Fill fillOrColorOrKeys3, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys3 != null) ? fillOrColorOrKeys3.generateJs() : "null", modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] fillOrColorOrKeys4, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys4), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Double modeOrCy4, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Double modeOrCy4, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Double modeOrCy4, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy4, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, Boolean modeOrCy5, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy5, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, AnychartMathRect modeOrCy6, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), (modeOrCy6 != null) ? modeOrCy6.generateJs() : "null", opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, String modeOrCy7, Double opacityOrMode3, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode3, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, String modeOrCy7, AnychartMathRect opacityOrMode4, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, (opacityOrMode4 != null) ? opacityOrMode4.generateJs() : "null", opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] fillOrColorOrKeys5, String modeOrCy7, String opacityOrMode5, Double opacityOrAngleOrCx1, Double opacity1, Double fx1, Double fy1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys5), modeOrCy7, opacityOrMode5, opacityOrAngleOrCx1, opacity1, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Fill fillOrColorOrKeys6;
    private GradientKey[] fillOrColorOrKeys7;
    private String[] fillOrColorOrKeys8;
    private Double opacityOrAngleOrCx2;
    private Double modeOrCy8;
    private Boolean modeOrCy9;
    private AnychartMathRect modeOrCy10;
    private String modeOrCy11;
    private Double opacityOrMode6;
    private AnychartMathRect opacityOrMode7;
    private String opacityOrMode8;
    private Double opacity2;
    private Double fx2;
    private Double fy2;

    public void setHoverfill(Fill fillOrColorOrKeys6, Double modeOrCy8, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, Double modeOrCy8, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, Double modeOrCy8, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, Boolean modeOrCy9, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, Boolean modeOrCy9, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, Boolean modeOrCy9, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, AnychartMathRect modeOrCy10, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, AnychartMathRect modeOrCy10, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, AnychartMathRect modeOrCy10, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, String modeOrCy11, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, String modeOrCy11, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(Fill fillOrColorOrKeys6, String modeOrCy11, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys6 = fillOrColorOrKeys6;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null", modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Double modeOrCy8, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Double modeOrCy8, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Double modeOrCy8, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Boolean modeOrCy9, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Boolean modeOrCy9, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, Boolean modeOrCy9, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, AnychartMathRect modeOrCy10, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, AnychartMathRect modeOrCy10, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, AnychartMathRect modeOrCy10, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, String modeOrCy11, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, String modeOrCy11, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] fillOrColorOrKeys7, String modeOrCy11, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys7 = fillOrColorOrKeys7;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys7), modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Double modeOrCy8, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Double modeOrCy8, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Double modeOrCy8, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy8 = modeOrCy8;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy8, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Boolean modeOrCy9, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Boolean modeOrCy9, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, Boolean modeOrCy9, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy9 = modeOrCy9;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy9, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, AnychartMathRect modeOrCy10, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, AnychartMathRect modeOrCy10, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, AnychartMathRect modeOrCy10, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy10 = modeOrCy10;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null", opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, String modeOrCy11, Double opacityOrMode6, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode6 = opacityOrMode6;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, opacityOrMode6, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, String modeOrCy11, AnychartMathRect opacityOrMode7, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode7 = opacityOrMode7;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null", opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] fillOrColorOrKeys8, String modeOrCy11, String opacityOrMode8, Double opacityOrAngleOrCx2, Double opacity2, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.fillOrColorOrKeys8 = fillOrColorOrKeys8;
            this.modeOrCy11 = modeOrCy11;
            this.opacityOrMode8 = opacityOrMode8;
            this.opacityOrAngleOrCx2 = opacityOrAngleOrCx2;
            this.opacity2 = opacity2;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys8), modeOrCy11, opacityOrMode8, opacityOrAngleOrCx2, opacity2, fx2, fy2));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getHoverLowerLabels;

    public UiLabelsFactory getHoverLowerLabels() {
        if (getHoverLowerLabels == null)
            getHoverLowerLabels = new UiLabelsFactory(jsBase + ".hoverLowerLabels()");

        return getHoverLowerLabels;
    }

    private String hoverLowerLabels;
    private Boolean hoverLowerLabels1;

    public void setHoverlowerlabels(String hoverLowerLabels) {
        if (jsBase == null) {
            this.hoverLowerLabels = null;
            this.hoverLowerLabels1 = null;
            
            this.hoverLowerLabels = hoverLowerLabels;
        } else {
            this.hoverLowerLabels = hoverLowerLabels;

            js.append(String.format(Locale.US, jsBase + ".hoverLowerLabels(%s);", hoverLowerLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLowerLabels(%s);", hoverLowerLabels));
                js.setLength(0);
            }
        }
    }


    public void setHoverlowerlabels(Boolean hoverLowerLabels1) {
        if (jsBase == null) {
            this.hoverLowerLabels = null;
            this.hoverLowerLabels1 = null;
            
            this.hoverLowerLabels1 = hoverLowerLabels1;
        } else {
            this.hoverLowerLabels1 = hoverLowerLabels1;

            js.append(String.format(Locale.US, jsBase + ".hoverLowerLabels(%b);", hoverLowerLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLowerLabels(%b);", hoverLowerLabels1));
                js.setLength(0);
            }
        }
    }

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setHoverstroke(Stroke color4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color4 = color4;
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
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color4 != null) ? color4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color4 != null) ? color4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(ColoredFill color5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color5 = color5;
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
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(String color6, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
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
            this.color6 = color6;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color6, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color6, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getHoverUpperLabels;

    public UiLabelsFactory getHoverUpperLabels() {
        if (getHoverUpperLabels == null)
            getHoverUpperLabels = new UiLabelsFactory(jsBase + ".hoverUpperLabels()");

        return getHoverUpperLabels;
    }

    private String hoverUpperLabels;
    private Boolean hoverUpperLabels1;

    public void setHoverupperlabels(String hoverUpperLabels) {
        if (jsBase == null) {
            this.hoverUpperLabels = null;
            this.hoverUpperLabels1 = null;
            
            this.hoverUpperLabels = hoverUpperLabels;
        } else {
            this.hoverUpperLabels = hoverUpperLabels;

            js.append(String.format(Locale.US, jsBase + ".hoverUpperLabels(%s);", hoverUpperLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverUpperLabels(%s);", hoverUpperLabels));
                js.setLength(0);
            }
        }
    }


    public void setHoverupperlabels(Boolean hoverUpperLabels1) {
        if (jsBase == null) {
            this.hoverUpperLabels = null;
            this.hoverUpperLabels1 = null;
            
            this.hoverUpperLabels1 = hoverUpperLabels1;
        } else {
            this.hoverUpperLabels1 = hoverUpperLabels1;

            js.append(String.format(Locale.US, jsBase + ".hoverUpperLabels(%b);", hoverUpperLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverUpperLabels(%b);", hoverUpperLabels1));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getLowerLabels;

    public UiLabelsFactory getLowerLabels() {
        if (getLowerLabels == null)
            getLowerLabels = new UiLabelsFactory(jsBase + ".lowerLabels()");

        return getLowerLabels;
    }

    private String lowerLabels;
    private Boolean lowerLabels1;

    public void setLowerlabels(String lowerLabels) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels = lowerLabels;
        } else {
            this.lowerLabels = lowerLabels;

            js.append(String.format(Locale.US, jsBase + ".lowerLabels(%s);", lowerLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerLabels(%s);", lowerLabels));
                js.setLength(0);
            }
        }
    }


    public void setLowerlabels(Boolean lowerLabels1) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels1 = lowerLabels1;
        } else {
            this.lowerLabels1 = lowerLabels1;

            js.append(String.format(Locale.US, jsBase + ".lowerLabels(%b);", lowerLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerLabels(%b);", lowerLabels1));
                js.setLength(0);
            }
        }
    }

    private Fill fillOrColorOrKeys9;
    private GradientKey[] fillOrColorOrKeys10;
    private String[] fillOrColorOrKeys11;
    private Double opacityOrAngleOrCx3;
    private Double modeOrCy12;
    private Boolean modeOrCy13;
    private AnychartMathRect modeOrCy14;
    private String modeOrCy15;
    private Double opacityOrMode9;
    private AnychartMathRect opacityOrMode10;
    private String opacityOrMode11;
    private Double opacity3;
    private Double fx3;
    private Double fy3;

    public void setSelectfill(Fill fillOrColorOrKeys9, Double modeOrCy12, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, Double modeOrCy12, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, Double modeOrCy12, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, Boolean modeOrCy13, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, Boolean modeOrCy13, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, Boolean modeOrCy13, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, AnychartMathRect modeOrCy14, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, AnychartMathRect modeOrCy14, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, AnychartMathRect modeOrCy14, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, String modeOrCy15, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, String modeOrCy15, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(Fill fillOrColorOrKeys9, String modeOrCy15, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys9 = fillOrColorOrKeys9;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null", modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Double modeOrCy12, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Double modeOrCy12, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Double modeOrCy12, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Boolean modeOrCy13, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Boolean modeOrCy13, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, Boolean modeOrCy13, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, AnychartMathRect modeOrCy14, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, AnychartMathRect modeOrCy14, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, AnychartMathRect modeOrCy14, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, String modeOrCy15, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, String modeOrCy15, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] fillOrColorOrKeys10, String modeOrCy15, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys10 = fillOrColorOrKeys10;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", arrayToString(fillOrColorOrKeys10), modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Double modeOrCy12, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Double modeOrCy12, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Double modeOrCy12, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy12 = modeOrCy12;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy12, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Boolean modeOrCy13, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Boolean modeOrCy13, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, Boolean modeOrCy13, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy13 = modeOrCy13;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy13, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, AnychartMathRect modeOrCy14, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, AnychartMathRect modeOrCy14, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, AnychartMathRect modeOrCy14, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy14 = modeOrCy14;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null", opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, String modeOrCy15, Double opacityOrMode9, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode9 = opacityOrMode9;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, opacityOrMode9, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, String modeOrCy15, AnychartMathRect opacityOrMode10, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode10 = opacityOrMode10;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null", opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] fillOrColorOrKeys11, String modeOrCy15, String opacityOrMode11, Double opacityOrAngleOrCx3, Double opacity3, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.fillOrColorOrKeys = null;
            this.fillOrColorOrKeys1 = null;
            this.fillOrColorOrKeys2 = null;
            this.fillOrColorOrKeys3 = null;
            this.fillOrColorOrKeys4 = null;
            this.fillOrColorOrKeys5 = null;
            this.fillOrColorOrKeys6 = null;
            this.fillOrColorOrKeys7 = null;
            this.fillOrColorOrKeys8 = null;
            this.fillOrColorOrKeys9 = null;
            this.fillOrColorOrKeys10 = null;
            this.fillOrColorOrKeys11 = null;
            
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy = null;
            this.modeOrCy1 = null;
            this.modeOrCy2 = null;
            this.modeOrCy3 = null;
            this.modeOrCy4 = null;
            this.modeOrCy5 = null;
            this.modeOrCy6 = null;
            this.modeOrCy7 = null;
            this.modeOrCy8 = null;
            this.modeOrCy9 = null;
            this.modeOrCy10 = null;
            this.modeOrCy11 = null;
            this.modeOrCy12 = null;
            this.modeOrCy13 = null;
            this.modeOrCy14 = null;
            this.modeOrCy15 = null;
            
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode = null;
            this.opacityOrMode1 = null;
            this.opacityOrMode2 = null;
            this.opacityOrMode3 = null;
            this.opacityOrMode4 = null;
            this.opacityOrMode5 = null;
            this.opacityOrMode6 = null;
            this.opacityOrMode7 = null;
            this.opacityOrMode8 = null;
            this.opacityOrMode9 = null;
            this.opacityOrMode10 = null;
            this.opacityOrMode11 = null;
            
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx = null;
            this.opacityOrAngleOrCx1 = null;
            this.opacityOrAngleOrCx2 = null;
            this.opacityOrAngleOrCx3 = null;
            
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.fillOrColorOrKeys11 = fillOrColorOrKeys11;
            this.modeOrCy15 = modeOrCy15;
            this.opacityOrMode11 = opacityOrMode11;
            this.opacityOrAngleOrCx3 = opacityOrAngleOrCx3;
            this.opacity3 = opacity3;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %s, %f, %f, %f, %f);", Arrays.toString(fillOrColorOrKeys11), modeOrCy15, opacityOrMode11, opacityOrAngleOrCx3, opacity3, fx3, fy3));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getSelectLowerLabels;

    public UiLabelsFactory getSelectLowerLabels() {
        if (getSelectLowerLabels == null)
            getSelectLowerLabels = new UiLabelsFactory(jsBase + ".selectLowerLabels()");

        return getSelectLowerLabels;
    }

    private String selectLowerLabels;
    private Boolean selectLowerLabels1;

    public void setSelectlowerlabels(String selectLowerLabels) {
        if (jsBase == null) {
            this.selectLowerLabels = null;
            this.selectLowerLabels1 = null;
            
            this.selectLowerLabels = selectLowerLabels;
        } else {
            this.selectLowerLabels = selectLowerLabels;

            js.append(String.format(Locale.US, jsBase + ".selectLowerLabels(%s);", selectLowerLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLowerLabels(%s);", selectLowerLabels));
                js.setLength(0);
            }
        }
    }


    public void setSelectlowerlabels(Boolean selectLowerLabels1) {
        if (jsBase == null) {
            this.selectLowerLabels = null;
            this.selectLowerLabels1 = null;
            
            this.selectLowerLabels1 = selectLowerLabels1;
        } else {
            this.selectLowerLabels1 = selectLowerLabels1;

            js.append(String.format(Locale.US, jsBase + ".selectLowerLabels(%b);", selectLowerLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLowerLabels(%b);", selectLowerLabels1));
                js.setLength(0);
            }
        }
    }

    private Stroke color7;
    private ColoredFill color8;
    private String color9;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setSelectstroke(Stroke color7, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color7 != null) ? color7.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color7 != null) ? color7.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(ColoredFill color8, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color8 = color8;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color8 = color8;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color8 != null) ? color8.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color8 != null) ? color8.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(String color9, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color9 = color9;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color9, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color9, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getSelectUpperLabels;

    public UiLabelsFactory getSelectUpperLabels() {
        if (getSelectUpperLabels == null)
            getSelectUpperLabels = new UiLabelsFactory(jsBase + ".selectUpperLabels()");

        return getSelectUpperLabels;
    }

    private String selectUpperLabels;
    private Boolean selectUpperLabels1;

    public void setSelectupperlabels(String selectUpperLabels) {
        if (jsBase == null) {
            this.selectUpperLabels = null;
            this.selectUpperLabels1 = null;
            
            this.selectUpperLabels = selectUpperLabels;
        } else {
            this.selectUpperLabels = selectUpperLabels;

            js.append(String.format(Locale.US, jsBase + ".selectUpperLabels(%s);", selectUpperLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectUpperLabels(%s);", selectUpperLabels));
                js.setLength(0);
            }
        }
    }


    public void setSelectupperlabels(Boolean selectUpperLabels1) {
        if (jsBase == null) {
            this.selectUpperLabels = null;
            this.selectUpperLabels1 = null;
            
            this.selectUpperLabels1 = selectUpperLabels1;
        } else {
            this.selectUpperLabels1 = selectUpperLabels1;

            js.append(String.format(Locale.US, jsBase + ".selectUpperLabels(%b);", selectUpperLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectUpperLabels(%b);", selectUpperLabels1));
                js.setLength(0);
            }
        }
    }

    private Stroke color10;
    private ColoredFill color11;
    private String color12;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setStroke(Stroke color10, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color10 = color10;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill color11, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color11 = color11;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color11 != null) ? color11.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color11 != null) ? color11.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String color12, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color12 = color12;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color12 = color12;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color12, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color12, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
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

    private UiLabelsFactory getUpperLabels;

    public UiLabelsFactory getUpperLabels() {
        if (getUpperLabels == null)
            getUpperLabels = new UiLabelsFactory(jsBase + ".upperLabels()");

        return getUpperLabels;
    }

    private String upperLabels;
    private Boolean upperLabels1;

    public void setUpperlabels(String upperLabels) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels = upperLabels;
        } else {
            this.upperLabels = upperLabels;

            js.append(String.format(Locale.US, jsBase + ".upperLabels(%s);", upperLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperLabels(%s);", upperLabels));
                js.setLength(0);
            }
        }
    }


    public void setUpperlabels(Boolean upperLabels1) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels1 = upperLabels1;
        } else {
            this.upperLabels1 = upperLabels1;

            js.append(String.format(Locale.US, jsBase + ".upperLabels(%b);", upperLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperLabels(%b);", upperLabels1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetHoverLowerLabels() {
        if (getHoverLowerLabels != null) {
            return getHoverLowerLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverUpperLabels() {
        if (getHoverUpperLabels != null) {
            return getHoverUpperLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLowerLabels() {
        if (getLowerLabels != null) {
            return getLowerLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLowerLabels() {
        if (getSelectLowerLabels != null) {
            return getSelectLowerLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectUpperLabels() {
        if (getSelectUpperLabels != null) {
            return getSelectUpperLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }

    private String generateJSgetUpperLabels() {
        if (getUpperLabels != null) {
            return getUpperLabels.generateJs();
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
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

    private String generateJSfillOrColorOrKeys6() {
        if (fillOrColorOrKeys6 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys6 != null) ? fillOrColorOrKeys6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys7() {
        if (fillOrColorOrKeys7 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys7));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys8() {
        if (fillOrColorOrKeys8 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys8));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx2() {
        if (opacityOrAngleOrCx2 != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx2);
        }
        return "";
    }

    private String generateJSmodeOrCy8() {
        if (modeOrCy8 != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy8);
        }
        return "";
    }

    private String generateJSmodeOrCy9() {
        if (modeOrCy9 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy9);
        }
        return "";
    }

    private String generateJSmodeOrCy10() {
        if (modeOrCy10 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy10 != null) ? modeOrCy10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmodeOrCy11() {
        if (modeOrCy11 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", modeOrCy11);
        }
        return "";
    }

    private String generateJSopacityOrMode6() {
        if (opacityOrMode6 != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode6);
        }
        return "";
    }

    private String generateJSopacityOrMode7() {
        if (opacityOrMode7 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode7 != null) ? opacityOrMode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode8() {
        if (opacityOrMode8 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", opacityOrMode8);
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJShoverLowerLabels() {
        if (hoverLowerLabels != null) {
            return String.format(Locale.US, "hoverLowerLabels: %s,", hoverLowerLabels);
        }
        return "";
    }

    private String generateJShoverLowerLabels1() {
        if (hoverLowerLabels1 != null) {
            return String.format(Locale.US, "hoverLowerLabels: %b,", hoverLowerLabels1);
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", (color4 != null) ? color4.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", (color5 != null) ? color5.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", color6);
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

    private String generateJShoverUpperLabels() {
        if (hoverUpperLabels != null) {
            return String.format(Locale.US, "hoverUpperLabels: %s,", hoverUpperLabels);
        }
        return "";
    }

    private String generateJShoverUpperLabels1() {
        if (hoverUpperLabels1 != null) {
            return String.format(Locale.US, "hoverUpperLabels: %b,", hoverUpperLabels1);
        }
        return "";
    }

    private String generateJSlowerLabels() {
        if (lowerLabels != null) {
            return String.format(Locale.US, "lowerLabels: %s,", lowerLabels);
        }
        return "";
    }

    private String generateJSlowerLabels1() {
        if (lowerLabels1 != null) {
            return String.format(Locale.US, "lowerLabels: %b,", lowerLabels1);
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys9() {
        if (fillOrColorOrKeys9 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys9 != null) ? fillOrColorOrKeys9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys10() {
        if (fillOrColorOrKeys10 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys10));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys11() {
        if (fillOrColorOrKeys11 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys11));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx3() {
        if (opacityOrAngleOrCx3 != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx3);
        }
        return "";
    }

    private String generateJSmodeOrCy12() {
        if (modeOrCy12 != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy12);
        }
        return "";
    }

    private String generateJSmodeOrCy13() {
        if (modeOrCy13 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy13);
        }
        return "";
    }

    private String generateJSmodeOrCy14() {
        if (modeOrCy14 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy14 != null) ? modeOrCy14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmodeOrCy15() {
        if (modeOrCy15 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", modeOrCy15);
        }
        return "";
    }

    private String generateJSopacityOrMode9() {
        if (opacityOrMode9 != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode9);
        }
        return "";
    }

    private String generateJSopacityOrMode10() {
        if (opacityOrMode10 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode10 != null) ? opacityOrMode10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode11() {
        if (opacityOrMode11 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", opacityOrMode11);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSfx3() {
        if (fx3 != null) {
            return String.format(Locale.US, "fx: %f,", fx3);
        }
        return "";
    }

    private String generateJSfy3() {
        if (fy3 != null) {
            return String.format(Locale.US, "fy: %f,", fy3);
        }
        return "";
    }

    private String generateJSselectLowerLabels() {
        if (selectLowerLabels != null) {
            return String.format(Locale.US, "selectLowerLabels: %s,", selectLowerLabels);
        }
        return "";
    }

    private String generateJSselectLowerLabels1() {
        if (selectLowerLabels1 != null) {
            return String.format(Locale.US, "selectLowerLabels: %b,", selectLowerLabels1);
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", (color7 != null) ? color7.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", (color8 != null) ? color8.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", color9);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectUpperLabels() {
        if (selectUpperLabels != null) {
            return String.format(Locale.US, "selectUpperLabels: %s,", selectUpperLabels);
        }
        return "";
    }

    private String generateJSselectUpperLabels1() {
        if (selectUpperLabels1 != null) {
            return String.format(Locale.US, "selectUpperLabels: %b,", selectUpperLabels1);
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", (color10 != null) ? color10.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", (color11 != null) ? color11.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", color12);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
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

    private String generateJSupperLabels() {
        if (upperLabels != null) {
            return String.format(Locale.US, "upperLabels: %s,", upperLabels);
        }
        return "";
    }

    private String generateJSupperLabels1() {
        if (upperLabels1 != null) {
            return String.format(Locale.US, "upperLabels: %b,", upperLabels1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScolor());
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
            js.append(generateJScolor1());
            js.append(generateJScolor2());
            js.append(generateJScolor3());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
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
            js.append(generateJSfillOrColorOrKeys6());
            js.append(generateJSfillOrColorOrKeys7());
            js.append(generateJSfillOrColorOrKeys8());
            js.append(generateJSopacityOrAngleOrCx2());
            js.append(generateJSmodeOrCy8());
            js.append(generateJSmodeOrCy9());
            js.append(generateJSmodeOrCy10());
            js.append(generateJSmodeOrCy11());
            js.append(generateJSopacityOrMode6());
            js.append(generateJSopacityOrMode7());
            js.append(generateJSopacityOrMode8());
            js.append(generateJSopacity2());
            js.append(generateJSfx2());
            js.append(generateJSfy2());
            js.append(generateJShoverLowerLabels());
            js.append(generateJShoverLowerLabels1());
            js.append(generateJScolor4());
            js.append(generateJScolor5());
            js.append(generateJScolor6());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJShoverUpperLabels());
            js.append(generateJShoverUpperLabels1());
            js.append(generateJSlowerLabels());
            js.append(generateJSlowerLabels1());
            js.append(generateJSfillOrColorOrKeys9());
            js.append(generateJSfillOrColorOrKeys10());
            js.append(generateJSfillOrColorOrKeys11());
            js.append(generateJSopacityOrAngleOrCx3());
            js.append(generateJSmodeOrCy12());
            js.append(generateJSmodeOrCy13());
            js.append(generateJSmodeOrCy14());
            js.append(generateJSmodeOrCy15());
            js.append(generateJSopacityOrMode9());
            js.append(generateJSopacityOrMode10());
            js.append(generateJSopacityOrMode11());
            js.append(generateJSopacity3());
            js.append(generateJSfx3());
            js.append(generateJSfy3());
            js.append(generateJSselectLowerLabels());
            js.append(generateJSselectLowerLabels1());
            js.append(generateJScolor7());
            js.append(generateJScolor8());
            js.append(generateJScolor9());
            js.append(generateJSthickness2());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJSselectUpperLabels());
            js.append(generateJSselectUpperLabels1());
            js.append(generateJScolor10());
            js.append(generateJScolor11());
            js.append(generateJScolor12());
            js.append(generateJSthickness3());
            js.append(generateJSdashpattern3());
            js.append(generateJSlineJoin3());
            js.append(generateJSlineCap3());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJSupperLabels());
            js.append(generateJSupperLabels1());
            js.append("}");
        }
            js.append(generateJSgetHoverLowerLabels());
            js.append(generateJSgetHoverUpperLabels());
            js.append(generateJSgetLowerLabels());
            js.append(generateJSgetSelectLowerLabels());
            js.append(generateJSgetSelectUpperLabels());
            js.append(generateJSgetTooltip());
            js.append(generateJSgetUpperLabels());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
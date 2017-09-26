package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class OrdinalZoom extends JsObject {

    private String jsBase;

    public OrdinalZoom() {

    }

    protected OrdinalZoom(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Boolean continuous;

    public void setContinuous(Boolean continuous) {
        if (jsBase == null) {
            this.continuous = continuous;
        } else {
            this.continuous = continuous;

            js.append(String.format(Locale.US, jsBase + ".continuous(%b);", continuous));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".continuous(%b);", continuous));
                js.setLength(0);
            }
        }
    }

    private Double startRatio;
    private Double endRatio;

    public void setSetto(Double startRatio, Double endRatio) {
        if (jsBase == null) {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
        } else {
            this.startRatio = startRatio;
            this.endRatio = endRatio;

            js.append(String.format(Locale.US, jsBase + ".setTo(%f, %f);", startRatio, endRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setTo(%f, %f);", startRatio, endRatio));
                js.setLength(0);
            }
        }
    }

    private Double pointsCount;
    private Boolean fromEnd;
    private ScalesBase scale;

    public void setSettopointscount(Double pointsCount, Boolean fromEnd, ScalesBase scale) {
        if (jsBase == null) {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
        } else {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".setToPointsCount(%f, %b, %s);", pointsCount, fromEnd, (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setToPointsCount(%f, %b, %s);", pointsCount, fromEnd, (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private ScalesBase scale1;

    public void setSettovalues(ScalesBase scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;

            js.append(String.format(Locale.US, jsBase + ".setToValues(%s);", (scale1 != null) ? scale1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setToValues(%s);", (scale1 != null) ? scale1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String generateJScontinuous() {
        if (continuous != null) {
            return String.format(Locale.US, "continuous: %b,", continuous);
        }
        return "";
    }

    private String generateJSstartRatio() {
        if (startRatio != null) {
            return String.format(Locale.US, "startRatio: %f,", startRatio);
        }
        return "";
    }

    private String generateJSendRatio() {
        if (endRatio != null) {
            return String.format(Locale.US, "endRatio: %f,", endRatio);
        }
        return "";
    }

    private String generateJSpointsCount() {
        if (pointsCount != null) {
            return String.format(Locale.US, "pointsCount: %f,", pointsCount);
        }
        return "";
    }

    private String generateJSfromEnd() {
        if (fromEnd != null) {
            return String.format(Locale.US, "fromEnd: %b,", fromEnd);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale1() {
        if (scale1 != null) {
            return String.format(Locale.US, "scale: %s,", (scale1 != null) ? scale1.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScontinuous());
            js.append(generateJSstartRatio());
            js.append(generateJSendRatio());
            js.append(generateJSpointsCount());
            js.append(generateJSfromEnd());
            js.append(generateJSscale());
            js.append(generateJSscale1());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
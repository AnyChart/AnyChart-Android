package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DateTime extends JsObject {

    
    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        this.silently = silently;
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        this.ratio = ratio;
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Double maximum;

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    private Double maximumGap;

    public void setMaximumgap(Double maximumGap) {
        this.maximumGap = maximumGap;
    }

    private Double minimum;

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    private Double minimumGap;

    public void setMinimumgap(Double minimumGap) {
        this.minimumGap = minimumGap;
    }

    private String[] minorTicks;

    public void setMinorticks(String[] minorTicks) {
        this.minorTicks = minorTicks;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double softMaximum;

    public void setSoftmaximum(Double softMaximum) {
        this.softMaximum = softMaximum;
    }

    private Double softMinimum;

    public void setSoftminimum(Double softMinimum) {
        this.softMinimum = softMinimum;
    }

    private String[] ticks;

    public void setTicks(String[] ticks) {
        this.ticks = ticks;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String generateJSsilently() {
        if (silently != null) {
            return String.format(Locale.US, "silently: %b,", silently);
        }
        return "";
    }

    private String generateJSratio() {
        if (ratio != null) {
            return String.format(Locale.US, "ratio: %f,", ratio);
        }
        return "";
    }

    private String generateJSinverted() {
        if (inverted != null) {
            return String.format(Locale.US, "inverted: %b,", inverted);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmaximum() {
        if (maximum != null) {
            return String.format(Locale.US, "maximum: %f,", maximum);
        }
        return "";
    }

    private String generateJSmaximumGap() {
        if (maximumGap != null) {
            return String.format(Locale.US, "maximumGap: %f,", maximumGap);
        }
        return "";
    }

    private String generateJSminimum() {
        if (minimum != null) {
            return String.format(Locale.US, "minimum: %f,", minimum);
        }
        return "";
    }

    private String generateJSminimumGap() {
        if (minimumGap != null) {
            return String.format(Locale.US, "minimumGap: %f,", minimumGap);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %s,", Arrays.toString(minorTicks));
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSsoftMaximum() {
        if (softMaximum != null) {
            return String.format(Locale.US, "softMaximum: %f,", softMaximum);
        }
        return "";
    }

    private String generateJSsoftMinimum() {
        if (softMinimum != null) {
            return String.format(Locale.US, "softMinimum: %f,", softMinimum);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSsilently());
        js.append(generateJSratio());
        js.append(generateJSinverted());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaximum());
        js.append(generateJSmaximumGap());
        js.append(generateJSminimum());
        js.append(generateJSminimumGap());
        js.append(generateJSminorTicks());
        js.append(generateJStype2());
        js.append(generateJSsoftMaximum());
        js.append(generateJSsoftMinimum());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
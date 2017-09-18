package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ScatterTicks extends JsObject {

    
    private Double base;

    public void setBase(Double base) {
        this.base = base;
    }

    private Double count;

    public void setCount(Double count) {
        this.count = count;
    }

    private Double minimumCount;
    private Double maximumCount;

    public void setCount(Double minimumCount, Double maximumCount) {
        this.minimumCount = minimumCount;
        this.maximumCount = maximumCount;
    }

    private Double interval;

    public void setInterval(Double interval) {
        this.interval = interval;
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

    private ScatterTicksMode mode;
    private String mode1;

    public void setMode(ScatterTicksMode mode) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
    }


    public void setMode(String mode1) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String[] ticks;

    public void setSet(String[] ticks) {
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

    private String generateJSbase() {
        if (base != null) {
            return String.format(Locale.US, "base: %f,", base);
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSminimumCount() {
        if (minimumCount != null) {
            return String.format(Locale.US, "minimumCount: %f,", minimumCount);
        }
        return "";
    }

    private String generateJSmaximumCount() {
        if (maximumCount != null) {
            return String.format(Locale.US, "maximumCount: %f,", maximumCount);
        }
        return "";
    }

    private String generateJSinterval() {
        if (interval != null) {
            return String.format(Locale.US, "interval: %f,", interval);
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

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", (mode != null) ? mode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", mode1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSbase());
        js.append(generateJScount());
        js.append(generateJSminimumCount());
        js.append(generateJSmaximumCount());
        js.append(generateJSinterval());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJStype2());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
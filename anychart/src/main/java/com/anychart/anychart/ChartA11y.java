package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ChartA11y extends JsObject {

    private String jsBase;

    public ChartA11y() {

    }

    protected ChartA11y(String jsBase) {
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

    private A11yMode mode;
    private String mode1;

    public void setMode(A11yMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;

            js.append(String.format(Locale.US, jsBase + ".mode(%s);", (mode != null) ? mode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", (mode != null) ? mode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;

            js.append(String.format(Locale.US, jsBase + ".mode(%s);", mode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mode(%s);", mode1));
                js.setLength(0);
            }
        }
    }

    private String titleFormat;

    public void setTitleformat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;

            js.append(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));
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

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: %s,", titleFormat);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSenabled());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJStitleFormat());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
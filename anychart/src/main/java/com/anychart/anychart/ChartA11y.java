package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartA11y extends JsObject {

    
    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private A11yMode mode;
    private String mode1;

    public void setMode(A11yMode mode) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
    }


    public void setMode(String mode1) {
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
    }

    private String titleFormat;

    public void setTitleformat(String titleFormat) {
        this.titleFormat = titleFormat;
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
            return String.format(Locale.US, "mode: \"%s\",", mode1);
        }
        return "";
    }

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: \"%s\",", titleFormat);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSenabled());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJStitleFormat());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
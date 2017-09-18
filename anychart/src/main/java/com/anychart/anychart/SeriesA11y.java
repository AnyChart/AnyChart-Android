package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class SeriesA11y extends JsObject {

    
    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: %s,", titleFormat);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSenabled());
        js.append(generateJStitleFormat());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
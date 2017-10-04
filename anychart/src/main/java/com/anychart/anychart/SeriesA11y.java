package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class SeriesA11y extends A11y {

    private String jsBase;

    public SeriesA11y() {

    }

    protected SeriesA11y(String jsBase) {
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
            js.append(generateJStitleFormat());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class StockInteractivity extends Interactivity {

    private String jsBase;

    public StockInteractivity() {

    }

    protected StockInteractivity(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Boolean scrollOnMouseWheel;

    public void setScrollonmousewheel(Boolean scrollOnMouseWheel) {
        if (jsBase == null) {
            this.scrollOnMouseWheel = scrollOnMouseWheel;
        } else {
            this.scrollOnMouseWheel = scrollOnMouseWheel;

            js.append(String.format(Locale.US, jsBase + ".scrollOnMouseWheel(%b);", scrollOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scrollOnMouseWheel(%b);", scrollOnMouseWheel));
                js.setLength(0);
            }
        }
    }

    private Boolean zoomOnMouseWheel;

    public void setZoomonmousewheel(Boolean zoomOnMouseWheel) {
        if (jsBase == null) {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
        } else {
            this.zoomOnMouseWheel = zoomOnMouseWheel;

            js.append(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b);", zoomOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b);", zoomOnMouseWheel));
                js.setLength(0);
            }
        }
    }

    private String generateJSscrollOnMouseWheel() {
        if (scrollOnMouseWheel != null) {
            return String.format(Locale.US, "scrollOnMouseWheel: %b,", scrollOnMouseWheel);
        }
        return "";
    }

    private String generateJSzoomOnMouseWheel() {
        if (zoomOnMouseWheel != null) {
            return String.format(Locale.US, "zoomOnMouseWheel: %b,", zoomOnMouseWheel);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSscrollOnMouseWheel());
            js.append(generateJSzoomOnMouseWheel());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
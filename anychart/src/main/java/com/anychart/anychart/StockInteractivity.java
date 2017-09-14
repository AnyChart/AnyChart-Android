package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class StockInteractivity extends JsObject {

    
    private Boolean scrollOnMouseWheel;

    public void setScrollonmousewheel(Boolean scrollOnMouseWheel) {
        this.scrollOnMouseWheel = scrollOnMouseWheel;
    }

    private Boolean zoomOnMouseWheel;

    public void setZoomonmousewheel(Boolean zoomOnMouseWheel) {
        this.zoomOnMouseWheel = zoomOnMouseWheel;
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
        js.append("{");
        js.append(generateJSscrollOnMouseWheel());
        js.append(generateJSzoomOnMouseWheel());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
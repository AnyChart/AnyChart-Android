package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Image fill.
 */
public class ImageFill extends JsObject implements Fill {

    
    private ImageFillMode mode;
    private String src;

    
    public ImageFill(ImageFillMode mode, String src) {
        this.mode = mode;
        this.src = src;

        js.append(String.format(Locale.US, "{mode: %s,src: %s}",  ((mode != null) ? mode.generateJs() : "null"), wrapQuotes(src)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
package com.anychart.anychart;

import java.util.Locale;

/**
 * Image fill.
 */
public class ImageFill extends JsObject implements Fill {

    
    private ImageFillMode mode;
    private String mode1;
    private Number opacity;
    private String src;

    
    public ImageFill(ImageFillMode mode, Number opacity, String src) {
        this.mode = mode;
        this.opacity = opacity;
        this.src = src;

        js.append(String.format(Locale.US, "{mode: %s,opacity: %s,src: %s}",  ((mode != null) ? mode.generateJs() : "null"), opacity, wrapQuotes(src)));
    }
    public ImageFill(String mode1, Number opacity, String src) {
        this.mode1 = mode1;
        this.opacity = opacity;
        this.src = src;

        js.append(String.format(Locale.US, "{mode: %s,opacity: %s,src: %s}",  wrapQuotes(mode1), opacity, wrapQuotes(src)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
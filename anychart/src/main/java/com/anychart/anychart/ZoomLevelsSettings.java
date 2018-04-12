package com.anychart.anychart;

import java.util.Locale;

/**
 * Type definition for zoom level settings.
 */
public class ZoomLevelsSettings extends JsObject  {

    
    private String The;

    
    public ZoomLevelsSettings(String The) {
        this.The = The;

        js.append(String.format(Locale.US, "{The: %s}",  wrapQuotes(The)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
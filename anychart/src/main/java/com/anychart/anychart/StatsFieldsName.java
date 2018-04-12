package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the statistics fields name.
 */
public class StatsFieldsName extends JsObject  {

    
    private Number depth;
    private String level;

    
    public StatsFieldsName(Number depth, String level) {
        this.depth = depth;
        this.level = level;

        js.append(String.format(Locale.US, "{depth: %s,level: %s}",  depth, wrapQuotes(level)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
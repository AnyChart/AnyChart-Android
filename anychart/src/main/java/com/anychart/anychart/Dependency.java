package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for dependency.
 */
public class Dependency extends JsObject  {

    
    private String from;
    private Number from1;
    private String to;
    private Number to1;

    
    public Dependency(String from, String to) {
        this.from = from;
        this.to = to;

        js.append(String.format(Locale.US, "{from: %s,to: %s}",  wrapQuotes(from), wrapQuotes(to)));
    }
    public Dependency(String from, Number to1) {
        this.from = from;
        this.to1 = to1;

        js.append(String.format(Locale.US, "{from: %s,to: %s}",  wrapQuotes(from), to1));
    }
    public Dependency(Number from1, String to) {
        this.from1 = from1;
        this.to = to;

        js.append(String.format(Locale.US, "{from: %s,to: %s}",  from1, wrapQuotes(to)));
    }
    public Dependency(Number from1, Number to1) {
        this.from1 = from1;
        this.to1 = to1;

        js.append(String.format(Locale.US, "{from: %s,to: %s}",  from1, to1));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
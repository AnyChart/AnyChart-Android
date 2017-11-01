package com.anychart.anychart;

import java.util.Locale;

/**
 * Type definition for dependency.
 */
public class Dependency extends JsObject  {

    
    private String from;
    private Double from1;
    private String to;
    private Double to1;

    
    public Dependency(String from, String to) {
        this.from = from;
        this.to = to;

        js.append(String.format(Locale.US, "{from: %s,to: %s}",  wrapQuotes(from), wrapQuotes(to)));
    }
    public Dependency(String from, Double to1) {
        this.from = from;
        this.to1 = to1;

        js.append(String.format(Locale.US, "{from: %s,to: %f}",  wrapQuotes(from), to1));
    }
    public Dependency(Double from1, String to) {
        this.from1 = from1;
        this.to = to;

        js.append(String.format(Locale.US, "{from: %f,to: %s}",  from1, wrapQuotes(to)));
    }
    public Dependency(Double from1, Double to1) {
        this.from1 = from1;
        this.to1 = to1;

        js.append(String.format(Locale.US, "{from: %f,to: %f}",  from1, to1));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
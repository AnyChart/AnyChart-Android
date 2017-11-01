package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class ChoContext extends JsObject  {

    
    private AdlContext adlContext;
    private EmaContext fastMAContext;
    private SmaContext fastMAContext1;
    private MovingAverageType maType;
    private String maType1;
    private EmaContext slowMAContext;
    private SmaContext slowMAContext1;

    
    public ChoContext(EmaContext fastMAContext, MovingAverageType maType, EmaContext slowMAContext, AdlContext adlContext) {
        this.fastMAContext = fastMAContext;
        this.maType = maType;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext != null) ? fastMAContext.generateJs() : "null"), ((maType != null) ? maType.generateJs() : "null"), ((slowMAContext != null) ? slowMAContext.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(EmaContext fastMAContext, MovingAverageType maType, SmaContext slowMAContext1, AdlContext adlContext) {
        this.fastMAContext = fastMAContext;
        this.maType = maType;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext != null) ? fastMAContext.generateJs() : "null"), ((maType != null) ? maType.generateJs() : "null"), ((slowMAContext1 != null) ? slowMAContext1.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(EmaContext fastMAContext, String maType1, EmaContext slowMAContext, AdlContext adlContext) {
        this.fastMAContext = fastMAContext;
        this.maType1 = maType1;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext != null) ? fastMAContext.generateJs() : "null"), wrapQuotes(maType1), ((slowMAContext != null) ? slowMAContext.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(EmaContext fastMAContext, String maType1, SmaContext slowMAContext1, AdlContext adlContext) {
        this.fastMAContext = fastMAContext;
        this.maType1 = maType1;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext != null) ? fastMAContext.generateJs() : "null"), wrapQuotes(maType1), ((slowMAContext1 != null) ? slowMAContext1.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(SmaContext fastMAContext1, MovingAverageType maType, EmaContext slowMAContext, AdlContext adlContext) {
        this.fastMAContext1 = fastMAContext1;
        this.maType = maType;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext1 != null) ? fastMAContext1.generateJs() : "null"), ((maType != null) ? maType.generateJs() : "null"), ((slowMAContext != null) ? slowMAContext.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(SmaContext fastMAContext1, MovingAverageType maType, SmaContext slowMAContext1, AdlContext adlContext) {
        this.fastMAContext1 = fastMAContext1;
        this.maType = maType;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext1 != null) ? fastMAContext1.generateJs() : "null"), ((maType != null) ? maType.generateJs() : "null"), ((slowMAContext1 != null) ? slowMAContext1.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(SmaContext fastMAContext1, String maType1, EmaContext slowMAContext, AdlContext adlContext) {
        this.fastMAContext1 = fastMAContext1;
        this.maType1 = maType1;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext1 != null) ? fastMAContext1.generateJs() : "null"), wrapQuotes(maType1), ((slowMAContext != null) ? slowMAContext.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }
    public ChoContext(SmaContext fastMAContext1, String maType1, SmaContext slowMAContext1, AdlContext adlContext) {
        this.fastMAContext1 = fastMAContext1;
        this.maType1 = maType1;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;

        js.append(String.format(Locale.US, "{fastMAContext: %s,maType: %s,slowMAContext: %s,adlContext: %s}",  ((fastMAContext1 != null) ? fastMAContext1.generateJs() : "null"), wrapQuotes(maType1), ((slowMAContext1 != null) ? slowMAContext1.generateJs() : "null"), ((adlContext != null) ? adlContext.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
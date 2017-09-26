package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChoContext extends JsObject  {

    
    private AdlContext adlContext;
    private EmaContext fastMAContext;
    private SmaContext fastMAContext1;
    private MovingAverageType maType;
    private EmaContext slowMAContext;
    private SmaContext slowMAContext1;

    
    public ChoContext(EmaContext fastMAContext, EmaContext slowMAContext, AdlContext adlContext, MovingAverageType maType) {
        this.fastMAContext = fastMAContext;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;
        this.maType = maType;

        js.append(String.format(Locale.US, "{fastMAContext: %s,slowMAContext: %s,adlContext: %s,maType: %s}",  (fastMAContext != null) ? fastMAContext.generateJs() : "null", (slowMAContext != null) ? slowMAContext.generateJs() : "null", (adlContext != null) ? adlContext.generateJs() : "null", (maType != null) ? maType.generateJs() : "null"));
    }
    public ChoContext(EmaContext fastMAContext, SmaContext slowMAContext1, AdlContext adlContext, MovingAverageType maType) {
        this.fastMAContext = fastMAContext;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;
        this.maType = maType;

        js.append(String.format(Locale.US, "{fastMAContext: %s,slowMAContext: %s,adlContext: %s,maType: %s}",  (fastMAContext != null) ? fastMAContext.generateJs() : "null", (slowMAContext1 != null) ? slowMAContext1.generateJs() : "null", (adlContext != null) ? adlContext.generateJs() : "null", (maType != null) ? maType.generateJs() : "null"));
    }
    public ChoContext(SmaContext fastMAContext1, EmaContext slowMAContext, AdlContext adlContext, MovingAverageType maType) {
        this.fastMAContext1 = fastMAContext1;
        this.slowMAContext = slowMAContext;
        this.adlContext = adlContext;
        this.maType = maType;

        js.append(String.format(Locale.US, "{fastMAContext: %s,slowMAContext: %s,adlContext: %s,maType: %s}",  (fastMAContext1 != null) ? fastMAContext1.generateJs() : "null", (slowMAContext != null) ? slowMAContext.generateJs() : "null", (adlContext != null) ? adlContext.generateJs() : "null", (maType != null) ? maType.generateJs() : "null"));
    }
    public ChoContext(SmaContext fastMAContext1, SmaContext slowMAContext1, AdlContext adlContext, MovingAverageType maType) {
        this.fastMAContext1 = fastMAContext1;
        this.slowMAContext1 = slowMAContext1;
        this.adlContext = adlContext;
        this.maType = maType;

        js.append(String.format(Locale.US, "{fastMAContext: %s,slowMAContext: %s,adlContext: %s,maType: %s}",  (fastMAContext1 != null) ? fastMAContext1.generateJs() : "null", (slowMAContext1 != null) ? slowMAContext1.generateJs() : "null", (adlContext != null) ? adlContext.generateJs() : "null", (maType != null) ? maType.generateJs() : "null"));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
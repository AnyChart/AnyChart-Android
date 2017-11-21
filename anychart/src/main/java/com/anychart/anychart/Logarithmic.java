package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Define Logarithmic scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#log} method.
 */
public class Logarithmic extends ScalesLinear {

    public Logarithmic() {
        js.setLength(0);
        js.append("var logarithmic").append(++variableIndex).append(" = anychart.scales.logarithmic();");
        jsBase = "logarithmic" + variableIndex;
    }

    protected Logarithmic(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Logarithmic(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double logBase;
    private List<Logarithmic> setLogBase = new ArrayList<>();

    /**
     * Setter for Log base value.<br/>
<b>Note:</b> Affects tick values auto calculation.
     */
    public Logarithmic setLogBase(Double logBase) {
        if (jsBase == null) {
            this.logBase = logBase;
        } else {
            this.logBase = logBase;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".logBase(%f)", logBase));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".logBase(%f)", logBase));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLogBase() {
        if (!setLogBase.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Logarithmic item : setLogBase) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetLogBase());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
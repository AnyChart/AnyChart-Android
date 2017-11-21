package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class for creation of sets of similar labels and management of such sets.
Any individual label can be changed after all labels are displayed.
 */
public class CircularLabelsFactory extends UiLabelsFactory {

    public CircularLabelsFactory() {
        js.setLength(0);
        js.append("var circularLabelsFactory").append(++variableIndex).append(" = anychart.core.ui.circularLabelsFactory();");
        jsBase = "circularLabelsFactory" + variableIndex;
    }

    protected CircularLabelsFactory(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CircularLabelsFactory(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean autoRotate;
    private List<CircularLabelsFactory> setAutoRotate = new ArrayList<>();

    /**
     * Setter for labels rotation.<br/>
Auto rotates a labels around an anchor.
     */
    public CircularLabelsFactory setAutoRotate(Boolean autoRotate) {
        if (jsBase == null) {
            this.autoRotate = autoRotate;
        } else {
            this.autoRotate = autoRotate;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".autoRotate(%b)", autoRotate));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".autoRotate(%b)", autoRotate));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAutoRotate() {
        if (!setAutoRotate.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularLabelsFactory item : setAutoRotate) {
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

        js.append(generateJSsetAutoRotate());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
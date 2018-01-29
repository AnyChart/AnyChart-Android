package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Circle Class. Inherited from Ellipse.<br>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#circle} or
{@link anychart.graphics.vector.Layer#circle} methods, if you want to create an instance of primitive bound to a stage or a layer.
<br/> In case you need an unbound primitive – use {@link anychart.graphics#circle}.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#circle},<br/>
{@link anychart.graphics.vector.Layer#circle},<br/>
{@link anychart.graphics#circle}
 */
public class Circle extends VectorEllipse {

    public Circle() {
        js.setLength(0);
        js.append("var circle").append(++variableIndex).append(" = anychart.graphics.vector.circle();");
        jsBase = "circle" + variableIndex;
    }

    protected Circle(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Circle(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number radius;

    /**
     * Setter for the circle radius.
     */
    public Circle setRadius(Number radius) {
        if (jsBase == null) {
            this.radius = radius;
        } else {
            this.radius = radius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%s)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%s);", radius));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
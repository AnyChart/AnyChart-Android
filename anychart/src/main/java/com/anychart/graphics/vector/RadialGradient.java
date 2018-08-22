package com.anychart.graphics.vector;

import com.anychart.APIlib;
import com.anychart.JsObject;

// class
/**
 * Radial gradient.<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Shape#fill}
to create linear gradient.<br/>
See also:<br/>
{@link anychart.graphics.vector.Circle#fill}<br/>
{@link anychart.graphics.vector.Ellipse#fill}
 */
public class RadialGradient extends JsObject {

    protected RadialGradient() {

    }

    public static RadialGradient instantiate() {
        return new RadialGradient("new anychart.graphics.vector.radialGradient()");
    }

    

    public RadialGradient(String jsChart) {
        jsBase = "radialGradient" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Disposes gradient completely, removes from parent layer, null internal links, removes from DOM structure.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }

}
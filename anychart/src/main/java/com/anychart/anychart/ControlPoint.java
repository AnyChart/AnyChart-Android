package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Control point type definition.
 */
public class ControlPoint extends JsObject  {

    
    private Number height;
    private Number left;
    private Number right;

    
    public ControlPoint(Number height, Number left, Number right) {
        this.height = height;
        this.left = left;
        this.right = right;

        js.append(String.format(Locale.US, "{height: %s,left: %s,right: %s}",  height, left, right));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
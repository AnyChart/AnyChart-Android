package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ControlPoint extends JsObject  {

    
    private Double height;
    private Double left;
    private Double right;

    
    public ControlPoint(Double height, Double left, Double right) {
        this.height = height;
        this.left = left;
        this.right = right;

        js.append(String.format(Locale.US, "{height: %f,left: %f,right: %f}",  height, left, right));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
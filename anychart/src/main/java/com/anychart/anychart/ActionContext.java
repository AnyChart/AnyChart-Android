package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ActionContext extends JsObject  {

    
    private Chart chart;
    private Item item;
    private Point[] selectedPoints;
    private Element target;
    private VisualBase target1;
    private String type;

    
    public ActionContext(Element target, Chart chart, Item item, Point[] selectedPoints, String type) {
        this.target = target;
        this.chart = chart;
        this.item = item;
        this.selectedPoints = selectedPoints;
        this.type = type;

        js.append(String.format(Locale.US, "{target: %s,chart: %s,item: %s,selectedPoints: %s,type: %s}",  (target != null) ? target.generateJs() : "null", (chart != null) ? chart.generateJs() : "null", (item != null) ? item.generateJs() : "null", arrayToString(selectedPoints), type));
    }

    public ActionContext(VisualBase target1, Chart chart, Item item, Point[] selectedPoints, String type) {
        this.target1 = target1;
        this.chart = chart;
        this.item = item;
        this.selectedPoints = selectedPoints;
        this.type = type;

        js.append(String.format(Locale.US, "{target: %s,chart: %s,item: %s,selectedPoints: %s,type: %s}",  (target1 != null) ? target1.generateJs() : "null", (chart != null) ? chart.generateJs() : "null", (item != null) ? item.generateJs() : "null", arrayToString(selectedPoints), type));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}
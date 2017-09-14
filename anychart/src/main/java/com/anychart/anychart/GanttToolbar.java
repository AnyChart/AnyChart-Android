package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class GanttToolbar extends JsObject {

    
    private String element;
    private Element element1;

    public void setContainer(String element) {
        this.element = null;
        this.element1 = null;
        
        this.element = element;
    }


    public void setContainer(Element element1) {
        this.element = null;
        this.element1 = null;
        
        this.element1 = element1;
    }

    private PaperSize[] printPaperSizes;

    public void setPrintpapersizes(PaperSize[] printPaperSizes) {
        this.printPaperSizes = printPaperSizes;
    }

    private Chart target;

    public void setTarget(Chart target) {
        this.target = target;
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: \"%s\",", element);
        }
        return "";
    }

    private String generateJSelement1() {
        if (element1 != null) {
            return String.format(Locale.US, "element: %s,", (element1 != null) ? element1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSprintPaperSizes() {
        if (printPaperSizes != null) {
            return String.format(Locale.US, "printPaperSizes: %s,", arrayToString(printPaperSizes));
        }
        return "";
    }

    private String generateJStarget() {
        if (target != null) {
            return String.format(Locale.US, "target: %s,", (target != null) ? target.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSelement());
        js.append(generateJSelement1());
        js.append(generateJSprintPaperSizes());
        js.append(generateJStarget());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
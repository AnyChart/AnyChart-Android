package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class GanttToolbar extends JsObject {

    private String jsBase;

    public GanttToolbar() {

    }

    protected GanttToolbar(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Element getContainer;

    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String element;
    private Element element1;

    public void setContainer(String element) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element = element;
        } else {
            this.element = element;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", element));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", element));
                js.setLength(0);
            }
        }
    }


    public void setContainer(Element element1) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element1 = element1;
        } else {
            this.element1 = element1;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (element1 != null) ? element1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (element1 != null) ? element1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private PaperSize[] printPaperSizes;

    public void setPrintpapersizes(PaperSize[] printPaperSizes) {
        if (jsBase == null) {
            this.printPaperSizes = printPaperSizes;
        } else {
            this.printPaperSizes = printPaperSizes;

            js.append(String.format(Locale.US, jsBase + ".printPaperSizes(%s);", arrayToString(printPaperSizes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".printPaperSizes(%s);", arrayToString(printPaperSizes)));
                js.setLength(0);
            }
        }
    }

    private Chart getTarget;

    public Chart getTarget() {
        if (getTarget == null)
            getTarget = new Chart(jsBase + ".target()");

        return getTarget;
    }

    private Chart target;

    public void setTarget(Chart target) {
        if (jsBase == null) {
            this.target = target;
        } else {
            this.target = target;

            js.append(String.format(Locale.US, jsBase + ".target(%s);", (target != null) ? target.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s);", (target != null) ? target.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetTarget() {
        if (getTarget != null) {
            return getTarget.generateJs();
        }
        return "";
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: %s,", element);
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSelement());
            js.append(generateJSelement1());
            js.append(generateJSprintPaperSizes());
            js.append(generateJStarget());
            js.append("}");
        }
            js.append(generateJSgetContainer());
            js.append(generateJSgetTarget());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
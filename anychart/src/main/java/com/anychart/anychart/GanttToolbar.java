package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The GanttToolbar class contains methods for configuring toolbar.<br/>
Toolbar is a part of Gantt chart. Toolbar contains menu Print with options print A4 - A0, buttons ZoomIn, ZoomOut,
FitAll, ExpandAll/CollapseAll and menu with option Save As (SVG, PNG, JPG, PDF).
 */
public class GanttToolbar extends JsObject {

    public GanttToolbar() {
        js.setLength(0);
        js.append("var ganttToolbar").append(++variableIndex).append(" = anychart.ui.ganttToolbar();");
        jsBase = "ganttToolbar" + variableIndex;
    }

    protected GanttToolbar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GanttToolbar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the Gantt chart toolbar container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String element;
    private Element element1;

    /**
     * Setter for the Gantt chart toolbar container.
     */
    public GanttToolbar setContainer(String element) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element = element;
        } else {
            this.element = element;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(element)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(element)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Gantt chart toolbar container.
     */
    public GanttToolbar setContainer(Element element1) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element1 = element1;
        } else {
            this.element1 = element1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(element1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((element1 != null) ? element1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((element1 != null) ? element1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private PaperSize[] printPaperSizes;

    /**
     * Setter for the print paper sizes.
     */
    public GanttToolbar setPrintPaperSizes(PaperSize[] printPaperSizes) {
        if (jsBase == null) {
            this.printPaperSizes = printPaperSizes;
        } else {
            this.printPaperSizes = printPaperSizes;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".printPaperSizes(%s)", arrayToString(printPaperSizes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".printPaperSizes(%s);", arrayToString(printPaperSizes)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Chart getTarget;

    /**
     * Getter for the toolbar target.
     */
    public Chart getTarget() {
        if (getTarget == null)
            getTarget = new Chart(jsBase + ".target()");

        return getTarget;
    }

    private Chart target;

    /**
     * Setter for the toolbar target.
     */
    public GanttToolbar setTarget(Chart target) {
        if (jsBase == null) {
            this.target = target;
        } else {
            this.target = target;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(target.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".target(%s);",  ((target != null) ? target.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s);", ((target != null) ? target.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetTarget());

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
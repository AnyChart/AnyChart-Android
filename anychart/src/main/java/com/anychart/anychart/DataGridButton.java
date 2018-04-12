package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Collapse-expand button.
 */
public class DataGridButton extends VisualBase {

    public DataGridButton() {
        js.setLength(0);
        js.append("var dataGridButton").append(++variableIndex).append(" = anychart.core.gantt.dataGridButton();");
        jsBase = "dataGridButton" + variableIndex;
    }

    protected DataGridButton(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DataGridButton(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String cursorType;
    private EnumsCursor cursorType1;

    /**
     * Setter for the cursor type.
     */
    public DataGridButton setCursor(String cursorType) {
        if (jsBase == null) {
            this.cursorType = null;
            this.cursorType1 = null;
            
            this.cursorType = cursorType;
        } else {
            this.cursorType = cursorType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cursor(%s)", wrapQuotes(cursorType)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cursor(%s);", wrapQuotes(cursorType)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the cursor type.
     */
    public DataGridButton setCursor(EnumsCursor cursorType1) {
        if (jsBase == null) {
            this.cursorType = null;
            this.cursorType1 = null;
            
            this.cursorType1 = cursorType1;
        } else {
            this.cursorType1 = cursorType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cursor(%s)", ((cursorType1 != null) ? cursorType1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cursor(%s);", ((cursorType1 != null) ? cursorType1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number size;

    /**
     * Setter for the buttons size.
     */
    public DataGridButton setSize(Number size) {
        if (jsBase == null) {
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%s)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".size(%s);", size));
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
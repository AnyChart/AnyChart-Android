package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Data grid column.
 */
public class DatagridColumn extends VisualBase {

    public DatagridColumn() {
        js.setLength(0);
        js.append("var datagridColumn").append(++variableIndex).append(" = anychart.core.ui.DataGrid.column();");
        jsBase = "datagridColumn" + variableIndex;
    }

    protected DatagridColumn(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DatagridColumn(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean collapseExpandButtons;

    /**
     * Setter for expanding or collapse buttons.
     */
    public DatagridColumn setCollapseExpandButtons(Boolean collapseExpandButtons) {
        if (jsBase == null) {
            this.collapseExpandButtons = collapseExpandButtons;
        } else {
            this.collapseExpandButtons = collapseExpandButtons;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".collapseExpandButtons(%b)", collapseExpandButtons));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".collapseExpandButtons(%b);", collapseExpandButtons));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number defaultWidth;

    /**
     * Setter for the column default width.
     */
    public DatagridColumn setDefaultWidth(Number defaultWidth) {
        if (jsBase == null) {
            this.defaultWidth = defaultWidth;
        } else {
            this.defaultWidth = defaultWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultWidth(%s)", defaultWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultWidth(%s);", defaultWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number depthPaddingMultiplier;

    /**
     * Setter for the multiplier to choose a left padding.
     */
    public DatagridColumn setDepthPaddingMultiplier(Number depthPaddingMultiplier) {
        if (jsBase == null) {
            this.depthPaddingMultiplier = depthPaddingMultiplier;
        } else {
            this.depthPaddingMultiplier = depthPaddingMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".depthPaddingMultiplier(%s)", depthPaddingMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".depthPaddingMultiplier(%s);", depthPaddingMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for labels settings of a column.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String fieldName;
    private ColumnFormats presetValue;
    private String presetValue1;

    /**
     * Sets column format using enum.
     */
    public DatagridColumn setSetColumnFormat(String fieldName, ColumnFormats presetValue) {
        if (jsBase == null) {
            this.fieldName = fieldName;
            this.presetValue = null;
            this.presetValue1 = null;
            
            this.presetValue = presetValue;
        } else {
            this.fieldName = fieldName;
            this.presetValue = presetValue;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", wrapQuotes(fieldName), ((presetValue != null) ? presetValue.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", wrapQuotes(fieldName), ((presetValue != null) ? presetValue.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets column format using enum.
     */
    public DatagridColumn setSetColumnFormat(String fieldName, String presetValue1) {
        if (jsBase == null) {
            this.fieldName = fieldName;
            this.presetValue = null;
            this.presetValue1 = null;
            
            this.presetValue1 = presetValue1;
        } else {
            this.fieldName = fieldName;
            this.presetValue1 = presetValue1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", wrapQuotes(fieldName), wrapQuotes(presetValue1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", wrapQuotes(fieldName), wrapQuotes(presetValue1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName1;
    private String settings;
    private UiTitle getTitle;

    /**
     * Getter for the column title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    /**
     * Setter for the column title.
     */
    public DatagridColumn setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column title.
     */
    public DatagridColumn setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number width;
    private String width1;

    /**
     * Setter for the column width.
     */
    public DatagridColumn setWidth(Number width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column width.
     */
    public DatagridColumn setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetTitle());

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
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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

    
    private EnumsCursor valueCursor;
    private String valueCursor1;

    /**
     * Setter for the button cursor.
     */
    public DatagridColumn setButtonCursor(EnumsCursor valueCursor) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor = valueCursor;
        } else {
            this.valueCursor = valueCursor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".buttonCursor(%s)", ((valueCursor != null) ? valueCursor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".buttonCursor(%s);", ((valueCursor != null) ? valueCursor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the button cursor.
     */
    public DatagridColumn setButtonCursor(String valueCursor1) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor1 = valueCursor1;
        } else {
            this.valueCursor1 = valueCursor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".buttonCursor(%s)", wrapQuotes(valueCursor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".buttonCursor(%s);", wrapQuotes(valueCursor1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getCellTextSettings;

    /**
     * Getter for the label factory.
     */
    public UiLabelsFactory getCellTextSettings() {
        if (getCellTextSettings == null)
            getCellTextSettings = new UiLabelsFactory(jsBase + ".cellTextSettings()");

        return getCellTextSettings;
    }

    private String cellTextSettings;

    /**
     * Setter for label factory to decorate cells.
     */
    public DatagridColumn setCellTextSettings(String cellTextSettings) {
        if (jsBase == null) {
            this.cellTextSettings = cellTextSettings;
        } else {
            this.cellTextSettings = cellTextSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cellTextSettings(%s)", wrapQuotes(cellTextSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellTextSettings(%s);", wrapQuotes(cellTextSettings)));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJSgetCellTextSettings() {
        if (getCellTextSettings != null) {
            return getCellTextSettings.generateJs();
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

    
        jsGetters.append(generateJSgetCellTextSettings());
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
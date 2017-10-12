package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class DatagridColumn extends VisualBase {

    public DatagridColumn() {

    }

    protected DatagridColumn(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DatagridColumn(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private EnumsCursor valueCursor;
    private String valueCursor1;

    public DatagridColumn setButtonCursor(EnumsCursor valueCursor) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor = valueCursor;
        } else {
            this.valueCursor = valueCursor;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".buttonCursor(%s)", (valueCursor != null) ? valueCursor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".buttonCursor(%s)", (valueCursor != null) ? valueCursor.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public DatagridColumn setButtonCursor(String valueCursor1) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor1 = valueCursor1;
        } else {
            this.valueCursor1 = valueCursor1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".buttonCursor(%s)", valueCursor1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".buttonCursor(%s)", valueCursor1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getCellTextSettings;

    public UiLabelsFactory getCellTextSettings() {
        if (getCellTextSettings == null)
            getCellTextSettings = new UiLabelsFactory(jsBase + ".cellTextSettings()");

        return getCellTextSettings;
    }

    private String cellTextSettings;

    public DatagridColumn setCellTextSettings(String cellTextSettings) {
        if (jsBase == null) {
            this.cellTextSettings = cellTextSettings;
        } else {
            this.cellTextSettings = cellTextSettings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cellTextSettings(%s)", cellTextSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellTextSettings(%s)", cellTextSettings));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean collapseExpandButtons;

    public DatagridColumn setCollapseExpandButtons(Boolean collapseExpandButtons) {
        if (jsBase == null) {
            this.collapseExpandButtons = collapseExpandButtons;
        } else {
            this.collapseExpandButtons = collapseExpandButtons;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".collapseExpandButtons(%b)", collapseExpandButtons));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".collapseExpandButtons(%b)", collapseExpandButtons));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double defaultWidth;

    public DatagridColumn setDefaultWidth(Double defaultWidth) {
        if (jsBase == null) {
            this.defaultWidth = defaultWidth;
        } else {
            this.defaultWidth = defaultWidth;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".defaultWidth(%f)", defaultWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultWidth(%f)", defaultWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double depthPaddingMultiplier;

    public DatagridColumn setDepthPaddingMultiplier(Double depthPaddingMultiplier) {
        if (jsBase == null) {
            this.depthPaddingMultiplier = depthPaddingMultiplier;
        } else {
            this.depthPaddingMultiplier = depthPaddingMultiplier;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".depthPaddingMultiplier(%f)", depthPaddingMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".depthPaddingMultiplier(%f)", depthPaddingMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName;
    private ColumnFormats presetValue;

    public DatagridColumn setSetColumnFormat(String fieldName, ColumnFormats presetValue) {
        if (jsBase == null) {
            this.fieldName = fieldName;
            this.presetValue = presetValue;
        } else {
            this.fieldName = fieldName;
            this.presetValue = presetValue;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", fieldName, (presetValue != null) ? presetValue.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setColumnFormat(%s, %s)", fieldName, (presetValue != null) ? presetValue.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName1;
    private String settings;

    public DatagridColumn setSetColumnFormat(String fieldName1, String settings) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            
            this.fieldName1 = fieldName1;
            this.settings = settings;
        } else {
            this.fieldName1 = fieldName1;
            this.settings = settings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", fieldName1, settings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setColumnFormat(%s, %s)", fieldName1, settings));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public DatagridColumn setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%b)", title));
                js.setLength(0);
            }
        }
        return this;
    }


    public DatagridColumn setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".title(%s)", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", title1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    public DatagridColumn setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }


    public DatagridColumn setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", width1));
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

    private String generateJSvalueCursor() {
        if (valueCursor != null) {
            return String.format(Locale.US, "valueCursor: %s,", (valueCursor != null) ? valueCursor.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvalueCursor1() {
        if (valueCursor1 != null) {
            return String.format(Locale.US, "valueCursor: %s,", valueCursor1);
        }
        return "";
    }

    private String generateJScellTextSettings() {
        if (cellTextSettings != null) {
            return String.format(Locale.US, "cellTextSettings: %s,", cellTextSettings);
        }
        return "";
    }

    private String generateJScollapseExpandButtons() {
        if (collapseExpandButtons != null) {
            return String.format(Locale.US, "collapseExpandButtons: %b,", collapseExpandButtons);
        }
        return "";
    }

    private String generateJSdefaultWidth() {
        if (defaultWidth != null) {
            return String.format(Locale.US, "defaultWidth: %f,", defaultWidth);
        }
        return "";
    }

    private String generateJSdepthPaddingMultiplier() {
        if (depthPaddingMultiplier != null) {
            return String.format(Locale.US, "depthPaddingMultiplier: %f,", depthPaddingMultiplier);
        }
        return "";
    }

    private String generateJSfieldName() {
        if (fieldName != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName);
        }
        return "";
    }

    private String generateJSpresetValue() {
        if (presetValue != null) {
            return String.format(Locale.US, "presetValue: %s,", (presetValue != null) ? presetValue.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfieldName1() {
        if (fieldName1 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName1);
        }
        return "";
    }

    private String generateJSsettings() {
        if (settings != null) {
            return String.format(Locale.US, "settings: %s,", settings);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStitle2() {
        if (title2 != null) {
            return String.format(Locale.US, "title: %s,", title2);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSvalueCursor());
            js.append(generateJSvalueCursor1());
            js.append(generateJScellTextSettings());
            js.append(generateJScollapseExpandButtons());
            js.append(generateJSdefaultWidth());
            js.append(generateJSdepthPaddingMultiplier());
            js.append(generateJSfieldName());
            js.append(generateJSpresetValue());
            js.append(generateJSfieldName1());
            js.append(generateJSsettings());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitle2());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
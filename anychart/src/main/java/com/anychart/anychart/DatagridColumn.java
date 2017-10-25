package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".buttonCursor(%s)", ((valueCursor != null) ? valueCursor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".buttonCursor(%s)", ((valueCursor != null) ? valueCursor.generateJs() : "null")));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".buttonCursor(%s)", wrapQuotes(valueCursor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".buttonCursor(%s)", wrapQuotes(valueCursor1)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cellTextSettings(%s)", wrapQuotes(cellTextSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellTextSettings(%s)", wrapQuotes(cellTextSettings)));
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
    private String presetValue1;

    public DatagridColumn setSetColumnFormat(ColumnFormats presetValue, String fieldName) {
        if (jsBase == null) {
            this.presetValue = null;
            this.presetValue1 = null;
            
            this.presetValue = presetValue;
            this.fieldName = fieldName;
        } else {
            this.presetValue = presetValue;
            this.fieldName = fieldName;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", ((presetValue != null) ? presetValue.generateJs() : "null"), wrapQuotes(fieldName)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setColumnFormat(%s, %s)", ((presetValue != null) ? presetValue.generateJs() : "null"), wrapQuotes(fieldName)));
                js.setLength(0);
            }
        }
        return this;
    }


    public DatagridColumn setSetColumnFormat(String presetValue1, String fieldName) {
        if (jsBase == null) {
            this.presetValue = null;
            this.presetValue1 = null;
            
            this.presetValue1 = presetValue1;
            this.fieldName = fieldName;
        } else {
            this.presetValue1 = presetValue1;
            this.fieldName = fieldName;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setColumnFormat(%s, %s)", wrapQuotes(presetValue1), wrapQuotes(fieldName)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setColumnFormat(%s, %s)", wrapQuotes(presetValue1), wrapQuotes(fieldName)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName1;
    private String settings;
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSUiLabelsFactory getCellTextSettings() {
//        if (UiLabelsFactory getCellTextSettings != null) {
//            return UiLabelsFactory getCellTextSettings.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiTitle getTitle() {
//        if (UiTitle getTitle != null) {
//            return UiTitle getTitle.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetCellTextSettings() {
        if (getCellTextSettings != null) {
            return getCellTextSettings.generateJs();
            //return String.format(Locale.US, "getCellTextSettings: %s,", ((getCellTextSettings != null) ? getCellTextSettings.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
            //return String.format(Locale.US, "getTitle: %s,", ((getTitle != null) ? getTitle.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSvalueCursor());
////        
//            js.append(generateJSvalueCursor1());
////        
//            js.append(generateJScellTextSettings());
////        
//            js.append(generateJScollapseExpandButtons());
////        
//            js.append(generateJSdefaultWidth());
////        
//            js.append(generateJSdepthPaddingMultiplier());
////        
//            js.append(generateJSfieldName());
////        
//            js.append(generateJSpresetValue());
////        
//            js.append(generateJSpresetValue1());
////        
//            js.append(generateJSfieldName1());
////        
//            js.append(generateJSsettings());
////        
//            js.append(generateJStitle());
////        
//            js.append(generateJStitle1());
////        
//            js.append(generateJStitle2());
////        
//            js.append(generateJSwidth());
////        
//            js.append(generateJSwidth1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
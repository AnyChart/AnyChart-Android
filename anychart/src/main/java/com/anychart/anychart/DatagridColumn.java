package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class DatagridColumn extends JsObject {

    private String jsBase;

    public DatagridColumn() {

    }

    protected DatagridColumn(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private EnumsCursor valueCursor;
    private String valueCursor1;

    public void setButtoncursor(EnumsCursor valueCursor) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor = valueCursor;
        } else {
            this.valueCursor = valueCursor;

            js.append(String.format(Locale.US, jsBase + ".buttonCursor(%s);", (valueCursor != null) ? valueCursor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".buttonCursor(%s);", (valueCursor != null) ? valueCursor.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setButtoncursor(String valueCursor1) {
        if (jsBase == null) {
            this.valueCursor = null;
            this.valueCursor1 = null;
            
            this.valueCursor1 = valueCursor1;
        } else {
            this.valueCursor1 = valueCursor1;

            js.append(String.format(Locale.US, jsBase + ".buttonCursor(%s);", valueCursor1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".buttonCursor(%s);", valueCursor1));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getcellTextSettings;

    public UiLabelsFactory getCelltextsettings() {
        if (getcellTextSettings == null)
            getcellTextSettings = new UiLabelsFactory(jsBase + ".cellTextSettings()");

        return getcellTextSettings;
    }

    private String cellTextSettings;

    public void setCelltextsettings(String cellTextSettings) {
        if (jsBase == null) {
            this.cellTextSettings = cellTextSettings;
        } else {
            this.cellTextSettings = cellTextSettings;

            js.append(String.format(Locale.US, jsBase + ".cellTextSettings(%s);", cellTextSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellTextSettings(%s);", cellTextSettings));
                js.setLength(0);
            }
        }
    }

    private Boolean collapseExpandButtons;

    public void setCollapseexpandbuttons(Boolean collapseExpandButtons) {
        if (jsBase == null) {
            this.collapseExpandButtons = collapseExpandButtons;
        } else {
            this.collapseExpandButtons = collapseExpandButtons;

            js.append(String.format(Locale.US, jsBase + ".collapseExpandButtons(%b);", collapseExpandButtons));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".collapseExpandButtons(%b);", collapseExpandButtons));
                js.setLength(0);
            }
        }
    }

    private Double defaultWidth;

    public void setDefaultwidth(Double defaultWidth) {
        if (jsBase == null) {
            this.defaultWidth = defaultWidth;
        } else {
            this.defaultWidth = defaultWidth;

            js.append(String.format(Locale.US, jsBase + ".defaultWidth(%f);", defaultWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultWidth(%f);", defaultWidth));
                js.setLength(0);
            }
        }
    }

    private Double depthPaddingMultiplier;

    public void setDepthpaddingmultiplier(Double depthPaddingMultiplier) {
        if (jsBase == null) {
            this.depthPaddingMultiplier = depthPaddingMultiplier;
        } else {
            this.depthPaddingMultiplier = depthPaddingMultiplier;

            js.append(String.format(Locale.US, jsBase + ".depthPaddingMultiplier(%f);", depthPaddingMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".depthPaddingMultiplier(%f);", depthPaddingMultiplier));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private String fieldName;
    private ColumnFormats presetValue;

    public void setSetcolumnformat(String fieldName, ColumnFormats presetValue) {
        if (jsBase == null) {
            this.fieldName = fieldName;
            this.presetValue = presetValue;
        } else {
            this.fieldName = fieldName;
            this.presetValue = presetValue;

            js.append(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", fieldName, (presetValue != null) ? presetValue.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", fieldName, (presetValue != null) ? presetValue.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String fieldName1;
    private String settings;

    public void setSetcolumnformat(String fieldName1, String settings) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            
            this.fieldName1 = fieldName1;
            this.settings = settings;
        } else {
            this.fieldName1 = fieldName1;
            this.settings = settings;

            js.append(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", fieldName1, settings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", fieldName1, settings));
                js.setLength(0);
            }
        }
    }

    private UiTitle gettitle;

    public UiTitle getTitle() {
        if (gettitle == null)
            gettitle = new UiTitle(jsBase + ".title()");

        return gettitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%b);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
    }


    public void setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetcellTextSettings() {
        if (getcellTextSettings != null) {
            return getcellTextSettings.generateJs();
        }
        return "";
    }

    private String generateJSgettitle() {
        if (gettitle != null) {
            return gettitle.generateJs();
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

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSvalueCursor());
            js.append(generateJSvalueCursor1());
            js.append(generateJScellTextSettings());
            js.append(generateJScollapseExpandButtons());
            js.append(generateJSdefaultWidth());
            js.append(generateJSdepthPaddingMultiplier());
            js.append(generateJSenabled());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSfieldName());
            js.append(generateJSpresetValue());
            js.append(generateJSfieldName1());
            js.append(generateJSsettings());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitle2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetcellTextSettings());
            js.append(generateJSgettitle());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
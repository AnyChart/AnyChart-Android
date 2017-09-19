package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DatagridColumn extends JsObject {

    
    private EnumsCursor valueCursor;
    private String valueCursor1;

    public void setButtoncursor(EnumsCursor valueCursor) {
        this.valueCursor = null;
        this.valueCursor1 = null;
        
        this.valueCursor = valueCursor;
    }


    public void setButtoncursor(String valueCursor1) {
        this.valueCursor = null;
        this.valueCursor1 = null;
        
        this.valueCursor1 = valueCursor1;
    }

    private Boolean collapseExpandButtons;

    public void setCollapseexpandbuttons(Boolean collapseExpandButtons) {
        this.collapseExpandButtons = collapseExpandButtons;
    }

    private Double defaultWidth;

    public void setDefaultwidth(Double defaultWidth) {
        this.defaultWidth = defaultWidth;
    }

    private Double depthPaddingMultiplier;

    public void setDepthpaddingmultiplier(Double depthPaddingMultiplier) {
        this.depthPaddingMultiplier = depthPaddingMultiplier;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String fieldName;
    private ColumnFormats presetValue;

    public void setSetcolumnformat(String fieldName, ColumnFormats presetValue) {
        this.fieldName = fieldName;
        this.presetValue = presetValue;
    }

    private String fieldName1;

    public void setSetcolumnformat(String fieldName1) {
        this.fieldName = null;
        this.fieldName1 = null;
        
        this.fieldName1 = fieldName1;
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        this.title = null;
        this.title1 = null;
        
        this.title = title;
    }


    public void setTitle(String title1) {
        this.title = null;
        this.title1 = null;
        
        this.title1 = title1;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        this.width = null;
        this.width1 = null;
        
        this.width = width;
    }


    public void setWidth(String width1) {
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
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

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
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
        js.append("{");
        js.append(generateJSvalueCursor());
        js.append(generateJSvalueCursor1());
        js.append(generateJScollapseExpandButtons());
        js.append(generateJSdefaultWidth());
        js.append(generateJSdepthPaddingMultiplier());
        js.append(generateJSenabled());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSfieldName());
        js.append(generateJSpresetValue());
        js.append(generateJSfieldName1());
        js.append(generateJStitle());
        js.append(generateJStitle1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class StockDateTime extends JsObject {

    
    private Boolean background;
    private String background1;

    public void setBackground(Boolean background) {
        this.background = null;
        this.background1 = null;
        
        this.background = background;
    }


    public void setBackground(String background1) {
        this.background = null;
        this.background1 = null;
        
        this.background1 = background1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Double height;

    public void setHeight(Double height) {
        this.height = height;
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;
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

    private Boolean minorLabels;

    public void setMinorlabels(Boolean minorLabels) {
        this.minorLabels = minorLabels;
    }

    private Boolean minorTicks;

    public void setMinorticks(Boolean minorTicks) {
        this.minorTicks = minorTicks;
    }

    private StockLabelsOverlapMode overlapMode;

    public void setOverlapmode(StockLabelsOverlapMode overlapMode) {
        this.overlapMode = overlapMode;
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

    private Boolean showHelperLabel;

    public void setShowhelperlabel(Boolean showHelperLabel) {
        this.showHelperLabel = showHelperLabel;
    }

    private Boolean ticks;

    public void setTicks(Boolean ticks) {
        this.ticks = ticks;
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

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %b,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %s,", background1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %b,", labels);
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

    private String generateJSminorLabels() {
        if (minorLabels != null) {
            return String.format(Locale.US, "minorLabels: %b,", minorLabels);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %b,", minorTicks);
        }
        return "";
    }

    private String generateJSoverlapMode() {
        if (overlapMode != null) {
            return String.format(Locale.US, "overlapMode: %s,", (overlapMode != null) ? overlapMode.generateJs() : "null");
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

    private String generateJSshowHelperLabel() {
        if (showHelperLabel != null) {
            return String.format(Locale.US, "showHelperLabel: %b,", showHelperLabel);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %b,", ticks);
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

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSbackground());
        js.append(generateJSbackground1());
        js.append(generateJSenabled());
        js.append(generateJSheight());
        js.append(generateJSlabels());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSminorLabels());
        js.append(generateJSminorTicks());
        js.append(generateJSoverlapMode());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSshowHelperLabel());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
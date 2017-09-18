package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Tooltip extends JsObject {

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private Boolean adjustByHeight;

    public void setAdjustfontsize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        this.adjustOrAdjustByWidth = null;
        this.adjustOrAdjustByWidth1 = null;
        
        this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
        this.adjustByHeight = adjustByHeight;
    }


    public void setAdjustfontsize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
        this.adjustOrAdjustByWidth = null;
        this.adjustOrAdjustByWidth1 = null;
        
        this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
        this.adjustByHeight = adjustByHeight;
    }

    private Boolean allowLeaveChart;

    public void setAllowleavechart(Boolean allowLeaveChart) {
        this.allowLeaveChart = allowLeaveChart;
    }

    private Boolean allowLeaveScreen;

    public void setAllowleavescreen(Boolean allowLeaveScreen) {
        this.allowLeaveScreen = allowLeaveScreen;
    }

    private Boolean allowLeaveStage;

    public void setAllowleavestage(Boolean allowLeaveStage) {
        this.allowLeaveStage = allowLeaveStage;
    }

    private Anchor anchor;
    private String anchor1;

    public void setAnchor(Anchor anchor) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor = anchor;
    }


    public void setAnchor(String anchor1) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor1 = anchor1;
    }

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

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        this.disablePointerEvents = disablePointerEvents;
    }

    private TooltipDisplayMode displayMode;
    private String displayMode1;

    public void setDisplaymode(TooltipDisplayMode displayMode) {
        this.displayMode = null;
        this.displayMode1 = null;
        
        this.displayMode = displayMode;
    }


    public void setDisplaymode(String displayMode1) {
        this.displayMode = null;
        this.displayMode1 = null;
        
        this.displayMode1 = displayMode1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        this.fontColor = fontColor;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration = fontDecoration;
    }


    public void setFontdecoration(String fontDecoration1) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration1 = fontDecoration1;
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    private Double fontSize;
    private String fontSize1;

    public void setFontsize(Double fontSize) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize = fontSize;
    }


    public void setFontsize(String fontSize1) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize1 = fontSize1;
    }

    private String fontStyle;
    private FontStyle fontStyle1;

    public void setFontstyle(String fontStyle) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle = fontStyle;
    }


    public void setFontstyle(FontStyle fontStyle1) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle1 = fontStyle1;
    }

    private String fontVariant;
    private FontVariant fontVariant1;

    public void setFontvariant(String fontVariant) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant = fontVariant;
    }


    public void setFontvariant(FontVariant fontVariant1) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant1 = fontVariant1;
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight = fontWeight;
    }


    public void setFontweight(Double fontWeight1) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight1 = fontWeight1;
    }

    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    private String hAlign;
    private HAlign hAlign1;

    public void setHalign(String hAlign) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign = hAlign;
    }


    public void setHalign(HAlign hAlign1) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign1 = hAlign1;
    }

    private String height;
    private Double height1;

    public void setHeight(String height) {
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setHeight(Double height1) {
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }

    private Boolean force;

    public void setHide(Boolean force) {
        this.force = force;
    }

    private Double hideDelay;

    public void setHidedelay(Double hideDelay) {
        this.hideDelay = hideDelay;
    }

    private Double letterSpacing;

    public void setLetterspacing(Double letterSpacing) {
        this.letterSpacing = letterSpacing;
    }

    private Double lineHeight;
    private String lineHeight1;

    public void setLineheight(Double lineHeight) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight = lineHeight;
    }


    public void setLineheight(String lineHeight1) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight1 = lineHeight1;
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

    private Double maxFontSize;
    private String maxFontSize1;

    public void setMaxfontsize(Double maxFontSize) {
        this.maxFontSize = null;
        this.maxFontSize1 = null;
        
        this.maxFontSize = maxFontSize;
    }


    public void setMaxfontsize(String maxFontSize1) {
        this.maxFontSize = null;
        this.maxFontSize1 = null;
        
        this.maxFontSize1 = maxFontSize1;
    }

    private Double minFontSize;
    private String minFontSize1;

    public void setMinfontsize(Double minFontSize) {
        this.minFontSize = null;
        this.minFontSize1 = null;
        
        this.minFontSize = minFontSize;
    }


    public void setMinfontsize(String minFontSize1) {
        this.minFontSize = null;
        this.minFontSize1 = null;
        
        this.minFontSize1 = minFontSize1;
    }

    private Double offsetX;

    public void setOffsetx(Double offsetX) {
        this.offsetX = offsetX;
    }

    private Double offsetY;

    public void setOffsety(Double offsetY) {
        this.offsetY = offsetY;
    }

    private Double[] padding;
    private String[] padding1;

    public void setPadding(Double[] padding) {
        this.padding = null;
        this.padding1 = null;
        
        this.padding = padding;
    }


    public void setPadding(String[] padding1) {
        this.padding = null;
        this.padding1 = null;
        
        this.padding1 = padding1;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setPadding(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value6 = value6;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
    }


    public void setPadding(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value7 = value7;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
    }

    private Position position;
    private String position1;

    public void setPosition(Position position) {
        this.position = null;
        this.position1 = null;
        
        this.position = position;
    }


    public void setPosition(String position1) {
        this.position = null;
        this.position1 = null;
        
        this.position1 = position1;
    }

    private String positionMode;
    private TooltipPositionMode positionMode1;

    public void setPositionmode(String positionMode) {
        this.positionMode = null;
        this.positionMode1 = null;
        
        this.positionMode = positionMode;
    }


    public void setPositionmode(TooltipPositionMode positionMode1) {
        this.positionMode = null;
        this.positionMode1 = null;
        
        this.positionMode1 = positionMode1;
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

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    private Boolean separator;

    public void setSeparator(Boolean separator) {
        this.separator = separator;
    }

    private String textDirection;
    private Direction textDirection1;

    public void setTextdirection(String textDirection) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection = textDirection;
    }


    public void setTextdirection(Direction textDirection1) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection1 = textDirection1;
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        this.textIndent = textIndent;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow = textOverflow;
    }


    public void setTextoverflow(String textOverflow1) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow1 = textOverflow1;
    }

    private String name;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings = textSettings;
        this.name = name;
    }


    public void setTextsettings(Double textSettings1, String name) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings1 = textSettings1;
        this.name = name;
    }


    public void setTextsettings(Boolean textSettings2, String name) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings2 = textSettings2;
        this.name = name;
    }

    private String textWrap;
    private TextWrap textWrap1;

    public void setTextwrap(String textWrap) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap = textWrap;
    }


    public void setTextwrap(TextWrap textWrap1) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap1 = textWrap1;
    }

    private Boolean title;

    public void setTitle(Boolean title) {
        this.title = title;
    }

    private String titleFormat;

    public void setTitleformat(String titleFormat) {
        this.titleFormat = titleFormat;
    }

    private String unionFormat;

    public void setUnionformat(String unionFormat) {
        this.unionFormat = unionFormat;
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

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        this.useHtml = useHtml;
    }

    private String vAlign;
    private VAlign vAlign1;

    public void setValign(String vAlign) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign = vAlign;
    }


    public void setValign(VAlign vAlign1) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign1 = vAlign1;
    }

    private String valuePostfix;

    public void setValuepostfix(String valuePostfix) {
        this.valuePostfix = valuePostfix;
    }

    private String valuePrefix;

    public void setValueprefix(String valuePrefix) {
        this.valuePrefix = valuePrefix;
    }

    private String width;
    private Double width1;

    public void setWidth(String width) {
        this.width = null;
        this.width1 = null;
        
        this.width = width;
    }


    public void setWidth(Double width1) {
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSadjustOrAdjustByWidth() {
        if (adjustOrAdjustByWidth != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %b,", adjustOrAdjustByWidth);
        }
        return "";
    }

    private String generateJSadjustOrAdjustByWidth1() {
        if (adjustOrAdjustByWidth1 != null) {
            return String.format(Locale.US, "adjustOrAdjustByWidth: %s,", Arrays.toString(adjustOrAdjustByWidth1));
        }
        return "";
    }

    private String generateJSadjustByHeight() {
        if (adjustByHeight != null) {
            return String.format(Locale.US, "adjustByHeight: %b,", adjustByHeight);
        }
        return "";
    }

    private String generateJSallowLeaveChart() {
        if (allowLeaveChart != null) {
            return String.format(Locale.US, "allowLeaveChart: %b,", allowLeaveChart);
        }
        return "";
    }

    private String generateJSallowLeaveScreen() {
        if (allowLeaveScreen != null) {
            return String.format(Locale.US, "allowLeaveScreen: %b,", allowLeaveScreen);
        }
        return "";
    }

    private String generateJSallowLeaveStage() {
        if (allowLeaveStage != null) {
            return String.format(Locale.US, "allowLeaveStage: %b,", allowLeaveStage);
        }
        return "";
    }

    private String generateJSanchor() {
        if (anchor != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor != null) ? anchor.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor1() {
        if (anchor1 != null) {
            return String.format(Locale.US, "anchor: %s,", anchor1);
        }
        return "";
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

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdisplayMode() {
        if (displayMode != null) {
            return String.format(Locale.US, "displayMode: %s,", (displayMode != null) ? displayMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdisplayMode1() {
        if (displayMode1 != null) {
            return String.format(Locale.US, "displayMode: %s,", displayMode1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle);
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle1 != null) ? fontStyle1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant);
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant1 != null) ? fontVariant1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: %s,", format);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign);
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign1 != null) ? hAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %s,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJSforce() {
        if (force != null) {
            return String.format(Locale.US, "force: %b,", force);
        }
        return "";
    }

    private String generateJShideDelay() {
        if (hideDelay != null) {
            return String.format(Locale.US, "hideDelay: %f,", hideDelay);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight1);
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

    private String generateJSmaxFontSize() {
        if (maxFontSize != null) {
            return String.format(Locale.US, "maxFontSize: %f,", maxFontSize);
        }
        return "";
    }

    private String generateJSmaxFontSize1() {
        if (maxFontSize1 != null) {
            return String.format(Locale.US, "maxFontSize: %s,", maxFontSize1);
        }
        return "";
    }

    private String generateJSminFontSize() {
        if (minFontSize != null) {
            return String.format(Locale.US, "minFontSize: %f,", minFontSize);
        }
        return "";
    }

    private String generateJSminFontSize1() {
        if (minFontSize1 != null) {
            return String.format(Locale.US, "minFontSize: %s,", minFontSize1);
        }
        return "";
    }

    private String generateJSoffsetX() {
        if (offsetX != null) {
            return String.format(Locale.US, "offsetX: %f,", offsetX);
        }
        return "";
    }

    private String generateJSoffsetY() {
        if (offsetY != null) {
            return String.format(Locale.US, "offsetY: %f,", offsetY);
        }
        return "";
    }

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
        }
        return "";
    }

    private String generateJSpositionMode() {
        if (positionMode != null) {
            return String.format(Locale.US, "positionMode: %s,", positionMode);
        }
        return "";
    }

    private String generateJSpositionMode1() {
        if (positionMode1 != null) {
            return String.format(Locale.US, "positionMode: %s,", (positionMode1 != null) ? positionMode1.generateJs() : "null");
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

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJSseparator() {
        if (separator != null) {
            return String.format(Locale.US, "separator: %b,", separator);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection);
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection1 != null) ? textDirection1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap);
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap1 != null) ? textWrap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: %s,", titleFormat);
        }
        return "";
    }

    private String generateJSunionFormat() {
        if (unionFormat != null) {
            return String.format(Locale.US, "unionFormat: %s,", unionFormat);
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

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign);
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign1 != null) ? vAlign1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvaluePostfix() {
        if (valuePostfix != null) {
            return String.format(Locale.US, "valuePostfix: %s,", valuePostfix);
        }
        return "";
    }

    private String generateJSvaluePrefix() {
        if (valuePrefix != null) {
            return String.format(Locale.US, "valuePrefix: %s,", valuePrefix);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %s,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
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
        js.append(generateJSadjustOrAdjustByWidth());
        js.append(generateJSadjustOrAdjustByWidth1());
        js.append(generateJSadjustByHeight());
        js.append(generateJSallowLeaveChart());
        js.append(generateJSallowLeaveScreen());
        js.append(generateJSallowLeaveStage());
        js.append(generateJSanchor());
        js.append(generateJSanchor1());
        js.append(generateJSbackground());
        js.append(generateJSbackground1());
        js.append(generateJSdisablePointerEvents());
        js.append(generateJSdisplayMode());
        js.append(generateJSdisplayMode1());
        js.append(generateJSenabled());
        js.append(generateJSfontColor());
        js.append(generateJSfontDecoration());
        js.append(generateJSfontDecoration1());
        js.append(generateJSfontFamily());
        js.append(generateJSfontOpacity());
        js.append(generateJSfontSize());
        js.append(generateJSfontSize1());
        js.append(generateJSfontStyle());
        js.append(generateJSfontStyle1());
        js.append(generateJSfontVariant());
        js.append(generateJSfontVariant1());
        js.append(generateJSfontWeight());
        js.append(generateJSfontWeight1());
        js.append(generateJSformat());
        js.append(generateJShAlign());
        js.append(generateJShAlign1());
        js.append(generateJSheight());
        js.append(generateJSheight1());
        js.append(generateJSforce());
        js.append(generateJShideDelay());
        js.append(generateJSletterSpacing());
        js.append(generateJSlineHeight());
        js.append(generateJSlineHeight1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaxFontSize());
        js.append(generateJSmaxFontSize1());
        js.append(generateJSminFontSize());
        js.append(generateJSminFontSize1());
        js.append(generateJSoffsetX());
        js.append(generateJSoffsetY());
        js.append(generateJSpadding());
        js.append(generateJSpadding1());
        js.append(generateJSvalue());
        js.append(generateJSvalue1());
        js.append(generateJSvalue2());
        js.append(generateJSvalue3());
        js.append(generateJSvalue4());
        js.append(generateJSvalue5());
        js.append(generateJSvalue6());
        js.append(generateJSvalue7());
        js.append(generateJSposition());
        js.append(generateJSposition1());
        js.append(generateJSpositionMode());
        js.append(generateJSpositionMode1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSselectable());
        js.append(generateJSseparator());
        js.append(generateJStextDirection());
        js.append(generateJStextDirection1());
        js.append(generateJStextIndent());
        js.append(generateJStextOverflow());
        js.append(generateJStextOverflow1());
        js.append(generateJSname());
        js.append(generateJStextSettings());
        js.append(generateJStextSettings1());
        js.append(generateJStextSettings2());
        js.append(generateJStextWrap());
        js.append(generateJStextWrap1());
        js.append(generateJStitle());
        js.append(generateJStitleFormat());
        js.append(generateJSunionFormat());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSuseHtml());
        js.append(generateJSvAlign());
        js.append(generateJSvAlign1());
        js.append(generateJSvaluePostfix());
        js.append(generateJSvaluePrefix());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
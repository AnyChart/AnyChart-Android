package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for legend item provider.
 */
public class LegendItemProvider extends JsObject  {

    
    private Boolean disabled;
    private Boolean iconEnabled;
    private Fill iconFill;
    private HatchFillType iconHatchFill;
    private PatternFill iconHatchFill1;
    private HatchFill iconHatchFill2;
    private Fill iconMarkerFill;
    private Stroke iconMarkerStroke;
    private String iconMarkerType;
    private Stroke iconStroke;
    private Number iconTextSpacing;
    private String iconType;
    private Number index;
    private String meta;
    private String text;

    
    public LegendItemProvider(HatchFillType iconHatchFill, Boolean disabled, Boolean iconEnabled, Fill iconFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        this.iconHatchFill = iconHatchFill;
        this.disabled = disabled;
        this.iconEnabled = iconEnabled;
        this.iconFill = iconFill;
        this.iconMarkerFill = iconMarkerFill;
        this.iconMarkerStroke = iconMarkerStroke;
        this.iconMarkerType = iconMarkerType;
        this.iconStroke = iconStroke;
        this.iconTextSpacing = iconTextSpacing;
        this.iconType = iconType;
        this.index = index;
        this.meta = meta;
        this.text = text;

        js.append(String.format(Locale.US, "{iconHatchFill: %s,disabled: %b,iconEnabled: %b,iconFill: %s,iconMarkerFill: %s,iconMarkerStroke: %s,iconMarkerType: %s,iconStroke: %s,iconTextSpacing: %s,iconType: %s,index: %s,meta: %s,text: %s}",  ((iconHatchFill != null) ? iconHatchFill.generateJs() : "null"), disabled, iconEnabled, ((iconFill != null) ? iconFill.generateJs() : "null"), ((iconMarkerFill != null) ? iconMarkerFill.generateJs() : "null"), ((iconMarkerStroke != null) ? iconMarkerStroke.generateJs() : "null"), wrapQuotes(iconMarkerType), ((iconStroke != null) ? iconStroke.generateJs() : "null"), iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(PatternFill iconHatchFill1, Boolean disabled, Boolean iconEnabled, Fill iconFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        this.iconHatchFill1 = iconHatchFill1;
        this.disabled = disabled;
        this.iconEnabled = iconEnabled;
        this.iconFill = iconFill;
        this.iconMarkerFill = iconMarkerFill;
        this.iconMarkerStroke = iconMarkerStroke;
        this.iconMarkerType = iconMarkerType;
        this.iconStroke = iconStroke;
        this.iconTextSpacing = iconTextSpacing;
        this.iconType = iconType;
        this.index = index;
        this.meta = meta;
        this.text = text;

        js.append(String.format(Locale.US, "{iconHatchFill: %s,disabled: %b,iconEnabled: %b,iconFill: %s,iconMarkerFill: %s,iconMarkerStroke: %s,iconMarkerType: %s,iconStroke: %s,iconTextSpacing: %s,iconType: %s,index: %s,meta: %s,text: %s}",  ((iconHatchFill1 != null) ? iconHatchFill1.generateJs() : "null"), disabled, iconEnabled, ((iconFill != null) ? iconFill.generateJs() : "null"), ((iconMarkerFill != null) ? iconMarkerFill.generateJs() : "null"), ((iconMarkerStroke != null) ? iconMarkerStroke.generateJs() : "null"), wrapQuotes(iconMarkerType), ((iconStroke != null) ? iconStroke.generateJs() : "null"), iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(HatchFill iconHatchFill2, Boolean disabled, Boolean iconEnabled, Fill iconFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        this.iconHatchFill2 = iconHatchFill2;
        this.disabled = disabled;
        this.iconEnabled = iconEnabled;
        this.iconFill = iconFill;
        this.iconMarkerFill = iconMarkerFill;
        this.iconMarkerStroke = iconMarkerStroke;
        this.iconMarkerType = iconMarkerType;
        this.iconStroke = iconStroke;
        this.iconTextSpacing = iconTextSpacing;
        this.iconType = iconType;
        this.index = index;
        this.meta = meta;
        this.text = text;

        js.append(String.format(Locale.US, "{iconHatchFill: %s,disabled: %b,iconEnabled: %b,iconFill: %s,iconMarkerFill: %s,iconMarkerStroke: %s,iconMarkerType: %s,iconStroke: %s,iconTextSpacing: %s,iconType: %s,index: %s,meta: %s,text: %s}",  ((iconHatchFill2 != null) ? iconHatchFill2.generateJs() : "null"), disabled, iconEnabled, ((iconFill != null) ? iconFill.generateJs() : "null"), ((iconMarkerFill != null) ? iconMarkerFill.generateJs() : "null"), ((iconMarkerStroke != null) ? iconMarkerStroke.generateJs() : "null"), wrapQuotes(iconMarkerType), ((iconStroke != null) ? iconStroke.generateJs() : "null"), iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
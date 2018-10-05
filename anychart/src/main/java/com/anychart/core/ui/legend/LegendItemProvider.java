package com.anychart.core.ui.legend;

import com.anychart.JsObject;

import com.anychart.graphics.vector.Fill;
import com.anychart.graphics.vector.hatchfill.HatchFillType;
import com.anychart.graphics.vector.PatternFill;
import com.anychart.graphics.vector.HatchFill;
import com.anychart.graphics.vector.Stroke;
import com.anychart.enums.MarkerType;
import com.anychart.enums.LegendItemIconType;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for legend item provider.
 */
public class LegendItemProvider extends JsObject  {

    
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFillType iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFillType iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFillType iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFillType iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, PatternFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, PatternFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, PatternFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, PatternFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, MarkerType iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, (iconMarkerType != null) ? iconMarkerType.getJsBase() : null, (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, LegendItemIconType iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, (iconType != null) ? iconType.getJsBase() : null, index, wrapQuotes(meta), wrapQuotes(text)));
    }
    public LegendItemProvider(Boolean disabled, Boolean iconEnabled, Fill iconFill, HatchFill iconHatchFill, Fill iconMarkerFill, Stroke iconMarkerStroke, String iconMarkerType, Stroke iconStroke, Number iconTextSpacing, String iconType, Number index, String meta, String text) {
        js.append(String.format(Locale.US, "{disabled:%s, iconEnabled: %s, iconFill: %s, iconHatchFill: %s, iconMarkerFill: %s, iconMarkerStroke: %s, iconMarkerType: %s, iconStroke: %s, iconTextSpacing: %s, iconType: %s, index: %s, meta: %s, text: %s, } ", disabled, iconEnabled, (iconFill != null) ? iconFill.getJsBase() : null, (iconHatchFill != null) ? iconHatchFill.getJsBase() : null, (iconMarkerFill != null) ? iconMarkerFill.getJsBase() : null, (iconMarkerStroke != null) ? iconMarkerStroke.getJsBase() : null, wrapQuotes(iconMarkerType), (iconStroke != null) ? iconStroke.getJsBase() : null, iconTextSpacing, wrapQuotes(iconType), index, wrapQuotes(meta), wrapQuotes(text)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
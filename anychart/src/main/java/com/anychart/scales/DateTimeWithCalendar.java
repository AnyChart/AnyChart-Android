package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.scales.ScatterBase;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The DateTimeWithCalendar class contains methods for configuring calendar on the DateTime scale.
 */
public class DateTimeWithCalendar extends ScatterBase {

    protected DateTimeWithCalendar() {

    }

    public static DateTimeWithCalendar instantiate() {
        return new DateTimeWithCalendar("new anychart.scales.dateTimeWithCalendar()");
    }

    

    public DateTimeWithCalendar(String jsChart) {
        jsBase = "dateTimeWithCalendar" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the scale calendar.
     */
    public com.anychart.scales.Calendar calendar() {
        return new com.anychart.scales.Calendar(jsBase + ".calendar()");
    }
    /**
     * 
     */
    public com.anychart.scales.DateTimeWithCalendar calendar(com.anychart.scales.Calendar calendar) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".calendar(%s);", (calendar != null) ? calendar.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the unit count.
     */
    public void count() {
        APIlib.getInstance().addJSLine(jsBase + ".count();");
    }
    /**
     * Setter for the unit count.
     */
    public com.anychart.scales.DateTimeWithCalendar count(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s);", count));

        return this;
    }
    /**
     * Transforms date to pixels.
     */
    public void dateToPix(Number date) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dateToPix(%s);", date));
    }
    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).<br/>
<b>Note:</b> Attention! {@link anychart.scales.Base#finishAutoCalc} drops all passed values.
     */
    public com.anychart.scales.DateTimeWithCalendar extendDataRange(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".extendDataRange(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * Informs the scale that an auto-range calculation started for the chart in past was ended.
     */
    public void finishAutoCalc(Boolean silently) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".finishAutoCalc(%s);", silently));
    }
    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with a passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Number fromPix, Number toPix, com.anychart.enums.Interval unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, (unit != null) ? unit.getJsBase() : null, count));
    }
    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with a passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Number fromPix, Number toPix, String unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, wrapQuotes(unit), count));
    }
    /**
     * Returns scale type.
     */
    public void getType() {
        APIlib.getInstance().addJSLine(jsBase + ".getType();");
    }
    /**
     * Returns tick by its position ratio.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void inverseTransform(Number ratio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
    }
    /**
     * Getter for the scale inversion.
     */
    public void inverted() {
        APIlib.getInstance().addJSLine(jsBase + ".inverted();");
    }
    /**
     * Setter for scale inversion.<br/> If the scale is <b>inverted</b>, axes and series go upside-down or right-to-left
instead of bottom-to-top and left-to-right.
     */
    public com.anychart.scales.DateTimeWithCalendar inverted(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", enabled));

        return this;
    }
    /**
     * Getter for the scale maximum.
     */
    public void maximum() {
        APIlib.getInstance().addJSLine(jsBase + ".maximum();");
    }
    /**
     * Setter for the scale maximum.
     */
    public com.anychart.scales.DateTimeWithCalendar maximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the scale maximum gap.
     */
    public void maximumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumGap();");
    }
    /**
     * Setter for the scale maximum gap.
     */
    public com.anychart.scales.DateTime maximumGap(Number gap) {
        return new com.anychart.scales.DateTime(String.format(Locale.US, jsBase + ".maximumGap(%s)", gap));
    }
    /**
     * Getter for the scale minimum.
     */
    public void minimum() {
        APIlib.getInstance().addJSLine(jsBase + ".minimum();");
    }
    /**
     * Setter for the scale minimum.
     */
    public com.anychart.scales.DateTimeWithCalendar minimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimum(%s);", minimum));

        return this;
    }
    /**
     * Getter for the scale minimum gap.
     */
    public void minimumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumGap();");
    }
    /**
     * Setter for the scale minimum gap.
     */
    public com.anychart.scales.DateTime minimumGap(Number gap) {
        return new com.anychart.scales.DateTime(String.format(Locale.US, jsBase + ".minimumGap(%s)", gap));
    }
    /**
     * Transforms pixels to date.
     */
    public void pixToDate(Number pix) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pixToDate(%s);", pix));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for skipping of holidays.
     */
    public void skipHolidays() {
        APIlib.getInstance().addJSLine(jsBase + ".skipHolidays();");
    }
    /**
     * Setter for skipping of holidays.
     */
    public com.anychart.scales.DateTimeWithCalendar skipHolidays(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".skipHolidays(%s);", enabled));

        return this;
    }
    /**
     * Getter for the soft maximum.
     */
    public void softMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMaximum();");
    }
    /**
     * Setter for the soft maximum.
     */
    public com.anychart.scales.DateTime softMaximum(Number maximum) {
        return new com.anychart.scales.DateTime(String.format(Locale.US, jsBase + ".softMaximum(%s)", maximum));
    }
    /**
     * Getter for the soft minimum.
     */
    public void softMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMinimum();");
    }
    /**
     * Setter for the soft minimum.
     */
    public com.anychart.scales.DateTime softMinimum(Number minimum) {
        return new com.anychart.scales.DateTime(String.format(Locale.US, jsBase + ".softMinimum(%s)", minimum));
    }
    /**
     * Informs scale that an auto-range calculation started for the chart, so it should reset its data range on the first
call of this method if needed.
     */
    public com.anychart.scales.DateTimeWithCalendar startAutoCalc() {
        APIlib.getInstance().addJSLine(jsBase + ".startAutoCalc();");

        return this;
    }
    /**
     * Getter for the start date.
     */
    public void startDate() {
        APIlib.getInstance().addJSLine(jsBase + ".startDate();");
    }
    /**
     * 
     */
    public com.anychart.scales.DateTimeWithCalendar startDate(Number date) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startDate(%s);", date));

        return this;
    }
    /**
     * Returns tick position ratio by its name.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void transform(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s);", wrapQuotes(value)));
    }
    /**
     * Getter for the unit interval.
     */
    public void unit() {
        APIlib.getInstance().addJSLine(jsBase + ".unit();");
    }
    /**
     * Setter for the unit interval.
     */
    public com.anychart.scales.DateTimeWithCalendar unit(com.anychart.enums.Interval interval) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unit(%s);", (interval != null) ? interval.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the unit interval.
     */
    public com.anychart.scales.DateTimeWithCalendar unit(String interval) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unit(%s);", wrapQuotes(interval)));

        return this;
    }
    /**
     * Getter for the unit size.
     */
    public void unitPixSize() {
        APIlib.getInstance().addJSLine(jsBase + ".unitPixSize();");
    }
    /**
     * Setter for the unit size.
     */
    public com.anychart.scales.DateTimeWithCalendar unitPixSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unitPixSize(%s);", size));

        return this;
    }
    /**
     * Setter for the unit size.
     */
    public com.anychart.scales.DateTimeWithCalendar unitPixSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unitPixSize(%s);", wrapQuotes(size)));

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for a flag if the maximum should be aligned by major ticks interval.
     */
    public void alignMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".alignMaximum();");
    }
    /**
     * Getter for a flag if the maximum should be aligned by major ticks interval.<br/>
     */
    public com.anychart.scales.DateTimeWithCalendar alignMaximum(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alignMaximum(%s);", enabled));

        return this;
    }
    /**
     * Setter for a flag if the minimum should be aligned by major ticks interval.
     */
    public void alignMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".alignMinimum();");
    }
    /**
     * Setter for a flag if the minimum should be aligned by major ticks interval.
     */
    public com.anychart.scales.DateTimeWithCalendar alignMinimum(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alignMinimum(%s);", enabled));

        return this;
    }
    /**
     * Getter for the maximum ticks count.
     */
    public void maxTicksCount() {
        APIlib.getInstance().addJSLine(jsBase + ".maxTicksCount();");
    }
    /**
     * Setter for the maximum ticks count.<br/>
     */
    public com.anychart.scales.DateTimeWithCalendar maxTicksCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxTicksCount(%s);", count));

        return this;
    }

}
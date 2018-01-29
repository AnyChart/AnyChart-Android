package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for date time localization.
The default locale is EN-US (see AnyChart CDN: https://cdn.anychart.com/#locales)
 */
public class DateTimeLocale extends JsObject  {

    
    private String[] ampms;
    private String dateFormats;
    private String dateTimeFormats;
    private String[] eras;
    private String[] erasNames;
    private Number firstDayOfWeek;
    private Number firstWeekCutOfDay;
    private String formats;
    private String[] months;
    private String[] narrowMonths;
    private String[] narrowWeekdays;
    private String[] quarters;
    private String[] shortMonths;
    private String[] shortQuarters;
    private String[] shortWeekdays;
    private String[] standaloneMonths;
    private String[] standaloneNarrowMonths;
    private String[] standaloneNarrowWeekdays;
    private String[] standaloneShortMonths;
    private String[] standaloneShortWeekdays;
    private String[] standaloneWeekdays;
    private String timeFormats;
    private String[] weekdays;
    private Number[] weekendRange;

    
    public DateTimeLocale(String[] ampms, String dateFormats, String dateTimeFormats, String[] eras, String[] erasNames, Number firstDayOfWeek, Number firstWeekCutOfDay, String formats, String[] months, String[] narrowMonths, String[] narrowWeekdays, String[] quarters, String[] shortMonths, String[] shortQuarters, String[] shortWeekdays, String[] standaloneMonths, String[] standaloneNarrowMonths, String[] standaloneNarrowWeekdays, String[] standaloneShortMonths, String[] standaloneShortWeekdays, String[] standaloneWeekdays, String timeFormats, String[] weekdays, Number[] weekendRange) {
        this.ampms = ampms;
        this.dateFormats = dateFormats;
        this.dateTimeFormats = dateTimeFormats;
        this.eras = eras;
        this.erasNames = erasNames;
        this.firstDayOfWeek = firstDayOfWeek;
        this.firstWeekCutOfDay = firstWeekCutOfDay;
        this.formats = formats;
        this.months = months;
        this.narrowMonths = narrowMonths;
        this.narrowWeekdays = narrowWeekdays;
        this.quarters = quarters;
        this.shortMonths = shortMonths;
        this.shortQuarters = shortQuarters;
        this.shortWeekdays = shortWeekdays;
        this.standaloneMonths = standaloneMonths;
        this.standaloneNarrowMonths = standaloneNarrowMonths;
        this.standaloneNarrowWeekdays = standaloneNarrowWeekdays;
        this.standaloneShortMonths = standaloneShortMonths;
        this.standaloneShortWeekdays = standaloneShortWeekdays;
        this.standaloneWeekdays = standaloneWeekdays;
        this.timeFormats = timeFormats;
        this.weekdays = weekdays;
        this.weekendRange = weekendRange;

        js.append(String.format(Locale.US, "{ampms: %s,dateFormats: %s,dateTimeFormats: %s,eras: %s,erasNames: %s,firstDayOfWeek: %s,firstWeekCutOfDay: %s,formats: %s,months: %s,narrowMonths: %s,narrowWeekdays: %s,quarters: %s,shortMonths: %s,shortQuarters: %s,shortWeekdays: %s,standaloneMonths: %s,standaloneNarrowMonths: %s,standaloneNarrowWeekdays: %s,standaloneShortMonths: %s,standaloneShortWeekdays: %s,standaloneWeekdays: %s,timeFormats: %s,weekdays: %s,weekendRange: %s}",  arrayToStringWrapQuotes(ampms), wrapQuotes(dateFormats), wrapQuotes(dateTimeFormats), arrayToStringWrapQuotes(eras), arrayToStringWrapQuotes(erasNames), firstDayOfWeek, firstWeekCutOfDay, wrapQuotes(formats), arrayToStringWrapQuotes(months), arrayToStringWrapQuotes(narrowMonths), arrayToStringWrapQuotes(narrowWeekdays), arrayToStringWrapQuotes(quarters), arrayToStringWrapQuotes(shortMonths), arrayToStringWrapQuotes(shortQuarters), arrayToStringWrapQuotes(shortWeekdays), arrayToStringWrapQuotes(standaloneMonths), arrayToStringWrapQuotes(standaloneNarrowMonths), arrayToStringWrapQuotes(standaloneNarrowWeekdays), arrayToStringWrapQuotes(standaloneShortMonths), arrayToStringWrapQuotes(standaloneShortWeekdays), arrayToStringWrapQuotes(standaloneWeekdays), wrapQuotes(timeFormats), arrayToStringWrapQuotes(weekdays), Arrays.toString(weekendRange)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
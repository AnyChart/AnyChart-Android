package com.anychart.format;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for date time localization.
The default locale is EN-US (see AnyChart CDN: https://cdn.anychart.com/#locales)
 */
public class DateTimeLocale extends JsObject  {

    
    public DateTimeLocale(String[] ampms, String dateFormats, String dateTimeFormats, String[] eras, String[] erasNames, Number firstDayOfWeek, Number firstWeekCutOfDay, String[] formats, String[] months, String[] narrowMonths, String[] narrowWeekdays, String[] quarters, String[] shortMonths, String[] shortQuarters, String[] shortWeekdays, String[] standaloneMonths, String[] standaloneNarrowMonths, String[] standaloneNarrowWeekdays, String[] standaloneShortMonths, String[] standaloneShortWeekdays, String[] standaloneWeekdays, String timeFormats, String[] weekdays, Number[] weekendRange) {
        js.append(String.format(Locale.US, "{ampms:%s, dateFormats: %s, dateTimeFormats: %s, eras: %s, erasNames: %s, firstDayOfWeek: %s, firstWeekCutOfDay: %s, formats: %s, months: %s, narrowMonths: %s, narrowWeekdays: %s, quarters: %s, shortMonths: %s, shortQuarters: %s, shortWeekdays: %s, standaloneMonths: %s, standaloneNarrowMonths: %s, standaloneNarrowWeekdays: %s, standaloneShortMonths: %s, standaloneShortWeekdays: %s, standaloneWeekdays: %s, timeFormats: %s, weekdays: %s, weekendRange: %s, } ", arrayToStringWrapQuotes(ampms), wrapQuotes(dateFormats), wrapQuotes(dateTimeFormats), arrayToStringWrapQuotes(eras), arrayToStringWrapQuotes(erasNames), firstDayOfWeek, firstWeekCutOfDay, arrayToStringWrapQuotes(formats), arrayToStringWrapQuotes(months), arrayToStringWrapQuotes(narrowMonths), arrayToStringWrapQuotes(narrowWeekdays), arrayToStringWrapQuotes(quarters), arrayToStringWrapQuotes(shortMonths), arrayToStringWrapQuotes(shortQuarters), arrayToStringWrapQuotes(shortWeekdays), arrayToStringWrapQuotes(standaloneMonths), arrayToStringWrapQuotes(standaloneNarrowMonths), arrayToStringWrapQuotes(standaloneNarrowWeekdays), arrayToStringWrapQuotes(standaloneShortMonths), arrayToStringWrapQuotes(standaloneShortWeekdays), arrayToStringWrapQuotes(standaloneWeekdays), wrapQuotes(timeFormats), arrayToStringWrapQuotes(weekdays), Arrays.toString(weekendRange)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
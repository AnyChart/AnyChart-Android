package com.anychart;

import java.util.Locale;

public class AnyChartFormat {

    public static void date(String date, int timeZone, String locale) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.date(%s, %s, %s);", date, timeZone, locale));
    }

    public static void dateTime(String date, String format, int timeZone, String locale) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.dateTime(%s, %s, %s, %s);", date, format, timeZone, locale));
    }

    public static void outputDateFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.outputDateFormat(%s);", value));
    }

    public static void outputDateTimeFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.outputDateTimeFormat(%s);", value));
    }

    public static void outputLocale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.outputLocale(%s);", value));
    }

    public static void outputTimeFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.outputTimeFormat(%s);", value));
    }

    public static void outputTimezone(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, "anychart.format.outputTimezone(%s);", value));
    }

}

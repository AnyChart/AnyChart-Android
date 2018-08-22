package com.anychart.enums;

import java.util.Locale;

/**
 * Locale date time interval format names.
 */
public enum LocaleDateTimeFormat {

    DAY("day"),
    DAY_HOUR("day-hour"),
    DAY_MILLISECOND("day-millisecond"),
    DAY_MINUTE("day-minute"),
    DAY_SECOND("day-second"),
    HOUR("hour"),
    HOUR_MILLISECOND("hour-millisecond"),
    HOUR_MINUTE("hour-minute"),
    HOUR_SECOND("hour-second"),
    MILLISECOND("millisecond"),
    MINUTE("minute"),
    MINUTE_MILLISECOND("minute-millisecond"),
    MINUTE_SECOND("minute-second"),
    MONTH("month"),
    MONTH_DAY("month-day"),
    MONTH_HOUR("month-hour"),
    MONTH_MILLISECOND("month-millisecond"),
    MONTH_MINUTE("month-minute"),
    MONTH_SECOND("month-second"),
    MONTH_THIRD_OF_MONTH("month-third-of-month"),
    MONTH_WEEK("month-week"),
    QUARTER("quarter"),
    QUARTER_DAY("quarter-day"),
    QUARTER_HOUR("quarter-hour"),
    QUARTER_MILLISECOND("quarter-millisecond"),
    QUARTER_MINUTE("quarter-minute"),
    QUARTER_MONTH("quarter-month"),
    QUARTER_SECOND("quarter-second"),
    QUARTER_THIRD_OF_MONTH("quarter-third-of-month"),
    QUARTER_WEEK("quarter-week"),
    SECOND("second"),
    SECOND_MILLISECOND("second-millisecond"),
    SEMESTER("semester"),
    SEMESTER_DAY("semester-day"),
    SEMESTER_HOUR("semester-hour"),
    SEMESTER_MILLISECOND("semester-millisecond"),
    SEMESTER_MINUTE("semester-minute"),
    SEMESTER_MONTH("semester-month"),
    SEMESTER_QUARTER("semester-quarter"),
    SEMESTER_SECOND("semester-second"),
    SEMESTER_THIRD_OF_MONTH("semester-third-of-month"),
    SEMESTER_WEEK("semester-week"),
    THIRD_OF_MONTH("third-of-month"),
    THIRD_OF_MONTH_DAY("third-of-month-day"),
    THIRD_OF_MONTH_HOUR("third-of-month-hour"),
    THIRD_OF_MONTH_MILLISECOND("third-of-month-millisecond"),
    THIRD_OF_MONTH_MINUTE("third-of-month-minute"),
    THIRD_OF_MONTH_SECOND("third-of-month-second"),
    THIRD_OF_MONTH_WEEK("third-of-month-week"),
    WEEK("week"),
    WEEK_DAY("week-day"),
    WEEK_HOUR("week-hour"),
    WEEK_MILLISECOND("week-millisecond"),
    WEEK_MINUTE("week-minute"),
    WEEK_SECOND("week-second"),
    YEAR("year"),
    YEAR_DAY("year-day"),
    YEAR_HOUR("year-hour"),
    YEAR_MILLISECOND("year-millisecond"),
    YEAR_MINUTE("year-minute"),
    YEAR_MONTH("year-month"),
    YEAR_QUARTER("year-quarter"),
    YEAR_SECOND("year-second"),
    YEAR_SEMESTER("year-semester"),
    YEAR_THIRD_OF_MONTH("year-third-of-month"),
    YEAR_WEEK("year-week");

    private final String value;

    LocaleDateTimeFormat(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}
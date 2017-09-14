package com.anychart.anychart;

import java.util.Locale;

public enum LocaleDateTimeFormat implements JsObject.JsObjectInterface {
    DAY("day"),
    DAY_HOUR("day_hour"),
    DAY_MILLISECOND("day_millisecond"),
    DAY_MINUTE("day_minute"),
    DAY_SECOND("day_second"),
    HOUR("hour"),
    HOUR_MILLISECOND("hour_millisecond"),
    HOUR_MINUTE("hour_minute"),
    HOUR_SECOND("hour_second"),
    MILLISECOND("millisecond"),
    MINUTE("minute"),
    MINUTE_MILLISECOND("minute_millisecond"),
    MINUTE_SECOND("minute_second"),
    MONTH("month"),
    MONTH_DAY("month_day"),
    MONTH_HOUR("month_hour"),
    MONTH_MILLISECOND("month_millisecond"),
    MONTH_MINUTE("month_minute"),
    MONTH_SECOND("month_second"),
    MONTH_THIRD_OF_MONTH("month_third_of_month"),
    MONTH_WEEK("month_week"),
    QUARTER("quarter"),
    QUARTER_DAY("quarter_day"),
    QUARTER_HOUR("quarter_hour"),
    QUARTER_MILLISECOND("quarter_millisecond"),
    QUARTER_MINUTE("quarter_minute"),
    QUARTER_MONTH("quarter_month"),
    QUARTER_SECOND("quarter_second"),
    QUARTER_THIRD_OF_MONTH("quarter_third_of_month"),
    QUARTER_WEEK("quarter_week"),
    SECOND("second"),
    SECOND_MILLISECOND("second_millisecond"),
    SEMESTER("semester"),
    SEMESTER_DAY("semester_day"),
    SEMESTER_HOUR("semester_hour"),
    SEMESTER_MILLISECOND("semester_millisecond"),
    SEMESTER_MINUTE("semester_minute"),
    SEMESTER_MONTH("semester_month"),
    SEMESTER_QUARTER("semester_quarter"),
    SEMESTER_SECOND("semester_second"),
    SEMESTER_THIRD_OF_MONTH("semester_third_of_month"),
    SEMESTER_WEEK("semester_week"),
    THIRD_OF_MONTH("third_of_month"),
    THIRD_OF_MONTH_DAY("third_of_month_day"),
    THIRD_OF_MONTH_HOUR("third_of_month_hour"),
    THIRD_OF_MONTH_MILLISECOND("third_of_month_millisecond"),
    THIRD_OF_MONTH_MINUTE("third_of_month_minute"),
    THIRD_OF_MONTH_SECOND("third_of_month_second"),
    THIRD_OF_MONTH_WEEK("third_of_month_week"),
    WEEK("week"),
    WEEK_DAY("week_day"),
    WEEK_HOUR("week_hour"),
    WEEK_MILLISECOND("week_millisecond"),
    WEEK_MINUTE("week_minute"),
    WEEK_SECOND("week_second"),
    YEAR("year"),
    YEAR_DAY("year_day"),
    YEAR_HOUR("year_hour"),
    YEAR_MILLISECOND("year_millisecond"),
    YEAR_MINUTE("year_minute"),
    YEAR_MONTH("year_month"),
    YEAR_QUARTER("year_quarter"),
    YEAR_SECOND("year_second"),
    YEAR_SEMESTER("year_semester"),
    YEAR_THIRD_OF_MONTH("year_third_of_month"),
    YEAR_WEEK("year_week");

    private final String value;

    LocaleDateTimeFormat(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}
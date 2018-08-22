package com.anychart.enums;

import java.util.Locale;

/**
 * Column formatting presets.
 */
public enum ColumnFormats {

    DATE_COMMON_LOG("date-common-log"),
    DATE_DMY_DOTS("date-dmy-dots"),
    DATE_ISO_8601("date-iso-8601"),
    DATE_US_SHORT("date-us-short"),
    DIRECT_NUMBERING("direct-numbering"),
    FINANCIAL("financial"),
    PERCENT("percent"),
    SHORT_TEXT("short-text"),
    TEXT("text");

    private final String value;

    ColumnFormats(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}
package com.anychart.anychart;

import java.util.Locale;

public enum ColumnFormats implements JsObject.JsObjectInterface {
    DATE_COMMON_LOG("dateCommonLog"),
    DATE_DMY_DOTS("dateDmyDots"),
    DATE_ISO_8601("dateIso8601"),
    DATE_US_SHORT("dateUsShort"),
    DIRECT_NUMBERING("directNumbering"),
    FINANCIAL("financial"),
    PERCENT("percent"),
    SHORT_TEXT("shortText"),
    TEXT("text");

    private final String value;

    ColumnFormats(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}
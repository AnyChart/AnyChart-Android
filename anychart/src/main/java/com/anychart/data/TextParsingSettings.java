package com.anychart.data;

import com.anychart.JsObject;

import com.anychart.enums.TextParsingMode;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Settings for parsing text.
 */
public class TextParsingSettings extends JsObject  {

    
    public TextParsingSettings(String columnsSeparator, Number cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Number maxItems, Number maxLength, Number minLength, TextParsingMode mode, String rowsSeparator) {
        js.append(String.format(Locale.US, "{columnsSeparator:%s, cutLength: %s, ignoreFirstRow: %s, ignoreItems: %s, ignoreTrailingSpaces: %s, maxItems: %s, maxLength: %s, minLength: %s, mode: %s, rowsSeparator: %s, } ", wrapQuotes(columnsSeparator), cutLength, ignoreFirstRow, arrayToStringWrapQuotes(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, (mode != null) ? mode.getJsBase() : null, wrapQuotes(rowsSeparator)));
    }
    public TextParsingSettings(String columnsSeparator, Number cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Number maxItems, Number maxLength, Number minLength, String mode, String rowsSeparator) {
        js.append(String.format(Locale.US, "{columnsSeparator:%s, cutLength: %s, ignoreFirstRow: %s, ignoreItems: %s, ignoreTrailingSpaces: %s, maxItems: %s, maxLength: %s, minLength: %s, mode: %s, rowsSeparator: %s, } ", wrapQuotes(columnsSeparator), cutLength, ignoreFirstRow, arrayToStringWrapQuotes(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, wrapQuotes(mode), wrapQuotes(rowsSeparator)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
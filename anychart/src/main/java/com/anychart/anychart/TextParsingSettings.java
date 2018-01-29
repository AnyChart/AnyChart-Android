package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Settings for parsing text.
 */
public class TextParsingSettings extends JsObject  {

    
    private String columnsSeparator;
    private Number cutLength;
    private Boolean ignoreFirstRow;
    private String[] ignoreItems;
    private Boolean ignoreTrailingSpaces;
    private Number maxItems;
    private Number maxLength;
    private Number minLength;
    private TextParsingMode mode;
    private String mode1;
    private String rowsSeparator;

    
    public TextParsingSettings(TextParsingMode mode, String columnsSeparator, Number cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Number maxItems, Number maxLength, Number minLength, String rowsSeparator) {
        this.mode = mode;
        this.columnsSeparator = columnsSeparator;
        this.cutLength = cutLength;
        this.ignoreFirstRow = ignoreFirstRow;
        this.ignoreItems = ignoreItems;
        this.ignoreTrailingSpaces = ignoreTrailingSpaces;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.rowsSeparator = rowsSeparator;

        js.append(String.format(Locale.US, "{mode: %s,columnsSeparator: %s,cutLength: %s,ignoreFirstRow: %b,ignoreItems: %s,ignoreTrailingSpaces: %b,maxItems: %s,maxLength: %s,minLength: %s,rowsSeparator: %s}",  ((mode != null) ? mode.generateJs() : "null"), wrapQuotes(columnsSeparator), cutLength, ignoreFirstRow, arrayToStringWrapQuotes(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, wrapQuotes(rowsSeparator)));
    }
    public TextParsingSettings(String mode1, String columnsSeparator, Number cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Number maxItems, Number maxLength, Number minLength, String rowsSeparator) {
        this.mode1 = mode1;
        this.columnsSeparator = columnsSeparator;
        this.cutLength = cutLength;
        this.ignoreFirstRow = ignoreFirstRow;
        this.ignoreItems = ignoreItems;
        this.ignoreTrailingSpaces = ignoreTrailingSpaces;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.rowsSeparator = rowsSeparator;

        js.append(String.format(Locale.US, "{mode: %s,columnsSeparator: %s,cutLength: %s,ignoreFirstRow: %b,ignoreItems: %s,ignoreTrailingSpaces: %b,maxItems: %s,maxLength: %s,minLength: %s,rowsSeparator: %s}",  wrapQuotes(mode1), wrapQuotes(columnsSeparator), cutLength, ignoreFirstRow, arrayToStringWrapQuotes(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, wrapQuotes(rowsSeparator)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
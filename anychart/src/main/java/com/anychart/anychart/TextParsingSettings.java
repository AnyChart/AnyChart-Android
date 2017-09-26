package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TextParsingSettings extends JsObject  {

    
    private String columnsSeparator;
    private Double cutLength;
    private Boolean ignoreFirstRow;
    private String[] ignoreItems;
    private Boolean ignoreTrailingSpaces;
    private Double maxItems;
    private Double maxLength;
    private Double minLength;
    private TextParsingMode mode;
    private String rowsSeparator;

    
    public TextParsingSettings(String columnsSeparator, Double cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Double maxItems, Double maxLength, Double minLength, TextParsingMode mode, String rowsSeparator) {
        this.columnsSeparator = columnsSeparator;
        this.cutLength = cutLength;
        this.ignoreFirstRow = ignoreFirstRow;
        this.ignoreItems = ignoreItems;
        this.ignoreTrailingSpaces = ignoreTrailingSpaces;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.mode = mode;
        this.rowsSeparator = rowsSeparator;

        js.append(String.format(Locale.US, "{columnsSeparator: %s,cutLength: %f,ignoreFirstRow: %b,ignoreItems: %s,ignoreTrailingSpaces: %b,maxItems: %f,maxLength: %f,minLength: %f,mode: %s,rowsSeparator: %s}",  columnsSeparator, cutLength, ignoreFirstRow, Arrays.toString(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, (mode != null) ? mode.generateJs() : "null", rowsSeparator));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
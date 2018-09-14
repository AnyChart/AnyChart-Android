package com.anychart.data;

import com.anychart.JsObject;

import com.anychart.enums.TextParsingMode;
import com.anychart.data.TextParsingSettings;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for table data.
 */
public class DataSettings extends JsObject  {

    
    public DataSettings(String caption, String[] header, String[] rows, String text, TextParsingMode textSettings) {
        js.append(String.format(Locale.US, "{caption:%s, header: %s, rows: %s, text: %s, textSettings: %s, } ", wrapQuotes(caption), arrayToStringWrapQuotes(header), arrayToStringWrapQuotes(rows), wrapQuotes(text), (textSettings != null) ? textSettings.getJsBase() : null));
    }
    public DataSettings(String caption, String[] header, String[] rows, String text, String textSettings) {
        js.append(String.format(Locale.US, "{caption:%s, header: %s, rows: %s, text: %s, textSettings: %s, } ", wrapQuotes(caption), arrayToStringWrapQuotes(header), arrayToStringWrapQuotes(rows), wrapQuotes(text), wrapQuotes(textSettings)));
    }
    public DataSettings(String caption, String[] header, String[] rows, String text, TextParsingSettings textSettings) {
        js.append(String.format(Locale.US, "{caption:%s, header: %s, rows: %s, text: %s, textSettings: %s, } ", wrapQuotes(caption), arrayToStringWrapQuotes(header), arrayToStringWrapQuotes(rows), wrapQuotes(text), (textSettings != null) ? textSettings.getJsBase() : null));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
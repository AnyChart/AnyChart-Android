package com.anychart.format;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for number locale.
 */
public class NumberLocale extends JsObject  {

    
    public NumberLocale(String decimalPoint, Number decimalsCount, String groupsSeparator, String scale, String scaleSuffixSeparator, Boolean useBracketsForNegative, Boolean zeroFillDecimals) {
        js.append(String.format(Locale.US, "{decimalPoint:%s, decimalsCount: %s, groupsSeparator: %s, scale: %s, scaleSuffixSeparator: %s, useBracketsForNegative: %s, zeroFillDecimals: %s, } ", wrapQuotes(decimalPoint), decimalsCount, wrapQuotes(groupsSeparator), wrapQuotes(scale), wrapQuotes(scaleSuffixSeparator), useBracketsForNegative, zeroFillDecimals));
    }
    public NumberLocale(String decimalPoint, Number decimalsCount, String groupsSeparator, Boolean scale, String scaleSuffixSeparator, Boolean useBracketsForNegative, Boolean zeroFillDecimals) {
        js.append(String.format(Locale.US, "{decimalPoint:%s, decimalsCount: %s, groupsSeparator: %s, scale: %s, scaleSuffixSeparator: %s, useBracketsForNegative: %s, zeroFillDecimals: %s, } ", wrapQuotes(decimalPoint), decimalsCount, wrapQuotes(groupsSeparator), scale, wrapQuotes(scaleSuffixSeparator), useBracketsForNegative, zeroFillDecimals));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
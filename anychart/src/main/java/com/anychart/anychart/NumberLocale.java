package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for number locale.
 */
public class NumberLocale extends JsObject  {

    
    private String decimalPoint;
    private Number decimalsCount;
    private String groupsSeparator;
    private String scale;
    private Boolean scale1;
    private String scaleSuffixSeparator;
    private Boolean useBracketsForNegative;
    private Boolean zeroFillDecimals;

    
    public NumberLocale(String scale, String decimalPoint, Number decimalsCount, String groupsSeparator, String scaleSuffixSeparator, Boolean useBracketsForNegative, Boolean zeroFillDecimals) {
        this.scale = scale;
        this.decimalPoint = decimalPoint;
        this.decimalsCount = decimalsCount;
        this.groupsSeparator = groupsSeparator;
        this.scaleSuffixSeparator = scaleSuffixSeparator;
        this.useBracketsForNegative = useBracketsForNegative;
        this.zeroFillDecimals = zeroFillDecimals;

        js.append(String.format(Locale.US, "{scale: %s,decimalPoint: %s,decimalsCount: %s,groupsSeparator: %s,scaleSuffixSeparator: %s,useBracketsForNegative: %b,zeroFillDecimals: %b}",  wrapQuotes(scale), wrapQuotes(decimalPoint), decimalsCount, wrapQuotes(groupsSeparator), wrapQuotes(scaleSuffixSeparator), useBracketsForNegative, zeroFillDecimals));
    }
    public NumberLocale(Boolean scale1, String decimalPoint, Number decimalsCount, String groupsSeparator, String scaleSuffixSeparator, Boolean useBracketsForNegative, Boolean zeroFillDecimals) {
        this.scale1 = scale1;
        this.decimalPoint = decimalPoint;
        this.decimalsCount = decimalsCount;
        this.groupsSeparator = groupsSeparator;
        this.scaleSuffixSeparator = scaleSuffixSeparator;
        this.useBracketsForNegative = useBracketsForNegative;
        this.zeroFillDecimals = zeroFillDecimals;

        js.append(String.format(Locale.US, "{scale: %b,decimalPoint: %s,decimalsCount: %s,groupsSeparator: %s,scaleSuffixSeparator: %s,useBracketsForNegative: %b,zeroFillDecimals: %b}",  scale1, wrapQuotes(decimalPoint), decimalsCount, wrapQuotes(groupsSeparator), wrapQuotes(scaleSuffixSeparator), useBracketsForNegative, zeroFillDecimals));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}
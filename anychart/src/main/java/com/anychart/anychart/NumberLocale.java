package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class NumberLocale extends JsObject  {

    
    private String decimalPoint;
    private Double decimalsCount;
    private String groupsSeparator;
    private Boolean scale;
    private String scaleSuffixSeparator;
    private Boolean useBracketsForNegative;
    private Boolean zeroFillDecimals;

    
    public NumberLocale(String decimalPoint, Double decimalsCount, String groupsSeparator, Boolean scale, String scaleSuffixSeparator, Boolean useBracketsForNegative, Boolean zeroFillDecimals) {
        this.decimalPoint = decimalPoint;
        this.decimalsCount = decimalsCount;
        this.groupsSeparator = groupsSeparator;
        this.scale = scale;
        this.scaleSuffixSeparator = scaleSuffixSeparator;
        this.useBracketsForNegative = useBracketsForNegative;
        this.zeroFillDecimals = zeroFillDecimals;

        js.append(String.format(Locale.US, "{decimalPoint: %s,decimalsCount: %f,groupsSeparator: %s,scale: %b,scaleSuffixSeparator: %s,useBracketsForNegative: %b,zeroFillDecimals: %b}",  decimalPoint, decimalsCount, groupsSeparator, scale, scaleSuffixSeparator, useBracketsForNegative, zeroFillDecimals));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}
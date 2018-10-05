package com.anychart.charts.stock;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for the selected range.
 */
public class SelectedRange extends JsObject  {

    
    public SelectedRange(Number firstSelected, Number firstVisible, Number lastSelected, Number lastVisible) {
        js.append(String.format(Locale.US, "{firstSelected:%s, firstVisible: %s, lastSelected: %s, lastVisible: %s, } ", firstSelected, firstVisible, lastSelected, lastVisible));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ADL extends JsObject {

    
    private StockSeriesType type;

    public void setSeries(StockSeriesType type) {
        this.type = type;
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJStype());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Calendar extends JsObject {

    
    private Availability[] availabilities;

    public void setAvailabilities(Availability[] availabilities) {
        this.availabilities = availabilities;
    }

    private Double startDate;
    private Double endDate;
    private Interval unit;
    private String unit1;
    private Double count;

    public void setGetworkingschedule(Interval unit, Double startDate, Double endDate, Double count) {
        this.unit = null;
        this.unit1 = null;
        
        this.unit = unit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.count = count;
    }


    public void setGetworkingschedule(String unit1, Double startDate, Double endDate, Double count) {
        this.unit = null;
        this.unit1 = null;
        
        this.unit1 = unit1;
        this.startDate = startDate;
        this.endDate = endDate;
        this.count = count;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double var_value;

    public void setTimezoneoffset(Double var_value) {
        this.var_value = var_value;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double[] var_value1;

    public void setWeekendrange(Double[] var_value1) {
        this.var_value = null;
        this.var_value1 = null;
        
        this.var_value1 = var_value1;
    }

    private String generateJSavailabilities() {
        if (availabilities != null) {
            return String.format(Locale.US, "availabilities: %s,", arrayToString(availabilities));
        }
        return "";
    }

    private String generateJSstartDate() {
        if (startDate != null) {
            return String.format(Locale.US, "startDate: %f,", startDate);
        }
        return "";
    }

    private String generateJSendDate() {
        if (endDate != null) {
            return String.format(Locale.US, "endDate: %f,", endDate);
        }
        return "";
    }

    private String generateJSunit() {
        if (unit != null) {
            return String.format(Locale.US, "unit: %s,", (unit != null) ? unit.generateJs() : "null");
        }
        return "";
    }

    private String generateJSunit1() {
        if (unit1 != null) {
            return String.format(Locale.US, "unit: %s,", unit1);
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSvar_value() {
        if (var_value != null) {
            return String.format(Locale.US, "var_value: %f,", var_value);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSvar_value1() {
        if (var_value1 != null) {
            return String.format(Locale.US, "var_value: %s,", Arrays.toString(var_value1));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSavailabilities());
        js.append(generateJSstartDate());
        js.append(generateJSendDate());
        js.append(generateJSunit());
        js.append(generateJSunit1());
        js.append(generateJScount());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJStype2());
        js.append(generateJSvar_value());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSvar_value1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DateTimeTicks extends JsObject {

    
    private Double count;

    public void setCount(Double count) {
        this.count = count;
    }

    private String isodate;

    public void setInterval(String isodate) {
        this.isodate = isodate;
    }

    private Interval unit;
    private Double count1;

    public void setInterval(Interval unit, Double count1) {
        this.unit = unit;
        this.count = null;
        this.count1 = null;
        
        this.count1 = count1;
    }

    private Double years;
    private Double months;
    private Double days;
    private Double hours;
    private Double minutes;
    private Double seconds;

    public void setInterval(Double years, Double months, Double days, Double hours, Double minutes, Double seconds) {
        this.years = years;
        this.months = months;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    private String[] ticks;

    public void setSet(String[] ticks) {
        this.ticks = ticks;
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

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSisodate() {
        if (isodate != null) {
            return String.format(Locale.US, "isodate: %s,", isodate);
        }
        return "";
    }

    private String generateJSunit() {
        if (unit != null) {
            return String.format(Locale.US, "unit: %s,", (unit != null) ? unit.generateJs() : "null");
        }
        return "";
    }

    private String generateJScount1() {
        if (count1 != null) {
            return String.format(Locale.US, "count: %f,", count1);
        }
        return "";
    }

    private String generateJSyears() {
        if (years != null) {
            return String.format(Locale.US, "years: %f,", years);
        }
        return "";
    }

    private String generateJSmonths() {
        if (months != null) {
            return String.format(Locale.US, "months: %f,", months);
        }
        return "";
    }

    private String generateJSdays() {
        if (days != null) {
            return String.format(Locale.US, "days: %f,", days);
        }
        return "";
    }

    private String generateJShours() {
        if (hours != null) {
            return String.format(Locale.US, "hours: %f,", hours);
        }
        return "";
    }

    private String generateJSminutes() {
        if (minutes != null) {
            return String.format(Locale.US, "minutes: %f,", minutes);
        }
        return "";
    }

    private String generateJSseconds() {
        if (seconds != null) {
            return String.format(Locale.US, "seconds: %f,", seconds);
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

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJScount());
        js.append(generateJSisodate());
        js.append(generateJSunit());
        js.append(generateJScount1());
        js.append(generateJSyears());
        js.append(generateJSmonths());
        js.append(generateJSdays());
        js.append(generateJShours());
        js.append(generateJSminutes());
        js.append(generateJSseconds());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJStype2());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
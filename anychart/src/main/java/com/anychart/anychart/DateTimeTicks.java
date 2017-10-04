package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class DateTimeTicks extends CoreBase {

    private String jsBase;

    public DateTimeTicks() {

    }

    protected DateTimeTicks(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double count;

    public void setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".count(%f);", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%f);", count));
                js.setLength(0);
            }
        }
    }

    private String isodate;

    public void setInterval(String isodate) {
        if (jsBase == null) {
            this.isodate = isodate;
        } else {
            this.isodate = isodate;

            js.append(String.format(Locale.US, jsBase + ".interval(%s);", isodate));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s);", isodate));
                js.setLength(0);
            }
        }
    }

    private Interval unit;
    private Double count1;

    public void setInterval(Interval unit, Double count1) {
        if (jsBase == null) {
            this.unit = unit;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.unit = unit;
            this.count1 = count1;

            js.append(String.format(Locale.US, jsBase + ".interval(%s, %f);", (unit != null) ? unit.generateJs() : "null", count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s, %f);", (unit != null) ? unit.generateJs() : "null", count1));
                js.setLength(0);
            }
        }
    }

    private Double years;
    private Double months;
    private Double days;
    private Double hours;
    private Double minutes;
    private Double seconds;

    public void setInterval(Double years, Double months, Double days, Double hours, Double minutes, Double seconds) {
        if (jsBase == null) {
            this.years = years;
            this.months = months;
            this.days = days;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            this.years = years;
            this.months = months;
            this.days = days;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

            js.append(String.format(Locale.US, jsBase + ".interval(%f, %f, %f, %f, %f, %f);", years, months, days, hours, minutes, seconds));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%f, %f, %f, %f, %f, %f);", years, months, days, hours, minutes, seconds));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private String[] ticks;

    public void setSet(String[] ticks) {
        if (jsBase == null) {
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

            js.append(String.format(Locale.US, jsBase + ".set(%s);", Arrays.toString(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", Arrays.toString(ticks)));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
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

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
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

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
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

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
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
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJStype2());
            js.append(generateJSticks());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
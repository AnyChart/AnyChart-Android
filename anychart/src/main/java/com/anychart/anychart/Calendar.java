package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Calendar extends JsObject {

    private String jsBase;

    public Calendar() {

    }

    protected Calendar(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Availability[] availabilities;

    public void setAvailabilities(Availability[] availabilities) {
        if (jsBase == null) {
            this.availabilities = availabilities;
        } else {
            this.availabilities = availabilities;

            js.append(String.format(Locale.US, jsBase + ".availabilities(%s);", arrayToString(availabilities)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".availabilities(%s);", arrayToString(availabilities)));
                js.setLength(0);
            }
        }
    }

    private Double startDate;
    private Double endDate;
    private Interval unit;
    private String unit1;
    private Double count;

    public void setGetworkingschedule(Interval unit, Double startDate, Double endDate, Double count) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;
        } else {
            this.unit = unit;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", (unit != null) ? unit.generateJs() : "null", startDate, endDate, count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", (unit != null) ? unit.generateJs() : "null", startDate, endDate, count));
                js.setLength(0);
            }
        }
    }


    public void setGetworkingschedule(String unit1, Double startDate, Double endDate, Double count) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;
        } else {
            this.unit1 = unit1;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", unit1, startDate, endDate, count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", unit1, startDate, endDate, count));
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

    private Double var_value;

    public void setTimezoneoffset(Double var_value) {
        if (jsBase == null) {
            this.var_value = var_value;
        } else {
            this.var_value = var_value;

            js.append(String.format(Locale.US, jsBase + ".timezoneOffset(%f);", var_value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".timezoneOffset(%f);", var_value));
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

    private Double[] var_value1;

    public void setWeekendrange(Double[] var_value1) {
        if (jsBase == null) {
            this.var_value = null;
            this.var_value1 = null;
            
            this.var_value1 = var_value1;
        } else {
            this.var_value1 = var_value1;

            js.append(String.format(Locale.US, jsBase + ".weekendRange(%s);", Arrays.toString(var_value1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".weekendRange(%s);", Arrays.toString(var_value1)));
                js.setLength(0);
            }
        }
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

    private String generateJSvar_value1() {
        if (var_value1 != null) {
            return String.format(Locale.US, "var_value: %s,", Arrays.toString(var_value1));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSavailabilities());
            js.append(generateJSstartDate());
            js.append(generateJSendDate());
            js.append(generateJSunit());
            js.append(generateJSunit1());
            js.append(generateJScount());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJStype2());
            js.append(generateJSvar_value());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSvar_value1());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
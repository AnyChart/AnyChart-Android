package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class DateTimeWithCalendar extends ScatterBase {

    private String jsBase;

    public DateTimeWithCalendar() {

    }

    protected DateTimeWithCalendar(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Calendar getCalendar;

    public Calendar getCalendar() {
        if (getCalendar == null)
            getCalendar = new Calendar(jsBase + ".calendar()");

        return getCalendar;
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

    private Double date;

    public void setDatetopix(Double date) {
        if (jsBase == null) {
            this.date = date;
        } else {
            this.date = date;

            js.append(String.format(Locale.US, jsBase + ".dateToPix(%f);", date));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dateToPix(%f);", date));
                js.setLength(0);
            }
        }
    }

    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        if (jsBase == null) {
            this.silently = silently;
        } else {
            this.silently = silently;

            js.append(String.format(Locale.US, jsBase + ".finishAutoCalc(%b);", silently));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".finishAutoCalc(%b);", silently));
                js.setLength(0);
            }
        }
    }

    private Double fromPix;
    private Double toPix;
    private Interval unit;
    private String unit1;
    private Double count1;

    public void setGetticks(Interval unit, Double fromPix, Double toPix, Double count1) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.unit = unit;
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.count1 = count1;

            js.append(String.format(Locale.US, jsBase + ".getTicks(%s, %f, %f, %f);", (unit != null) ? unit.generateJs() : "null", fromPix, toPix, count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%s, %f, %f, %f);", (unit != null) ? unit.generateJs() : "null", fromPix, toPix, count1));
                js.setLength(0);
            }
        }
    }


    public void setGetticks(String unit1, Double fromPix, Double toPix, Double count1) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.unit1 = unit1;
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.count1 = count1;

            js.append(String.format(Locale.US, jsBase + ".getTicks(%s, %f, %f, %f);", unit1, fromPix, toPix, count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%s, %f, %f, %f);", unit1, fromPix, toPix, count1));
                js.setLength(0);
            }
        }
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;

            js.append(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));
                js.setLength(0);
            }
        }
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        if (jsBase == null) {
            this.inverted = inverted;
        } else {
            this.inverted = inverted;

            js.append(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));
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

    private Double maximum;

    public void setMaximum(Double maximum) {
        if (jsBase == null) {
            this.maximum = maximum;
        } else {
            this.maximum = maximum;

            js.append(String.format(Locale.US, jsBase + ".maximum(%f);", maximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximum(%f);", maximum));
                js.setLength(0);
            }
        }
    }

    private Double maximumGap;

    public void setMaximumgap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;

            js.append(String.format(Locale.US, jsBase + ".maximumGap(%f);", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%f);", maximumGap));
                js.setLength(0);
            }
        }
    }

    private Double minimum;

    public void setMinimum(Double minimum) {
        if (jsBase == null) {
            this.minimum = minimum;
        } else {
            this.minimum = minimum;

            js.append(String.format(Locale.US, jsBase + ".minimum(%f);", minimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimum(%f);", minimum));
                js.setLength(0);
            }
        }
    }

    private Double minimumGap;

    public void setMinimumgap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;

            js.append(String.format(Locale.US, jsBase + ".minimumGap(%f);", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%f);", minimumGap));
                js.setLength(0);
            }
        }
    }

    private Double pix;

    public void setPixtodate(Double pix) {
        if (jsBase == null) {
            this.pix = pix;
        } else {
            this.pix = pix;

            js.append(String.format(Locale.US, jsBase + ".pixToDate(%f);", pix));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pixToDate(%f);", pix));
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

    private Boolean skipHolidays;

    public void setSkipholidays(Boolean skipHolidays) {
        if (jsBase == null) {
            this.skipHolidays = skipHolidays;
        } else {
            this.skipHolidays = skipHolidays;

            js.append(String.format(Locale.US, jsBase + ".skipHolidays(%b);", skipHolidays));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".skipHolidays(%b);", skipHolidays));
                js.setLength(0);
            }
        }
    }

    private Double softMaximum;

    public void setSoftmaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;

            js.append(String.format(Locale.US, jsBase + ".softMaximum(%f);", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%f);", softMaximum));
                js.setLength(0);
            }
        }
    }

    private Double softMinimum;

    public void setSoftminimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;

            js.append(String.format(Locale.US, jsBase + ".softMinimum(%f);", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%f);", softMinimum));
                js.setLength(0);
            }
        }
    }

    private Interval unit2;
    private String unit3;

    public void setUnit(Interval unit2) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit2 = unit2;
        } else {
            this.unit2 = unit2;

            js.append(String.format(Locale.US, jsBase + ".unit(%s);", (unit2 != null) ? unit2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", (unit2 != null) ? unit2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setUnit(String unit3) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit3 = unit3;
        } else {
            this.unit3 = unit3;

            js.append(String.format(Locale.US, jsBase + ".unit(%s);", unit3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", unit3));
                js.setLength(0);
            }
        }
    }

    private Double unitPixSize;
    private String unitPixSize1;

    public void setUnitpixsize(Double unitPixSize) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize = unitPixSize;
        } else {
            this.unitPixSize = unitPixSize;

            js.append(String.format(Locale.US, jsBase + ".unitPixSize(%f);", unitPixSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%f);", unitPixSize));
                js.setLength(0);
            }
        }
    }


    public void setUnitpixsize(String unitPixSize1) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize1 = unitPixSize1;
        } else {
            this.unitPixSize1 = unitPixSize1;

            js.append(String.format(Locale.US, jsBase + ".unitPixSize(%s);", unitPixSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%s);", unitPixSize1));
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

    private String generateJSgetCalendar() {
        if (getCalendar != null) {
            return getCalendar.generateJs();
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSdate() {
        if (date != null) {
            return String.format(Locale.US, "date: %f,", date);
        }
        return "";
    }

    private String generateJSsilently() {
        if (silently != null) {
            return String.format(Locale.US, "silently: %b,", silently);
        }
        return "";
    }

    private String generateJSfromPix() {
        if (fromPix != null) {
            return String.format(Locale.US, "fromPix: %f,", fromPix);
        }
        return "";
    }

    private String generateJStoPix() {
        if (toPix != null) {
            return String.format(Locale.US, "toPix: %f,", toPix);
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

    private String generateJScount1() {
        if (count1 != null) {
            return String.format(Locale.US, "count: %f,", count1);
        }
        return "";
    }

    private String generateJSratio() {
        if (ratio != null) {
            return String.format(Locale.US, "ratio: %f,", ratio);
        }
        return "";
    }

    private String generateJSinverted() {
        if (inverted != null) {
            return String.format(Locale.US, "inverted: %b,", inverted);
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

    private String generateJSmaximum() {
        if (maximum != null) {
            return String.format(Locale.US, "maximum: %f,", maximum);
        }
        return "";
    }

    private String generateJSmaximumGap() {
        if (maximumGap != null) {
            return String.format(Locale.US, "maximumGap: %f,", maximumGap);
        }
        return "";
    }

    private String generateJSminimum() {
        if (minimum != null) {
            return String.format(Locale.US, "minimum: %f,", minimum);
        }
        return "";
    }

    private String generateJSminimumGap() {
        if (minimumGap != null) {
            return String.format(Locale.US, "minimumGap: %f,", minimumGap);
        }
        return "";
    }

    private String generateJSpix() {
        if (pix != null) {
            return String.format(Locale.US, "pix: %f,", pix);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSskipHolidays() {
        if (skipHolidays != null) {
            return String.format(Locale.US, "skipHolidays: %b,", skipHolidays);
        }
        return "";
    }

    private String generateJSsoftMaximum() {
        if (softMaximum != null) {
            return String.format(Locale.US, "softMaximum: %f,", softMaximum);
        }
        return "";
    }

    private String generateJSsoftMinimum() {
        if (softMinimum != null) {
            return String.format(Locale.US, "softMinimum: %f,", softMinimum);
        }
        return "";
    }

    private String generateJSunit2() {
        if (unit2 != null) {
            return String.format(Locale.US, "unit: %s,", (unit2 != null) ? unit2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSunit3() {
        if (unit3 != null) {
            return String.format(Locale.US, "unit: %s,", unit3);
        }
        return "";
    }

    private String generateJSunitPixSize() {
        if (unitPixSize != null) {
            return String.format(Locale.US, "unitPixSize: %f,", unitPixSize);
        }
        return "";
    }

    private String generateJSunitPixSize1() {
        if (unitPixSize1 != null) {
            return String.format(Locale.US, "unitPixSize: %s,", unitPixSize1);
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
            js.append(generateJSdate());
            js.append(generateJSsilently());
            js.append(generateJSfromPix());
            js.append(generateJStoPix());
            js.append(generateJSunit());
            js.append(generateJSunit1());
            js.append(generateJScount1());
            js.append(generateJSratio());
            js.append(generateJSinverted());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaximum());
            js.append(generateJSmaximumGap());
            js.append(generateJSminimum());
            js.append(generateJSminimumGap());
            js.append(generateJSpix());
            js.append(generateJStype2());
            js.append(generateJSskipHolidays());
            js.append(generateJSsoftMaximum());
            js.append(generateJSsoftMinimum());
            js.append(generateJSunit2());
            js.append(generateJSunit3());
            js.append(generateJSunitPixSize());
            js.append(generateJSunitPixSize1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }
            js.append(generateJSgetCalendar());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
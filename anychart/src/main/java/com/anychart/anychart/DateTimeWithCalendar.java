package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DateTimeWithCalendar extends JsObject {

    
    private Double count;

    public void setCount(Double count) {
        this.count = count;
    }

    private Double date;

    public void setDatetopix(Double date) {
        this.date = date;
    }

    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        this.silently = silently;
    }

    private Double fromPix;
    private Double toPix;
    private Interval unit;
    private String unit1;
    private Double count1;

    public void setGetticks(Interval unit, Double fromPix, Double toPix, Double count1) {
        this.unit = null;
        this.unit1 = null;
        
        this.unit = unit;
        this.fromPix = fromPix;
        this.toPix = toPix;
        this.count = null;
        this.count1 = null;
        
        this.count1 = count1;
    }


    public void setGetticks(String unit1, Double fromPix, Double toPix, Double count1) {
        this.unit = null;
        this.unit1 = null;
        
        this.unit1 = unit1;
        this.fromPix = fromPix;
        this.toPix = toPix;
        this.count = null;
        this.count1 = null;
        
        this.count1 = count1;
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        this.ratio = ratio;
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
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

    private Double maximum;

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    private Double maximumGap;

    public void setMaximumgap(Double maximumGap) {
        this.maximumGap = maximumGap;
    }

    private Double minimum;

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    private Double minimumGap;

    public void setMinimumgap(Double minimumGap) {
        this.minimumGap = minimumGap;
    }

    private Double pix;

    public void setPixtodate(Double pix) {
        this.pix = pix;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Boolean skipHolidays;

    public void setSkipholidays(Boolean skipHolidays) {
        this.skipHolidays = skipHolidays;
    }

    private Double softMaximum;

    public void setSoftmaximum(Double softMaximum) {
        this.softMaximum = softMaximum;
    }

    private Double softMinimum;

    public void setSoftminimum(Double softMinimum) {
        this.softMinimum = softMinimum;
    }

    private Interval unit2;
    private String unit3;

    public void setUnit(Interval unit2) {
        this.unit = null;
        this.unit1 = null;
        this.unit2 = null;
        this.unit3 = null;
        
        this.unit2 = unit2;
    }


    public void setUnit(String unit3) {
        this.unit = null;
        this.unit1 = null;
        this.unit2 = null;
        this.unit3 = null;
        
        this.unit3 = unit3;
    }

    private Double unitPixSize;
    private String unitPixSize1;

    public void setUnitpixsize(Double unitPixSize) {
        this.unitPixSize = null;
        this.unitPixSize1 = null;
        
        this.unitPixSize = unitPixSize;
    }


    public void setUnitpixsize(String unitPixSize1) {
        this.unitPixSize = null;
        this.unitPixSize1 = null;
        
        this.unitPixSize1 = unitPixSize1;
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


    @Override
    protected String generateJs() {
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
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
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

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
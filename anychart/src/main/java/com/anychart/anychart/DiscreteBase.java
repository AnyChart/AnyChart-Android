package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DiscreteBase extends JsObject {

    
    private Double indexes;
    private Double[] indexes1;

    public void setExcludepoint(Double indexes) {
        this.indexes = null;
        this.indexes1 = null;
        
        this.indexes = indexes;
    }


    public void setExcludepoint(Double[] indexes1) {
        this.indexes = null;
        this.indexes1 = null;
        
        this.indexes1 = indexes1;
    }

    private Double indexes2;
    private Double[] indexes3;

    public void setIncludepoint(Double indexes2) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        
        this.indexes2 = indexes2;
    }


    public void setIncludepoint(Double[] indexes3) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        
        this.indexes3 = indexes3;
    }

    private Double indexes4;
    private Double[] indexes5;

    public void setKeeponlypoints(Double indexes4) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        
        this.indexes4 = indexes4;
    }


    public void setKeeponlypoints(Double[] indexes5) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        
        this.indexes5 = indexes5;
    }

    private Double index;

    public void setUnhover(Double index) {
        this.index = index;
    }

    private Double[] indexes6;

    public void setUnhover(Double[] indexes6) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        
        this.indexes6 = indexes6;
    }

    private Double index1;

    public void setUnselect(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Double[] indexes7;

    public void setUnselect(Double[] indexes7) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        this.indexes7 = null;
        
        this.indexes7 = indexes7;
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %f,", indexes);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes1));
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes2);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes3));
        }
        return "";
    }

    private String generateJSindexes4() {
        if (indexes4 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes4);
        }
        return "";
    }

    private String generateJSindexes5() {
        if (indexes5 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes5));
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSindexes6() {
        if (indexes6 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes6));
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSindexes7() {
        if (indexes7 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes7));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSindexes());
        js.append(generateJSindexes1());
        js.append(generateJSindexes2());
        js.append(generateJSindexes3());
        js.append(generateJSindexes4());
        js.append(generateJSindexes5());
        js.append(generateJSindex());
        js.append(generateJSindexes6());
        js.append(generateJSindex1());
        js.append(generateJSindexes7());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class View extends CoreBase {

    public View() {

    }

    protected View(String jsBase) {
        this.jsBase = jsBase;
    }

    protected View(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private View otherView;
    private String[] otherView1;

    public View setConcat(View otherView) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView = otherView;
        } else {
            this.otherView = otherView;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".concat(%s)", (otherView != null) ? otherView.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".concat(%s)", (otherView != null) ? otherView.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public View setConcat(String[] otherView1) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView1 = otherView1;
        } else {
            this.otherView1 = otherView1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".concat(%s)", Arrays.toString(otherView1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".concat(%s)", Arrays.toString(otherView1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName;

    public View setFilter(String fieldName) {
        if (jsBase == null) {
            this.fieldName = fieldName;
        } else {
            this.fieldName = fieldName;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".filter(%s)", fieldName));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".filter(%s)", fieldName));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName1;

    public void setFind(String fieldName1) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            
            this.fieldName1 = fieldName1;
        } else {
            this.fieldName1 = fieldName1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".find(%s);", fieldName1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".find(%s)", fieldName1));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex;
    private String fieldName2;

    public void setGet(Double rowIndex, String fieldName2) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            
            this.fieldName2 = fieldName2;
        } else {
            this.rowIndex = rowIndex;
            this.fieldName2 = fieldName2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".get(%f, %s);", rowIndex, fieldName2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%f, %s)", rowIndex, fieldName2));
                js.setLength(0);
            }
        }
    }

    private Double index;
    private String name;

    public void setMeta(Double index, String name) {
        if (jsBase == null) {
            this.index = index;
            this.name = name;
        } else {
            this.index = index;
            this.name = name;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".meta(%f, %s);", index, name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%f, %s)", index, name));
                js.setLength(0);
            }
        }
    }

    private Double index1;
    private String name1;
    private Double rowIndex1;

    public void setRow(Double rowIndex1) {
        if (jsBase == null) {
            this.rowIndex = null;
            this.rowIndex1 = null;
            
            this.rowIndex1 = rowIndex1;
        } else {
            this.rowIndex1 = rowIndex1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".row(%f);", rowIndex1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f)", rowIndex1));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex2;
    private Double rowIndex3;
    private String fieldName3;

    public View setSet(Double rowIndex3, String fieldName3) {
        if (jsBase == null) {
            this.rowIndex = null;
            this.rowIndex1 = null;
            this.rowIndex2 = null;
            this.rowIndex3 = null;
            
            this.rowIndex3 = rowIndex3;
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            
            this.fieldName3 = fieldName3;
        } else {
            this.rowIndex3 = rowIndex3;
            this.fieldName3 = fieldName3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%f, %s)", rowIndex3, fieldName3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%f, %s)", rowIndex3, fieldName3));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName4;

    public View setSort(String fieldName4) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            
            this.fieldName4 = fieldName4;
        } else {
            this.fieldName4 = fieldName4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".sort(%s)", fieldName4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", fieldName4));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fieldName5;
    private Sort order;

    public View setSort(String fieldName5, Sort order) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            this.fieldName5 = null;
            
            this.fieldName5 = fieldName5;
            this.order = order;
        } else {
            this.fieldName5 = fieldName5;
            this.order = order;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".sort(%s, %s)", fieldName5, (order != null) ? order.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sort(%s, %s)", fieldName5, (order != null) ? order.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSotherView() {
        if (otherView != null) {
            return String.format(Locale.US, "otherView: %s,", (otherView != null) ? otherView.generateJs() : "null");
        }
        return "";
    }

    private String generateJSotherView1() {
        if (otherView1 != null) {
            return String.format(Locale.US, "otherView: %s,", Arrays.toString(otherView1));
        }
        return "";
    }

    private String generateJSfieldName() {
        if (fieldName != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName);
        }
        return "";
    }

    private String generateJSfieldName1() {
        if (fieldName1 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName1);
        }
        return "";
    }

    private String generateJSrowIndex() {
        if (rowIndex != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex);
        }
        return "";
    }

    private String generateJSfieldName2() {
        if (fieldName2 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName2);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJSrowIndex1() {
        if (rowIndex1 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex1);
        }
        return "";
    }

    private String generateJSrowIndex2() {
        if (rowIndex2 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex2);
        }
        return "";
    }

    private String generateJSrowIndex3() {
        if (rowIndex3 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex3);
        }
        return "";
    }

    private String generateJSfieldName3() {
        if (fieldName3 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName3);
        }
        return "";
    }

    private String generateJSfieldName4() {
        if (fieldName4 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName4);
        }
        return "";
    }

    private String generateJSfieldName5() {
        if (fieldName5 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName5);
        }
        return "";
    }

    private String generateJSorder() {
        if (order != null) {
            return String.format(Locale.US, "order: %s,", (order != null) ? order.generateJs() : "null");
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSotherView());
            js.append(generateJSotherView1());
            js.append(generateJSfieldName());
            js.append(generateJSfieldName1());
            js.append(generateJSrowIndex());
            js.append(generateJSfieldName2());
            js.append(generateJSindex());
            js.append(generateJSname());
            js.append(generateJSindex1());
            js.append(generateJSname1());
            js.append(generateJSrowIndex1());
            js.append(generateJSrowIndex2());
            js.append(generateJSrowIndex3());
            js.append(generateJSfieldName3());
            js.append(generateJSfieldName4());
            js.append(generateJSfieldName5());
            js.append(generateJSorder());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
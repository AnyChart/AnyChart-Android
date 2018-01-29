package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Table mapping proxy that supports selection
 */
public class TableSelectable extends JsObject {

    public TableSelectable() {
        js.setLength(0);
        js.append("var tableSelectable").append(++variableIndex).append(" = anychart.data.tableSelectable();");
        jsBase = "tableSelectable" + variableIndex;
    }

    protected TableSelectable(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableSelectable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number key;
    private TableSearchMode mode;
    private String mode1;
    private List<TableselectableRowProxy> setSearch = new ArrayList<>();

    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public TableselectableRowProxy search(Number key, TableSearchMode mode) {
        if (jsBase == null) {
            this.key = key;
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.key = key;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch" + ++variableIndex + " = " + jsBase + ".search(%s, %s);", key, ((mode != null) ? mode.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s);", key, ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableselectableRowProxy item = new TableselectableRowProxy("setSearch" + variableIndex);
        setSearch.add(item);
        return item;
    }
    private String generateJSsetSearch() {
        if (!setSearch.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableselectableRowProxy item : setSearch) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableselectableRowProxy> setSearch1 = new ArrayList<>();

    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public TableselectableRowProxy search(Number key, String mode1) {
        if (jsBase == null) {
            this.key = key;
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.key = key;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch1" + ++variableIndex + " = " + jsBase + ".search(%s, %s);", key, wrapQuotes(mode1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s);", key, wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        TableselectableRowProxy item = new TableselectableRowProxy("setSearch1" + variableIndex);
        setSearch1.add(item);
        return item;
    }
    private String generateJSsetSearch1() {
        if (!setSearch1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableselectableRowProxy item : setSearch1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number startDate;
    private String startDate1;
    private Number endDate;
    private String endDate1;
    private Interval intervalUnit;
    private String intervalUnit1;
    private Number intervalCount;

    /**
     * Selects asked range.
     */
    public TableSelectable select(Number startDate, Number intervalCount, Number endDate, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", startDate, intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Number startDate, Number intervalCount, Number endDate, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", startDate, intervalCount, endDate, wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, intervalCount, endDate, wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Number startDate, Number intervalCount, String endDate1, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Number startDate, Number intervalCount, String endDate1, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Number intervalCount, Number endDate, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", wrapQuotes(startDate1), intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate1), intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Number intervalCount, Number endDate, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", wrapQuotes(startDate1), intervalCount, endDate, wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate1), intervalCount, endDate, wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Number intervalCount, String endDate1, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Number intervalCount, String endDate1, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval intervalUnit2;
    private String intervalUnit3;
    private Number intervalCount1;

    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(Interval intervalUnit2, Number intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            this.intervalUnit2 = null;
            this.intervalUnit3 = null;
            
            this.intervalUnit2 = intervalUnit2;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit2 = intervalUnit2;
            this.intervalCount1 = intervalCount1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectAll(%s, %s)", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectAll(%s, %s);", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(String intervalUnit3, Number intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            this.intervalUnit2 = null;
            this.intervalUnit3 = null;
            
            this.intervalUnit3 = intervalUnit3;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit3 = intervalUnit3;
            this.intervalCount1 = intervalCount1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectAll(%s, %s)", wrapQuotes(intervalUnit3), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectAll(%s, %s);", wrapQuotes(intervalUnit3), intervalCount1));
                js.setLength(0);
            }
        }
        return this;
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

        js.append(generateJsGetters());

        js.append(generateJSsetSearch());
        js.append(generateJSsetSearch1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
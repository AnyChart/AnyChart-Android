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

    
    private Double key;
    private TableSearchMode mode;
    private String mode1;

    /**
     * Searches asked key with asked mode and returns an object that allows values fetching.
     */
    public TableselectableRowProxy search(TableSearchMode mode, Double key) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
            this.key = key;
        } else {
            this.mode = mode;
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %f)", ((mode != null) ? mode.generateJs() : "null"), key));
                js.setLength(0);
            }
        }
        return new TableselectableRowProxy(jsBase);
    }


    /**
     * Searches asked key with asked mode and returns an object that allows values fetching.
     */
    public TableselectableRowProxy search(String mode1, Double key) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
            this.key = key;
        } else {
            this.mode1 = mode1;
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %f)", wrapQuotes(mode1), key));
                js.setLength(0);
            }
        }
        return new TableselectableRowProxy(jsBase);
    }

    private Double startDate;
    private String startDate1;
    private Double endDate;
    private String endDate1;
    private Interval intervalUnit;
    private String intervalUnit1;
    private Double intervalCount;

    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double endDate, String intervalUnit1, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, wrapQuotes(intervalUnit1), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, wrapQuotes(intervalUnit1), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, String endDate1, String intervalUnit1, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, wrapQuotes(endDate1), wrapQuotes(intervalUnit1), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, wrapQuotes(endDate1), wrapQuotes(intervalUnit1), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%s, %f, %s, %f)", wrapQuotes(startDate1), endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %s, %f)", wrapQuotes(startDate1), endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double endDate, String intervalUnit1, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%s, %f, %s, %f)", wrapQuotes(startDate1), endDate, wrapQuotes(intervalUnit1), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %s, %f)", wrapQuotes(startDate1), endDate, wrapQuotes(intervalUnit1), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %f)", wrapQuotes(startDate1), wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %s, %s, %f)", wrapQuotes(startDate1), wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null"), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, String endDate1, String intervalUnit1, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = intervalCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".select(%s, %s, %s, %f)", wrapQuotes(startDate1), wrapQuotes(endDate1), wrapQuotes(intervalUnit1), intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %s, %s, %f)", wrapQuotes(startDate1), wrapQuotes(endDate1), wrapQuotes(intervalUnit1), intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval intervalUnit2;
    private String intervalUnit3;
    private Double intervalCount1;

    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(Interval intervalUnit2, Double intervalCount1) {
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
            js.append(String.format(Locale.US, ".selectAll(%s, %f)", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectAll(%s, %f)", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(String intervalUnit3, Double intervalCount1) {
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
            js.append(String.format(Locale.US, ".selectAll(%s, %f)", wrapQuotes(intervalUnit3), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectAll(%s, %f)", wrapQuotes(intervalUnit3), intervalCount1));
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
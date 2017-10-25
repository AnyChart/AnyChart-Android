package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class DataTable extends CoreBase {

    public DataTable() {

    }

    protected DataTable(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DataTable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String[] rawData;
    private String rawData1;
    private Boolean removeFromStart;
    private Double removeFromStart1;
    private String csvSettings;

    public DataTable addData(String[] rawData, Boolean removeFromStart, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
        } else {
            this.rawData = rawData;
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %b, %s)", arrayToStringWrapQuotes(rawData), removeFromStart, wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %b, %s)", arrayToStringWrapQuotes(rawData), removeFromStart, wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable addData(String[] rawData, Double removeFromStart1, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
        } else {
            this.rawData = rawData;
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %f, %s)", arrayToStringWrapQuotes(rawData), removeFromStart1, wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %f, %s)", arrayToStringWrapQuotes(rawData), removeFromStart1, wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable addData(String rawData1, Boolean removeFromStart, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
        } else {
            this.rawData1 = rawData1;
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %b, %s)", wrapQuotes(rawData1), removeFromStart, wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %b, %s)", wrapQuotes(rawData1), removeFromStart, wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable addData(String rawData1, Double removeFromStart1, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
        } else {
            this.rawData1 = rawData1;
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %f, %s)", wrapQuotes(rawData1), removeFromStart1, wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %f, %s)", wrapQuotes(rawData1), removeFromStart1, wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fields;

    public TableMapping mapAs(String fields) {
        if (jsBase == null) {
            this.fields = fields;
        } else {
            this.fields = fields;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", wrapQuotes(fields)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(fields)));
                js.setLength(0);
            }
        }
        return new TableMapping(jsBase);
    }

    private Double startKey;
    private String startKey1;
    private Double endKey;
    private String endKey1;

    public DataTable remove(Double startKey, Double endKey) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey = startKey;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey = endKey;
        } else {
            this.startKey = startKey;
            this.endKey = endKey;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%f, %f)", startKey, endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f, %f)", startKey, endKey));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable remove(Double startKey, String endKey1) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey = startKey;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey1 = endKey1;
        } else {
            this.startKey = startKey;
            this.endKey1 = endKey1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%f, %s)", startKey, wrapQuotes(endKey1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f, %s)", startKey, wrapQuotes(endKey1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable remove(String startKey1, Double endKey) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey1 = startKey1;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey = endKey;
        } else {
            this.startKey1 = startKey1;
            this.endKey = endKey;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%s, %f)", wrapQuotes(startKey1), endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %f)", wrapQuotes(startKey1), endKey));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable remove(String startKey1, String endKey1) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey1 = startKey1;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey1 = endKey1;
        } else {
            this.startKey1 = startKey1;
            this.endKey1 = endKey1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%s, %s)", wrapQuotes(startKey1), wrapQuotes(endKey1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %s)", wrapQuotes(startKey1), wrapQuotes(endKey1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double count;

    public DataTable removeFirst(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeFirst(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeFirst(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSrawData());
////        
//            js.append(generateJSrawData1());
////        
//            js.append(generateJSremoveFromStart());
////        
//            js.append(generateJSremoveFromStart1());
////        
//            js.append(generateJScsvSettings());
////        
//            js.append(generateJSfields());
////        
//            js.append(generateJSstartKey());
////        
//            js.append(generateJSstartKey1());
////        
//            js.append(generateJSendKey());
////        
//            js.append(generateJSendKey1());
////        
//            js.append(generateJScount());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
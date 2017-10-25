package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Set extends CoreBase {

    public Set() {

    }

    protected Set(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Set(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String[] data;
    private String data1;
    private TextParsingMode settings;
    private String settings1;
    private TextParsingSettings settings2;

    public Set setData(String[] data, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings = settings;
        } else {
            this.data = data;
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings != null) ? settings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings != null) ? settings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Set setData(String[] data, String settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings1 = settings1;
        } else {
            this.data = data;
            this.settings1 = settings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(settings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(settings1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Set setData(String[] data, TextParsingSettings settings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings2 = settings2;
        } else {
            this.data = data;
            this.settings2 = settings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings2 != null) ? settings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings2 != null) ? settings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Set setData(String data1, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings = settings;
        } else {
            this.data1 = data1;
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings != null) ? settings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings != null) ? settings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Set setData(String data1, String settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings1 = settings1;
        } else {
            this.data1 = data1;
            this.settings1 = settings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), wrapQuotes(settings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), wrapQuotes(settings1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Set setData(String data1, TextParsingSettings settings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings2 = settings2;
        } else {
            this.data1 = data1;
            this.settings2 = settings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings2 != null) ? settings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings2 != null) ? settings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;

    public Set insert(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".insert(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".insert(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private String mapping;

    public Mapping mapAs(String mapping) {
        if (jsBase == null) {
            this.mapping = mapping;
        } else {
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", wrapQuotes(mapping)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
                js.setLength(0);
            }
        }
        return new Mapping(jsBase);
    }

    private Double index1;

    public Set remove(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rowIndex;

    public void setRow(Double rowIndex) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
        } else {
            this.rowIndex = rowIndex;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".row(%f);", rowIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f)", rowIndex));
                js.setLength(0);
            }
        }
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
//            js.append(generateJSdata());
////        
//            js.append(generateJSdata1());
////        
//            js.append(generateJSsettings());
////        
//            js.append(generateJSsettings1());
////        
//            js.append(generateJSsettings2());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJSmapping());
////        
//            js.append(generateJSindex1());
////        
//            js.append(generateJSrowIndex());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
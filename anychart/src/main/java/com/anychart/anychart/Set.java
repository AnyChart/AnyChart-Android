package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Set extends CoreBase {

    private String jsBase;

    public Set() {

    }

    protected Set(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String[] data;
    private String data1;
    private TextParsingMode settings;
    private TextParsingSettings settings1;

    public void setData(String[] data, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            
            this.settings = settings;
        } else {
            this.data = data;
            this.settings = settings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data), (settings != null) ? settings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data), (settings != null) ? settings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String[] data, TextParsingSettings settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            
            this.settings1 = settings1;
        } else {
            this.data = data;
            this.settings1 = settings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data), (settings1 != null) ? settings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data), (settings1 != null) ? settings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String data1, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            
            this.settings = settings;
        } else {
            this.data1 = data1;
            this.settings = settings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data1, (settings != null) ? settings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", data1, (settings != null) ? settings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String data1, TextParsingSettings settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            
            this.settings1 = settings1;
        } else {
            this.data1 = data1;
            this.settings1 = settings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data1, (settings1 != null) ? settings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", data1, (settings1 != null) ? settings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setInsert(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".insert(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".insert(%f);", index));
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

    private String arrayMapping;
    private String objectMapping;
    private String[] defaultProps;
    private String[] indexProps;

    public void setMapas(String arrayMapping, String objectMapping, String[] defaultProps, String[] indexProps) {
        if (jsBase == null) {
            this.arrayMapping = arrayMapping;
            this.objectMapping = objectMapping;
            this.defaultProps = defaultProps;
            this.indexProps = indexProps;
        } else {
            this.arrayMapping = arrayMapping;
            this.objectMapping = objectMapping;
            this.defaultProps = defaultProps;
            this.indexProps = indexProps;

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s, %s, %s, %s);", arrayMapping, objectMapping, Arrays.toString(defaultProps), Arrays.toString(indexProps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s, %s, %s, %s);", arrayMapping, objectMapping, Arrays.toString(defaultProps), Arrays.toString(indexProps)));
                js.setLength(0);
            }
        }
    }

    private Double index1;

    public void setRemove(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".remove(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".remove(%f);", index1));
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

    private Double rowIndex;

    public void setRow(Double rowIndex) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
        } else {
            this.rowIndex = rowIndex;

            js.append(String.format(Locale.US, jsBase + ".row(%f);", rowIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f);", rowIndex));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex1;
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

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", Arrays.toString(data));
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", data1);
        }
        return "";
    }

    private String generateJSsettings() {
        if (settings != null) {
            return String.format(Locale.US, "settings: %s,", (settings != null) ? settings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsettings1() {
        if (settings1 != null) {
            return String.format(Locale.US, "settings: %s,", (settings1 != null) ? settings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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

    private String generateJSarrayMapping() {
        if (arrayMapping != null) {
            return String.format(Locale.US, "arrayMapping: %s,", arrayMapping);
        }
        return "";
    }

    private String generateJSobjectMapping() {
        if (objectMapping != null) {
            return String.format(Locale.US, "objectMapping: %s,", objectMapping);
        }
        return "";
    }

    private String generateJSdefaultProps() {
        if (defaultProps != null) {
            return String.format(Locale.US, "defaultProps: %s,", Arrays.toString(defaultProps));
        }
        return "";
    }

    private String generateJSindexProps() {
        if (indexProps != null) {
            return String.format(Locale.US, "indexProps: %s,", Arrays.toString(indexProps));
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSrowIndex() {
        if (rowIndex != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex);
        }
        return "";
    }

    private String generateJSrowIndex1() {
        if (rowIndex1 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex1);
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
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSsettings());
            js.append(generateJSsettings1());
            js.append(generateJSindex());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSarrayMapping());
            js.append(generateJSobjectMapping());
            js.append(generateJSdefaultProps());
            js.append(generateJSindexProps());
            js.append(generateJSindex1());
            js.append(generateJStype2());
            js.append(generateJSrowIndex());
            js.append(generateJSrowIndex1());
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
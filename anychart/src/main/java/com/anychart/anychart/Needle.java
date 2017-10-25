package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Needle extends GaugePointersBase {

    public Needle() {

    }

    protected Needle(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Needle(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double endRadius;
    private String endRadius1;

    public Needle setEndRadius(Double endRadius) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius = endRadius;
        } else {
            this.endRadius = endRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endRadius(%f)", endRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endRadius(%f)", endRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setEndRadius(String endRadius1) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius1 = endRadius1;
        } else {
            this.endRadius1 = endRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endRadius(%s)", wrapQuotes(endRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endRadius(%s)", wrapQuotes(endRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double endWidth;
    private String endWidth1;

    public Needle setEndWidth(Double endWidth) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth = endWidth;
        } else {
            this.endWidth = endWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endWidth(%f)", endWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endWidth(%f)", endWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setEndWidth(String endWidth1) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth1 = endWidth1;
        } else {
            this.endWidth1 = endWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endWidth(%s)", wrapQuotes(endWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endWidth(%s)", wrapQuotes(endWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double middleRadius;
    private String middleRadius1;

    public Needle setMiddleRadius(Double middleRadius) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius = middleRadius;
        } else {
            this.middleRadius = middleRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleRadius(%f)", middleRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleRadius(%f)", middleRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setMiddleRadius(String middleRadius1) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius1 = middleRadius1;
        } else {
            this.middleRadius1 = middleRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleRadius(%s)", wrapQuotes(middleRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleRadius(%s)", wrapQuotes(middleRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double middleWidth;
    private String middleWidth1;

    public Needle setMiddleWidth(Double middleWidth) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth = middleWidth;
        } else {
            this.middleWidth = middleWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleWidth(%f)", middleWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleWidth(%f)", middleWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setMiddleWidth(String middleWidth1) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth1 = middleWidth1;
        } else {
            this.middleWidth1 = middleWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleWidth(%s)", wrapQuotes(middleWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleWidth(%s)", wrapQuotes(middleWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startRadius;
    private String startRadius1;

    public Needle setStartRadius(Double startRadius) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius = startRadius;
        } else {
            this.startRadius = startRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startRadius(%f)", startRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startRadius(%f)", startRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setStartRadius(String startRadius1) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius1 = startRadius1;
        } else {
            this.startRadius1 = startRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startRadius(%s)", wrapQuotes(startRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startRadius(%s)", wrapQuotes(startRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startWidth;
    private String startWidth1;

    public Needle setStartWidth(Double startWidth) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth = startWidth;
        } else {
            this.startWidth = startWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startWidth(%f)", startWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startWidth(%f)", startWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public Needle setStartWidth(String startWidth1) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth1 = startWidth1;
        } else {
            this.startWidth1 = startWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startWidth(%s)", wrapQuotes(startWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startWidth(%s)", wrapQuotes(startWidth1)));
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
//            js.append(generateJSendRadius());
////        
//            js.append(generateJSendRadius1());
////        
//            js.append(generateJSendWidth());
////        
//            js.append(generateJSendWidth1());
////        
//            js.append(generateJSmiddleRadius());
////        
//            js.append(generateJSmiddleRadius1());
////        
//            js.append(generateJSmiddleWidth());
////        
//            js.append(generateJSmiddleWidth1());
////        
//            js.append(generateJSstartRadius());
////        
//            js.append(generateJSstartRadius1());
////        
//            js.append(generateJSstartWidth());
////        
//            js.append(generateJSstartWidth1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
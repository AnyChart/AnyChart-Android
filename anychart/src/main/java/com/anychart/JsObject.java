package com.anychart;

import android.text.TextUtils;

import com.anychart.chart.common.dataentry.DataEntry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public abstract class JsObject {

//    public interface JsObjectInterface {
//        String getJsBase();
//    }

    protected StringBuilder js = new StringBuilder();

    public String getJsBase() {
        return js.toString();
    }

    protected StringBuilder getJs() {
        return js;
    }

    protected static int variableIndex = 0;

    protected String jsBase;

//    protected boolean isChain = false;

//    protected static OnChange onChangeListener;

//    protected static boolean isRendered = false;

    protected JsObject() {

    }

    protected JsObject(String jsBase) {
        this.jsBase = jsBase;
    }

//    interface OnChange {
//        void onChange(String jsChange);
//    }

//    protected void setOnChangeListener(OnChange listener) {
//        onChangeListener = listener;
//
////        isRendered = true;
//    }

//    protected String generateJsGetters() {
//        return "";
//    }

    protected static String wrapQuotes(String value) {
        if (TextUtils.isEmpty(value)) {
            return value;
        }

        if (isJSONValid(value) || isFunction(value)) {
            return value;
        }

        StringBuilder result = new StringBuilder(value.length() + 2);
        result.append("\'").append(value).append("\'");

        return result.toString();
    }

    private static boolean isJSONValid(String json) {
        try {
            new JSONObject(json);
        } catch (JSONException ex1) {
            try {
                new JSONArray(json);
            } catch (JSONException ex2) {
                return false;
            }
        }
        return true;
    }

    private static boolean isFunction(String function) {
        return function.length() > 10 && function.trim().toLowerCase().substring(0, 8).equals("function");
    }

    private static boolean isContainBracketOrBrace(String value) {
        return value.charAt(0) == '[' || value.charAt(0) == '{';
    }

    protected static String arrayToStringWrapQuotes(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (TextUtils.isDigitsOnly(array[i]) || isContainBracketOrBrace(array[i]))
                continue;
            array[i] = wrapQuotes(array[i]);
        }
        return Arrays.toString(array);
    }

    protected static String arrayToString(JsObject[] jsObjects) {
        if (jsObjects == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < jsObjects.length; i++) {
            result.append(jsObjects[i].getJsBase());
            if (i != jsObjects.length - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

//    protected static String arrayToString(JsObjectInterface[] jsObjects) {
//        if (jsObjects == null) {
//            return "";
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        result.append("[");
//
//        for (int i = 0; i < jsObjects.length; i++) {
//            result.append(jsObjects[i].getJsBase());
//            if (i != jsObjects.length - 1) {
//                result.append(", ");
//            }
//        }
//
//        result.append("]");
//
//        return result.toString();
//    }

    protected static String arrayToString(Object[] jsObjects) {
        if (jsObjects == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < jsObjects.length; i++) {
            Method method;
            try {
                method = jsObjects[i].getClass().getMethod("generateJs");
                result.append((String) method.invoke(jsObjects[i]));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if (i != jsObjects.length - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

    protected static String arrayToString(List<DataEntry> data) {
        if (data == null) {
            return "";
        }

        StringBuilder resultData = new StringBuilder();
        resultData.append("[");
        for (DataEntry dataEntry : data) {
            resultData.append(dataEntry.generateJs()).append(", ");
        }
        resultData.setLength(resultData.length() - 1);
        resultData.append("]");

        return resultData.toString();
    }

}

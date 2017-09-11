package com.anychart.anychart;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by arseny on 8/9/17.
 */

public abstract class JsObject {

    public interface JsObjectInterface {
        String generateJs();
    }

    protected StringBuilder js = new StringBuilder();

    protected String generateJs() {
        return js.toString();
    }

    protected StringBuilder getJs() {
        return js;
    }

    OnChange onChangeListener;

    boolean isRendered = false;

    interface OnChange {
        void onChange(String jsChange);
    }

    void setOnChangeListener(OnChange listener) {
        onChangeListener = listener;

        isRendered = true;
    }

    public static String arrayToString(JsObject[] jsObjects) {
        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < jsObjects.length; i++) {
            result.append(jsObjects[i].generateJs());
            if (i != jsObjects.length - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

    public static String arrayToString(JsObjectInterface[] jsObjects) {
        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < jsObjects.length; i++) {
            result.append(jsObjects[i].generateJs());
            if (i != jsObjects.length - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

    public static String arrayToString(Object[] jsObjects) {
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

}

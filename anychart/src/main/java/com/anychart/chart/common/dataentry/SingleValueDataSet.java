package com.anychart.chart.common.dataentry;

import com.anychart.data.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleValueDataSet extends View {

    private StringBuilder js = new StringBuilder();

    private List<Object> values = new ArrayList<>();

    public SingleValueDataSet(Object[] values) {
        this.values = Arrays.asList(values);
    }

    public SingleValueDataSet(List<Object> values) {
        this.values.addAll(values);
    }

    public void addValue(Object value) {
        values.add(value);
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void clear() {
        values.clear();
    }

    public String getJsBase() {
        js.append("[");
        for (Object singleValue : values) {
            js.append(singleValue).append(",");
        }
        js.setLength(js.length() - 1);
        js.append("]");

        return js.toString();
    }

}

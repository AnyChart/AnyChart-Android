package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.OrdinalColor;
import com.anychart.anychart.Tree;
import com.anychart.anychart.TreeFillingMethod;
import com.anychart.anychart.TreeMap;
import com.anychart.sample.R;

public class TreeMapChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChart = (AnyChartView) findViewById(R.id.any_chart_view);

//        Tree tree = new Tree();
//        tree.setAdddata(getData(), TreeFillingMethod.AS_TABLE, null);
        TreeMap treeMap = new TreeMap();
        OrdinalColor ordinalColor = new OrdinalColor();
//        ordinalColor.setRanges("[{less: 25000}," +
//                        "        {from: 25000, to: 30000}," +
//                        "        {from: 30000, to: 40000}," +
//                        "        {from: 40000, to: 50000}," +
//                        "        {from: 50000, to: 100000}," +
//                        "        {greater: 100000}]");
//        ordinalColor.setColors(new String[] { "'#ffee58'", "'#fbc02d'", "'#f57f17'", "'#c0ca33'", "'#689f38'", "'#2e7d32'" });
//        treeMap.setColorscale(ordinalColor);
        treeMap.setData(getData(), TreeFillingMethod.AS_TABLE);
        treeMap.setMaxdepth(2d);

        anyChart.setChart(treeMap);
    }

    private String getData() {
        return
                "[{id: 'Products by Revenue', product: 'Products by Revenue', parent: null}," +
                "{parent: 'Products by Revenue', id: 'Fruits', product: 'Fruits', value: 692000}," +
                "{parent: 'Products by Revenue', id: 'Vegetables', product: 'Vegetables', value: 597000}," +
                "{parent: 'Products by Revenue', id: 'Dairy', product: 'Dairy', value: 1359000}," +
                "{parent: 'Products by Revenue', id: 'Meat', product: 'Meat', value: 596000}," +
                "{parent: 'Fruits', id: 'Apples', product: 'Apples', value: 138000}," +
                "{parent: 'Fruits', id: 'Oranges', product: 'Oranges', value: 22000}," +
                "{parent: 'Fruits', id: 'Bananas', product: 'Bananas', value: 88000}," +
                "{parent: 'Fruits', id: 'Melons', product: 'Melons', value: 77000}," +
                "{parent: 'Fruits', id: 'Apricots', product: 'Apricots', value: 48000}," +
                "{parent: 'Fruits', id: 'Plums', product: 'Plums', value: 48000}," +
                "{parent: 'Fruits', id: 'Pineapples', product: 'Pineapples', value: 41000}," +
                "{parent: 'Fruits', id: 'Cherries', product: 'Cherries', value: 39000}," +
                "{parent: 'Fruits', id: 'Tangerines', product: 'Tangerines', value: 32000}," +
                "{parent: 'Vegetables', id: 'Potato', product: 'Potato', value: 189000}," +
                "{parent: 'Vegetables', id: 'Eggplants', product: 'Eggplants', value: 94000}," +
                "{parent: 'Vegetables', id: 'Tomatoes', product: 'Tomatoes', value: 63000}," +
                "{parent: 'Vegetables', id: 'Cucumbers', product: 'Cucumbers', value: 43000}," +
                "{parent: 'Vegetables', id: 'Cabbage', product: 'Cabbage', value: 30000}," +
                "{parent: 'Vegetables', id: 'Carrot', product: 'Carrot', value: 29000}," +
                "{parent: 'Vegetables', id: 'Squash', product: 'Squash', value: 26000}," +
                "{parent: 'Vegetables', id: 'Capsicums', product: 'Capsicums', value: 23000}," +
                "{parent: 'Dairy', id: 'Milk', product: 'Milk', value: 154000}," +
                "{parent: 'Dairy', id: 'Curd', product: 'Curd', value: 142000}," +
                "{parent: 'Dairy', id: 'Cheese', product: 'Cheese', value: 43000}," +
                "{parent: 'Dairy', id: 'Yogurt', product: 'Yogurt', value: 38000}," +
                "{parent: 'Dairy', id: 'Kefir', product: 'Kefir', value: 32000}," +
                "{parent: 'Meat', id: 'Mutton', product: 'Mutton', value: 154000}," +
                "{parent: 'Meat', id: 'Beef', product: 'Beef', value: 142000}," +
                "{parent: 'Meat', id: 'Pork', product: 'Pork', value: 43000}," +
                "{parent: 'Meat', id: 'Veal', product: 'Veal', value: 38000}]";
    }
}

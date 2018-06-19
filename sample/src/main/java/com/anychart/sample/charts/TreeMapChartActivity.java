package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.LegendLayout;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.SelectionMode;
import com.anychart.anychart.TreeDataEntry;
import com.anychart.anychart.TreeFillingMethod;
import com.anychart.anychart.TreeMap;
import com.anychart.anychart.UiTitle;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class TreeMapChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        TreeMap treeMap = AnyChart.treeMap();

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomTreeDataEntry("Products by Revenue", null, "Products by Revenue"));
        data.add(new CustomTreeDataEntry("Fruits", "Products by Revenue", "Fruits", 692000));
        data.add(new CustomTreeDataEntry("Vegetables", "Products by Revenue", "Vegetables", 597000));
        data.add(new CustomTreeDataEntry("Dairy", "Products by Revenue", "Dairy", 1359000));
        data.add(new CustomTreeDataEntry("Meat", "Products by Revenue", "Meat", 596000));
        data.add(new CustomTreeDataEntry("Apples", "Fruits", "Apples", 138000));
        data.add(new CustomTreeDataEntry("Oranges", "Fruits", "Oranges", 22000));
        data.add(new CustomTreeDataEntry("Bananas", "Fruits", "Bananas", 88000));
        data.add(new CustomTreeDataEntry("Melons", "Fruits", "Melons", 77000));
        data.add(new CustomTreeDataEntry("Apricots", "Fruits", "Apricots", 48000));
        data.add(new CustomTreeDataEntry("Plums", "Fruits", "Plums", 48000));
        data.add(new CustomTreeDataEntry("Pineapples", "Fruits", "Pineapples", 41000));
        data.add(new CustomTreeDataEntry("Cherries", "Fruits", "Cherries", 39000));
        data.add(new CustomTreeDataEntry("Tangerines", "Fruits", "Tangerines", 32000));
        data.add(new CustomTreeDataEntry("Potato", "Vegetables", "Potato", 189000));
        data.add(new CustomTreeDataEntry("Eggplants", "Vegetables", "Eggplants", 94000));
        data.add(new CustomTreeDataEntry("Tomatoes", "Vegetables", "Tomatoes", 63000));
        data.add(new CustomTreeDataEntry("Cucumbers", "Vegetables", "Cucumbers", 43000));
        data.add(new CustomTreeDataEntry("Cabbage", "Vegetables", "Cabbage", 30000));
        data.add(new CustomTreeDataEntry("Carrot", "Vegetables", "Carrot", 29000));
        data.add(new CustomTreeDataEntry("Squash", "Vegetables", "Squash", 26000));
        data.add(new CustomTreeDataEntry("Capsicums", "Vegetables", "Capsicums", 23000));
        data.add(new CustomTreeDataEntry("Milk", "Dairy", "Milk", 154000));
        data.add(new CustomTreeDataEntry("Curd", "Dairy", "Curd", 142000));
        data.add(new CustomTreeDataEntry("Cheese", "Dairy", "Cheese", 43000));
        data.add(new CustomTreeDataEntry("Yogurt", "Dairy", "Yogurt", 38000));
        data.add(new CustomTreeDataEntry("Kefir", "Dairy", "Kefir", 32000));
        data.add(new CustomTreeDataEntry("Mutton", "Meat", "Mutton", 154000));
        data.add(new CustomTreeDataEntry("Beef", "Meat", "Beef", 142000));
        data.add(new CustomTreeDataEntry("Pork", "Meat", "Pork", 43000));
        data.add(new CustomTreeDataEntry("Veal", "Meat", "Veal", 38000));

        treeMap.setData(data, TreeFillingMethod.AS_TABLE);

        UiTitle title = treeMap.getTitle();
        title.setEnabled(true);
        title.setUseHtml(true);
        title.setPadding(0d, 0d, 20d, 0d);
        title.setText("Top ACME Products by Revenue<br/>' +\n" +
                "      '<span style=\"color:#212121; font-size: 13px;\">(average sales during the year, in $)</span>");

        treeMap.getColorScale().setRanges(
                "[{\n" +
                "      less: 25000\n" +
                "    },\n" +
                "    {\n" +
                "      from: 25000,\n" +
                "      to: 30000\n" +
                "    },\n" +
                "    {\n" +
                "      from: 30000,\n" +
                "      to: 40000\n" +
                "    },\n" +
                "    {\n" +
                "      from: 40000,\n" +
                "      to: 50000\n" +
                "    },\n" +
                "    {\n" +
                "      from: 50000,\n" +
                "      to: 100000\n" +
                "    },\n" +
                "    {\n" +
                "      greater: 100000\n" +
                "    }\n" +
                "  ]");

        treeMap.getColorScale().setColors(new String[]{
                "#ffee58", "#fbc02d", "#f57f17", "#c0ca33", "#689f38", "#2e7d32"
        });

        treeMap.setPadding(10d, 10d, 10d, 20d);
        treeMap.setMaxDepth(2d);
        treeMap.getHovered().setFill("#bdbdbd", 1d);
        treeMap.setSelectionMode(SelectionMode.NONE);

        treeMap.getLegend().setEnabled(true);
        treeMap.getLegend()
                .setPadding(0d, 0d, 0d, 20d)
                .setPosition(Orientation.RIGHT)
                .setAlign(EnumsAlign.TOP)
                .setItemsLayout(LegendLayout.VERTICAL);

        treeMap.getLabels().setUseHtml(true);
        treeMap.getLabels().setFontColor("#212121");
        treeMap.getLabels().setFontSize(12d);
        treeMap.getLabels().setFormat(
                "function() {\n" +
                "      return this.getData('product');\n" +
                "    }");

        treeMap.getHeaders().setFormat(
                "function() {\n" +
                "    return this.getData('product');\n" +
                "  }");

        treeMap.getTooltip()
                .setUseHtml(true)
                .setTitleFormat("{%product}")
                .setFormat("function() {\n" +
                        "      return '<span style=\"color: #bfbfbf\">Revenue: </span>$' +\n" +
                        "        anychart.format.number(this.value, {\n" +
                        "          groupsSeparator: ' '\n" +
                        "        });\n" +
                        "    }");

        anyChartView.setChart(treeMap);
    }

    private class CustomTreeDataEntry extends TreeDataEntry {
        CustomTreeDataEntry(String id, String parent, String product, Integer value) {
            super(id, parent, value);
            setValue("product", product);
        }

        CustomTreeDataEntry(String id, String parent, String product) {
            super(id, parent);
            setValue("product", product);
        }
    }

}

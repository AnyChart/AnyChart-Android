package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMap;
import com.anychart.anychart.Choropleth;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.LinearColor;
import com.anychart.anychart.SelectionMode;
import com.anychart.anychart.SidePosition;
import com.anychart.anychart.TextHAlign;
import com.anychart.anychart.UiColorRange;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ChoroplethMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsMap map = AnyChart.map();

        map.getTitle().setEnabled(true);
        map.getTitle().setUseHtml(true);
        map.getTitle().setHAlign(TextHAlign.CENTER);
        map.getTitle().setFontFamily("Verdana, Helvetica, Arial, sans-serif");
        map.getTitle()
                .setPadding(10, 0, 10, 0)
                .setText("<span style=\"color:#7c868e; font-size: 18px\"> The States That" +
                        "Love Wine The Most.</span> <br>" +
                        "<span style=\"color:#545f69; font-size: 14px\">Litres of wine" +
                        "per person each state consumed in 2013.</span>");

        map.getCredits()
                .setEnabled(true)
                .setUrl("https://en.wikipedia.org/wiki/List_of_sovereign_states_and_dependent_territories_by_population_density")
                .setText("Data source: https://en.wikipedia.org/wiki/List_of_sovereign_states_and_dependent_territories_by_population_density")
                .setLogoSrc("https://static.anychart.com/images/maps_samples/USA_Map_with_Linear_Scale/favicon.ico");

        map.setGeoData("anychart.maps.united_states_of_america");

        UiColorRange colorRange = map.getColorRange();
        colorRange.setEnabled(true);
        colorRange.setColorLineSize(10)
                .setStroke("#B9B9B9")
                .setLabels("{ 'padding': 3 }")
                .setLabels("{ 'size': 7 }");
        colorRange.getTicks().setEnabled(true);
        colorRange.getTicks()
                .setStroke("#B9B9B9")
                .setPosition(SidePosition.OUTSIDE)
                .setLength(10);
        colorRange.getMinorTicks().setEnabled(true);
        colorRange.getMinorTicks()
                .setStroke("#B9B9B9")
                .setPosition("outside")
                .setLength(5);

        map.getInteractivity().setSelectionMode(SelectionMode.NONE);
        map.setPadding(0, 0, 0, 0);

        Choropleth series = map.choropleth(getData());
        LinearColor linearColor = new LinearColor();
        linearColor.setColors(new String[]{ "#c2e9fb", "#81d4fa", "#01579b", "#002746"});
        series.setColorScale(linearColor);
        series.getHovered()
                .setFill("#f48fb1")
                .setStroke("#f99fb9");
        series.getSelected()
                .setFill("#c2185b")
                .setStroke("#c2185b");
        series.getLabels().setEnabled(true);
        series.getLabels().setFontSize(10);
        series.getLabels().setFontColor("#212121");
        series.getLabels().setFormat("{%Value}");

        series.getTooltip()
                .setUseHtml(true)
                .setFormat("function() {\n" +
                        "            return '<span style=\"font-size: 13px\">' + this.value + ' litres per capita</span>';\n" +
                        "          }");


        anyChartView.addScript("file:///android_asset/united_states_of_america.js");
        anyChartView.addScript("file:///android_asset/proj4.js");
        anyChartView.setChart(map);
    }

    private List<DataEntry> getData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry("US.MN", "Minnesota", 8.4));
        data.add(new CustomDataEntry("US.MT", "Montana", 8.5));
        data.add(new CustomDataEntry("US.ND", "North Dakota", 5.1));
        data.add(new CustomDataEntry("US.ID", "Idaho", 8));
        data.add(new CustomDataEntry("US.WA", "Washington", 13.1));
        data.add(new CustomDataEntry("US.AZ", "Arizona", 9.7));
        data.add(new CustomDataEntry("US.CA", "California", 14));
        data.add(new CustomDataEntry("US.CO", "Colorado", 8.7));
        data.add(new CustomDataEntry("US.NV", "Nevada", 14.7));
        data.add(new CustomDataEntry("US.NM", "New Mexico", 6.9));
        data.add(new CustomDataEntry("US.OR", "Oregon", 12.2));
        data.add(new CustomDataEntry("US.UT", "Utah", 3.2));
        data.add(new CustomDataEntry("US.WY", "Wyoming", 5.2));
        data.add(new CustomDataEntry("US.AR", "Arkansas", 4.2));
        data.add(new CustomDataEntry("US.IA", "Iowa", 4.7));
        data.add(new CustomDataEntry("US.KS", "Kansas", 3.2));
        data.add(new CustomDataEntry("US.MO", "Missouri", 7.2));
        data.add(new CustomDataEntry("US.NE", "Nebraska", 5));
        data.add(new CustomDataEntry("US.OK", "Oklahoma", 4.5));
        data.add(new CustomDataEntry("US.SD", "South Dakota", 5));
        data.add(new CustomDataEntry("US.LA", "Louisiana", 5.7));
        data.add(new CustomDataEntry("US.TX", "Texas", 5));
        data.add(new CustomDataEntry("US.CT", "Connecticut", 14.4, false));
        data.add(new CustomDataEntry("US.MA", "Massachusetts", 16.9, false));
        data.add(new CustomDataEntry("US.NH", "New Hampshire", 19.6));
        data.add(new CustomDataEntry("US.RI", "Rhode Island", 14, false));
        data.add(new CustomDataEntry("US.VT", "Vermont", 17.5));
        data.add(new CustomDataEntry("US.AL", "Alabama", 6));
        data.add(new CustomDataEntry("US.FL", "Florida", 12.4));
        data.add(new CustomDataEntry("US.GA", "Georgia", 5.9));
        data.add(new CustomDataEntry("US.MS", "Mississippi", 2.8));
        data.add(new CustomDataEntry("US.SC", "South Carolina", 6.1));
        data.add(new CustomDataEntry("US.IL", "Illinois", 10.2));
        data.add(new CustomDataEntry("US.IN", "Indiana", 6.1));
        data.add(new CustomDataEntry("US.KY", "Kentucky", 3.9));
        data.add(new CustomDataEntry("US.NC", "North Carolina", 6.6));
        data.add(new CustomDataEntry("US.OH", "Ohio", 7.2));
        data.add(new CustomDataEntry("US.TN", "Tennessee", 5.4));
        data.add(new CustomDataEntry("US.VA", "Virginia", 10.7));
        data.add(new CustomDataEntry("US.WI", "Wisconsin", 9.1));
        data.add(new CustomDataEntry("US.WY", "Wyoming", 5.2, false));
        data.add(new CustomDataEntry("US.WV", "West Virginia", 2.4));
        data.add(new CustomDataEntry("US.DE", "Delaware", 13.5, false));
        data.add(new CustomDataEntry("US.DC", "District of Columbia", 25.7, false));
        data.add(new CustomDataEntry("US.MD", "Maryland", 8.9, false));
        data.add(new CustomDataEntry("US.NJ", "New Jersey", 14.9, false));
        data.add(new CustomDataEntry("US.NY", "New York", 11.9));
        data.add(new CustomDataEntry("US.PA", "Pennsylvania", 5.6));
        data.add(new CustomDataEntry("US.ME", "Maine", 10.4));
        data.add(new CustomDataEntry("US.HI", "Hawaii", 13.1));
        data.add(new CustomDataEntry("US.AK", "Alaska", 10.9));
        data.add(new CustomDataEntry("US.MI", "Michigan", 7.6));

        return data;
    }

    class CustomDataEntry extends DataEntry {
        public CustomDataEntry(String id, String name, Number value) {
            setValue("id", id);
            setValue("name", name);
            setValue("value", value);
        }
        public CustomDataEntry(String id, String name, Number value, Boolean labels) {
            setValue("id", id);
            setValue("name", name);
            setValue("value", value);
            setValue("labels", labels);
        }
    }
}

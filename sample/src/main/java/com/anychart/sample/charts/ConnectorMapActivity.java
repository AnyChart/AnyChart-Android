package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMap;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.MapSeriesMarker;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.SelectionMode;
import com.anychart.anychart.SeriesConnector;
import com.anychart.anychart.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ConnectorMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        ChartsMap map = AnyChart.connector();

        map.getUnboundRegions()
                .setEnabled(true)
                .setFill(new SolidFill("#E1E1E1", 1))
                .setStroke("#D2D2D2", 1, null, null, null);

        map.setGeoData("anychart.maps.united_kingdom");
        map.getInteractivity().setSelectionMode(SelectionMode.NONE);

        map.getTitle().setEnabled(true);
        map.getTitle().setUseHtml(true);
        map.getTitle().setText("Journey Route: the United Kingdom Roundtrip<br/>" +
                "          <span style=\"color:#212121; font-size: 13px;\">Example shows sample of usage a multistage connector.<br/>" +
                "          All data are fictitious.</span>");

        SeriesConnector connectorSeries = map.connector(getCarData());
        connectorSeries.setStartSize(0)
                .getEndSize(0)
                .setStroke("#64b5f6", 2, null, null, null)
                .setName("Rent a Car");
        connectorSeries.setCurvature(0);
        connectorSeries.setLegendItem("{" +
                "        iconType: 'circle'," +
                "        fill: '#64b5f6'," +
                "        iconStroke: '2 #E1E1E1'" +
                "      }");
        connectorSeries.getHovered().setStroke("#212121", 1.5, null, null, null);

        connectorSeries.getTooltip()
                .setPadding(8, 13, 10, 13)
                .setFontSize(12)
                .setFontColor("#fff")
                .setFormat("{%full}")
                .setTitleFormat("{%number}. <span style=\"font-size: 13px; color: #E1E1E1\">{%short}</span>")
                .setUseHtml(true);

        connectorSeries = map.connector(getShipData());
        connectorSeries.setStartSize(0)
                .getEndSize(0)
                .setStroke("#1976d2", 2, null, null, null)
                .setName("Ferry");
        connectorSeries.setCurvature(0);
        connectorSeries.setLegendItem("{\n" +
                "        iconType: 'circle',\n" +
                "        fill: '#1976d2',\n" +
                "        iconStroke: '2 #E1E1E1'\n" +
                "      }");
        connectorSeries.getHovered().setStroke("#212121", 1.5, null, null, null);

        connectorSeries.getTooltip()
                .setPadding(8, 13, 10, 13)
                .setFontSize(12)
                .setFontColor("#fff")
                .setFormat("{%full}")
                .setTitleFormat("{%number}. <span style=\"font-size: 13px; color: #E1E1E1\">{%short}</span>")
                .setUseHtml(true);

        connectorSeries = map.connector(getAirData());
        connectorSeries.setStartSize(0)
                .getEndSize(0)
                .setStroke("#ef6c00", 2, null, null, null)
                .setName("Airplane");
        connectorSeries.setCurvature(0);
        connectorSeries.setLegendItem("{\n" +
                "        iconType: 'circle',\n" +
                "        fill: '#ef6c00',\n" +
                "        iconStroke: '2 #E1E1E1'\n" +
                "      }");
        connectorSeries.getHovered().setStroke("#212121", 1.5, null, null, null);

        connectorSeries.getTooltip()
                .setPadding(8, 13, 10, 13)
                .setFontSize(12)
                .setFontColor("#fff")
                .setFormat("{%full}")
                .setTitleFormat("{%number}. <span style=\"font-size: 13px; color: #E1E1E1\">{%short}</span>")
                .setUseHtml(true);

        map.setLegend(true);

        MapSeriesMarker citiesSeries = map.marker(getCitiesData());
        citiesSeries.setType(MarkerType.CIRCLE)
                .setSize(4)
                .setFill(new SolidFill("#64b5f6", 1))
                .setStroke("#E1E1E1", 2, null, null, null)
                .setTooltip(false);
//
        citiesSeries.getHovered()
                .setSize(4)
                .setFill(new SolidFill("#64b5f6", 1))
                .setStroke("#E1E1E1", 2, null, null, null);

        citiesSeries.getLabels().setEnabled(true);
        citiesSeries.getLabels().setPosition("center-bottom");
        citiesSeries.getLabels().setFontColor("#263238");
        citiesSeries.getLabels()
                .setOffsetX(5)
                .setOffsetY(0)
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setFormat("{%name}");

        citiesSeries.getLegendItem().setEnabled(false);

        anyChartView.addScript("file:///android_asset/united_kingdom.js");
        anyChartView.addScript("file:///android_asset/proj4.js");
        anyChartView.setChart(map);
    }

    private List<DataEntry> getCitiesData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CitiesDataEntry(51.507315, -0.127901, "London"));
        data.add(new CitiesDataEntry(50.908579, -1.404370, "Southampton", new LabelDataEntry(10, "#7c868e")));
        data.add(new CitiesDataEntry(51.453568, -2.588353, "Bristol"));
        data.add(new CitiesDataEntry(52.484899, -1.890637, "Birmingham", new LabelDataEntry("right", 10, "#7c868e")));
        data.add(new CitiesDataEntry(53.474881, -2.249000, "Manchester", new LabelDataEntry("rightTop", 0, 3)));
        data.add(new CitiesDataEntry(53.403105, -2.999768, "Liverpool", new LabelDataEntry("right")));
        data.add(new CitiesDataEntry(53.812012, -3.053354, "Blackpool", new LabelDataEntry("topRight", 10, "#7c868e", 0, -5)));
        data.add(new CitiesDataEntry(54.151732, -4.486070, "Douglas", new LabelDataEntry("rightTop", 10, "#7c868e", 0, -3)));
        data.add(new CitiesDataEntry(54.614223, -5.912609, "Belfast", "#1976d2"));
        data.add(new CitiesDataEntry(54.994887, -7.309736, "Derry", new LabelDataEntry("right", 10, "#7c868e"), "#ef6c00"));
        data.add(new CitiesDataEntry(57.475560, -4.224776, "Inverness", "#ef6c00"));
        data.add(new CitiesDataEntry(57.148309, -2.094987, "Aberdeen", new LabelDataEntry(10, "#7c868e")));
        data.add(new CitiesDataEntry(56.460279, -2.965115, "Dundee", new LabelDataEntry(10, "#7c868e")));
        data.add(new CitiesDataEntry(56.069916, -3.450884, "Dunfermline", new LabelDataEntry("right", 10, "#7c868e")));
        data.add(new CitiesDataEntry(55.946814, -3.184442, "Edinburgh"));
        data.add(new CitiesDataEntry(54.977230, -1.617702, "Newcastle upon Tyne", new LabelDataEntry(10, "#7c868e")));
        data.add(new CitiesDataEntry(53.799611, -1.549131, "Leeds", new LabelDataEntry("leftTop")));
        data.add(new CitiesDataEntry(53.234525, -1.421464, "Chesterfield", new LabelDataEntry(10, "#7c868e")));
        data.add(new CitiesDataEntry(52.954190, -1.158432, "Nottingham", new LabelDataEntry(10, "#7c868e")));

        return data;
    }

    private List<DataEntry> getAirData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry(new Number[]{ 54.614223, -5.912609, 54.994887, -7.309736, 57.475560, -4.224776 }, 5, "Flight from Belfast to Inverness", "There was not any planes from Belfast to Inverness.\\nSo we had to flight through Derry.", 0));

        return data;
    }

    private List<DataEntry> getShipData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry(new Number[]{ 53.403105, -2.999768, 53.812012, -3.053354, 54.151732, -4.486070, 54.614223, -5.912609 }, 4, "From Liverpool to Belfast by boat", "To get from Liverpool to Belfast, we got tickets on a cruise ship.\\nThe route of the cruise ship went through Blackpool and Douglas\\nand took 3 days.", 0));

        return data;
    }

    private List<DataEntry> getCarData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry(new Number[]{ 51.507315, -0.127901, 50.908579, -1.404370, 51.453568, -2.588353 }, 1, "From London to Bristol", "On our way to Bristol we stopped in Southampton\\nand enjoyed the dinner at restaurant."));
        data.add(new CustomDataEntry(new Number[]{ 51.453568, -2.588353, 52.484899, -1.890637, 53.474881, -2.249000 }, 2, "From Bristol to Manchester", "On our way to Manchester we stopped in Birmingham\\nfor one night to have some rest and to walk in Birmingham\\'s\\ncity center."));
        data.add(new CustomDataEntry(new Number[]{ 53.474881, -2.249000, 53.403105, -2.999768 }, 3, "From Manchester to Liverpool", "The road to Liverpool took just couple of hours,\\nso we had plenty time to walk around in Liverpool."));
        data.add(new CustomDataEntry(new Number[]{ 57.475560, -4.224776, 57.148309, -2.094987, 56.460279, -2.965115, 56.069916, -3.450884, 55.946814, -3.184442 }, 6, "From Inverness to Edinburgh", "That was really nice journey though Scotland.\\nWe stopped a lot and we met a lot of nice people.\\nthe journey took us 3 days."));
        data.add(new CustomDataEntry(new Number[]{ 55.946814, -3.184442, 54.977230, -1.617702, 53.799611, -1.549131 }, 7, "From Edinburgh to Leeds", "On our way from Edinburgh to Leeds we stopped only once\\nin beautiful city Newcastle upon Tyne."));
        data.add(new CustomDataEntry(new Number[]{ 53.799611, -1.549131, 53.234525, -1.421464, 52.954190, -1.158432, 51.507315, -0.127901 }, 8, "From Leeds back to London", "On our way back to London from Leeds\\nwe made several stops. And we spent a night\\nin Nottingham. This part took us three days."));

        return data;
    }

    private class CustomDataEntry extends DataEntry {
        public CustomDataEntry(Number[] points, Integer number, String shortDescription, String fullDescription) {
            setValue("points", points);
            setValue("number", number);
            setValue("short", shortDescription);
            setValue("full", fullDescription);
        }

        public CustomDataEntry(Number[] points, Integer number, String shortDescription, String fullDescription, Integer curvature) {
            setValue("points", points);
            setValue("number", number);
            setValue("short", shortDescription);
            setValue("full", fullDescription);
            setValue("curvature", curvature);
        }
    }

    private class CitiesDataEntry extends DataEntry {
        public CitiesDataEntry(Number latitude, Number longitude, String name) {
            setValue("lat", latitude);
            setValue("long", longitude);
            setValue("name", name);
        }
        public CitiesDataEntry(Number latitude, Number longitude, String name, String fill) {
            setValue("lat", latitude);
            setValue("long", longitude);
            setValue("name", name);
            setValue("fill", fill);
        }
        public CitiesDataEntry(Number latitude, Number longitude, String name, LabelDataEntry label) {
            setValue("lat", latitude);
            setValue("long", longitude);
            setValue("name", name);
            setValue("label", label);
        }
        public CitiesDataEntry(Number latitude, Number longitude, String name, LabelDataEntry label, String fill) {
            setValue("lat", latitude);
            setValue("long", longitude);
            setValue("name", name);
            setValue("label", label);
            setValue("fill", fill);
        }
    }

    private class LabelDataEntry extends DataEntry {
        public LabelDataEntry(Integer fontSize, String fontColor) {
            setValue("fontSize", fontSize);
            setValue("fontColor", fontColor);
        }
        public LabelDataEntry(String anchor, Integer fontSize, String fontColor) {
            setValue("anchor", anchor);
            setValue("fontSize", fontSize);
            setValue("fontColor", fontColor);
        }
        public LabelDataEntry(String anchor, Integer offsetX, Integer offsetY) {
            setValue("right", anchor);
            setValue("offsetX", offsetX);
            setValue("offsetY", offsetY);
        }
        public LabelDataEntry(String anchor) {
            setValue("anchor", anchor);
        }
        public LabelDataEntry(String anchor, Integer fontSize, String fontColor, Integer offsetX, Integer offsetY) {
            setValue("anchor", anchor);
            setValue("fontSize", fontSize);
            setValue("fontColor", fontColor);
            setValue("offsetX", offsetX);
            setValue("offsetY", offsetY);
        }
    }
}

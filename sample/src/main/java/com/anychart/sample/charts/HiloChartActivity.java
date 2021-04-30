package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.HighLowDataEntry;
import com.anychart.charts.Stock;
import com.anychart.core.stock.Plot;
import com.anychart.core.stock.series.Hilo;
import com.anychart.data.Table;
import com.anychart.data.TableMapping;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class HiloChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Stock stock = AnyChart.stock();

        Plot plot = stock.plot(0);

        plot.yGrid(true)
                .yMinorGrid(true);

        Table table = Table.instantiate("x");
        table.addData(getData());
        TableMapping mapping = table.mapAs("{'high': 'high', 'low': 'low'}");

        Hilo hilo = plot.hilo(mapping);
        hilo.name("Temperature");

        hilo.tooltip().format("Max: {%High}&deg;<br/>Min: {%Low}&deg;");
        stock.tooltip().useHtml(true);

        anyChartView.setChart(stock);
    }

    private List<DataEntry> getData() {
        List<DataEntry> data = new ArrayList<>();
        data.add(new HighLowDataEntry(1136044800000L,10,6));
        data.add(new HighLowDataEntry(1136131200000L,9.4,2.6));
        data.add(new HighLowDataEntry(1136217600000L,7.4,2.2));
        data.add(new HighLowDataEntry(1136304000000L,10.3,4.5));
        data.add(new HighLowDataEntry(1136390400000L,10.8,6.8));
        data.add(new HighLowDataEntry(1136476800000L,12.8,7.7));
        data.add(new HighLowDataEntry(1136563200000L,9.1,6.9));
        data.add(new HighLowDataEntry(1136649600000L,7.8,1.7));
        data.add(new HighLowDataEntry(1136736000000L,8.5,6));
        data.add(new HighLowDataEntry(1136822400000L,7.7,5.3));
        data.add(new HighLowDataEntry(1136908800000L,8.5,4.4));
        data.add(new HighLowDataEntry(1136995200000L,7.3,3.1));
        data.add(new HighLowDataEntry(1137081600000L,8.8,5.5));
        data.add(new HighLowDataEntry(1137168000000L,8.1,3.3));
        data.add(new HighLowDataEntry(1137254400000L,8,-0.7));
        data.add(new HighLowDataEntry(1137340800000L,8.5,3.2));
        data.add(new HighLowDataEntry(1137427200000L,10,5.8));
        data.add(new HighLowDataEntry(1137513600000L,8,4.8));
        data.add(new HighLowDataEntry(1137600000000L,7.1,3.6));
        data.add(new HighLowDataEntry(1137686400000L,7.4,1.5));
        data.add(new HighLowDataEntry(1137772800000L,5.7,3.5));
        data.add(new HighLowDataEntry(1137859200000L,8,4.7));
        data.add(new HighLowDataEntry(1137945600000L,8.7,5.5));
        data.add(new HighLowDataEntry(1138032000000L,10.4,2.5));
        data.add(new HighLowDataEntry(1138118400000L,9.5,2.8));
        data.add(new HighLowDataEntry(1138204800000L,7.7,5.1));
        data.add(new HighLowDataEntry(1138291200000L,6.9,2.8));
        data.add(new HighLowDataEntry(1138377600000L,7.8,2.6));
        data.add(new HighLowDataEntry(1138464000000L,6.3,1.3));
        data.add(new HighLowDataEntry(1138550400000L,11.5,5.3));
        data.add(new HighLowDataEntry(1138636800000L,7.9,3.3));
        data.add(new HighLowDataEntry(1138723200000L,9.1,6.2));
        data.add(new HighLowDataEntry(1138809600000L,10.4,4.8));
        data.add(new HighLowDataEntry(1138896000000L,8.4,3.5));
        data.add(new HighLowDataEntry(1138982400000L,9.9,6.5));
        data.add(new HighLowDataEntry(1139068800000L,8.4,2.6));
        data.add(new HighLowDataEntry(1139155200000L,7.6,2.6));
        data.add(new HighLowDataEntry(1139241600000L,11.2,2.2));
        data.add(new HighLowDataEntry(1139328000000L,8.4,3.7));
        data.add(new HighLowDataEntry(1139414400000L,8.4,-1));
        data.add(new HighLowDataEntry(1139500800000L,9.6,-1.9));
        data.add(new HighLowDataEntry(1139587200000L,9.3,-1.9));
        data.add(new HighLowDataEntry(1139673600000L,11.3,1.9));
        data.add(new HighLowDataEntry(1139760000000L,8,4.4));
        data.add(new HighLowDataEntry(1139846400000L,6.2,-1));
        data.add(new HighLowDataEntry(1139932800000L,6.5,-3.7));
        data.add(new HighLowDataEntry(1140019200000L,6.9,-2.8));
        data.add(new HighLowDataEntry(1140105600000L,5.5,-3.2));
        data.add(new HighLowDataEntry(1140192000000L,5.6,-4.9));
        data.add(new HighLowDataEntry(1140278400000L,5.2,-5.2));
        data.add(new HighLowDataEntry(1140364800000L,4.8,-2.3));
        data.add(new HighLowDataEntry(1140451200000L,6.6,2));
        data.add(new HighLowDataEntry(1140537600000L,8.1,1.3));
        data.add(new HighLowDataEntry(1140624000000L,6.9,2.4));
        data.add(new HighLowDataEntry(1140710400000L,5,-3.9));
        data.add(new HighLowDataEntry(1140796800000L,4.1,-2.8));
        data.add(new HighLowDataEntry(1140883200000L,7.6,1.5));
        data.add(new HighLowDataEntry(1140969600000L,12,4.2));
        data.add(new HighLowDataEntry(1141056000000L,8.7,3.4));
        data.add(new HighLowDataEntry(1141142400000L,11.4,1.6));
        data.add(new HighLowDataEntry(1141228800000L,12.2,3.6));
        data.add(new HighLowDataEntry(1141315200000L,8.1,-1));
        data.add(new HighLowDataEntry(1141401600000L,11.2,3.3));
        data.add(new HighLowDataEntry(1141488000000L,10.7,1.4));
        data.add(new HighLowDataEntry(1141574400000L,13,5.4));
        data.add(new HighLowDataEntry(1141660800000L,9.1,4));
        data.add(new HighLowDataEntry(1141747200000L,7.3,0.9));
        data.add(new HighLowDataEntry(1141833600000L,5.7,0.4));
        data.add(new HighLowDataEntry(1141920000000L,8.3,0.2));
        data.add(new HighLowDataEntry(1142006400000L,7.5,-2.8));
        data.add(new HighLowDataEntry(1142092800000L,8.1,-2.6));
        data.add(new HighLowDataEntry(1142179200000L,10.8,-1.1));
        data.add(new HighLowDataEntry(1142265600000L,10.6,3.5));
        data.add(new HighLowDataEntry(1142352000000L,8.8,4.7));
        data.add(new HighLowDataEntry(1142438400000L,9.4,3.2));
        data.add(new HighLowDataEntry(1142524800000L,9.7,2));
        data.add(new HighLowDataEntry(1142611200000L,8,2.4));
        data.add(new HighLowDataEntry(1142697600000L,8.9,-1.8));
        data.add(new HighLowDataEntry(1142784000000L,11,-0.7));
        data.add(new HighLowDataEntry(1142870400000L,10.2,5.7));
        data.add(new HighLowDataEntry(1142956800000L,10.4,7.8));
        data.add(new HighLowDataEntry(1143043200000L,15.9,6.5));
        data.add(new HighLowDataEntry(1143129600000L,12.8,7.3));
        data.add(new HighLowDataEntry(1143216000000L,9.8,2.7));
        data.add(new HighLowDataEntry(1143302400000L,8.5,2.2));
        data.add(new HighLowDataEntry(1143388800000L,10.9,3.4));
        data.add(new HighLowDataEntry(1143475200000L,11.2,5.6));
        data.add(new HighLowDataEntry(1143561600000L,13.4,2.7));
        data.add(new HighLowDataEntry(1143648000000L,13.8,6.6));
        data.add(new HighLowDataEntry(1143734400000L,13.1,6.9));
        data.add(new HighLowDataEntry(1143820800000L,8.2,5.4));
        data.add(new HighLowDataEntry(1143907200000L,16.4,4.1));
        data.add(new HighLowDataEntry(1143993600000L,10.9,4.4));
        data.add(new HighLowDataEntry(1144080000000L,12.4,6.9));
        data.add(new HighLowDataEntry(1144166400000L,13.7,4.3));
        data.add(new HighLowDataEntry(1144252800000L,13.3,3.9));
        data.add(new HighLowDataEntry(1144339200000L,12.5,5.4));
        data.add(new HighLowDataEntry(1144425600000L,13.7,8.4));
        data.add(new HighLowDataEntry(1144512000000L,11,7.3));
        data.add(new HighLowDataEntry(1144598400000L,13.1,7.5));
        data.add(new HighLowDataEntry(1144684800000L,12.9,4.9));
        data.add(new HighLowDataEntry(1144771200000L,13.2,7.2));
        data.add(new HighLowDataEntry(1144857600000L,8.9,5.9));
        data.add(new HighLowDataEntry(1144944000000L,10.5,6.2));
        data.add(new HighLowDataEntry(1145030400000L,8.5,2.5));
        data.add(new HighLowDataEntry(1145116800000L,11.5,4.7));
        data.add(new HighLowDataEntry(1145203200000L,12.8,2));
        data.add(new HighLowDataEntry(1145289600000L,12.8,5.9));
        data.add(new HighLowDataEntry(1145376000000L,12.8,8.2));
        data.add(new HighLowDataEntry(1145462400000L,12.3,8));
        data.add(new HighLowDataEntry(1145548800000L,11.3,5.5));
        data.add(new HighLowDataEntry(1145635200000L,12.5,2.4));
        data.add(new HighLowDataEntry(1145721600000L,16.1,4.4));
        data.add(new HighLowDataEntry(1145808000000L,16.1,5.5));
        data.add(new HighLowDataEntry(1145894400000L,17.1,7));
        data.add(new HighLowDataEntry(1145980800000L,12,7.4));
        data.add(new HighLowDataEntry(1146067200000L,14.5,8.4));
        data.add(new HighLowDataEntry(1146153600000L,18,6));

        return data;
    }
}

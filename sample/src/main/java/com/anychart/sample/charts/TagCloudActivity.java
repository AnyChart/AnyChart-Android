package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.CategoryValueDataEntry;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.TagCloud;
import com.anychart.sample.R;
import com.anychart.scales.OrdinalColor;

import java.util.ArrayList;
import java.util.List;

public class TagCloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        TagCloud tagCloud = AnyChart.tagCloud();

        tagCloud.title("World Population");

        OrdinalColor ordinalColor = OrdinalColor.instantiate();
        ordinalColor.colors(new String[] {
                "#26959f", "#f18126", "#3b8ad8", "#60727b", "#e24b26"
        });
        tagCloud.colorScale(ordinalColor);
        tagCloud.angles(new Double[] {-90d, 0d, 90d});

        tagCloud.colorRange().enabled(true);
        tagCloud.colorRange().colorLineSize(15d);

        List<DataEntry> data = new ArrayList<>();
        data.add(new CategoryValueDataEntry("China", "asia", 1383220000));
        data.add(new CategoryValueDataEntry("India", "asia", 1316000000));
        data.add(new CategoryValueDataEntry("United States", "america", 324982000));
        data.add(new CategoryValueDataEntry("Indonesia", "asia", 263510000));
        data.add(new CategoryValueDataEntry("Brazil", "america", 207505000));
        data.add(new CategoryValueDataEntry("Pakistan", "asia", 196459000));
        data.add(new CategoryValueDataEntry("Nigeria", "africa", 191836000));
        data.add(new CategoryValueDataEntry("Bangladesh", "asia", 162459000));
        data.add(new CategoryValueDataEntry("Russia", "europe", 146804372));
        data.add(new CategoryValueDataEntry("Japan", "asia", 126790000));
        data.add(new CategoryValueDataEntry("Mexico", "america", 123518000));
        data.add(new CategoryValueDataEntry("Ethiopia", "africa", 104345000));
        data.add(new CategoryValueDataEntry("Philippines", "asia", 104037000));
        data.add(new CategoryValueDataEntry("Egypt", "africa", 93013300));
        data.add(new CategoryValueDataEntry("Vietnam", "asia", 92700000));
        data.add(new CategoryValueDataEntry("Germany", "europe", 82800000));
        data.add(new CategoryValueDataEntry("Democratic Republic of the Congo", "africa", 82243000));
        data.add(new CategoryValueDataEntry("Iran", "asia", 80135400));
        data.add(new CategoryValueDataEntry("Turkey", "asia", 79814871));
        data.add(new CategoryValueDataEntry("Thailand", "asia", 68298000));
        data.add(new CategoryValueDataEntry("France", "europe", 67013000));
        data.add(new CategoryValueDataEntry("United Kingdom", "europe", 65110000));
        data.add(new CategoryValueDataEntry("Italy", "europe", 60599936));
        data.add(new CategoryValueDataEntry("Tanzania", "africa", 56878000));
        data.add(new CategoryValueDataEntry("South Africa", "africa", 55908000));
        data.add(new CategoryValueDataEntry("Myanmar", "asia", 54836000));
        data.add(new CategoryValueDataEntry("South Korea", "asia", 51446201));
        data.add(new CategoryValueDataEntry("Colombia", "america", 49224700));
        data.add(new CategoryValueDataEntry("Kenya", "africa", 48467000));
        data.add(new CategoryValueDataEntry("Spain", "europe", 46812000));
        data.add(new CategoryValueDataEntry("Argentina", "america", 43850000));
        data.add(new CategoryValueDataEntry("Ukraine", "europe", 42541633));
        data.add(new CategoryValueDataEntry("Sudan", "africa", 42176000));
        data.add(new CategoryValueDataEntry("Uganda", "africa", 41653000));
        data.add(new CategoryValueDataEntry("Algeria", "africa", 41064000));
        data.add(new CategoryValueDataEntry("Poland", "europe", 38424000));
        data.add(new CategoryValueDataEntry("Iraq", "asia", 37883543));
        data.add(new CategoryValueDataEntry("Canada", "america", 36541000));
        data.add(new CategoryValueDataEntry("Morocco", "africa", 34317500));
        data.add(new CategoryValueDataEntry("Saudi Arabia", "asia", 33710021));
        data.add(new CategoryValueDataEntry("Uzbekistan", "asia", 32121000));
        data.add(new CategoryValueDataEntry("Malaysia", "asia", 32063200));
        data.add(new CategoryValueDataEntry("Peru", "america", 31826018));
        data.add(new CategoryValueDataEntry("Venezuela", "america", 31431164));
        data.add(new CategoryValueDataEntry("Nepal", "asia", 28825709));
        data.add(new CategoryValueDataEntry("Angola", "africa", 28359634));
        data.add(new CategoryValueDataEntry("Ghana", "africa", 28308301));
        data.add(new CategoryValueDataEntry("Yemen", "asia", 28120000));
        data.add(new CategoryValueDataEntry("Afghanistan", "asia", 27657145));
        data.add(new CategoryValueDataEntry("Mozambique", "africa", 27128530));
        data.add(new CategoryValueDataEntry("Australia", "australia", 24460900));
        data.add(new CategoryValueDataEntry("North Korea", "asia", 24213510));
        data.add(new CategoryValueDataEntry("Taiwan", "asia", 23545680));
        data.add(new CategoryValueDataEntry("Cameroon", "africa", 23248044));
        data.add(new CategoryValueDataEntry("Ivory Coast", "africa", 22671331));
        data.add(new CategoryValueDataEntry("Madagascar", "africa", 22434363));
        data.add(new CategoryValueDataEntry("Niger", "africa", 21564000));
        data.add(new CategoryValueDataEntry("Sri Lanka", "asia", 21203000));
        data.add(new CategoryValueDataEntry("Romania", "europe", 19760000));
        data.add(new CategoryValueDataEntry("Burkina Faso", "africa", 19632147));
        data.add(new CategoryValueDataEntry("Syria", "asia", 18907000));
        data.add(new CategoryValueDataEntry("Mali", "africa", 18875000));
        data.add(new CategoryValueDataEntry("Malawi", "africa", 18299000));
        data.add(new CategoryValueDataEntry("Chile", "america", 18191900));
        data.add(new CategoryValueDataEntry("Kazakhstan", "asia", 17975800));
        data.add(new CategoryValueDataEntry("Netherlands", "europe", 17121900));
        data.add(new CategoryValueDataEntry("Ecuador", "america", 16737700));
        data.add(new CategoryValueDataEntry("Guatemala", "america", 16176133));
        data.add(new CategoryValueDataEntry("Zambia", "africa", 15933883));
        data.add(new CategoryValueDataEntry("Cambodia", "asia", 15626444));
        data.add(new CategoryValueDataEntry("Senegal", "africa", 15256346));
        data.add(new CategoryValueDataEntry("Chad", "africa", 14965000));
        data.add(new CategoryValueDataEntry("Zimbabwe", "africa", 14542235));
        data.add(new CategoryValueDataEntry("Guinea", "africa", 13291000));
        data.add(new CategoryValueDataEntry("South Sudan", "africa", 12131000));
        data.add(new CategoryValueDataEntry("Rwanda", "africa", 11553188));
        data.add(new CategoryValueDataEntry("Belgium", "europe", 11356191));
        data.add(new CategoryValueDataEntry("Tunisia", "africa", 11299400));
        data.add(new CategoryValueDataEntry("Cuba", "america", 11239004));
        data.add(new CategoryValueDataEntry("Bolivia", "america", 11145770));
        data.add(new CategoryValueDataEntry("Somalia", "africa", 11079000));
        data.add(new CategoryValueDataEntry("Haiti", "america", 11078033));
        data.add(new CategoryValueDataEntry("Greece", "europe", 10783748));
        data.add(new CategoryValueDataEntry("Benin", "africa", 10653654));
        data.add(new CategoryValueDataEntry("Czech Republic", "europe", 10578820));
        data.add(new CategoryValueDataEntry("Portugal", "europe", 10341330));
        data.add(new CategoryValueDataEntry("Burundi", "africa", 10114505));
        data.add(new CategoryValueDataEntry("Dominican Republic", "america", 10075045));
        data.add(new CategoryValueDataEntry("Sweden", "europe", 10054100));
        data.add(new CategoryValueDataEntry("United Arab Emirates", "asia", 10003223));
        data.add(new CategoryValueDataEntry("Jordan", "asia", 9889270));
        data.add(new CategoryValueDataEntry("Azerbaijan", "asia", 9823667));
        data.add(new CategoryValueDataEntry("Hungary", "europe", 9799000));
        data.add(new CategoryValueDataEntry("Belarus", "europe", 9498600));
        data.add(new CategoryValueDataEntry("Honduras", "america", 8866351));
        data.add(new CategoryValueDataEntry("Austria", "europe", 8773686));
        data.add(new CategoryValueDataEntry("Tajikistan", "asia", 8742000));
        data.add(new CategoryValueDataEntry("Israel", "asia", 8690220));
        data.add(new CategoryValueDataEntry("Switzerland", "europe", 8417700));
        data.add(new CategoryValueDataEntry("Papua New Guinea", "australia", 8151300));

        tagCloud.data(data);

        anyChartView.setChart(tagCloud);
    }

}

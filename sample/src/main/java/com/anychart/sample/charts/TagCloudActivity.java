package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.CategoryValueDataEntry;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.TagCloud;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class TagCloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        TagCloud tagCloud = AnyChart.tagCloud();

        tagCloud.setTitle("World Population");

        // TODO colorScale
//        OrdinalColor ordinalColor = new OrdinalColor();
//        ordinalColor.setColors(new String[] {
//                "#ffffff", "#ffffff", "#fffff", "#fffff", "#ffffff"
//        });
//        tagCloud.setColorScale(ordinalColor);
//        tagCloud.getColorScale().setColors(new String[] {
//                "#26959f", "#f18126", "#3b8ad8", "#60727b", "#e24b26"
//        });
//        tagCloud.setColorScale("anychart.scales.ordinalColor().colors(['#26959f', '#f18126', '#3b8ad8', '#60727b', '#e24b26'])");
        tagCloud.setAngles(new Double[] {-90d, 0d, 90d});

        tagCloud.getColorRange().setEnabled(true);
        tagCloud.getColorRange().setColorLineSize(15d);

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

        tagCloud.setData(data);

        anyChartView.setChart(tagCloud);
    }

//    private String[] getData() {
//        return new String[] {
//                "{x: 'China', category: 'asia', value: 1383220000}",
//                "{x: 'India', category: 'asia', value: 1316000000}",
//                "{x: 'United States', category: 'america', value: 324982000}",
//                "{x: 'Indonesia', category: 'asia', value: 263510000}",
//                "{x: 'Brazil', category: 'america', value: 207505000}",
//                "{x: 'Pakistan', category: 'asia', value: 196459000}",
//                "{x: 'Nigeria', category: 'africa', value: 191836000}",
//                "{x: 'Bangladesh', category: 'asia', value: 162459000}",
//                "{x: 'Russia', category: 'europe', value: 146804372}",
//                "{x: 'Japan', category: 'asia', value: 126790000}",
//                "{x: 'Mexico', category: 'america', value: 123518000}",
//                "{x: 'Ethiopia', category: 'africa', value: 104345000}",
//                "{x: 'Philippines', category: 'asia', value: 104037000}",
//                "{x: 'Egypt', category: 'africa', value: 93013300}",
//                "{x: 'Vietnam', category: 'asia', value: 92700000}",
//                "{x: 'Germany', category: 'europe', value: 82800000}",
//                "{x: 'Democratic Republic of the Congo', category: 'africa', value: 82243000}",
//                "{x: 'Iran', category: 'asia', value: 80135400}",
//                "{x: 'Turkey', category: 'asia', value: 79814871}",
//                "{x: 'Thailand', category: 'asia', value: 68298000}",
//                "{x: 'France', category: 'europe', value: 67013000}",
//                "{x: 'United Kingdom', category: 'europe', value: 65110000}",
//                "{x: 'Italy', category: 'europe', value: 60599936}",
//                "{x: 'Tanzania', category: 'africa', value: 56878000}",
//                "{x: 'South Africa', category: 'africa', value: 55908000}",
//                "{x: 'Myanmar', category: 'asia', value: 54836000}",
//                "{x: 'South Korea', category: 'asia', value: 51446201}",
//                "{x: 'Colombia', category: 'america', value: 49224700}",
//                "{x: 'Kenya', category: 'africa', value: 48467000}",
//                "{x: 'Spain', category: 'europe', value: 46812000}",
//                "{x: 'Argentina', category: 'america', value: 43850000}",
//                "{x: 'Ukraine', category: 'europe', value: 42541633}",
//                "{x: 'Sudan', category: 'africa', value: 42176000}",
//                "{x: 'Uganda', category: 'africa', value: 41653000}",
//                "{x: 'Algeria', category: 'africa', value: 41064000}",
//                "{x: 'Poland', category: 'europe', value: 38424000}",
//                "{x: 'Iraq', category: 'asia', value: 37883543}",
//                "{x: 'Canada', category: 'america', value: 36541000}",
//                "{x: 'Morocco', category: 'africa', value: 34317500}",
//                "{x: 'Saudi Arabia', category: 'asia', value: 33710021}",
//                "{x: 'Uzbekistan', category: 'asia', value: 32121000}",
//                "{x: 'Malaysia', category: 'asia', value: 32063200}",
//                "{x: 'Peru', category: 'america', value: 31826018}",
//                "{x: 'Venezuela', category: 'america', value: 31431164}",
//                "{x: 'Nepal', category: 'asia', value: 28825709}",
//                "{x: 'Angola', category: 'africa', value: 28359634}",
//                "{x: 'Ghana', category: 'africa', value: 28308301}",
//                "{x: 'Yemen', category: 'asia', value: 28120000}",
//                "{x: 'Afghanistan', category: 'asia', value: 27657145}",
//                "{x: 'Mozambique', category: 'africa', value: 27128530}",
//                "{x: 'Australia', category: 'australia', value: 24460900}",
//                "{x: 'North Korea', category: 'asia', value: 24213510}",
//                "{x: 'Taiwan', category: 'asia', value: 23545680}",
//                "{x: 'Cameroon', category: 'africa', value: 23248044}",
//                "{x: 'Ivory Coast', category: 'africa', value: 22671331}",
//                "{x: 'Madagascar', category: 'africa', value: 22434363}",
//                "{x: 'Niger', category: 'africa', value: 21564000}",
//                "{x: 'Sri Lanka', category: 'asia', value: 21203000}",
//                "{x: 'Romania', category: 'europe', value: 19760000}",
//                "{x: 'Burkina Faso', category: 'africa', value: 19632147}",
//                "{x: 'Syria', category: 'asia', value: 18907000}",
//                "{x: 'Mali', category: 'africa', value: 18875000}",
//                "{x: 'Malawi', category: 'africa', value: 18299000}",
//                "{x: 'Chile', category: 'america', value: 18191900}",
//                "{x: 'Kazakhstan', category: 'asia', value: 17975800}",
//                "{x: 'Netherlands', category: 'europe', value: 17121900}",
//                "{x: 'Ecuador', category: 'america', value: 16737700}",
//                "{x: 'Guatemala', category: 'america', value: 16176133}",
//                "{x: 'Zambia', category: 'africa', value: 15933883}",
//                "{x: 'Cambodia', category: 'asia', value: 15626444}",
//                "{x: 'Senegal', category: 'africa', value: 15256346}",
//                "{x: 'Chad', category: 'africa', value: 14965000}",
//                "{x: 'Zimbabwe', category: 'africa', value: 14542235}",
//                "{x: 'Guinea', category: 'africa', value: 13291000}",
//                "{x: 'South Sudan', category: 'africa', value: 12131000}",
//                "{x: 'Rwanda', category: 'africa', value: 11553188}",
//                "{x: 'Belgium', category: 'europe', value: 11356191}",
//                "{x: 'Tunisia', category: 'africa', value: 11299400}",
//                "{x: 'Cuba', category: 'america', value: 11239004}",
//                "{x: 'Bolivia', category: 'america', value: 11145770}",
//                "{x: 'Somalia', category: 'africa', value: 11079000}",
//                "{x: 'Haiti', category: 'america', value: 11078033}",
//                "{x: 'Greece', category: 'europe', value: 10783748}",
//                "{x: 'Benin', category: 'africa', value: 10653654}",
//                "{x: 'Czech Republic', category: 'europe', value: 10578820}",
//                "{x: 'Portugal', category: 'europe', value: 10341330}",
//                "{x: 'Burundi', category: 'africa', value: 10114505}",
//                "{x: 'Dominican Republic', category: 'america', value: 10075045}",
//                "{x: 'Sweden', category: 'europe', value: 10054100}",
//                "{x: 'United Arab Emirates', category: 'asia', value: 10003223}",
//                "{x: 'Jordan', category: 'asia', value: 9889270}",
//                "{x: 'Azerbaijan', category: 'asia', value: 9823667}",
//                "{x: 'Hungary', category: 'europe', value: 9799000}",
//                "{x: 'Belarus', category: 'europe', value: 9498600}",
//                "{x: 'Honduras', category: 'america', value: 8866351}",
//                "{x: 'Austria', category: 'europe', value: 8773686}",
//                "{x: 'Tajikistan', category: 'asia', value: 8742000}",
//                "{x: 'Israel', category: 'asia', value: 8690220}",
//                "{x: 'Switzerland', category: 'europe', value: 8417700}",
//                "{x: 'Papua New Guinea', category: 'australia', value: 8151300}"
//        };
//    }
}

package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Map;
import com.anychart.core.map.series.Marker;
import com.anychart.enums.SelectionMode;
import com.anychart.graphics.vector.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class PointMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Map map = AnyChart.map();

        map.credits().enabled(true);
        map.credits()
                .url("https://opendata.socrata.com/dataset/Airport-Codes-mapped-to-Latitude-Longitude-in-the-/rxrh-4cxm")
                .text("Data source: https://opendata.socrata.com")
                .logoSrc("https://opendata.socrata.com/stylesheets/images/common/favicon.ico");

        map.unboundRegions()
                .enabled(true)
                .fill(new SolidFill("#E1E1E1", 1))
                .stroke("#D2D2D2");

        map.geoData("anychart.maps.united_states_of_america");

        map.title()
                .enabled(true)
                .useHtml(true)
                .padding(0, 0, 10, 0)
                .text("Airports in the United States<br/><span style=\"color:#929292; font-size: 12px;\">" +
                        "According to opendata.socrata.com<br/>Cities and names were collected from Wikipedia.org</span>");

        Marker series = map.marker(getData());
        series.tooltip()
                .useHtml(true)
                .padding(8, 13, 10, 13)
                .title(false)
                .separator(false)
                .fontSize(14)
                .format("function() {\n" +
                        "            return '<span>' + this.getData('name') + '</span><br/>' +\n" +
                        "              '<span style=\"font-size: 12px; color: #E1E1E1\">City: ' +\n" +
                        "              this.getData('city') + '</span>';\n" +
                        "          }");

        series.size(5)
                .labels(false);
        series.stroke("2 #E1E1E1")
                .fill("#1976d2", 1);
        series.selectionMode(SelectionMode.NONE);

        anyChartView.addScript("file:///android_asset/united_states_of_america.js");
        anyChartView.addScript("file:///android_asset/proj4.js");
        anyChartView.setChart(map);
    }

    private List<DataEntry> getData() {
        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry("BHM", "Birmingham", "Birmingham-Shuttlesworth International Airport", 33.5639, -86.7522));
        data.add(new CustomDataEntry("DHN", "Dothan", "Dothan Regional Airport", 31.3214, -85.4497));
        data.add(new CustomDataEntry("HSV", "Huntsville", "Huntsville International Airport", 34.6372, -86.775));
        data.add(new CustomDataEntry("MOB", "Mobile", "Mobile Regional Airport", 30.6914, -88.2428));
        data.add(new CustomDataEntry("MGM", "Montgomery", "Montgomery Regional Airport", 32.3006, -86.3939));
        data.add(new CustomDataEntry("IFP", "Bullhead City", "Laughlin/Bullhead International Airport", 35.1561, -114.5594));
        data.add(new CustomDataEntry("FLG", "Flagstaff", "Flagstaff Pulliam Airport", 35.1403, -111.6692));
        data.add(new CustomDataEntry("GCN", "Grand Canyon / Tusayan", "Grand Canyon National Park Airport", 35.9522, -112.1469));
        data.add(new CustomDataEntry("IWA", "Mesa", "Phoenix-Mesa Gateway Airport", 33.3078, -111.6556));
        data.add(new CustomDataEntry("PGA", "Page", "Page Municipal Airport", 36.9261, -111.4483));
        data.add(new CustomDataEntry("1G4", "Peach Springs", "Grand Canyon West Airport", 35.9903, -113.8164));
        data.add(new CustomDataEntry("PHX", "Phoenix", "Phoenix Sky Harbor International Airport", 33.4342, -112.0117));
        data.add(new CustomDataEntry("TUS", "Tucson", "Tucson International Airport", 32.1161, -110.9411));
        data.add(new CustomDataEntry("NYL", "Yuma", "Yuma International Airport / MCAS Yuma", 32.6567, -114.6061));
        data.add(new CustomDataEntry("XNA", "Fayetteville", "Northwest Arkansas Regional Airport", 36.2819, -94.3069));
        data.add(new CustomDataEntry("FSM", "Fort Smith", "Fort Smith Regional Airport", 35.3367, -94.3675));
        data.add(new CustomDataEntry("LIT", "Little Rock", "Bill and Hillary Clinton National Airport", 34.7294, -92.2244));
        data.add(new CustomDataEntry("TXK", "Texarkana", "Texarkana Regional Airport", 33.4536, -93.9911));
        data.add(new CustomDataEntry("ACV", "Arcata / Eureka", "Arcata Airport", 40.9781, -124.1086));
        data.add(new CustomDataEntry("BFL", "Bakersfield", "Meadows Field", 35.4339, -119.0578));
        data.add(new CustomDataEntry("BUR", "Burbank", "Bob Hope Airport", 34.2006, -118.3586));
        data.add(new CustomDataEntry("CRQ", "Carlsbad", "McClellan-Palomar Airport", 33.1283, -117.28));
        data.add(new CustomDataEntry("CIC", "Chico", "Chico Municipal Airport", 39.7953, -121.8583));
        data.add(new CustomDataEntry("CEC", "Crescent City", "Del Norte County Airport", 41.7803, -124.2367));
        data.add(new CustomDataEntry("FAT", "Fresno", "Fresno Yosemite International Airport", 36.7761, -119.7181));
        data.add(new CustomDataEntry("LGB", "Long Beach", "Long Beach Airport<br/>(Daugherty Field)", 33.8178, -118.1517));
        data.add(new CustomDataEntry("LAX", "Los Angeles", "Los Angeles International Airport", 33.9425, -118.4072));
        data.add(new CustomDataEntry("MMH", "Mammoth Lakes", "Mammoth Yosemite Airport", 37.6242, -118.8378));
        data.add(new CustomDataEntry("MOD", "Modesto", "Modesto City-County Airport<br/>(Harry Sham Field)", 37.6258, -120.9544));
        data.add(new CustomDataEntry("MRY", "Monterey", "Monterey Regional Airport<br/>(was Monterey Peninsula Airport)", 36.5869, -121.8431));
        data.add(new CustomDataEntry("OAK", "Oakland", "Oakland International Airport", 37.7214, -122.2208));
        data.add(new CustomDataEntry("ONT", "Ontario", "Ontario International Airport", 34.0561, -117.6011));
        data.add(new CustomDataEntry("PSP", "Palm Springs", "Palm Springs International Airport", 33.8297, -116.5067));
        data.add(new CustomDataEntry("RDD", "Redding", "Redding Municipal Airport", 40.5089, -122.2933));
        data.add(new CustomDataEntry("SMF", "Sacramento", "Sacramento International Airport", 38.6956, -121.5908));
        data.add(new CustomDataEntry("SAN", "San Diego", "San Diego International Airport", 32.7336, -117.1897));
        data.add(new CustomDataEntry("SFO", "San Francisco", "San Francisco International Airport", 37.6189, -122.375));
        data.add(new CustomDataEntry("SJC", "San Jose", "Norman Y. Mineta San José International Airport", 37.3628, -121.9292));
        data.add(new CustomDataEntry("SBP", "San Luis Obispo", "San Luis Obispo County Regional Airport<br/>(McChesney Field)", 35.2372, -120.6425));
        data.add(new CustomDataEntry("SNA", "Santa Ana", "John Wayne Airport - Orange County<br/>(was Orange County Airport)", 33.6756, -117.8683));
        data.add(new CustomDataEntry("SBA", "Santa Barbara", "Santa Barbara Municipal Airport<br/>(Santa Barbara Airport)", 34.4261, -119.8414));
        data.add(new CustomDataEntry("SMX", "Santa Maria", "Santa Maria Public Airport<br/>(Capt G. Allan Hancock Field)", 34.8989, -120.4575));
        data.add(new CustomDataEntry("STS", "Santa Rosa", "Charles M. Schulz-Sonoma County Airport", 38.5089, -122.8128));
        data.add(new CustomDataEntry("SCK", "Stockton", "Stockton Metropolitan Airport", 37.8942, -121.2383));
        data.add(new CustomDataEntry("ASE", "Aspen", "Aspen-Pitkin County Airport<br/>(Sardy Field)", 39.2231, -106.8689));
        data.add(new CustomDataEntry("COS", "Colorado Springs", "City of Colorado Springs Municipal Airport", 38.8058, -104.7008));
        data.add(new CustomDataEntry("DEN", "Denver", "Denver International Airport", 39.8617, -104.6731));
        data.add(new CustomDataEntry("DRO", "Durango", "Durango-La Plata County Airport", 37.1514, -107.7539));
        data.add(new CustomDataEntry("EGE", "Eagle", "Eagle County Regional Airport", 39.6414, -106.9175));
        data.add(new CustomDataEntry("GJT", "Grand Junction", "Grand Junction Regional Airport<br/>(Walker Field)", 39.1225, -108.5267));
        data.add(new CustomDataEntry("GUC", "Gunnison", "Gunnison-Crested Butte Regional Airport", 38.5339, -106.9331));
        data.add(new CustomDataEntry("HDN", "Hayden", "Yampa Valley Airport (Yampa Valley Regional)", 40.4811, -107.2178));
        data.add(new CustomDataEntry("MTJ", "Montrose", "Montrose Regional Airport", 38.5097, -107.8942));
        data.add(new CustomDataEntry("BDL", "Hartford", "Bradley International Airport", 41.9389, -72.6833));
        data.add(new CustomDataEntry("HVN", "New Haven", "Tweed New Haven Regional Airport", 41.2639, -72.8867));
        data.add(new CustomDataEntry("DAB", "Daytona Beach", "Daytona Beach International Airport", 29.18, -81.0581));
        data.add(new CustomDataEntry("FLL", "Fort Lauderdale", "Fort Lauderdale-Hollywood International Airport", 26.0726, -80.1528));
        data.add(new CustomDataEntry("RSW", "Fort Myers", "Southwest Florida International Airport", 26.5362, -81.7553));
        data.add(new CustomDataEntry("GNV", "Gainesville", "Gainesville Regional Airport", 29.69, -82.2717));
        data.add(new CustomDataEntry("JAX", "Jacksonville", "Jacksonville International Airport", 30.4942, -81.6878));
        data.add(new CustomDataEntry("MLB", "Melbourne", "Melbourne International Airport", 28.1028, -80.6453));
        data.add(new CustomDataEntry("MIA", "Miami", "Miami International Airport", 25.7932, -80.2906));
        data.add(new CustomDataEntry("MCO", "Orlando", "Orlando International Airport", 28.4294, -81.3089));
        data.add(new CustomDataEntry("SFB", "Orlando/Sanford", "Orlando Sanford International Airport", 28.7767, -81.2356));
        data.add(new CustomDataEntry("PNS", "Pensacola", "Pensacola International Airport<br/>(Pensacola Gulf Coast Regional Airport)", 30.4733, -87.1867));
        data.add(new CustomDataEntry("PGD", "Punta Gorda", "Punta Gorda Airport<br/>(was Charlotte County Airport)", 26.9198, -81.9906));
        data.add(new CustomDataEntry("SRQ", "Sarasota / Bradenton", "Sarasota-Bradenton International Airport", 27.3954, -82.5544));
        data.add(new CustomDataEntry("SGJ", "St. Augustine", "Northeast Florida Regional Airport<br/>(was St. Augustine Airport)", 29.9592, -81.3397));
        data.add(new CustomDataEntry("PIE", "St. Petersburg/Clearwater", "St. Petersburg International Airport", 27.91, -82.6875));
        data.add(new CustomDataEntry("TLH", "Tallahassee", "Tallahassee Regional Airport", 30.3967, -84.3503));
        data.add(new CustomDataEntry("TPA", "Tampa", "Tampa International Airport", 27.9756, -82.5333));
        data.add(new CustomDataEntry("VPS", "Valparaiso", "Destin-Fort Walton Beach Airport<br/>Eglin Air Force Base", 30.4833, -86.5253));
        data.add(new CustomDataEntry("PBI", "West Palm Beach", "Palm Beach International Airport", 26.6832, -80.0956));
        data.add(new CustomDataEntry("ABY", "Albany", "Southwest Georgia Regional Airport", 31.5356, -84.1944));
        data.add(new CustomDataEntry("ATL", "Atlanta", "Hartsfield-Jackson Atlanta International Airport", 33.6367, -84.4281));
        data.add(new CustomDataEntry("AGS", "Augusta", "Augusta Regional Airport", 33.37, -81.9644));
        data.add(new CustomDataEntry("BQK", "Brunswick", "Brunswick Golden Isles Airport", 31.2592, -81.4664));
        data.add(new CustomDataEntry("CSG", "Columbus", "Columbus Metropolitan Airport", 32.5164, -84.9389));
        data.add(new CustomDataEntry("SAV", "Savannah", "Savannah/Hilton Head International Airport", 32.1275, -81.2022));
        data.add(new CustomDataEntry("VLD", "Valdosta", "Valdosta Regional Airport", 30.7814, -83.2761));
        data.add(new CustomDataEntry("ITO", "Hilo", "Hilo International Airport", 19.7202, -155.0483));
        data.add(new CustomDataEntry("HNL", "Honolulu", "Honolulu International Airport", 21.3187, -157.9225));
        data.add(new CustomDataEntry("OGG", "Kahului", "Kahului Airport", 20.8986, -156.4306));
        data.add(new CustomDataEntry("KOA", "Kailua/Kona", "Kona International Airport at Keahole", 19.7388, -156.0456));
        data.add(new CustomDataEntry("MKK", "Kaunakakai", "Molokai Airport<br/>(Molokaʻi Airport)", 21.1529, -157.0961));
        data.add(new CustomDataEntry("LNY", "Lanai City (Lānaʻi City)", "Lanai Airport<br/>(Lānaʻi Airport)", 20.7856, -156.9514));
        data.add(new CustomDataEntry("LIH", "Lihue (Līhuʻe)", "Lihue Airport<br/>(Līhuʻe Airport)", 21.976, -159.3389));
        data.add(new CustomDataEntry("BOI", "Boise", "Boise Airport (Boise Air Terminal) (Gowen Field)", 43.5644, -116.2228));
        data.add(new CustomDataEntry("SUN", "Hailey", "Friedman Memorial Airport", 43.5039, -114.2956));
        data.add(new CustomDataEntry("IDA", "Idaho Falls", "Idaho Falls Regional Airport (Fanning Field)", 43.5136, -112.0708));
        data.add(new CustomDataEntry("LWS", "Lewiston", "Lewiston-Nez Perce County Airport", 46.3744, -117.0153));
        data.add(new CustomDataEntry("PIH", "Pocatello / Arbon Valley", "Pocatello Regional Airport", 42.9097, -112.5958));
        data.add(new CustomDataEntry("TWF", "Twin Falls", "Magic Valley Regional Airport<br/>(Joslin Field)", 42.4817, -114.4878));
        data.add(new CustomDataEntry("BLV", "Belleville", "MidAmerica St. Louis Airport<br/>Scott Air Force Base", 38.5453, -89.8353));
        data.add(new CustomDataEntry("BMI", "Bloomington / Normal", "Central Illinois Regional Airport at Bloomington-Normal", 40.4772, -88.9158));
        data.add(new CustomDataEntry("CMI", "Champaign / Urbana", "University of Illinois - Willard Airport", 40.0389, -88.2778));
        data.add(new CustomDataEntry("ORD", "Chicago", "Chicago O\\'Hare International Airport", 41.9808, -87.9067));
        data.add(new CustomDataEntry("MDW", "Chicago", "Chicago Midway International Airport", 41.7861, -87.7525));
        data.add(new CustomDataEntry("MWA", "Marion", "Williamson County Regional Airport", 37.755, -89.0111));
        data.add(new CustomDataEntry("MLI", "Moline", "Quad City International Airport", 41.4486, -90.5072));

        return data;
    }

    class CustomDataEntry extends DataEntry {
        public CustomDataEntry(String id, String city, String name, Double latitude, Double longitude) {
            setValue("id", id);
            setValue("city", city);
            setValue("name", name);
            setValue("lat", latitude);
            setValue("long", longitude);
        }
    }
}

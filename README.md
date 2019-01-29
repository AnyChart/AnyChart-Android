[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)

# AnyChart for Android
[![](https://jitpack.io/v/AnyChart/AnyChart-Android.svg)](https://jitpack.io/#AnyChart/AnyChart-Android) [![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)

AnyChart Android Charts is an amazing data visualization library for easily creating interactive charts in Android apps. It runs on API 19+ (Android 4.4) and features dozens of built-in chart types.

Check out <a href="https://github.com/AnyChart/AnyChart-Android/wiki/Getting-started">getting started</a>.

## Installation

### Gradle
Add this to the root build.gradle at the end of repositories (**WARNING:** Make sure you add this under **allprojects** not under buildscript):
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```

Add the dependency to the project build.gradle:
```Groovy
dependencies {
        implementation 'com.github.AnyChart:AnyChart-Android:1.1.2'
}
```

### JAR/AAR File
Copy AAR file into the libs folder of the application project.

If you are using **Android Studio**:
1. Right click on a project and choose "Open Module Settings".
2. Click the plus button in the top left to add a new module.
3. Choose "Import .JAR or .AAR Package".
4. Find the AAR file.
5. In the app's module click on the dependencies tab and add the new module as a dependency.

## Chart Types
AnyChart product family includes scores of chart types and we're constantly adding new ones.

<table>
    <tr>
        <td width="33%">
            <h3 align="center">Pie Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/piechart.png" alt="Pie Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PieChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/columnchart.png" alt="Column Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ColumnChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Line Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linechart.png" alt="Line Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/LineChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Venn Diagram</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/venndiagram.png" alt="Venn Diagram - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/VennDiagramActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Radar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/radarchart.png" alt="Radar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RadarChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Tag Cloud</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/tagcloud.png" alt="Tag Cloud - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/TagCloudActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <h3 align="center">Heat Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/heatmapchart.png" alt="Heat Map Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/HeatMapChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Waterfall Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/waterfallchart.png" alt="Waterfall Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WaterfallChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Tree Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/treemapchart.png" alt="Tree Map Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/TreeMapChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Scatter Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/scatterchart.png" alt="Scatter Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ScatterChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <h3 align="center">Resource Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/resourcechart.png" alt="Resource Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ResourceChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Range Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/rangechart.png" alt="Range Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RangeChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Vertical Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/verticalchart.png" alt="Vertical Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RadarChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Funnel Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/funnelchart.png" alt="Funnel Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/FunnelChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <h3 align="center">Pert Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pertchart.png" alt="Pert Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PertChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Polar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/polarchart.png" alt="Polar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PolarChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Pyramid Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pyramidchart.png" alt="Pyramid Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PyramidChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Bubble Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bubblechart.png" alt="Bubble Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BubbleChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/areachart.png" alt="Area Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/AreaChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/barchart.png" alt="Bar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BarChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Box Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/boxchart.png" alt="Box Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BoxChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Mosaic Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/mosaicchart.png" alt="Mosaic Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MosaicChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Mekko Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/mekkochart.png" alt="Mekko Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MekkoChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">3D Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bar3dchart.png" alt="3D Bar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Bar3DChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">3D Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/column3dchart.png" alt="3D Column Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Column3DChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">3D Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/area3dchart.png" alt="3D Area Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Area3DChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Circular Gauge</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/circulargauge.png" alt="Circular Gauge">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/CircularGaugeActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Pareto Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/paretochart.png" alt="Pareto Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ParetoChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Combined Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/combinedchart.png" alt="Combined Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/CombinedChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Quadrant Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/quadrantchart.png" alt="Quadrant Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/QuadrantChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Hilo Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/hilochart.png" alt="Hilo Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/HiloChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">OHLC Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/ohlcchart.png" alt="OHLC Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/OHLCChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Bubble Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bubblemap.png" alt="Bubble Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BubbleMapActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Choropleth Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/choroplethmap.png" alt="Choropleth Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ChoroplethMapActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Point Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pointmap.png" alt="Point Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PointMapActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Connector Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/connectormap.png" alt="Connector Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ConnectorMapActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Sunburst Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/sunburstchart.png" alt="Sunburst Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/SunburstChartActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Thermometer</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/thermometer.png" alt="Thermometer - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ThermometerActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Linear Color Scale</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linearcolorscale.png" alt="Linear Color Scale - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/LinearColorScaleActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td width="33%">
            <h3 align="center">Wind Speed Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/windspeed.png" alt="Wind Speed - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WindSpeedActivity.java">Code Snippet</a>
            </sup>            
        </td>
        <td width="33%">
            <h3 align="center">Wind Direction</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/winddirection.png" alt="Wind Direction - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WindDirectionActivity.java">Code Snippet</a>
            </sup>            
        </td>
    </tr>
</table>  

## Contacts
* Web: [www.anychart.com](https://www.anychart.com)
* Email: [contact@anychart.com](mailto:contact@anychart.com)
* Twitter: [anychart](https://twitter.com/anychart)
* Facebook: [AnyCharts](https://www.facebook.com/AnyCharts)
* LinkedIn: [anychart](https://www.linkedin.com/company/anychart)

## Links
* [AnyChart Website](https://www.anychart.com)
* [Download AnyChart](https://www.anychart.com/download/)
* [AnyChart Licensing](https://www.anychart.com/buy/)
* [AnyChart Support](https://www.anychart.com/support/)
* [Report Issues](https://github.com/AnyChart/anychart/issues)
* [AnyChart Playground](https://playground.anychart.com)
* [AnyChart Documentation](https://docs.anychart.com)
* [AnyChart API Reference](https://api.anychart.com)
* [AnyChart Sample Solutions](https://www.anychart.com/solutions/)
* [AnyChart Integrations](https://www.anychart.com/integrations/)

## License
[© AnyChart.com - JavaScript charts](https://www.anychart.com). All rights reserved.
<img src="https://ga-beacon.appspot.com/UA-228820-4/Wrappers/Android?pixel&useReferer">

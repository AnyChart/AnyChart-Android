[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)

# AnyChart for Android
TODO: Bages lile MPAndroidChart   
TODO Description

## Installation

### Leiningen
Add it in your project.clj at the end of repositories:
```clojure
:repositories [["jitpack" "https://jitpack.io"]]
```
Add the dependency:
```clojure
:dependencies [[com.github.AnyChart/AnyChart-Android "v0.0.1"]]	
```

### SBT
Add it in your build.sbt at the end of resolvers:
```sbt
resolvers += "jitpack" at "https://jitpack.io"
```
Add the dependency:
```sbt
libraryDependencies += "com.github.AnyChart" % "AnyChart-Android" % "v0.0.1"	
```

### Maven
Add the JitPack repository to your build file: 
```xml
<repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
</repositories>
```
Add the dependency:
```xml
<dependency>
    <groupId>com.github.AnyChart</groupId>
    <artifactId>AnyChart-Android</artifactId>
    <version>v0.0.1</version>
</dependency>
```

### Gradle
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```
**WARNING:** Ensure you add it under **allprojects** instead of buildscript.

Add the dependency in your project build.gradle:
```Groovy
dependencies {
        compile 'com.github.AnyChart:AnyChart-Android:v0.0.1'
}
```

### JAR/AAR File
Download the <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/anychart-library.aar">latest AAR</a>.
Copy AAR file into the libs folder of your application project.

If you using **Android Studio**:
1. Right click on your project and choose "Open Module Settings".
2. Click the plus button in the top left to add a new module.
3. Choose "Import .JAR or .AAR Package".
4. Find the AAR file.
5. In the app's module click on the dependencies tab and add the new module as a dependency.

## Getting Started
AnyChart library for Android compatible with API 15+(Android 4.0.3)

### Add declaration to a view
```xml
<com.anychart.anychart.AnyChartView
        android:id="@+id/any_chart_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        />
```

### Add Java code (for example, if you want to create pie chart)
```java
Pie pie = AnyChart.pie();
pie.setData(new String[] {"['John' , 10000]", "['Jake' , 12000]", "['Peter' , 18000]"}, TextParsingMode.CSV);

AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
anyChartView.setChart(pie);
```

## Chart Types
AnyChart product family includes more than 60 different chart types and we're constantly adding new ones.

<table>
    <tr>
        <td>
            <h3 align="center">Pie Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/piechart.png" width="320px" height="400px" alt="Pie Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PieChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/columnchart.png" width="320px" height="400px" alt="Column Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ColumnChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Line Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linechart.png" width="320px" height="400px" alt="Line Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/LineChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Venn Diagram</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/venndiagram.png" width="320px" height="400px" alt="Venn Diagram - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/VennDiagramActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td colspan="2">
            <h3 align="center">Heat Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/heatmapchart.png" width="640px" height="400px" alt="Heat Map Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/HeatMapChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Waterfall Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/waterfallchart.png" width="320px" height="400px" alt="Waterfall Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WaterfallChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Tree Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/treemapchart.png" width="320px" height="400px" alt="Tree Map Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/TreeMapChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Scatter Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/scatterchart.png" width="320px" height="400px" alt="Scatter Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ScatterChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <h3 align="center">Resource Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/resourcechart.png" width="640px" height="400px" alt="Resource Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ResourceChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Radar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/radarchart.png" width="320px" height="400px" alt="Radar Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RadarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Range Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/rangechart.png" width="320px" height="400px" alt="Range Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RangeChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Vertical Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/verticalchart.png" width="320px" height="400px" alt="Vertical Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RadarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Funnel Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/funnelchart.png" width="320px" height="400px" alt="Funnel Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/FunnelChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <h3 align="center">Pert Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pertchart.png" width="640px" height="400px" alt="Pert Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PertChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Tag Cloud</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/tagcloud.png" width="320px" height="400px" alt="Tag Cloud - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/TagCloudActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Polar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/polarchart.png" width="320px" height="400px" alt="Polar Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PolarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Pyramid Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pyramidchart.png" width="320px" height="400px" alt="Pyramid Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PyramidChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Bubble Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bubblechart.png" width="320px" height="400px" alt="Bubble Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BubbleChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
</table>  

## Running Demos
TODO!


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

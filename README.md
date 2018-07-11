[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)

# AnyChart for Android
[![](https://jitpack.io/v/AnyChart/AnyChart-Android.svg)](https://jitpack.io/#AnyChart/AnyChart-Android) [![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)

AnyChart Android Charts is an amazing data visualization library for easily creating interactive charts in Android apps. It runs on API 19+ (Android 4.4) and features dozens of built-in chart types.

## Installation

### Leiningen
Add this to the project.clj file, at the end of repositories:
```clojure
:repositories [["jitpack" "https://jitpack.io"]]
```
Add the dependency:
```clojure
:dependencies [[com.github.AnyChart/AnyChart-Android "0.2.8"]]
```

### SBT
Add this to the build.sbt, at the end of resolvers:
```sbt
resolvers += "jitpack" at "https://jitpack.io"
```
Add the dependency:
```sbt
libraryDependencies += "com.github.AnyChart" % "AnyChart-Android" % "0.2.8"
```

### Maven
Add the JitPack repository to the build file: 
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
    <version>0.2.8</version>
</dependency>
```

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
        implementation 'com.github.AnyChart:AnyChart-Android:0.2.8'
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

## Getting Stated using Gradle
You should have already set up the latest <a href="https://developer.android.com/studio/index.html">Android Studio</a>.

Create a new project and select appropriate API level (AnyChart library for Android compatible with API 19+).
<table>
    <tr>
        <td>
            <h3 align="center">Create new project</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_1.png" alt="Create new project">
        </td>
        <td>
            <h3 align="center">Select API level</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_2.png" alt="Select API level">
        </td>
    </tr>
</table>

Add an empty Activity and put in layout and Activity name.
<table>
    <tr>
        <td>
            <h3 align="center">Add Activity</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_6.png" alt="Create new project">
        </td>
        <td>
            <h3 align="center">Customize Activity</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_7.png" alt="Select API level">
        </td>
    </tr>
</table>

Add the repository to the **project build.gradle** at the end of repositories (**WARNING:** Make sure you add it under **allprojects**, not under the buildscript). 
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```

Then add the dependency to the **module build.gradle** and synchronize project with Gradle.
```Groovy
dependencies {
        implementation 'com.github.AnyChart:AnyChart-Android:0.2.8'
}
```

<table>
    <tr>
        <td>
            <h3 align="center">Add the repository</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_3.png" alt="Add repository in your root build.gradle">
        </td>
        <td>
            <h3 align="center">Add the dependency and sync the project</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_4.png" alt="Add the dependency in your project build.gradle and sync project">
        </td>
    </tr>
</table>

Add AnyChart view to the Activity layout.
```xml
<com.anychart.anychart.AnyChartView
        android:id="@+id/any_chart_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        />
```

<table>
    <tr>
        <td>
            <h3 align="center">Add a view to a layout</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_8.png" alt="Add repository in your root build.gradle">
        </td>
    </tr>
</table>

Add Java code to the Activity. For example, if you want to create pie chart:
```java
Pie pie = AnyChart.pie();

List<DataEntry> data = new ArrayList<>();
data.add(new ValueDataEntry("John", 10000));
data.add(new ValueDataEntry("Jake", 12000));
data.add(new ValueDataEntry("Peter", 18000));

AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
anyChartView.setChart(pie);
```
<table>
    <tr>
        <td>
            <h3 align="center">Add Java code</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_9.png" alt="Add repository to the root build.gradle">
        </td>
    </tr>
</table>

Make sure you have these package imports at the top of your Activity file.
```java
import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Pie;
import com.anychart.anychart.ValueDataEntry;

import java.util.ArrayList;
import java.util.List;
```

Build and run your app.
<table>
    <tr>
        <td valign="top">
            <h3 align="center">Build and run</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_10.png" alt="Build and run">
        </td>
        <td>
            <h3 align="center">Running App</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_5.png" alt="Running app">
        </td>
    </tr>
</table>

## Chart Types
AnyChart product family includes scores of chart types and we're constantly adding new ones.

<table>
    <tr>
        <td>
            <h3 align="center">Pie Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/piechart.png" width="320px" height="400px" alt="Pie Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PieChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/columnchart.png" width="320px" height="400px" alt="Column Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ColumnChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Line Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linechart.png" width="320px" height="400px" alt="Line Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/VennDiagramActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td colspan="2">
            <h3 align="center">Heat Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/heatmapchart.png" width="640px" height="400px" alt="Heat Map Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WaterfallChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Tree Map Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/treemapchart.png" width="320px" height="400px" alt="Tree Map Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/TreeMapChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Scatter Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/scatterchart.png" width="320px" height="400px" alt="Scatter Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ResourceChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Radar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/radarchart.png" width="320px" height="400px" alt="Radar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RangeChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Vertical Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/verticalchart.png" width="320px" height="400px" alt="Vertical Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/RadarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Funnel Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/funnelchart.png" width="320px" height="400px" alt="Funnel Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PertChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Tag Cloud</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/tagcloud.png" width="320px" height="400px" alt="Tag Cloud - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
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
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PolarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Pyramid Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pyramidchart.png" width="320px" height="400px" alt="Pyramid Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PyramidChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Bubble Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bubblechart.png" width="320px" height="400px" alt="Bubble Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BubbleChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/areachart.png" width="320px" height="400px" alt="Area Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/AreaChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/barchart.png" width="320px" height="400px" alt="Bar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Box Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/boxchart.png" width="320px" height="400px" alt="Box Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BoxChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Mosaic Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/mosaicchart.png" width="320px" height="400px" alt="Mosaic Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MosaicChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Mekko Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/mekkochart.png" width="320px" height="400px" alt="Mekko Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MekkoChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">3D Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bar3dchart.png" width="320px" height="400px" alt="3D Bar Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Bar3DChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">3D Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/column3dchart.png" width="320px" height="400px" alt="3D Column Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Column3DChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">3D Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/area3dchart.png" width="320px" height="400px" alt="3D Area Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Area3DChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Circular Gauge</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/circulargauge.png" width="320px" height="400px" alt="Circular Gauge">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/CircularGaugeActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Pareto Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/paretochart.png" width="320px" height="400px" alt="Pareto Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ParetoChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Combined Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/combinedchart.png" width="320px" height="400px" alt="Combined Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/CombinedChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Quadrant Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/quadrantchart.png" width="320px" height="400px" alt="Quadrant Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/QuadrantChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Hilo Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/hilochart.png" width="320px" height="400px" alt="Hilo Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/HiloChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">OHLC Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/ohlcchart.png" width="320px" height="400px" alt="OHLC Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/OHLCChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Bubble Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bubblemap.png" width="320px" height="400px" alt="Bubble Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BubbleMapActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Choropleth Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/choroplethmap.png" width="320px" height="400px" alt="Choropleth Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ChoroplethMapActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Point Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/pointmap.png" width="320px" height="400px" alt="Point Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/PointMapActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Connector Map</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/connectormap.png" width="320px" height="400px" alt="Connector Map - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ConnectorMapActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Sunburst Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/sunburstchart.png" width="320px" height="400px" alt="Sunburst Chart - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/SunburstChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Thermometer</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/thermometer.png" width="320px" height="400px" alt="Thermometer - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/ThermometerActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Linear Color Scale</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linearcolorscale.png" width="320px" height="400px" alt="Linear Color Scale - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/LinearColorScaleActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
    <tr>
        <td>
            <h3 align="center">Wind Speed Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/windspeed.png" width="320px" height="400px" alt="Wind Speed - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WindSpeedActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Wind Direction</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/winddirection.png" width="320px" height="400px" alt="Wind Direction - AnyChart">
            <sup>
              <a href="https://play.google.com/store/apps/details?id=com.anychart.anychart">Sample app</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/WindDirectionActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
    </tr>
</table>  

## Running Demos
Clone or download the project.

Open Android Studio and import the project.

<table>
    <tr>
        <td>
            <h3 align="center">Import Project</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/running_demos_1.png" alt="Import project">
        </td>
    </tr>
</table>

Run the project.

<table>
    <tr>
        <td>
            <h3 align="center">Run Project</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/running_demos_2.png" alt="Run project">
        </td>
        <td>
            <h3 align="center">Select Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/running_demos_3.png" alt="Select Chart">
        </td>
        <td>
            <h3 align="center">Running App</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/running_demos_4.png" alt="Running App">
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

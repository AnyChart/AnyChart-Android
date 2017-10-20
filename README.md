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
:dependencies [[com.github.AnyChart/AnyChart-Android "0.0.1"]]	
```

### SBT
Add it in your build.sbt at the end of resolvers:
```sbt
resolvers += "jitpack" at "https://jitpack.io"
```
Add the dependency:
```sbt
libraryDependencies += "com.github.AnyChart" % "AnyChart-Android" % "0.0.1"	
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
    <version>0.0.1</version>
</dependency>
```

### Gradle
Add it in your root build.gradle at the end of repositories (**WARNING:** Ensure you add it under **allprojects** instead of buildscript):
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```

Add the dependency in your project build.gradle:
```Groovy
dependencies {
        compile 'com.github.AnyChart:AnyChart-Android:0.0.1'
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

## Getting Stated using Gradle
You should have already set up the latest Android Studio which can be downloaded from <a href="https://developer.android.com/studio/index.html">here</a>.

Create a new project and select appropriate API level (AnyChart library for Android compatible with API 15+).
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

Add an empty Activity and write layout and Activity name.
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

Add the repository in your **project build.gradle** at the end of repositories (**WARNING:** Ensure you add it under **allprojects** instead of buildscript). 
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```

Then add the dependency in your **module build.gradle** and synchronize project with Gradle.
```Groovy
dependencies {
        compile 'com.github.AnyChart:AnyChart-Android:0.0.1'
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

Add AnyChart view to your Activity layout.
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
            <h3 align="center">Add view to layout</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_8.png" alt="Add repository in your root build.gradle">
        </td>
    </tr>
</table>

Add Java code in your Activity (for example, if you want to create pie chart).
```java
Pie pie = AnyChart.pie();
pie.setData(new String[] {"['John' , 10000]", "['Jake' , 12000]", "['Peter' , 18000]"}, TextParsingMode.CSV);

AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
anyChartView.setChart(pie);
```
<table>
    <tr>
        <td>
            <h3 align="center">Add Java code</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_9.png" alt="Add repository in your root build.gradle">
        </td>
    </tr>
</table>

Make sure you have these package imports at the top of your Activity file.
```java
import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Pie;
import com.anychart.anychart.TextParsingMode;
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
            <h3 align="center">Running app</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/create_project_5.png" alt="Running app">
        </td>
    </tr>
</table>

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
    <tr>
        <td>
            <h3 align="center">Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/areachart.png" width="320px" height="400px" alt="Area Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/AreaChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/barchart.png" width="320px" height="400px" alt="Bar Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/BarChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Box Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/boxchart.png" width="320px" height="400px" alt="Box Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
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
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MosaicChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Mekko Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/mekkochart.png" width="320px" height="400px" alt="Mekko Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/MekkoChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">3D Bar Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/bar3dchart.png" width="320px" height="400px" alt="3D Bar Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
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
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Column3DChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">3D Area Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/area3dchart.png" width="320px" height="400px" alt="3D Area Chart - AnyChart">
            <sup>
              <a href="https://github.com/AnyChart/AnyChart-Android/raw/master/builds/sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/charts/Area3DChartActivity.java">Code Snippet</a> /
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

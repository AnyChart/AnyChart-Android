[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)

# AnyChart for Android
TODO: Bages lile MPAndroidChart   
TODO Description

## Installation

### Maven
TODO

### Gradle
TODO

### JAR/AAR File
Download the latest AAR.
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
Pie pie = new Pie();
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
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/piechart.jpg" width="320px" height="250px" alt="Pie Chart - AnyChart">
            <sup>
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/PieChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Column Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/columnchart.jpg" width="320px" height="250px" alt="Column Chart - AnyChart">
            <sup>
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/ColumnChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
            </sup>            
        </td>
        <td>
            <h3 align="center">Line Chart</h3>
            <hr>          
            <img src="https://github.com/AnyChart/AnyChart-Android/blob/master/img/linechart.jpg" width="320px" height="250px" alt="Line Chart - AnyChart">
            <sup>
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Sample (APK)</a> /
              <a href="https://github.com/AnyChart/AnyChart-Android/blob/master/sample/src/main/java/com/anychart/sample/LineChartActivity.java">Code Snippet</a> /
              <a href="https://static.anychart.com/cdn/integrations/android-basic-sample.apk">Documentation</a>
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

package com.vaidegrails.chartdatagenerator.factories.impl

import com.vaidegrails.chartdatagenerator.charts.ChartData
import com.vaidegrails.chartdatagenerator.charts.impl.LineChart
import com.vaidegrails.chartdatagenerator.charts.impl.LineChartType
import com.vaidegrails.chartdatagenerator.factories.ChartFactory

class LineChartFactory extends ChartFactory<LineChartType> {

    static constraints = {
    }

    @Override
    LineChart createChart(ChartData data) {
        return new LineChart()
    }
}

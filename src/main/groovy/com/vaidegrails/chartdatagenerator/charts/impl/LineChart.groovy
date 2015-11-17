package com.vaidegrails.chartdatagenerator.charts.impl

import com.vaidegrails.chartdatagenerator.charts.Chart
import com.vaidegrails.chartdatagenerator.charts.ChartData

class LineChart extends Chart<LineChartType> {
    LineChart(ChartData chartData) {
        super()
        this.data = chartData

    }

    static LineChart create(ChartData chartData) {
        return new LineChart(chartData)
    }
}


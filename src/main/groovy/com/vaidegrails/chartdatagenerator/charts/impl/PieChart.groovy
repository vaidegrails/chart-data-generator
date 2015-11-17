package com.vaidegrails.chartdatagenerator.charts.impl

import com.vaidegrails.chartdatagenerator.charts.Chart
import com.vaidegrails.chartdatagenerator.charts.ChartData

class PieChart extends Chart<PieChartType> {
    PieChart(ChartData chartData) {
        super()
        this.data = chartData
    }

    static PieChart create(ChartData chartData) {
        return new PieChart(chartData)
    }
}

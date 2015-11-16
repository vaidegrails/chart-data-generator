package com.vaidegrails.chartdatagenerator.factories.impl

import com.vaidegrails.chartdatagenerator.charts.Chart
import com.vaidegrails.chartdatagenerator.charts.ChartData
import com.vaidegrails.chartdatagenerator.charts.impl.PieChart
import com.vaidegrails.chartdatagenerator.charts.impl.PieChartType
import com.vaidegrails.chartdatagenerator.factories.ChartFactory

class PieChartFactory extends ChartFactory<PieChartType>{

    static constraints = {
    }

    @Override
    PieChart createChart(ChartData data) {
        return new PieChart()
    }
}

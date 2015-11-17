package com.vaidegrails.chartdatagenerator.factories

import com.vaidegrails.chartdatagenerator.charts.Chart
import com.vaidegrails.chartdatagenerator.charts.ChartData
import com.vaidegrails.chartdatagenerator.charts.ChartType

abstract class ChartFactory<T extends ChartType, P extends Chart> {

    Class type

    ChartFactory() {
        type = T.class
        println "Creating factory for the type: ${type.canonicalName}"
    }

    P createChart(Closure getData){
        def data = getData.run()
        ChartData chartData = convertData(data)

        P.create(chartData)
    }

    ChartData convertData(chartData) {

    }

    @Override
    String toString() {
        return "Factory ${this.class}"
    }
}

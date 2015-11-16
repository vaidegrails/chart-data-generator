package com.vaidegrails.chartdatagenerator.factories

import com.vaidegrails.chartdatagenerator.charts.Chart
import com.vaidegrails.chartdatagenerator.charts.ChartData
import com.vaidegrails.chartdatagenerator.charts.ChartType

abstract class ChartFactory<T/* extends ChartType*/> {

    Class type

    ChartFactory() {
        type = T.class
        println "Creating factory for the type: ${type.canonicalName}"
    }

    abstract Chart createChart(ChartData data)

    static constraints = {
    }
}

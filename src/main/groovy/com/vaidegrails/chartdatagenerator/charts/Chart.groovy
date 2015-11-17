package com.vaidegrails.chartdatagenerator.charts

abstract class Chart<T> {

    Class type
    ChartData data

    public Chart() {
        this.type = T
    }

    static abstract Chart create(ChartData chartData)
}

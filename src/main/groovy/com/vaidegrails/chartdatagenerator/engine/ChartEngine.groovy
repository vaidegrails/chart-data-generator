package com.vaidegrails.chartdatagenerator.engine

import com.vaidegrails.chartdatagenerator.charts.ChartType
import com.vaidegrails.chartdatagenerator.factories.ChartFactory

class ChartEngine {

    private static ChartEngine instance

    private ArrayList<ChartFactory> factories = new ArrayList<ChartFactory>()

    private ChartEngine() {}

    public static ChartEngine getInstance() {
        instance = instance ?: new ChartEngine()
        return instance
    }

    void registerFactory(ChartFactory factory) {
        println factory.class.canonicalName
        this.factories.add(factory)
    }

    ChartFactory findFactory(Class chartType, String plugin = null) {
        factories.find {
            it.type = chartType.class
        }
    }

}

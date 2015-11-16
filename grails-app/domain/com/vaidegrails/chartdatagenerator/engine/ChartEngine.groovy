package com.vaidegrails.chartdatagenerator.engine

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

    static constraints = {
    }
}

import com.vaidegrails.chartdatagenerator.engine.ChartEngine
import com.vaidegrails.chartdatagenerator.factories.ChartFactory
import com.vaidegrails.chartdatagenerator.factories.impl.LineChartFactory
import com.vaidegrails.chartdatagenerator.factories.impl.PieChartFactory

class BootStrap {

    ArrayList<ChartFactory> factories = [new LineChartFactory(), new PieChartFactory()]

    def init = { servletContext ->
        factoriesRegister()
    }

    void factoriesRegister() {
        def chartEngine = ChartEngine.instance

        factories.each { ChartFactory factory ->
            chartEngine.registerFactory(factory)
        }
    }
    def destroy = {
    }
}

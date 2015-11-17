import com.vaidegrails.chartdatagenerator.charts.impl.LineChart
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

        ChartFactory factory = chartEngine.findFactory(LineChart.class)
        println factory.createChart({})
    }
    def destroy = {
    }
}

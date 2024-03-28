package WeatherMonitoringSystem.DecoratorSystem.Decorators;

import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;

public class TemperatureUnitsDecorator extends WeatherDecoratorAbstract {

    public TemperatureUnitsDecorator(IWeatherSystemInterface weatherSystemInterface) {
        super(weatherSystemInterface);
    }

    @Override
    public String getInformation() {
        return null;
    }
}

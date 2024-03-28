package WeatherMonitoringSystem.DecoratorSystem.absrtact;

import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;

public abstract class WeatherDecoratorAbstract implements IWeatherSystemInterface {

    private IWeatherSystemInterface weatherSystemInterface;
    public WeatherDecoratorAbstract(IWeatherSystemInterface weatherSystemInterface) {
        this.weatherSystemInterface = weatherSystemInterface;
    }

    public IWeatherSystemInterface getDecorator() {
        return weatherSystemInterface;
    }


}

package WeatherMonitoringSystem.DecoratorSystem.Decorators;

import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;

public class WindSpeedDecorator extends WeatherDecoratorAbstract {
    public  WindSpeedDecorator(IWeatherSystemInterface weatherSystemInterface){

        super(weatherSystemInterface);
    }
    @Override
    public String getInformation() {
        return null;
    }

}

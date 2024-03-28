package WeatherMonitoringSystem.DecoratorSystem.Decorators;
import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;

public class PrecipitationDecorator extends WeatherDecoratorAbstract {
    public  PrecipitationDecorator(IWeatherSystemInterface weatherSystemInterface){
        super(weatherSystemInterface);
    }
    @Override
    public String getInformation() {

        return  "PrecipitationDecorator info  + " + getDecorator().getInformation();
    }
}

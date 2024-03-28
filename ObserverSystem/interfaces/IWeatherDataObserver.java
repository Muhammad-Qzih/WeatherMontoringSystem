package WeatherMonitoringSystem.ObserverSystem.interfaces;

import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;

public interface IWeatherDataObserver extends IWeatherSystemInterface {
    void update(String wind, double temperature, double humidity);
}

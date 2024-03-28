package WeatherMonitoringSystem.ObserverSystem.interfaces;

public interface IWeatherDataSubject {
    void notifyAllObservers();
    void register(IWeatherDataObserver observer);

    void remove(IWeatherDataObserver observer);
}

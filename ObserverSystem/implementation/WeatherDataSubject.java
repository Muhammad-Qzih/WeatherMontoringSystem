package WeatherMonitoringSystem.ObserverSystem.implementation;

import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataSubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements IWeatherDataSubject {
    List<IWeatherDataObserver> observers = null;
    private String wind;
    private double temperature;
    private double humidity;

    public WeatherDataSubject() {
        this.observers = new ArrayList<>();
    }

    public WeatherDataSubject(double temperature, double humidity, String wind) {
        this.wind = wind;
        this.temperature = temperature;
        this.humidity = humidity;
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyAllObservers() {
        for (IWeatherDataObserver observer : this.observers)
             observer.update(this.wind,
                    this.temperature,
                    this.humidity);
    }

    @Override
    public void register(IWeatherDataObserver observer) {
        // validations
        observers.add(observer);
    }

    @Override
    public void remove(IWeatherDataObserver observer) {
        // validations
        observers.remove(observer);
    }

    public void setWind(String wind) {
        this.wind = wind;
        notifyAllObservers();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public String getWind() {
        return wind;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

}



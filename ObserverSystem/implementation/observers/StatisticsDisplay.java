package WeatherMonitoringSystem.ObserverSystem.implementation.observers;

import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;

public class StatisticsDisplay implements IWeatherDataObserver {
    private String wind;
    private double temperature;
    private double humidity;

    @Override
    public void update(String wind, double temperature, double humidity) {
        this.setWind(wind);
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        System.out.println("Data updated!, StatisticsDisplay: ");

        // this.getInformation();

    }

    @Override
    public String getInformation() {
        return "info StatisticsDisplay ";
    }
    private void setWind(String wind) {
        this.wind = wind;
    }

    private void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
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

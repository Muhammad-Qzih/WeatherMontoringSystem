package WeatherMonitoringSystem;


import WeatherMonitoringSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.PrecipitationDecorator;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.TemperatureUnitsDecorator;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.WindSpeedDecorator;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;
import WeatherMonitoringSystem.ObserverSystem.implementation.WeatherDataSubject;
import WeatherMonitoringSystem.ObserverSystem.implementation.observers.CurrentConditionsDisplay;
import WeatherMonitoringSystem.ObserverSystem.implementation.observers.StatisticsDisplay;


public class Main {
    public static void main(String[] args) {
//        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
//
//        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
//
//        weatherDataSubject.register(currentConditionsDisplay);
//        weatherDataSubject.register(statisticsDisplay);
//
//        weatherDataSubject.setTemperature(55);
//
//        System.out.println(currentConditionsDisplay.getTemperature());
//        System.out.println(statisticsDisplay.getTemperature());
//
//
//        weatherDataSubject.setWind("12km");
//
//        System.out.println(currentConditionsDisplay.getWind());
//        System.out.println(statisticsDisplay.getWind());
//
//        weatherDataSubject.setHumidity(100);
//
//        System.out.println(currentConditionsDisplay.getHumidity());
//        System.out.println(statisticsDisplay.getHumidity());



        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        weatherDataSubject.register(currentConditionsDisplay);
        weatherDataSubject.register(statisticsDisplay);

        weatherDataSubject.setTemperature(55);


        IWeatherSystemInterface system = new PrecipitationDecorator(new StatisticsDisplay());
        System.out.println(system.getInformation());

        system = new PrecipitationDecorator(new StatisticsDisplay());
        System.out.println(system.getInformation());
    }
}

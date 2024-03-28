package WeatherMonitoringSystem.ObserverSystem;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;
import java.util.List;

public class Validator {
    public static boolean isNull(IWeatherDataObserver object) {
        return object == null;
    }

    public static boolean observerIsExist(List<IWeatherDataObserver> weatherDataObservers, IWeatherDataObserver observer) {
        return weatherDataObservers.contains(observer);
    }

    public static boolean userCanBeAdded(List<IWeatherDataObserver> weatherDataObservers, IWeatherDataObserver observer) {
        if (Validator.isNull(observer)) {
            // print is null
            return false;
        }
        if (Validator.observerIsExist(weatherDataObservers, observer)) {
            System.out.println("observer is already exist!");
            return false;
        }
        return true;
    }
}

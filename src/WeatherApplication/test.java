package WeatherApplication;

import WeatherApplication.Observer.CurrentConditionsDisplay;
import WeatherApplication.Observer.ForecastDisplay;
import WeatherApplication.Observer.StatisticsDisplay;
import WeatherApplication.Subject.WeatherData;

public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(10,10,10);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(5,5,5);
    }
}

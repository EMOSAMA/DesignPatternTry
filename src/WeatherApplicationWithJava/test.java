package WeatherApplicationWithJava;

public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurement(10,10,10);
        weatherData.setMeasurement(20,10,10);
        weatherData.setMeasurement(30,10,10);
        weatherData.setMeasurement(40,10,10);
    }
}

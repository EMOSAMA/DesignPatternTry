package WeatherApplicationWithJava;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
    private float currentTemp;
    private float lastTemp;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastTemp = this.currentTemp;
            this.currentTemp = weatherData.getTemp();
            this.display();
        }
    }
    public void display() {
        System.out.println("LastTemp: "+this.lastTemp+" CurrentTemp: "+this.currentTemp);
    }
}

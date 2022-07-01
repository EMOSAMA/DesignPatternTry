package WeatherApplication.Observer;

import WeatherApplication.Subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject mySubject;

    public ForecastDisplay(Subject subject) {
        this.mySubject = subject;
        this.mySubject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + this.temp + " " + this.humidity + " " + this.pressure);
    }
}

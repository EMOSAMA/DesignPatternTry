package WeatherApplication.Observer;

import WeatherApplication.Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private Subject mySubject;

    public CurrentConditionsDisplay(Subject subject) {
        this.mySubject = subject;
        this.mySubject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + this.temp + " " + this.humidity);
    }
}

package WeatherApplication.Subject;

import WeatherApplication.Observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index >=0 ){
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = (Observer) this.observers.get(i);
            observer.update(this.temp,this.humidity,this.pressure);
        }
    }

    public void measurementChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanged();
    }
}

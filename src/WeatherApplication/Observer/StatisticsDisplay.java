package WeatherApplication.Observer;

import WeatherApplication.Subject.Subject;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement{
    private Subject mySubject;
    private float min;
    private float max;
    private float sum;
    private int count;

    public StatisticsDisplay(Subject subject) {
        this.mySubject = subject;
        this.mySubject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.count+=1;
        this.sum += temp;
        if (this.count == 1) {
            this.min = temp;
            this.max = temp;
        } else {
            if (this.max < temp) {
                this.max = temp;
            }
            if (this.min > temp) {
                this.min = temp;
            }
        }
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Max: " + this.max + " | Min: " + this.min + " | Avg: " + this.sum/this.count);
    }
}

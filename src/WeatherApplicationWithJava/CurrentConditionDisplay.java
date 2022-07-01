/*
    Java自带的Observer接口，同样定义了update方法，只不过传入的参数变了，
    update(Observable o, Object arg)
    数据以Object的形式传入，
    Observable则用于Observer来识别接收到信息来自于哪一个subject。
*/
package WeatherApplicationWithJava;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    private float temp;
    private float humidity;
    private Observable subject;

    public CurrentConditionDisplay(Observable subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }

    public void display() {
        System.out.println("Current Conditions: " + this.temp + " " + this.humidity);
    }
}

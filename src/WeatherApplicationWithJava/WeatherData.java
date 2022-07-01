/*
    Observable类，自带的方法有:
        addObservable(observer),
        deleteObservable(observer),
        notifyObservers(),
        notifyObservers(Object obj),
        setChanged()
    Observable类是一个已经具体实现的superclass，我们在构建自己的类是需要直接继承他
    这给我们带了便利的同时，也减小了代码的可复用性，因为其违背了我们：
        1. 针对接口编程，而不是实现编程
        2. 多用组合
    的OO设计原则。
*/
package WeatherApplicationWithJava;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementChanged() {
        this.setChanged();
        // 里面没有数据对象，表示我们的设计方法是“拉”
        // 即我们通知observer数据改变了，然后observer自己决定拉去什么数据。
        this.notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        this.measurementChanged();
    }

    // Getter Methods
    public float getTemp() {
        return this.temp;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

}

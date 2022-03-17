package cha2;
import java.util.ArrayList;
import cha2.myinterface.*;

/**
 * 实现了 Subject 的受观察者
 * 该类的成员变量如下
 * temperature、humidity、pressure 三个被观察的数据
 * observers 存放 Observer对象 的数组
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // 构造函数将观察者存放在一个 ArrayList 中
    public WeatherData(){
        observers = new ArrayList<>();
    }

    // 获取到一个新 Observer 的引用
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    // 删除了一个 Observer 的引用
    @Override
    public void removeObserver(Observer observer){
        if(observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    /**
     * 将新消息推送给所有的 Observer 对象
     * 因为有 Observer 对象的引用，所以可以将 消息 通过函数调用的方式，赋值给 Observer 对象
     */
    @Override
    public void notifyObserver(){
        for(Observer obs : this.observers){
            obs.update(this.temperature, this.humidity, this.pressure);
        }
    }


    public void measurementsChanged(){
        this.notifyObserver();
    }

    /**
     * 数据更改的方法，测试观察者模式
     * 在数据更改后，立刻通知所有的观察者
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

package cha2;
import java.util.ArrayList;

import cha2.myinterface.*;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // 构造函数将观察者存放在一个 ArrayList 中
    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        if(observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(Observer obs : this.observers){
            obs.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged(){
        this.notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}

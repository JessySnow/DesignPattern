package cha2.weatherboard;

import cha2.myinterface.DisplayElement;
import cha2.myinterface.Observer;
import cha2.myinterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display(){
        System.out.println("Current condations: " + temperature + " F degrees and " +  
        " humidity " + humidity + "% humidity");
    }
}

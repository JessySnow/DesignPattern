package cha2;

import cha2.weatherboard.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();    
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 65.4f, 30.4f);
        weatherData.setMeasurements(80, 65.9f, 30.4f);
        weatherData.setMeasurements(81, 65, 30.4f);
    }
}

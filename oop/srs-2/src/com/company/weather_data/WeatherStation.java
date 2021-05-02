package com.company.weather_data;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(22, 70, 29.2f);
        weatherData.setMeasurements(15, 90, 29.2f);
    }
}

package com.company.weather_data;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}

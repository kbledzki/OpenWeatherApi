package com.java.weather.service;

import com.java.weather.model.Weather;
import com.java.weather.webclient.WeatherClient;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final WeatherClient weatherClient;
    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public Weather getWeather(String city){
        return weatherClient.getWeatherForCity(city);
    }
}

package com.java.weather.controller;

import com.java.weather.model.Weather;
import com.java.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestWeatherController {
    private final WeatherService weatherService;

    public RestWeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/weather/{city}")
    public Weather getWeather(String city){
        return weatherService.getWeather(city);
    }
}

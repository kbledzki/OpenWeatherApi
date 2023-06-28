package com.java.weather.controller;

import com.java.weather.model.Weather;
import com.java.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/weather")
    public Weather getWeather(){
        return weatherService.getWeather(52.2319581,21.0067249);
    }
}

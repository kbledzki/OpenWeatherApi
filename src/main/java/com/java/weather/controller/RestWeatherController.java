package com.java.weather.controller;

import com.java.weather.model.Weather;
import com.java.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWeatherController {
    private final WeatherService weatherService;

    public RestWeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("api/v1/weather/{city}")
    public Weather getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}

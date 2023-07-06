package com.java.weather.controller;

import com.java.weather.model.Weather;
import com.java.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city, Model model) {
        Weather weather = weatherService.getWeather(city);
        model.addAttribute("places", weather);
        return "places";
    }
}

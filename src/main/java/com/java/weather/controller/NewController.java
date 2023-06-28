package com.java.weather.controller;

import com.java.weather.model.Weather;
import com.java.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class NewController {

    private final WeatherService weatherService;

    public NewController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/we/lat{lat}/lon{lon")
    public String getWeather(@PathVariable double lat, @PathVariable double lon,  Model model) {

        Weather weather = weatherService.getWeather(lat, lon);

        model.addAttribute("places", weather);

        return "places";


    }

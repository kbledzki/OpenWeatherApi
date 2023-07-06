package com.java.weather.webclient.weather.dto;

import lombok.*;

@Getter
public class OpenWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWeatherDto [] weather;
    private OpenWeatherWindDto wind;
    private long id;
    private String name;
}

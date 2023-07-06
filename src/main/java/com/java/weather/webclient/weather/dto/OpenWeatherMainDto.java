package com.java.weather.webclient.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeatherMainDto {
    private int temp;
    private int pressure;
    private int humidity;
}

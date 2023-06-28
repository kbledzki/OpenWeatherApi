package com.java.weather.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Weather {
    private float temperature;
    private int pressure;
    private int humidity;
    private float windSpeed;
}

package com.java.weather.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeatherDto {
    private float temp;
    private int pressure;
    private int humidity;
}

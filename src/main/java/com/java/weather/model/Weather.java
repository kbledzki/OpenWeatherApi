package com.java.weather.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private float temp;
    private int pressure;
    private int humidity;
}

package com.java.weather.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    @Value("${WEATHER_URL}")
    private String WEATHER_URL;
    @Value("${weatherClient.API_KEY}")
    public String API_KEY;
    private RestTemplate restTemplate = new RestTemplate();
    public Weather getWeatherForCity(double lat, double lon){
        Weather response = restTemplate.getForObject(WEATHER_URL + "weather?lat={lat}&lon={lon}&appid={apiKey}&units=metric&lang=pl",
                Weather.class,
                lat, lon,
                API_KEY);
        return response;
    }

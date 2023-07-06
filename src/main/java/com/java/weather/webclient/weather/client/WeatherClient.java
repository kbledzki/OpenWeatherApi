package com.java.weather.webclient.weather.client;

import com.java.weather.model.Weather;
import com.java.weather.webclient.weather.dto.OpenWeatherDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class WeatherClient {
    @Value("${WEATHER_URL}")
    private String WEATHER_URL;
    @Value("${weatherClient.API_KEY}")
    public String API_KEY;
    private final RestTemplate restTemplate = new RestTemplate();
    public Weather getWeatherForCity(String city) {
        OpenWeatherDto response = restTemplate.getForObject(WEATHER_URL + "weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                OpenWeatherDto.class,
                city,
                API_KEY);
        return Weather.builder()
                .name(response.getName())
                .id(response.getId())
                .speed(response.getWind().getSpeed())
                .temp(response.getMain().getTemp())
                .pressure(response.getMain().getPressure())
                .humidity(response.getMain().getHumidity())
                .icon(Arrays.stream(response.getWeather()).toList().get(0).getIcon())
                .description(Arrays.stream(response.getWeather()).toList().get(0).getDescription())
                .build();
    }
}

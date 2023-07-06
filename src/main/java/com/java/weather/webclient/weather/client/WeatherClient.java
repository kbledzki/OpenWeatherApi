package com.java.weather.webclient.weather.client;

import com.java.weather.webclient.weather.dto.OpenWeatherMainDto;
import com.java.weather.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    @Value("${WEATHER_URL}")
    private String WEATHER_URL;
    @Value("${weatherClient.API_KEY}")
    public String API_KEY;
    private final RestTemplate restTemplate = new RestTemplate();

    public Weather getWeatherForCity(double lat, double lon) {
        OpenWeatherMainDto response = restTemplate.getForObject(WEATHER_URL + "weather?lat={lat}&lon={lon}&appid={apiKey}&units=metric&lang=pl",
                OpenWeatherMainDto.class,
                lat, lon,
                API_KEY);
        return Weather.builder()
                .id(response.getId())
                .temp(response.getMain().getTemp())
                .pressure(response.getMain().getPressure())
                .humidity(response.getMain().getHumidity())
                .build();
    }
}

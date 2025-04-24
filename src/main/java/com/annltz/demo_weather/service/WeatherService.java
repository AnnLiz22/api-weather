package com.annltz.demo_weather.service;

import com.annltz.demo_weather.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

  @Value("${weather.api.key}")
  private String apiKey ;

  private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

  private final RestTemplate restTemplate = new RestTemplate();

  public Weather getWeatherByCity(String city){
    String url = BASE_URL + "?q=" + city + "&appid=" + apiKey + "&units=metric";
    ResponseEntity<Weather> weatherResponse = restTemplate.getForEntity(url, Weather.class);
    return weatherResponse.getBody();
  }
}

package com.annltz.demo_weather.controller;

import com.annltz.demo_weather.model.Weather;
import com.annltz.demo_weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

  @Autowired
  WeatherService weatherService;

  @GetMapping
  public Weather getWeather(@RequestParam String city){
    return weatherService.getWeatherByCity(city);
  }

}

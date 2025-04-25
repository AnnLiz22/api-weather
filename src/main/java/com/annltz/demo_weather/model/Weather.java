package com.annltz.demo_weather.model;

import lombok.Data;

@Data
public class Weather {
  private Main main;
  private String name;

  @Data
  public static class Main {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int humidity;

  }
}

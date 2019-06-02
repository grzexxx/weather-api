package com.gjahn.weatherapi;

import lombok.Data;

import java.util.List;

@Data
public class WeatherModel {

    private WeatherMain main;
    private WeatherClouds clouds;
    private List<WeatherObject> weather;

    @Data
    public static class WeatherObject {
        private String main;
    }

    @Data
    public static class WeatherClouds {
        private int all;
    }

    @Data
    public static class WeatherMain {

        private double temp;
        private int pressure;
        private int humidity;
    }
}

package com.gjahn.weatherapi;

import lombok.Data;

@Data
public class WeatherModel {

    private WeatherMain main;

    @Data
    public static class WeatherMain {

        private double temp;

    }
}

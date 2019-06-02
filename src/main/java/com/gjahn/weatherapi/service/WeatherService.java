package com.gjahn.weatherapi.service;

import com.gjahn.weatherapi.WeatherModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public WeatherModel getWeather(String city) {
        return getRestTemplate().getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + city + ",pl&appid=73d81deeae46c33e1838a04ba2f8f473", WeatherModel.class);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }
}

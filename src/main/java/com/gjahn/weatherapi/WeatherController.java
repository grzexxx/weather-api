package com.gjahn.weatherapi;

import com.gjahn.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String index() {
        return "main";
    }

    @PostMapping("/")
    public String index(Model model, @RequestParam("city") String city) {
        model.addAttribute("weather", weatherService.getWeather(city));
        System.out.println(city);
        return "main";
    }
}

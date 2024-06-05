package com.example.ms.ingress.spring.controller;

import com.example.ms.ingress.spring.service.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    private final Car car;

    public CarController(Car car) {
        this.car = car;
    }

    @GetMapping("/drive")
    public String driveCar() {
        return car.toString();
    }
}

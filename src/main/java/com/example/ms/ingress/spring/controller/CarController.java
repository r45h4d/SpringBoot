package com.example.ms.ingress.spring.controller;

import com.example.ms.ingress.spring.service.Car;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
@Controller
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CarController {
    Car car;
    public void driveCar() {
        System.out.println(car.toString());
    }
}

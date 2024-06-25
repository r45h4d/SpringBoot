package com.example.ms.ingress.spring.service;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@ToString
@AllArgsConstructor
public class Car {
    private final Engine engine;
    private final Seat seat;
    private final Tire tire;
}

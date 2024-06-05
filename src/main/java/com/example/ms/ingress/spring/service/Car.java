package com.example.ms.ingress.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {
    private final Engine engine;
    private final Seat seat;
    private final Tire tire;

    @Autowired
    public Car(Engine engine, Seat seat, Tire tire) {
        this.engine = engine;
        this.seat = seat;
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", seat=" + seat +
                ", tire=" + tire +
                '}';
    }
}

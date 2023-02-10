package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarStore {
    private List<Car> _carsDb = Arrays
    .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault"));

    public Car getCar(String id) {
        for (Car car : _carsDb) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getCars() {
        return _carsDb;
    }
}

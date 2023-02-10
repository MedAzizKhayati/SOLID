package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarManager {
    private CarStore _carDAO;

    public CarManager(CarStore carDAO) {
        _carDAO = carDAO;
    }

    public Car getCar(final String id) {
        return _carDAO.getCar(id);
    }

    public List<Car> getAllCars() {
        return _carDAO.getCars();
    }

    public String getCarNames() {
        return _carDAO.getCars()
                .stream()
                .map(Car::getFullName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }

    public Car getBestCar() {
        return _carDAO.getCars()
                .stream()
                .max(Car::compareTo)
                .orElse(null);
    }
}

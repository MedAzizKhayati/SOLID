package com.directi.training.srp.exercise_refactored;

public class Test {

    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        CarManager carManager = new CarManager(carStore);
        System.out.println(carManager.getCarNames());
        System.out.println(carManager.getBestCar().getFullName());
    }
}

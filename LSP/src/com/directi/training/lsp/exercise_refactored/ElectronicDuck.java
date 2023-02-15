package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck {
    private boolean _on = false;

    public void quack() {
        if (!_on) {
            turnOn();
        }
        System.out.println("Electronic duck quack...");
    }

    public void swim() {
        if (!_on) {
            turnOn();
        }
        System.out.println("Electronic duck swim...");
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}

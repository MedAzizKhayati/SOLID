package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck {
    private boolean _on = false;

    @Override
    public void quack() {
        if (isOn()) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim() {
        if (isOn()) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

    @Override
    public boolean isOn() {
        return _on;
    }
}

package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements Quackable, Swimmable, IOnOffDevice {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    @Override
    public void turnOn() {
        _on = true;
    }

    @Override
    public void turnOff() {
        _on = false;
    }

    @Override
    public boolean isOn() {
        return _on;
    }
}

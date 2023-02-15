package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void turnOn(IOnOffDevice... devices) {
        for (IOnOffDevice device : devices) {
            if (!device.isOn()) {
                device.turnOn();
            }
        }
    }

    private void swim(Swimmable... swimmables) {
        for (Swimmable swimmable : swimmables) {
            if (swimmable instanceof IOnOffDevice) {
                turnOn((IOnOffDevice) swimmable);
            }
            swimmable.swim();
        }
    }

    private void quack(Quackable... quackables) {
        for (Quackable quackable : quackables) {
            if (quackable instanceof IOnOffDevice) {
                turnOn((IOnOffDevice) quackable);
            }
            quackable.quack();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}

package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            if (duck.isOn()) {
                duck.quack();
            } else {
                System.out.println("Duck is off, can't quack");
            }
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            if (duck.isOn()) {
                duck.swim();
            } else {
                System.out.println("Duck is off, can't swim");
            }
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}

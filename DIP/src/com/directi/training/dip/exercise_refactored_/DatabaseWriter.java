package com.directi.training.dip.exercise_refactored_;
import java.util.HashMap;
import java.util.Map;

public class DatabaseWriter implements Writer {
    private static Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    @Override
    public void write(String input) {
        data.put(++count, input);
    }
}

package com.directi.training.dip.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    public int write(String inputString) {
        _data.put(++_count, inputString);
        return _count;
    }

    public void print() {
        for (Map.Entry<Integer, String> entry : _data.entrySet()) {
            System.out.println(
                    String.format("%d : %s...",
                            entry.getKey(),
                            entry.getValue().substring(0, 40)));
        }
    }
}

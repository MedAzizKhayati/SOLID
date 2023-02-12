package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class Base64Encoder implements Encoder {
    @Override
    public String encode(String line) {
        return Base64.getEncoder().encodeToString(line.getBytes());
    }
}

package com.directi.training.dip.exercise_refactored_;

import java.util.Base64;

public class Base64Encoder implements Encoder {
        @Override
        public String encode(String input) {
            return Base64.getEncoder().encodeToString(input.getBytes());
        }
    }
      


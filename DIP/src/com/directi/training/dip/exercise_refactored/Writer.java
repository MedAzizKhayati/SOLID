package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

interface Writer {
    void write(String encodedLine) throws IOException;
}

package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.IOException;

class FileWriter implements Writer {
    private final String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String encodedLine) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(filePath));
            writer.append(encodedLine);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}

package com.directi.training.dip.exercise_refactored_;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter  implements Writer{
    private String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }
                                                               
    @Override
    public void write(String input) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.append(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

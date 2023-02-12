package com.directi.training.dip.exercise_refactored_;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader implements Reader {
    
    private String _fileName;
    
    public FileReader(String fileName) {
        _fileName = fileName;
    }
    
    public String read() {
        // read from file
        StringBuilder inputStringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(_fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                inputStringBuilder.append(line);
            }
        } catch (IOException e) {
            // handle the exception
        }
        return inputStringBuilder.toString();
    }
    
}

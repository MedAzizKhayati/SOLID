package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.IOException;

class FileReader implements Reader {
    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new java.io.FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                sb.append(aLine);
            }
            return sb.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
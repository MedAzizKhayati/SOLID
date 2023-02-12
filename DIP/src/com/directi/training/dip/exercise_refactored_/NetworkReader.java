package com.directi.training.dip.exercise_refactored_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader  implements Reader{
    
    private String _url;
    
    public NetworkReader(String url) {
        _url = url;
    }
    
    public String read() {
        // read from network
        StringBuilder inputStringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(_url).openStream()))) {
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

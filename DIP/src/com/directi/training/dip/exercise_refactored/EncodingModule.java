package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModule {
    private Encoder _encoder;
    
    public EncodingModule(Encoder encoder) {
        _encoder = encoder;
    }

    public void encode(Reader reader, Writer writer) throws IOException {
        String resultString = reader.read();
        String encodedLine = _encoder.encode(resultString);
        writer.write(encodedLine);
    }
}
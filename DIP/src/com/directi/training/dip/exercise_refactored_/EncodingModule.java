package com.directi.training.dip.exercise_refactored_;

public class EncodingModule {
    private Encoder encoder;
    private Reader reader;
    private Writer writer;

    public EncodingModule(Encoder encoder, Reader reader, Writer writer) {
        this.encoder = encoder;
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() {
        String input = reader.read();
        String encoded = encoder.encode(input);
        writer.write(encoded);
    }
}

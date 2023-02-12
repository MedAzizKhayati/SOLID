package com.directi.training.dip.exercise_refactored_;
public class EncodingModuleClient {
    public static void main(String[] args) {
        Encoder base64Encoder = new Base64Encoder();
        Reader reader = new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        Writer writer = new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");

        String inputString = reader.read();
        String encodedString = base64Encoder.encode(inputString);
        writer.write( encodedString);

        inputString = reader.read();
        encodedString = base64Encoder.encode(inputString);
        writer.write(encodedString);
    }
}

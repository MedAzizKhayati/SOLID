package com.directi.training.dip.exercise_refactored;

import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        EncodingModule encodingModule = new EncodingModule(new Base64Encoder());
        MyDatabase myDatabase = new MyDatabase();

        encodingModule.encode(
                new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/input.txt"),
                new FileWriter("DIP/src/com/directi/training/dip/exercise_refactored/output.txt"));

        encodingModule.encode(
                new NetworkReader(new URL("https", "google.com", "/index.html")),
                new DatabaseWriter(myDatabase));

        encodingModule.encode(
                new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/input.txt"),
                new DatabaseWriter(myDatabase));

        myDatabase.print();
    }
}

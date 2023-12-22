package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Input.txt");
            List<String> input = Files.readAllLines(file.toPath());
            System.out.println(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
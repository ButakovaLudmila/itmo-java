package ru.itmo.java.basics.lab10.task1;

import java.io.*;

public class ReadFile {
    final String PATH = "files/text.txt";

    public void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadFile file = new ReadFile();
        file.readFile();
    }

}


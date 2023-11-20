package ru.itmo.java.basics.lab10.task2;

import java.io.*;

public class AddString {
    final String PATH = "files/text2.txt";
    public static String newString = "Ква-ква";

    public void addString(String newString) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(PATH, true));
            writer.append('\n');
            writer.append(newString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        AddString addString = new AddString();
        addString.addString(newString);
    }
}

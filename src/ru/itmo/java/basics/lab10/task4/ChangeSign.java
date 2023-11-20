package ru.itmo.java.basics.lab10.task4;

import java.io.*;

public class ChangeSign {
    File cf = new File("files/text4.txt");


    public void printThis() {
        try {
            FileReader fr = new FileReader(cf);
            String s;
            String str = "";
            char symbol = 'S';
            try (BufferedReader br = new BufferedReader(fr)) {
                while ((s = br.readLine()) != null) {
                    str += s;
                }
                str = str.replaceAll("[^a-zA-Z ]", String.valueOf(symbol));
                FileWriter fw = new FileWriter(cf);
                fw.write(str);
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChangeSign tr = new ChangeSign();
        tr.printThis();
    }
}  
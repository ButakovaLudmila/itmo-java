package ru.itmo.java.basics.lab5.task5;

public class Reverse {
    public String str;

    {
        str = "This is a test string";
    }

    public void isReverse() {
        String str1="";
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            StringBuffer buffer = new StringBuffer(parts[i]);
            str1 = str1.concat(buffer.reverse() + " ");
        }
        System.out.println("Исходная строка: " + str);
        System.out.println("Перевернутые слова в строке: " + str1);
    }
    public static void main(String[] args) {
        Reverse res = new Reverse();
        res.isReverse();
    }
}

package ru.itmo.java.basics.lab5.task4;

public class Substring {
    public String str;
    public String substring;

    {
        str = "мама мылом мыла раму, мама мыла раму мылом, мама устала";
        substring = "мама";
    }

    public void inSubstring() {
        System.out.println(str);
        System.out.println("Количество вхождений в строку слова: " + substring + " = " + ((str + "\0").split(substring).length - 1));
    }

    public static void main(String[] args) {
        Substring res = new Substring();
        res.inSubstring();
    }
}
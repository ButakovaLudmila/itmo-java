package ru.itmo.java.basics.lab5.task2;

public class Palindrom {
    public String str;

    {
        str = "абоба";
    }

    public void isPalindrom() {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data = buffer.toString();
        if (str.equals(data)) {
            System.out.println(str + " - это слово палиндром");
        } else {
            System.out.println(str + " - это слово не палиндром");
        }

    }


    public static void main(String[] args) {
        Palindrom res = new Palindrom();
        res.isPalindrom();
    }
}

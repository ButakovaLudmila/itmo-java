package ru.itmo.java.basics.lab5.task3;

public class Censorship {
    public String str;

    {
        str = "Манная каша - это бяка, такая бяка, что все дети говорят: бяка";
    }

    public void isCensorship() {
        System.out.println(str.replace("бяка", "[вырезано цензурой]"));
    }

    public static void main(String[] args) {
        Censorship res = new Censorship();
        res.isCensorship();
    }
}

package ru.itmo.java.basics.lab3.task4;

public class Tree {
    private String title;
    private Double age;
    private Boolean isLife;

    public Tree(String title, Double age) {
        this.title = title;
        this.age = age;
    }

    public Tree(String title, Double age, Boolean isLife) {
        this.title = title;
        this.age = age;
        this.isLife = isLife;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }


}

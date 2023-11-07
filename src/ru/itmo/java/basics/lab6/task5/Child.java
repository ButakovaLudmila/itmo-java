package ru.itmo.java.basics.lab6.task5;

public class Child extends Parent {
    public static String name;

    public Child() {
        name = setName();
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + name);
    }
}

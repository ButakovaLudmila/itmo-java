package ru.itmo.java.basics.lab6.task5;

import java.util.Scanner;

public class Parent {
    public int age;

    public Parent() {
    }

    public String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        return scanner.next();
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println("Возраст: " + age);
    }
}

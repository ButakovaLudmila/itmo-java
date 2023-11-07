package ru.itmo.java.basics.lab6.task4;

import java.util.Scanner;

public class Parent {
    protected Integer a;

    public void setA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        a = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println(a);
    }

    ;
}

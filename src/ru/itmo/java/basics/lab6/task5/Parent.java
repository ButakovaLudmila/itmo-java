package ru.itmo.java.basics.lab6.task5;

import java.util.Scanner;

public class Parent {
    public String name;
    public int age;
    public void setName(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите Имя: ");
        name=scanner.next();
    }
    public void setAge(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age=scanner.nextInt();
    }
    public void printInfo(){
        System.out.println("Имя: " + name
                + ", Возраст: " + age);
    };
}

package ru.itmo.java.basics.lab6.task5;

public class Main {
    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();
        parent.setAge();
        child.printInfo();
        parent.printInfo();
    }
}

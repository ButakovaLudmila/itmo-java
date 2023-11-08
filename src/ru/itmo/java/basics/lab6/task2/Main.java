package ru.itmo.java.basics.lab6.task2;

public class Main {
    public static void main(String[] args) {
        PrintInterface client=new Client("Иван", "Иванов");
        PrintInterface bankEmployee=new BankEmployee("Петр", "Петров");
        client.printInfo();
        bankEmployee.printInfo();
    }
}

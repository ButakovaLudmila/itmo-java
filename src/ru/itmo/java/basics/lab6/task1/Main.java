package ru.itmo.java.basics.lab6.task1;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Иван", "Иванов", "СБОЛ");
        Human bankEmployee = new BankEmployee("Петр", "Петров", "Абсолют Банк");
        client.printInfo();
        bankEmployee.printInfo();
    }
}

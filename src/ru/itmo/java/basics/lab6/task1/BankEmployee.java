package ru.itmo.java.basics.lab6.task1;

public class BankEmployee extends Human {
    public String bankTitle;

    public BankEmployee(String firstName, String lastName, String bankTitle) {
        super(firstName, lastName);
        this.bankTitle = bankTitle;
    }

    @Override
    void printInfo() {
        System.out.println("Работник банка: " + "Имя: " + getFirstName()
                + ", Фамилия: " + getLastName()
                + ", Название банка: " + bankTitle);

    }
}

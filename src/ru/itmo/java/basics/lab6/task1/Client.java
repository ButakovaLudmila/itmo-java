package ru.itmo.java.basics.lab6.task1;

public class Client extends Human {
    public String bankTitle;

    public Client(String firstName, String lastName, String bankTitle) {
        super(firstName, lastName);
        this.bankTitle = bankTitle;
    }
    @Override
    void printInfo() {
        System.out.println("Клиент: " + "Имя: " + getFirstName()
                + ", Фамилия: " + getLastName()
                + ", Название банка: " + bankTitle);

    }
}

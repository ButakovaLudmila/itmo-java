package ru.itmo.java.basics.lab6.task2;

public class Client extends Human {
    public String bankTitle;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.bankTitle = titleBank();
    }

    @Override
    public String titleBank() {
        return BANK;
    }

    @Override
    public void printInfo() {
        System.out.println("Клиент: " + "Имя: " + getFirstName()
                + ", Фамилия: " + getLastName()
                + ", Название банка: " + bankTitle);

    }
}

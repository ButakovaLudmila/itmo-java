package ru.itmo.java.basics.lab6.task2;

public interface PrintInterface {
    // идея интерфейса в выносе метода вывода информации и в простановке константного значения названия банка
    public static final String BANK = "СБОЛ";

    String titleBank();

    public abstract void printInfo();
}

package ru.itmo.java.basics.lab6.task3;

import java.util.Scanner;

public class Truck extends Car {
    public int quWheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int quWheels, int maxWeight) {
        super(w, m, c, s);
        this.quWheels = quWheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колес: " + quWheels);
    }

    public void newWheels() {
        System.out.print("Измените количество колес: ");
        Scanner scanner = new Scanner(System.in);
        quWheels = scanner.nextInt();
        outPut();
    }
}

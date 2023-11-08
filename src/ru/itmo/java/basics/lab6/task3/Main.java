package ru.itmo.java.basics.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck(1000, "SCANIA", 'B', 120, 6, 20000);
        truck.outPut();
        ((Truck) truck).newWheels();
    }
}

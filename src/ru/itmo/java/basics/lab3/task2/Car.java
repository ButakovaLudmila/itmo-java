package ru.itmo.java.basics.lab3.task2;

public class Car {
    private String modelBrand;
    private Double weight;
    private Color color;

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Название: " + modelBrand +
                ", Вес: " + weight +
                ", Цвет: " + color;
    }

    public Car(String modelBrand, Double weight, Color color) {
        this.modelBrand = modelBrand;
        this.weight = weight;
        this.color = color;
    }

    public void setModelBrand(String modelBrand) {
        this.modelBrand = modelBrand;
    }

    public String printCar() {
        return toString();
    }

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

}

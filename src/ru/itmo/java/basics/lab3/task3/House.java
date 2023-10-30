package ru.itmo.java.basics.lab3.task3;

import java.util.Calendar;

public class House {
    private String title;
    private Integer quantityFloors;
    private int buildYear;

    @Override
    public String toString() {
        return "Дом: " +
                "Название: " + title +
                ", Количество этажей: " + quantityFloors +
                ", Год постройки: " + buildYear;
    }

    //метод установки значений
    void setHouse(String t, Integer q, int b) {
        this.title = t;
        this.quantityFloors = q;
        this.buildYear = b;
    }

    //метод вывода значений
    String printHouse() {
        return toString() + ", Количество лет с момента постройки: " + resultYear();
    }

    //метод расчета лет с момента постройки
    int resultYear() {
        int currentYear;
        Calendar calendar = Calendar.getInstance();
        currentYear = calendar.get(Calendar.YEAR);
        return (currentYear - this.buildYear);
    }


}



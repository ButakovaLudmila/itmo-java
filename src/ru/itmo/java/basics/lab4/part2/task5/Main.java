package ru.itmo.java.basics.lab4.part2.task5;


import static ru.itmo.java.basics.lab4.part2.task5.SortArray.intArray;

public class Main {
    public static void main(String[] args) {
        SortArray.setIntArray();
        SortArray.printArray1();
        SortArray.sortArray(0, intArray.length - 1);
        SortArray.printArray2();
    }
}

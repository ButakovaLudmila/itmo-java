package ru.itmo.java.basics.lab4.part2.task1;


import static ru.itmo.java.basics.lab4.part2.task1.SortCheck.intArray1;

public class Main {
    public static void main(String[] args) {
        SortCheck.setIntArray();
        SortCheck.bubbleSort(intArray1);
        SortCheck.printValues();
    }

}

package ru.itmo.java.basics.lab4.part2.task3;


import static ru.itmo.java.basics.lab4.part2.task3.ChangePosition.intArray;

public class Main {
    public static void main(String[] args) {
        ChangePosition.setIntArray();
        ChangePosition.printArray1();
        ChangePosition.changePosition(intArray);
        ChangePosition.printArray2();
    }

}

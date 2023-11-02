package ru.itmo.java.basics.lab4.part2.task3;

import java.util.Arrays;
import java.util.Scanner;

public class ChangePosition {
    static int[] intArray;

    static void setIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();
        intArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            intArray[i] = scanner.nextInt();
        }

    }
    static void changePosition(int[] intArray) {
        for (int i = 0; i < intArray.length; i= intArray.length - 1) {
            for (int j = 0; j < intArray.length; j = intArray.length - 1) {
                if (intArray[i] < intArray[j]) {
                    int aj = intArray[j];
                    int ai = intArray[i];
                    intArray[j] = ai;
                    intArray[i] = aj;
                    break;
                }
            }
            break;
        }
    }
    static void printArray1() {
        System.out.print("Массив 1: " + Arrays.toString(intArray));
        System.out.println();
    }

    static void printArray2() {
        System.out.print("Массив 2: " + Arrays.toString(intArray));
    }
    public static void main(String[] args) {
        ChangePosition.setIntArray();
        ChangePosition.printArray1();
        ChangePosition.changePosition(intArray);
        ChangePosition.printArray2();
    }
}

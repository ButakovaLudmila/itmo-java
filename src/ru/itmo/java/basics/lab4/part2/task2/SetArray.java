package ru.itmo.java.basics.lab4.part2.task2;

import java.util.Arrays;
import java.util.Scanner;

public class SetArray {
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
    static void printValues() {
        System.out.print("Массив: " + Arrays.toString(intArray));

    }
}

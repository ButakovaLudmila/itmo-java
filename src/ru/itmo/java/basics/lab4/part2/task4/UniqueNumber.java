package ru.itmo.java.basics.lab4.part2.task4;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {
    static int[] intArray;
    static boolean t;
    static int unique;

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

    static int findUnique(int[] intArray) {
        outFor:
        for (int i = 0; i < intArray.length; i++) {
            t = false;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    t = true;
                    break;
                }
            }
            while (t) {
                continue outFor;
            }
            unique = intArray[i];
            break;
        }
        return unique;
    }

    static void printValues() {
        System.out.print("Массив: " + Arrays.toString(intArray));
        System.out.println();
        System.out.print("Первое уникальное значение массива: " + findUnique(intArray));
    }
    public static void main(String[] args) {
        UniqueNumber.setIntArray();
        UniqueNumber.printValues();
    }
}

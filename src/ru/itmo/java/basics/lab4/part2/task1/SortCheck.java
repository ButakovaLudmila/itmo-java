package ru.itmo.java.basics.lab4.part2.task1;

import java.util.Arrays;
import java.util.Scanner;

public class SortCheck {
    static int[] intArray1;
    static int[] intArray2;
    static boolean result;

    static void setIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();
        intArray1 = new int[size];
        intArray2 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            intArray1[i] = scanner.nextInt();
            intArray2[i] = intArray1[i];
        }
    }

    public static void bubbleSort(int[] intArray1) {
        for (int i = 0; i < intArray1.length - 1; i++) {
            for (int j = 0; j < intArray1.length - 1 - i; j++) {
                if (intArray1[j] > intArray1[j + 1]) {
                    int aj = intArray1[j];
                    intArray1[j] = intArray1[j + 1];
                    intArray1[j + 1] = aj;
                }
            }
        }
    }

    static boolean checkSort() {
        if (Arrays.equals(intArray1, intArray2)) {
            result = true;
        }
        return result;
    }

    static void printValues() {
        System.out.print("Массив: " + Arrays.toString(intArray2));
        System.out.println();
        if (checkSort()) {
            System.out.print("Массив отсортирован по возрастанию: ОК");
        } else {
            System.out.print("Попробуйте снова отсортировать массив по возрастанию");
        }
    }
}

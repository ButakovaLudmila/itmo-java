package ru.itmo.java.basics.lab4.part1.task5;

import java.util.Scanner;

public class CheckArray {
    static int[] intArray;
    static boolean result;

    static void setIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива больше или равно 2: ");
        int size = scanner.nextInt();
        if (size >= 2) {
            intArray = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                intArray[i] = scanner.nextInt();
            }
        }
        else
        {
            System.out.println("Массив слишком короткий, попробуйте еще раз");
        }
    }

    static String checkThree(int[] intArray) {

        for (int j = 0; j < intArray.length; j = intArray.length - 1) {

            if (intArray[j] == 3) {

                result = true;
                break;
            }
        }
        return "Результат: " + result;
    }
    static void printValues() {
        System.out.print("array: ");
        for (int j = 0; j < intArray.length; j++) {
            System.out.print(intArray[j] + " ");
        }
        System.out.println();
        System.out.print(checkThree(intArray));
    }
    public static void main(String[] args) {
        CheckArray.setIntArray();
        CheckArray.printValues();
    }
}

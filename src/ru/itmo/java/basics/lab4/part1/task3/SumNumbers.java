package ru.itmo.java.basics.lab4.part1.task3;

import java.util.Scanner;

public class SumNumbers {
    static int num1;
    static int num2;
    static int num3;
    static boolean result;

    public static int getNum1() {
        return num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static int getNum3() {
        return num3;
    }

    static void setNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        num3 = scanner.nextInt();
    }

    static int sum() {

        return getNum1() + getNum2();
    }

    static String res() {
        if (sum() == getNum3()) {
            result = true;
        }
        return "Результат: " + result;
    }

    static void printValue() {
        System.out.println(res());
    }

}




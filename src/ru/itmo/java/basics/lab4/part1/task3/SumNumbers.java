package ru.itmo.java.basics.lab4.part1.task3;

import java.util.Scanner;

public class SumNumbers {
    private int num1;
    private int num2;
    private int num3;
    static boolean result;

    public void setNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        num3 = scanner.nextInt();
    }

    public int sum() {

        return num1 + num2;
    }

    public String res() {
        if (sum() == num3) {
            result = true;
        }
        return "Результат: " + result;
    }

    public void printValue() {
        System.out.println(res());
    }

    public static void main(String[] args) {
        SumNumbers sum = new SumNumbers();
        sum.setNumbers();
        sum.printValue();
    }
}




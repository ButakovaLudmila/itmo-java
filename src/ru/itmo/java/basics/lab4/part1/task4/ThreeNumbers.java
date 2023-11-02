package ru.itmo.java.basics.lab4.part1.task4;

import java.util.Scanner;

public class ThreeNumbers {
    public int num1;
    public int num2;
    public int num3;
    public boolean result;

    public void setNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        num3 = scanner.nextInt();
    }

    public String res() {
        if (num2 > num1 && num3 > num2) {
            result = true;
        }
        return "Результат: " + result;
    }

    public void printValue() {
        System.out.println(res());
    }

    public static void main(String[] args) {
        ThreeNumbers tn = new ThreeNumbers();
        tn.setNumbers();
        tn.printValue();
    }
}




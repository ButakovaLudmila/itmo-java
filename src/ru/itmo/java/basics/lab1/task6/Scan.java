//Задание 6
package ru.itmo.java.basics.lab1.task6;

import java.util.Scanner;

public class Scan
{
    public static void main(String[] args) {
        System.out.println("Введите любое целое число: ");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        if (((b % 2) == 0) && (b > 100)) {
            System.out.println("Число " + b + " Выход за пределы диапазона ");
        } else {
            if (b % 2 == 0) {
                System.out.println("Число " + b + " четное ");
            } else {
                System.out.println("Число " + b + " нечетное ");
            }
        }
    }
}

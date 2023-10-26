package ru.itmo.java.basics.lab2.task1;

import java.util.Scanner;

public class Calculator {

    //Результирующие переменные
    private int resulti;
    private double resultd;
    private long resultl;

    //Входные переменные
    private int numi1;
    private int numi2;
    private double numd1;
    private double numd2;
    private long numl1;
    private long numl2;

    //Сеттеры и геттеры
    public int getNumi1() {
        return numi1;
    }

    public void setNumi1(int numi1) {
        this.numi1 = numi1;
    }

    public int getNumi2() {
        return numi2;
    }

    public void setNumi2(int numi2) {
        this.numi2 = numi2;
    }

    public double getNumd1() {
        return numd1;
    }

    public void setNumd1(double numd1) {
        this.numd1 = numd1;
    }

    public double getNumd2() {
        return numd2;
    }

    public void setNumd2(double numd2) {
        this.numd2 = numd2;
    }

    public long getNuml1() {
        return numl1;
    }

    public void setNuml1(long numl1) {
        this.numl1 = numl1;
    }

    public long getNuml2() {
        return numl2;
    }

    public void setNuml2(long numl2) {
        this.numl2 = numl2;
    }

    //Математические действия



    //Сложение
    public int addition(int num1, int num2) {
        resulti = num1 + num2;
        return resulti;
    }

    public double addition(double num1, double num2) {
        resultd = num1 + num2;
        return resultd;
    }

    public long addition(long num1, long num2) {
        resultl = num1 + num2;
        return resultl;
    }

    //Вычитание
    public int substraction(int num1, int num2) {
        resulti = num1 - num2;
        return resulti;
    }

    public double substraction(double num1, double num2) {
        resultd = num1 - num2;
        return resultd;
    }

    public long substraction(long num1, long num2) {
        resultl = num1 - num2;
        return resultl;
    }

    //Умножение
    public int multiplication(int num1, int num2) {
        resulti = num1 * num2;
        return resulti;
    }

    public double multiplication(double num1, double num2) {
        resultd = num1 * num2;
        return resultd;
    }

    public long multiplication(long num1, long num2) {
        resultl = num1 * num2;
        return resultl;
    }

    //Деление
    public double division(double num1, double num2) {
        resultd = num1 / num2;
        return resultd;
    }

    //Ввод-вывод данных
    public void Calculate() {
        int i1 = 0;
        int d1 = 0;
        int l1 = 0;
        int i2 = 0;
        int d2 = 0;
        int l2 = 0;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        System.out.println("Первое число: ");

        if (scanner.hasNextInt()) {
            numi1 = scanner.nextInt();
            calculator.setNumi1(numi1);
            calculator.setNumd1(numi1);
            i1 = 1;
        } else {
            if (scanner.hasNextDouble()) {
                calculator.setNumd1(scanner.nextDouble());
                d1 = 1;
            } else {
                if (scanner.hasNextLong()) {
                    numl1 = scanner.nextLong();
                    calculator.setNuml1(numl1);
                    calculator.setNumd1(numl1);
                    l1 = 1;
                } else {
                    System.out.println("Вы ввели некорректное значение ");
                }
            }
        }

        System.out.println("Второе число: ");
        if (scanner.hasNextInt()) {
            numi2 = scanner.nextInt();
            calculator.setNumi2(numi2);
            calculator.setNumd2(numi2);
            i2 = 1;
        } else {
            if (scanner.hasNextDouble()) {
                calculator.setNumd2(scanner.nextDouble());
                d2 = 1;
            } else {
                if (scanner.hasNextLong()) {
                    numl2 = scanner.nextLong();
                    calculator.setNuml2(numl2);
                    calculator.setNumd2(numl2);
                    l2 = 1;
                } else {
                    System.out.println("Вы ввели некорректное значение ");
                }
            }
        }

        System.out.println("Какую операцию хотите осуществить? ('POS', 'NEG', 'MULT', 'DIV')");
        Operation operator = Operation.valueOf(scanner.next());

        if (i1 == 1 && i2 == 1) {
            {
                switch (operator) {
                    case POS:
                        this.resulti = calculator.addition(calculator.getNumi1(), calculator.getNumi2());
                        break;
                    case NEG:
                        this.resulti = calculator.substraction(calculator.getNumi1(), calculator.getNumi2());
                        break;
                    case MULT:
                        this.resulti = calculator.multiplication(calculator.getNumi1(), calculator.getNumi2());
                        break;
                    default:
                        System.out.println("Данные некорректны");
                }
                System.out.println("Результат = " + resulti);
            }
        } else {
            if (l1 == 1 || l2 == 1) {
                switch (operator) {
                    case POS:
                        resultl = calculator.addition(calculator.getNuml1(), calculator.getNuml2());
                        break;
                    case NEG:
                        resultl = calculator.substraction(calculator.getNuml1(), calculator.getNuml2());
                        break;
                    case MULT:
                        this.resultl = calculator.multiplication(calculator.getNuml1(), calculator.getNuml2());
                        break;
                    default:
                        System.out.println("Данные некорректны");
                }
                System.out.println("Результат = " + resultd);
            } else {

                if (d1 == 1 | d2 == 1) {
                    switch (operator) {
                        case POS:
                            resultd = calculator.addition(calculator.getNumd1(), calculator.getNumd2());
                            break;
                        case NEG:
                            resultd = calculator.substraction(calculator.getNumd1(), calculator.getNumd2());
                            break;
                        case MULT:
                            resultd = calculator.multiplication(calculator.getNumd1(), calculator.getNumd2());
                            break;
                        case DIV:
                            resultd = calculator.division(calculator.getNumd1(), calculator.getNumd2());
                            break;
                        default:
                            System.out.println("Данные некорректны");

                    }

                    double scale = Math.pow(10.0, 2);
                    resultd = Math.round(resultd * scale) / scale;
                    System.out.println("Результат = " + resultd);
                }
            }
        }
    }
}




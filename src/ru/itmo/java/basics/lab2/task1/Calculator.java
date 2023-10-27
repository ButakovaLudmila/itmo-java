package ru.itmo.java.basics.lab2.task1;

import java.util.Scanner;

public class Calculator {

    //Результирующие переменные
    private int resultI;
    private double resultD;
    private long resultL;

    //Входные переменные
    private int numI1;
    private int numI2;
    private double numD1;
    private double numD2;
    private long numL1;
    private long numL2;

    //Сеттеры и геттеры
    public int getnumI1() {
        return numI1;
    }

    public void setnumI1(int numI1) {
        this.numI1 = numI1;
    }

    public int getnumI2() {
        return numI2;
    }

    public void setnumI2(int numI2) {
        this.numI2 = numI2;
    }

    public double getnumD1() {
        return numD1;
    }

    public void setnumD1(double numD1) {
        this.numD1 = numD1;
    }

    public double getnumD2() {
        return numD2;
    }

    public void setnumD2(double numD2) {
        this.numD2 = numD2;
    }

    public long getnumL1() {
        return numL1;
    }

    public void setnumL1(long numL1) {
        this.numL1 = numL1;
    }

    public long getnumL2() {
        return numL2;
    }

    public void setnumL2(long numL2) {
        this.numL2 = numL2;
    }

    //Математические действия


    //Сложение
    public int addition(int num1, int num2) {
        resultI = num1 + num2;
        return resultI;
    }

    public double addition(double num1, double num2) {
        resultD = num1 + num2;
        return resultD;
    }

    public long addition(long num1, long num2) {
        resultL = num1 + num2;
        return resultL;
    }

    //Вычитание
    public int substraction(int num1, int num2) {
        resultI = num1 - num2;
        return resultI;
    }

    public double substraction(double num1, double num2) {
        resultD = num1 - num2;
        return resultD;
    }

    public long substraction(long num1, long num2) {
        resultL = num1 - num2;
        return resultL;
    }

    //Умножение
    public int multiplication(int num1, int num2) {
        resultI = num1 * num2;
        return resultI;
    }

    public double multiplication(double num1, double num2) {
        resultD = num1 * num2;
        return resultD;
    }

    public long multiplication(long num1, long num2) {
        resultL = num1 * num2;
        return resultL;
    }

    //Деление
    public double division(double num1, double num2) {
        resultD = num1 / num2;
        return resultD;
    }

    public double division(int num1, int num2) {
        resultD = (double) num1 / num2;
        return resultD;
    }

    public double division(long num1, long num2) {
        resultD = (double) num1 / num2;
        return resultD;
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
            numI1 = scanner.nextInt();
            calculator.setnumI1(numI1);
            calculator.setnumD1(numI1);
            i1 = 1;
        } else {
            if (scanner.hasNextDouble()) {
                calculator.setnumD1(scanner.nextDouble());
                d1 = 1;
            } else {
                if (scanner.hasNextLong()) {
                    numL1 = scanner.nextLong();
                    calculator.setnumL1(numL1);
                    calculator.setnumD1(numL1);
                    l1 = 1;
                } else {
                    System.out.println("Вы ввели некорректное значение ");
                }
            }
        }

        System.out.println("Второе число: ");
        if (scanner.hasNextInt()) {
            numI2 = scanner.nextInt();
            calculator.setnumI2(numI2);
            calculator.setnumD2(numI2);
            i2 = 1;
        } else {
            if (scanner.hasNextDouble()) {
                calculator.setnumD2(scanner.nextDouble());
                d2 = 1;
            } else {
                if (scanner.hasNextLong()) {
                    numL2 = scanner.nextLong();
                    calculator.setnumL2(numL2);
                    calculator.setnumD2(numL2);
                    l2 = 1;
                } else {
                    System.out.println("Вы ввели некорректное значение ");
                }
            }
        }

        System.out.println("Какую операцию хотите осуществить? ('POS', 'NEG', 'MULT', 'DIV')");
        Operation operator = Operation.valueOf(scanner.next());
        outer:
        if (i1 == 1 && i2 == 1) {
            {
                switch (operator) {
                    case POS:
                        this.resultI = calculator.addition(calculator.getnumI1(), calculator.getnumI2());
                        break;
                    case NEG:
                        this.resultI = calculator.substraction(calculator.getnumI1(), calculator.getnumI2());
                        break;
                    case MULT:
                        this.resultI = calculator.multiplication(calculator.getnumI1(), calculator.getnumI2());
                        break;
                    case DIV:
                        this.resultD = calculator.division(calculator.getnumI1(), calculator.getnumI2());
                        double scale = Math.pow(10.0, 2);
                        resultD = Math.round(resultD * scale) / scale;
                        System.out.println("Результат проверка срабатывания Int = " + resultD);
                        break outer;
                    default:
                        System.out.println("Данные некорректны");
                }
                System.out.println("Результат = " + resultI);
            }
        } else {
            if (l1 == 1 || l2 == 1) {
                switch (operator) {
                    case POS:
                        resultL = calculator.addition(calculator.getnumL1(), calculator.getnumL2());
                        break;
                    case NEG:
                        resultL = calculator.substraction(calculator.getnumL1(), calculator.getnumL2());
                        break;
                    case MULT:
                        this.resultL = calculator.multiplication(calculator.getnumL1(), calculator.getnumL2());
                        break;
                    case DIV:
                        this.resultD = calculator.division(calculator.getnumL1(), calculator.getnumL2());
                        double scale = Math.pow(10.0, 2);
                        resultD = Math.round(resultD * scale) / scale;
                        System.out.println("Результат проверка срабатывания Long = " + resultD);
                        break outer;
                    default:
                        System.out.println("Данные некорректны");
                }
                System.out.println("Результат = " + resultD);
            } else {

                if (d1 == 1 | d2 == 1) {
                    switch (operator) {
                        case POS:
                            resultD = calculator.addition(calculator.getnumD1(), calculator.getnumD2());
                            break;
                        case NEG:
                            resultD = calculator.substraction(calculator.getnumD1(), calculator.getnumD2());
                            break;
                        case MULT:
                            resultD = calculator.multiplication(calculator.getnumD1(), calculator.getnumD2());
                            break;
                        case DIV:
                            resultD = calculator.division(calculator.getnumD1(), calculator.getnumD2());
                            break;
                        default:
                            System.out.println("Данные некорректны");

                    }

                    double scale = Math.pow(10.0, 2);
                    resultD = Math.round(resultD * scale) / scale;
                    System.out.println("Результат = " + resultD);
                }
            }
        }
    }
}




package ru.itmo.java.basics.lab4.part1.task6;

public class CheckOneThree {
    static int[] intArray;
    static boolean result;

    static void setIntArray() {
        intArray = new int[6];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int)(Math.random() * 15));
        }
    }

    static String checkOneThree(int[] intArray) {

        for (int j = 0; j < intArray.length; j++) {

            if (intArray[j] == 3 | intArray[j] == 1) {

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
        System.out.print(checkOneThree(intArray));
    }

    public static void main(String[] args) {
        CheckOneThree.setIntArray();
        CheckOneThree.printValues();
    }
}

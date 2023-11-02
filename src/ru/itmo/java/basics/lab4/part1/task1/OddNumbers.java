package ru.itmo.java.basics.lab4.part1.task1;

public class OddNumbers {
    static int[] intArray;

    static {
        intArray = new int[99];
    }
    
    static void fillingArray() {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
    }

    static void oddSort(int[] intArray) {

        for (int j = 0; j < intArray.length; j++) {

            if (intArray[j] % 2 != 0) {

                System.out.println(intArray[j]);
            }
        }
    }
    public static void main(String[] args) {
        OddNumbers.fillingArray();
        OddNumbers.oddSort(intArray);
    }


}


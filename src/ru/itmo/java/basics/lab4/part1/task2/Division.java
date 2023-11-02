package ru.itmo.java.basics.lab4.part1.task2;

public class Division {
    static int[] intArray;

    static {
        intArray = new int[100];
    }

    static void fillingArray() {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
    }

    static void divThree(int[] intArray) {
        for (int t = 0; t < intArray.length; t++) {
                    if (intArray[t] % 3 == 0) {
                        System.out.print(intArray[t] + " ");
                    }
        }
    }
    static void divFive(int[] intArray) {
        for (int f = 0; f < intArray.length; f++) {
            if (intArray[f] % 5 == 0) {
                System.out.print(intArray[f] + " ");
            }
        }
    }
    static void divThreeFive(int[] intArray) {
        for (int tf = 0; tf < intArray.length; tf++) {
            if ((intArray[tf] % 5 == 0) && (intArray[tf] % 3 == 0)) {
                System.out.print(intArray[tf] + " ");
            }
        }
    }
    static void printValues() {
        System.out.print("Делится на 3: ");
        divThree(intArray);
        System.out.println();
        System.out.print("Делится на 5: ");
        divFive(intArray);
        System.out.println();
        System.out.print("Делится на 3 и 5: ");
        divThreeFive(intArray);
    }











}


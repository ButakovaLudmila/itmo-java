package ru.itmo.java.basics.lab4.part2.task5;

import java.util.Arrays;

public class SortArray {
    static int[] intArray;

    static void setIntArray() {
        intArray = new int[12];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int) (Math.random() * 1500));
        }
    }

    public static void mergeSort(int begin, int end) {
        int mid = (begin + end) / 2;

        int[] t = new int[end - begin + 1];

        int i1 = begin;

        int i2 = mid + 1;

        int it = 0;

        while ((i1 <= mid) || (i2 <= end)) {
            if (i1 > mid) {
                t[it++] = intArray[i2++];
                continue;
            }
            if (i2 > end) {
                t[it++] = intArray[i1++];
                continue;
            }
            if (intArray[i2] > intArray[i1]) {
                t[it++] = intArray[i1++];
            } else {
                t[it++] = intArray[i2++];
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
            intArray[i + begin] = t[i];
        }

    }

    public static void sortArray(int start, int finish) {

        if (start == finish) return;

        int mid = (start + finish) / 2;

        sortArray(start, mid);
        sortArray(mid + 1, finish);
        mergeSort(start, finish);
    }

    static void printArray1() {
        System.out.print("Массив 1: " + Arrays.toString(intArray));
        System.out.println();
    }

    static void printArray2() {
        System.out.print("Массив 2: " + Arrays.toString(intArray));
    }
    public static void main(String[] args) {
        SortArray.setIntArray();
        SortArray.printArray1();
        SortArray.sortArray(0, intArray.length - 1);
        SortArray.printArray2();
    }
}

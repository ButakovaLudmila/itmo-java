package ru.itmo.java.basics.lab9.task1;

import java.util.*;

public class Unique {
    public static List<Integer> setCollection() {
        //длина списка
        final int a = 10;
        //числа, учавствующие в выборке
        final int r = 6;
        List<Integer> list = new ArrayList<>(a);
        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random() * r));
        }
        return list;
    }

    public <T> Collection<T> uniques(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return set;
    }

    public void print() {
        System.out.println("Входная коллекция с дубликатами: " + setCollection());
        System.out.println("Коллекция без дубликатов: " + uniques(setCollection()));
    }

    public static void main(String[] args) {
        Unique unique = new Unique();
        unique.print();
    }

}

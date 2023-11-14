package ru.itmo.java.basics.lab9.task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Choice {
    public static ArrayList<Integer> arrayList;
    public static LinkedList<Integer> linkedList;
    final int SIZE = 1000000;
    final int Q = 100000;
    long startTime = System.currentTimeMillis();

    public void fillList() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add((int) Math.random());
            linkedList.add((int) Math.random());
        }
    }

    public void choiceArrayList() {
        for (int i = 0; i < Q; i++) {
            arrayList.get((int) (Math.random() * (SIZE - 1)));
        }
        System.out.println("Время, на выбор элемента из ArrayList: " + (System.currentTimeMillis() - startTime));
    }

    public void choiceLinkedList() {
        for (int i = 0; i < Q; i++) {
            linkedList.get((int) (Math.random() * (SIZE - 1)));
        }
        System.out.println("Время, на выбор элемента из LinkedList: " + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.fillList();
        choice.choiceArrayList();
        choice.choiceLinkedList();
    }

}
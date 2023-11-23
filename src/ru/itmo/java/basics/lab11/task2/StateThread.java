package ru.itmo.java.basics.lab11.task2;

public class StateThread extends Thread {

    public void printState() {
        System.out.println(getState());
    }

    @Override
    public void run() {
        printState();
    }

    public static void main(String[] strings) throws InterruptedException {
        StateThread stateThread = new StateThread();
        stateThread.printState();
        stateThread.start();
        Thread.sleep(400);
        stateThread.printState();
    }

}














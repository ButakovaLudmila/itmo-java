package ru.itmo.java.basics.lab11.task3v2;

import java.util.concurrent.CountDownLatch;

class SubThread extends Thread {

    SubThread(CountDownLatch c) {
        new Thread(this).start();
    }

    public void run() {
        Counter counter=new Counter();
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
        System.out.println(getName() + " " + "count = " +
                counter.getCount());
    }

    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(100000);
        for (int i = 0; i < 100; i++) {
            new SubThread(c);
        }
    }
}

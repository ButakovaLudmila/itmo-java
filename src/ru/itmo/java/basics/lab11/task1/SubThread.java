package ru.itmo.java.basics.lab11.task1;

public class SubThread extends Thread {
    private Object lock;

    public SubThread(Object object) {
        this.lock = object;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    for (int i = 0; i < 101; i++) {
                        System.out.println(getName() + " " + i);
                        lock.notify();
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] strings) {
        Object lock = new Object();
        for (int i = 0; i < 100; i++) {
            new ru.itmo.java.basics.lab11.task3.SubThread(lock).start();
        }
    }
}

package ru.itmo.java.basics.lab11.task4;

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
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] strings) {
        Object lock = new Object();
        new SubThread(lock).start();
        new SubThread(lock).start();
    }
}

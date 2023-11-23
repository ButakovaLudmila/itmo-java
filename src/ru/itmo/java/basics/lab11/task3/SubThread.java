package ru.itmo.java.basics.lab11.task3;

public class SubThread extends Thread {
    private Object lock;

    public SubThread(Object object) {
        this.lock = object;
    }

    @Override
    public void run() {
        Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            synchronized (lock) {
                try {
                    counter.increment();
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName() + " " + counter.getCount());
    }

    public static void main(String[] strings) {
        Object lock = new Object();
        for (int i = 0; i < 100; i++) {
            new SubThread(lock).start();
        }
    }

}

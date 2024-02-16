package org.example.create;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable run = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " finished");
        };

        Thread thread = new Thread(run, "The Thread");
        thread.start();

        Thread thread2 = new Thread(run, "The Thread2");
        thread2.start();
    }
}

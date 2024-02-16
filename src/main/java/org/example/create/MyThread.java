package org.example.create;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
    public static void main(String[] args) {
        Thread thread = new MyThread();
        System.out.println("There is main thread");
        thread.start();
        System.out.println("Main thread is end");
    }
}

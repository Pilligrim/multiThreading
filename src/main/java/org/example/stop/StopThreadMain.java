package org.example.stop;

public class StopThreadMain {
    public static void main(String[] args) {
        StopThread myRunnable = new StopThread();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep( 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stop thread " + thread.getName() +" from thread "+ Thread.currentThread().getName());
        myRunnable.doStop();
    }
}

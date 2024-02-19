package org.example.racecondition;

public class SeparateObjects {
    public static void main(String[] args) {

        Runnable run1  = new MyRunnable();
        Runnable run2  = new MyRunnable();

        Thread th1 = new Thread(run1, "Th1");
        Thread th2 = new Thread(run2, "Th2");

        th1.start();
        th2.start();
    }
}

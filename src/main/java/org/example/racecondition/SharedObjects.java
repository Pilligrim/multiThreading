package org.example.racecondition;

public class SharedObjects {
    public static void main(String[] args) {
//        Runnable run  = new MyRunnable();
//        Runnable run  = new MySyncRunnable();
        Runnable run  = new MyAtomicRunnable();

        Thread th1 = new Thread(run, "Th1");
        Thread th2 = new Thread(run, "Th2");

        th1.start();
        th2.start();
    }
}

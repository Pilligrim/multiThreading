package org.example.stop;

public class StopThread  implements Runnable {

    private boolean doStop = false;

    public synchronized void doStop() {
        this.doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !this.doStop;
    }

    @Override
    public void run() {
        System.out.println("Start "+ Thread.currentThread().getName());
        while(keepRunning()) {
            // keep doing what this thread should do.
            System.out.println("Running");

            try {
                Thread.sleep( 100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
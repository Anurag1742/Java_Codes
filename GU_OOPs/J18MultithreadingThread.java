package GU_OOPs;

public class J18MultithreadingThread {

    // Custom thread class extending Thread
    static class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}


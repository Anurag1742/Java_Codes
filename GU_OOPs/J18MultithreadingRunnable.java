package GU_OOPs;

public class J18MultithreadingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        J18MultithreadingRunnable runnable1 = new J18MultithreadingRunnable();
        J18MultithreadingRunnable runnable2 = new J18MultithreadingRunnable();

        Thread t1 = new Thread(runnable1, "Thread-1");
        Thread t2 = new Thread(runnable2, "Thread-2");

        t1.start();
        t2.start();
    }
}

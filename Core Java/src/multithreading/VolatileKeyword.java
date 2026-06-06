package multithreading;

/**
 * volatile:
 * Ensures that changes made by one thread
 * are immediately visible to other threads.
 */

public class VolatileKeyword{

    private static volatile boolean running = true;

    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {

            System.out.println("Worker Started");

            while(running) {
                // keep running
            }

            System.out.println("Worker Stopped");
        });

        worker.start();

        Thread.sleep(3000);

        System.out.println("Main Thread Stopping Worker");

        running = false;
    }
}
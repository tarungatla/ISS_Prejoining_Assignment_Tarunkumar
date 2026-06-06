package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread Pool:
 * Reuses a fixed number of threads
 * instead of creating new threads repeatedly.
 */

/**
 * 
 */
class EmployeeTask implements Runnable {

    private int employeeId;

    public EmployeeTask(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void run() {

        System.out.println(
                Thread.currentThread().getName()
                        + " processing Employee "
                        + employeeId);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolExecutor{

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 10; i++) {
            executor.submit(new EmployeeTask(i));
        }

        executor.shutdown();
    }
}
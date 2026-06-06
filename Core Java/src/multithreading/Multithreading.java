package multithreading;

/**
 * Multithreading:
 * Multiple threads execute concurrently.
 */

class Task extends Thread {

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(
                    taskName + " - Count : " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading{

    public static void main(String[] args) {

        Task task1 = new Task("Thread-1");
        Task task2 = new Task("Thread-2");

        task1.start();
        task2.start();
    }
}
package multithreading;

/**
 * Local variables are thread-safe because
 * every thread gets its own copy.
 */

class LocalTask implements Runnable {

    @Override
    public void run() {

        int counter = 0; // local variable

        for(int i = 0; i < 5; i++) {
        	try {
                Thread.sleep(500);
                System.out.println(
                        Thread.currentThread().getName()
                                + " Counter = " + counter);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
            
    }
}

public class ThreadSafeLocalVariable{

    public static void main(String[] args) {

        Thread t1 = new Thread(new LocalTask());
        Thread t2 = new Thread(new LocalTask());

        t1.start();
        t2.start();
    }
}
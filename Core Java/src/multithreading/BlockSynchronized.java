package multithreading;

/**
 * Only critical section is synchronized.
 * Better performance than synchronizing
 * the whole method.
 */

class Inventory {

    private int stock = 10;

    public void purchase() {

        System.out.println(
                Thread.currentThread().getName()
                        + " Checking Stock");

        synchronized (this) {

            if(stock > 0) {

                stock--;

                System.out.println(
                        Thread.currentThread().getName()
                                + " Purchased Item");

                System.out.println(
                        "Remaining Stock = "
                                + stock);
            }
        }
    }
}

public class BlockSynchronized{

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

//        Runnable task = () -> inventory.purchase();
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                inventory.purchase();
            }
        };

        for(int i = 1; i <= 5; i++) {

            Thread thread =
                    new Thread(task, "Customer-" + i);

            thread.start();
        }
    }
}
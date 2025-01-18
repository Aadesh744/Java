class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printNumbers(2));
        Thread t2 = new Thread(() -> resource.printNumbers(3));

        t1.start();
        t2.start();
    }
}


`
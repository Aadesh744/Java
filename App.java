class PrintNumbers extends Thread {
    private String threadName;

   
    public PrintNumbers(String threadName) {
        this.threadName = threadName;
    }

    
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread " + threadName + " - " + i);
        }
    }
}

public class App{
    public static void main(String[] args) {
      
        PrintNumbers thread1 = new PrintNumbers("A");
        PrintNumbers thread2 = new PrintNumbers("B");
        PrintNumbers thread3 = new PrintNumbers("C");

      
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads have finished.");
    }
}

class Aadesh extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Thread1{
    public static void main(String[] args) {
        Aadesh t = new Aadesh();
        t.start();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        
        System.out.println( queue.peek());
        System.out.println( queue.poll());
        System.out.println( queue.poll());
        System.out.println(  queue.peek());        
        System.out.println( queue.isEmpty());

        System.out.println( queue.size());
    }
}

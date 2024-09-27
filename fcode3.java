import java.util.LinkedList;
import java.util.Queue;

public class fcode3 {
    public static void main(String[] args) throws Exception {
        Queue<Integer>number=new LinkedList<>();
        number.offer(11);
        number.offer(12);
        number.offer(13);
        number.offer(14);
        number.offer(15);
       System.out.println("the numbers are:"+number);
       //poll shows which element is removed form the queue
       System.out.println(number.poll());
       //peek show which is the next element after removed element
       System.out.println(number.peek());

       System.out.println(number.poll());
       System.out.println(number.peek());
    
    }
}

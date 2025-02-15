import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
     Stack<Integer>studentroll=new Stack<>();
     studentroll.push(11);
     studentroll.push(12);
     studentroll.push(13);
     studentroll.push(14);
     studentroll.push(15);
     System.out.println("studentroll at top: "+studentroll.peek());
     System.out.println("removed studentroll:"+studentroll.pop() );
     
    
    }
}

import java.util.Stack;

public class App {
    public static void main(String[] args) {
      
        Stack<String> stack = new Stack<>();

      
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

      
        System.out.println("display Top element in stack: " + stack.peek());

  
        System.out.println("remove/pop element which is at top " + stack.pop());

        System.out.println(" display element value which is at top: " + stack.peek());

       
        while (!stack.isEmpty()) {
            System.out.println("pop : " + stack.pop());
        }

      
        System.out.println("empty? " + stack.isEmpty());
    }
}

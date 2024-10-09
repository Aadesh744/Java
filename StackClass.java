import java.util.ArrayList;

public class StackClass {
    public static class Stack {
        private ArrayList<String> list = new ArrayList<>(); 

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(String data) {
            list.add(data);
        }

        // pop
        public String pop() {
            if (isEmpty()) {
                return null;
            }
            String top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top; 
        }

        // peek
        public String peek() {
            if (isEmpty()) {
                return null; 
            }
            return list.get(list.size() - 1); 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("aadesh");
        s.push("bikesh");
        s.push("ram");
        
        while (!s.isEmpty()) {
            System.out.println("Popped: " + s.pop());
            System.out.println("Peek: " + s.peek());
        }
    }
}

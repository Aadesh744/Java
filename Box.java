
public class Box<T> {
 
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Integer Box contains: " + integerBox.getContent()); 
        
        Box<String> stringBox = new Box<>("Hello, World!");
        System.out.println("String Box contains: " + stringBox.getContent());
    }
}

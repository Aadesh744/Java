class Animal{
     void sound(){
    System.out.println("all animal make sound");
}
}
class dog extends Animal{
    public void sound(){
    System.out.println("dogs barks");
}
}

public class inheritance2 {
    public static void main(String[] args) throws Exception {
    dog d1 = new dog();
    d1.sound();
        
    }
}

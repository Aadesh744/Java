
interface Animal {
    void eat();
}
interface Mammal {
    void walk();
}
class Dog implements Animal, Mammal {

    public void eat() {
        System.out.println("Dog is eating.");
    }
     public void walk() {
        System.out.println("Dog is walking.");
    }
}

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.eat();  
        dog.walk(); 
    }
}

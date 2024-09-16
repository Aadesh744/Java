class Person {
    String name;
    int age;

 
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Person person1 = new Person();
        System.out.println("Person 1 details (default constructor):");
        person1.display();

        Person person2 = new Person("Aadesh", 20);
        System.out.println("Person 2 details (parameterized constructor):");
        person2.display();

     
        Person person3 = new Person(person2);
        System.out.println("Person 3 details (copied from Person 2):");
        person3.display();
    }
}

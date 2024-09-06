
// Defining  class the as a Person
class Person {
    //anything inside the class called instancle class
    String name;
    int age;
    
    // using Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person's details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Person object using the 'new' keyword
        Person person1 = new Person("Aadesh", 20);  
        // Call the method to display person information
        person1.displayInfo();
    }
}


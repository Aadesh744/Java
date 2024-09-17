class Pen {
    String name;
    int age;

    // Using Default constructor
    public Pen() {
    }

    // Using copy constructor
    public Pen(Pen p2) {
        this.name = p2.name;
        this.age = p2.age;
    }

    // Using function
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class bikesh {
    public static void main(String[] args) {
        // Creating an instance or object of Pen
        Pen p1 = new Pen();
        p1.name = "Aadesh";
        p1.age = 20;

        // Creating a copy of p1 using the copy constructor
        Pen p2 = new Pen(p1);

        // Calling function
        p2.printInfo();
    }
}


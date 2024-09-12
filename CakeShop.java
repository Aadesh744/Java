import java.io.*;

class Cake {  // Class names in Java should start with an uppercase letter
    String flavour;
    double price;
    int layers;

    // Constructor
    Cake(String f, int l, double p) {
        flavour = f;
        layers = l;
        price = p;
    }

    // Method to display cake details
    void display() {
        System.out.println("Flavour is: " + flavour);  // Corrected typo "flavourl" to "flavour"
        System.out.println("Layers: " + layers);
        System.out.println("Price: " + price);
    }
}

public class CakeShop {  // Class names should start with an uppercase letter
    public static void main(String[] args) {  // "String" should be capitalized
        Cake chocolate = new Cake("chocolate", 2, 100.0);  // Corrected class name and syntax
        chocolate.display();  // Corrected method call syntax
    }
}

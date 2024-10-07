import java.io.*;

class Cake {  
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
        System.out.println("Flavour is: " + flavour);  
        System.out.println("Layers: " + layers);
        System.out.println("Price: " + price);
    }
}

public class CakeShop {  
    public static void main(String[] args) { 
        Cake chocolate = new Cake("chocolate", 2, 100.0); 
        chocolate.display();  
    }
}
